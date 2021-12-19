package com.bytedance.android.livesdk.l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.c;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.p;
import com.bytedance.ies.dmt.ui.widget.RectCornerRelativeLayout;
import com.zhiliaoapp.musically.R;

public class b extends Dialog {
    public static float E = 0.5f;
    private static final Float Q = Float.valueOf(17.0f);
    private static final Float R;
    private static final Float S = Float.valueOf(0.75f);
    private static final Float T = Float.valueOf(16.0f);
    private static final Float U;
    private static final Float V = Float.valueOf(20.0f);
    private static final Float W = Float.valueOf(2.0f);
    private static final Float X;
    private static final Float Y;
    public boolean A;
    public boolean B;
    public boolean C = true;
    public boolean D;
    public int F;
    public p.a G;
    public DialogInterface.OnDismissListener H;
    public DialogInterface.OnShowListener I;
    public int J;
    public int K;
    public boolean L = true;
    public View M;
    public boolean N;
    public int O = -1;
    public boolean P;
    private Context Z;

    /* renamed from: a  reason: collision with root package name */
    public LiveTextView f18271a;
    private LiveTextView aa;
    private LiveTextView ab;
    private LiveTextView ac;
    private LiveTextView ad;
    private LiveTextView ae;
    private LiveTextView af;
    private ImageView ag;
    private ImageView ah;
    private View ai;
    private View aj;
    private View ak;
    private View al;
    private FrameLayout am;
    private FrameLayout an;
    private FrameLayout ao;
    private FrameLayout ap;
    private FrameLayout aq;
    private LinearLayout ar;
    private RelativeLayout as;
    private RelativeLayout at;
    private View au;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f18272b;

    /* renamed from: c  reason: collision with root package name */
    public View f18273c;

    /* renamed from: d  reason: collision with root package name */
    public View f18274d;

    /* renamed from: e  reason: collision with root package name */
    public View f18275e;

    /* renamed from: f  reason: collision with root package name */
    public View f18276f;

    /* renamed from: g  reason: collision with root package name */
    RectCornerRelativeLayout f18277g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f18278h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f18279i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f18280j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f18281k;

    /* renamed from: l  reason: collision with root package name */
    public String f18282l;

    /* renamed from: m  reason: collision with root package name */
    public String f18283m;
    public int n;
    public int o;
    public int p;
    public int q;
    public DialogInterface.OnClickListener r;
    public DialogInterface.OnClickListener s;
    public DialogInterface.OnClickListener t;
    public View.OnClickListener u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    private int a() {
        int b2 = (int) n.b(this.Z, 310.0f);
        double a2 = (double) n.a(this.Z);
        Double.isNaN(a2);
        int i2 = (int) (a2 * 0.8d);
        return i2 > b2 ? b2 : i2;
    }

    static {
        Covode.recordClassIndex(10296);
        Float valueOf = Float.valueOf(15.0f);
        R = valueOf;
        Float valueOf2 = Float.valueOf(8.0f);
        U = valueOf2;
        X = valueOf2;
        Y = valueOf;
    }

    public static class a {
        private View.OnClickListener A;
        private Context B;
        private View C;
        private View D;
        private View E;
        private int F;
        private int G;
        private boolean H;
        private boolean I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private boolean N;
        private int O = 17;
        private LiveTextView P;
        private boolean Q = true;
        private boolean R;

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f18284a;

        /* renamed from: b  reason: collision with root package name */
        public String f18285b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f18286c;

        /* renamed from: d  reason: collision with root package name */
        public int f18287d;

        /* renamed from: e  reason: collision with root package name */
        public int f18288e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnDismissListener f18289f;

        /* renamed from: g  reason: collision with root package name */
        public DialogInterface.OnShowListener f18290g;

        /* renamed from: h  reason: collision with root package name */
        public View f18291h;

        /* renamed from: i  reason: collision with root package name */
        public View f18292i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f18293j;

        /* renamed from: k  reason: collision with root package name */
        public int f18294k;

