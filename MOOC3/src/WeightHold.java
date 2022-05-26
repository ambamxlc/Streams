import java.util.ArrayList;
 
public class WeightHold {
 
    private ArrayList<WeightSuitcase> suitcases;
    private int maximumWeight;
 
    public WeightHold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
 
    public void addSuitcase(WeightSuitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }
 
        this.suitcases.add(Suitcase);
    }
 
    public int totalWeight() {
        int summa = 0;
        int indeksi = 0;
        while (indeksi < this.suitcases.size()) {
        summa += this.suitcases.get(indeksi).totalWeight();
        indeksi++;
        }
        return summa;
    }
 
    public void printItems() {
        int indeksi = 0;
        while (indeksi < this.suitcases.size()) {
        this.suitcases.get(indeksi).printItems();
        indeksi++;
        }
    }
 
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
 
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
 
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}