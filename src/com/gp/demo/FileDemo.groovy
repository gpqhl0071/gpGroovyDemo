package com.gp.demo
/**
 * 创建markdown 目录
 * @author gao peng
 * @date 2019/11/19 10:38
 */
class FileDemo {

    static void main(String[] args) {
        loop("E:\\gpTechnicalCombing", true)
    }

    static def loop(def path, boolean sort = false) {
        String[] rootFiles = new File(path).list()

        List l = rootFiles.toList();

        l.remove(".git");
        l.remove(".idea");
        l.remove(".gitignore");
        l.remove("gpTechnicalCombing.iml");
        l.remove("README.md")

        if (sort) {
            Collections.sort(l,
                    new Comparator<String>() {
                        public int compare(String arg0, String arg1) {
                            String a0 = arg0.split("--")[0];
                            String a1 = arg1.split("--")[0];

                            a0 = a0.substring(2, a0.length())
                            a1 = a1.substring(2, a1.length())
                            return Integer.parseInt(a0).compareTo(Integer.parseInt(a1));
                        }
                    }
            )
        }


        for (String str : l) {
            String newPath = path + "\\" + str;

            if (new File(newPath).isDirectory()) {

                String newPathStr = newPath.replace("E:\\gpTechnicalCombing\\", "");
                newPathStr = newPathStr.replace("\\", "//");

                println "- [${newPathStr}](${newPathStr})"

                loop(newPath)

            } else {
                String newPathStr = newPath.replace("E:\\gpTechnicalCombing\\", "");
                newPathStr = newPathStr.replace("\\", "//");
                println "  - [${str}](${newPathStr})"
            }

        }

    }

}