        /* renamed from: l  reason: collision with root package name */
        public int f18295l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f18296m = true;
        public int n = -1;
        public boolean o;
        public DialogInterface.OnKeyListener p;
        public DialogInterface.OnCancelListener q;
        private CharSequence r;
        private CharSequence s;
        private CharSequence t;
        private String u;
        private int v;
        private DialogInterface.OnClickListener w;
        private DialogInterface.OnClickListener x;
        private DialogInterface.OnClickListener y;
        private p.a z;

        static {
            Covode.recordClassIndex(10297);
        }

        public final b a() {
            b bVar;
            if (this.G == 0) {
                bVar = new b(this.B);
            } else {
                bVar = new b(this.B, this.G);
            }
            bVar.n = this.f18287d;
            bVar.f18278h = this.f18284a;
            bVar.f18282l = this.f18285b;
            bVar.f18279i = this.r;
            bVar.f18281k = this.t;
            bVar.f18280j = this.s;
            bVar.f18283m = this.u;
            bVar.r = this.w;
            bVar.s = this.x;
            bVar.t = this.y;
            bVar.f18275e = this.E;
            bVar.f18273c = this.C;
            bVar.f18274d = this.D;
            bVar.q = this.F;
            bVar.v = this.H;
            bVar.x = this.J;
            bVar.w = this.I;
            bVar.y = this.K;
            bVar.F = this.O;
            bVar.z = this.f18293j;
            bVar.A = this.L;
            bVar.u = this.A;
            bVar.f18271a = this.P;
            bVar.f18272b = this.f18286c;
            bVar.H = this.f18289f;
            bVar.G = this.z;
            bVar.o = this.v;
            bVar.p = this.f18288e;
            bVar.I = this.f18290g;
            bVar.J = this.f18294k;
            bVar.K = this.f18295l;
            bVar.L = this.f18296m;
            bVar.M = this.f18291h;
            bVar.N = this.R;
            bVar.f18276f = this.f18292i;
            bVar.C = this.Q;
            bVar.D = this.N;
            bVar.B = this.M;
            bVar.O = this.n;
            bVar.P = this.o;
            bVar.setOnKeyListener(this.p);
            bVar.setOnCancelListener(this.q);
            return bVar;
        }

        public final a a(int i2) {
            this.f18284a = this.B.getString(i2);
            return this;
        }

        public final a b(int i2) {
            this.f18285b = this.B.getString(i2);
            return this;
        }

        public a(Context context) {
            this.B = context;
        }

        public final a a(CharSequence charSequence, View.OnClickListener onClickListener) {
            this.r = charSequence;
            this.A = onClickListener;
            return this;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z2) {
            this.s = charSequence;
            this.w = onClickListener;
            this.I = z2;
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z2) {
            this.t = charSequence;
            this.x = onClickListener;
            this.J = z2;
            return this;
        }

        public final a a(int i2, DialogInterface.OnClickListener onClickListener, boolean z2) {
            return a(this.B.getString(i2), onClickListener, z2);
        }

