package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:13
 */
class TraitsExample {
}

trait Marks {
    void DisplayMarks() {
        println("Display Marks");
    }
}

class TraitsStudentExample implements Marks {
    int StudentID
    int Marks1;
}

class TraitsExample1 {
    static void main(String[] args) {
        TraitsStudentExample st = new TraitsStudentExample();
        st.StudentID = 1;
        st.Marks1 = 10;
        println(st.DisplayMarks());
    }
}