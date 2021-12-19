package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class e implements Serializable {
    @c(a = "desc")
    private final String desc;
    @c(a = "extra")
    private final String extra;
    @c(a = "icon")
    private final f icon;
    @c(a = "subtitle")
    private final String subtitle;
    @c(a = "title")
    private final String title;
    @c(a = StringSet.type)
    private final int type;
    @c(a = "url")
    private final String url;

    static {
        Covode.recordClassIndex(88250);
    }

    public static int com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ e copy$default(e eVar, int i2, f fVar, String str, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = eVar.type;
        }
        if ((i3 & 2) != 0) {
            fVar = eVar.icon;
        }
        if ((i3 & 4) != 0) {
            str = eVar.title;
        }
        if ((i3 & 8) != 0) {
            str2 = eVar.subtitle;
        }
        if ((i3 & 16) != 0) {
            str3 = eVar.desc;
        }
        if ((i3 & 32) != 0) {
            str4 = eVar.url;
        }
        if ((i3 & 64) != 0) {
            str5 = eVar.extra;
        }
        return eVar.copy(i2, fVar, str, str2, str3, str4, str5);
    }

    public final int component1() {
        return this.type;
    }

    public final f component2() {
        return this.icon;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.desc;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.extra;
    }

    public final e copy(int i2, f fVar, String str, String str2, String str3, String str4, String str5) {
        return new e(i2, fVar, str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.type == eVar.type && l.a(this.icon, eVar.icon) && l.a(this.title, eVar.title) && l.a(this.subtitle, eVar.subtitle) && l.a(this.desc, eVar.desc) && l.a(this.url, eVar.url) && l.a(this.extra, eVar.extra);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        f fVar = this.icon;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.desc;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.extra;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "EffectAnchor(type=" + this.type + ", icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", desc=" + this.desc + ", url=" + this.url + ", extra=" + this.extra + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final f getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public e(int i2, f fVar, String str, String str2, String str3, String str4, String str5) {
        this.type = i2;
        this.icon = fVar;
        this.title = str;
        this.subtitle = str2;
        this.desc = str3;
        this.url = str4;
        this.extra = str5;
    }
}
