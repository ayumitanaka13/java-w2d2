public class ArrayExample {

    public static void main(String[] args) {
        
        int myList[] = new int[5];
        System.out.println(myList[4]); // 0

        int[] myListTwo = {3, 5, 19};
        System.out.println(myListTwo[2]); // 19

        for (int num:myListTwo) {
            System.out.println(num + 100);
        };
        // 103
        // 105
        // 119
    }
}
