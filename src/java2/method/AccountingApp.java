package java2.method;

public class AccountingApp {

    // 공급가액
    public static double valueOfSupply = 10000.0;
    // 부가가치세율
    public static double vatRate = 0.1;

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return getVAT() + valueOfSupply;
    }

    public static void main(String[] args) {

        // 부가세
        // double vat = valueOfSupply * vatRate;
        // double vat = getVAT();

        // 합계
        // double total = vat + valueOfSupply;
        // double total = getTotal();

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : "+ getTotal());
    }
}
