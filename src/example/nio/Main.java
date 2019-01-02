package example.nio;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
            firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                // shifting from left to right
                intArray[i] = intArray[i - 1];
            }

            // all elements greater than newElement were shifted and we can put it into correct place
            intArray[i] = newElement;
        }

        for (int element : intArray) {
            System.out.println(element);
        }
    }
}
