package com.xrd.greendaobeans.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.List;

/**
 * Created by WJ on 2019/7/17.
 */

public class StringConvert implements PropertyConverter<List<String>,String> {
    private Gson gson=new Gson();

    @Override
    public List<String> convertToEntityProperty(String databaseValue) {
        return gson.fromJson(databaseValue,new TypeToken<List<String>>(){}.getType());
    }

    @Override
    public String convertToDatabaseValue(List<String> entityProperty) {
        return gson.toJson(entityProperty);
    }
}
