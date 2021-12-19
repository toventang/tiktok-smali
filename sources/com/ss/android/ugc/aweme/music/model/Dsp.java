package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class Dsp implements Serializable {
    @c(a = "collect_status")
    public Integer collectStatus;
    @c(a = "default_performer_avatar")
    public MusicAvatar defaultPerformerAvatar;
    @c(a = "full_clip_author")
    public String fullClipAuthor;
    @c(a = "full_clip_id")
    public String fullClipId;
    @c(a = "full_clip_title")
    public String fullClipTitle;

    static {
        Covode.recordClassIndex(71658);
    }

    public final Integer getCollectStatus() {
        return this.collectStatus;
    }

    public final MusicAvatar getDefaultPerformerAvatar() {
        return this.defaultPerformerAvatar;
    }

    public final String getFullClipAuthor() {
        return this.fullClipAuthor;
    }

    public final String getFullClipId() {
        return this.fullClipId;
    }

    public final String getFullClipTitle() {
        return this.fullClipTitle;
    }

    public final void setCollectStatus(Integer num) {
        this.collectStatus = num;
    }
}
