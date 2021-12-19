package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class EncryptedVideoContent implements Serializable {
    @c(a = "skey")
    private String secretKey;
    @c(a = "md5")
    private String sourceMD5;
    @c(a = "tkey")
    private String tosKey;

    static {
        Covode.recordClassIndex(64033);
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(String str) {
        this.tosKey = str;
    }
}
