package com.gaius.cards;

public class CardItem {

    private int textResource;
    private int titleResource;

    public CardItem(int title, int text) {
        this.textResource = title;
        this.titleResource = text;
    }

    public int getTextResource() {
        return textResource;
    }

    public void setTextResource(int textResource) {
        this.textResource = textResource;
    }

    public int getTitleResource() {
        return titleResource;
    }

    public void setTitleResource(int titleResource) {
        this.titleResource = titleResource;
    }
}
