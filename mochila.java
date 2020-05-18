//Problema da mochila resolvido com uso de recursão

class mochila {
    public static int Iteracao = 0;

    public static void main(String args[]) {
        double inicio = System.nanoTime();

        int val[] = new int[] { 92, 57, 49, 68, 60, 43, 67, 84, 87, 72 }; // valor
        int wt[] = new int[] { 23, 31, 29, 44, 53, 38, 63, 85, 89, 82 }; // peso
        int W = 165; // capacidade da mochila
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));

        double fim = System.nanoTime();

        double tempoTotal = fim - inicio;
        System.err.println("Tempo total: " + tempoTotal);
        System.out.println("Numero de interações: " + Iteracao);

    }

    static int knapSack(int W, int wt[], int val[], int n) {
        
        if (n == 0 || W == 0)
            addIteracao();
            return 0;

      
        if (wt[n - 1] > W)
            addIteracao();
            return knapSack(W, wt, val, n - 1);

        // retorna o valor maximo
        else
            addIteracao();
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }

    // Compara e retorna o maior
    static int max(int a, int b) {
        addIteracao();
        return (a > b) ? a : b;
    }

    public static void addIteracao() {
        Iteracao++;
    }
}