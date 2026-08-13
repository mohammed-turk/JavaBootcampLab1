import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Q1.
        System.out.println("******************************************");
        System.out.println("--Summation, Multiplication, subtraction, divide, and remainder of two numbers--");
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

//        Q2.
        System.out.println("******************************************");
        System.out.println("--Multiplication Table--");
        System.out.println("Input a number: ");
        int multNum = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println("" + multNum + " x " + i + " = " + (i * multNum));
        }

//        Q3.
        System.out.println("******************************************");
        System.out.println("-- Area and perimeter of a circle --");
        System.out.print("Radius = ");
        System.out.println();
        double radius = scanner.nextDouble();
        double pi = 3.14;
        System.out.println("Perimeter is = " + (2 * pi * radius) );
        System.out.println("Area is = " + ( pi * radius * radius) );

//        Q4.
        System.out.println("******************************************");
        System.out.println("--average of set of integers--");
        System.out.println("Enter the count of numbers: ");
        int count = scanner.nextInt();
        double setnumber;
        double avg = 0;
        for (int i = 1 ; i < count+1 ; i ++){
            System.out.println("Enter an integer: ");
            setnumber = scanner.nextInt();
            avg += setnumber;
        }
        avg = avg/count;
        System.out.println("The average is: " + avg);
//    Q5.
        System.out.println("******************************************");
        System.out.println("First two numbers equal to the third? ");
        System.out.print("Input the first number: ");
        System.out.println();
        int firstNum = scanner.nextInt();
        System.out.print("Input the second number: ");
        System.out.println();
        int secondNum = scanner.nextInt();
        System.out.print("Input the third number: ");
        System.out.println();
        int thirdNum = scanner.nextInt();
        boolean result;


        if ( firstNum + secondNum == thirdNum){
            System.out.println("result is: true");
        }
        else
            System.out.println("result is: false");

//        Q6.
        System.out.println("******************************************");
        System.out.println("--reverse a word--");
        System.out.print("Input a word: ");
        System.out.println();
        scanner.nextLine();
        String word6 = scanner.nextLine();
        System.out.print("Reverse word: ");
        for (int i = word6.length()-1  ; i >= 0; i-- ){
            System.out.print(word6.charAt(i));
        }
        System.out.println();

