package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final long f80950a;

    /* renamed from: b  reason: collision with root package name */
    public final long f80951b;

    /* renamed from: c  reason: collision with root package name */
    public final int f80952c;

    /* renamed from: d  reason: collision with root package name */
    public final int f80953d;

    /* renamed from: e  reason: collision with root package name */
    public final long f80954e;

    static {
        Covode.recordClassIndex(50325);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f80950a == eVar.f80950a && this.f80951b == eVar.f80951b && this.f80952c == eVar.f80952c && this.f80953d == eVar.f80953d && this.f80954e == eVar.f80954e;
    }

    public final String toString() {
        return "DynamicVerticalSearchRefreshEvent(networkStart=" + this.f80950a + ", networkEnd=" + this.f80951b + ", itemCount=" + this.f80952c + ", status=" + this.f80953d + ", viewDrawStart=" + this.f80954e + ")";
    }

    public final int hashCode() {
        long j2 = this.f80950a;
        long j3 = this.f80951b;
        long j4 = this.f80954e;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f80952c) * 31) + this.f80953d) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public e(long j2, long j3, int i2, int i3, long j4) {
        this.f80950a = j2;
        this.f80951b = j3;
        this.f80952c = i2;
        this.f80953d = i3;
        this.f80954e = j4;
    }
}
