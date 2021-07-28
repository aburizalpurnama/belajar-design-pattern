package adapter.pattern;

public class BookAdapter implements Adapter{

    private Book book;

    public BookAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getCatalogTittle() {
        return book.getTittle() + " by. " + book.getAuthor();
    }
}
