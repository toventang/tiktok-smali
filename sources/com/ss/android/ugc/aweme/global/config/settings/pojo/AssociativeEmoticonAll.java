package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class AssociativeEmoticonAll {
    @c(a = "show")
    private Integer show;
    @c(a = "sourceMessage")
    private String sourceMessage;

    static {
        Covode.recordClassIndex(63013);
    }

    public Integer getShow() {
        return this.show;
    }

    public String getSourceMessage() {
        return this.sourceMessage;
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this.show = num;
        this.sourceMessage = str;
    }
}
