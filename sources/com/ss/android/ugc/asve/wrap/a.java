package com.ss.android.ugc.asve.wrap;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f62387a;

    static {
        Covode.recordClassIndex(38335);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f62387a == ((a) obj).f62387a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62387a;
    }

    public final String toString() {
        return "AVSkeletonInfo(id=" + this.f62387a + ")";
    }

    private /* synthetic */ a() {
        this(-1);
    }

    public a(int i2) {
        this.f62387a = i2;
    }
}
