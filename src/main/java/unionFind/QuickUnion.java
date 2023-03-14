package unionFind;

import java.util.ArrayList;

public class QuickUnion {

    private final ArrayList<Integer> vertices;

    public QuickUnion(int entries) {
        this.vertices = new ArrayList<>();
        for (int i = 0; i <= entries; i++){
            this.vertices.add(i);
        }
    }

    public int getRoot (int number) {
        while (number != vertices.get(number)) { // atât timp cat valoarea e diferita de index, nu am ajuns la rădăcina
            number = vertices.get(number); // preia valoarea rădăcinii direct conectate
        }
        return number;
    }

    public boolean isConnected (int first, int second) {
        return vertices.get(first).equals(vertices.get(second));
    }

    public void union (int first, int second) {
        int firstRoot = getRoot(first);
        int secondRoot = getRoot(second);
        if (firstRoot == secondRoot) {
            return;
        }
        vertices.set(firstRoot,secondRoot);
    }
}