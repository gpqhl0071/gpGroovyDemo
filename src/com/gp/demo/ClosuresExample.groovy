package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 15:34
 */
class ClosuresExample {
    static void main(String[] args) {
        def clos = { println "Hello World" };
        clos.call();
    }
}

class ClosuresExample1 {
    static void main(String[] args) {
        def clos = { param -> println "Hello ${param}" };
        clos.call("World");
    }
}

class ClosuresExample2 {
    static void main(String[] args) {
        def clos = { println "Hello ${it}" };
        clos.call("World");
    }
}

class ClosuresExample3 {
    static void main(String[] args) {
        def str1 = "Hello";
        def clos = { param -> println "${str1} ${param}" }
        clos.call("World");

        // We are now changing the value of the String str1 which is referenced in the closure
        str1 = "Welcome";
        clos.call("World");
    }
}

class ClosuresExample4 {
    def static Display(clo) {
        // This time the $param parameter gets replaced by the string "Inner"
        clo.call("Inner");
    }

    static void main(String[] args) {
        def str1 = "Hello";
        def clos = { param -> println "${str1} ${param}" }
        clos.call("World");

        // We are now changing the value of the String str1 which is referenced in the closure
        str1 = "Welcome";
        clos.call("World");

        // Passing our closure to a method
        ClosuresExample4.Display(clos);
    }
}

class ClosuresExample5 {
    static void main(String[] args) {
        def lst = [11, 12, 13, 14];
        lst.each { println it }
    }
}

class ClosuresExample6 {
    static void main(String[] args) {
        def mp = ["TopicName": "Maps", "TopicDescription": "Methods in Maps"]
        mp.each { println it }
        mp.each { println "${it.key} maps to: ${it.value}" }
    }
}

class ClosuresExample7 {
    static void main(String[] args) {
        def lst = [1, 2, 3, 4];
        lst.each { println it }
        println("The list will only display those numbers which are divisible by 2")
        lst.each { num1 -> if (num1 % 2 == 0) println num1 }
    }
}