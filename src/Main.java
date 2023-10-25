public class Main {
    public static void main( String[] args ) {
        short[] a = new short[ 11 ];
        for ( int j = 3, i = 0; j < 24; j += 2, i++ ) {
            a[ i ] += j;
        }

        double[] x = new double[ 15 ];
        final double g = 13;
        final double n = 8;
        for ( int j = 0; j < x.length; j++ ) {
            x[ j ] = Math.random() * ( g + n ) - n;
        }

        double[][] c = new double[ 11 ][ 15 ];
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < x.length; j++ ) {
                double X = x[ j ];
                switch( a[ i ] ) {
                    case 5 -> {
                        c[ i ][ j ] =  Math.pow( Math.cbrt( Math.cos( X ) ), 2 * Math.cos( Math.cbrt( X ) ) );
                        break;
                    }
                    case 3, 7, 13, 15, 21 -> {
                        c[ i ][ j ] = Math.pow( Math.cos( Math.tan( X ) ), 3 * Math.log( Math.abs( X ) ) );
                        break;
                    }
                    default -> {
                        c[ i ][ j ] = Math.cos( Math.pow( ( Math.cos( Math.pow( X, 4 * X ) ) - 1 )
                                / ( Math.atan( Math.pow( Math.E, -Math.abs( X ) ) ) ), 3 ) );
                    }
                }
                System.out.printf("%.2f ", c[ i ][ j ]);
            }
            System.out.println();
        }
    }
}