package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f2067a = {0, 4, 8};

    /* renamed from: c  reason: collision with root package name */
    static SparseIntArray f2068c;

    /* renamed from: b  reason: collision with root package name */
    HashMap<Integer, a> f2069b = new HashMap<>();

    private static String e(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "baseline";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "start";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2069b.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f2069b.containsKey(Integer.valueOf(id))) {
                    this.f2069b.put(Integer.valueOf(id), new a((byte) 0));
                }
                a aVar2 = this.f2069b.get(Integer.valueOf(id));
                aVar2.a(id, aVar);
                aVar2.J = childAt.getVisibility();
                int i3 = Build.VERSION.SDK_INT;
                aVar2.U = childAt.getAlpha();
                aVar2.X = childAt.getRotation();
                aVar2.Y = childAt.getRotationX();
                aVar2.Z = childAt.getRotationY();
                aVar2.aa = childAt.getScaleX();
                aVar2.ab = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    aVar2.ac = pivotX;
                    aVar2.ad = pivotY;
                }
                aVar2.ae = childAt.getTranslationX();
                aVar2.af = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar2.ag = childAt.getTranslationZ();
                    if (aVar2.V) {
                        aVar2.W = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.ar = barrier.f2028a.f1895b;
                    aVar2.au = barrier.getReferencedIds();
                    aVar2.as = barrier.getType();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void a(int i2, String str) {
        d(i2).w = str;
    }

    public final void a() {
        d(R.id.d99).f2072c = -2;
    }

    public static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a  reason: collision with root package name */
        boolean f2070a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public boolean ar;
        public int as;
        public int at;
        public int[] au;
        public String av;

        /* renamed from: b  reason: collision with root package name */
        public int f2071b;

        /* renamed from: c  reason: collision with root package name */
        public int f2072c;

        /* renamed from: d  reason: collision with root package name */
        int f2073d;

        /* renamed from: e  reason: collision with root package name */
        public int f2074e;

        /* renamed from: f  reason: collision with root package name */
        public int f2075f;

        /* renamed from: g  reason: collision with root package name */
        public float f2076g;

        /* renamed from: h  reason: collision with root package name */
        public int f2077h;

        /* renamed from: i  reason: collision with root package name */
        public int f2078i;

        /* renamed from: j  reason: collision with root package name */
        public int f2079j;

        /* renamed from: k  reason: collision with root package name */
        public int f2080k;

        /* renamed from: l  reason: collision with root package name */
        public int f2081l;

        /* renamed from: m  reason: collision with root package name */
        public int f2082m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public float z;

        static {
            Covode.recordClassIndex(624);
        }

        private a() {
            this.f2074e = -1;
            this.f2075f = -1;
            this.f2076g = -1.0f;
            this.f2077h = -1;
            this.f2078i = -1;
            this.f2079j = -1;
            this.f2080k = -1;
            this.f2081l = -1;
            this.f2082m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.x = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.U = 1.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = 1.0f;
            this.aq = 1.0f;
            this.as = -1;
            this.at = -1;
        }

        public final /* synthetic */ Object clone() {
            a aVar = new a();
            aVar.f2070a = this.f2070a;
            aVar.f2071b = this.f2071b;
            aVar.f2072c = this.f2072c;
            aVar.f2074e = this.f2074e;
            aVar.f2075f = this.f2075f;
            aVar.f2076g = this.f2076g;
            aVar.f2077h = this.f2077h;
            aVar.f2078i = this.f2078i;
            aVar.f2079j = this.f2079j;
            aVar.f2080k = this.f2080k;
            aVar.f2081l = this.f2081l;
            aVar.f2082m = this.f2082m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.aa = this.aa;
            aVar.ab = this.ab;
            aVar.ac = this.ac;
            aVar.ad = this.ad;
            aVar.ae = this.ae;
            aVar.af = this.af;
            aVar.ag = this.ag;
            aVar.ah = this.ah;
            aVar.ai = this.ai;
            aVar.aj = this.aj;
            aVar.ak = this.ak;
            aVar.al = this.al;
            aVar.am = this.am;
            aVar.an = this.an;
            aVar.ao = this.ao;
            aVar.ap = this.ap;
            aVar.aq = this.aq;
            aVar.as = this.as;
            aVar.at = this.at;
            int[] iArr = this.au;
            if (iArr != null) {
                aVar.au = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.ar = this.ar;
            return aVar;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(ConstraintLayout.a aVar) {
            aVar.f2047d = this.f2077h;
            aVar.f2048e = this.f2078i;
            aVar.f2049f = this.f2079j;
            aVar.f2050g = this.f2080k;
            aVar.f2051h = this.f2081l;
            aVar.f2052i = this.f2082m;
            aVar.f2053j = this.n;
            aVar.f2054k = this.o;
            aVar.f2055l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.f2056m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.ah;
            aVar.U = this.ai;
            aVar.I = this.aj;
            aVar.J = this.ak;
            aVar.M = this.al;
            aVar.N = this.am;
            aVar.K = this.an;
            aVar.L = this.ao;
            aVar.O = this.ap;
            aVar.P = this.aq;
            aVar.S = this.C;
            aVar.f2046c = this.f2076g;
            aVar.f2044a = this.f2074e;
            aVar.f2045b = this.f2075f;
            aVar.width = this.f2071b;
            aVar.height = this.f2072c;
            int i2 = Build.VERSION.SDK_INT;
            aVar.setMarginStart(this.I);
            aVar.setMarginEnd(this.H);
            aVar.a();
        }

        public final void a(int i2, c.a aVar) {
            a(i2, (ConstraintLayout.a) aVar);
            this.U = aVar.an;
            this.X = aVar.aq;
            this.Y = aVar.ar;
            this.Z = aVar.as;
            this.aa = aVar.at;
            this.ab = aVar.au;
            this.ac = aVar.av;
            this.ad = aVar.aw;
            this.ae = aVar.ax;
            this.af = aVar.ay;
            this.ag = aVar.az;
            this.W = aVar.ap;
            this.V = aVar.ao;
        }

        public final void a(int i2, ConstraintLayout.a aVar) {
            this.f2073d = i2;
            this.f2077h = aVar.f2047d;
            this.f2078i = aVar.f2048e;
            this.f2079j = aVar.f2049f;
            this.f2080k = aVar.f2050g;
            this.f2081l = aVar.f2051h;
            this.f2082m = aVar.f2052i;
            this.n = aVar.f2053j;
            this.o = aVar.f2054k;
            this.p = aVar.f2055l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.f2056m;
            this.y = aVar.n;
            this.z = aVar.o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.f2076g = aVar.f2046c;
            this.f2074e = aVar.f2044a;
            this.f2075f = aVar.f2045b;
            this.f2071b = aVar.width;
            this.f2072c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            this.ah = aVar.T;
            this.ai = aVar.U;
            this.aj = aVar.I;
            this.ak = aVar.J;
            this.ah = aVar.T;
            this.al = aVar.M;
            this.am = aVar.N;
            this.an = aVar.K;
            this.ao = aVar.L;
            this.ap = aVar.O;
            this.aq = aVar.P;
            int i3 = Build.VERSION.SDK_INT;
            this.H = aVar.getMarginEnd();
            this.I = aVar.getMarginStart();
        }
    }

    static {
        Covode.recordClassIndex(623);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2068c = sparseIntArray;
        sparseIntArray.append(55, 25);
        f2068c.append(56, 26);
        f2068c.append(58, 29);
        f2068c.append(59, 30);
        f2068c.append(64, 36);
        f2068c.append(63, 35);
        f2068c.append(37, 4);
        f2068c.append(36, 3);
        f2068c.append(34, 1);
        f2068c.append(72, 6);
        f2068c.append(73, 7);
        f2068c.append(44, 17);
        f2068c.append(45, 18);
        f2068c.append(46, 19);
        f2068c.append(0, 27);
        f2068c.append(60, 32);
        f2068c.append(61, 33);
        f2068c.append(43, 10);
        f2068c.append(42, 9);
        f2068c.append(76, 13);
        f2068c.append(79, 16);
        f2068c.append(77, 14);
        f2068c.append(74, 11);
        f2068c.append(78, 15);
        f2068c.append(75, 12);
        f2068c.append(67, 40);
        f2068c.append(53, 39);
        f2068c.append(52, 41);
        f2068c.append(66, 42);
        f2068c.append(51, 20);
        f2068c.append(65, 37);
        f2068c.append(41, 5);
        f2068c.append(54, 75);
        f2068c.append(62, 75);
        f2068c.append(57, 75);
        f2068c.append(35, 75);
        f2068c.append(33, 75);
        f2068c.append(5, 24);
        f2068c.append(7, 28);
        f2068c.append(23, 31);
        f2068c.append(24, 8);
        f2068c.append(6, 34);
        f2068c.append(8, 2);
        f2068c.append(3, 23);
        f2068c.append(4, 21);
        f2068c.append(2, 22);
        f2068c.append(13, 43);
        f2068c.append(26, 44);
        f2068c.append(21, 45);
        f2068c.append(22, 46);
        f2068c.append(20, 60);
        f2068c.append(18, 47);
        f2068c.append(19, 48);
        f2068c.append(14, 49);
        f2068c.append(15, 50);
        f2068c.append(16, 51);
        f2068c.append(17, 52);
        f2068c.append(25, 53);
        f2068c.append(68, 54);
        f2068c.append(47, 55);
        f2068c.append(69, 56);
        f2068c.append(48, 57);
        f2068c.append(70, 58);
        f2068c.append(49, 59);
        f2068c.append(38, 61);
        f2068c.append(40, 62);
        f2068c.append(39, 63);
        f2068c.append(1, 38);
        f2068c.append(71, 69);
        f2068c.append(50, 70);
        f2068c.append(29, 71);
        f2068c.append(28, 72);
        f2068c.append(30, 73);
        f2068c.append(27, 74);
    }

    public final void c(int i2) {
        d(i2).S = 1;
    }

    public final void b(int i2) {
        d(R.id.d99).f2071b = i2;
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public final void a(int i2) {
        this.f2069b.remove(Integer.valueOf(i2));
    }

    public final a d(int i2) {
        if (!this.f2069b.containsKey(Integer.valueOf(i2))) {
            this.f2069b.put(Integer.valueOf(i2), new a((byte) 0));
        }
        return this.f2069b.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2069b.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f2069b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f2069b.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.at = 1;
                    }
                    if (aVar.at != -1 && aVar.at == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.as);
                        barrier.setAllowsGoneWidget(aVar.ar);
                        if (aVar.au != null) {
                            barrier.setReferencedIds(aVar.au);
                        } else if (aVar.av != null) {
                            aVar.au = a(barrier, aVar.av);
                            barrier.setReferencedIds(aVar.au);
                        }
                    }
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                    aVar.a(aVar2);
                    childAt.setLayoutParams(aVar2);
                    childAt.setVisibility(aVar.J);
                    int i3 = Build.VERSION.SDK_INT;
                    childAt.setAlpha(aVar.U);
                    childAt.setRotation(aVar.X);
                    childAt.setRotationX(aVar.Y);
                    childAt.setRotationY(aVar.Z);
                    childAt.setScaleX(aVar.aa);
                    childAt.setScaleY(aVar.ab);
                    if (!Float.isNaN(aVar.ac)) {
                        childAt.setPivotX(aVar.ac);
                    }
                    if (!Float.isNaN(aVar.ad)) {
                        childAt.setPivotY(aVar.ad);
                    }
                    childAt.setTranslationX(aVar.ae);
                    childAt.setTranslationY(aVar.af);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.ag);
                        if (aVar.V) {
                            childAt.setElevation(aVar.W);
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f2069b.get(num);
            if (aVar3.at != -1 && aVar3.at == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (aVar3.au != null) {
                    barrier2.setReferencedIds(aVar3.au);
                } else if (aVar3.av != null) {
                    aVar3.au = a(barrier2, aVar3.av);
                    barrier2.setReferencedIds(aVar3.au);
                }
                barrier2.setType(aVar3.as);
                ConstraintLayout.a bo_ = ConstraintLayout.bo_();
                barrier2.a();
                aVar3.a(bo_);
                constraintLayout.addView(barrier2, bo_);
            }
            if (aVar3.f2070a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a bo_2 = ConstraintLayout.bo_();
                aVar3.a(bo_2);
                constraintLayout.addView(guideline, bo_2);
            }
        }
    }

    public final void a(int i2, float f2) {
        d(i2).u = f2;
    }

    public final void b(int i2, int i3) {
        d(i2).al = i3;
    }

    private static int[] a(View view, String str) {
        int i2;
        Object a2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) view.getParent()).a(trim)) != null && (a2 instanceof Integer)) {
                i2 = ((Integer) a2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    public final void a(int i2, int i3) {
        if (this.f2069b.containsKey(Integer.valueOf(i2))) {
            a aVar = this.f2069b.get(Integer.valueOf(i2));
            switch (i3) {
                case 1:
                    aVar.f2078i = -1;
                    aVar.f2077h = -1;
                    aVar.D = -1;
                    aVar.K = -1;
                    return;
                case 2:
                    aVar.f2080k = -1;
                    aVar.f2079j = -1;
                    aVar.E = -1;
                    aVar.M = -1;
                    return;
                case 3:
                    aVar.f2082m = -1;
                    aVar.f2081l = -1;
                    aVar.F = -1;
                    aVar.L = -1;
                    return;
                case 4:
                    aVar.n = -1;
                    aVar.o = -1;
                    aVar.G = -1;
                    aVar.N = -1;
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    aVar.p = -1;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    aVar.q = -1;
                    aVar.r = -1;
                    aVar.I = -1;
                    aVar.P = -1;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    aVar.s = -1;
                    aVar.t = -1;
                    aVar.H = -1;
                    aVar.O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    static int a(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    public final void a(int i2, int i3, int i4) {
        a d2 = d(i2);
        switch (i3) {
            case 1:
                d2.D = i4;
                return;
            case 2:
                d2.E = i4;
                return;
            case 3:
                d2.F = i4;
                return;
            case 4:
                d2.G = i4;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                throw new IllegalArgumentException("baseline does not support margins");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                d2.I = i4;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                d2.H = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (!this.f2069b.containsKey(Integer.valueOf(i2))) {
            this.f2069b.put(Integer.valueOf(i2), new a((byte) 0));
        }
        a aVar = this.f2069b.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    aVar.f2077h = i4;
                    aVar.f2078i = -1;
                    return;
                } else if (i5 == 2) {
                    aVar.f2078i = i4;
                    aVar.f2077h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + e(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    aVar.f2079j = i4;
                    aVar.f2080k = -1;
                    return;
                } else if (i5 == 2) {
                    aVar.f2080k = i4;
                    aVar.f2079j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    aVar.f2081l = i4;
                    aVar.f2082m = -1;
                    aVar.p = -1;
                    return;
                } else if (i5 == 4) {
                    aVar.f2082m = i4;
                    aVar.f2081l = -1;
                    aVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
            case 4:
                if (i5 == 4) {
                    aVar.o = i4;
                    aVar.n = -1;
                    aVar.p = -1;
                    return;
                } else if (i5 == 3) {
                    aVar.n = i4;
                    aVar.o = -1;
                    aVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (i5 == 5) {
                    aVar.p = i4;
                    aVar.o = -1;
                    aVar.n = -1;
                    aVar.f2081l = -1;
                    aVar.f2082m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + e(i5) + " undefined");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                if (i5 == 6) {
                    aVar.r = i4;
                    aVar.q = -1;
                    return;
                } else if (i5 == 7) {
                    aVar.q = i4;
                    aVar.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                if (i5 == 7) {
                    aVar.t = i4;
                    aVar.s = -1;
                    return;
                } else if (i5 == 6) {
                    aVar.s = i4;
                    aVar.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(e(i3) + " to " + e(i5) + " unknown");
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        if (!this.f2069b.containsKey(Integer.valueOf(i2))) {
            this.f2069b.put(Integer.valueOf(i2), new a((byte) 0));
        }
        a aVar = this.f2069b.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    aVar.f2077h = i4;
                    aVar.f2078i = -1;
                } else if (i5 == 2) {
                    aVar.f2078i = i4;
                    aVar.f2077h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + e(i5) + " undefined");
                }
                aVar.D = i6;
                return;
            case 2:
                if (i5 == 1) {
                    aVar.f2079j = i4;
                    aVar.f2080k = -1;
                } else if (i5 == 2) {
                    aVar.f2080k = i4;
                    aVar.f2079j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
                aVar.E = i6;
                return;
            case 3:
                if (i5 == 3) {
                    aVar.f2081l = i4;
                    aVar.f2082m = -1;
                    aVar.p = -1;
                } else if (i5 == 4) {
                    aVar.f2082m = i4;
                    aVar.f2081l = -1;
                    aVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
                aVar.F = i6;
                return;
            case 4:
                if (i5 == 4) {
                    aVar.o = i4;
                    aVar.n = -1;
                    aVar.p = -1;
                } else if (i5 == 3) {
                    aVar.n = i4;
                    aVar.o = -1;
                    aVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
                aVar.G = i6;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (i5 == 5) {
                    aVar.p = i4;
                    aVar.o = -1;
                    aVar.n = -1;
                    aVar.f2081l = -1;
                    aVar.f2082m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + e(i5) + " undefined");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                if (i5 == 6) {
                    aVar.r = i4;
                    aVar.q = -1;
                } else if (i5 == 7) {
                    aVar.q = i4;
                    aVar.r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
                aVar.I = i6;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                if (i5 == 7) {
                    aVar.t = i4;
                    aVar.s = -1;
                } else if (i5 == 6) {
                    aVar.s = i4;
                    aVar.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + e(i5) + " undefined");
                }
                aVar.H = i6;
                return;
            default:
                throw new IllegalArgumentException(e(i3) + " to " + e(i5) + " unknown");
        }
    }
}
