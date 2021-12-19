package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public class ChallengeNotice {
    @c(a = "challenge")
    Challenge challenge;
    @c(a = "content")
    String content;
    @c(a = "schema")
    String schema;
    @c(a = "title")
    String title;

    static {
        Covode.recordClassIndex(72516);
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
