package com.bytedance.ies.bullet.c.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f32072a;

    /* renamed from: b  reason: collision with root package name */
    public final b f32073b;

    static {
        Covode.recordClassIndex(18799);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.f32072a, wVar.f32072a) && l.a(this.f32073b, wVar.f32073b);
    }

    public final int hashCode() {
        Uri uri = this.f32072a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        b bVar = this.f32073b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "KitProcessUnit(uri=" + this.f32072a + ", providerFactory=" + this.f32073b + ")";
    }

    public w(Uri uri, b bVar) {
        l.c(uri, "");
        l.c(bVar, "");
        this.f32072a = uri;
        this.f32073b = bVar;
    }
}
