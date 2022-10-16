public class PraktikumArray {
    public PraktikumArray() {
    }

    public static void main(String[] args) {
        String[] namaBunga = new String[]{"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[][] stock = new int[][]{{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] harga = new int[]{75000, 50000, 60000, 10000};
        int pendapatanRG1 = 0;
        System.out.println("JUMLAH STOCK SETIAP JENIS BUNGA PADA SELURUH CABANG : ");

        int i;
        for(i = 0; i < namaBunga.length; ++i) {
            int stockBunga = 0;

            for(int j = 0; j < stock.length; ++j) {
                stockBunga += stock[j][i];
            }

            System.out.println(namaBunga[i] + " : " + stockBunga);
        }

        int var10002 = stock[0][0]--;
        stock[0][1] -= 2;
        stock[0][2] -= 0;
        stock[0][3] -= 5;

        for(i = 0; i < harga.length; ++i) {
            pendapatanRG1 += stock[0][i] * harga[i];
        }

        System.out.printf("\nPendapatan RoyalGarden1 : %d Rupiah\n", pendapatanRG1);
    }
}
