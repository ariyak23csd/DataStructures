package linkedlist;

class Cnode {
    int data;
    Cnode next;
    Cnode prev;
}

class Cmethods {
    static Cnode head, tail;

    public static void insertatbeg(int data) {
        Cnode newnode = new Cnode();
        newnode.data = data;

        if (head == null) {
            head = newnode;
            tail = newnode;
            head.next = head;
            head.prev = head;
        } else {
            
            
            head.prev = newnode;
            newnode.next = head;
            tail.next = newnode;
            newnode.prev = head;
            head = newnode;
        }
    }

    public static void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Cnode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

    }
}

public class circular extends Cmethods {
    public static void main(String[] args) {
        insertatbeg(4);
        insertatbeg(8);
        insertatbeg(1);
        insertatbeg(0);
        insertatbeg(2);

        print(); 
    }
}
