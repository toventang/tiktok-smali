package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import androidx.constraintlayout.a.a.f;
import androidx.constraintlayout.a.b;
import androidx.constraintlayout.a.e;
import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class i extends f {

    /* renamed from: a  reason: collision with root package name */
    public float f1950a = -1.0f;
    private boolean aA;
    private l aB = new l();
    private int aC = 8;
    public int ax = -1;
    public e ay = this.x;
    public int az;

    /* renamed from: b  reason: collision with root package name */
    public int f1951b = -1;

    static {
        Covode.recordClassIndex(592);
    }

    @Override // androidx.constraintlayout.a.a.f
    public final boolean a() {
        return true;
    }

    @Override // androidx.constraintlayout.a.a.f
    public final ArrayList<e> t() {
        return this.F;
    }

    public i() {
        this.F.clear();
        this.F.add(this.ay);
        int length = this.E.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.E[i2] = this.ay;
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void y() {
        if (this.H != null) {
            int b2 = e.b(this.ay);
            if (this.az == 1) {
                this.M = b2;
                this.N = 0;
                d(this.H.l());
                c(0);
                return;
            }
            this.M = 0;
            this.N = b2;
            c(this.H.k());
            d(0);
        }
    }

    /* renamed from: androidx.constraintlayout.a.a.i$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1952a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.i.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final e a(e.c cVar) {
        switch (AnonymousClass1.f1952a[cVar.ordinal()]) {
            case 1:
            case 2:
                if (this.az == 1) {
                    return this.ay;
                }
                break;
            case 3:
            case 4:
                if (this.az == 0) {
                    return this.ay;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    public final void h(int i2) {
        if (this.az != i2) {
            this.az = i2;
            this.F.clear();
            if (this.az == 1) {
                this.ay = this.w;
            } else {
                this.ay = this.x;
            }
            this.F.add(this.ay);
            int length = this.E.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.E[i3] = this.ay;
            }
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(androidx.constraintlayout.a.e eVar) {
        boolean z;
        f fVar = this.H;
        if (fVar != null) {
            e a2 = fVar.a(e.c.LEFT);
            e a3 = fVar.a(e.c.RIGHT);
            boolean z2 = true;
            if (this.H == null || this.H.G[0] != f.a.WRAP_CONTENT) {
                z = false;
            } else {
                z = true;
            }
            if (this.az == 0) {
                a2 = fVar.a(e.c.TOP);
                a3 = fVar.a(e.c.BOTTOM);
                if (this.H == null || this.H.G[1] != f.a.WRAP_CONTENT) {
                    z2 = false;
                }
                z = z2;
            }
            if (this.f1951b != -1) {
                h a4 = eVar.a(this.ay);
                eVar.c(a4, eVar.a(a2), this.f1951b, 6);
                if (z) {
                    eVar.a(eVar.a(a3), a4, 0, 5);
                }
            } else if (this.ax != -1) {
                h a5 = eVar.a(this.ay);
                h a6 = eVar.a(a3);
                eVar.c(a5, a6, -this.ax, 6);
                if (z) {
                    eVar.a(a5, eVar.a(a2), 0, 5);
                    eVar.a(a6, a5, 0, 5);
                }
            } else if (this.f1950a != -1.0f) {
                h a7 = eVar.a(this.ay);
                h a8 = eVar.a(a2);
                h a9 = eVar.a(a3);
                float f2 = this.f1950a;
                boolean z3 = this.aA;
                b b2 = eVar.b();
                if (z3) {
                    b2.a(eVar, 0);
                }
                b2.f1981d.a(a7, -1.0f);
                b2.f1981d.a(a8, 1.0f - f2);
                b2.f1981d.a(a9, f2);
                eVar.a(b2);
            }
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(int i2) {
        f fVar = this.H;
        if (fVar != null) {
            if (this.az == 1) {
                this.x.f1909a.a(fVar.x.f1909a, 0);
                this.z.f1909a.a(fVar.x.f1909a, 0);
                if (this.f1951b != -1) {
                    this.w.f1909a.a(fVar.w.f1909a, this.f1951b);
                    this.y.f1909a.a(fVar.w.f1909a, this.f1951b);
                } else if (this.ax != -1) {
                    this.w.f1909a.a(fVar.y.f1909a, -this.ax);
                    this.y.f1909a.a(fVar.y.f1909a, -this.ax);
                } else if (this.f1950a != -1.0f && fVar.w() == f.a.FIXED) {
                    int i3 = (int) (((float) fVar.I) * this.f1950a);
                    this.w.f1909a.a(fVar.w.f1909a, i3);
                    this.y.f1909a.a(fVar.w.f1909a, i3);
                }
            } else {
                this.w.f1909a.a(fVar.w.f1909a, 0);
                this.y.f1909a.a(fVar.w.f1909a, 0);
                if (this.f1951b != -1) {
                    this.x.f1909a.a(fVar.x.f1909a, this.f1951b);
                    this.z.f1909a.a(fVar.x.f1909a, this.f1951b);
                } else if (this.ax != -1) {
                    this.x.f1909a.a(fVar.z.f1909a, -this.ax);
                    this.z.f1909a.a(fVar.z.f1909a, -this.ax);
                } else if (this.f1950a != -1.0f && fVar.x() == f.a.FIXED) {
                    int i4 = (int) (((float) fVar.J) * this.f1950a);
                    this.x.f1909a.a(fVar.x.f1909a, i4);
                    this.z.f1909a.a(fVar.x.f1909a, i4);
                }
            }
        }
    }
}
