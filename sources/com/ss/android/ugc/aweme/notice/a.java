package com.ss.android.ugc.aweme.notice;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f112643a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f112644b;

    static {
        Covode.recordClassIndex(72388);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f112643a == aVar.f112643a && this.f112644b == aVar.f112644b;
    }

    public final int hashCode() {
        boolean z = this.f112643a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f112644b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "Setting(onlyShowDot=" + this.f112643a + ", shouldTurnToDot=" + this.f112644b + ")";
    }

    private a() {
        this.f112643a = false;
        this.f112644b = false;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
