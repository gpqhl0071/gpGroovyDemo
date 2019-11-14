package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 14:53
 */
class ObjectExample {
}

class Student {
    int StudentID;
    String StudentName;

    static void main(String[] args) {
        Student st = new Student();
        st.StudentID = 1;
        st.StudentName = "Joe"
    }
}

class Student1 {
    private int StudentID;
    private String StudentName;

    void setStudentID(int pID) {
        StudentID = pID;
    }

    void setStudentName(String pName) {
        StudentName = pName;
    }

    int getStudentID() {
        return this.StudentID;
    }

    String getStudentName() {
        return this.StudentName;
    }

    static void main(String[] args) {
        Student1 st = new Student1();
        st.setStudentID(1);
        st.setStudentName("Joe");

        println(st.getStudentID());
        println(st.getStudentName());
    }
}

class Student3 {
    int StudentID;
    String StudentName;

    int Marks1;
    int Marks2;
    int Marks3;

    int Total() {
        return Marks1 + Marks2 + Marks3;
    }

    static void main(String[] args) {
        Student3 st = new Student3();
        st.StudentID = 1;
        st.StudentName = "Joe";

        st.Marks1 = 10;
        st.Marks2 = 20;
        st.Marks3 = 30;

        echo(st.Total());
    }
}