package datastructure_project;

public class student {
   int studentID;
   int score;
   String name;

    public student(int studentID,String name) {
        this.studentID = studentID;
        this.name = name;
    }//END of (parametrized) student constructor
    
    public student(){
  
    }//END of (non-parameterized) student constructor

    public int getStudentID() {
        return studentID;
    }//END of (getStudentID) method

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }//END of (setStudentID) method

    public int getScore() {
        return score;
    }//END of (getScore) method

    public void setScore(int score) {
        this.score = score;
    }//END of (setScore) method

    public String getName() {
        return name;
    }//END of (getName) method

    public void setName(String name) {
        this.name = name;
    }//END of (setName) method
    

    
    public String toString() {
        return "studentID :" + studentID  + " name:" + name+ " score= " + score ;
    }//END of (toString) method 
}//END of (student) class


