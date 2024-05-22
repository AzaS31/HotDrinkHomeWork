public class Product {
    private String name;
    private int volume;

    public Product(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    void setName(String name) {
        this.name = name;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return ("Название: " + name + ", Объем: " + volume + "мл"); 
    }
}
