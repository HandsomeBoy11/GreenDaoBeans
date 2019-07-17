package com.xrd.greendaobeans.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.xrd.greendaobeans.dao.DaoMaster;
import com.xrd.greendaobeans.dao.DaoSession;
import com.xrd.greendaobeans.dao.MyOpenHelper;

/**
 * Created by WJ on 2019/7/16.
 */

public class MyApp extends Application {
    private static MyApp instances;
    private MyOpenHelper helper;
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        this.instances=this;
        helper = new MyOpenHelper(this, "data.db");
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public static MyApp getInstances() {
        return instances;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
