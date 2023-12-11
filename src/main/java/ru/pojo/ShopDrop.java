package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length; i++) {
            products[i] = products[i + 1];
        }
        return  products;
    }
}
