package com.product.kleinashton.restaurantmenu;

/**
 * Created by keyur on 26-03-2018.
 */

public class Word {
    private String resName,rescity;
    private int imgId;



    public Word(String resName, String rescity, int imgId) {
        this.resName = resName;
        this.rescity = rescity;
        this.imgId = imgId;
    }

    public String getResName() {
        return resName;
    }

    public String getRescity() {
        return rescity;
    }

    public int getImgId() { return imgId; }
}
