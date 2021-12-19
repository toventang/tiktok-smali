package com.ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "attachable")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f118610a;
    @c(a = "toast_content")

    /* renamed from: b  reason: collision with root package name */
    public final String f118611b;
    @c(a = "is_long_url")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f118612c;

    static {
        Covode.recordClassIndex(77030);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f118610a == aVar.f118610a && l.a(this.f118611b, aVar.f118611b) && this.f118612c == aVar.f118612c;
    }

    public final int hashCode() {
        boolean z = this.f118610a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        String str = this.f118611b;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f118612c) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ValidInfo(attachable=" + this.f118610a + ", toastContent=" + this.f118611b + ", isLongUrl=" + this.f118612c + ")";
    }
}
