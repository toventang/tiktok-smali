package com.ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "effect_id")
    private final String effectId;
    @com.google.gson.a.c(a = "icon_url")
    private final String iconUrl;
    @com.google.gson.a.c(a = StringSet.name)
    private final String name;

    static {
        Covode.recordClassIndex(72098);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.effectId;
        }
        if ((i2 & 2) != 0) {
            str2 = cVar.name;
        }
        if ((i2 & 4) != 0) {
            str3 = cVar.iconUrl;
        }
        return cVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.effectId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final c copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new c(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.effectId, cVar.effectId) && l.a(this.name, cVar.name) && l.a(this.iconUrl, cVar.iconUrl);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.iconUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BirthdayEffectTemplate(effectId=" + this.effectId + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ")";
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public c(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.effectId = str;
        this.name = str2;
        this.iconUrl = str3;
    }
}
