package com.ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f133687a;

    /* renamed from: b  reason: collision with root package name */
    public long f133688b;

    /* renamed from: c  reason: collision with root package name */
    public long f133689c;

    /* renamed from: d  reason: collision with root package name */
    public long f133690d;

    /* renamed from: e  reason: collision with root package name */
    public long f133691e;

    /* renamed from: f  reason: collision with root package name */
    public long f133692f;

    /* renamed from: g  reason: collision with root package name */
    public long f133693g;

    /* renamed from: h  reason: collision with root package name */
    public long f133694h;

    /* renamed from: i  reason: collision with root package name */
    public long f133695i;

    /* renamed from: j  reason: collision with root package name */
    public long f133696j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f133697k;

    /* renamed from: l  reason: collision with root package name */
    public int f133698l;

    /* renamed from: m  reason: collision with root package name */
    public int f133699m;
    public Throwable n;
    public Throwable o;

    static {
        Covode.recordClassIndex(87460);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f133687a == aVar.f133687a && this.f133688b == aVar.f133688b && this.f133689c == aVar.f133689c && this.f133690d == aVar.f133690d && this.f133691e == aVar.f133691e && this.f133692f == aVar.f133692f && this.f133693g == aVar.f133693g && this.f133694h == aVar.f133694h && this.f133695i == aVar.f133695i && this.f133696j == aVar.f133696j && this.f133697k == aVar.f133697k && this.f133698l == aVar.f133698l && this.f133699m == aVar.f133699m && l.a(this.n, aVar.n) && l.a(this.o, aVar.o);
    }

    public final String toString() {
        return "CollectParams(scene=" + this.f133687a + ", beginTs=" + this.f133688b + ", readDBTs=" + this.f133689c + ", filterTs=" + this.f133690d + ", preHashTs=" + this.f133691e + ", hashTs=" + this.f133692f + ", serializeTs=" + this.f133693g + ", respTs=" + this.f133694h + ", constructTs=" + this.f133695i + ", endTs=" + this.f133696j + ", isNewImpl=" + this.f133697k + ", errorCount=" + this.f133698l + ", contactCount=" + this.f133699m + ", readDBError=" + this.n + ", networkError=" + this.o + ")";
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f133688b;
        long j3 = this.f133689c;
        long j4 = this.f133690d;
        long j5 = this.f133691e;
        long j6 = this.f133692f;
        long j7 = this.f133693g;
        long j8 = this.f133694h;
        long j9 = this.f133695i;
        long j10 = this.f133696j;
        int i3 = ((((((((((((((((((this.f133687a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z = this.f133697k;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (((((i3 + i4) * 31) + this.f133698l) * 31) + this.f133699m) * 31;
        Throwable th = this.n;
        int i8 = 0;
        if (th != null) {
            i2 = th.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i7 + i2) * 31;
        Throwable th2 = this.o;
        if (th2 != null) {
            i8 = th2.hashCode();
        }
        return i9 + i8;
    }

    private a(int i2) {
        this.f133687a = i2;
        this.f133688b = -1;
        this.f133689c = -1;
        this.f133690d = -1;
        this.f133691e = -1;
        this.f133692f = -1;
        this.f133693g = -1;
        this.f133694h = -1;
        this.f133695i = -1;
        this.f133696j = -1;
        this.f133697k = false;
        this.f133698l = 0;
        this.f133699m = 0;
        this.n = null;
        this.o = null;
    }

    public /* synthetic */ a(int i2, byte b2) {
        this(i2);
    }
}
