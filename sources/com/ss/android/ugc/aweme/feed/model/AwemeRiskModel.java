package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class AwemeRiskModel implements Serializable {
    @c(a = "content")
    public String content;
    @c(a = "notice")
    public boolean notice;
    @c(a = "risk_sink")
    public boolean riskSink;
    @c(a = StringSet.type)
    public int type;
    @c(a = "url")
    public String url;
    @c(a = "warn")
    public boolean warn;

    static {
        Covode.recordClassIndex(59328);
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isNotice() {
        return this.notice;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public String getContent() {
        if (TextUtils.isEmpty(this.content)) {
            return "";
        }
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setNotice(boolean z) {
        this.notice = z;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
