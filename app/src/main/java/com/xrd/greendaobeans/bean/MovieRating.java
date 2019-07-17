package com.xrd.greendaobeans.bean;

import java.io.Serializable;

/**
 * Created by WJ on 2019/7/16.
 */

public class MovieRating implements Serializable {

    /**
     * average : 7.9
     * max : 10
     * min : 0
     * stars : 40
     */

    private double average;
    private int max;
    private int min;
    private String stars;

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "MovieRating{" +
                "average=" + average +
                ", max=" + max +
                ", min=" + min +
                ", stars='" + stars + '\'' +
                '}';
    }
}
