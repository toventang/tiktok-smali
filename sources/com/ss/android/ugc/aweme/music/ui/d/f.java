package com.ss.android.ugc.aweme.music.ui.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f111957a;

    /* renamed from: b  reason: collision with root package name */
    public final long f111958b;

    /* renamed from: c  reason: collision with root package name */
    public final int f111959c;

    static {
        Covode.recordClassIndex(71960);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f111957a, fVar.f111957a) && this.f111958b == fVar.f111958b && this.f111959c == fVar.f111959c;
    }

    public final String toString() {
        return "MusicListRequestParams(musicId=" + this.f111957a + ", cursor=" + this.f111958b + ", count=" + this.f111959c + ")";
    }

    private /* synthetic */ f() {
        this(null, 0, 20);
    }

    public final int hashCode() {
        int i2;
        String str = this.f111957a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f111958b;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f111959c;
    }

    public f(String str, long j2, int i2) {
        this.f111957a = str;
        this.f111958b = j2;
        this.f111959c = i2;
    }
}
