package com.example.xkcdreader.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comic {

    // Attributes

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
    public String getDay() { return day; }
    public String getMonth() { return month; }
    public String getYear() { return year; }
    public String getTitle() { return title; }
    public String getImg() { return img; }
    public String getAlt() { return alt; }


    // To String

    @Override
    public String toString() {
        String str = String.valueOf(getNum())+"-";
        str += getTitle()+"-";
        str += getDay()+"/"+getMonth()+"/"+getYear()+"-";
        str += getImg()+"-"+getAlt();
        return str.replace(' ', '_');
    }

    public String formatPrimary() {
        return getTitle();
    }

    public String formatSecondary() {
        return getDay()+"/"+getMonth()+"/"+getYear() + " " + "#"+String.valueOf(getNum());
    }
}
