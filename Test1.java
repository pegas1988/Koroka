import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class TestOne {
    public static void main(String[] args) {
        int count = 0;
        int checker = 0;
        String neededLine = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the count of letter for the array!");
        while (in.hasNext()) {
            if (checker == 0) {
                checker ++;
                count = Integer.parseInt(in.nextLine());
                System.out.println("You have entered letter " + count +
                        " it means, that the program will sort first " + count + " letter from the next line");
            }
            neededLine = in.nextLine();
            System.out.println("The Line you have entered: " + neededLine);
            break;
        }

        Integer[] totalLetters = new Integer[count];
        String[] tempLine = new String[count];
        tempLine = neededLine.split(" ");

        int x = 0;
        for (String var : tempLine ){
            while( x < count) {
                totalLetters[x] = Integer.parseInt(tempLine[x]);
                x++;
            }
        }

        Arrays.sort(totalLetters, Collections.reverseOrder());

        System.out.println("The Line after sort: ");
        for (int e = 0; e < totalLetters.length; e ++){
            System.out.print(totalLetters[e] + " ");
        }
        System.out.println(" ");
    }
}
