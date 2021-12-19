package com.ss.android.ugc.aweme.music.ui.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f111951a;

    /* renamed from: b  reason: collision with root package name */
    public final long f111952b;

    /* renamed from: c  reason: collision with root package name */
    public final int f111953c;

    static {
        Covode.recordClassIndex(71956);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f111951a, cVar.f111951a) && this.f111952b == cVar.f111952b && this.f111953c == cVar.f111953c;
    }

    public final String toString() {
        return "MusicAwemeListRequestParams(musicId=" + this.f111951a + ", cursor=" + this.f111952b + ", count=" + this.f111953c + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f111951a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f111952b;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f111953c;
    }

    public c(String str, long j2, int i2) {
        this.f111951a = str;
        this.f111952b = j2;
        this.f111953c = i2;
    }
}
