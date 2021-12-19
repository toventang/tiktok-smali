package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class r implements Serializable {
    @c(a = "code")
    private Integer code = 0;
    @c(a = "status")
    private String status = "draft";
    @c(a = StringSet.type)
    private String type = "highlight";

    static {
        Covode.recordClassIndex(83907);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
