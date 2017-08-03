

#include <stdio.h>
struct Node
{
  int data;
  struct Node *next;
};
struct Node* insert(struct Node* head,int value, int pos){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if(pos==1){
        newNode->data=value;
        newNode->next=head->next;
        head=newNode;
        return head;
    }
    int i;
    struct Node *current=head;
    for(i=1;i<pos;i++){
        if(current->next!=NULL)current=current->next;
        else break;
    }
        newNode->next=current->next;
        current->next=newNode;
        newNode->data=value;
        return head;
}
struct Node *deleteElement(struct Node *head,int delpos){
    int i;
    struct Node* current=head;
    for(i=1;i<delpos-1;i++){
        if(current->next!=NULL)current=current->next;
        else break;
    }
    struct Node* ele=current->next;
    current->next=ele->next;
    return head;
}
void displayElements(struct Node* head){
    struct Node* current=head;
    while(current->next!=NULL){
        printf("%d",current->data);
        current=current->next;
    }
    printf("%d",current->data);
}
int main()
{
    int n;
    int c;
    int value;
    int pos;
    int delpos;
    printf("Enter a number for the head element\n");
    scanf("%d",&n);
    printf("%d",n);
    struct Node* head = (struct Node*) malloc(sizeof(struct Node));
    head->data=n;
    while(1){
        printf("Enter choice");
        scanf("%d",&c);
        switch(c){
            case 1: printf("Enter value to insert and position\n");
                    scanf("%d%d",&value,&pos);
                    head = insert(head,value,pos);
                    break;
            case 2: printf("Enter position to delete");
                    scanf("%d",&delpos);
                    head=deleteElement(head,delpos);
                    break;
            case 3 : displayElements(head);
                     break;
            default: exit(0);
            
        }
    }
    return 0;
}



