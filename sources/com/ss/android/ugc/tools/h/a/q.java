package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f149219a;

    /* renamed from: b  reason: collision with root package name */
    public final String f149220b;

    static {
        Covode.recordClassIndex(98280);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f149219a, qVar.f149219a) && l.a(this.f149220b, qVar.f149220b);
    }

    public final int hashCode() {
        String str = this.f149219a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149220b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SimpleDownloaderKey(url=" + this.f149219a + ", destFilePath=" + this.f149220b + ")";
    }

    public q(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f149219a = str;
        this.f149220b = str2;
    }
}
