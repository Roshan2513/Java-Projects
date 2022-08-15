public class While {
    public static void main(String[] args) {

        System.out.println( isPalindrome(12321));


    }
    public static boolean isPalindrome(int number)
    {   int lastDigit;
        int reverse=0;
        int originalNumber=number;

       while(number!=0)
       {
           lastDigit= number%10;
           reverse=(reverse*10)+ lastDigit ;

           number/=10;


       }
       return (originalNumber==reverse);

    }

}
