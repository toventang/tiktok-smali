package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f32608a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f32609b;

    /* renamed from: c  reason: collision with root package name */
    public final c f32610c;

    static {
        Covode.recordClassIndex(19359);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f32608a, fVar.f32608a) && l.a(this.f32609b, fVar.f32609b) && l.a(this.f32610c, fVar.f32610c);
    }

    public final int hashCode() {
        Uri uri = this.f32608a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f32609b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        c cVar = this.f32610c;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Event(originSchema=" + this.f32608a + ", uniqueSchema=" + this.f32609b + ", cacheType=" + this.f32610c + ")";
    }

    public f(Uri uri, Uri uri2, c cVar) {
        l.c(uri, "");
        l.c(uri2, "");
        l.c(cVar, "");
        this.f32608a = uri;
        this.f32609b = uri2;
        this.f32610c = cVar;
    }
}
