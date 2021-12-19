package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class LongVideoTag implements Serializable {
    @c(a = "tag_bg_img")
    private String tagBgImg = "";
    @c(a = "tag_word")
    private String tagWord = "";
    @c(a = "tag_word_color")
    private String tagWordColor = "";

    static {
        Covode.recordClassIndex(50912);
    }

    public final String getTagBgImg() {
        return this.tagBgImg;
    }

    public final String getTagWord() {
        return this.tagWord;
    }

    public final String getTagWordColor() {
        return this.tagWordColor;
    }

    public final void setTagBgImg(String str) {
        l.d(str, "");
        this.tagBgImg = str;
    }

    public final void setTagWord(String str) {
        l.d(str, "");
        this.tagWord = str;
    }

    public final void setTagWordColor(String str) {
        l.d(str, "");
        this.tagWordColor = str;
    }
}
