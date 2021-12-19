package com.bytedance.jedi.a.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.g.a.b;
import com.bytedance.jedi.a.g.a.e;
import com.bytedance.jedi.a.g.b.c;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final e f39140a = new e() {
        /* class com.bytedance.jedi.a.g.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(23993);
        }

        @Override // com.bytedance.jedi.a.g.a.e
        public final long a() {
            return 0;
        }
    };
    private static final Logger q = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    boolean f39141b = true;

    /* renamed from: c  reason: collision with root package name */
    int f39142c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f39143d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f39144e = -1;

    /* renamed from: f  reason: collision with root package name */
    long f39145f = -1;

    /* renamed from: g  reason: collision with root package name */
    h<? super K, ? super V> f39146g;

    /* renamed from: h  reason: collision with root package name */
    c.n f39147h;

    /* renamed from: i  reason: collision with root package name */
    c.n f39148i;

    /* renamed from: j  reason: collision with root package name */
    long f39149j = -1;

    /* renamed from: k  reason: collision with root package name */
    long f39150k = -1;

    /* renamed from: l  reason: collision with root package name */
    long f39151l = -1;

    /* renamed from: m  reason: collision with root package name */
    com.bytedance.jedi.a.g.a.a<Object> f39152m;
    com.bytedance.jedi.a.g.a.a<Object> n;
    f<? super K, ? super V> o;
    e p;

    public static b<Object, Object> a() {
        return new b<>();
    }

    /* access modifiers changed from: package-private */
    public final c.n b() {
        return (c.n) com.bytedance.jedi.a.g.a.b.a(this.f39147h, c.n.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final c.n c() {
        return (c.n) com.bytedance.jedi.a.g.a.b.a(this.f39148i, c.n.STRONG);
    }

    enum a implements f<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(23994);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.b$b  reason: collision with other inner class name */
    enum EnumC0949b implements h<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(23995);
        }
    }

    static {
        Covode.recordClassIndex(23992);
    }

    private b() {
    }

    public final <K1 extends K, V1 extends V> a<K1, V1> d() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f39146g == null) {
            if (this.f39145f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.jedi.a.g.a.c.b(z2, "maximumWeight requires weigher");
        } else if (this.f39141b) {
            if (this.f39145f != -1) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.jedi.a.g.a.c.b(z, "weigher requires maximumWeight");
        } else if (this.f39145f == -1) {
            q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.f39151l != -1) {
            z3 = false;
        }
        com.bytedance.jedi.a.g.a.c.b(z3, "refreshAfterWrite requires a LoadingCache");
        return new c.j(this);
    }

    public final String toString() {
        b.a aVar = new b.a(getClass().getSimpleName(), (byte) 0);
        int i2 = this.f39142c;
        if (i2 != -1) {
            aVar.a("initialCapacity", i2);
        }
        int i3 = this.f39143d;
        if (i3 != -1) {
            aVar.a("concurrencyLevel", i3);
        }
        long j2 = this.f39144e;
        if (j2 != -1) {
            aVar.a("maximumSize", j2);
        }
        long j3 = this.f39145f;
        if (j3 != -1) {
            aVar.a("maximumWeight", j3);
        }
        if (this.f39149j != -1) {
            aVar.a("expireAfterWrite", this.f39149j + "ns");
        }
        if (this.f39150k != -1) {
            aVar.a("expireAfterAccess", this.f39150k + "ns");
        }
        c.n nVar = this.f39147h;
        if (nVar != null) {
            aVar.a("keyStrength", nVar.toString());
        }
        c.n nVar2 = this.f39148i;
        if (nVar2 != null) {
            aVar.a("valueStrength", nVar2.toString());
        }
        if (this.f39152m != null) {
            aVar.a("keyEquivalence");
        }
        if (this.n != null) {
            aVar.a("valueEquivalence");
        }
        if (this.o != null) {
            aVar.a("removalListener");
        }
        return aVar.toString();
    }

    public final b<K, V> a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j3 = this.f39144e;
        boolean z4 = true;
        if (j3 == -1) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.jedi.a.g.a.c.a(z, "maximum size was already set to %s", j3);
        long j4 = this.f39145f;
        if (j4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.jedi.a.g.a.c.a(z2, "maximum weight was already set to %s", j4);
        if (this.f39146g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.bytedance.jedi.a.g.a.c.b(z3, "maximum size can not be combined with weigher");
        if (j2 < 0) {
            z4 = false;
        }
        com.bytedance.jedi.a.g.a.c.a(z4, "maximum size must not be negative");
        this.f39144e = j2;
        return this;
    }
}
