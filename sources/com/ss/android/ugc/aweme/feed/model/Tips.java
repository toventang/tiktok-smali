package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class Tips implements Serializable {
    @c(a = "key_id")
    private Integer key_id = 0;
    @c(a = "text")
    private String text;
    @c(a = StringSet.type)
    private String type;

    static {
        Covode.recordClassIndex(59459);
    }

    public final Integer getKey_id() {
        return this.key_id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final String toString() {
        return "Tips(type=" + this.type + ", text=" + this.text + ')';
    }

    public final void setKey_id(Integer num) {
        this.key_id = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
