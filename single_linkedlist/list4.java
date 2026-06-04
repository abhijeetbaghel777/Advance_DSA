class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class list4 {
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
    // long num(Node head){
    //     long digit=0;
    //     Node temp=head;
    //     while(temp!=null){
    //         digit=digit*10+temp.data;
    //         temp=temp.next;
    //     }
    //     return digit;
    // }
    // long multiply(Node head1,Node head2){
    //     long num1=num(head1);
    //     long num2=num(head2);
    //     return num1*num2;
    // }
    void odd_even(Node h1,list4 o,list4 e){
        while(h1!=null){
            if(h1.data%2==0){
                e.insert_last(h1.data);
            }
            else o.insert_last(h1.data) ;
            h1=h1.next;
        }
         Node od=o.head;
        while(od.next!=null){
            od=od.next;
        }
        od.next=e.head;
        o.print();
    }
     
   public static void main(String[] args) {
    list4 l1=new list4();
    l1.insert_last(4);
    l1.insert_last(2);
    l1.insert_last(3);
    l1.insert_last(5);
    l1.insert_last(8);
    l1.insert_last(6);
    list4 even=new list4();
    list4 odd=new list4();
    l1.odd_even(l1.head, odd, even);
    
   }
}
