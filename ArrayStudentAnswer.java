public class Array_studentAnswer {
    public static void main(String[] args) {
        char [] answerKey =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		char [] [] studentAnswer = {
		     {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		     {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		     {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		     {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		     {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		     {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		     {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		     {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
		
		
		for (int i = 0; i < studentAnswer.length; i++) {
		    int count = 0; //Diri dapit
		    for (int j = 0; j < studentAnswer[i].length; j++) {
		        if (studentAnswer[i][j] == answerKey[j]) {
		            count++;
		        }
		  
		    
		}
		System.out.println("Students " + i + " 1    scores: " + count );
	}
    }
}