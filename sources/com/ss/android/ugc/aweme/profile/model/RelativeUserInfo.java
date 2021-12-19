package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class RelativeUserInfo implements Serializable {
    @c(a = "avatar")
    public UrlModel avatar;
    @c(a = "uid")
    public String uid;

    static {
        Covode.recordClassIndex(75256);
    }

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
