//Problema da mochila resolvido com uso de recursão
//Código baseado em um outro programa encontrado na internet

class mochila {

    public static void main(String args[]) {
        int val[] = new int[] { 12, 2, 1, 1, 4 }; // valor
        int wt[] = new int[] { 4, 2, 2, 1, 10 }; // peso
        int W = 15; // capacidade da mochila
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more
        // than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }

    // Compara e retorna o maior
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}