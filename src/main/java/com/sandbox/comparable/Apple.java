package com.sandbox.comparable;

public class Apple implements Comparable<Orange> {
    private String type;
    private String color;
    private int size;

    public Apple(String type, String color, int size) {
        super();
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Apple() {
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
        StringBuilder sb = new StringBuilder("Apple{");
        sb.append("type='").append(type).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Orange orange) {
        int typeComparison = this.type.compareTo(orange.getType());
        if (typeComparison != 0) {
            return typeComparison;
        }
        int colorComparison = this.color.compareTo(orange.getColor());
        if (colorComparison != 0) {
            return colorComparison;
        }
        return Integer.compare(this.size, orange.getSize());
    }
}