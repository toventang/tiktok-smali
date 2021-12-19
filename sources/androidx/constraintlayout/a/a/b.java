package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.f;
import androidx.constraintlayout.a.e;
import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public int f1894a;
    private ArrayList<m> az = new ArrayList<>(4);

    /* renamed from: b  reason: collision with root package name */
    public boolean f1895b = true;

    static {
        Covode.recordClassIndex(579);
    }

    @Override // androidx.constraintlayout.a.a.f
    public final boolean a() {
        return true;
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void b() {
        super.b();
        this.az.clear();
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void c() {
        m mVar;
        int i2 = this.f1894a;
        float f2 = Float.MAX_VALUE;
        if (i2 != 0) {
            if (i2 == 1) {
                mVar = this.y.f1909a;
            } else if (i2 == 2) {
                mVar = this.x.f1909a;
            } else if (i2 == 3) {
                mVar = this.z.f1909a;
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            mVar = this.w.f1909a;
        }
        int size = this.az.size();
        m mVar2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            m mVar3 = this.az.get(i3);
            if (mVar3.f1967i == 1) {
                int i4 = this.f1894a;
                if (i4 == 0 || i4 == 2) {
                    if (mVar3.f1959f < f2) {
                        f2 = mVar3.f1959f;
                        mVar2 = mVar3.f1958e;
                    }
                } else if (mVar3.f1959f > f2) {
                    f2 = mVar3.f1959f;
                    mVar2 = mVar3.f1958e;
                }
            } else {
                return;
            }
        }
        if (e.f1986h != null) {
            e.f1986h.z++;
        }
        mVar.f1958e = mVar2;
        mVar.f1959f = f2;
        mVar.d();
        int i5 = this.f1894a;
        if (i5 == 0) {
            this.y.f1909a.a(mVar2, f2);
        } else if (i5 == 1) {
            this.w.f1909a.a(mVar2, f2);
        } else if (i5 == 2) {
            this.z.f1909a.a(mVar2, f2);
        } else if (i5 == 3) {
            this.x.f1909a.a(mVar2, f2);
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(int i2) {
        m mVar;
        m mVar2;
        if (this.H != null && ((g) this.H).h(2)) {
            int i3 = this.f1894a;
            if (i3 == 0) {
                mVar = this.w.f1909a;
            } else if (i3 == 1) {
                mVar = this.y.f1909a;
            } else if (i3 == 2) {
                mVar = this.x.f1909a;
            } else if (i3 == 3) {
                mVar = this.z.f1909a;
            } else {
                return;
            }
            mVar.f1960g = 5;
            int i4 = this.f1894a;
            if (i4 == 0 || i4 == 1) {
                this.x.f1909a.a((m) null, 0.0f);
                this.z.f1909a.a((m) null, 0.0f);
            } else {
                this.w.f1909a.a((m) null, 0.0f);
                this.y.f1909a.a((m) null, 0.0f);
            }
            this.az.clear();
            for (int i5 = 0; i5 < this.ay; i5++) {
                f fVar = this.ax[i5];
                if (this.f1895b || fVar.a()) {
                    int i6 = this.f1894a;
                    if (i6 == 0) {
                        mVar2 = fVar.w.f1909a;
                    } else if (i6 == 1) {
                        mVar2 = fVar.y.f1909a;
                    } else if (i6 == 2) {
                        mVar2 = fVar.x.f1909a;
                    } else if (i6 == 3) {
                        mVar2 = fVar.z.f1909a;
                    }
                    if (mVar2 != null) {
                        this.az.add(mVar2);
                        mVar2.a(mVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(e eVar) {
        boolean z;
        int i2;
        int i3;
        this.E[0] = this.w;
        this.E[2] = this.x;
        this.E[1] = this.y;
        this.E[3] = this.z;
        for (int i4 = 0; i4 < this.E.length; i4++) {
            this.E[i4].f1918j = eVar.a(this.E[i4]);
        }
        int i5 = this.f1894a;
        if (i5 >= 0 && i5 < 4) {
            e eVar2 = this.E[this.f1894a];
            int i6 = 0;
            while (true) {
                if (i6 >= this.ay) {
                    z = false;
                    break;
                }
                f fVar = this.ax[i6];
                if ((this.f1895b || fVar.a()) && ((((i2 = this.f1894a) == 0 || i2 == 1) && fVar.w() == f.a.MATCH_CONSTRAINT) || (((i3 = this.f1894a) == 2 || i3 == 3) && fVar.x() == f.a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            z = true;
            int i7 = this.f1894a;
            if (i7 == 0 || i7 == 1 ? this.H.w() == f.a.WRAP_CONTENT : this.H.x() == f.a.WRAP_CONTENT) {
                z = false;
            }
            for (int i8 = 0; i8 < this.ay; i8++) {
                f fVar2 = this.ax[i8];
                if (this.f1895b || fVar2.a()) {
                    h a2 = eVar.a(fVar2.E[this.f1894a]);
                    fVar2.E[this.f1894a].f1918j = a2;
                    int i9 = this.f1894a;
                    if (i9 == 0 || i9 == 2) {
                        h hVar = eVar2.f1918j;
                        androidx.constraintlayout.a.b b2 = eVar.b();
                        h c2 = eVar.c();
                        c2.f2020e = 0;
                        b2.b(hVar, a2, c2, 0);
                        if (z) {
                            eVar.a(b2, (int) (b2.f1981d.b(c2) * -1.0f), 1);
                        }
                        eVar.a(b2);
                    } else {
                        h hVar2 = eVar2.f1918j;
                        androidx.constraintlayout.a.b b3 = eVar.b();
                        h c3 = eVar.c();
                        c3.f2020e = 0;
                        b3.a(hVar2, a2, c3, 0);
                        if (z) {
                            eVar.a(b3, (int) (b3.f1981d.b(c3) * -1.0f), 1);
                        }
                        eVar.a(b3);
                    }
                }
            }
            int i10 = this.f1894a;
            if (i10 == 0) {
                eVar.c(this.y.f1918j, this.w.f1918j, 0, 6);
                if (!z) {
                    eVar.c(this.w.f1918j, this.H.y.f1918j, 0, 5);
                }
            } else if (i10 == 1) {
                eVar.c(this.w.f1918j, this.y.f1918j, 0, 6);
                if (!z) {
                    eVar.c(this.w.f1918j, this.H.w.f1918j, 0, 5);
                }
            } else if (i10 == 2) {
                eVar.c(this.z.f1918j, this.x.f1918j, 0, 6);
                if (!z) {
                    eVar.c(this.x.f1918j, this.H.z.f1918j, 0, 5);
                }
            } else if (i10 == 3) {
                eVar.c(this.x.f1918j, this.z.f1918j, 0, 6);
                if (!z) {
                    eVar.c(this.x.f1918j, this.H.x.f1918j, 0, 5);
                }
            }
        }
    }
}
