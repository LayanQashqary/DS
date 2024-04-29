package datastructure_project;

public class node {
    student data;
    node next;

    public node() {
        
    }//END of (non-parametrized) node constructor
    
    public node(student data) {
         this.data = data;
         this.next = null;
    }//END of (parametrized) node constructor

    public student getData() {
        return data;
    }//END of (getData) method

    public void setData(student data) {
        this.data = data;
    }//END of (setData) method

    public node getNext() {
        return next;
    }//END of (getNext) method

    public void setNext(node next) {
        this.next = next;
    }//END of (setNext) method
}//END of (node) class


