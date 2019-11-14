package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:32
 */
class TraitsExample5 {
    static void main(String[] args) {
        StudentTraitsExample5 st = new StudentTraitsExample5();
        st.StudentID = 1;
        println(st.DisplayMarks());
    }
}

trait MarksTraitsExample5 {
    void DisplayMarks() {
        println("Marks1");
    }
}

trait TotalTraitsExample5 extends MarksTraitsExample5 {
    void DisplayMarks() {
        println("Total");
    }
}

class StudentTraitsExample5 implements TotalTraitsExample5 {
    int StudentID
}