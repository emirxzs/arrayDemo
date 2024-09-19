//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //yeni bir dizi yazma taktiği
        double[] listem = {1.5, 555, 3.4, 5.1, 7.9,3.5,23};
        double total = 0;
        double enBuyuk = listem[0];

        for (double sayi : listem) {
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("Sayıların toplamı:" + total);
        System.out.println("En büyük sayı:" + enBuyuk);
    }
}