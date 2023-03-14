package unionFind;

import java.util.ArrayList;

public class QuickFind {
    private final ArrayList<Integer> list;

    public QuickFind(int entries) {
        this.list = new ArrayList<>();
        for (int i = 0; i <= entries; i++){
            this.list.add(i);
        }
    }

    public boolean connected (int first, int second) {
        return this.list.get(first).equals(list.get(second));
    }

    public void union(int first, int second) {
        int firstId = this.list.get(first);
        int secondId = this.list.get(second);

        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) == firstId){
                this.list.set(i, secondId);
            }
        }
    }

}
