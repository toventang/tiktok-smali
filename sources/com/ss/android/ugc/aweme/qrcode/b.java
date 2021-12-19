package com.ss.android.ugc.aweme.qrcode;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f119710a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119711b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f119712c;

    static {
        Covode.recordClassIndex(77766);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f119710a, bVar.f119710a) && l.a(this.f119711b, bVar.f119711b) && this.f119712c == bVar.f119712c;
    }

    public final int hashCode() {
        Uri uri = this.f119710a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f119711b;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f119712c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "ImageWrapperVo(uri=" + this.f119710a + ", path=" + this.f119711b + ", isLocalCache=" + this.f119712c + ")";
    }

    public b(Uri uri, String str, boolean z) {
        this.f119710a = uri;
        this.f119711b = str;
        this.f119712c = z;
    }
}
