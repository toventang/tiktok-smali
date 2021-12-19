package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ChallengeAnnouncement implements Serializable {
    @c(a = "body")
    public String content;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(50878);
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
