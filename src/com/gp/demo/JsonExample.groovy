package com.gp.demo

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/**
 * @author gao peng
 * @date 2019/11/14 15:48
 */
class JsonExample {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

        println(object.name);
        println(object.ID);
    }
}

class JsonExample1 {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
        lst.each { println it }
    }
}

class JsonExample2 {

    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''

        println(obj.Integer);
        println(obj.fraction);
        println(obj.double);
    }
}

class JsonExample3 {
    static void main(String[] args) {
        def output = JsonOutput.toJson([name: 'John', ID: 1])
        println(output);
    }
}

class JsonExample4 {
    static void main(String[] args) {
        def output = JsonOutput.toJson([ new StudentJsonExample4(name: 'John',ID:1),
                                         new StudentJsonExample4(name: 'Mark',ID:2)])
        println(output);
    }
}

class StudentJsonExample4 {
    String name
    int ID;
}