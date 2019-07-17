package com.xrd.greendaobeans.bean;

import com.google.gson.Gson;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by WJ on 2019/7/16.
 */

public class MovieRatingConvert implements PropertyConverter<MovieRating,String> {
    private Gson gson=new Gson();
    @Override
    public MovieRating convertToEntityProperty(String databaseValue) {
        return gson.fromJson(databaseValue,MovieRating.class);
    }

    @Override
    public String convertToDatabaseValue(MovieRating entityProperty) {
        return gson.toJson(entityProperty);
    }
}
