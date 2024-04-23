import java.util.*;

public class Menu{

    String item;
    double price;
    String category;

    Menu(String item, double price, String category){
        this.item = item;
        this.price = price;
        this.category = category;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String item){
        this.category = category;
    }

}