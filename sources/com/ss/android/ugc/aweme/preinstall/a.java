package com.ss.android.ugc.aweme.preinstall;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f115713a;

    static {
        Covode.recordClassIndex(74658);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f115713a, ((a) obj).f115713a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f115713a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PreInstallParams(transsonicCode=" + this.f115713a + ")";
    }
}
