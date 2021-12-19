package com.bytedance.android.live.liveinteract.cohost.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "method")

    /* renamed from: a  reason: collision with root package name */
    public String f10212a;
    @c(a = "channel_id")

    /* renamed from: b  reason: collision with root package name */
    public long f10213b;
    @c(a = "params")

    /* renamed from: c  reason: collision with root package name */
    public String f10214c;

    static {
        Covode.recordClassIndex(5372);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f10212a, bVar.f10212a) && this.f10213b == bVar.f10213b && l.a(this.f10214c, bVar.f10214c);
    }

    public final String toString() {
        return "RtcMessage(method=" + this.f10212a + ", channelId=" + this.f10213b + ", content=" + this.f10214c + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f10212a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f10213b;
        int i4 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f10214c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public b(String str, long j2, String str2) {
        l.d(str, "");
        this.f10212a = str;
        this.f10213b = j2;
        this.f10214c = str2;
    }
}
