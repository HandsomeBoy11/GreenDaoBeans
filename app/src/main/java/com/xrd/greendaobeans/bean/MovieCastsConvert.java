package com.xrd.greendaobeans.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.List;

/**
 * Created by WJ on 2019/7/16.
 */

public class MovieCastsConvert implements PropertyConverter<List<MovieCasts>,String> {
    private Gson gson=new Gson();
    @Override
    public List<MovieCasts> convertToEntityProperty(String databaseValue) {
        return gson.fromJson(databaseValue,new TypeToken<List<MovieCasts>>(){}.getType());
    }

    @Override
    public String convertToDatabaseValue(List<MovieCasts> entityProperty) {
        return gson.toJson(entityProperty);
    }
}
