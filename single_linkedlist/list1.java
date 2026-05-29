class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class list1{
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
    void removeDuplicate(){
         Node curr=head;
         while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
         }
         
    }
     void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }
      void middle_element(){
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }


    void Iscycle(){
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.print("Cycle detected");
                return;
            }
        }
        System.out.println("No cycle detected");
    }
    Node revesKgroup(Node head,int k){
        Node current=head;
        Node prev=null;
        node next=null;
        int count=0;
        while(current!=null && count<k){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;

        }
        if(next!=null){
            head.next=revesKgroup(next, k);
        }
        return prev;
        
    }


    public static void main(String [] args){
        list1 l = new list1();
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(50);
        l.print();
        l.removeDuplicate();
        System.out.println("\n");
        l.print();
        

    }
}
