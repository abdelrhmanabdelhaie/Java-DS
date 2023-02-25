package DS.array.study;

public class Shuffling {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        print(myList);
        for (int i = myList.length - 1; i > 0; i--) {
            // Generate an index j randomly with 0 <= j <= i
            int j = (int)(Math.random()* (i + 1));
            // Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        print(myList);
    }

    static void print(double[] myList){
        for (double x:myList
             ) {
            System.out.print(x+" , ");
        }
        System.out.println();
    }

}
