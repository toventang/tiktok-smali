package com.ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final String f79544a;

    /* renamed from: b  reason: collision with root package name */
    public final String f79545b;

    static {
        Covode.recordClassIndex(49405);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.f79544a, wVar.f79544a) && l.a(this.f79545b, wVar.f79545b);
    }

    public final int hashCode() {
        String str = this.f79544a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f79545b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProcessResult(targetNodeName=" + this.f79544a + ", result=" + this.f79545b + ")";
    }

    public w(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f79544a = str;
        this.f79545b = str2;
    }
}
