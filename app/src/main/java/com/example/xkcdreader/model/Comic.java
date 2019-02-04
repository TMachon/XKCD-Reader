package com.example.xkcdreader.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comic {

    // Variables

    @SerializedName("num")
    @Expose
    private int num;

    @SerializedName("day")
    @Expose
    private String day;

    @SerializedName("month")
    @Expose
    private String month;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("img")
    @Expose
    private String img;

    @SerializedName("alt")
    @Expose
    private String alt;

    // Accessors

    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }

    public String getDay() { return day; }
    public void setDay(String day) { this.day = day; }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getImg() { return img; }
    public void setImg(String img) { this.img = img; }

    public String getAlt() { return alt; }
    public void setAlt(String alt) { this.alt = alt; }

    // To String

    @Override
    public String toString() {
        String str = "";
        str += String.valueOf(getNum())+"_";
        str += getDay()+"-"+getMonth()+"-"+getYear()+"_";
        str += getTitle();
        return str;
    }
}
