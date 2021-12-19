package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class MissionUser implements Serializable {
    @c(a = "nickname")
    private String nickname;
    @c(a = "sec_uid")
    private final String secUid;
    @c(a = "uid")
    private final String uid;

    static {
        Covode.recordClassIndex(84458);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }
}
