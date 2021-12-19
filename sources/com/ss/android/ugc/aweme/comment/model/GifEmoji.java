package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public final class GifEmoji implements Serializable {
    @c(a = "id")
    private final String id = "";
    @c(a = "image_id")
    private final long imageId;
    private LogPbBean logPb;
    @c(a = "origin")
    private final UrlModel origin;
    @c(a = "stcker_type")
    private final int stickerType;
    @c(a = "thumbnail")
    private final UrlModel thumbnail;

    static {
        Covode.recordClassIndex(44312);
    }

    public final String getId() {
        return this.id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
