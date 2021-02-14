package ChapterFive;

public class Interest {
    public static void main(String args[]) {

        int amount;
        int principal = 100000;
        double rate = 0.05;


        System.out.printf("%s%20s\n", "Year", "Amount on deposit");


        for (int year = 1; year <= 10; year++) {
            amount = (int) (principal * Math.pow(1.0 + rate, year));

            int dollars = amount / 100;
            int cents = amount % 100;


            System.out.printf("%4d%,17d.", year, dollars);


            if (cents < 10)

                System.out.printf("0%d\n", cents);
            else
                System.out.printf("%d\n", cents);

        }
    }
}
