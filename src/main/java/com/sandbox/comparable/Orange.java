package com.sandbox.comparable;


public class Orange {
    private String type;
    private String color;
    private int size;

    public Orange(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Orange() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orange{");
        sb.append("type='").append(type).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}