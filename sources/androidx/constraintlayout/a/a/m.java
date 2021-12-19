package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import androidx.constraintlayout.a.e;
import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;

public final class m extends o {

    /* renamed from: a  reason: collision with root package name */
    e f1954a;

    /* renamed from: b  reason: collision with root package name */
    float f1955b;

    /* renamed from: c  reason: collision with root package name */
    m f1956c;

    /* renamed from: d  reason: collision with root package name */
    float f1957d;

    /* renamed from: e  reason: collision with root package name */
    m f1958e;

    /* renamed from: f  reason: collision with root package name */
    public float f1959f;

    /* renamed from: g  reason: collision with root package name */
    public int f1960g;

    /* renamed from: j  reason: collision with root package name */
    private m f1961j;

    /* renamed from: k  reason: collision with root package name */
    private float f1962k;

    /* renamed from: l  reason: collision with root package name */
    private n f1963l;

    /* renamed from: m  reason: collision with root package name */
    private int f1964m = 1;
    private n n;
    private int o = 1;

    static {
        Covode.recordClassIndex(597);
    }

    private static String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    @Override // androidx.constraintlayout.a.a.o
    public final void b() {
        super.b();
        this.f1956c = null;
        this.f1957d = 0.0f;
        this.f1963l = null;
        this.f1964m = 1;
        this.n = null;
        this.o = 1;
        this.f1958e = null;
        this.f1959f = 0.0f;
        this.f1955b = 0.0f;
        this.f1961j = null;
        this.f1962k = 0.0f;
        this.f1960g = 0;
    }

    public final String toString() {
        if (this.f1967i != 1) {
            return "{ " + this.f1954a + " UNRESOLVED} type: " + a(this.f1960g);
        }
        if (this.f1958e == this) {
            return "[" + this.f1954a + ", RESOLVED: " + this.f1959f + "]  type: " + a(this.f1960g);
        }
        return "[" + this.f1954a + ", RESOLVED: " + this.f1958e + ":" + this.f1959f + "] type: " + a(this.f1960g);
    }

