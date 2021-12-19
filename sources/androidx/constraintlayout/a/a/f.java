package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import androidx.constraintlayout.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public class f {
    public static float ab = 0.5f;
    e A = new e(this, e.c.BASELINE);
    e B = new e(this, e.c.CENTER_X);
    e C = new e(this, e.c.CENTER_Y);
    e D;
    protected e[] E;
    protected ArrayList<e> F;
    protected a[] G;
    public f H;
    int I;
    int J;
    public float K;
    public int L;
    public int M;
    public int N;
    int O;
    int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    protected int U;
    protected int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public float ac;
    public float ad;
    public Object ae;
    public int af;
    public int ag;
    public String ah;
    public String ai;
    boolean aj;
    boolean ak;
    boolean al;
    boolean am;
    public boolean an;
    public int ao;
    public int ap;
    boolean aq;
    boolean ar;
    public float[] as;
    protected f[] at;
    protected f[] au;
    f av;
    f aw;

    /* renamed from: c  reason: collision with root package name */
    public int f1923c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1924d = -1;

    /* renamed from: e  reason: collision with root package name */
    n f1925e;

    /* renamed from: f  reason: collision with root package name */
    n f1926f;

    /* renamed from: g  reason: collision with root package name */
    public int f1927g;

    /* renamed from: h  reason: collision with root package name */
    public int f1928h;

    /* renamed from: i  reason: collision with root package name */
    int[] f1929i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public int f1930j;

    /* renamed from: k  reason: collision with root package name */
    public int f1931k;

    /* renamed from: l  reason: collision with root package name */
    public float f1932l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f1933m;
    public int n;
    public float o = 1.0f;
    public boolean p;
    public boolean q;
    int r = -1;
    float s = 1.0f;
    public h t;
    public int[] u = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float v;
    e w = new e(this, e.c.LEFT);
    e x = new e(this, e.c.TOP);
    e y = new e(this, e.c.RIGHT);
    e z = new e(this, e.c.BOTTOM);

    public void c() {
    }

    public ArrayList<e> t() {
        return this.F;
    }

    public final int m() {
        return this.Q + this.U;
    }

    public final int n() {
        return this.R + this.V;
    }

    /* access modifiers changed from: protected */
    public final int o() {
        return this.M + this.U;
    }

    /* access modifiers changed from: protected */
    public final int p() {
        return this.N + this.V;
    }

    public final int q() {
        return this.M + this.I;
    }

    public final int r() {
        return this.N + this.J;
    }

    public final boolean s() {
        if (this.W > 0) {
            return true;
        }
        return false;
    }

    public final a w() {
        return this.G[0];
    }

    public final a x() {
        return this.G[1];
    }

    static {
        Covode.recordClassIndex(587);
    }

    public final n i() {
        if (this.f1925e == null) {
            this.f1925e = new n();
        }
        return this.f1925e;
    }

    public final n j() {
        if (this.f1926f == null) {
            this.f1926f = new n();
        }
        return this.f1926f;
    }

    public final int k() {
        if (this.ag == 8) {
            return 0;
        }
        return this.I;
    }

    public final int l() {
        if (this.ag == 8) {
            return 0;
        }
        return this.J;
    }

    public final boolean e() {
        if (this.f1928h == 0 && this.K == 0.0f && this.f1933m == 0 && this.n == 0 && this.G[1] == a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public void u() {
        int i2 = this.M;
        int i3 = this.N;
        this.Q = i2;
        this.R = i3;
        this.S = (this.I + i2) - i2;
        this.T = (this.J + i3) - i3;
    }

    public final void v() {
        int size = this.F.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.F.get(i2).c();
        }
    }

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

        static {
            Covode.recordClassIndex(589);
        }
    }

    public void b() {
        int i2 = 0;
        do {
            this.E[i2].f1909a.b();
            i2++;
        } while (i2 < 6);
    }

    public final boolean d() {
        if (this.f1927g == 0 && this.K == 0.0f && this.f1930j == 0 && this.f1931k == 0 && this.G[0] == a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i2 = 0;
        do {
            m mVar = this.E[i2].f1909a;
            e eVar = mVar.f1954a.f1912d;
            if (eVar != null) {
                if (eVar.f1912d == mVar.f1954a) {
                    mVar.f1960g = 4;
                    eVar.f1909a.f1960g = 4;
                }
                int b2 = mVar.f1954a.b();
                if (mVar.f1954a.f1911c == e.c.RIGHT || mVar.f1954a.f1911c == e.c.BOTTOM) {
                    b2 = -b2;
                }
                mVar.b(eVar.f1909a, b2);
            }
            i2++;
        } while (i2 < 6);
    }

    public final boolean h() {
        if (this.w.f1909a.f1967i == 1 && this.y.f1909a.f1967i == 1 && this.x.f1909a.f1967i == 1 && this.z.f1909a.f1967i == 1) {
            return true;
        }
        return false;
    }

    public void y() {
        int i2;
        int i3;
        int b2 = androidx.constraintlayout.a.e.b(this.w);
        int b3 = androidx.constraintlayout.a.e.b(this.x);
        int b4 = androidx.constraintlayout.a.e.b(this.y);
        int b5 = androidx.constraintlayout.a.e.b(this.z);
        int i4 = b5 - b3;
        if (b4 - b2 < 0 || i4 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b2 = 0;
            b3 = 0;
            b4 = 0;
            b5 = 0;
        }
        int i5 = b4 - b2;
        int i6 = b5 - b3;
        this.M = b2;
        this.N = b3;
        if (this.ag == 8) {
            this.I = 0;
            this.J = 0;
            return;
        }
        if (this.G[0] == a.FIXED && i5 < (i3 = this.I)) {
            i5 = i3;
        }
        if (this.G[1] == a.FIXED && i6 < (i2 = this.J)) {
            i6 = i2;
        }
        this.I = i5;
        this.J = i6;
        int i7 = this.Y;
        if (i6 < i7) {
            this.J = i7;
        }
        int i8 = this.X;
        if (i5 < i8) {
            this.I = i8;
        }
        this.am = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.a.f$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1934a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1935b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0094 */
        static {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.f.AnonymousClass1.<clinit>():void");
        }
    }

    public void f() {
        this.w.c();
        this.x.c();
        this.y.c();
        this.z.c();
        this.A.c();
        this.B.c();
        this.C.c();
        this.D.c();
        this.H = null;
        this.v = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = 0.0f;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        float f2 = ab;
        this.ac = f2;
        this.ad = f2;
        this.G[0] = a.FIXED;
        this.G[1] = a.FIXED;
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ai = null;
        this.aj = false;
        this.ak = false;
        this.ao = 0;
        this.ap = 0;
        this.aq = false;
        this.ar = false;
        float[] fArr = this.as;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1923c = -1;
        this.f1924d = -1;
        int[] iArr = this.u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1927g = 0;
        this.f1928h = 0;
        this.f1932l = 1.0f;
        this.o = 1.0f;
        this.f1931k = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.f1930j = 0;
        this.f1933m = 0;
        this.r = -1;
        this.s = 1.0f;
        n nVar = this.f1925e;
        if (nVar != null) {
            nVar.b();
        }
        n nVar2 = this.f1926f;
        if (nVar2 != null) {
            nVar2.b();
        }
        this.t = null;
        this.al = false;
        this.am = false;
        this.an = false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.ai != null) {
            str = "type: " + this.ai + " ";
        } else {
            str = str2;
        }
        StringBuilder append = sb.append(str);
        if (this.ah != null) {
            str2 = "id: " + this.ah + " ";
        }
        return append.append(str2).append("(").append(this.M).append(", ").append(this.N).append(") - (").append(this.I).append(" x ").append(this.J).append(") wrap: (").append(this.Z).append(" x ").append(this.aa).append(")").toString();
    }

    public f() {
        e eVar = new e(this, e.c.CENTER);
        this.D = eVar;
        this.E = new e[]{this.w, this.y, this.x, this.z, this.A, eVar};
        this.F = new ArrayList<>();
        this.G = new a[]{a.FIXED, a.FIXED};
        this.H = null;
        this.I = 0;
        this.J = 0;
        this.K = 0.0f;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        float f2 = ab;
        this.ac = f2;
        this.ad = f2;
        this.af = 0;
        this.ag = 0;
        this.ah = null;
        this.ai = null;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = 0;
        this.ap = 0;
        this.as = new float[]{-1.0f, -1.0f};
        this.at = new f[]{null, null};
        this.au = new f[]{null, null};
        this.av = null;
        this.aw = null;
        this.F.add(this.w);
        this.F.add(this.x);
        this.F.add(this.y);
        this.F.add(this.z);
        this.F.add(this.B);
        this.F.add(this.C);
        this.F.add(this.D);
        this.F.add(this.A);
    }

    public boolean a() {
        if (this.ag != 8) {
            return true;
        }
        return false;
    }

    public void a(int i2) {
        k.a(i2, this);
    }

    public final void c(int i2) {
        this.I = i2;
        int i3 = this.X;
        if (i2 < i3) {
            this.I = i3;
        }
    }

    public final void d(int i2) {
        this.J = i2;
        int i3 = this.Y;
        if (i2 < i3) {
            this.J = i3;
        }
    }

    public final void e(int i2) {
        if (i2 < 0) {
            this.X = 0;
        } else {
            this.X = i2;
        }
    }

    public final void f(int i2) {
        if (i2 < 0) {
            this.Y = 0;
        } else {
            this.Y = i2;
        }
    }

    public final int b(int i2) {
        if (i2 == 0) {
            return k();
        }
        if (i2 == 1) {
            return l();
        }
        return 0;
    }

    public final a g(int i2) {
        if (i2 == 0) {
            return this.G[0];
        }
        if (i2 == 1) {
            return this.G[1];
        }
        return null;
    }

    private boolean h(int i2) {
        int i3 = i2 * 2;
        if (this.E[i3].f1912d == null) {
            return false;
        }
        e eVar = this.E[i3].f1912d.f1912d;
        e[] eVarArr = this.E;
        if (eVar == eVarArr[i3]) {
            return false;
        }
        int i4 = i3 + 1;
        if (eVarArr[i4].f1912d == null || this.E[i4].f1912d.f1912d != this.E[i4]) {
            return false;
        }
        return true;
    }

    public final void a(a aVar) {
        this.G[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            c(this.Z);
        }
    }

    public e a(e.c cVar) {
        switch (AnonymousClass1.f1934a[cVar.ordinal()]) {
            case 1:
                return this.w;
            case 2:
                return this.x;
            case 3:
                return this.y;
            case 4:
                return this.z;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return this.A;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return this.D;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return this.B;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return this.C;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final void b(a aVar) {
        this.G[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            d(this.aa);
        }
    }

    public void a(c cVar) {
        this.w.a();
        this.x.a();
        this.y.a();
        this.z.a();
        this.A.a();
        this.D.a();
        this.B.a();
        this.C.a();
    }

    public final void b(androidx.constraintlayout.a.e eVar) {
        eVar.a(this.w);
        eVar.a(this.x);
        eVar.a(this.y);
        eVar.a(this.z);
        if (this.W > 0) {
            eVar.a(this.A);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.constraintlayout.a.e r63) {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.f.a(androidx.constraintlayout.a.e):void");
    }

    public void a(int i2, int i3) {
        this.U = i2;
        this.V = i3;
    }

    public final void b(int i2, int i3) {
        this.M = i2;
        int i4 = i3 - i2;
        this.I = i4;
        int i5 = this.X;
        if (i4 < i5) {
            this.I = i5;
        }
    }

    public final void c(int i2, int i3) {
        this.N = i2;
        int i4 = i3 - i2;
        this.J = i4;
        int i5 = this.Y;
        if (i4 < i5) {
            this.J = i5;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2, int i3) {
        if (i3 == 0) {
            this.O = i2;
        } else if (i3 == 1) {
            this.P = i2;
        }
    }

    public final void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            b(i2, i3);
        } else if (i4 == 1) {
            c(i2, i3);
        }
        this.am = true;
    }

    public final void a(e.c cVar, f fVar, e.c cVar2, int i2, int i3) {
        a(cVar).a(fVar.a(cVar2), i2, i3, e.b.STRONG, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.constraintlayout.a.e r28, boolean r29, androidx.constraintlayout.a.h r30, androidx.constraintlayout.a.h r31, androidx.constraintlayout.a.a.f.a r32, boolean r33, androidx.constraintlayout.a.a.e r34, androidx.constraintlayout.a.a.e r35, int r36, int r37, int r38, int r39, float r40, boolean r41, boolean r42, int r43, int r44, int r45, float r46, boolean r47) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.f.a(androidx.constraintlayout.a.e, boolean, androidx.constraintlayout.a.h, androidx.constraintlayout.a.h, androidx.constraintlayout.a.a.f$a, boolean, androidx.constraintlayout.a.a.e, androidx.constraintlayout.a.a.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
