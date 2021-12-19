package com.ss.android.ugc.aweme.xsearch.video;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f145254a;

    /* renamed from: b  reason: collision with root package name */
    public final int f145255b;

    static {
        Covode.recordClassIndex(94982);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f145254a == aVar.f145254a && this.f145255b == aVar.f145255b;
    }

    public final int hashCode() {
        return (this.f145254a * 31) + this.f145255b;
    }

    public final String toString() {
        return "AwemeIndex(rank=" + this.f145254a + ", index=" + this.f145255b + ")";
    }

    private /* synthetic */ a() {
        this(-1, 0);
    }

    public a(int i2, int i3) {
        this.f145254a = i2;
        this.f145255b = i3;
    }
}
