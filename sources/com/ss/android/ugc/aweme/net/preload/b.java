package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.net.URI;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f112505a;

    /* renamed from: b  reason: collision with root package name */
    public String f112506b;

    static {
        Covode.recordClassIndex(72306);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f112505a, bVar.f112505a) && l.a(this.f112506b, bVar.f112506b);
    }

    public final int hashCode() {
        String str = this.f112505a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112506b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PreloadKey(url=" + this.f112505a + ", key=" + this.f112506b + ")";
    }

    private b(String str) {
        l.d(str, "");
        this.f112505a = str;
        this.f112506b = null;
        try {
            URI uri = new URI(str);
            this.f112506b = String.valueOf((uri.getScheme() + uri.getPath() + uri.getQuery()).hashCode());
        } catch (Exception e2) {
            e2.getMessage();
            this.f112506b = "error";
        }
        if (this.f112506b == null) {
            this.f112506b = "error";
        }
    }

    public /* synthetic */ b(String str, byte b2) {
        this(str);
    }
}
