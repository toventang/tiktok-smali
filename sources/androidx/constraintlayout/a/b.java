package androidx.constraintlayout.a;

import androidx.constraintlayout.a.e;
import com.bytedance.covode.number.Covode;

public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    h f1978a;

    /* renamed from: b  reason: collision with root package name */
    public float f1979b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1980c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1981d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1982e;

    static {
        Covode.recordClassIndex(603);
    }

    @Override // androidx.constraintlayout.a.e.a
    public final h b() {
        return this.f1978a;
    }

    @Override // androidx.constraintlayout.a.e.a
    public final void a() {
        this.f1981d.a();
        this.f1978a = null;
        this.f1979b = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.b.toString():java.lang.String");
    }

    @Override // androidx.constraintlayout.a.e.a
    public final h a(boolean[] zArr) {
        return this.f1981d.a(zArr, (h) null);
    }

    public b(c cVar) {
        this.f1981d = new a(this, cVar);
    }

    @Override // androidx.constraintlayout.a.e.a
    public void c(h hVar) {
        float f2 = 1.0f;
        if (hVar.f2020e != 1) {
            if (hVar.f2020e == 2) {
                f2 = 1000.0f;
            } else if (hVar.f2020e == 3) {
                f2 = 1000000.0f;
            } else if (hVar.f2020e == 4) {
                f2 = 1.0E9f;
            } else if (hVar.f2020e == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f1981d.a(hVar, f2);
    }

    /* access modifiers changed from: package-private */
    public final void b(h hVar) {
        h hVar2 = this.f1978a;
        if (hVar2 != null) {
            this.f1981d.a(hVar2, -1.0f);
            this.f1978a = null;
        }
        float a2 = this.f1981d.a(hVar, true) * -1.0f;
        this.f1978a = hVar;
        if (a2 != 1.0f) {
            this.f1979b /= a2;
            a aVar = this.f1981d;
            int i2 = aVar.f1889g;
            int i3 = 0;
            while (i2 != -1 && i3 < aVar.f1883a) {
                float[] fArr = aVar.f1888f;
                fArr[i2] = fArr[i2] / a2;
                i2 = aVar.f1887e[i2];
                i3++;
            }
        }
    }

    @Override // androidx.constraintlayout.a.e.a
    public final void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f1978a = null;
            this.f1981d.a();
            for (int i2 = 0; i2 < bVar.f1981d.f1883a; i2++) {
                this.f1981d.a(bVar.f1981d.a(i2), bVar.f1981d.b(i2), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(h hVar) {
        a aVar = this.f1981d;
        if (aVar.f1889g != -1) {
            int i2 = aVar.f1889g;
            int i3 = 0;
            while (i2 != -1 && i3 < aVar.f1883a) {
                if (aVar.f1886d[i2] == hVar.f2018c) {
                    return true;
                }
                i2 = aVar.f1887e[i2];
                i3++;
            }
        }
        return false;
    }

    public final b a(e eVar, int i2) {
        this.f1981d.a(eVar.a(i2), 1.0f);
        this.f1981d.a(eVar.a(i2), -1.0f);
        return this;
    }

    public final b a(h hVar, h hVar2, h hVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1979b = (float) i2;
        }
        if (!z) {
            this.f1981d.a(hVar, -1.0f);
            this.f1981d.a(hVar2, 1.0f);
            this.f1981d.a(hVar3, 1.0f);
        } else {
            this.f1981d.a(hVar, 1.0f);
            this.f1981d.a(hVar2, -1.0f);
            this.f1981d.a(hVar3, -1.0f);
        }
        return this;
    }

    public final b b(h hVar, h hVar2, h hVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1979b = (float) i2;
        }
        if (!z) {
            this.f1981d.a(hVar, -1.0f);
            this.f1981d.a(hVar2, 1.0f);
            this.f1981d.a(hVar3, -1.0f);
        } else {
            this.f1981d.a(hVar, 1.0f);
            this.f1981d.a(hVar2, -1.0f);
            this.f1981d.a(hVar3, 1.0f);
        }
        return this;
    }

    public final b b(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f1981d.a(hVar3, 0.5f);
        this.f1981d.a(hVar4, 0.5f);
        this.f1981d.a(hVar, -0.5f);
        this.f1981d.a(hVar2, -0.5f);
        this.f1979b = -f2;
        return this;
    }

    public final b a(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f1981d.a(hVar, -1.0f);
        this.f1981d.a(hVar2, 1.0f);
        this.f1981d.a(hVar3, f2);
        this.f1981d.a(hVar4, -f2);
        return this;
    }
}
