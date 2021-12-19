package com.bytedance.ies.dmt.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.p;
import com.bytedance.ies.dmt.ui.f.c;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;

public class a {

    /* renamed from: h  reason: collision with root package name */
    public static float f33386h = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    private static final Float f33387k = Float.valueOf(17.0f);

    /* renamed from: l  reason: collision with root package name */
    private static final Float f33388l;

    /* renamed from: m  reason: collision with root package name */
    private static final Float f33389m = Float.valueOf(0.75f);
    private static final Float n = Float.valueOf(16.0f);
    private static final Float o;
    private static final Float p = Float.valueOf(20.0f);
    private static final Float q = Float.valueOf(2.0f);
    private static final Float r;
    private static final Float s;
    private static final Float t = Float.valueOf(44.0f);
    private DmtTextView A;
    private DmtTextView B;
    private DmtTextView C;
    private DmtTextView D;
    private CharSequence E;
    private ImageView F;
    private ImageView G;
    private View H;
    private View I;
    private View J;
    private View K;
    private View L;
    private View M;
    private FrameLayout N;
    private FrameLayout O;
    private FrameLayout P;
    private FrameLayout Q;
    private FrameLayout R;
    private LinearLayout S;
    private RelativeLayout T;
    private RelativeLayout U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: a  reason: collision with root package name */
    RelativeLayout f33390a;
    private String aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private View.OnClickListener ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private int ao;
    private p.a ap;
    private DialogInterface.OnDismissListener aq;
    private DialogInterface.OnShowListener ar;
    private int as;
    private int at;
    private boolean au;
    private View av;
    private View aw;
    private boolean ax;

    /* renamed from: b  reason: collision with root package name */
    DialogInterface.OnClickListener f33391b;

    /* renamed from: c  reason: collision with root package name */
    DialogInterface.OnClickListener f33392c;

    /* renamed from: d  reason: collision with root package name */
    DialogInterface.OnClickListener f33393d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33394e;

    /* renamed from: f  reason: collision with root package name */
    boolean f33395f;

    /* renamed from: g  reason: collision with root package name */
    boolean f33396g;

    /* renamed from: i  reason: collision with root package name */
    AlertDialog f33397i;

    /* renamed from: j  reason: collision with root package name */
    public DialogContext f33398j;
    private Context u;
    private DmtTextView v;
    private DmtTextView w;
    private DmtTextView x;
    private DmtTextView y;
    private DmtTextView z;

