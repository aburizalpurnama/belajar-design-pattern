package adapter.pattern;

public class ScreenCast {
    private String tittle;
    private String author;
    private Long duration;

    public ScreenCast(String tittle, String author, Long duration) {
        this.tittle = tittle;
        this.author = author;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
