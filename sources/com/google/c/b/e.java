package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.a.h;
import com.google.c.a.k;
import java.util.Arrays;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f53731a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f53732b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final long f53733c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final long f53734d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final long f53735e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final long f53736f = 0;

    static {
        Covode.recordClassIndex(33277);
    }

    public e() {
        k.a(true);
        k.a(true);
        k.a(true);
        k.a(true);
        k.a(true);
        k.a(true);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53731a), Long.valueOf(this.f53732b), Long.valueOf(this.f53733c), Long.valueOf(this.f53734d), Long.valueOf(this.f53735e), Long.valueOf(this.f53736f)});
    }

    public final String toString() {
        return h.a(this).a("hitCount", this.f53731a).a("missCount", this.f53732b).a("loadSuccessCount", this.f53733c).a("loadExceptionCount", this.f53734d).a("totalLoadTime", this.f53735e).a("evictionCount", this.f53736f).toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f53731a == eVar.f53731a && this.f53732b == eVar.f53732b && this.f53733c == eVar.f53733c && this.f53734d == eVar.f53734d && this.f53735e == eVar.f53735e && this.f53736f == eVar.f53736f) {
                return true;
            }
            return false;
        }
        return false;
    }
}
