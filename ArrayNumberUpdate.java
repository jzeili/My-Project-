public class ArrayNumberUpdate {
    public static void main(String[] args) {
        int [] arrayNumber = {2,4,6,8,10};
        arrayNumber[1] = 12;
        arrayNumber[3] = 24;
        
        for(int i = 0; i < arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);
        }
    }
    
}