//        Q7.
        System.out.println("******************************************");
        System.out.println("--Odd or Even--");
        System.out.println("Enter a number: ");
        int oddOrEven = scanner.nextInt();
        if (oddOrEven % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");

//       Q8.
        System.out.println("******************************************");
        System.out.println("--C to Fahrenheit--");
        System.out.println("Enter temperature in Centigrade: ");
        double temperature = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " + ((temperature * 1.8) + 32));

//        Q9.
        System.out.println("******************************************");
        System.out.println("--Char at--");
        scanner.nextLine();
        System.out.print("Input a string: ");
        System.out.println();
        String string9 = scanner.nextLine();
        System.out.print("Input a number: ");
        int index9 = scanner.nextInt();
        System.out.println(string9.charAt(index9));

//        Q10.
        System.out.println("******************************************");
        System.out.println("--Rectangle area and perimeter--");
        System.out.print("Width = ");
        double width = scanner.nextDouble();
        System.out.print("Height = ");
        double height = scanner.nextDouble();
        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("perimeter is 2 * (" + width + " + " + height + ") = " + (2 * (width + height)));

//        Q11.
        System.out.println("******************************************");
        System.out.println("--Two numbers compersion--");
        System.out.println("Input first integer: ");
        int fInt11, sInt11;
        fInt11 = scanner.nextInt();
        System.out.println("Input second integer");
        sInt11 = scanner.nextInt();

        if ( fInt11 != sInt11)
            System.out.println(fInt11 + " != " + sInt11);
        if (fInt11 == sInt11)
            System.out.println(fInt11 + " == " + sInt11);

        if ( fInt11 < sInt11)
            System.out.println(fInt11 + " < " + sInt11);
        if (fInt11 > sInt11)
            System.out.println(fInt11 + " > " + sInt11);
        if ( fInt11 <= sInt11)
            System.out.println(fInt11 + " <= " + sInt11);
        if (fInt11 >= sInt11)
            System.out.println(fInt11 + " >= " + sInt11);

//        Q12.
        System.out.println("******************************************");
        System.out.println("Seconds to hours, minutes, and seconds");
        System.out.println("Enter the number of seconds");
        int seconds = scanner.nextInt();
        int hours = seconds / 60 / 60;
        int minutes = (seconds - (seconds / 60 /60 *60 * 60 )) /60 ;
        seconds = seconds -  (minutes *60 ) - (hours * 60 * 60)  ;
        System.out.println(""+ hours + ":" + minutes + ":" + seconds);

//        Q13.
        System.out.println("******************************************");
        System.out.println("--four equal numbers--");
        int num113, num213, num313, num413;

        System.out.println("Input first number: ");
        num113 = scanner.nextInt();
        System.out.println("Input second number: ");
        num213 = scanner.nextInt();
        System.out.println("Input third number: ");
        num313 = scanner.nextInt();
        System.out.println("Input forth number: ");
        num413 = scanner.nextInt();
        if ( num113 == num213 && num113 == num313 & num113 == num413)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");

//        Q14.
        System.out.println("******************************************");
        System.out.println("--positive, negative, or zero--");
        System.out.println("Input a number: ");
        int intNumber = scanner.nextInt();
        if (intNumber > 0)
            System.out.println("Number is positive");
        else if (intNumber < 0)
            System.out.println("Number is negative");
        else if (intNumber == 0)
            System.out.println("Number is zero");
        else
            System.out.println("Only integer numbers accepted");

//        Q15.
        System.out.println("******************************************");
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        int num15;
        System.out.println("Enter integer numbers and input -1 for stop");
        do {
            num15 = scanner.nextInt();
            if (num15 > 0)
                positiveCounter++;
            else if (num15 < 0 && num15 != -1)
                negativeCounter++;
            else if (num15 == 0)
                zeroCounter++;
            else
                System.out.println("Only integers are accepted");


        } while (num15 != -1);

        if (positiveCounter != 1)
            System.out.println(positiveCounter + " Positives");
        else
            System.out.println(positiveCounter + " Positive");
        if (zeroCounter != 1)
            System.out.println(zeroCounter + " Zeros");
        else
            System.out.println(zeroCounter + " Zero");
        if (negativeCounter != 1)
            System.out.println(negativeCounter + " negatives");
        else
            System.out.println(negativeCounter + " negative");


//        Q16.
        System.out.println("******************************************");
        System.out.println("--Integer reverse--");
        System.out.println("Input an integer: ");
        int reverseInt = scanner.nextInt();
        String intToString = Integer.toString(reverseInt);

        for (int i = intToString.length()-1; i >=0; i--)
            System.out.print(intToString.charAt(i));

        System.out.println();

//        Q17.
        System.out.println("******************************************");
        System.out.println("--Largest and smallest numbers--");
        int exitNumber;
        int largest;
        int smallest;
        System.out.println("Enter how many numbers you want to enter: ");
        int stopping = scanner.nextInt();
        int counter17 = 1;
        System.out.println("Enter a number");
        exitNumber = scanner.nextInt();
        largest = exitNumber;
        smallest = exitNumber;

        while (counter17 < stopping){
            counter17++;
            System.out.println("Enter a number");
            exitNumber = scanner.nextInt();
            if (exitNumber > largest)
                largest = exitNumber;
            if (exitNumber < smallest)
                smallest = exitNumber;
        }
        System.out.println("the largest number is: " + largest);
        System.out.println("the smallest number is: " + smallest);

//        Q18.
        System.out.println("******************************************");
        System.out.println("--char a occurance--");
        System.out.println("Enter a string: ");
        scanner.nextLine();
        String string18 = scanner.nextLine();
        int aCounter = 0;
        for (int i =0; i< string18.length(); i++){
            if (Character.toString(string18.charAt(i)).equals("a"))
                aCounter++;
        }
        System.out.println("Number of a's: " + aCounter);
    }
}