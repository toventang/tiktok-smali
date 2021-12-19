package com.ss.android.ugc.aweme.im.service.k;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Objects;

public abstract class a implements Comparable<a> {

    /* renamed from: j  reason: collision with root package name */
    public long f103868j = -1;

    /* renamed from: k  reason: collision with root package name */
    public String f103869k;

    /* renamed from: l  reason: collision with root package name */
    public Object f103870l;

    /* renamed from: m  reason: collision with root package name */
    public String f103871m;
    public String n;
    public long o;
    public long p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public HashMap<String, String> u;
    public boolean v;
    public b w;
    public boolean x;
    public d y;

    static {
        Covode.recordClassIndex(66546);
    }

    public abstract b b();

    public abstract String bF_();

    public abstract int c();

    public abstract void d();

    /* access modifiers changed from: protected */
    public long e() {
        return this.o;
    }

    public String f() {
        return this.f103871m;
    }

    public String g() {
        return this.n;
    }

    public a() {
        d();
        this.w = b();
    }

    public final boolean i() {
        if (c() == 0 || c() == 20) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f103869k, this.f103870l, this.f103871m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), Integer.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.x), this.y);
    }

    public final void a(long j2) {
        if (j2 < 10000000000L) {
            this.o = j2 * 1000;
        } else {
            this.o = j2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(a aVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            return -1;
        }
        int i2 = this.t;
        int i3 = aVar2.t;
        if (i2 == i3) {
            return Long.compare(e(), aVar2.e());
        }
        return i2 - i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r && this.s == aVar.s && this.x == aVar.x && Objects.equals(this.f103869k, aVar.f103869k) && Objects.equals(this.f103870l, aVar.f103870l) && Objects.equals(this.f103871m, aVar.f103871m) && Objects.equals(this.n, aVar.n) && Objects.equals(this.y, aVar.y)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
