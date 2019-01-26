package hometask1;

public class ArraysConditions {
    public static void main(String[] args) {

        int[] intArray = {-1, 0, 3, 4};
        int length = intArray.length;

        for (int i = 0; i < length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.println("True! " + intArray[i] + " is even");
            } else {
                System.out.println("False! " + intArray[i] + " is odd");
            }
        }
    }
}
