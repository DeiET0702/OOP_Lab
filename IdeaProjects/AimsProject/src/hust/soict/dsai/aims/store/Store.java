import java.util.ArrayList;
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        itemsInStore.remove(dvd);
    }

    public void printItemsInStore() {
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(dvd);
        }
    }
}
