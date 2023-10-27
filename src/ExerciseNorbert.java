import java.util.*;

public class ExerciseNorbert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas introduce the number of numbers you want to be summed: ");
        int size = scanner.nextInt();
        int[] inArr = arrOfNum(size, scanner);
        System.out.println("Pleas introduce a number to compare with: ");
        int compNum = scanner.nextInt();
        int sumAll = sumArr(inArr);
        oddNumbers(inArr);
        System.out.println("Summ of all numbers: " + sumAll);
        int[] biggerNumbers = compareNumbers(compNum, inArr);
        System.out.println("Numbers that are bigger "+Arrays.toString(biggerNumbers));
        System.out.println("Donation target: ");
        int donation = scanner.nextInt();
        System.out.println("Maximum number of donations: ");
        int maxNumOfDonation=scanner.nextInt();
        donation(donation,maxNumOfDonation);
        System.out.println("Pleas introduce a multiple string that are joined with a \".\": ");
        String longstring = scanner.next();
        stringChopper(longstring);
    }

    private static void stringChopper(String longstring) {
        String[] choppedStrings = longstring.split("\\.");
        for (String chopedString : choppedStrings) {
            System.out.println(chopedString);
        }
    }

    private static void donation(int donation, int maxNumOfDonation) {
        int sumdonation = 0;
        Random rand = new Random();
        for(int i=0;i<=maxNumOfDonation || sumdonation<donation;i++){
            sumdonation += rand.nextInt(donation);
            System.out.println(sumdonation);
        }
    }

    private static int[] compareNumbers(int compNum, int[] inArr) {
        List<Integer> retList = new ArrayList<>();
        for (int j : inArr) {
            if (j > compNum) {
                retList.add(j);
            }
        }
        int[] retArr = new int[retList.size()];
        for (int i = 0; i < retList.size(); i++) {
            retArr[i] = retList.get(i);
        }
        return retArr;
    }

    private static void oddNumbers(int[] sum) {
        int count = 0;
        for (int j : sum) {
            if (j % 2 != 0) {
                count++;
                //   System.out.println(j+",");
            }

        }
        System.out.println("Number of odd numbers: " + count);
    }

    private static int sumArr(int[] sum) {
        int res = 0;
        for (int j : sum) {
            res += j;
        }
        return res;
    }


    private static int[] arrOfNum(int size, Scanner scanner) {
        int[] sum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Pleas enter your " + (i + 1) + ": ");
            sum[i] = scanner.nextInt();
        }
        return sum;
    }
}
