package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "description")
    private final String description;
    @c(a = StringSet.name)
    private final String name;

    static {
        Covode.recordClassIndex(41803);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.name;
        }
        if ((i2 & 2) != 0) {
            str2 = dVar.description;
        }
        return dVar.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.description;
    }

    public final d copy(String str, String str2) {
        return new d(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.name, dVar.name) && l.a(this.description, dVar.description);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditProfileBadgeCampaignModel(name=" + this.name + ", description=" + this.description + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public d(String str, String str2) {
        this.name = str;
        this.description = str2;
    }
}
