package androidx.constraintlayout.a;

import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static f f1986h;

    /* renamed from: i  reason: collision with root package name */
    private static int f1987i = 1000;

    /* renamed from: a  reason: collision with root package name */
    public int f1988a;

    /* renamed from: b  reason: collision with root package name */
    public a f1989b;

    /* renamed from: c  reason: collision with root package name */
    public b[] f1990c = new b[32];

    /* renamed from: d  reason: collision with root package name */
    public boolean f1991d;

    /* renamed from: e  reason: collision with root package name */
    int f1992e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f1993f;

    /* renamed from: g  reason: collision with root package name */
    public final c f1994g;

    /* renamed from: j  reason: collision with root package name */
    private HashMap<String, h> f1995j;

    /* renamed from: k  reason: collision with root package name */
    private int f1996k = 32;

    /* renamed from: l  reason: collision with root package name */
    private int f1997l = 32;

    /* renamed from: m  reason: collision with root package name */
    private boolean[] f1998m = new boolean[32];
    private int n = 32;
    private h[] o = new h[f1987i];
    private int p;
    private b[] q = new b[32];
    private final a r;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(607);
        }

        h a(boolean[] zArr);

        void a();

        void a(a aVar);

        h b();

        void c(h hVar);
    }

    public final void a(h hVar, h hVar2, int i2, int i3) {
        b b2 = b();
        h c2 = c();
        c2.f2020e = 0;
        b2.a(hVar, hVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.f1981d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public final void a(h hVar, h hVar2, int i2, float f2, h hVar3, h hVar4, int i3, int i4) {
        b b2 = b();
        if (hVar2 == hVar3) {
            b2.f1981d.a(hVar, 1.0f);
            b2.f1981d.a(hVar4, 1.0f);
            b2.f1981d.a(hVar2, -2.0f);
        } else if (f2 == 0.5f) {
            b2.f1981d.a(hVar, 1.0f);
            b2.f1981d.a(hVar2, -1.0f);
            b2.f1981d.a(hVar3, -1.0f);
            b2.f1981d.a(hVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                b2.f1979b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            b2.f1981d.a(hVar, -1.0f);
            b2.f1981d.a(hVar2, 1.0f);
            b2.f1979b = (float) i2;
        } else if (f2 >= 1.0f) {
            b2.f1981d.a(hVar3, -1.0f);
            b2.f1981d.a(hVar4, 1.0f);
            b2.f1979b = (float) i3;
        } else {
            float f3 = 1.0f - f2;
            b2.f1981d.a(hVar, f3 * 1.0f);
            b2.f1981d.a(hVar2, f3 * -1.0f);
            b2.f1981d.a(hVar3, -1.0f * f2);
            b2.f1981d.a(hVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                b2.f1979b = (((float) (-i2)) * f3) + (((float) i3) * f2);
            }
        }
        if (i4 != 6) {
            b2.a(this, i4);
        }
        a(b2);
    }

    public final void a(h hVar, int i2) {
        int i3 = hVar.f2019d;
        if (hVar.f2019d != -1) {
            b bVar = this.f1990c[i3];
            if (bVar.f1982e) {
                bVar.f1979b = (float) i2;
            } else if (bVar.f1981d.f1883a == 0) {
                bVar.f1982e = true;
                bVar.f1979b = (float) i2;
            } else {
                b b2 = b();
                if (i2 < 0) {
                    b2.f1979b = (float) (i2 * -1);
                    b2.f1981d.a(hVar, 1.0f);
                } else {
                    b2.f1979b = (float) i2;
                    b2.f1981d.a(hVar, -1.0f);
                }
                a(b2);
            }
        } else {
            b b3 = b();
            b3.f1978a = hVar;
            float f2 = (float) i2;
            hVar.f2021f = f2;
            b3.f1979b = f2;
            b3.f1982e = true;
            a(b3);
        }
    }

    static {
        Covode.recordClassIndex(606);
    }

    private void f() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f1990c;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.f1994g.f1983a.a(bVar);
                }
                this.f1990c[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        for (int i2 = 0; i2 < this.f1993f; i2++) {
            b bVar = this.f1990c[i2];
            bVar.f1978a.f2021f = bVar.f1979b;
        }
    }

    public e() {
        f();
        c cVar = new c();
        this.f1994g = cVar;
        this.f1989b = new d(cVar);
        this.r = new b(cVar);
    }

    public final b b() {
        b a2 = this.f1994g.f1983a.a();
        if (a2 == null) {
            a2 = new b(this.f1994g);
        } else {
            a2.f1978a = null;
            a2.f1981d.a();
            a2.f1979b = 0.0f;
            a2.f1982e = false;
        }
        h.f2014a++;
        return a2;
    }

    private void e() {
        int i2 = this.f1996k * 2;
        this.f1996k = i2;
        this.f1990c = (b[]) Arrays.copyOf(this.f1990c, i2);
        c cVar = this.f1994g;
        cVar.f1985c = (h[]) Arrays.copyOf(cVar.f1985c, this.f1996k);
        int i3 = this.f1996k;
        this.f1998m = new boolean[i3];
        this.f1997l = i3;
        this.n = i3;
        f fVar = f1986h;
        if (fVar != null) {
            fVar.f2002d++;
            f fVar2 = f1986h;
            fVar2.p = Math.max(fVar2.p, (long) this.f1996k);
            f fVar3 = f1986h;
            fVar3.D = fVar3.p;
        }
    }

    public final h c() {
        f fVar = f1986h;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.f1992e + 1 >= this.f1997l) {
            e();
        }
        h a2 = a(h.a.SLACK);
        int i2 = this.f1988a + 1;
        this.f1988a = i2;
        this.f1992e++;
        a2.f2018c = i2;
        this.f1994g.f1985c[this.f1988a] = a2;
        return a2;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f1994g.f1985c.length; i2++) {
            h hVar = this.f1994g.f1985c[i2];
            if (hVar != null) {
                hVar.a();
            }
        }
        this.f1994g.f1984b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.f1994g.f1985c, (Object) null);
        HashMap<String, h> hashMap = this.f1995j;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1988a = 0;
        this.f1989b.a();
        this.f1992e = 1;
        for (int i3 = 0; i3 < this.f1993f; i3++) {
            this.f1990c[i3].f1980c = false;
        }
        f();
        this.f1993f = 0;
    }

    public static int b(Object obj) {
        h hVar = ((androidx.constraintlayout.a.a.e) obj).f1918j;
        if (hVar != null) {
            return (int) (hVar.f2021f + 0.5f);
        }
        return 0;
    }

    private final void b(b bVar) {
        if (this.f1993f > 0) {
            bVar.f1981d.a(bVar, this.f1990c);
            if (bVar.f1981d.f1883a == 0) {
                bVar.f1982e = true;
            }
        }
    }

    private h a(h.a aVar) {
        h a2 = this.f1994g.f1984b.a();
        if (a2 == null) {
            a2 = new h(aVar);
            a2.f2023h = aVar;
        } else {
            a2.a();
            a2.f2023h = aVar;
        }
        int i2 = this.p;
        int i3 = f1987i;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1987i = i4;
            this.o = (h[]) Arrays.copyOf(this.o, i4);
        }
        h[] hVarArr = this.o;
        int i5 = this.p;
        this.p = i5 + 1;
        hVarArr[i5] = a2;
        return a2;
    }

    private final void c(b bVar) {
        if (this.f1990c[this.f1993f] != null) {
            this.f1994g.f1983a.a(this.f1990c[this.f1993f]);
        }
        this.f1990c[this.f1993f] = bVar;
        bVar.f1978a.f2019d = this.f1993f;
        this.f1993f++;
        bVar.f1978a.c(bVar);
    }

    public final h a(int i2) {
        f fVar = f1986h;
        if (fVar != null) {
            fVar.f2011m++;
        }
        if (this.f1992e + 1 >= this.f1997l) {
            e();
        }
        h a2 = a(h.a.ERROR);
        int i3 = this.f1988a + 1;
        this.f1988a = i3;
        this.f1992e++;
        a2.f2018c = i3;
        a2.f2020e = i2;
        this.f1994g.f1985c[this.f1988a] = a2;
        this.f1989b.c(a2);
        return a2;
    }

    private final int b(a aVar) {
        f fVar = f1986h;
        if (fVar != null) {
            fVar.f2006h++;
        }
        for (int i2 = 0; i2 < this.f1992e; i2++) {
            this.f1998m[i2] = false;
        }
        int i3 = 0;
        while (true) {
            f fVar2 = f1986h;
            if (fVar2 != null) {
                fVar2.f2007i++;
            }
            i3++;
            if (i3 >= this.f1992e * 2) {
                return i3;
            }
            if (aVar.b() != null) {
                this.f1998m[aVar.b().f2018c] = true;
            }
            h a2 = aVar.a(this.f1998m);
            if (a2 == null || this.f1998m[a2.f2018c]) {
                return i3;
            }
            this.f1998m[a2.f2018c] = true;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < this.f1993f; i5++) {
                b bVar = this.f1990c[i5];
                if (bVar.f1978a.f2023h != h.a.UNRESTRICTED && !bVar.f1982e && bVar.a(a2)) {
                    float b2 = bVar.f1981d.b(a2);
                    if (b2 < 0.0f) {
                        float f3 = (-bVar.f1979b) / b2;
                        if (f3 < f2) {
                            i4 = i5;
                            f2 = f3;
                        }
                    }
                }
            }
            if (i4 < 0) {
                break;
            }
            b bVar2 = this.f1990c[i4];
            bVar2.f1978a.f2019d = -1;
            f fVar3 = f1986h;
            if (fVar3 != null) {
                fVar3.f2008j++;
            }
            bVar2.b(a2);
            bVar2.f1978a.f2019d = i4;
            bVar2.f1978a.c(bVar2);
        }
        return i3;
    }

    public final h a(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1992e + 1 >= this.f1997l) {
            e();
        }
        if (obj instanceof androidx.constraintlayout.a.a.e) {
            androidx.constraintlayout.a.a.e eVar = (androidx.constraintlayout.a.a.e) obj;
            hVar = eVar.f1918j;
            if (hVar == null) {
                eVar.a();
                hVar = eVar.f1918j;
            }
            if (hVar.f2018c == -1 || hVar.f2018c > this.f1988a || this.f1994g.f1985c[hVar.f2018c] == null) {
                if (hVar.f2018c != -1) {
                    hVar.a();
                }
                int i2 = this.f1988a + 1;
                this.f1988a = i2;
                this.f1992e++;
                hVar.f2018c = i2;
                hVar.f2023h = h.a.UNRESTRICTED;
                this.f1994g.f1985c[this.f1988a] = hVar;
            }
        }
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x00a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.constraintlayout.a.b r18) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.e.a(androidx.constraintlayout.a.b):void");
    }

    public final void a(a aVar) {
        f fVar = f1986h;
        long j2 = 1;
        if (fVar != null) {
            fVar.t++;
            f fVar2 = f1986h;
            fVar2.u = Math.max(fVar2.u, (long) this.f1992e);
            f fVar3 = f1986h;
            fVar3.v = Math.max(fVar3.v, (long) this.f1993f);
        }
        b((b) aVar);
        int i2 = 0;
        while (true) {
            float f2 = 0.0f;
            int i3 = 1;
            if (i2 >= this.f1993f) {
                break;
            } else if (this.f1990c[i2].f1978a.f2023h == h.a.UNRESTRICTED || this.f1990c[i2].f1979b >= 0.0f) {
                i2++;
            } else {
                boolean z = false;
                int i4 = 0;
                do {
                    f fVar4 = f1986h;
                    if (fVar4 != null) {
                        fVar4.f2009k += j2;
                    }
                    i4 += i3;
                    float f3 = Float.MAX_VALUE;
                    int i5 = 0;
                    int i6 = -1;
                    int i7 = -1;
                    int i8 = 0;
                    while (i5 < this.f1993f) {
                        b bVar = this.f1990c[i5];
                        if (bVar.f1978a.f2023h != h.a.UNRESTRICTED && !bVar.f1982e && bVar.f1979b < f2) {
                            int i9 = 1;
                            while (i9 < this.f1992e) {
                                h hVar = this.f1994g.f1985c[i9];
                                float b2 = bVar.f1981d.b(hVar);
                                if (b2 > f2) {
                                    int i10 = 0;
                                    do {
                                        float f4 = hVar.f2022g[i10] / b2;
                                        if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                            i7 = i9;
                                            f3 = f4;
                                            i8 = i10;
                                            i6 = i5;
                                        }
                                        i10++;
                                    } while (i10 < 7);
                                }
                                i9++;
                                f2 = 0.0f;
                            }
                        }
                        i5++;
                        f2 = 0.0f;
                    }
                    if (i6 != -1) {
                        b bVar2 = this.f1990c[i6];
                        bVar2.f1978a.f2019d = -1;
                        f fVar5 = f1986h;
                        if (fVar5 != null) {
                            fVar5.f2008j++;
                        }
                        bVar2.b(this.f1994g.f1985c[i7]);
                        bVar2.f1978a.f2019d = i6;
                        bVar2.f1978a.c(bVar2);
                    } else {
                        z = true;
                    }
                    if (i4 > this.f1992e / 2) {
                        break;
                    }
                    j2 = 1;
                    f2 = 0.0f;
                    i3 = 1;
                } while (!z);
            }
        }
        b(aVar);
        d();
    }

    public final void a(b bVar, int i2, int i3) {
        bVar.f1981d.a(a(i3), (float) i2);
    }

    public final void b(h hVar, h hVar2, int i2, int i3) {
        b b2 = b();
        h c2 = c();
        c2.f2020e = 0;
        b2.b(hVar, hVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.f1981d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public final b c(h hVar, h hVar2, int i2, int i3) {
        b b2 = b();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            b2.f1979b = (float) i2;
        }
        if (!z) {
            b2.f1981d.a(hVar, -1.0f);
            b2.f1981d.a(hVar2, 1.0f);
        } else {
            b2.f1981d.a(hVar, 1.0f);
            b2.f1981d.a(hVar2, -1.0f);
        }
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public final void a(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        b b2 = b();
        b2.a(hVar, hVar2, hVar3, hVar4, f2);
        a(b2);
    }
}
