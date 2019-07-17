package com.xrd.greendaobeans.bean;

import java.io.Serializable;

/**
 * Created by WJ on 2019/7/16.
 */

public class AvatarsBean  implements Serializable{
    /**
     * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp
     * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp
     * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp
     */

    private String large;
    private String medium;
    private String small;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }
}