        public final a b(int i2, DialogInterface.OnClickListener onClickListener, boolean z2) {
            return b(this.B.getString(i2), onClickListener, z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        int b2;
        int b3;
        float f2;
        MethodCollector.i(9422);
        super.onStart();
        this.f18277g.setAlpha(0.0f);
        this.au.setVisibility(0);
        if (this.f18271a != null) {
            this.ab.setVisibility(8);
            this.f18271a.setTextColor(androidx.core.content.b.c(this.Z, R.color.c4));
            this.f18271a.setTextSize(1, 15.0f);
            c.a(this.f18271a, 400);
            int b4 = (int) n.b(this.Z, 8.0f);
            this.f18271a.setPadding(b4, 0, b4, 0);
            this.f18271a.setGravity(17);
            LiveTextView liveTextView = this.f18271a;
            this.ab = liveTextView;
            this.an.addView(liveTextView);
        } else {
            this.ab.setVisibility(0);
            this.ab.setTextIsSelectable(this.P);
            if (!TextUtils.isEmpty(this.f18272b)) {
                this.ab.setText(this.f18272b);
            } else if (!TextUtils.isEmpty(this.f18282l)) {
                this.ab.setText(this.f18282l);
            } else {
                this.au.setVisibility(8);
            }
            this.ab.setGravity(this.F);
        }
        if (!TextUtils.isEmpty(this.f18278h)) {
            this.aa.setText(this.f18278h);
            this.ab.setTextSize(1, R.floatValue());
            this.ab.setTextColor(androidx.core.content.b.c(this.Z, R.color.c4));
        } else {
            this.ab.setTextSize(1, Q.floatValue());
            this.ab.setTextColor(androidx.core.content.b.c(this.Z, R.color.bx));
        }
        if (this.f18279i != null) {
            this.ac.setVisibility(0);
            this.ac.setText(this.f18279i);
            if (this.u != null) {
                this.ac.setTextColor(androidx.core.content.b.c(this.Z, R.color.bh));
                this.ac.setOnClickListener(this.u);
            }
            int i2 = Build.VERSION.SDK_INT;
            this.ac.setCompoundDrawablesRelativeWithIntrinsicBounds(this.o, 0, this.p, 0);
        }
        this.ae.setText(this.f18280j);
        this.am.setBackgroundColor(this.q);
        if (this.q != 0) {
            this.am.getLayoutParams().height = (int) n.b(this.Z, 140.0f);
        }
        if (this.v) {
            this.ah.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f18281k)) {
            this.ad.setVisibility(8);
            this.ak.setVisibility(8);
            this.ae.setBackgroundResource(R.drawable.cbc);
        } else {
            this.ad.setText(this.f18281k);
        }
        if (TextUtils.isEmpty(this.f18283m)) {
            this.ad.setTextColor(androidx.core.content.b.c(this.Z, R.color.c4));
            c.a(this.ad, 400);
            this.af.setVisibility(8);
            this.al.setVisibility(8);
        } else {
            this.af.setText(this.f18283m);
        }
        if (this.A) {
            if (this.z) {
                this.aj.setVisibility(8);
                this.ak.setVisibility(8);
                this.al.setVisibility(8);
                this.ae.setBackground(this.Z.getResources().getDrawable(R.drawable.beh));
                int b5 = (int) n.b(this.Z, V.floatValue());
                int b6 = (int) n.b(this.Z, W.floatValue());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ae.getLayoutParams());
                layoutParams.setMargins(b5, b6, b5, b6);
                this.ae.setLayoutParams(layoutParams);
                this.ae.setTextColor(androidx.core.content.b.c(this.Z, R.color.a2r));
                if (TextUtils.isEmpty(this.f18281k) || TextUtils.isEmpty(this.f18283m)) {
                    f2 = n.b(this.Z, T.floatValue());
                } else {
                    f2 = n.b(this.Z, U.floatValue());
                }
                this.ar.setPadding(0, 0, 0, (int) f2);
                this.ad.setBackground(null);
                this.af.setBackground(null);
                LiveTextView liveTextView2 = this.ad;
                Float f3 = S;
                com.bytedance.ies.dmt.ui.f.c.a(liveTextView2, f3.floatValue());
                com.bytedance.ies.dmt.ui.f.c.a(this.af, f3.floatValue());
                if (TextUtils.isEmpty(this.f18283m)) {
                    this.ad.setTextColor(androidx.core.content.b.c(this.Z, R.color.c5));
                } else {
                    this.af.setTextColor(androidx.core.content.b.c(this.Z, R.color.c5));
                }
            } else {
                this.ae.setTextColor(androidx.core.content.b.c(this.Z, R.color.bd));
            }
        }
        if (this.B) {
            c.a(this.ad, 600);
            this.ad.setTextColor(androidx.core.content.b.c(this.Z, R.color.bx));
        }
        if (this.f18273c != null) {
            this.ab.setVisibility(8);
            this.aa.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.aj.getLayoutParams()).topMargin = 0;
            this.as.removeAllViews();
            this.as.addView(this.f18273c);
        }
        if (this.f18275e != null) {
            this.am.setVisibility(8);
            this.at.setVisibility(0);
            this.at.removeAllViews();
            this.at.addView(this.f18275e);
        }
        if (TextUtils.isEmpty(this.f18278h)) {
            this.aa.setVisibility(8);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.au.getLayoutParams();
            if (this.M == null || this.f18274d != null || this.n > 0) {
                layoutParams2.topMargin = (int) n.b(this.Z, 24.0f);
            } else {
                layoutParams2.topMargin = (int) n.b(this.Z, 16.0f);
            }
            this.au.setLayoutParams(layoutParams2);
            this.ab.setTextSize(1, 17.0f);
        }
        if (this.f18274d != null) {
            this.am.removeView(this.ag);
            this.am.addView(this.f18274d, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            int i3 = this.n;
            if (i3 > 0) {
                this.ag.setImageResource(i3);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.aa.getLayoutParams();
                layoutParams3.setMargins(0, 0, 0, 0);
                this.aa.setLayoutParams(layoutParams3);
            } else if (this.M != null) {
                this.am.setVisibility(8);
                this.ao.setVisibility(0);
                int i4 = this.J;
                if (i4 == 0) {
                    b2 = -2;
                } else {
                    b2 = (int) n.b(this.Z, (float) i4);
                }
                int i5 = this.K;
                if (i5 == 0) {
                    b3 = -2;
                } else {
                    b3 = (int) n.b(this.Z, (float) i5);
                }
                this.ap.addView(this.M, 0, new FrameLayout.LayoutParams(b2, b3));
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.aa.getLayoutParams();
                layoutParams4.setMargins(0, (int) n.b(this.Z, 16.0f), 0, 0);
                this.aa.setLayoutParams(layoutParams4);
            } else {
                this.am.setVisibility(8);
            }
        }
        if (this.N) {
            this.ah.setImageResource(2131232602);
        }
        if (this.f18276f != null) {
            this.aa.setTextSize(1, Q.floatValue());
            this.aq.setVisibility(0);
            this.aq.addView(this.f18276f, 0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (!this.C) {
            Boolean bool = false;
            if (this.A) {
                if (bool.booleanValue()) {
                    this.ae.setTextColor(androidx.core.content.b.c(this.Z, R.color.a9));
                    this.ae.setBackground(this.Z.getResources().getDrawable(R.drawable.beh));
                } else {
                    this.ae.setTextColor(androidx.core.content.b.c(this.Z, R.color.bz));
                    this.ae.setBackgroundColor(androidx.core.content.b.c(this.Z, R.color.f159923g));
                }
            }
            this.ae.setEnabled(bool.booleanValue());
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.f18282l)) {
                this.aa.setTextSize(1, Q.floatValue());
            }
            this.ae.setTextColor(androidx.core.content.b.c(this.Z, R.color.bx));
            this.ae.setBackground(this.Z.getResources().getDrawable(R.drawable.cd9));
            this.ad.setTextColor(androidx.core.content.b.c(this.Z, R.color.bx));
            this.ad.setBackground(this.Z.getResources().getDrawable(R.drawable.cd9));
            int b7 = (int) n.b(this.Z, V.floatValue());
            int b8 = (int) n.b(this.Z, W.floatValue());
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.ad.getLayoutParams());
            layoutParams5.setMargins(b7, b8, b7, b8);
            this.ad.setLayoutParams(layoutParams5);
        }
        setCancelable(this.L);
        DialogInterface.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnShowListener onShowListener = this.I;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        if (!(this.G == null || getWindow() == null || getWindow().getCallback() == null)) {
            p pVar = new p(getWindow().getCallback());
            pVar.f33454a = this.G;
            getWindow().setCallback(pVar);
        }
        this.ad.setOnClickListener(new c(this));
        this.ae.setOnClickListener(new d(this));
        this.af.setOnClickListener(new f(this));
        this.ah.setOnClickListener(new g(this));
        try {
            a(true, this.f18277g);
            setContentView(this.ai);
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.ws);
                window.setBackgroundDrawableResource(R.color.c9);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = E;
                window.addFlags(2);
                attributes.gravity = 1;
                attributes.width = a();
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        if (this.L) {
            findViewById(R.id.fnf).setOnClickListener(new h(this));
        }
        MethodCollector.o(9422);
    }

    static void a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    public b(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r5 > r3) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.l.b.onCreate(android.os.Bundle):void");
    }

    public static void a(boolean z2, View view) {
        if (view != null) {
            view.post(new i(view, z2));
        }
    }

    protected b(Context context, int i2) {
        super(context, i2);
    }
}
