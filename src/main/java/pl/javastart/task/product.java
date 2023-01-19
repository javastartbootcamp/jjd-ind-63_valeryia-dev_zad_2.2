package pl.javastart.task;

public class product {
    public static void main(String[] args) {
        String productName1 = "Mleko";
        String productName2 = "Czekolada";
        String productProducer1 = "Mlekowita";
        String productProducer2 = "Wedel";
        float productPrice1 = 2.5f;
        float productPrice2 = 2.19f;

        System.out.printf("%s %s %.1fzł\n", productName1, productProducer1, productPrice1);
        System.out.printf("%s %s %.2fzł ", productName2, productProducer2, productPrice2);

    }
}

