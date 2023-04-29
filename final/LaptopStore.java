

import java.util.*;

// Магазин Ноутбуков
public class LaptopStore {
    private List<Laptop> laptops;
    private Double profits=0.0;

    public LaptopStore(){ laptops = new ArrayList<>();}
    public LaptopStore(List<Laptop> laptops){
        this.laptops = laptops;
    }
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void sell(Laptop laptop){
        laptops.remove(laptop);
        profits += laptop.getPrice();
    }

    public void filterLaptops(Map<String, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean matchesFilter = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();

                switch (field) {
                    case "brand" -> matchesFilter &= laptop.getBrand().equals(value);
                    case "model" -> matchesFilter &= laptop.getModel().equals(value);
                    case "price" -> matchesFilter &= laptop.getPrice() >= (double) value;
                    case "screen_size" ->matchesFilter &= laptop.getScreenSize() >= (double) value;
                    case "ram" -> matchesFilter &= laptop.getRam() >= (int) value;
                    case "storage" -> matchesFilter &= laptop.getStorage() >= (int) value;
                    case "processor" -> matchesFilter &= laptop.getProcessor().equals(value);
                    case "graphics_card" -> matchesFilter &= laptop.getGraphicsCard().equals(value);
                    case "OS" -> matchesFilter &= laptop.getOS_name().equals(value);
                    default -> System.out.println("Unknown filter: " + field);
                }
            }

            if (matchesFilter) {
                System.out.println(laptop.getBrand() + " " + laptop.getModel() + " - " + laptop.getPrice() + " USD");
            }
        }
    }

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", 1799.99, 13.3, 8, 256, "Intel Core i5", "Intel Iris Plus Graphics 645", "Windows");
        Laptop laptop2 = new Laptop("Dell", "XPS 13", 1099.99, 13.4, 8, 256, "Intel Core i5", "Intel UHD Graphics", "Linux");
        Laptop laptop3 = new Laptop("Dell", "XPS 13", 1099.99, 13.4, 8, 256, "Intel Core i5", "Intel UHD Graphics", "Linux");
        Laptop laptop4 = new Laptop("HP", "1660", 999.99, 15.6, 16, 512, "AMD Ryzen 7", "AMD Radeon Graphics", "FreeOS");
        Laptop laptop5 = new Laptop("ACER", "A1584", 2900.99, 15.6, 16, 512, "AMD Ryzen 7", "AMD Radeon Graphics", "FreeOS");
        Laptop laptop6 = new Laptop("HP", "H7845", 2500.99, 15.6, 16, 512, "AMD Ryzen 7", "AMD Radeon Graphics", "FreeOS");
        Laptop laptop7 = new Laptop("ASUS", "R8752", 2000.99, 15.6, 16, 512, "AMD Ryzen 7", "AMD Radeon Graphics", "FreeOS");

        store.addLaptop(laptop1);
        store.addLaptop(laptop2);
        store.addLaptop(laptop3);
        store.addLaptop(laptop4);
        store.addLaptop(laptop5);
        store.addLaptop(laptop6);
        store.addLaptop(laptop6);
        store.addLaptop(laptop7);


        Map<String, Object> filters = new HashMap<>();
        filters.put("price", 1500.0);
        filters.put("ram", 8);

        System.out.println("Laptops matching filter:");
        store.filterLaptops(filters);
    }
}
