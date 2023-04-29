

public class Laptop {
    private String brand; // марка
    private String model; // модель
    private double price; // цена
    private double screenSize; // размер экрана
    private int ram; // объем оперативной памяти
    private int storage; // объем накопителя
    private String processor; // процессор
    private String graphics_card; // видеокарта

    private String OS_name;


    public Laptop(String brand, String model, double price, double screen_size, int ram, int storage, String processor, String graphics_card, String OS_name) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screen_size;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.graphics_card = graphics_card;
        this.OS_name = OS_name;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public double getPrice() {
        return price;
    }


    public double getScreenSize() {
        return screenSize;
    }


    public int getRam() {
        return ram;
    }


    public int getStorage() {
        return storage;
    }


    public String getProcessor() {
        return processor;
    }


    public String getGraphicsCard() {
        return graphics_card;
    }

    public String getOS_name() {
        return OS_name;
    }
}

