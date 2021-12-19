package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class SystemNotice {
    @c(a = "aweme")
    Aweme aweme;
    @c(a = "content")
    String content;

    static {
        Covode.recordClassIndex(72542);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getContent() {
        return this.content;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
