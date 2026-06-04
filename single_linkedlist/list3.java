class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class list3 {
    Node head;

    void insert_last(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
        temp=temp.next;
       }
       temp.next=newNode;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void delete(int value){
         Node temp=head;
         Node ttemp=head;
        if(head.next==null){
            head=null;
        }
        while(temp.data!=value){
            ttemp=temp;
            temp=temp.next;
        }
        ttemp.next=temp.next;
        temp.next=null;
        
    }
    public static void main(String args[]){
        list3 l1=new list3();
        l1.insert_last(10);
        l1.insert_last(20);
        l1.insert_last(30);
        l1.insert_last(40);
        l1.insert_last(50);
        l1.print();
        l1.delete(20);
         l1.print();
    }
        
    }

                        