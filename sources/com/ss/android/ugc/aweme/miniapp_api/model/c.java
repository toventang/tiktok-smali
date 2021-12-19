package com.ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "image_url")
    public String imageUrl;
    @com.google.gson.a.c(a = "text")
    public String text;
    @com.google.gson.a.c(a = "wait_time")
    public int waitTime;

    static {
        Covode.recordClassIndex(70222);
    }

    public c() {
    }

    public static int com_ss_android_ugc_aweme_miniapp_api_model_MiniAppCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cVar.imageUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = cVar.text;
        }
        if ((i3 & 4) != 0) {
            i2 = cVar.waitTime;
        }
        return cVar.copy(str, str2, i2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.waitTime;
    }

    public final c copy(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        return new c(str, str2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.imageUrl, cVar.imageUrl) && l.a(this.text, cVar.text) && this.waitTime == cVar.waitTime;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_miniapp_api_model_MiniAppCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.waitTime);
    }

    public final String toString() {
        return "MiniAppCard(imageUrl=" + this.imageUrl + ", text=" + this.text + ", waitTime=" + this.waitTime + ")";
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final void setWaitTime(int i2) {
        this.waitTime = i2;
    }

    public final void setImageUrl(String str) {
        l.d(str, "");
        this.imageUrl = str;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }

    public c(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i2;
    }
}
