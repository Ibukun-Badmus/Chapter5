package ChapterFive;

public class Factorial {
    public static void main( String args[] ) {
        System.out.println( "n\tn!\n" );

        for ( int number = 1; number <= 5; number++ ) {
            int factorial = 1;

             for ( int smaller = 1; smaller <= number; smaller++ )
                 factorial *= smaller;

             System.out.printf( "%d\t%d\n", number, factorial );
            }
        }
}
