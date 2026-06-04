
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class lllist {
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
    void decimal(Node head ){
        int decimal=0;
        int count=0;
        Node temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        while(count>=0){
            decimal=decimal+head.data*(int)Math.pow(2, count);
            count--;
            head=head.next;
        }
        System.out.println(decimal);
        
        
    }
    Node swapfl(Node head){
       Node curr=head;//1st node
        Node second=curr.next;//2nd node
        Node temp=head;// last node
        Node ttemp=head;// second last node
        while(temp.next!=null){
            ttemp=temp;
            temp=temp.next;
        }
        ttemp.next=curr;
        curr.next=null;
        temp.next=second;
        return temp;
        
        
    }
     add_1(Node head){
        int number=0;
        Node curr=head;
        while(temp.next!=null){
            number=number*10+temp.data;
        }
    }
    public static void main(String[] args) {
        lllist l1=new lllist();
        l1.insert_last(1);
        l1.insert_last(1);
        l1.insert_last(0);
        l1.insert_last(2);
        l1.print();
        l1.head=l1.swapfl(l1.head);
        System.out.println("\n");
        l1.print();

    }
}
