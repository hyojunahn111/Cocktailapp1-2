package com.example.cocktailapp1_2;

public class CocktailData {

    String name;
    String tip;
    int resourceId;

    public CocktailData(int resourceId, String name, String tip){
        this.name = name;
        this.tip = tip;
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getTip() {
        return tip;
    }

    public String getName() {
        return name;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

}
