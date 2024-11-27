public class ArrayList {
    public static void main(String[] args) {
        int[] arrayNum = {34, 56, 23, 89, 12, 78, 55, 21, 90, 11};
        
        int largestNum = arrayNum[0];
        int smallestNum = arrayNum[0];
        
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > largestNum) {
                largestNum = arrayNum[i];
            }
            if (arrayNum[i] < smallestNum) {
                smallestNum = arrayNum[i];
            }
            
        }
        System.out.println("The largest number is " + largestNum);
        System.out.println("The smallest number is " + smallestNum);
    }
    
}