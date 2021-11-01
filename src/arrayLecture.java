import java.util.Arrays;

public class arrayLecture {



    public static void main(String[] args) {

        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] diceSides = new int[numberOfSides];


        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);

        System.out.println("diceSides[0] = " + diceSides[0]);

        String[] myBag = {"Snickers", "Reese's", "Brussels Spouts"};

        System.out.println("myBag.length = " + myBag.length);
//        System.out.println("myBag[1] = " + myBag[1]);

//        for (int i = 0; i < myBag.length; i++){
//            System.out.println(myBag[i]);
//        }

        for (String candy: myBag){
            System.out.printf("%s is the candy you pulled out of the bag%n", candy);
        }

        String[] anotherBag = new String[12];
        System.out.println("anotherBag[0] = " + anotherBag[0]);
        System.out.println("anotherBag[5] = " + anotherBag[5]);

        Arrays.fill(anotherBag, "Snickers");
        for (String candy: anotherBag){
            System.out.println(candy);
        }
        System.out.println("Arrays.equals(anotherBag, anotherBag) = "  + Arrays.equals(anotherBag, anotherBag));

        String[] myBagPlusOne = Arrays.copyOf(myBag, myBag.length + 1);
        System.out.println("myBag.length = " + myBag.length);
        System.out.println("myBagPlusOne = " + myBagPlusOne.length);

        myBagPlusOne[myBagPlusOne.length-1] = "skittles";
        for (String candy: myBagPlusOne){
            System.out.println(candy);
        }

        System.out.println(Arrays.toString(myBagPlusOne));

        Arrays.sort(myBagPlusOne);
        for(String candy: myBagPlusOne) {
            System.out.println(candy);
        }

        int skittlesindex = Arrays.binarySearch(myBagPlusOne, "skittles");
        int snickersindex = Arrays.binarySearch(myBagPlusOne, "snickers");

        System.out.println("this should be some skittles for myself " + myBagPlusOne[skittlesindex]);
        System.out.println("this should be some snickers for kenneth " + myBagPlusOne[snickersindex]);





        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("matrix[0] = " + Arrays.toString(matrix[0]));
        System.out.println("matrix[1] = " + Arrays.toString(matrix[1]));
        System.out.println("matrix[2] = " + Arrays.toString(matrix[2]));


        System.out.println("matrix[1][1] = " + (matrix[1][1]));


        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}
