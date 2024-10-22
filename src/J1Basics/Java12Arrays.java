package J1Basics;

public class Java12Arrays {
    public static void main(String[] args) {
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        //To declare an array, define the variable type with square brackets:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        //Access the Elements of an Array
        System.out.println(cars[0]);
        System.out.println(myNum[2]);

        //Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        //Array Length
        System.out.println(cars.length);

        //Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }

        //Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);

        //Loop Through a Multidimensional Array
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        //Loop Through a Multidimensional Array with For-Each
        for (int[] i : myNumbers) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}
