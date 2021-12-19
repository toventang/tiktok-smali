package com.ss.android.ugc.aweme.geofencing.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "string_code")
    private final String code;
    private boolean selected;
    @c(a = "translation")
    private final String translation;

    static {
        Covode.recordClassIndex(62980);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.code;
        }
        if ((i2 & 2) != 0) {
            str2 = aVar.translation;
        }
        if ((i2 & 4) != 0) {
            z = aVar.selected;
        }
        return aVar.copy(str, str2, z);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.translation;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final a copy(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        return new a(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.code, aVar.code) && l.a(this.translation, aVar.translation) && this.selected == aVar.selected;
    }

    public final int hashCode() {
        String str = this.code;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.translation;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TranslatedRegion(code=" + this.code + ", translation=" + this.translation + ", selected=" + this.selected + ")";
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTranslation() {
        return this.translation;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public a(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        this.code = str;
        this.translation = str2;
        this.selected = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, boolean z, int i2, g gVar) {
        this(str, str2, (i2 & 4) != 0 ? false : z);
    }
}
