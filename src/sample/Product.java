package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {
    private final IntegerProperty item_id;
    private final StringProperty item_name;
    private final IntegerProperty item_qty;
    private final IntegerProperty item_price;

    public Product(Integer item_id, String item_name, Integer item_qty, Integer item_price) {
        this.item_id = new SimpleIntegerProperty(item_id);
        this.item_name = new SimpleStringProperty(item_name);
        this.item_qty = new SimpleIntegerProperty(item_qty);
        this.item_price = new SimpleIntegerProperty(item_price);
    }


    public int getitem_id() {
        return item_id.get();
    }

    public void setitem_id(Integer value) {
        item_id.set(value);
    }

    public String getitem_name() {
        return item_name.get();
    }

    public void setitem_name(String value) {
        item_name.set(value);
    }

    public int getitem_qty() {
        return item_qty.get();
    }

    public void setitem_qty(Integer value) {
        item_qty.set(value);
    }

    public int getitem_price() {
        return item_price.get();
    }

    public void setitem_price(Integer value) {
        item_price.set(value);
    }
}
