package arrays;
public class Main {
    public static void main(String[] args) {
        int[] zahlen = {10, 5, 20, 15, 20, 8};
        
        int max = zahlen[0];
        int index = 0;
        
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
                index = i;
            }
        }
        
        System.out.println("Das größte Element im Array ist: " + max);
        System.out.println("Der Index des größten Elements ist: " + index);
        
        System.out.println("Die Indizes aller größten Elemente im Array sind:");
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == max) {
                System.out.println(i);
            }
        }
    }
}

