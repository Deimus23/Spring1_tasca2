package Nivel1;

import java.util.ArrayList;

public class Sales {
    private static ArrayList<Products> totalProducts;
    private  double totoalSales;

    public Sales() {
    this.totalProducts = new ArrayList<>();
    this.totoalSales=0.0;
    }

    public static void totalPrice() throws EmptysSaleEx {
        double sales= 0.0;
        String name;

        for( Products products:totalProducts){
            if (products.getName()==null){
            throw new EmptysSaleEx();
            }else{
            sales+=products.getPrice();
            }
        }

    }
}
