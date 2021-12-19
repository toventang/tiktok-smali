package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class MusicTag implements Serializable {
    @c(a = "tag_color")
    private String tagColor;
    @c(a = "tag_title")
    private String tagTitle;
    @c(a = "tag_title_color")
    private String tagTitleColor;

    static {
        Covode.recordClassIndex(71681);
    }

    public final String getTagColor() {
        return this.tagColor;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTagTitleColor() {
        return this.tagTitleColor;
    }

    public final void setTagColor(String str) {
        this.tagColor = str;
    }

    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    public final void setTagTitleColor(String str) {
        this.tagTitleColor = str;
    }
}
