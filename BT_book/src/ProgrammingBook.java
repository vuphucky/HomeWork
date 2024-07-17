public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.framework = framework;
        this.language = language;
    }

    @Override
    public double getAmount() {
        return super.getAmount() - (getPrice() * 5/10);
    }

    @Override
    public String toString() {
        return super.toString() + ", language is " + language + ", framework is " + framework ;
    }
}
