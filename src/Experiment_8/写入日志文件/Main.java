package Experiment_8.写入日志文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            bufferedWriter =new BufferedWriter(new FileWriter("src/Experiment_8/写入日志文件/test.txt"));
            while (true){
                String s=bufferedReader.readLine();
                if(s.equals("exit") || s.equals("EXIT")){
                    break;
                }
                System.out.println(s);
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                bufferedReader.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
