import java.util.ArrayList;
 
public class WeightSuitcase {
 
    private int maximumWeight;
    private ArrayList<WeightItem> WeightItems;
 
    public WeightSuitcase(int maximumWeight) {
        this.WeightItems = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
 
    public void addItem(WeightItem WeightItem) {
        if (this.totalWeight() + WeightItem.getWeight() > this.maximumWeight) {
            return;
        }
 
        this.WeightItems.add(WeightItem);
    }
 
    public int totalWeight() {
        int summa = 0;
        int indeksi = 0;
        while (indeksi < this.WeightItems.size()) {
        summa += this.WeightItems.get(indeksi).getWeight();
        indeksi++;
        }
        return summa;
    }
 
    public void printItems() {
        int indeksi = 0;
        while (indeksi < this.WeightItems.size()) {
        WeightItem t = this.WeightItems.get(indeksi);
        System.out.println(t);
        indeksi++;
        }
    }
 
    public WeightItem heaviestItem() {
        if (this.WeightItems.isEmpty()) {
            return null;
        }
 
        return this.WeightItems.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }
 
    @Override
    public String toString() {
        if (this.WeightItems.isEmpty()) {
            return "no items";
        }
 
        if (this.WeightItems.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
 
        return this.WeightItems.size() + " items (" + this.totalWeight() + " kg)";
    }
}