package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class DouplusTextStruct {
    @c(a = "title")
    private String title;
    @c(a = StringSet.type)
    private Integer type;

    static {
        Covode.recordClassIndex(63028);
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getType() {
        Integer num = this.type;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
