package ChapterFive;

public class Pi {

    public static void main( String args[] ) {
        double piValue = 0;
        double number = 4.0;
        double denominator = 1.0;
        int accuracy = 400;

        System.out.printf( "Accuracy: %d\n\n", accuracy );
        System.out.println( "Term\t\tPi" );

        for ( int term = 1; term <= accuracy; term++ ) {
            if ( term % 2 != 0 )
                piValue += number / denominator;

        }
        else

        piValue -= number / denominator;
        System.out.printf( "%d\t\t%.16f\n", term, piValue);
         denominator += 2.0;
    }
 }