    @Override // androidx.constraintlayout.a.a.o
    public final void a() {
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        m mVar6;
        float f2;
        float f3;
        float f4;
        float f5;
        m mVar7;
        boolean z = true;
        if (this.f1967i != 1 && this.f1960g != 4) {
            n nVar = this.f1963l;
            if (nVar != null) {
                if (nVar.f1967i == 1) {
                    this.f1957d = ((float) this.f1964m) * this.f1963l.f1965a;
                } else {
                    return;
                }
            }
            n nVar2 = this.n;
            if (nVar2 != null) {
                if (nVar2.f1967i == 1) {
                    this.f1962k = ((float) this.o) * this.n.f1965a;
                } else {
                    return;
                }
            }
            if (this.f1960g == 1 && ((mVar7 = this.f1956c) == null || mVar7.f1967i == 1)) {
                m mVar8 = this.f1956c;
                if (mVar8 == null) {
                    this.f1958e = this;
                    this.f1959f = this.f1957d;
                } else {
                    this.f1958e = mVar8.f1958e;
                    this.f1959f = mVar8.f1959f + this.f1957d;
                }
                d();
            } else if (this.f1960g == 2 && (mVar4 = this.f1956c) != null && mVar4.f1967i == 1 && (mVar5 = this.f1961j) != null && (mVar6 = mVar5.f1956c) != null && mVar6.f1967i == 1) {
                if (e.f1986h != null) {
                    e.f1986h.w++;
                }
                this.f1958e = this.f1956c.f1958e;
                m mVar9 = this.f1961j;
                mVar9.f1958e = mVar9.f1956c.f1958e;
                int i2 = 0;
                if (this.f1954a.f1911c == e.c.RIGHT || this.f1954a.f1911c == e.c.BOTTOM) {
                    f2 = this.f1956c.f1959f;
                    f3 = this.f1961j.f1956c.f1959f;
                } else {
                    z = false;
                    f2 = this.f1961j.f1956c.f1959f;
                    f3 = this.f1956c.f1959f;
                }
                float f6 = f2 - f3;
                if (this.f1954a.f1911c == e.c.LEFT || this.f1954a.f1911c == e.c.RIGHT) {
                    f5 = f6 - ((float) this.f1954a.f1910b.k());
                    f4 = this.f1954a.f1910b.ac;
                } else {
                    f5 = f6 - ((float) this.f1954a.f1910b.l());
                    f4 = this.f1954a.f1910b.ad;
                }
                int b2 = this.f1954a.b();
                int b3 = this.f1961j.f1954a.b();
                if (this.f1954a.f1912d == this.f1961j.f1954a.f1912d) {
                    f4 = 0.5f;
                    b3 = 0;
                } else {
                    i2 = b2;
                }
                float f7 = (float) i2;
                float f8 = (float) b3;
                float f9 = (f5 - f7) - f8;
                if (z) {
                    m mVar10 = this.f1961j;
                    mVar10.f1959f = mVar10.f1956c.f1959f + f8 + (f9 * f4);
                    this.f1959f = (this.f1956c.f1959f - f7) - (f9 * (1.0f - f4));
                } else {
                    this.f1959f = this.f1956c.f1959f + f7 + (f9 * f4);
                    m mVar11 = this.f1961j;
                    mVar11.f1959f = (mVar11.f1956c.f1959f - f8) - (f9 * (1.0f - f4));
                }
                d();
                this.f1961j.d();
            } else if (this.f1960g == 3 && (mVar = this.f1956c) != null && mVar.f1967i == 1 && (mVar2 = this.f1961j) != null && (mVar3 = mVar2.f1956c) != null && mVar3.f1967i == 1) {
                if (androidx.constraintlayout.a.e.f1986h != null) {
                    androidx.constraintlayout.a.e.f1986h.x++;
                }
                m mVar12 = this.f1956c;
                this.f1958e = mVar12.f1958e;
                m mVar13 = this.f1961j;
                m mVar14 = mVar13.f1956c;
                mVar13.f1958e = mVar14.f1958e;
                this.f1959f = mVar12.f1959f + this.f1957d;
                mVar13.f1959f = mVar14.f1959f + mVar13.f1957d;
                d();
                this.f1961j.d();
            } else if (this.f1960g == 5) {
                this.f1954a.f1910b.c();
            }
        }
    }

    public m(e eVar) {
        this.f1954a = eVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(androidx.constraintlayout.a.e eVar) {
        h hVar = this.f1954a.f1918j;
        m mVar = this.f1958e;
        if (mVar == null) {
            eVar.a(hVar, (int) (this.f1959f + 0.5f));
        } else {
            eVar.c(hVar, eVar.a(mVar.f1954a), (int) (this.f1959f + 0.5f), 6);
        }
    }

    public final void b(m mVar, float f2) {
        this.f1961j = mVar;
        this.f1962k = f2;
    }

    public final void a(m mVar, int i2) {
        this.f1960g = 1;
        this.f1956c = mVar;
        this.f1957d = (float) i2;
        mVar.a(this);
    }

    public final void b(m mVar, int i2) {
        this.f1956c = mVar;
        this.f1957d = (float) i2;
        mVar.a(this);
    }

    public final void a(m mVar, float f2) {
        if (this.f1967i == 0 || !(this.f1958e == mVar || this.f1959f == f2)) {
            this.f1958e = mVar;
            this.f1959f = f2;
            if (this.f1967i == 1) {
                c();
            }
            d();
        }
    }

    public final void b(m mVar, int i2, n nVar) {
        this.f1961j = mVar;
        this.n = nVar;
        this.o = i2;
    }

    public final void a(m mVar, int i2, n nVar) {
        this.f1956c = mVar;
        mVar.a(this);
        this.f1963l = nVar;
        this.f1964m = i2;
        nVar.a(this);
    }
}
