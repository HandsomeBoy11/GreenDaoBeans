package com.xrd.greendaobeans.bean;

import com.google.gson.Gson;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by WJ on 2019/7/17.
 */

public class MovieImagesConvert implements PropertyConverter<MovieImages,String>{
    private Gson gson=new Gson();
    @Override
    public MovieImages convertToEntityProperty(String databaseValue) {
        return gson.fromJson(databaseValue,MovieImages.class);
    }

    @Override
    public String convertToDatabaseValue(MovieImages entityProperty) {
        return gson.toJson(entityProperty);
    }
}
