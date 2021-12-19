package com.bytedance.ies.powerpreload.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f34498a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34499b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34500c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34501d;

    static {
        Covode.recordClassIndex(20635);
    }

    public i() {
        this(0, null, false, 7);
    }

    public final String toString() {
        return "PreloadStrategy(maxAgeMilliseconds=" + this.f34499b + ", baseUrl=" + this.f34500c + ", useOnlyOnce=" + this.f34501d + ")";
    }

    public final int hashCode() {
        return this.f34498a;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new w("null cannot be cast to non-null type");
        } else if (this.f34498a != ((i) obj).f34498a) {
            return false;
        } else {
            return true;
        }
    }

    public i(int i2, String str, boolean z) {
        this.f34499b = i2;
        this.f34500c = str;
        this.f34501d = z;
        this.f34498a = 3000;
        this.f34498a = i2 > 300000 ? 300000 : i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, String str, boolean z, int i3) {
        this((i3 & 1) != 0 ? 3000 : i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? true : z);
    }
}
