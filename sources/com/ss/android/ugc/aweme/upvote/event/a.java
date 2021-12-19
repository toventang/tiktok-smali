package com.ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f142218a;

    /* renamed from: b  reason: collision with root package name */
    public final int f142219b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f142220c;

    static {
        Covode.recordClassIndex(92978);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f142218a == aVar.f142218a && this.f142219b == aVar.f142219b && this.f142220c == aVar.f142220c;
    }

    public final int hashCode() {
        boolean z = this.f142218a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = ((i3 * 31) + this.f142219b) * 31;
        if (!this.f142220c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "UpvoteCommonMobParam(isRecommend=" + this.f142218a + ", recommendCount=" + this.f142219b + ", isSelf=" + this.f142220c + ")";
    }

    public /* synthetic */ a() {
        this(false, 0, false);
    }

    public a(boolean z, int i2, boolean z2) {
        this.f142218a = z;
        this.f142219b = i2;
        this.f142220c = z2;
    }
}
