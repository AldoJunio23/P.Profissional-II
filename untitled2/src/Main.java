public class Main {
    public static void  main(String[] args) {
        int[] a = {3,6,12,4,9, 10, 1,23,5};
        if (funcao(a, 10)){
            System.out.println("Deu certo");
        }
    }

    public static Boolean funcao(int[] array, int k) {
        boolean deu = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != i && array[j] + array[i] == k) {
                    deu = true;
                    break;
                }
            }
            if (deu) {
                break;
            }
        }
        return deu;
    }
}