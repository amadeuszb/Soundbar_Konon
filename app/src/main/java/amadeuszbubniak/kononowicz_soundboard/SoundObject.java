package amadeuszbubniak.kononowicz_soundboard;

/**
 * Created by Amadeusz on 2017-12-05.
 */

public class SoundObject {

    private String itemName;

    private Integer itemId;

    public SoundObject(String itemName, Integer itemId){

        this.itemName = itemName;
        this.itemId = itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public Integer getItemId(){
        return itemId;
    }
}
