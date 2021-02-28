import java.util.Scanner;
import java.util.TreeMap;


public class Test2 {
    static int counter = 0;
    static TreeMap<Integer, String> totalLines = new TreeMap<>();

    public static void main(String[] args) {

        String filterWord = null;
        int count = 0;
        String newLine = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the word you would like to sort!");
        while (in.hasNext()) {
            String nextLine = in.nextLine();
            if (nextLine.equals(""))
                break;
            if (count == 0) {
                filterWord = nextLine;
                System.out.println("The word you have entered: " + " --> " + filterWord + " <-- ");
                count ++;
            }

            if (!filterWord.equals(nextLine)) {
                newLine = nextLine;
                countMethod(newLine, filterWord);
            }
        }

        System.out.println();
        System.out.println("Next line will be displayed sorted result:");
        for (int e = 0; e < totalLines.size(); e ++) {
            System.out.println(totalLines.get(e));
        }

    }
    public static void countMethod(String line, String word) {
        String currentLine = line;
        String linesArray [];
        linesArray = line.split(" ");
        for (int e = 0; e < linesArray.length; e ++) {
            if (linesArray[e].contains(word));
                counter ++;
        }
        totalLines.put(counter, currentLine);
        counter = 0;
    }
}
