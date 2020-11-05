import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {




    public static void main(String[] args) {
     ParseInt("cookie.txt",4);

    }

     public static void ParseInt(String fileName, int numChars){
        try{

            BufferedReader in=new BufferedReader(new FileReader(fileName));

            String line = in.readLine();//go to second line of the file
            while (line != null) {
                String[] parts = line.split(" ");
                for(int i=0;i<parts.length;i++){
                    if(parts[i].length()>numChars){
                        System.out.println(parts[i]);
                    }
                }
                line=in.readLine();
            }
            in.close();

        }
        catch(IOException e){
            System.out.println("File not found!");
        }
     }

}


