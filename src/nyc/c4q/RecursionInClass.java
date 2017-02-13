package nyc.c4q;

/**
 * Created by Millochka on 2/11/17.
 */
public class RecursionInClass {

    public static void main(String[] args) {


        System.out.print(isPalindrome("lakkalu", 7));
    }

    public static int sum(int n){

        if(n==0){
            return n;
        }

        return n + sum(n-1);

    }

    public static int findmin(int[] array, int n){

        if(n==1){
            return array[0];
        }

        if(array[n-1]<findmin(array,n-1)){
          return array[n-1];
        } else {
            return findmin(array,n-1);
        }
    }

    public static int findSum(int[] array, int size){
        if(size==1){
            return array[0];

        }else {
        return array[size-1] + findSum(array,size-1);}
    }

    public static boolean isPalindrome(String str, int n){

        if(str.isEmpty()||n==1){
            return true;

        }


            if(str.substring(0,1).equals(str.substring(n-1))){
                return isPalindrome(str.substring(1,n-1),n-2);
            } else {
                return false;
            }



    }

    public int gcd(int a, int b){


        return 0;

    }

}
