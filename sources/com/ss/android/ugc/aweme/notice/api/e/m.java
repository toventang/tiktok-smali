package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f112731a;

    /* renamed from: b  reason: collision with root package name */
    public final int f112732b;

    static {
        Covode.recordClassIndex(72461);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f112731a == mVar.f112731a && this.f112732b == mVar.f112732b;
    }

    public final int hashCode() {
        return (this.f112731a * 31) + this.f112732b;
    }

    public final String toString() {
        return "PsmIdentifier(service=" + this.f112731a + ", method=" + this.f112732b + ")";
    }

    public m(int i2, int i3) {
        this.f112731a = i2;
        this.f112732b = i3;
    }
}
