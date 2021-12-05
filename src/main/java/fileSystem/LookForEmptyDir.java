package fileSystem;

import java.io.File;

public class LookForEmptyDir {
    public static void main(String[] args) {
        String fileName = "D:\\Java\\learning projects\\Playground\\fileForProjects\\basedir";
        File file = new File(fileName);
        File[] dir = file.listFiles();
        for (File folder : dir) {
            check(folder);
        }
    }
    static void check(File file) {
        if (file.isDirectory()) {
            int size = file.listFiles().length;
            if(size == 0) {
                System.out.print(file.getName() + " ");
            } else {
                for (File f : file.listFiles()) {
                    check(f);
                }
            }
        }
} }
