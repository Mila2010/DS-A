package nyc.c4q;

/**
 * Created by Millochka on 2/10/17.
 */
public class Recursive {
    public static void main(String[] args) {


        System.out.print(reverseWords("cat is running"));
    }

    public static int sumOfDigits(int x){

        if(x<0){
            x*=-1;
        }
        if(0<=x&&x<=9){
            return x;
        }

        return sumOfDigits((x/10)+(x%10));
    }

    public static String reverseWords(String input){
        if(input.isEmpty()){
            return input;
        }
        else if(!input.contains(" ")){
            return input;

        }
       String outputArray[]=input.split(" ");
        String temporaryString=outputArray[outputArray.length-1];
        return temporaryString +" "+ reverseWords(input.substring(0,input.length()-(temporaryString.length()+1)));

    }

//    public boolean elfish(String word){
//        boolean flag= false;
//        if (word.isEmpty()){
//            return false;
//        }else if(word.charAt(0)=='e'){
//
//
//        }
//
//    }

}
