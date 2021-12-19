package com.ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class o implements Serializable {
    @c(a = "digg_count")
    public int diggCount;
    @c(a = "music_count")
    public int musicCount;
    @c(a = "music_cover_url")
    public UrlModel musicCoverUrl;
    @c(a = "music_qrcode_url")
    public UrlModel musicQrcodeUrl;
    @c(a = "music_used_count")
    public int musicUseCount;

    static {
        Covode.recordClassIndex(71690);
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getMusicCount() {
        return this.musicCount;
    }

    public UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public int getMusicUseCount() {
        return this.musicUseCount;
    }

    public void setDiggCount(int i2) {
        this.diggCount = i2;
    }

    public void setMusicCount(int i2) {
        this.musicCount = i2;
    }

    public void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public void setMusicUseCount(int i2) {
        this.musicUseCount = i2;
    }
}
