package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnDataReader {

    // Path/ Location
    // Absolute path: Full path
    // relative path: Partial path
    public static void main(String[] args){

        // String filePath="C:\\Users\\mhsha\\IdeaProjects\\LearnJava_QE_Winter2022\\DataTest\\Sample.txt";
        //String filePath = "DataTest/Sample.txt";
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Sample.txt";
       // String filePath = "C:\\Users\\mhsha\\Desktop\\Newfolder2/Demo.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;

        try {
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while (  (data=bufferedReader.readLine())   !=null    ){
                System.out.println(data);
            }
        } catch (Exception e){
            System.out.println("File not found Exception");
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e1){
                System.out.println("File Already closed");
            }




        }



    }


}
