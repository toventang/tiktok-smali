package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f32568a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f32569b;

    /* renamed from: c  reason: collision with root package name */
    public final View f32570c;

    /* renamed from: d  reason: collision with root package name */
    public final c f32571d;

    static {
        Covode.recordClassIndex(19329);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f32568a, bVar.f32568a) && l.a(this.f32569b, bVar.f32569b) && l.a(this.f32570c, bVar.f32570c) && l.a(this.f32571d, bVar.f32571d);
    }

    public final int hashCode() {
        Uri uri = this.f32568a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f32569b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        View view = this.f32570c;
        int hashCode3 = (hashCode2 + (view != null ? view.hashCode() : 0)) * 31;
        c cVar = this.f32571d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "CacheItem(originSchema=" + this.f32568a + ", uniqueSchema=" + this.f32569b + ", view=" + this.f32570c + ", cacheType=" + this.f32571d + ")";
    }

    public b(Uri uri, Uri uri2, View view, c cVar) {
        l.c(uri, "");
        l.c(uri2, "");
        l.c(view, "");
        l.c(cVar, "");
        this.f32568a = uri;
        this.f32569b = uri2;
        this.f32570c = view;
        this.f32571d = cVar;
    }
}
