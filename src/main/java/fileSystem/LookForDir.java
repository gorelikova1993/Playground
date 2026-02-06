package fileSystem;

import java.io.File;

public class  LookForDir {
    //looking for dir that has the max files
    public static void main(String[] args) {
        String pathToFile = "D:\\basedir";
        File completedProjsDirectory = new File(pathToFile);
        File[] projects = completedProjsDirectory.listFiles();
        int length = projects.length;
        int max = 0;
        String dir = "";
        for (int i = 0; i < length - 1; i++) {
            int size = projects[i].listFiles().length;
            if (size > max) {
                max = size;
                dir = projects[i].getName();
            }
        }
        System.out.println(max + " " + dir);


    }
}

