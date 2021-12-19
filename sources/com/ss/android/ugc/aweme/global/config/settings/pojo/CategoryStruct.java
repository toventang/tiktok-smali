package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CategoryStruct {
    @c(a = "category_id")
    private String categoryId;
    @c(a = "category_name")
    private String categoryName;

    static {
        Covode.recordClassIndex(63020);
    }

    public String getCategoryId() {
        String str = this.categoryId;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getCategoryName() {
        String str = this.categoryName;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public CategoryStruct(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }
}
