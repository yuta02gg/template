package com.diworksdev.template.dto;

public class BuyItemDTO {
    private int id; // テーブルカラムに対応したフィールド変数を宣言します。
    private String itemName;
    private String itemPrice;

    // フィールド変数に対応したGetterとSetterを定義します。
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
