import java.math.BigDecimal;

public class TaxCalculator {
    public static void main(String[] args) {

        BigDecimal net = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");
        BigDecimal soldProduct = new BigDecimal("10000");

        System.out.println("WELCOME");

        // Calculate VAT for 1 product
        BigDecimal vat1 = net.multiply(vat);
        System.out.println("Net Price for 1 Product ---------> " + net + "$");
        System.out.println("23% VAT for 1 Product ---------> " + vat1 + "$");

        // Calculate Gross value for 1 product
        BigDecimal grossValue = net.add(vat1);
        System.out.println("Price for 1 Product with 23% VAT ---------> " + grossValue + "$");

        System.out.println(" ++---------------------------------------------------++ ");

        // Calculate total net price for 10,000 products
        BigDecimal netSP = net.multiply(soldProduct);
        System.out.println("Total Net Price for 10,000 Products ---------> " + netSP + "$");

        // Calculate VAT for 10,000 sold products
        BigDecimal vat2 = netSP.multiply(vat);
        System.out.println("23% VAT for 10,000 Sold Products ---------> " + vat2 + "$");

        // Calculate Price for 10,000 products with 23% VAT
        BigDecimal spwVAT = netSP.add(vat2);
        System.out.println("Price for 10,000 Products with 23% VAT ---------> " + spwVAT + "$");
    }
}
