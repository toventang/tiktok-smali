package com.ss.android.ugc.aweme.notice;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f112776a;

    /* renamed from: b  reason: collision with root package name */
    public int f112777b;

    static {
        Covode.recordClassIndex(72494);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f112776a == bVar.f112776a && this.f112777b == bVar.f112777b;
    }

    public final int hashCode() {
        boolean z = this.f112776a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f112777b;
    }

    public final String toString() {
        return "State(redDot=" + this.f112776a + ", count=" + this.f112777b + ")";
    }

    private b() {
        this.f112776a = false;
        this.f112777b = 0;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
