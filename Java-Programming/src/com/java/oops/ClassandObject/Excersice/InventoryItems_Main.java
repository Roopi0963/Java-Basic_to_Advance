package Day5;

public class InventoryItems_Main {
    public static void main(String[] args) {
        InventoryItems item1;
        item1=new InventoryItems();

        item1.name="Apple";
        item1.Code="C000";
        item1.quantityInStock=5;
        item1.quality="Good";

        System.out.println("Name of the item : "+item1.name);
        System.out.println("Code of the item : " + item1.Code);
        System.out.println("Quantity in stock : "+item1.quantityInStock);
        System.out.println("Quality of the item : "+item1.quality);


        InventoryItems item2;
        item2 =new InventoryItems();

        item2.name="Samsung";
        item2.Code="C002";
        item2.quantityInStock=10;
        item2.quality="Very Good";

        System.out.println("Name of the item : "+ item2.name);
        System.out.println("Code of the item : " + item2.Code);
        System.out.println("Quantity in stock : "+ item2.quantityInStock);
        System.out.println("Quality of the item : "+ item2.quality);


        InventoryItems item3;
        item3 =new InventoryItems();

        item3.name="Realme";
        item3.Code="C003";
        item3.quantityInStock=3;
        item3.quality="Avg";

        System.out.println("Name of the item : "+ item3.name);
        System.out.println("Code of the item : " + item3.Code);
        System.out.println("Quantity in stock : "+ item3.quantityInStock);
        System.out.println("Quality of the item : "+ item3.quality);

        InventoryItems item4;
        item4 =new InventoryItems();

        item4.name="MI";
        item4.Code="C004";
        item4.quantityInStock=15;
        item4.quality="Good";

        System.out.println("Name of the item : "+ item4.name);
        System.out.println("Code of the item : " + item4.Code);
        System.out.println("Quantity in stock : "+ item4.quantityInStock);
        System.out.println("Quality of the item : "+ item4.quality);
    }
}
