package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.a.d;
import com.google.c.a.h;
import com.google.c.a.k;
import com.google.c.a.q;
import com.google.c.a.r;
import com.google.c.a.t;
import com.google.c.b.a;
import com.google.c.b.g;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final q<? extends a.b> f53714a = new r.a(new a.b() {
        /* class com.google.c.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33270);
        }

        @Override // com.google.c.b.a.b
        public final void a() {
        }

        @Override // com.google.c.b.a.b
        public final void a(long j2) {
        }

        @Override // com.google.c.b.a.b
        public final void b() {
        }

        @Override // com.google.c.b.a.b
        public final void b(long j2) {
        }

        @Override // com.google.c.b.a.b
        public final void c() {
        }
    });

    /* renamed from: b  reason: collision with root package name */
    static final e f53715b = new e();

    /* renamed from: c  reason: collision with root package name */
    static final q<a.b> f53716c = new q<a.b>() {
        /* class com.google.c.b.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(33271);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* synthetic */ a.b b() {
            return new a.C1231a();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    static final t f53717d = new t() {
        /* class com.google.c.b.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(33272);
        }

        @Override // com.google.c.a.t
        public final long a() {
            return 0;
        }
    };
    private static final Logger u = Logger.getLogger(c.class.getName());

    /* renamed from: e  reason: collision with root package name */
    boolean f53718e = true;

    /* renamed from: f  reason: collision with root package name */
    int f53719f = -1;

    /* renamed from: g  reason: collision with root package name */
    int f53720g = -1;

    /* renamed from: h  reason: collision with root package name */
    long f53721h = -1;

    /* renamed from: i  reason: collision with root package name */
    long f53722i = -1;

    /* renamed from: j  reason: collision with root package name */
    p<? super K, ? super V> f53723j;

    /* renamed from: k  reason: collision with root package name */
    g.p f53724k;

    /* renamed from: l  reason: collision with root package name */
    g.p f53725l;

    /* renamed from: m  reason: collision with root package name */
    long f53726m = -1;
    long n = -1;
    long o = -1;
    d<Object> p;
    d<Object> q;
    m<? super K, ? super V> r;
    t s;
    public q<? extends a.b> t = f53714a;

    /* access modifiers changed from: package-private */
    public final g.p a() {
        return (g.p) h.a(this.f53724k, g.p.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final g.p b() {
        return (g.p) h.a(this.f53725l, g.p.STRONG);
    }

    enum a implements m<Object, Object> {
        INSTANCE;

        @Override // com.google.c.b.m
        public final void a(n<Object, Object> nVar) {
        }

        static {
            Covode.recordClassIndex(33273);
        }
    }

    enum b implements p<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(33274);
        }
    }

    static {
        Covode.recordClassIndex(33269);
    }

    public final <K1 extends K, V1 extends V> b<K1, V1> c() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f53723j == null) {
            if (this.f53722i == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            k.b(z2, "maximumWeight requires weigher");
        } else if (this.f53718e) {
            if (this.f53722i != -1) {
                z = true;
            } else {
                z = false;
            }
            k.b(z, "weigher requires maximumWeight");
        } else if (this.f53722i == -1) {
            u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.o != -1) {
            z3 = false;
        }
        k.b(z3, "refreshAfterWrite requires a LoadingCache");
        return new g.k(this);
    }

    public final String toString() {
        h.a a2 = h.a(this);
        int i2 = this.f53719f;
        if (i2 != -1) {
            a2.a("initialCapacity", i2);
        }
        int i3 = this.f53720g;
        if (i3 != -1) {
            a2.a("concurrencyLevel", i3);
        }
        long j2 = this.f53721h;
        if (j2 != -1) {
            a2.a("maximumSize", j2);
        }
        long j3 = this.f53722i;
        if (j3 != -1) {
            a2.a("maximumWeight", j3);
        }
        if (this.f53726m != -1) {
            a2.a("expireAfterWrite", this.f53726m + "ns");
        }
        if (this.n != -1) {
            a2.a("expireAfterAccess", this.n + "ns");
        }
        g.p pVar = this.f53724k;
        if (pVar != null) {
            a2.a("keyStrength", com.google.c.a.c.a(pVar.toString()));
        }
        g.p pVar2 = this.f53725l;
        if (pVar2 != null) {
            a2.a("valueStrength", com.google.c.a.c.a(pVar2.toString()));
        }
        if (this.p != null) {
            a2.a("keyEquivalence");
        }
        if (this.q != null) {
            a2.a("valueEquivalence");
        }
        if (this.r != null) {
            a2.a("removalListener");
        }
        return a2.toString();
    }

    public final c<K, V> a(g.p pVar) {
        boolean z;
        g.p pVar2 = this.f53725l;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        k.b(z, "Value strength was already set to %s", pVar2);
        this.f53725l = (g.p) k.a(pVar);
        return this;
    }

    public final c<K, V> a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j3 = this.f53721h;
        boolean z4 = true;
        if (j3 == -1) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "maximum size was already set to %s", j3);
        long j4 = this.f53722i;
        if (j4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        k.a(z2, "maximum weight was already set to %s", j4);
        if (this.f53723j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        k.b(z3, "maximum size can not be combined with weigher");
        if (j2 < 0) {
            z4 = false;
        }
        k.a(z4, "maximum size must not be negative");
        this.f53721h = j2;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.b.c<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <K1 extends K, V1 extends V> c<K1, V1> a(m<? super K1, ? super V1> mVar) {
        boolean z;
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        k.b(z);
        this.r = (m) k.a(mVar);
        return this;
    }
}
