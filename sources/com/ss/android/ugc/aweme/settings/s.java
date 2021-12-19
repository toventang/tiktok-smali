package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class s {
    @c(a = "xss_callback_id_switch")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f123130a;
    @c(a = "xss_url_change_switch")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f123131b;

    static {
        Covode.recordClassIndex(80866);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f123130a == sVar.f123130a && this.f123131b == sVar.f123131b;
    }

    public final int hashCode() {
        boolean z = this.f123130a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f123131b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "Js2XssConfig(xssCallBackEnable=" + this.f123130a + ", xssUrlChangedEnable=" + this.f123131b + ")";
    }

    private s() {
        this.f123130a = false;
        this.f123131b = false;
    }

    public /* synthetic */ s(byte b2) {
        this();
    }
}
