public abstract class Book {
    private String bookCode;
    private String name;
    private double price;
    private String author;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(){}
    public Book(String bookCode, String name, double price, String author){
        this.author = author;
        this.bookCode = bookCode;
        this.price = price;
        this.name = name;
    }

    public double getAmount(){
      return price;
    }

    @Override
    public String toString() {
        return "Book" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + getAmount() +
                ", author='" + author + '\'';
    }
}
