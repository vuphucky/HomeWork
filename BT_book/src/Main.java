// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Book pb1 = new ProgrammingBook("PB","xabi",100,"toi","java","basic");
       Book pb2 = new ProgrammingBook("PB","alonso",250,"la","java script","basic");
       Book pb3 = new ProgrammingBook("PB","be bue",95,"ai","python","basic");

       Book fb1 = new FictionBook("FB","alo",150,"ti","vien tuong 1");
       Book fb2 = new FictionBook("FB","blo",175,"suu","vien tuong 2");
       Book fb3 = new FictionBook("FB","clo",86,"dan","vien tuong 3");

       Book[] books = {pb1,pb2,pb3,fb1,fb2,fb3};
       double sum = 0;
       for (Book book : books) {
           sum += book.getAmount();
       }
        System.out.println("tong 6 cuon sach = " + sum);

        int countLanguage = 0;
        for (Book book:books) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage().equals("java")) {
                countLanguage++;
            }
        }
            System.out.println("So sach co ngon ngu java = " + countLanguage);


        int countCategory = 0;
        for (Book book:books) {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory().equals("vien tuong 1")) {
                countCategory++;
            }
        }
            System.out.println("so sach co category vien tuong 1 = " + countCategory);

            int countFbPriceLess = 0;
            for(Book book1: books){
                if (book1 instanceof FictionBook && ((FictionBook)book1).getAmount() <100){
                    countFbPriceLess++;
                }
            }
            System.out.println("so sach fiction book co gia nho hon 100 = " + countFbPriceLess);
        }
    }
    