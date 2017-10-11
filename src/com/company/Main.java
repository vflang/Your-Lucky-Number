package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by Veronica Lang on 10/11/2017.
 * Page 94 ...Add them up
 */
public class Tester {
    public static void main(String arg[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter something like 8 + 33 + 1,345 + 137 : ");
        String s = kb.nextLine();

        Scanner sc = new Scanner(s);
        //Set delimiters to a plus sign surrounded by any amount of white space...or...
        //a minus sign surrounded by any amount of white space.
        sc.useDelimiter("\\s*\\+\\s*");

        int sum = 0;
        while(sc.hasNextInt()){
            sum = sum + sc.nextInt(); //this doesn't work even when it's straight from the text book??
        }
        System.out.println("Sum is: " + sum);
    }
}


        /*
        sc.useDelimiter("\\s*\\-\\s*");

        int sum = 0;
        String sign = sc.next();                    //gotta use something to test if it's + or -
        while (sc.hasNextInt()) {
            }if(sign.equals ("-")) {
                sum = sum - sc.nextInt();           //sum - next Integer
            } else if (sign.equals ("+")) {
                sum = sum + sc.nextInt();
            }else{
            sum = sum + Integer.parseInt(sign);     // if the sign happens to not be a + or a -'
                                                    //in the situation if the # is the first # in the input

            System.out.println("Sum is: " + newSum);
        }
    }
}
*/
