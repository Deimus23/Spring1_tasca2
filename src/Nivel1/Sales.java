package Nivel1;

import java.util.ArrayList;

public class Sales {
    private static ArrayList<Products> totalProducts;
    private static double totalSales = 0.0;

    public Sales() {
        this.totalProducts = new ArrayList<>();
    }

    public void totalPrice() throws EmptysSaleEx {
        double sales = 0.0;

        if (totalProducts.isEmpty()) {
            throw new EmptysSaleEx("To calculate the total sales, first you need to add products;");
        } else {
            for (Products products : totalProducts) {
                sales += products.getPrice();
                totalSales = sales;
            }
        }

    }
}
