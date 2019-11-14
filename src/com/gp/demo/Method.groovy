package com.gp.demo
/**
 * @author gao peng
 * @date 2019/11/14 11:14
 */
class Method {

    public static void main(String[] args) {
        test(1)
        test("hello")

        test1("test", 15)
    }

    static def test(def str) {
        println("def str = " + str)
    }

    static def test1(p1, p2 = 0, p3 = "default") {

        println("p1=" + p1 + ", p2=" + p2 + ", p3 = " + p3)
    }
}


class Example {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int pX) {
        x = pX;
    }

    static void main(String[] args) {
        Example ex = new Example();
        ex.setX(100);
        println(ex.getX());
    }
}