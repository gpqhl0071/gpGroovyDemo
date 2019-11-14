package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:26
 */
class TraitsExample3 {
    static void main(String[] args) {
        StudentTraitsExample3 st = new StudentTraitsExample3();
        st.StudentID = 1;

        println(st.DisplayMarks());
        println(st.DisplayTotal());
    }
}

interface TotalTraitsExample3 {
    void DisplayTotal()
}

trait MarksTraitsExample3 implements TotalTraitsExample3 {
    int Marks1;

    void DisplayMarks() {
        this.Marks1 = 10;
        println(this.Marks1);
    }

    void DisplayTotal() {
        println("Display Total");
    }
}

class StudentTraitsExample3 implements MarksTraitsExample3 {
    int StudentID
}