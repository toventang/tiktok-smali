package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class HotSearchInfoStruct implements Serializable {
    @c(a = "ailab_extra")
    String aiLabExtra;
    @c(a = "biz_extra")
    String bizExtra;
    @c(a = "rec_extra")
    String recExtra;
    @c(a = "sentence")
    String sentence;

    static {
        Covode.recordClassIndex(59400);
    }

    public String getAiLabExtra() {
        return this.aiLabExtra;
    }

    public String getBizExtra() {
        return this.bizExtra;
    }

    public String getRecExtra() {
        return this.recExtra;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setAiLabExtra(String str) {
        this.aiLabExtra = str;
    }

    public void setBizExtra(String str) {
        this.bizExtra = str;
    }

    public void setRecExtra(String str) {
        this.recExtra = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }
}
