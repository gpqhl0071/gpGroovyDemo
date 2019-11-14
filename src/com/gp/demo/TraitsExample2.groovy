package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:22
 */
class TraitsExample2 {
    static void main(String[] args) {
        StudentTraitsExample2 st = new StudentTraitsExample2();
        st.StudentID = 1;
        st.Marks1 = 10;

        println(st.DisplayMarks());
        println(st.DisplayTotal());
    }
}

interface Total {
    def DisplayTotal()
}

trait MarksTraitsExample2 implements Total {
    def DisplayMarks() {
        return "Display Marks";
    }

    def DisplayTotal() {
        return "Display Total";
    }
}

class StudentTraitsExample2 implements MarksTraitsExample2 {
    int StudentID
    int Marks1;
}