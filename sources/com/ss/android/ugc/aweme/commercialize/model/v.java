package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class v implements Serializable {
    @c(a = "id")
    private String id;
    @c(a = "text")
    private String text;
    @c(a = StringSet.type)
    private int type;
    @c(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(46191);
    }

    public v() {
        this(null, null, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_DisclaimerText_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ v copy$default(v vVar, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = vVar.text;
        }
        if ((i3 & 2) != 0) {
            str2 = vVar.url;
        }
        if ((i3 & 4) != 0) {
            str3 = vVar.id;
        }
        if ((i3 & 8) != 0) {
            i2 = vVar.type;
        }
        return vVar.copy(str, str2, str3, i2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.id;
    }

    public final int component4() {
        return this.type;
    }

    public final v copy(String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new v(str, str2, str3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.text, vVar.text) && l.a(this.url, vVar.url) && l.a(this.id, vVar.id) && this.type == vVar.type;
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.id;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_commercialize_model_DisclaimerText_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type);
    }

    public final String toString() {
        return "DisclaimerText(text=" + this.text + ", url=" + this.url + ", id=" + this.id + ", type=" + this.type + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setId(String str) {
        l.d(str, "");
        this.id = str;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }

    public final void setUrl(String str) {
        l.d(str, "");
        this.url = str;
    }

    public v(String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.text = str;
        this.url = str2;
        this.id = str3;
        this.type = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(String str, String str2, String str3, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? -1 : i2);
    }
}
