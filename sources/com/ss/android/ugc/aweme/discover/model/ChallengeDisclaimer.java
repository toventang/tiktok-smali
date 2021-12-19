package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.utils.gk;
import java.io.Serializable;

public class ChallengeDisclaimer implements Serializable {
    @b(a = gk.class)
    @c(a = "content")
    public String content;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(50880);
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
