
public class LinkedList {
    private Node head;
   
    public static class Node{
        private int data;
        private Node next;
        public Node(int n){
            data = n;
        }
    }

    public LinkedList insert(LinkedList l, int i){
        Node newNode = new Node(i);
        //if LL is empty
        if(l.head == null){
            l.head = newNode;
        } else { //if LL is not empty
            Node temp = l.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
        return l;
    }

    public static void print(LinkedList l){
        if(l.head != null){
        Node temp = l.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
             
        } else{
            System.out.println("No Nodes?");
        }
    }
    public LinkedList delete(LinkedList l){
        if(l.head != null){
            Node temp=l.head;
            while(temp.next != null){
                if(temp.next.next == null){
                    temp.next = null;
                    break;
                }
                temp=temp.next;               
            }
        }
        return l;
    }
    public static void main(String[]Args){
            LinkedList newList = new LinkedList();
            newList.insert(newList, 1);
            newList.insert(newList,2);
            newList.insert(newList,3);
            print(newList);
            newList.delete(newList);
            print(newList);

    }
}
