package com.xrd.greendaobeans.bean;

import java.io.Serializable;

/**
 * Created by WJ on 2019/7/16.
 */

public class MovieCasts implements Serializable {

    /**
     * alt : https://movie.douban.com/celebrity/1022614/
     * avatars : {"large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp","small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp"}
     * id : 1022614
     * name : 杰森·莫玛
     */

    private String alt;
    private AvatarsBean avatars;
    private String id;
    private String name;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public AvatarsBean getAvatars() {
        return avatars;
    }

    public void setAvatars(AvatarsBean avatars) {
        this.avatars = avatars;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
