package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f149217a;

    /* renamed from: b  reason: collision with root package name */
    public final Exception f149218b;

    static {
        Covode.recordClassIndex(98278);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f149217a, oVar.f149217a) && l.a(this.f149218b, oVar.f149218b);
    }

    public final int hashCode() {
        Integer num = this.f149217a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Exception exc = this.f149218b;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SimpleDownloaderErrorInfo(errorCode=" + this.f149217a + ", errorException=" + this.f149218b + ")";
    }
}
