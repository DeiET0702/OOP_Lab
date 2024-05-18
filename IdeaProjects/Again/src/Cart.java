public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    private float total;
    public Cart() {
        qtyOrdered = 0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add disc.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i <= qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j <= qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
            }
        }
    }

    public void totalCost() {
        total = 0;
        if (qtyOrdered == 0) {
            System.out.println("You haven't added any disc in your cart.");
        } else {
            for (int i = 0; i <= qtyOrdered; i++) {
                if (itemsOrdered[i] != null) {
                    total += itemsOrdered[i].getCost();
                }
            }
            System.out.println("The total cost in your cart is: " + total);
        }
    }
}
