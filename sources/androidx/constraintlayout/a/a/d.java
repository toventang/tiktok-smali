package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public f f1896a;

    /* renamed from: b  reason: collision with root package name */
    public f f1897b;

    /* renamed from: c  reason: collision with root package name */
    public f f1898c;

    /* renamed from: d  reason: collision with root package name */
    public f f1899d;

    /* renamed from: e  reason: collision with root package name */
    public f f1900e;

    /* renamed from: f  reason: collision with root package name */
    public f f1901f;

    /* renamed from: g  reason: collision with root package name */
    public f f1902g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<f> f1903h;

    /* renamed from: i  reason: collision with root package name */
    protected int f1904i;

    /* renamed from: j  reason: collision with root package name */
    protected int f1905j;

    /* renamed from: k  reason: collision with root package name */
    public float f1906k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f1907l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f1908m;
    protected boolean n;
    boolean o;
    private int p;
    private boolean q;

    static {
        Covode.recordClassIndex(581);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i2 = this.p * 2;
        f fVar = this.f1896a;
        boolean z = false;
        f fVar2 = fVar;
        while (true) {
            this.f1904i++;
            fVar.au[this.p] = null;
            fVar.at[this.p] = null;
            if (fVar.ag != 8) {
                if (this.f1897b == null) {
                    this.f1897b = fVar;
                }
                this.f1899d = fVar;
                if (fVar.G[this.p] == f.a.MATCH_CONSTRAINT && (fVar.f1929i[this.p] == 0 || fVar.f1929i[this.p] == 3 || fVar.f1929i[this.p] == 2)) {
                    this.f1905j++;
                    float f2 = fVar.as[this.p];
                    if (f2 > 0.0f) {
                        this.f1906k += fVar.as[this.p];
                    }
                    int i3 = this.p;
                    if (fVar.ag != 8 && fVar.G[i3] == f.a.MATCH_CONSTRAINT && (fVar.f1929i[i3] == 0 || fVar.f1929i[i3] == 3)) {
                        if (f2 < 0.0f) {
                            this.f1907l = true;
                        } else {
                            this.f1908m = true;
                        }
                        if (this.f1903h == null) {
                            this.f1903h = new ArrayList<>();
                        }
                        this.f1903h.add(fVar);
                    }
                    if (this.f1901f == null) {
                        this.f1901f = fVar;
                    }
                    f fVar3 = this.f1902g;
                    if (fVar3 != null) {
                        fVar3.at[this.p] = fVar;
                    }
                    this.f1902g = fVar;
                }
            }
            if (fVar2 != fVar) {
                fVar2.au[this.p] = fVar;
            }
            e eVar = fVar.E[i2 + 1].f1912d;
            if (eVar == null) {
                break;
            }
            f fVar4 = eVar.f1910b;
            if (fVar4.E[i2].f1912d == null || fVar4.E[i2].f1912d.f1910b != fVar) {
                break;
            }
            fVar2 = fVar;
            fVar = fVar4;
        }
        this.f1898c = fVar;
        if (this.p != 0 || !this.q) {
            this.f1900e = this.f1896a;
        } else {
            this.f1900e = fVar;
        }
        if (this.f1908m && this.f1907l) {
            z = true;
        }
        this.n = z;
    }

    public d(f fVar, int i2, boolean z) {
        this.f1896a = fVar;
        this.p = i2;
        this.q = z;
    }
}
