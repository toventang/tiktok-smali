package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class MusicAvatar implements Serializable {
    @c(a = "hd")
    public UrlModel hd;
    @c(a = "large")
    public UrlModel large;
    @c(a = "medium")
    public UrlModel medium;
    @c(a = "thumb")
    public UrlModel thumb;
    @c(a = "thumbnail")
    public UrlModel thumbnail;

    static {
        Covode.recordClassIndex(71664);
    }

    public final UrlModel getHd() {
        return this.hd;
    }

    public final UrlModel getLarge() {
        return this.large;
    }

    public final UrlModel getMedium() {
        return this.medium;
    }

    public final UrlModel getThumb() {
        return this.thumb;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }
}
