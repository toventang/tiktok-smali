package com.ss.android.ugc.aweme.music.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class MatchedPGCSoundInfo implements Serializable {
    @c(a = "author")
    public String author;
    @c(a = "id")
    public String id;
    @c(a = "mixed_author")
    public String mixedAuthor;
    @c(a = "mixed_title")
    public String mixedTitle;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(71661);
    }

    public String getAuthor() {
        return this.author;
    }

    public String getId() {
        return this.id;
    }

    public String getMixedAuthor() {
        return this.mixedAuthor;
    }

    public String getMixedTitle() {
        return this.mixedTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getShowInfo() {
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.author)) {
            return "";
        }
        if (TextUtils.isEmpty(this.title)) {
            return this.author;
        }
        if (TextUtils.isEmpty(this.author)) {
            return this.title;
        }
        return this.title + " - " + this.author;
    }
}
