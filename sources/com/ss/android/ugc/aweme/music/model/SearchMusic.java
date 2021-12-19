package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

public class SearchMusic implements Serializable {
    @c(a = "card_type")
    private int cardType = 1;
    @c(a = "has_more")
    private boolean hasMore;
    private LogPbBean logPb;
    @c(a = "dynamic_patch")
    private d mDynamicPatch;
    @c(a = "music")
    private Music music;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(71686);
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final d getMDynamicPatch() {
        return this.mDynamicPatch;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final int getType() {
        return this.type;
    }

    public MusicModel convertToMusicModel() {
        if (this.type != 999 || this.mDynamicPatch == null) {
            Music music2 = this.music;
            if (music2 != null) {
                return music2.convertToMusicModel();
            }
            return new MusicModel();
        }
        DynamicMusicModel dynamicMusicModel = new DynamicMusicModel();
        dynamicMusicModel.setDynamicPatch(this.mDynamicPatch);
        return dynamicMusicModel;
    }

    public final void setCardType(int i2) {
        this.cardType = i2;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMDynamicPatch(d dVar) {
        this.mDynamicPatch = dVar;
    }

    public final void setMusic(Music music2) {
        this.music = music2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setRequestId(String str) {
        Music music2 = this.music;
        if (music2 != null) {
            music2.requestId = str;
        }
    }
}
