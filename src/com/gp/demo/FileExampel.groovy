package com.gp.demo
/**
 * @author gao peng
 * @date 2019/11/14 11:32
 */
class FileExampel {

    public static void main(String[] args) {
        new java.io.File("G:/1.txt").eachLine {
            line -> println "line : $line";
        }
    }
}

class Example1 {
    static void main(String[] args) {
        File file = new File("G:/1.txt")
        println file.text
    }
}

class Example2 {
    static void main(String[] args) {
        new File('G:/', 'Example.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World'
        }
    }
}

class Example3 {
    static void main(String[] args) {
        File file = new File("G:/1.txt")
        println "The file ${file.absolutePath} has ${file.length()} bytes"
    }
}

class Example4 {
    static void main(String[] args) {
        def src = new File("G:/1.txt")
        def dst = new File("G:/Example1.txt")
        dst << src.text
    }
}

class Example5 {
    static void main(String[] args) {
        def rootFiles = new File("g:").listRoots()
        rootFiles.each {
            file -> println file.absolutePath
        }
    }
}

class Example6 {
    static void main(String[] args) {
        new File("g:").eachFile() {
            file -> println file.getAbsolutePath()
        }
    }
}

class Example7 {
    static void main(String[] args) {
        new File("E:\\gpGroovyDemo\\src\\com\\gp\\demo").eachFileRecurse() {
            file ->
                String f = file.getAbsolutePath()
                f = f.replace("E:\\","")
                println f
        }
    }
}