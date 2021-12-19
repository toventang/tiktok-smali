package com.ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class SimpleEffect implements Serializable {
    private String defaultColor;
    private final String id;
    private boolean isItalic;
    private final String name;
    private final String path;
    private final String resId;

    static {
        Covode.recordClassIndex(68550);
    }

    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, String str, String str2, String str3, String str4, boolean z, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = simpleEffect.id;
        }
        if ((i2 & 2) != 0) {
            str2 = simpleEffect.resId;
        }
        if ((i2 & 4) != 0) {
            str3 = simpleEffect.name;
        }
        if ((i2 & 8) != 0) {
            str4 = simpleEffect.path;
        }
        if ((i2 & 16) != 0) {
            z = simpleEffect.isItalic;
        }
        if ((i2 & 32) != 0) {
            str5 = simpleEffect.defaultColor;
        }
        return simpleEffect.copy(str, str2, str3, str4, z, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.resId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.path;
    }

    public final boolean component5() {
        return this.isItalic;
    }

    public final String component6() {
        return this.defaultColor;
    }

    public final SimpleEffect copy(String str, String str2, String str3, String str4, boolean z, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str4, "");
        return new SimpleEffect(str, str2, str3, str4, z, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEffect)) {
            return false;
        }
        SimpleEffect simpleEffect = (SimpleEffect) obj;
        return l.a(this.id, simpleEffect.id) && l.a(this.resId, simpleEffect.resId) && l.a(this.name, simpleEffect.name) && l.a(this.path, simpleEffect.path) && this.isItalic == simpleEffect.isItalic && l.a(this.defaultColor, simpleEffect.defaultColor);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.path;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isItalic;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        String str5 = this.defaultColor;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "SimpleEffect(id=" + this.id + ", resId=" + this.resId + ", name=" + this.name + ", path=" + this.path + ", isItalic=" + this.isItalic + ", defaultColor=" + this.defaultColor + ")";
    }

    public final String getDefaultColor() {
        return this.defaultColor;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final boolean isItalic() {
        return this.isItalic;
    }

    public final void setDefaultColor(String str) {
        this.defaultColor = str;
    }

    public final void setItalic(boolean z) {
        this.isItalic = z;
    }

    public SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str4, "");
        this.id = str;
        this.resId = str2;
        this.name = str3;
        this.path = str4;
        this.isItalic = z;
        this.defaultColor = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5, int i2, g gVar) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : str5);
    }
}
