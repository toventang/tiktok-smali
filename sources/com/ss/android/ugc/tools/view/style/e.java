package com.ss.android.ugc.tools.view.style;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.function.Supplier;

public final class e extends PopupWindow {
    private float A = 13.0f;
    private int B;
    private Typeface C;
    private boolean D = true;
    private float E = 12.0f;
    private int F;
    private int G;
    private boolean H = true;
    private boolean I = true;
    private boolean J;
    private TextView K;
    private boolean L;
    private int M;
    private Activity N;
    private View O;
    private Supplier<Point> P;
    private final Runnable Q;

    /* renamed from: a  reason: collision with root package name */
    public int f150161a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f150162b;

    /* renamed from: c  reason: collision with root package name */
    public long f150163c = 200;

    /* renamed from: d  reason: collision with root package name */
    public int f150164d;

    /* renamed from: e  reason: collision with root package name */
    public d f150165e;

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f150166f;

    /* renamed from: g  reason: collision with root package name */
    public b f150167g;

    /* renamed from: h  reason: collision with root package name */
    public d f150168h;

    /* renamed from: i  reason: collision with root package name */
    public c f150169i;

    /* renamed from: j  reason: collision with root package name */
    private float f150170j;

    /* renamed from: k  reason: collision with root package name */
    private float f150171k;

    /* renamed from: l  reason: collision with root package name */
    private int f150172l;

