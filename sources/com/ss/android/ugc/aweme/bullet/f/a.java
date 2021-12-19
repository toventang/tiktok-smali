package com.ss.android.ugc.aweme.bullet.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f69294a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f69295b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f69296c;

    static {
        Covode.recordClassIndex(42725);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f69294a == aVar.f69294a && l.a(this.f69295b, aVar.f69295b) && l.a(this.f69296c, aVar.f69296c);
    }

    public final int hashCode() {
        boolean z = this.f69294a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        byte[] bArr = this.f69295b;
        int i6 = 0;
        int hashCode = (i5 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        Throwable th = this.f69296c;
        if (th != null) {
            i6 = th.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "NetworkResult(success=" + this.f69294a + ", bytes=" + Arrays.toString(this.f69295b) + ", error=" + this.f69296c + ")";
    }

    public a(boolean z, byte[] bArr, Throwable th) {
        this.f69294a = z;
        this.f69295b = bArr;
        this.f69296c = th;
    }
}
