public class Main {
    public static void main(String[] args)
    {
        ////////////////// 0  1  2  3   4   5  6   7
        int[] intArray = {43,52,22,-45,-22, 0, 9, 16};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i , i+ 1);
                }
            }
        }
        for( int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap (int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}