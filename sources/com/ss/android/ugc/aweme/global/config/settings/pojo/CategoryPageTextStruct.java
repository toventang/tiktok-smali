package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CategoryPageTextStruct {
    @c(a = "description")
    private String description;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63019);
    }

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
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
