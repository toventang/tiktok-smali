package com.facebook.imagepipeline.d;

import android.net.Uri;
import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.common.d;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f47757a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f47758b;

    /* renamed from: c  reason: collision with root package name */
    public final long f47759c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47760d;

    /* renamed from: e  reason: collision with root package name */
    private final d f47761e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.e f47762f;

    /* renamed from: g  reason: collision with root package name */
    private final b f47763g;

    /* renamed from: h  reason: collision with root package name */
    private final e f47764h;

    /* renamed from: i  reason: collision with root package name */
    private final int f47765i;

    static {
        Covode.recordClassIndex(28933);
    }

    @Override // com.facebook.c.a.e
    public final String a() {
        return this.f47760d;
    }

    @Override // com.facebook.c.a.e
    public final int hashCode() {
        return this.f47765i;
    }

    @Override // com.facebook.c.a.e
    public final String toString() {
        return a.a(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f47760d, this.f47761e, this.f47762f, this.f47763g, this.f47764h, this.f47757a, Integer.valueOf(this.f47765i)});
    }

    @Override // com.facebook.c.a.e
    public final boolean a(Uri uri) {
        return this.f47760d.contains(uri.toString());
    }

    @Override // com.facebook.c.a.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47765i != cVar.f47765i || !this.f47760d.equals(cVar.f47760d) || !h.a(this.f47761e, cVar.f47761e) || !h.a(this.f47762f, cVar.f47762f) || !h.a(this.f47763g, cVar.f47763g) || !h.a(this.f47764h, cVar.f47764h) || !h.a(this.f47757a, cVar.f47757a)) {
            return false;
        }
        return true;
    }

    public c(String str, d dVar, com.facebook.imagepipeline.common.e eVar, b bVar, e eVar2, String str2, Object obj) {
        int i2;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        this.f47760d = (String) i.a(str);
        this.f47761e = dVar;
        this.f47762f = eVar;
        this.f47763g = bVar;
        this.f47764h = eVar2;
        this.f47757a = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        int i3 = 0;
        if (dVar != null) {
            i2 = dVar.hashCode();
        } else {
            i2 = 0;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(eVar.hashCode());
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = valueOf3.hashCode();
        }
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        if (eVar2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = eVar2.hashCode();
        }
        this.f47765i = ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : i3);
        this.f47758b = obj;
        this.f47759c = RealtimeSinceBootClock.get().now();
    }
}
