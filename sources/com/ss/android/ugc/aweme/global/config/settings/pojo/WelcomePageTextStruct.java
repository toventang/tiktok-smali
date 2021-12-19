package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class WelcomePageTextStruct {
    @c(a = "description")
    private String description;
    @c(a = "image_url")
    private String imageUrl;
    @c(a = "page_num")
    private Integer pageNum;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63115);
    }

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getPageNum() {
        Integer num = this.pageNum;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
