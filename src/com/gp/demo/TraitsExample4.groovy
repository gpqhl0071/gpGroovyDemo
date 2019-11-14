package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:31
 */
class TraitsExample4 {
    static void main(String[] args) {
        StudentTraitsExample4 st = new StudentTraitsExample4();
        st.StudentID = 1;

        println(st.DisplayMarks());
        println(st.DisplayTotal());
    }
}

trait MarksTraitsExample4 {
    void DisplayMarks() {
        println("Marks1");
    }
}

trait TotalTraitsExample4 {
    void DisplayTotal() {
        println("Total");
    }
}

class StudentTraitsExample4 implements MarksTraitsExample4,TotalTraitsExample4 {
    int StudentID
}