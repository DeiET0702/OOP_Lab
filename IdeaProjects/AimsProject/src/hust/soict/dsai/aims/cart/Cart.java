import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media item) {
        if (!itemsOrdered.contains(item)) {
            itemsOrdered.add(item);
            System.out.println(item + " items added to the cart");
        } else {
            System.out.println(item + " items already in the cart.");
        }
    }

    public void removeMedia(Media item) {
        if (itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
            System.out.println(item + " items removed from the cart");
        } else {
            System.out.println(item + " items not in the cart.");
        }
    }

    public void totalCost() {
        float total = 0;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        System.out.println("Total cost: " + total);
    }
    
}
