package com.ss.android.ugc.aweme.fe.method.upload.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.api.b;
import h.f.b.l;

public final class UploadAuthConfig extends a {
    @b
    @c(a = "code")
    private int code;
    @c(a = "data")
    private UploadConfig config;
    @b
    @c(a = "message")
    private String message = "";

    static {
        Covode.recordClassIndex(57502);
    }

    public final int getCode() {
        return this.code;
    }

    public final UploadConfig getConfig() {
        return this.config;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UploadConfig getUploadConfig() {
        return this.config;
    }

    public final void setCode(int i2) {
        this.code = i2;
    }

    public final void setConfig(UploadConfig uploadConfig) {
        this.config = uploadConfig;
    }

    public final void setMessage(String str) {
        l.d(str, "");
        this.message = str;
    }
}
