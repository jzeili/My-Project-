public class BookstoreDiscount {
    public static void main(String[] args) {
        
        double bookPrice = 150.00;
        double penPrice = 10.00;
        double notebookPrice = 25.00;

        
        int numBooks = 2;
        int numPens = 5;
        int numNotebooks = 3;

        
        double discountThreshold = 350.00;
        double discountRate = 0.15;

        
        double totalCost = (numBooks * bookPrice) + (numPens * penPrice) + (numNotebooks * notebookPrice);

        System.out.println("Total Cost: P" + totalCost);
    
    }
}
