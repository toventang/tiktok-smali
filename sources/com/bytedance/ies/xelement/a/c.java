package com.bytedance.ies.xelement.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f36580a;

    /* renamed from: b  reason: collision with root package name */
    public String f36581b;

    /* renamed from: c  reason: collision with root package name */
    public d f36582c;

    /* renamed from: d  reason: collision with root package name */
    public b f36583d;

    static {
        Covode.recordClassIndex(21973);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f36580a, cVar.f36580a) && l.a(this.f36581b, cVar.f36581b) && l.a(this.f36582c, cVar.f36582c) && l.a(this.f36583d, cVar.f36583d);
    }

    public final int hashCode() {
        Uri uri = this.f36580a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f36581b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d dVar = this.f36582c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        b bVar = this.f36583d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "XResourceLoadInfo(inputUri=" + this.f36580a + ", resourcePath=" + this.f36581b + ", resourceType=" + this.f36582c + ", resourceFrom=" + this.f36583d + ")";
    }

    private c(Uri uri) {
        l.c(uri, "");
        this.f36580a = uri;
        this.f36581b = null;
        this.f36582c = null;
        this.f36583d = null;
    }

    public /* synthetic */ c(Uri uri, byte b2) {
        this(uri);
    }
}
