public class ArratLargestGrade {
    public static void main(String[] args) {
        double [] grade = {85.0, 96.1, 78.9, 80.3, 9.5};
        double largest = grade[0];
        
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] > largest){
                largest = grade[i];
            }
        }
        
         System.out.println(largest);
    }
 }