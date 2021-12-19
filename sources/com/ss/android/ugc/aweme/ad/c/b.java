package com.ss.android.ugc.aweme.ad.c;

import com.bytedance.covode.number.Covode;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f65589a;

    static {
        Covode.recordClassIndex(40359);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f65589a == ((b) obj).f65589a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f65589a;
    }

    public final String toString() {
        return "AdWebViewFragmentBackEvent(webViewHash=" + this.f65589a + ")";
    }

    public b(int i2) {
        this.f65589a = i2;
    }
}
