package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "and")
    private String and = "";
    @c(a = "business")
    private int business;
    @c(a = "emoji")
    private List<String> emoji;
    @c(a = "ios")
    private String ios = "";

    static {
        Covode.recordClassIndex(56150);
    }

    public final String getAnd() {
        return this.and;
    }

    public final int getBusiness() {
        return this.business;
    }

    public final List<String> getEmoji() {
        return this.emoji;
    }

    public final String getIos() {
        return this.ios;
    }

    public final void setBusiness(int i2) {
        this.business = i2;
    }

    public final void setEmoji(List<String> list) {
        this.emoji = list;
    }

    public final void setAnd(String str) {
        l.d(str, "");
        this.and = str;
    }

    public final void setIos(String str) {
        l.d(str, "");
        this.ios = str;
    }
}
