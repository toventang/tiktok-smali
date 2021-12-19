package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import androidx.constraintlayout.a.a.f;
import androidx.constraintlayout.a.e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class g extends q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1937a;
    int aA;
    int aB = 0;
    int aC = 0;
    d[] aD = new d[4];
    d[] aE = new d[4];
    public List<h> aF = new ArrayList();
    public boolean aG = false;
    public boolean aH = false;
    public boolean aI = false;
    public int aJ = 0;
    public int aK = 0;
    public int aL = 7;
    public boolean aM = false;
    public boolean aN = false;
    public boolean aO = false;
    int aP = 0;
    private p aR;
    int ax;
    int ay;
    int az;

    /* renamed from: b  reason: collision with root package name */
    public e f1938b = new e();

    static {
        Covode.recordClassIndex(590);
    }

    private void D() {
        this.aB = 0;
        this.aC = 0;
    }

    public final void A() {
        C();
        a(this.aL);
    }

    private void C() {
        int size = this.aQ.size();
        b();
        for (int i2 = 0; i2 < size; i2++) {
            ((f) this.aQ.get(i2)).b();
        }
    }

    public final void B() {
        m mVar = a(e.c.LEFT).f1909a;
        m mVar2 = a(e.c.TOP).f1909a;
        mVar.a((m) null, 0.0f);
        mVar2.a((m) null, 0.0f);
    }

    @Override // androidx.constraintlayout.a.a.f, androidx.constraintlayout.a.a.q
    public final void f() {
        this.f1938b.a();
        this.ax = 0;
        this.az = 0;
        this.ay = 0;
        this.aA = 0;
        this.aF.clear();
        this.aM = false;
        super.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03ae A[LOOP:9: B:183:0x03ac->B:184:0x03ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x039b A[SYNTHETIC] */
    @Override // androidx.constraintlayout.a.a.q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
        // Method dump skipped, instructions count: 1211
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.g.z():void");
    }

    public final boolean h(int i2) {
        if ((this.aL & i2) == i2) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(int i2) {
        super.a(i2);
        int size = this.aQ.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((f) this.aQ.get(i3)).a(i2);
        }
    }

    private void b(f fVar) {
        int i2 = this.aB + 1;
        d[] dVarArr = this.aE;
        if (i2 >= dVarArr.length) {
            this.aE = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.aE[this.aB] = new d(fVar, 0, this.f1937a);
        this.aB++;
    }

    private void c(f fVar) {
        int i2 = this.aC + 1;
        d[] dVarArr = this.aD;
        if (i2 >= dVarArr.length) {
            this.aD = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.aD[this.aC] = new d(fVar, 1, this.f1937a);
        this.aC++;
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar, int i2) {
        if (i2 == 0) {
            b(fVar);
        } else if (i2 == 1) {
            c(fVar);
        }
    }

    public final void e(int i2, int i3) {
        if (!(this.G[0] == f.a.WRAP_CONTENT || this.f1925e == null)) {
            this.f1925e.a(i2);
        }
        if (this.G[1] != f.a.WRAP_CONTENT && this.f1926f != null) {
            this.f1926f.a(i3);
        }
    }
}
