package com.ss.android.ugc.aweme.fe.method.upload.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class I18nUploadAuthConfig extends BaseResponse {
    @c(a = "video_config")
    private UploadConfig config;

    static {
        Covode.recordClassIndex(57501);
    }

    public final UploadConfig getConfig() {
        return this.config;
    }

    public final UploadConfig getUploadConfig() {
        return this.config;
    }

    public final void setConfig(UploadConfig uploadConfig) {
        this.config = uploadConfig;
    }
}
