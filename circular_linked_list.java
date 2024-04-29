package datastructure_project;

import java.util.*;

public class circular_linked_list {

    Scanner in = new Scanner(System.in);
     
    int size;
    node tail;
    node head;

    public circular_linked_list() {
        this.size = 0;
        this.tail = null;
    }//END of (non-parametrized) node constructor

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }//END of (isEmpty) method
    }

    public void addlast(student data) {
        node newNode = new node(data);
        if (head == null) {   //For a empty list
            head = newNode;
            tail = newNode;  //For a empty list tail and head both will have the refernce to the new node
            newNode.next = head;
        } else {
            tail.next = newNode;  //tail will have the reference to the new node.
            tail = newNode;  //New node will become new tail.
            tail.next = head;  //In circular linked list tail will alaways point to head.
        }
        size++;
    }//END of (addlast) method

    public void delete(int id) {
        if (isEmpty()) {
            System.err.println("you dont have students in class✘");
        } else if (head.data.getStudentID() == id) {
            if (size > 1) {
                tail.next = tail.next.next;
                head = tail.next;
            } else {
                tail = null;
                head = null;
            }
            size--;
        } else {
            node p = head;
            node c = head.next;
            while (c.data.getStudentID() != id && c != head) {
                c = c.next;
                p = p.next;
            }
            if (c != null) {
                p.next = c.next;
                if (c == tail) {
                    tail = p;
                  
                }
                size--;
            } else {
                System.err.println("Student is not in list✘");
            }
        }
    }//END of (delete) method

    public student search(int id) {
        node temp = new node();
        temp = tail;
        do {
            if (temp.data.getStudentID() == id) {
                return temp.data;
            }

        } while (temp != tail);
        return null;
    }//END of (search) method

    public student getmaxScore() {
        node temp = new node();
        temp = tail;
        int max = -1;
        node found = null;
        do {
            if (temp.data.getScore() > max) {
                found = temp;
                max = temp.data.getScore();
            }

        } while (temp != tail);
        return found.getData();
    }//END of (getmaxScore) method

    public void display() {
        node current = head;
        if (isEmpty()) {
            System.err.println("List is empty✘");
        } else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                //Prints each node by incrementing pointer 
                System.out.print(" ☛ " + current.data + "\n");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }//END of (display) method 

    public void rotate(char answer) {

        if (!isEmpty() && size >= 1) {
            System.out.println("✎it's student : " + tail.data.getName() + " turn");
            char ans = in.next().charAt(0);
            if (ans == answer) {
                tail.data.setScore(tail.data.getScore() + 1);
                System.out.println("★…AMAZING…★ , now you have " + tail.data.getScore() + " point , you can sit ");
            }
            tail = tail.getNext();
        }//END if
    }//END of (rotate) method

    public void scores() {
        node current = head;
        int i = 1;
        if (isEmpty()) {
            System.err.println("List is empty✘");
        } else {
            System.out.println("The Scores of all students: ");
            do {
                //Prints each node by incrementing pointer 
                System.out.print("☛ " + i + "= " + current.data.score + "\n");
                current = current.next;
                i++;
            } while (current != head);//END do-while
        }//END else
    }//END of (scores) method 

    public void heighestScore() {
        node current = head;
        node heighest = head;
        int max = 0;
        if (isEmpty()) {
            System.err.println("List is empty✘");
        } else {
            do {
                if (current.data.score > max) {
                    max = current.data.score;
                    heighest = current;
                    System.out.println("how many student in this class?");
                    int n=in.nextInt();
                    System.out.println("★★  OUR SUPER HERO  ★★");
                    for(int i=0;i<n;i++ ){
                        current=current.next;
                        if(heighest.data.score==current.data.score){
                            System.out.println(current.data.name);
                        }//END inner if
                    }//END for loop
                }//END if
                current = current.next;
            } while (current != head); //END do-while loop
        }//END else
    }//END of (heighestScore) method 
}//END of (circular_linked_list) class


