package com.ss.android.ugc.aweme.profile.widgets.relations;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f118091a;

    /* renamed from: b  reason: collision with root package name */
    public final int f118092b;

    /* renamed from: c  reason: collision with root package name */
    public final long f118093c;

    static {
        Covode.recordClassIndex(76676);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f118091a == aVar.f118091a && this.f118092b == aVar.f118092b && this.f118093c == aVar.f118093c;
    }

    public final int hashCode() {
        long j2 = this.f118093c;
        return (((this.f118091a * 31) + this.f118092b) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ProfileRelationState(followerCount=" + this.f118091a + ", followingCount=" + this.f118092b + ", digCount=" + this.f118093c + ")";
    }

    public /* synthetic */ a() {
        this(0, 0, 0);
    }

    public a(int i2, int i3, long j2) {
        this.f118091a = i2;
        this.f118092b = i3;
        this.f118093c = j2;
    }
}
