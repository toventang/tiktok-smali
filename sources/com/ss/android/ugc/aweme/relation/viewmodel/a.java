package com.ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f120568a;

    /* renamed from: b  reason: collision with root package name */
    public final int f120569b;

    static {
        Covode.recordClassIndex(78505);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f120568a == aVar.f120568a && this.f120569b == aVar.f120569b;
    }

    public final int hashCode() {
        boolean z = this.f120568a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f120569b;
    }

    public final String toString() {
        return "DoubleCursor(isFirst=" + this.f120568a + ", cursor=" + this.f120569b + ")";
    }

    public a(boolean z, int i2) {
        this.f120568a = z;
        this.f120569b = i2;
    }
}
