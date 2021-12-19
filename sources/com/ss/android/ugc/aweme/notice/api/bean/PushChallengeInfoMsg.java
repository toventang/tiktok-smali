package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class PushChallengeInfoMsg extends b {
    @c(a = "extra_str")
    private String extra;
    @c(a = "text")
    private String text;
    @c(a = "title")
    private String title;
    @c(a = "open_url")
    private String url;

    static {
        Covode.recordClassIndex(72414);
    }

    public static /* synthetic */ PushChallengeInfoMsg copy$default(PushChallengeInfoMsg pushChallengeInfoMsg, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pushChallengeInfoMsg.url;
        }
        if ((i2 & 2) != 0) {
            str2 = pushChallengeInfoMsg.title;
        }
        if ((i2 & 4) != 0) {
            str3 = pushChallengeInfoMsg.text;
        }
        if ((i2 & 8) != 0) {
            str4 = pushChallengeInfoMsg.extra;
        }
        return pushChallengeInfoMsg.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.extra;
    }

    public final PushChallengeInfoMsg copy(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new PushChallengeInfoMsg(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushChallengeInfoMsg)) {
            return false;
        }
        PushChallengeInfoMsg pushChallengeInfoMsg = (PushChallengeInfoMsg) obj;
        return l.a(this.url, pushChallengeInfoMsg.url) && l.a(this.title, pushChallengeInfoMsg.title) && l.a(this.text, pushChallengeInfoMsg.text) && l.a(this.extra, pushChallengeInfoMsg.extra);
    }

    public final int hashCode() {
        String str = this.url;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.extra;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PushChallengeInfoMsg(url=" + this.url + ", title=" + this.title + ", text=" + this.text + ", extra=" + this.extra + ")";
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.bean.b
    public final f getType() {
        return f.SYSTEM;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setExtra(String str) {
        l.d(str, "");
        this.extra = str;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }

    public final void setUrl(String str) {
        l.d(str, "");
        this.url = str;
    }

    public PushChallengeInfoMsg(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.url = str;
        this.title = str2;
        this.text = str3;
        this.extra = str4;
    }
}
