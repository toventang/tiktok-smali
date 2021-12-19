package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class k {
    @c(a = "duration")

    /* renamed from: a  reason: collision with root package name */
    public long f23091a;
    @c(a = "prompt")

    /* renamed from: b  reason: collision with root package name */
    public f f23092b;

    static {
        Covode.recordClassIndex(13678);
    }

    public k(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f23091a == kVar.f23091a && l.a(this.f23092b, kVar.f23092b);
    }

    public final String toString() {
        return "PreviewPeriod(duration=" + this.f23091a + ", promote=" + this.f23092b + ")";
    }

    private k() {
        this.f23091a = 0;
        this.f23092b = null;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f23091a;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        f fVar = this.f23092b;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    private /* synthetic */ k(byte b2) {
        this();
    }
}
