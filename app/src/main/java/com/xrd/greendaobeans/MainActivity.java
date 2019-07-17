package com.xrd.greendaobeans;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.xrd.greendaobeans.bean.DataBean;
import com.xrd.greendaobeans.dao.SQLiteUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bt)
    Button bt;
    private String json = "{\n" +
            "     rating: {\n" +
            "     max: 10,\n" +
            "     average: 7.9,\n" +
            "     stars: \"40\",\n" +
            "     min: 0\n" +
            "     },\n" +
            "     genres: [\n" +
            "     \"动作\",\n" +
            "     \"奇幻\",\n" +
            "     \"冒险\"\n" +
            "     ],\n" +
            "     title: \"海王\",\n" +
            "     casts: [\n" +
            "     {\n" +
            "     alt: \"https://movie.douban.com/celebrity/1022614/\",\n" +
            "     avatars: {\n" +
            "     small: \"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp\",\n" +
            "     large: \"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp\",\n" +
            "     medium: \"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp\"\n" +
            "     },\n" +
            "     name: \"杰森·莫玛\",\n" +
            "     id: \"1022614\"\n" +
            "     },\n" +
            "     {\n" +
            "     alt: \"https://movie.douban.com/celebrity/1044702/\",\n" +
            "     avatars: {\n" +
            "     small: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34697.webp\",\n" +
            "     large: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34697.webp\",\n" +
            "     medium: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34697.webp\"\n" +
            "     },\n" +
            "     name: \"艾梅柏·希尔德\",\n" +
            "     id: \"1044702\"\n" +
            "     },\n" +
            "     {\n" +
            "     alt: \"https://movie.douban.com/celebrity/1010539/\",\n" +
            "     avatars: {\n" +
            "     small: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp\",\n" +
            "     large: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp\",\n" +
            "     medium: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp\"\n" +
            "     },\n" +
            "     name: \"威廉·达福\",\n" +
            "     id: \"1010539\"\n" +
            "     }\n" +
            "     ],\n" +
            "     collect_count: 397576,\n" +
            "     original_title: \"Aquaman\",\n" +
            "     subtype: \"movie\",\n" +
            "     directors: [\n" +
            "     {\n" +
            "     alt: \"https://movie.douban.com/celebrity/1032122/\",\n" +
            "     avatars: {\n" +
            "     small: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509950363.8.webp\",\n" +
            "     large: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509950363.8.webp\",\n" +
            "     medium: \"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509950363.8.webp\"\n" +
            "     },\n" +
            "     name: \"温子仁\",\n" +
            "     id: \"1032122\"\n" +
            "     }\n" +
            "     ],\n" +
            "     year: \"2018\",\n" +
            "     images: {\n" +
            "     small: \"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2541280047.webp\",\n" +
            "     large: \"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2541280047.webp\",\n" +
            "     medium: \"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2541280047.webp\"\n" +
            "     },\n" +
            "     alt: \"https://movie.douban.com/subject/3878007/\",\n" +
            "     id: \"3878007\"\n" +
            "     }";
    private String Tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Gson gson = new Gson();
        DataBean dataBean = gson.fromJson(json, DataBean.class);
        SQLiteUtils.getInstance().deleteAll();
        SQLiteUtils.getInstance().addData(dataBean);
    }

    public void findAll(View view) {
        List<DataBean> beanList = SQLiteUtils.getInstance().findAll();
        Log.e(Tag, beanList.toString());
        if (beanList != null && beanList.size() > 0) {
            DataBean dataBean = beanList.get(0);
            bt.setText(dataBean.getCasts().get(0).getAvatars().getLarge());
        }
    }
}
