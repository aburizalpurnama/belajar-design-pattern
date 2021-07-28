package prototype.pattern;

public class Store implements Cloneable{
    private String name;
    private String country;
    private String city;
    private String category;

    public Store(String name, String country, String city, String category) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Store manualClone(){
        return new Store(
                name,
                country,
                city,
                category
        );
    }

    public Store autoClone() throws CloneNotSupportedException {
        return (Store) this.clone();
    }
}
