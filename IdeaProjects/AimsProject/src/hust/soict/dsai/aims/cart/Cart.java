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

    public void printOrdered() {
        float totalCost = 0;
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.length; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            if (disc != null) {
                System.out.printf("%d. DVD - ", i+1);
                System.out.print(disc.getTitle());
                if (disc.getCategory() != null) {
                    System.out.print(" - " + disc.getCategory());
                }
                if (disc.getDirector() != null) {
                    System.out.print(" - " + disc.getDirector());
                }
                if (disc.getLength() != 0) {
                    System.out.print(" - " + disc.getLength());
                }
                if (disc.getCost() != 0) {
                    System.out.printf(" - %.2f $\n", disc.getCost());
                    totalCost += disc.getCost();
                }
                System.out.println();
            }
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("***************************************************");
    }

    public void searchDVDById(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                found = true;
                System.out.println("DVD is founded.");
                break;
            }
            if (!found) {
                System.out.println("No DVD is founded with Id: " + id);
            }
        }
    }

    public void searchDVDById(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("DVD is founded.");
                break;
            }
            if (!found) {
                System.out.println("No DVD is founded with title: " + title);
            }
        }
    }
}
