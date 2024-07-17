public class FictionBook extends Book {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    @Override
    public double getAmount() {
        return super.getAmount() - (getPrice() * 7/100);
    }

    @Override
    public String toString() {
        return super.toString() + ", category is " + category;
    }
}
