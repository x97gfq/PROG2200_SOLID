package SingleResponsibility.Assignment.OrderProcessingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // Assuming a simple Order class, you can expand it as needed
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}