package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "category_key")
    private String category;
    @com.google.gson.a.c(a = "info")
    private String info;

    static {
        Covode.recordClassIndex(71038);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.category;
        }
        if ((i2 & 2) != 0) {
            str2 = cVar.info;
        }
        return cVar.copy(str, str2);
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return this.info;
    }

    public final c copy(String str, String str2) {
        return new c(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.category, cVar.category) && l.a(this.info, cVar.info);
    }

    public final int hashCode() {
        String str = this.category;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.info;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileNaviFeatureDataModel(category=" + this.category + ", info=" + this.info + ")";
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getInfo() {
        return this.info;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public c(String str, String str2) {
        this.category = str;
        this.info = str2;
    }
}
