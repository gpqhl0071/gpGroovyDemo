package com.gp.demo

/**
 * @author gao peng
 * @date 2019/11/14 14:30
 */
class StringExample {
}

class StringExample1 {
    static void main(String[] args) {
        String sample = "Hello world";
        println(sample[4]); // Print the 5 character in the string

        //Print the 1st character in the string starting from the back
        println(sample[-1]);
        println(sample[1..2]);//Prints a string starting from Index 1 to 2
        println(sample[4..2]);//Prints a string starting from Index 4 back to 2

    }
}
