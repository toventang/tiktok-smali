package com.ss.android.ugc.aweme.cn;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f71216a;

    /* renamed from: b  reason: collision with root package name */
    public final PrivacyCert f71217b;

    /* renamed from: c  reason: collision with root package name */
    public final e f71218c;

    static {
        Covode.recordClassIndex(43839);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f71216a, dVar.f71216a) && l.a(this.f71217b, dVar.f71217b) && l.a(this.f71218c, dVar.f71218c);
    }

    public final int hashCode() {
        String str = this.f71216a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PrivacyCert privacyCert = this.f71217b;
        int hashCode2 = (hashCode + (privacyCert != null ? privacyCert.hashCode() : 0)) * 31;
        e eVar = this.f71218c;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SensitiveApiActionInfo(actionName=" + this.f71216a + ", privacyCert=" + this.f71217b + ", actionParams=" + this.f71218c + ")";
    }

    private /* synthetic */ d() {
        this(null, null, null);
    }

    public d(String str, PrivacyCert privacyCert, e eVar) {
        this.f71216a = str;
        this.f71217b = privacyCert;
        this.f71218c = eVar;
    }
}
