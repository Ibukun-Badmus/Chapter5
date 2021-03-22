package ChapterFive;

public class ProductOfOdd {
    public static void main(String[] args) {
        int product = 1;

        for ( int x = 3; x <= 15; x += 2 )
            product *= x;

        System.out.printf( "Product is %d\n", product );

    }
}
