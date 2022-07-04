package Experiment_8.文件和目录输出;

import java.io.*;

import java.util.Scanner;


class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        FileList f1 = new FileList();
        String str = sc.next();
        f1.readContentsInDirectory(str);
        System.out.println("+++++++++++++++");
        File f = new File(str);
        f1.readContentsInDirectoryRecursive(f, l);
    }
}

class FileList {
    public static void readContentsInDirectory(String path) {
        File f1 = new File(path);
        if (!f1.exists()) {
            System.out.println("路径" + f1.getPath() + "不存在");
            return;
        } else {
            File[] filelist = f1.listFiles();
            for (int i = 0; i < filelist.length; i++)
                if (filelist[i].isFile())
                    System.out.println("[文件]" + filelist[i].getName());
                else
                    System.out.println("[目录]" + filelist[i].getName());

        }
    }

    public static void readContentsInDirectoryRecursive(File path, int levels) {
        File f1 = path;
        if (!f1.exists()) {
            System.out.println("路径" + f1.getPath() + "不存在");
            return;
        } else {
            File[] filelist = f1.listFiles();
            for (int i = 0; i < filelist.length; i++) {
                for (int j = 0; j < levels; j++) {
                    System.out.print("-");
                }
                if (filelist[i].isFile())
                    System.out.println("[文件]" + filelist[i].getName());
                else {
                    System.out.println("[目录]" + filelist[i].getName());
                    readContentsInDirectoryRecursive(filelist[i], levels + 2);
                }

            }
        }
    }
}
