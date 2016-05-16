/**
 * Created by doug on 5/8/16.
 * Started by Taylor on 5/11/16.
 */
public class GroceryItem {
    //   create an id, default it to 1
    int id = 1;


    //   create a property for name
    String itemName;

    //   create a property for quantity
    //made it a string so that you can enter "half a dozen" or "1.4 lbs"
    String itemQuantity;

    public GroceryItem(int id, String itemName, String itemQuantity) {
        this.id = id;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
