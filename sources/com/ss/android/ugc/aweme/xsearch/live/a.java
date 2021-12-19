package com.ss.android.ugc.aweme.xsearch.live;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f145239a;

    /* renamed from: b  reason: collision with root package name */
    public final int f145240b;

    static {
        Covode.recordClassIndex(94969);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f145239a == aVar.f145239a && this.f145240b == aVar.f145240b;
    }

    public final int hashCode() {
        return (this.f145239a * 31) + this.f145240b;
    }

    public final String toString() {
        return "AwemeIndex(rank=" + this.f145239a + ", index=" + this.f145240b + ")";
    }

    private /* synthetic */ a() {
        this(-1, 0);
    }

    public a(int i2, int i3) {
        this.f145239a = i2;
        this.f145240b = i3;
    }
}
