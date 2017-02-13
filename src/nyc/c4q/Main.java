package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int test[] = decode("0001111");
        String test1[]={"daenerys", "tyrion", "jon"};


	System.out.print(test[0]+" "+test[1]);
    }

    public static char[] wordToArray(String word){
        return word.toCharArray();
    }

    public static String truncate(String input, int truncateBy){

        if(input.length()<truncateBy){
            return input;
        }

        return input.substring(0, input.length()-truncateBy)+"...";

    }

    public  static boolean checkUnique(String input){
        Map<String,Integer> charMap=new HashMap<>();
        charMap.put(String.valueOf(input.charAt(0)),0);

        for(int i=1;i<input.length();i++){
            if(charMap.containsKey(String.valueOf(input.charAt(i)))){
                return false;

            }
            charMap.put(String.valueOf(input.charAt(i)),i);
        }
        return true;

    }

    public static String elide(String input){

        if(input.length()<=7){
            return input;
        }

        return input.substring(0, 3)+ "..."+input.substring(input.length()-1);

        }

        public  static int xToNum(int x, int num){

            int output=0;

            for(int i=x; i<=num;i++){

                output+=i;

            }
            return output;
        }

        public static String stringArrays(String [] input1,String [] input2 ){

            String output= "";

            for(int i=0;i<input1.length;i++){

                output+=input1[i]+",";

            }
            for(int i=0;i<input2.length;i++){

                output+=input2[i]+",";

            }


            return output.substring(0,output.length()-1);

        }

     public  static    int[] decode(String input){
         int i=0;

         while (input.charAt(i)=='0'){

             i++;
         }

         input=input.substring(i);

         return new int[]{i,input.length()};

     }


}

