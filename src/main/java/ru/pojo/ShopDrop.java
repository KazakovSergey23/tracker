package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        while (true) {
            Product rev;
            if (products[products.length - 1] == null) {
                return products;
            } else {
                for (int i = 0; i < products.length - 1; i++) {
                    if (products[i] == null) {
                        rev = products[i];
                        products[i] = products[i + 1];
                        products[i + 1] = rev;
                    }
                }

            }
        }
    }
}