    /* renamed from: m  reason: collision with root package name */
    private int f150173m;
    private boolean n = true;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private long u = 5000;
    private boolean v = true;
    private int w;
    private int x;
    private String y = "";
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(98833);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(98834);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(98835);
        }
    }

    static {
        Covode.recordClassIndex(98831);
    }

    private static int a(int i2) {
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 5) {
            if (i2 != 48) {
                return i2 != 80 ? 1 : 0;
            }
            return 3;
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f150191a;

        static {
            Covode.recordClassIndex(98838);
        }

        f(e eVar) {
            this.f150191a = eVar;
        }

        public final void run() {
            this.f150191a.a(false);
        }
    }

    private int c() {
        a();
        View contentView = getContentView();
        l.b(contentView, "");
        return contentView.getMeasuredHeight();
    }

    public final void dismiss() {
        if (!this.L) {
            a(false);
            getContentView().removeCallbacks(this.Q);
            this.s = 0;
            this.t = 0;
        }
    }

    public final void a() {
        int i2 = this.w;
        if (i2 == 0 || this.x == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x, 1073741824));
    }

    public final void b() {
        AnimatorSet animatorSet = this.f150166f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f150166f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f150166f = null;
        if (!this.N.isFinishing() && isShowing()) {
            super.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.style.e$e  reason: collision with other inner class name */
    public static final class RunnableC4049e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f150187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f150188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f150189c;

        static {
            Covode.recordClassIndex(98836);
        }

        RunnableC4049e(e eVar, d dVar, boolean z) {
            this.f150187a = eVar;
            this.f150188b = dVar;
            this.f150189c = z;
        }

        public final void run() {
            int i2;
            float f2;
            int i3;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            AnimatorSet.Builder play;
            AnimatorSet.Builder with;
            AnimatorSet.Builder with2;
            AnimatorSet.Builder play2;
            AnimatorSet.Builder with3;
            AnimatorSet.Builder with4;
            AnimatorSet.Builder play3;
            AnimatorSet.Builder with5;
            AnimatorSet.Builder with6;
            AnimatorSet.Builder play4;
            AnimatorSet.Builder with7;
            AnimatorSet.Builder with8;
            AnimatorSet animatorSet;
            AnimatorSet.Builder play5;
            AnimatorSet.Builder with9;
            AnimatorSet.Builder with10;
            AnimatorSet.Builder play6;
            AnimatorSet.Builder with11;
            AnimatorSet.Builder with12;
            AnimatorSet.Builder play7;
            AnimatorSet.Builder with13;
            AnimatorSet.Builder with14;
            AnimatorSet.Builder play8;
            AnimatorSet.Builder with15;
            AnimatorSet.Builder with16;
            if (this.f150187a.f150166f != null) {
                int i4 = this.f150187a.f150161a;
                if (i4 != 3) {
                    if (i4 == 5) {
                        i2 = (int) this.f150188b.getX();
                        f3 = this.f150188b.getY();
                        f4 = e.a(this.f150187a).getBubbleOffset();
                    } else if (i4 == 48) {
                        i2 = (int) (this.f150188b.getX() + e.a(this.f150187a).getBubbleOffset());
                        f3 = this.f150188b.getY();
                        f4 = (float) this.f150188b.getMeasuredHeight();
                    } else if (i4 != 80) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        i2 = (int) (this.f150188b.getX() + e.a(this.f150187a).getBubbleOffset());
                        f2 = this.f150188b.getY();
                        i3 = (int) f2;
                    }
                    f2 = f3 + f4;
                    i3 = (int) f2;
                } else {
                    i2 = (int) (this.f150188b.getX() + ((float) this.f150188b.getMeasuredWidth()));
                    f3 = this.f150188b.getY();
                    f4 = e.a(this.f150187a).getBubbleOffset();
                    f2 = f3 + f4;
                    i3 = (int) f2;
                }
                this.f150188b.setPivotY((float) i3);
                this.f150188b.setPivotX((float) i2);
                d dVar = this.f150188b;
                float[] fArr = new float[2];
                boolean z = this.f150189c;
                if (z) {
                    f5 = 0.0f;
                } else {
                    f5 = 1.0f;
                }
                fArr[0] = f5;
                if (z) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                fArr[1] = f6;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar, "scaleX", fArr);
                l.b(ofFloat, "");
                ofFloat.setDuration(200L);
                d dVar2 = this.f150188b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f150189c;
                if (z2) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                fArr2[0] = f7;
                if (z2) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr2[1] = f8;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar2, "scaleY", fArr2);
                l.b(ofFloat2, "");
                ofFloat2.setDuration(200L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f150188b, "translationY", 0.0f);
                l.b(ofFloat3, "");
                if (this.f150189c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat3.setDuration(j2);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f150188b, "translationY", 0.0f);
                l.b(ofFloat4, "");
                if (this.f150189c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat4.setDuration(j3);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f150188b, "translationX", 0.0f);
                l.b(ofFloat5, "");
                if (this.f150189c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat5.setDuration(j4);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f150188b, "translationX", 0.0f);
                l.b(ofFloat6, "");
                if (this.f150189c) {
                    j5 = 500;
                } else {
                    j5 = 200;
                }
                ofFloat6.setDuration(j5);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f150188b, "translationY", 0.0f, 10.0f);
                l.b(ofFloat7, "");
                if (this.f150189c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat7.setDuration(j6);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f150188b, "translationY", 0.0f, -10.0f);
                l.b(ofFloat8, "");
                if (this.f150189c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat8.setDuration(j7);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f150188b, "translationX", 0.0f, -10.0f);
                l.b(ofFloat9, "");
                if (this.f150189c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat9.setDuration(j8);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f150188b, "translationX", 0.0f, 10.0f);
                l.b(ofFloat10, "");
                if (this.f150189c) {
                    j9 = 200;
                } else {
                    j9 = 150;
                }
                ofFloat10.setDuration(j9);
                this.f150188b.setVisibility(0);
                if (this.f150189c) {
                    int i5 = this.f150187a.f150161a;
                    if (i5 == 3) {
                        ofFloat9.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f150187a.f150166f;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i5 == 5) {
                        ofFloat10.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f150187a.f150166f;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i5 == 48) {
                        ofFloat8.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f150187a.f150166f;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i5 == 80) {
                        ofFloat7.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f150187a.f150166f;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i6 = this.f150187a.f150161a;
                    if (i6 == 3) {
                        ofFloat6.setInterpolator(new com.ss.android.ugc.tools.view.c.b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f150187a.f150166f;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i6 == 5) {
                        ofFloat5.setInterpolator(new com.ss.android.ugc.tools.view.c.b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f150187a.f150166f;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i6 == 48) {
                        ofFloat3.setInterpolator(new com.ss.android.ugc.tools.view.c.b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f150187a.f150166f;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i6 == 80) {
                        ofFloat4.setInterpolator(new com.ss.android.ugc.tools.view.c.b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f150187a.f150166f;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f150187a.f150166f;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.ss.android.ugc.tools.view.style.e.RunnableC4049e.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ RunnableC4049e f150190a;

                        static {
                            Covode.recordClassIndex(98837);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f150190a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f150190a.f150189c) {
                                this.f150190a.f150188b.setVisibility(8);
                                this.f150190a.f150187a.b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f150190a.f150189c) {
                                this.f150190a.f150188b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f150187a.f150162b && (animatorSet = this.f150187a.f150166f) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f150187a.f150166f;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f150192a;

        static {
            Covode.recordClassIndex(98839);
        }

        g(e eVar) {
            this.f150192a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f150192a.dismiss();
        }
    }

    public static final /* synthetic */ d a(e eVar) {
        d dVar = eVar.f150165e;
        if (dVar == null) {
            l.a("mDmtBubbleLayout");
        }
        return dVar;
    }

    public static final class a {
        public boolean A = true;
        public boolean B;
        public int C;
        public boolean D = true;
        public Activity E;

        /* renamed from: a  reason: collision with root package name */
        public int f150174a;

        /* renamed from: b  reason: collision with root package name */
        public float f150175b;

        /* renamed from: c  reason: collision with root package name */
        public int f150176c;

        /* renamed from: d  reason: collision with root package name */
        public int f150177d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f150178e = true;

        /* renamed from: f  reason: collision with root package name */
        public boolean f150179f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f150180g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f150181h;

        /* renamed from: i  reason: collision with root package name */
        public int f150182i;

        /* renamed from: j  reason: collision with root package name */
        public int f150183j;

        /* renamed from: k  reason: collision with root package name */
        public long f150184k = 800;

        /* renamed from: l  reason: collision with root package name */
        public long f150185l = 5000;

        /* renamed from: m  reason: collision with root package name */
        public boolean f150186m = true;
        public View n;
        public int o;
        public int p;
        public String q = "";
        public int r;
        public float s = 13.0f;
        public Typeface t;
        public int u;
        public b v;
        public c w;
        public d x;
        public boolean y = true;
        public float z = 12.0f;

        static {
            Covode.recordClassIndex(98832);
        }

        public a(Activity activity) {
            l.d(activity, "");
            this.E = activity;
        }
    }

    private final void a(View view) {
        d dVar = new d(this.N);
        this.f150165e = dVar;
        dVar.setBackgroundColor(0);
        d dVar2 = this.f150165e;
        if (dVar2 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar2.addView(view);
        d dVar3 = this.f150165e;
        if (dVar3 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        d dVar4 = this.f150165e;
        if (dVar4 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar4.setLayoutParams(marginLayoutParams);
        d dVar5 = this.f150165e;
        if (dVar5 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar5.setVisibility(8);
        if (this.f150172l != 0) {
            d dVar6 = this.f150165e;
            if (dVar6 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar6.setMBgColor(this.f150172l);
        }
        d dVar7 = this.f150165e;
        if (dVar7 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar7.setMNeedPath(this.n);
        d dVar8 = this.f150165e;
        if (dVar8 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar8.setMNeedArrow(this.D);
        d dVar9 = this.f150165e;
        if (dVar9 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar9.setMNeedPressFade(this.o);
        d dVar10 = this.f150165e;
        if (dVar10 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar10.setMNeedShadow(this.p);
        d dVar11 = this.f150165e;
        if (dVar11 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar11.setMShadowColor(this.q);
        d dVar12 = this.f150165e;
        if (dVar12 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar12.setOnClickListener(new g(this));
        d dVar13 = this.f150165e;
        if (dVar13 == null) {
            l.a("mDmtBubbleLayout");
        }
        setContentView(dVar13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private void b(View view) {
        if (!this.N.isFinishing() && view != null && view.getWindowToken() != null) {
            this.F = view.getMeasuredHeight();
            this.G = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.Q);
            this.f150161a = 48;
            d dVar = this.f150165e;
            if (dVar == null) {
                l.a("mDmtBubbleLayout");
            }
            this.M = dVar.getPADDING();
            if (isShowing()) {
                super.dismiss();
                return;
            }
            int a2 = a(48);
            int i2 = this.w;
            if (i2 == 0 || this.x == 0) {
                getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            } else {
                getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x, 1073741824));
            }
            if (!this.J) {
                this.f150171k += (float) (this.M * 8);
                this.J = true;
            }
            d dVar2 = this.f150165e;
            if (dVar2 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar2.a(a2, this.f150170j + this.f150171k);
            a(view, 48);
            this.L = false;
            if (this.u > 0) {
                getContentView().postDelayed(this.Q, this.u);
            }
        }
    }

    public final void a(boolean z2) {
        d dVar = this.f150165e;
        if (dVar == null) {
            l.a("mDmtBubbleLayout");
        }
        if (!z2) {
            this.L = true;
        }
        this.f150166f = new AnimatorSet();
        if (dVar != null) {
            dVar.post(new RunnableC4049e(this, dVar, z2));
        }
    }

    public e(a aVar) {
        View view;
        l.d(aVar, "");
        this.N = aVar.E;
        this.f150161a = aVar.f150174a;
        this.f150171k = aVar.f150175b;
        this.f150172l = aVar.f150176c;
        this.f150173m = aVar.f150177d;
        this.n = aVar.f150178e;
        this.o = aVar.f150179f;
        this.f150162b = aVar.f150180g;
        this.r = aVar.f150181h;
        this.s = aVar.f150182i;
        this.t = aVar.f150183j;
        this.f150163c = aVar.f150184k;
        this.u = aVar.f150185l;
        this.v = aVar.f150186m;
        this.O = aVar.n;
        this.x = aVar.p;
        this.w = aVar.o;
        this.y = aVar.q;
        this.z = aVar.r;
        this.A = aVar.s;
        this.B = aVar.u;
        this.C = aVar.t;
        this.f150167g = aVar.v;
        this.f150169i = aVar.w;
        this.f150168h = aVar.x;
        this.D = aVar.y;
        this.E = aVar.z;
        this.H = aVar.A;
        this.p = aVar.B;
        this.q = aVar.C;
        this.I = aVar.D;
        this.f150164d = (int) r.a(this.N, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.H);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.v || (view = this.O) == null) {
            StyleTextView styleTextView = new StyleTextView(this.N);
            this.K = styleTextView;
            if (this.B != 0) {
                styleTextView.setTextColor(this.B);
            } else {
                styleTextView.setTextColor(this.N.getResources().getColor(R.color.su));
            }
            TextView textView = this.K;
            if (textView == null) {
                l.a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i2 = Build.VERSION.SDK_INT;
            TextView textView2 = this.K;
            if (textView2 == null) {
                l.a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.K;
            if (textView3 == null) {
                l.a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.K;
            if (textView4 == null) {
                l.a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.K;
            if (textView5 == null) {
                l.a("mTextView");
            }
            textView5.setMaxWidth((int) r.a(this.N, 197.0f));
            TextView textView6 = this.K;
            if (textView6 == null) {
                l.a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.K;
            if (textView7 == null) {
                l.a("mTextView");
            }
            a(textView7);
            this.r = true;
            if (!TextUtils.isEmpty(this.y)) {
                TextView textView8 = this.K;
                if (textView8 == null) {
                    l.a("mTextView");
                }
                textView8.setText(this.y);
            }
            if (this.z != 0) {
                TextView textView9 = this.K;
                if (textView9 == null) {
                    l.a("mTextView");
                }
                textView9.setText(this.z);
            }
            if (this.A != 0.0f) {
                TextView textView10 = this.K;
                if (textView10 == null) {
                    l.a("mTextView");
                }
                textView10.setTextSize(1, this.A);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            a(view);
            d dVar = this.f150165e;
            if (dVar == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar.setUseDefaultView(false);
        }
        int i3 = this.w;
        if (!(i3 == 0 || this.x == 0)) {
            setWidth(i3);
            setHeight(this.x);
            d.f150153l = getWidth();
            d.f150154m = getHeight();
        }
        if (this.r) {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            l.b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.f150172l != 0) {
            d dVar2 = this.f150165e;
            if (dVar2 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar2.setMBgColor(this.f150172l);
        }
        if (this.f150173m != 0) {
            d dVar3 = this.f150165e;
            if (dVar3 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar3.setMBorderColor(this.f150173m);
        }
        if (!this.I) {
            d dVar4 = this.f150165e;
            if (dVar4 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar4.setNeedAddColor(false);
        }
        d dVar5 = this.f150165e;
        if (dVar5 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar5.setMNeedPath(this.n);
        d dVar6 = this.f150165e;
        if (dVar6 == null) {
            l.a("mDmtBubbleLayout");
        }
        dVar6.setBubbleOrientation(a(this.f150161a));
        if (this.E != 0.0f) {
            d dVar7 = this.f150165e;
            if (dVar7 == null) {
                l.a("mDmtBubbleLayout");
            }
            dVar7.setMPadding(this.E);
        }
        this.Q = new f(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.view.View r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            int[] r2 = new int[r0]
            java.util.function.Supplier<android.graphics.Point> r0 = r6.P
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0052
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0052
            java.util.function.Supplier<android.graphics.Point> r0 = r6.P
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r0.get()
            android.graphics.Point r1 = (android.graphics.Point) r1
            if (r1 != 0) goto L_0x001e
        L_0x001b:
            h.f.b.l.b()
        L_0x001e:
            int r0 = r1.x
            r2[r4] = r0
            int r0 = r1.y
            r2[r5] = r0
        L_0x0026:
            r3 = r2[r4]
            int r0 = r6.s
            int r3 = r3 + r0
            int r3 = r3 + r4
            android.app.Activity r1 = r6.N
            r0 = 1068708659(0x3fb33333, float:1.4)
            float r0 = com.ss.android.ugc.tools.utils.r.a(r1, r0)
            int r0 = (int) r0
            int r3 = r3 + r0
            r2 = r2[r5]
            int r0 = r6.c()
            int r2 = r2 - r0
            int r0 = r6.t
            int r2 = r2 + r0
            android.app.Activity r1 = r6.N
            r0 = 1067869798(0x3fa66666, float:1.3)
            float r0 = com.ss.android.ugc.tools.utils.r.a(r1, r0)
            int r0 = (int) r0
            int r2 = r2 + r0
            r6.showAtLocation(r7, r4, r3, r2)
            return
        L_0x0050:
            r1 = 0
            goto L_0x001b
        L_0x0052:
            r7.getLocationOnScreen(r2)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.view.style.e.a(android.view.View, int):void");
    }

    public final void a(View view, float f2, int i2) {
        this.s = i2;
        this.f150170j = f2;
        b(view);
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        l.d(view, "");
        super.showAtLocation(view, i2, i3, i4);
        a(true);
    }
}
