public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
//        number = Math.abs(number);
//        int number1 =(int) Math.floor(number / Math.pow(10, Math.floor(Math.log10(number))));
//        System.out.println(number1);
//        return number1;

        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
            return 0;
        } else

        System.out.println("-1");
        return -1;
    }

}
