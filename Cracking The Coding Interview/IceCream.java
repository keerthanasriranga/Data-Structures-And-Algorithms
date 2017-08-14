import java.util.*;

// Represents the id and price of a ice cream
// Made a object so that sorting will group ids and prices together
class IceCream {
    private int id;
    private int price;

    public IceCream(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}

public class IceCream {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            List<IceCream> iceCreams = new ArrayList<>();
            for (int a_i = 0; a_i < n; a_i++) {
                int price = in.nextInt();
                a[a_i] = price;
                iceCreams.add(new IceCream(a_i+1, price));
            }

            // Needs to be sorted for binary search to work
            Collections.sort(iceCreams, new Comparator<IceCream>() {
                @Override
                public int compare(IceCream o1, IceCream o2) { // Sort in ascending order
                    return o1.getPrice() - o2.getPrice();
                }
            });

            // Do search
            search(iceCreams, m);
        }
    }

    private static void search(List<IceCream> a, int m) {

        // Go through all elements, get the remainder and look for that remainder using binary search
        for (int i = 0; i < a.size(); i++) {
            int remaining = m - a.get(i).getPrice();

            int index = binarySearch(a, remaining);

            // Found second element that adds up to m
            if (index != -1) {
                int first = a.get(i).getId();
                int second = a.get(index).getId();

                if (first != second) { // We want unique elements
                    System.out.println(Math.min(first, second) + " " + Math.max(first, second));
                    return;
                }
            }
        }
    }

    // Binary Search - got help with this from the video on the problem page
    private static int binarySearch(List<IceCream> a, int m) {
        int left = 0;
        int right = a.size() - 1;
        
        while (left <= right) {
            int mid = left + ((right - left) / 2); // get the midpoint between left and right on the list
            if (a.get(mid).getPrice() == m) {
                return mid;
            } else if (m < a.get(mid).getPrice()) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Not found
    }
}
