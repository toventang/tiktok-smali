package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class CategoryCoverStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @c(a = "aweme_id")
    private String awemeId;
    @c(a = "cover")
    private UrlModel cover;
    @c(a = "dynamic_cover")
    private UrlModel dynamicCover;

    static {
        Covode.recordClassIndex(50875);
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
