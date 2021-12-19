package com.ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f89443a;

    /* renamed from: b  reason: collision with root package name */
    public final long f89444b;

    static {
        Covode.recordClassIndex(56206);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f89443a == hVar.f89443a && this.f89444b == hVar.f89444b;
    }

    public final int hashCode() {
        boolean z = this.f89443a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f89444b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "StickerDownloadEventBody(success=" + this.f89443a + ", resourceID=" + this.f89444b + ")";
    }

    public h(boolean z, long j2) {
        super(ag.a(v.a("is_successful", Boolean.valueOf(z)), v.a("resource_id", Long.valueOf(j2))), null, null, 6);
        this.f89443a = z;
        this.f89444b = j2;
    }
}
