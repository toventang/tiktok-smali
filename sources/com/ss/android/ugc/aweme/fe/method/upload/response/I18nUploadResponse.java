package com.ss.android.ugc.aweme.fe.method.upload.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public final class I18nUploadResponse extends BaseResponse {
    @c(a = "cover")
    private UrlModel cover;
    @c(a = "video")
    private UrlModel video;

    static {
        Covode.recordClassIndex(57535);
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final UrlModel getVideo() {
        return this.video;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }
}
