package com.ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ShortenModel {
    private String data;
    private String message;
    private String reason;
    @c(a = "shorten_url")
    private String shortenUrl;

    static {
        Covode.recordClassIndex(81507);
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public String getShortenUrl() {
        return this.shortenUrl;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