    public final void d() {
        AlertDialog alertDialog = this.f33397i;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private int e() {
        int b2 = (int) n.b(this.u, 360.0f);
        double a2 = (double) n.a(this.u);
        Double.isNaN(a2);
        int i2 = (int) (a2 * 0.8d);
        return i2 > b2 ? b2 : i2;
    }

    public final boolean a() {
        AlertDialog alertDialog = this.f33397i;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.a$a  reason: collision with other inner class name */
    public static class C0731a {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public int I = 17;
        public DmtTextView J;
        public int K;
        public int L;
        public boolean M = true;
        public boolean N = true;
        public boolean O;

        /* renamed from: a  reason: collision with root package name */
        public String f33401a;

        /* renamed from: b  reason: collision with root package name */
        public String f33402b;

        /* renamed from: c  reason: collision with root package name */
        public String f33403c;

        /* renamed from: d  reason: collision with root package name */
        public String f33404d;

        /* renamed from: e  reason: collision with root package name */
        public String f33405e;

        /* renamed from: f  reason: collision with root package name */
        public String f33406f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f33407g;

        /* renamed from: h  reason: collision with root package name */
        public int f33408h;

        /* renamed from: i  reason: collision with root package name */
        public int f33409i;

        /* renamed from: j  reason: collision with root package name */
        public int f33410j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f33411k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnClickListener f33412l;

        /* renamed from: m  reason: collision with root package name */
        public DialogInterface.OnClickListener f33413m;
        public DialogInterface.OnDismissListener n;
        public DialogInterface.OnShowListener o;
        public p.a p;
        public View.OnClickListener q;
        public Context r;
        public View s;
        public View t;
        public View u;
        public View v;
        public View w;
        public int x;
        public int y;
        public boolean z;

        static {
            Covode.recordClassIndex(19937);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public C0731a(Context context) {
            this.r = context;
        }

        public final C0731a a(int i2) {
            this.f33401a = this.r.getString(i2);
            return this;
        }

        public final C0731a b(int i2) {
            this.f33402b = this.r.getString(i2);
            return this;
        }

        public final C0731a a(View view, int i2, int i3) {
            this.v = view;
            this.K = i2;
            this.L = i3;
            return this;
        }

        public final C0731a b(String str, DialogInterface.OnClickListener onClickListener, boolean z2) {
            this.f33405e = str;
            this.f33412l = onClickListener;
            this.C = z2;
            return this;
        }

        public final C0731a c(String str, DialogInterface.OnClickListener onClickListener, boolean z2) {
            this.f33406f = str;
            this.f33413m = onClickListener;
            this.D = z2;
            return this;
        }

        public final C0731a a(int i2, DialogInterface.OnClickListener onClickListener, boolean z2) {
            return a(this.r.getString(i2), onClickListener, z2);
        }

        public final C0731a b(int i2, DialogInterface.OnClickListener onClickListener, boolean z2) {
            return b(this.r.getString(i2), onClickListener, z2);
        }

        public final C0731a a(String str, DialogInterface.OnClickListener onClickListener, boolean z2) {
            this.f33404d = str;
            this.f33411k = onClickListener;
            this.B = z2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(19934);
        Float valueOf = Float.valueOf(15.0f);
        f33388l = valueOf;
        Float valueOf2 = Float.valueOf(8.0f);
        o = valueOf2;
        r = valueOf2;
        s = valueOf;
    }

    public final Dialog b() {
        AlertDialog.Builder builder;
        int identifier;
        if (this.af == 0) {
            builder = new AlertDialog.Builder(this.u, R.style.wt);
        } else {
            builder = new AlertDialog.Builder(this.u, this.af);
        }
        if (!TextUtils.isEmpty(this.V)) {
            builder.setTitle(this.V);
        }
        if (!TextUtils.isEmpty(this.E)) {
            builder.setMessage(this.E);
        } else if (!TextUtils.isEmpty(this.W)) {
            builder.setMessage(this.W);
        }
        builder.setPositiveButton(this.Y, new b(this));
        if (!TextUtils.isEmpty(this.aa)) {
            builder.setNeutralButton(this.aa, new c(this));
        }
        if (!TextUtils.isEmpty(this.Z)) {
            builder.setNegativeButton(this.Z, new g(this));
        }
        builder.setCancelable(this.au);
        AlertDialog create = builder.create();
        this.f33397i = create;
        create.getWindow();
        DialogInterface.OnDismissListener onDismissListener = this.aq;
        if (onDismissListener != null) {
            this.f33397i.setOnDismissListener(onDismissListener);
        } else if (this.f33398j != null) {
            this.f33397i.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ies.dmt.ui.dialog.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(19935);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    a.C0732a.f33434a.a(a.this.f33398j.f33417a);
                }
            });
        }
        DialogInterface.OnShowListener onShowListener = this.ar;
        if (onShowListener != null) {
            this.f33397i.setOnShowListener(onShowListener);
        }
        if (this.au) {
            this.f33397i.setCanceledOnTouchOutside(true);
        }
        a(this.f33397i);
        try {
            this.f33397i.show();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(this.V) && (identifier = this.u.getResources().getIdentifier("alertTitle", "id", "android")) > 0) {
            b.a().a((TextView) this.f33397i.getWindow().findViewById(identifier), d.f33801g);
        }
        if (!TextUtils.isEmpty(this.W)) {
            b.a().a((TextView) this.f33397i.getWindow().findViewById(16908299), d.f33795a);
        }
        Button button = this.f33397i.getButton(-1);
        if (button != null) {
            button.setTypeface(b.a().a(d.f33801g));
        }
        Button button2 = this.f33397i.getButton(-2);
        if (button2 != null) {
            button2.setTypeface(b.a().a(d.f33801g));
        }
        return this.f33397i;
    }

    public final Dialog c() {
        AlertDialog.Builder builder;
        int b2;
        int b3;
        float f2;
        MethodCollector.i(2066);
        this.f33390a.setAlpha(0.0f);
        if (this.af == 0) {
            builder = new AlertDialog.Builder(this.u);
        } else {
            builder = new AlertDialog.Builder(this.u, this.af);
        }
        this.aw.setVisibility(0);
        if (this.D != null) {
            this.w.setVisibility(8);
            this.D.setTextColor(androidx.core.content.b.c(this.u, R.color.c4));
            this.D.setTextSize(1, 15.0f);
            this.D.setFontType(d.f33795a);
            int b4 = (int) n.b(this.u, 8.0f);
            this.D.setPadding(b4, 0, b4, 0);
            this.D.setGravity(17);
            DmtTextView dmtTextView = this.D;
            this.w = dmtTextView;
            this.O.addView(dmtTextView);
        } else {
            this.w.setVisibility(0);
            if (!TextUtils.isEmpty(this.E)) {
                this.w.setText(this.E);
            } else if (!TextUtils.isEmpty(this.W)) {
                this.w.setText(this.W);
            } else {
                this.aw.setVisibility(8);
            }
            this.w.setGravity(this.ao);
        }
        if (!TextUtils.isEmpty(this.V)) {
            this.v.setText(this.V);
            this.w.setTextSize(1, f33388l.floatValue());
            this.w.setTextColor(androidx.core.content.b.c(this.u, R.color.c4));
        } else {
            this.w.setTextSize(1, f33387k.floatValue());
            this.w.setTextColor(androidx.core.content.b.c(this.u, R.color.ae));
        }
        if (this.X != null) {
            this.x.setVisibility(0);
            this.x.setText(this.X);
            if (this.ag != null) {
                this.x.setTextColor(androidx.core.content.b.c(this.u, R.color.bh));
                this.x.setOnClickListener(this.ag);
            }
            int i2 = Build.VERSION.SDK_INT;
            this.x.setCompoundDrawablesRelativeWithIntrinsicBounds(this.ac, 0, this.ad, 0);
        }
        this.z.setText(this.Y);
        this.N.setBackgroundColor(this.ae);
        if (this.ae != 0) {
            this.N.getLayoutParams().height = (int) n.b(this.u, 140.0f);
        }
        if (this.ai) {
            this.G.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.Z)) {
            this.y.setVisibility(8);
            this.B.setVisibility(8);
            this.z.setBackgroundResource(R.drawable.cbc);
        } else {
            this.y.setText(this.Z);
        }
        if (TextUtils.isEmpty(this.aa)) {
            this.y.setTextColor(androidx.core.content.b.c(this.u, R.color.c4));
            this.y.setFontType(d.f33795a);
            this.A.setVisibility(8);
            this.C.setVisibility(8);
        } else {
            this.A.setText(this.aa);
        }
        if (this.ak) {
            if (this.aj) {
                this.K.setVisibility(8);
                this.B.setVisibility(8);
                this.C.setVisibility(8);
                this.z.setBackground(this.u.getResources().getDrawable(R.drawable.beh));
                this.z.setHeight((int) n.b(this.u, t.floatValue()));
                int b5 = (int) n.b(this.u, p.floatValue());
                int b6 = (int) n.b(this.u, q.floatValue());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.z.getLayoutParams());
                layoutParams.setMargins(b5, b6, b5, b6);
                this.z.setLayoutParams(layoutParams);
                this.z.setTextColor(androidx.core.content.b.c(this.u, R.color.f159928l));
                if (TextUtils.isEmpty(this.Z) || TextUtils.isEmpty(this.aa)) {
                    f2 = n.b(this.u, n.floatValue());
                } else {
                    f2 = n.b(this.u, o.floatValue());
                }
                this.S.setPadding(0, 0, 0, (int) f2);
                this.y.setBackground(null);
                this.A.setBackground(null);
                DmtTextView dmtTextView2 = this.y;
                Float f3 = f33389m;
                c.a(dmtTextView2, f3.floatValue());
                c.a(this.A, f3.floatValue());
                if (TextUtils.isEmpty(this.aa)) {
                    this.y.setTextColor(androidx.core.content.b.c(this.u, R.color.c5));
                } else {
                    this.A.setTextColor(androidx.core.content.b.c(this.u, R.color.c5));
                }
            } else {
                this.z.setTextColor(androidx.core.content.b.c(this.u, R.color.bd));
            }
        }
        if (this.al) {
            this.y.setFontType(d.f33801g);
            this.y.setTextColor(androidx.core.content.b.c(this.u, R.color.bx));
        }
        if (this.I != null) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.K.getLayoutParams()).topMargin = 0;
            this.T.removeAllViews();
            this.T.addView(this.I);
        }
        if (this.L != null) {
            this.N.setVisibility(8);
            this.U.setVisibility(0);
            this.U.removeAllViews();
            this.U.addView(this.L);
        }
        if (TextUtils.isEmpty(this.V)) {
            this.v.setVisibility(8);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.aw.getLayoutParams();
            if (this.av == null || this.J != null || this.ab > 0) {
                layoutParams2.topMargin = (int) n.b(this.u, 24.0f);
            } else {
                layoutParams2.topMargin = (int) n.b(this.u, 16.0f);
            }
            this.aw.setLayoutParams(layoutParams2);
        }
        if (this.J != null) {
            this.N.removeView(this.F);
            this.N.addView(this.J, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            int i3 = this.ab;
            if (i3 > 0) {
                this.F.setImageResource(i3);
            } else if (this.av != null) {
                this.N.setVisibility(8);
                this.P.setVisibility(0);
                int i4 = this.as;
                if (i4 == 0) {
                    b2 = -2;
                } else {
                    b2 = (int) n.b(this.u, (float) i4);
                }
                int i5 = this.at;
                if (i5 == 0) {
                    b3 = -2;
                } else {
                    b3 = (int) n.b(this.u, (float) i5);
                }
                this.Q.addView(this.av, 0, new FrameLayout.LayoutParams(b2, b3));
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.v.getLayoutParams();
                layoutParams3.setMargins(0, (int) n.b(this.u, 16.0f), 0, 0);
                this.v.setLayoutParams(layoutParams3);
            } else {
                this.N.setVisibility(8);
            }
        }
        if (this.ax) {
            this.G.setImageResource(2131232602);
        }
        if (this.M != null) {
            this.aw.setVisibility(8);
            this.v.setTextSize(1, f33387k.floatValue());
            this.R.setVisibility(0);
            this.R.addView(this.M, 0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (!this.am) {
            a((Boolean) false);
        }
        if (this.an) {
            if (TextUtils.isEmpty(this.W)) {
                this.v.setTextSize(1, f33387k.floatValue());
            }
            this.z.setTextColor(androidx.core.content.b.c(this.u, R.color.bx));
            this.z.setBackground(this.u.getResources().getDrawable(R.drawable.cd9));
            this.y.setTextColor(androidx.core.content.b.c(this.u, R.color.bx));
            this.y.setBackground(this.u.getResources().getDrawable(R.drawable.cd9));
            int b7 = (int) n.b(this.u, p.floatValue());
            int b8 = (int) n.b(this.u, q.floatValue());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(this.y.getLayoutParams());
            layoutParams4.setMargins(b7, b8, b7, b8);
            this.y.setLayoutParams(layoutParams4);
        }
        builder.setCancelable(this.au);
        AlertDialog create = builder.create();
        this.f33397i = create;
        DialogInterface.OnDismissListener onDismissListener = this.aq;
        if (onDismissListener != null) {
            create.setOnDismissListener(onDismissListener);
        } else if (this.f33398j != null) {
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ies.dmt.ui.dialog.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(19936);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    a.C0732a.f33434a.a(a.this.f33398j.f33417a);
                }
            });
        }
        DialogInterface.OnShowListener onShowListener = this.ar;
        if (onShowListener != null) {
            this.f33397i.setOnShowListener(onShowListener);
        }
        a(this.f33397i);
        this.y.setOnClickListener(new h(this));
        this.z.setOnClickListener(new i(this));
        this.A.setOnClickListener(new j(this));
        this.G.setOnClickListener(new k(this));
        AlertDialog alertDialog = this.f33397i;
        try {
            a(true, this.f33390a);
            alertDialog.show();
            alertDialog.setContentView(this.H);
            Window window = alertDialog.getWindow();
            window.setWindowAnimations(R.style.ws);
            window.setBackgroundDrawableResource(R.color.c9);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = f33386h;
            window.addFlags(2);
            attributes.gravity = 1;
            attributes.width = e();
            window.setAttributes(attributes);
        } catch (Exception unused) {
        }
        AlertDialog alertDialog2 = this.f33397i;
        MethodCollector.o(2066);
        return alertDialog2;
    }

    static void a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    private void a(AlertDialog alertDialog) {
        if (this.ap != null && alertDialog.getWindow() != null && alertDialog.getWindow().getCallback() != null) {
            p pVar = new p(alertDialog.getWindow().getCallback());
            pVar.f33454a = this.ap;
            alertDialog.getWindow().setCallback(pVar);
        }
    }

    public final void a(Boolean bool) {
        if (this.ak) {
            if (bool.booleanValue()) {
                this.z.setTextColor(androidx.core.content.b.c(this.u, R.color.a9));
                this.z.setBackground(this.u.getResources().getDrawable(R.drawable.beh));
            } else {
                this.z.setTextColor(androidx.core.content.b.c(this.u, R.color.bz));
                this.z.setBackgroundColor(androidx.core.content.b.c(this.u, R.color.f159923g));
            }
        }
        this.z.setEnabled(bool.booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00f2, code lost:
        if (r6 > r4) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(com.bytedance.ies.dmt.ui.dialog.a.C0731a r9) {
        /*
        // Method dump skipped, instructions count: 642
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.dialog.a.<init>(com.bytedance.ies.dmt.ui.dialog.a$a):void");
    }

    /* synthetic */ a(C0731a aVar, byte b2) {
        this(aVar);
    }

    public static void a(boolean z2, View view) {
        if (view != null) {
            view.post(new l(view, z2));
        }
    }
}
