package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class RecommendAwemeItem implements Serializable {
    @c(a = "aweme_id")
    public String aid;
    @c(a = "cover")
    public UrlModel cover;
    @c(a = "dynamic_cover")
    public UrlModel dynamicCover;
    @c(a = "media_type")
    public String mediaType;

    static {
        Covode.recordClassIndex(75253);
    }

    public String getAid() {
        return this.aid;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }
}
