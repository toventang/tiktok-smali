package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class fb {
    @c(a = "ve_synthesis_settings_key")

    /* renamed from: a  reason: collision with root package name */
    public final String f118535a;
    @c(a = "high_quality_ve_synthesis_settings_key")

    /* renamed from: b  reason: collision with root package name */
    public final String f118536b;

    static {
        Covode.recordClassIndex(76986);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return l.a(this.f118535a, fbVar.f118535a) && l.a(this.f118536b, fbVar.f118536b);
    }

    public final int hashCode() {
        String str = this.f118535a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f118536b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VESettingConfigs(veSynthesisSettingsKey=" + this.f118535a + ", highQualityVeSynthesisSettingsKey=" + this.f118536b + ")";
    }

    private /* synthetic */ fb() {
        this("", "");
    }

    private fb(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f118535a = str;
        this.f118536b = str2;
    }
}
