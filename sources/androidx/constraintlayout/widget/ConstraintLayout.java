package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.a.a.f;
import androidx.constraintlayout.a.a.g;
import androidx.constraintlayout.a.a.i;
import androidx.constraintlayout.widget.b;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f2031a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    g f2032b = new g();

    /* renamed from: c  reason: collision with root package name */
    int f2033c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f2034d = -1;

    /* renamed from: e  reason: collision with root package name */
    int f2035e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f2036f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a> f2037g = new ArrayList<>(4);

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<f> f2038h = new ArrayList<>(100);

    /* renamed from: i  reason: collision with root package name */
    private int f2039i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f2040j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f2041k = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    private int f2042l = Integer.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2043m = true;
    private int n = 7;
    private b o = null;
    private int p = -1;
    private HashMap<String, Integer> q = new HashMap<>();
    private int r = -1;
    private int s = -1;
    private androidx.constraintlayout.a.f t;

    static {
        Covode.recordClassIndex(615);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getMaxHeight() {
        return this.f2042l;
    }

    public int getMaxWidth() {
        return this.f2041k;
    }

    public int getMinHeight() {
        return this.f2040j;
    }

    public int getMinWidth() {
        return this.f2039i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08e1, code lost:
        if (r6.I != 1) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0d5b, code lost:
        if (r2 != false) goto L_0x0d0a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0841  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0933  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 3496
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    protected static a bo_() {
        return new a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return bo_();
    }

    public int getOptimizationLevel() {
        return this.f2032b.aL;
    }

    private void b() {
        this.f2032b.z();
        androidx.constraintlayout.a.f fVar = this.t;
        if (fVar != null) {
            fVar.f2001c++;
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2043m = true;
        this.r = -1;
        this.s = -1;
        this.f2033c = -1;
        this.f2034d = -1;
        this.f2035e = 0;
        this.f2036f = 0;
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B;
        float C;
        int D = 1;
        public float E = -1.0f;
        public float F = -1.0f;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O = 1.0f;
        public float P = 1.0f;
        public int Q = -1;
        public int R = -1;
        public int S = -1;
        public boolean T;
        public boolean U;
        boolean V = true;
        boolean W = true;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f2044a = -1;
        boolean aa;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        float ah = 0.5f;
        int ai;
        int aj;
        float ak;
        f al = new f();
        public boolean am = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2045b = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f2046c = -1.0f;

        /* renamed from: d  reason: collision with root package name */
        public int f2047d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f2048e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2049f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2050g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f2051h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f2052i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f2053j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2054k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2055l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2056m = -1;
        public int n;
        public float o;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        static {
            Covode.recordClassIndex(616);
        }

        public final void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (this.height == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.V = false;
                if (this.width == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.W = false;
                if (this.height == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.f2046c != -1.0f || this.f2044a != -1 || this.f2045b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.al instanceof i)) {
                    this.al = new i();
                }
                ((i) this.al).h(this.S);
            }
        }

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        static class C0025a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f2057a;

            static {
                Covode.recordClassIndex(617);
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2057a = sparseIntArray;
                sparseIntArray.append(34, 8);
                sparseIntArray.append(35, 9);
                sparseIntArray.append(37, 10);
                sparseIntArray.append(38, 11);
                sparseIntArray.append(43, 12);
                sparseIntArray.append(42, 13);
                sparseIntArray.append(16, 14);
                sparseIntArray.append(15, 15);
                sparseIntArray.append(13, 16);
                sparseIntArray.append(17, 2);
                sparseIntArray.append(19, 3);
                sparseIntArray.append(18, 4);
                sparseIntArray.append(51, 49);
                sparseIntArray.append(52, 50);
                sparseIntArray.append(23, 5);
                sparseIntArray.append(24, 6);
                sparseIntArray.append(25, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(39, 17);
                sparseIntArray.append(40, 18);
                sparseIntArray.append(22, 19);
                sparseIntArray.append(21, 20);
                sparseIntArray.append(55, 21);
                sparseIntArray.append(58, 22);
                sparseIntArray.append(56, 23);
                sparseIntArray.append(53, 24);
                sparseIntArray.append(57, 25);
                sparseIntArray.append(54, 26);
                sparseIntArray.append(30, 29);
                sparseIntArray.append(44, 30);
                sparseIntArray.append(20, 44);
                sparseIntArray.append(32, 45);
                sparseIntArray.append(46, 46);
                sparseIntArray.append(31, 47);
                sparseIntArray.append(45, 48);
                sparseIntArray.append(11, 27);
                sparseIntArray.append(10, 28);
                sparseIntArray.append(47, 31);
                sparseIntArray.append(26, 32);
                sparseIntArray.append(49, 33);
                sparseIntArray.append(48, 34);
                sparseIntArray.append(50, 35);
                sparseIntArray.append(28, 36);
                sparseIntArray.append(27, 37);
                sparseIntArray.append(29, 38);
                sparseIntArray.append(33, 39);
                sparseIntArray.append(41, 40);
                sparseIntArray.append(36, 41);
                sparseIntArray.append(14, 42);
                sparseIntArray.append(12, 43);
            }
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f2044a = aVar.f2044a;
            this.f2045b = aVar.f2045b;
            this.f2046c = aVar.f2046c;
            this.f2047d = aVar.f2047d;
            this.f2048e = aVar.f2048e;
            this.f2049f = aVar.f2049f;
            this.f2050g = aVar.f2050g;
            this.f2051h = aVar.f2051h;
            this.f2052i = aVar.f2052i;
            this.f2053j = aVar.f2053j;
            this.f2054k = aVar.f2054k;
            this.f2055l = aVar.f2055l;
            this.f2056m = aVar.f2056m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
            this.s = aVar.s;
            this.t = aVar.t;
            this.u = aVar.u;
            this.v = aVar.v;
            this.w = aVar.w;
            this.x = aVar.x;
            this.y = aVar.y;
            this.z = aVar.z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
            this.F = aVar.F;
            this.G = aVar.G;
            this.H = aVar.H;
            this.T = aVar.T;
            this.U = aVar.U;
            this.I = aVar.I;
            this.J = aVar.J;
            this.K = aVar.K;
            this.M = aVar.M;
            this.L = aVar.L;
            this.N = aVar.N;
            this.O = aVar.O;
            this.P = aVar.P;
            this.Q = aVar.Q;
            this.R = aVar.R;
            this.S = aVar.S;
            this.V = aVar.V;
            this.W = aVar.W;
            this.X = aVar.X;
            this.Y = aVar.Y;
            this.ab = aVar.ab;
            this.ac = aVar.ac;
            this.ad = aVar.ad;
            this.ae = aVar.ae;
            this.af = aVar.af;
            this.ag = aVar.ag;
            this.ah = aVar.ah;
            this.al = aVar.al;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r8) {
            /*
            // Method dump skipped, instructions count: 260
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i2;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.js, R.attr.jt, R.attr.mn, R.attr.ph, R.attr.pi, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.a0y, R.attr.a0z, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a1h});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0025a.f2057a.get(index);
                switch (i4) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2056m);
                        this.f2056m = resourceId;
                        if (resourceId == -1) {
                            this.f2056m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        this.f2044a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2044a);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        this.f2045b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2045b);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        this.f2046c = obtainStyledAttributes.getFloat(index, this.f2046c);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2047d);
                        this.f2047d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2047d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2048e);
                        this.f2048e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2048e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2049f);
                        this.f2049f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2049f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2050g);
                        this.f2050g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2050g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2051h);
                        this.f2051h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2051h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2052i);
                        this.f2052i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2052i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2053j);
                        this.f2053j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2053j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2054k);
                        this.f2054k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2054k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2055l);
                        this.f2055l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2055l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case v.U /*{ENCODED_INT: 20}*/:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        break;
                    default:
                        switch (i4) {
                            case BuildConfig.VERSION_CODE /*{ENCODED_INT: 44}*/:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.B.substring(i2);
                                        if (substring2.length() > 0) {
                                            this.C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.B.substring(i2, indexOf2);
                                        String substring4 = this.B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void setConstraintSet(b bVar) {
        this.o = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void removeView(View view) {
        super.removeView(view);
        int i2 = Build.VERSION.SDK_INT;
    }

    public void setOptimizationLevel(int i2) {
        this.f2032b.aL = i2;
    }

    public final View a(int i2) {
        return this.f2031a.get(i2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f2042l) {
            this.f2042l = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f2041k) {
            this.f2041k = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f2040j) {
            this.f2040j = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f2039i) {
            this.f2039i = i2;
            requestLayout();
        }
    }

    public final f a(View view) {
        if (view == this) {
            return this.f2032b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).al;
    }

    public void setId(int i2) {
        this.f2031a.remove(getId());
        super.setId(i2);
        this.f2031a.put(getId(), this);
    }

    private final f b(int i2) {
        if (i2 == 0) {
            return this.f2032b;
        }
        View view = this.f2031a.get(i2);
        if (view == null) {
            view = findViewById(i2);
            if (view == null) {
                return null;
            }
            if (view != this && view.getParent() == this) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f2032b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).al;
    }

    public void onViewRemoved(View view) {
        int i2 = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.f2031a.remove(view.getId());
        f a2 = a(view);
        this.f2032b.a(a2);
        this.f2037g.remove(view);
        this.f2038h.remove(a2);
        this.f2043m = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public final Object a(Object obj) {
        HashMap<String, Integer> hashMap;
        if (!(obj instanceof String) || (hashMap = this.q) == null || !hashMap.containsKey(obj)) {
            return null;
        }
        return this.q.get(obj);
    }

    public void onViewAdded(View view) {
        int i2 = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        f a2 = a(view);
        if ((view instanceof Guideline) && !(a2 instanceof i)) {
            a aVar = (a) view.getLayoutParams();
            aVar.al = new i();
            aVar.Y = true;
            ((i) aVar.al).h(aVar.S);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.a();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f2037g.contains(aVar2)) {
                this.f2037g.add(aVar2);
            }
        }
        this.f2031a.put(view.getId(), view);
        this.f2043m = true;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i3;
                        float f3 = (float) i4;
                        float f4 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas2.drawLine(f2, f3, f4, f3, paint);
                        float f5 = (float) (i4 + ((int) ((((float) parseInt4) / 1920.0f) * height)));
                        canvas2.drawLine(f4, f3, f4, f5, paint);
                        canvas2.drawLine(f4, f5, f2, f5, paint);
                        canvas2.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas2.drawLine(f2, f3, f4, f5, paint);
                        canvas2 = canvas2;
                        canvas2.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        IOException e2;
        this.f2032b.ae = this;
        this.f2031a.put(getId(), this);
        b bVar = null;
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.js, R.attr.jt, R.attr.mn, R.attr.ph, R.attr.pi, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.a0y, R.attr.a0z, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a1h});
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i3);
                char c2 = 3;
                if (index == 3) {
                    this.f2039i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2039i);
                } else if (index == 4) {
                    this.f2040j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2040j);
                } else {
                    boolean z = true;
                    if (index == 1) {
                        this.f2041k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2041k);
                    } else {
                        int i4 = 2;
                        if (index == 2) {
                            this.f2042l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2042l);
                        } else if (index == 59) {
                            this.n = obtainStyledAttributes.getInt(index, this.n);
                        } else if (index == 8) {
                            int i5 = i2 == 1 ? 1 : 0;
                            int i6 = i2 == 1 ? 1 : 0;
                            int i7 = i2 == 1 ? 1 : 0;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i5);
                            try {
                                b bVar2 = new b();
                                this.o = bVar2;
                                Context context = getContext();
                                try {
                                    XmlResourceParser xml = context.getResources().getXml(resourceId);
                                    try {
                                        int eventType = xml.getEventType();
                                        while (eventType != z) {
                                            if (eventType == 0) {
                                                xml.getName();
                                            } else if (eventType == i4) {
                                                String name = xml.getName();
                                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                                byte b2 = i2 == 1 ? (byte) 1 : 0;
                                                byte b3 = i2 == 1 ? (byte) 1 : 0;
                                                b.a aVar = new b.a(b2);
                                                int[] iArr = new int[80];
                                                char c3 = i2 == 1 ? 1 : 0;
                                                char c4 = i2 == 1 ? 1 : 0;
                                                iArr[c3] = 16842948;
                                                char c5 = z ? 1 : 0;
                                                char c6 = z ? 1 : 0;
                                                char c7 = z ? 1 : 0;
                                                char c8 = z ? 1 : 0;
                                                iArr[c5] = 16842960;
                                                iArr[i4] = 16842972;
                                                iArr[c2] = 16842996;
                                                iArr[4] = 16842997;
                                                iArr[5] = 16842999;
                                                iArr[6] = 16843000;
                                                iArr[7] = 16843001;
                                                iArr[8] = 16843002;
                                                iArr[9] = 16843039;
                                                iArr[10] = 16843040;
                                                iArr[11] = 16843071;
                                                iArr[12] = 16843072;
                                                iArr[13] = 16843551;
                                                iArr[14] = 16843552;
                                                iArr[15] = 16843553;
                                                iArr[16] = 16843554;
                                                iArr[17] = 16843555;
                                                iArr[18] = 16843556;
                                                iArr[19] = 16843557;
                                                iArr[20] = 16843558;
                                                iArr[21] = 16843559;
                                                iArr[22] = 16843560;
                                                iArr[23] = 16843701;
                                                iArr[24] = 16843702;
                                                iArr[25] = 16843770;
                                                iArr[26] = 16843840;
                                                iArr[27] = R.attr.js;
                                                iArr[28] = R.attr.jt;
                                                iArr[29] = R.attr.mn;
                                                iArr[30] = R.attr.pi;
                                                iArr[31] = R.attr.zo;
                                                iArr[32] = R.attr.zp;
                                                iArr[33] = R.attr.zq;
                                                iArr[34] = R.attr.zr;
                                                iArr[35] = R.attr.zs;
                                                iArr[36] = R.attr.zt;
                                                iArr[37] = R.attr.zu;
                                                iArr[38] = R.attr.zv;
                                                iArr[39] = R.attr.zw;
                                                iArr[40] = R.attr.zx;
                                                iArr[41] = R.attr.zy;
                                                iArr[42] = R.attr.zz;
                                                iArr[43] = R.attr.a00;
                                                iArr[44] = R.attr.a01;
                                                iArr[45] = R.attr.a02;
                                                iArr[46] = R.attr.a03;
                                                iArr[47] = R.attr.a04;
                                                iArr[48] = R.attr.a05;
                                                iArr[49] = R.attr.a06;
                                                iArr[50] = R.attr.a07;
                                                iArr[51] = R.attr.a08;
                                                iArr[52] = R.attr.a09;
                                                iArr[53] = R.attr.a0_;
                                                iArr[54] = R.attr.a0a;
                                                iArr[55] = R.attr.a0b;
                                                iArr[56] = R.attr.a0c;
                                                iArr[57] = R.attr.a0d;
                                                iArr[58] = R.attr.a0e;
                                                iArr[59] = R.attr.a0f;
                                                try {
                                                    iArr[60] = R.attr.a0g;
                                                    iArr[61] = R.attr.a0h;
                                                    iArr[62] = R.attr.a0i;
                                                    iArr[63] = R.attr.a0j;
                                                    iArr[64] = R.attr.a0k;
                                                    iArr[65] = R.attr.a0l;
                                                    iArr[66] = R.attr.a0m;
                                                    iArr[67] = R.attr.a0n;
                                                    iArr[68] = R.attr.a0o;
                                                    iArr[69] = R.attr.a0p;
                                                    iArr[70] = R.attr.a0q;
                                                    iArr[71] = R.attr.a0r;
                                                    iArr[72] = R.attr.a0y;
                                                    iArr[73] = R.attr.a0z;
                                                    iArr[74] = R.attr.a13;
                                                    iArr[75] = R.attr.a14;
                                                    iArr[76] = R.attr.a15;
                                                    iArr[77] = R.attr.a16;
                                                    iArr[78] = R.attr.a17;
                                                    iArr[79] = R.attr.a18;
                                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, iArr);
                                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                                    while (i2 < indexCount2) {
                                                        int index2 = obtainStyledAttributes2.getIndex(i2 == 1 ? 1 : 0);
                                                        int i8 = b.f2068c.get(index2);
                                                        switch (i8) {
                                                            case 1:
                                                                aVar.p = b.a(obtainStyledAttributes2, index2, aVar.p);
                                                                break;
                                                            case 2:
                                                                aVar.G = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.G);
                                                                break;
                                                            case 3:
                                                                aVar.o = b.a(obtainStyledAttributes2, index2, aVar.o);
                                                                break;
                                                            case 4:
                                                                aVar.n = b.a(obtainStyledAttributes2, index2, aVar.n);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                                                aVar.w = obtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                                                aVar.A = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.A);
                                                                break;
                                                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                                                aVar.B = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.B);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                                                aVar.H = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.H);
                                                                break;
                                                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                                                aVar.t = b.a(obtainStyledAttributes2, index2, aVar.t);
                                                                break;
                                                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                                                aVar.s = b.a(obtainStyledAttributes2, index2, aVar.s);
                                                                break;
                                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                                                aVar.N = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.N);
                                                                break;
                                                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                                                aVar.O = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.O);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                                                aVar.K = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.K);
                                                                break;
                                                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                                                aVar.M = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.M);
                                                                break;
                                                            case 15:
                                                                aVar.P = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.P);
                                                                break;
                                                            case 16:
                                                                aVar.L = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.L);
                                                                break;
                                                            case 17:
                                                                aVar.f2074e = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2074e);
                                                                break;
                                                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                                                aVar.f2075f = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2075f);
                                                                break;
                                                            case 19:
                                                                aVar.f2076g = obtainStyledAttributes2.getFloat(index2, aVar.f2076g);
                                                                break;
                                                            case v.U /*{ENCODED_INT: 20}*/:
                                                                aVar.u = obtainStyledAttributes2.getFloat(index2, aVar.u);
                                                                break;
                                                            case 21:
                                                                aVar.f2072c = obtainStyledAttributes2.getLayoutDimension(index2, aVar.f2072c);
                                                                break;
                                                            case 22:
                                                                aVar.J = obtainStyledAttributes2.getInt(index2, aVar.J);
                                                                aVar.J = b.f2067a[aVar.J];
                                                                break;
                                                            case 23:
                                                                aVar.f2071b = obtainStyledAttributes2.getLayoutDimension(index2, aVar.f2071b);
                                                                break;
                                                            case 24:
                                                                aVar.D = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.D);
                                                                break;
                                                            case 25:
                                                                aVar.f2077h = b.a(obtainStyledAttributes2, index2, aVar.f2077h);
                                                                break;
                                                            case 26:
                                                                aVar.f2078i = b.a(obtainStyledAttributes2, index2, aVar.f2078i);
                                                                break;
                                                            case 27:
                                                                aVar.C = obtainStyledAttributes2.getInt(index2, aVar.C);
                                                                break;
                                                            case 28:
                                                                aVar.E = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.E);
                                                                break;
                                                            case 29:
                                                                aVar.f2079j = b.a(obtainStyledAttributes2, index2, aVar.f2079j);
                                                                break;
                                                            case 30:
                                                                aVar.f2080k = b.a(obtainStyledAttributes2, index2, aVar.f2080k);
                                                                break;
                                                            case 31:
                                                                aVar.I = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.I);
                                                                break;
                                                            case 32:
                                                                aVar.q = b.a(obtainStyledAttributes2, index2, aVar.q);
                                                                break;
                                                            case 33:
                                                                aVar.r = b.a(obtainStyledAttributes2, index2, aVar.r);
                                                                break;
                                                            case 34:
                                                                aVar.F = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.F);
                                                                break;
                                                            case 35:
                                                                aVar.f2082m = b.a(obtainStyledAttributes2, index2, aVar.f2082m);
                                                                break;
                                                            case 36:
                                                                aVar.f2081l = b.a(obtainStyledAttributes2, index2, aVar.f2081l);
                                                                break;
                                                            case 37:
                                                                aVar.v = obtainStyledAttributes2.getFloat(index2, aVar.v);
                                                                break;
                                                            case 38:
                                                                aVar.f2073d = obtainStyledAttributes2.getResourceId(index2, aVar.f2073d);
                                                                break;
                                                            case 39:
                                                                aVar.R = obtainStyledAttributes2.getFloat(index2, aVar.R);
                                                                break;
                                                            case 40:
                                                                aVar.Q = obtainStyledAttributes2.getFloat(index2, aVar.Q);
                                                                break;
                                                            case 41:
                                                                aVar.S = obtainStyledAttributes2.getInt(index2, aVar.S);
                                                                break;
                                                            case 42:
                                                                aVar.T = obtainStyledAttributes2.getInt(index2, aVar.T);
                                                                break;
                                                            case 43:
                                                                aVar.U = obtainStyledAttributes2.getFloat(index2, aVar.U);
                                                                break;
                                                            case BuildConfig.VERSION_CODE /*{ENCODED_INT: 44}*/:
                                                                aVar.V = z;
                                                                aVar.W = obtainStyledAttributes2.getDimension(index2, aVar.W);
                                                                break;
                                                            case 45:
                                                                aVar.Y = obtainStyledAttributes2.getFloat(index2, aVar.Y);
                                                                break;
                                                            case 46:
                                                                aVar.Z = obtainStyledAttributes2.getFloat(index2, aVar.Z);
                                                                break;
                                                            case 47:
                                                                aVar.aa = obtainStyledAttributes2.getFloat(index2, aVar.aa);
                                                                break;
                                                            case 48:
                                                                aVar.ab = obtainStyledAttributes2.getFloat(index2, aVar.ab);
                                                                break;
                                                            case 49:
                                                                aVar.ac = obtainStyledAttributes2.getFloat(index2, aVar.ac);
                                                                break;
                                                            case 50:
                                                                aVar.ad = obtainStyledAttributes2.getFloat(index2, aVar.ad);
                                                                break;
                                                            case 51:
                                                                aVar.ae = obtainStyledAttributes2.getDimension(index2, aVar.ae);
                                                                break;
                                                            case 52:
                                                                aVar.af = obtainStyledAttributes2.getDimension(index2, aVar.af);
                                                                break;
                                                            case 53:
                                                                aVar.ag = obtainStyledAttributes2.getDimension(index2, aVar.ag);
                                                                break;
                                                            default:
                                                                switch (i8) {
                                                                    case AudiencePingIntervalSetting.DEFAULT /*{ENCODED_INT: 60}*/:
                                                                        aVar.X = obtainStyledAttributes2.getFloat(index2, aVar.X);
                                                                        break;
                                                                    case 61:
                                                                        aVar.x = b.a(obtainStyledAttributes2, index2, aVar.x);
                                                                        break;
                                                                    case 62:
                                                                        aVar.y = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.y);
                                                                        break;
                                                                    case 63:
                                                                        aVar.z = obtainStyledAttributes2.getFloat(index2, aVar.z);
                                                                        break;
                                                                    default:
                                                                        switch (i8) {
                                                                            case 69:
                                                                                aVar.ap = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                break;
                                                                            case 70:
                                                                                aVar.aq = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                break;
                                                                            case 71:
                                                                                break;
                                                                            case 72:
                                                                                aVar.as = obtainStyledAttributes2.getInt(index2, aVar.as);
                                                                                break;
                                                                            case 73:
                                                                                aVar.av = obtainStyledAttributes2.getString(index2);
                                                                                break;
                                                                            case 74:
                                                                                aVar.ar = obtainStyledAttributes2.getBoolean(index2, aVar.ar);
                                                                                break;
                                                                            case 75:
                                                                                Integer.toHexString(index2);
                                                                                b.f2068c.get(index2);
                                                                                break;
                                                                            default:
                                                                                Integer.toHexString(index2);
                                                                                b.f2068c.get(index2);
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                        i2++;
                                                        z = true;
                                                    }
                                                    obtainStyledAttributes2.recycle();
                                                    if (name.equalsIgnoreCase("Guideline")) {
                                                        aVar.f2070a = true;
                                                    }
                                                    bVar2.f2069b.put(Integer.valueOf(aVar.f2073d), aVar);
                                                } catch (XmlPullParserException unused) {
                                                } catch (IOException e3) {
                                                    e2 = e3;
                                                    try {
                                                        e2.printStackTrace();
                                                        bVar = null;
                                                    } catch (Resources.NotFoundException unused2) {
                                                    }
                                                    this.p = resourceId;
                                                    i3++;
                                                    i2 = 0;
                                                }
                                            }
                                            eventType = xml.next();
                                            i2 = 0;
                                            c2 = 3;
                                            z = true;
                                            i4 = 2;
                                        }
                                    } catch (XmlPullParserException unused3) {
                                    } catch (IOException e4) {
                                        e2 = e4;
                                        e2.printStackTrace();
                                    }
                                    bVar = null;
                                } catch (Resources.NotFoundException unused4) {
                                    bVar = null;
                                    this.o = bVar;
                                    this.p = resourceId;
                                    i3++;
                                    i2 = 0;
                                }
                            } catch (Resources.NotFoundException unused5) {
                                this.o = bVar;
                                this.p = resourceId;
                                i3++;
                                i2 = 0;
                            }
                            this.p = resourceId;
                        }
                    }
                }
                i3++;
                i2 = 0;
            }
            obtainStyledAttributes.recycle();
        }
        this.f2032b.aL = this.n;
    }

    private void a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.q == null) {
                this.q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        int i3 = Build.VERSION.SDK_INT;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            a aVar = (a) childAt.getLayoutParams();
            f fVar = aVar.al;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.aa) {
                int m2 = fVar.m();
                int n2 = fVar.n();
                int k2 = fVar.k() + m2;
                int l2 = fVar.l() + n2;
                childAt.layout(m2, n2, k2, l2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m2, n2, k2, l2);
                }
            }
        }
        int size = this.f2037g.size();
        if (size > 0) {
            do {
                this.f2037g.get(i6).b();
                i6++;
            } while (i6 < size);
        }
    }
}
