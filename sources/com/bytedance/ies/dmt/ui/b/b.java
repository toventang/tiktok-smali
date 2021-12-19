package com.bytedance.ies.dmt.ui.b;

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
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends PopupWindow {
    public static volatile int n;
    public static final C0728b o = new C0728b((byte) 0);
    private int A;
    private int B;
    private String C = "";
    private int D;
    private float E = 13.0f;
    private int F;
    private Typeface G;
    private boolean H = true;
    private float I = 12.0f;
    private int J;
    private int K;
    private boolean L = true;
    private boolean M = true;
    private boolean N;
    private TextUtils.TruncateAt O;
    private float P = 197.0f;
    private TextView Q;
    private boolean R;
    private int S;
    private View T;
    private final Runnable U;

    /* renamed from: a  reason: collision with root package name */
    public int f33304a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33305b;

    /* renamed from: c  reason: collision with root package name */
    public int f33306c;

    /* renamed from: d  reason: collision with root package name */
    public int f33307d;

    /* renamed from: e  reason: collision with root package name */
    public long f33308e = 200;

    /* renamed from: f  reason: collision with root package name */
    public int f33309f;

    /* renamed from: g  reason: collision with root package name */
    public a f33310g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f33311h;

    /* renamed from: i  reason: collision with root package name */
    public Activity f33312i;

    /* renamed from: j  reason: collision with root package name */
    public c f33313j;

    /* renamed from: k  reason: collision with root package name */
    public e f33314k;

    /* renamed from: l  reason: collision with root package name */
    public d f33315l;

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.a.c<Point> f33316m;
    private float p;
    private float q;
    private int r;
    private int s;
    private boolean t = true;
    private boolean u;
    private boolean v;
    private int w;
    private boolean x;
    private long y = 5000;
    private boolean z = true;

    public interface c {
        static {
            Covode.recordClassIndex(19893);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(19894);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(19895);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(19890);
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

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$b  reason: collision with other inner class name */
    public static final class C0728b {
        static {
            Covode.recordClassIndex(19892);
        }

        private C0728b() {
        }

        public /* synthetic */ C0728b(byte b2) {
            this();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f33334a;

        static {
            Covode.recordClassIndex(19898);
        }

        g(b bVar) {
            this.f33334a = bVar;
        }

        public final void run() {
            this.f33334a.a(false);
        }
    }

    public static final class a {
        public boolean A = true;
        public boolean B;
        public int C;
        public boolean D = true;
        public TextUtils.TruncateAt E;
        public float F = 197.0f;
        public Activity G;

        /* renamed from: a  reason: collision with root package name */
        public int f33317a;

        /* renamed from: b  reason: collision with root package name */
        public float f33318b;

        /* renamed from: c  reason: collision with root package name */
        public int f33319c;

        /* renamed from: d  reason: collision with root package name */
        public int f33320d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f33321e = true;

        /* renamed from: f  reason: collision with root package name */
        public boolean f33322f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f33323g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f33324h;

        /* renamed from: i  reason: collision with root package name */
        public int f33325i;

        /* renamed from: j  reason: collision with root package name */
        public int f33326j;

        /* renamed from: k  reason: collision with root package name */
        public long f33327k = 800;

        /* renamed from: l  reason: collision with root package name */
        public long f33328l = 5000;

        /* renamed from: m  reason: collision with root package name */
        public boolean f33329m = true;
        public View n;
        public int o;
        public int p;
        public String q = "";
        public int r;
        public float s = 13.0f;
        public Typeface t;
        public int u;
        public c v;
        public d w;
        public e x;
        public boolean y = true;
        public float z = 12.0f;

        static {
            Covode.recordClassIndex(19891);
        }

        public final b a() {
            return new b(this);
        }

        public final a a(e eVar) {
            l.d(eVar, "");
            this.x = eVar;
            return this;
        }

        public a(Activity activity) {
            l.d(activity, "");
            this.G = activity;
        }
    }

    public final int c() {
        a();
        View contentView = getContentView();
        l.b(contentView, "");
        return contentView.getMeasuredHeight();
    }

    public final int d() {
        a();
        View contentView = getContentView();
        l.b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.R) {
            a(false);
            getContentView().removeCallbacks(this.U);
            this.f33306c = 0;
            this.f33307d = 0;
        }
    }

    public final void a() {
        int i2 = this.A;
        if (i2 == 0 || this.B == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.B, 1073741824));
    }

    public final void b() {
        AnimatorSet animatorSet = this.f33311h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f33311h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f33311h = null;
        if (!this.f33312i.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public final void e() {
        if (!this.R) {
            n--;
            a aVar = this.f33310g;
            if (aVar == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar.setVisibility(8);
            b();
            getContentView().removeCallbacks(this.U);
            this.f33306c = 0;
            this.f33307d = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f33330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33332c;

        static {
            Covode.recordClassIndex(19896);
        }

        f(b bVar, a aVar, boolean z) {
            this.f33330a = bVar;
            this.f33331b = aVar;
            this.f33332c = z;
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
            if (this.f33330a.f33311h != null) {
                int i4 = this.f33330a.f33304a;
                if (i4 != 3) {
                    if (i4 == 5) {
                        i2 = (int) this.f33331b.getX();
                        f3 = this.f33331b.getY();
                        f4 = b.a(this.f33330a).getBubbleOffset();
                    } else if (i4 == 48) {
                        i2 = (int) (this.f33331b.getX() + b.a(this.f33330a).getBubbleOffset());
                        f3 = this.f33331b.getY();
                        f4 = (float) this.f33331b.getMeasuredHeight();
                    } else if (i4 != 80) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        i2 = (int) (this.f33331b.getX() + b.a(this.f33330a).getBubbleOffset());
                        f2 = this.f33331b.getY();
                        i3 = (int) f2;
                    }
                    f2 = f3 + f4;
                    i3 = (int) f2;
                } else {
                    i2 = (int) (this.f33331b.getX() + ((float) this.f33331b.getMeasuredWidth()));
                    f3 = this.f33331b.getY();
                    f4 = b.a(this.f33330a).getBubbleOffset();
                    f2 = f3 + f4;
                    i3 = (int) f2;
                }
                this.f33331b.setPivotY((float) i3);
                this.f33331b.setPivotX((float) i2);
                a aVar = this.f33331b;
                float[] fArr = new float[2];
                boolean z = this.f33332c;
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "scaleX", fArr);
                l.b(ofFloat, "");
                ofFloat.setDuration(200L);
                a aVar2 = this.f33331b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f33332c;
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
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar2, "scaleY", fArr2);
                l.b(ofFloat2, "");
                ofFloat2.setDuration(200L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f33331b, "translationY", 0.0f);
                l.b(ofFloat3, "");
                if (this.f33332c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat3.setDuration(j2);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f33331b, "translationY", 0.0f);
                l.b(ofFloat4, "");
                if (this.f33332c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat4.setDuration(j3);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f33331b, "translationX", 0.0f);
                l.b(ofFloat5, "");
                if (this.f33332c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat5.setDuration(j4);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f33331b, "translationX", 0.0f);
                l.b(ofFloat6, "");
                if (this.f33332c) {
                    j5 = 500;
                } else {
                    j5 = 200;
                }
                ofFloat6.setDuration(j5);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f33331b, "translationY", 0.0f, 10.0f);
                l.b(ofFloat7, "");
                if (this.f33332c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat7.setDuration(j6);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f33331b, "translationY", 0.0f, -10.0f);
                l.b(ofFloat8, "");
                if (this.f33332c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat8.setDuration(j7);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f33331b, "translationX", 0.0f, -10.0f);
                l.b(ofFloat9, "");
                if (this.f33332c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat9.setDuration(j8);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f33331b, "translationX", 0.0f, 10.0f);
                l.b(ofFloat10, "");
                if (this.f33332c) {
                    j9 = 200;
                } else {
                    j9 = 150;
                }
                ofFloat10.setDuration(j9);
                this.f33331b.setVisibility(0);
                if (this.f33332c) {
                    int i5 = this.f33330a.f33304a;
                    if (i5 == 3) {
                        ofFloat9.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f33330a.f33311h;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i5 == 5) {
                        ofFloat10.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f33330a.f33311h;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i5 == 48) {
                        ofFloat8.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f33330a.f33311h;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i5 == 80) {
                        ofFloat7.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f33330a.f33311h;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i6 = this.f33330a.f33304a;
                    if (i6 == 3) {
                        ofFloat6.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f33330a.f33311h;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i6 == 5) {
                        ofFloat5.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f33330a.f33311h;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i6 == 48) {
                        ofFloat3.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f33330a.f33311h;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i6 == 80) {
                        ofFloat4.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f33330a.f33311h;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f33330a.f33311h;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.bytedance.ies.dmt.ui.b.b.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f33333a;

                        static {
                            Covode.recordClassIndex(19897);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f33333a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f33333a.f33332c) {
                                this.f33333a.f33331b.setVisibility(8);
                                this.f33333a.f33330a.b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f33333a.f33332c) {
                                e eVar = this.f33333a.f33330a.f33314k;
                                if (eVar != null) {
                                    eVar.a();
                                }
                                this.f33333a.f33331b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f33330a.f33305b && (animatorSet = this.f33330a.f33311h) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f33330a.f33311h;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f33335a;

        static {
            Covode.recordClassIndex(19899);
        }

        h(b bVar) {
            this.f33335a = bVar;
        }

        public final void onClick(View view) {
            this.f33335a.dismiss();
        }
    }

    public static final /* synthetic */ a a(b bVar) {
        a aVar = bVar.f33310g;
        if (aVar == null) {
            l.a("mDmtBubbleLayout");
        }
        return aVar;
    }

    private final void a(View view) {
        a aVar = new a(this.f33312i);
        this.f33310g = aVar;
        aVar.setBackgroundColor(0);
        a aVar2 = this.f33310g;
        if (aVar2 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar2.addView(view);
        a aVar3 = this.f33310g;
        if (aVar3 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        a aVar4 = this.f33310g;
        if (aVar4 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar4.setLayoutParams(marginLayoutParams);
        a aVar5 = this.f33310g;
        if (aVar5 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar5.setVisibility(8);
        if (this.r != 0) {
            a aVar6 = this.f33310g;
            if (aVar6 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar6.setMBgColor(this.r);
        }
        a aVar7 = this.f33310g;
        if (aVar7 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar7.setMNeedPath(this.t);
        a aVar8 = this.f33310g;
        if (aVar8 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar8.setMNeedArrow(this.H);
        a aVar9 = this.f33310g;
        if (aVar9 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar9.setMNeedPressFade(this.u);
        a aVar10 = this.f33310g;
        if (aVar10 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar10.setMNeedShadow(this.v);
        a aVar11 = this.f33310g;
        if (aVar11 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar11.setMShadowColor(this.w);
        a aVar12 = this.f33310g;
        if (aVar12 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar12.setOnClickListener(new h(this));
        a aVar13 = this.f33310g;
        if (aVar13 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar13.setMTextViewMaxWidth(this.P);
        a aVar14 = this.f33310g;
        if (aVar14 == null) {
            l.a("mDmtBubbleLayout");
        }
        setContentView(aVar14);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public b(a aVar) {
        View view;
        l.d(aVar, "");
        this.f33312i = aVar.G;
        this.f33304a = aVar.f33317a;
        this.q = aVar.f33318b;
        this.r = aVar.f33319c;
        this.s = aVar.f33320d;
        this.t = aVar.f33321e;
        this.u = aVar.f33322f;
        this.f33305b = aVar.f33323g;
        this.x = aVar.f33324h;
        this.f33306c = aVar.f33325i;
        this.f33307d = aVar.f33326j;
        this.f33308e = aVar.f33327k;
        this.y = aVar.f33328l;
        this.z = aVar.f33329m;
        this.T = aVar.n;
        this.B = aVar.p;
        this.A = aVar.o;
        this.C = aVar.q;
        this.D = aVar.r;
        this.E = aVar.s;
        this.F = aVar.u;
        this.G = aVar.t;
        this.f33313j = aVar.v;
        this.f33315l = aVar.w;
        this.f33314k = aVar.x;
        this.H = aVar.y;
        this.I = aVar.z;
        this.L = aVar.A;
        this.v = aVar.B;
        this.w = aVar.C;
        this.M = aVar.D;
        this.O = aVar.E;
        this.P = aVar.F;
        this.f33309f = (int) n.b(this.f33312i, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.L);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.z || (view = this.T) == null) {
            DmtTextView dmtTextView = new DmtTextView(this.f33312i);
            this.Q = dmtTextView;
            if (this.F != 0) {
                dmtTextView.setTextColor(this.F);
            } else {
                dmtTextView.setTextColor(androidx.core.content.b.c(this.f33312i, R.color.a_));
            }
            TextView textView = this.Q;
            if (textView == null) {
                l.a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i2 = Build.VERSION.SDK_INT;
            TextView textView2 = this.Q;
            if (textView2 == null) {
                l.a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.Q;
            if (textView3 == null) {
                l.a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.Q;
            if (textView4 == null) {
                l.a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.Q;
            if (textView5 == null) {
                l.a("mTextView");
            }
            textView5.setMaxWidth((int) n.b(this.f33312i, this.P));
            TextView textView6 = this.Q;
            if (textView6 == null) {
                l.a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.Q;
            if (textView7 == null) {
                l.a("mTextView");
            }
            a(textView7);
            this.x = true;
            if (!TextUtils.isEmpty(this.C)) {
                TextView textView8 = this.Q;
                if (textView8 == null) {
                    l.a("mTextView");
                }
                textView8.setText(this.C);
            }
            if (this.O != null) {
                TextView textView9 = this.Q;
                if (textView9 == null) {
                    l.a("mTextView");
                }
                textView9.setEllipsize(this.O);
            }
            if (this.D != 0) {
                TextView textView10 = this.Q;
                if (textView10 == null) {
                    l.a("mTextView");
                }
                textView10.setText(this.D);
            }
            if (this.E != 0.0f) {
                TextView textView11 = this.Q;
                if (textView11 == null) {
                    l.a("mTextView");
                }
                textView11.setTextSize(1, this.E);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            a(view);
            a aVar2 = this.f33310g;
            if (aVar2 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar2.setUseDefaultView(false);
        }
        int i3 = this.A;
        if (!(i3 == 0 || this.B == 0)) {
            setWidth(i3);
            setHeight(this.B);
            a.f33296l = getWidth();
            a.f33297m = getHeight();
        }
        if (this.x) {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            l.b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.r != 0) {
            a aVar3 = this.f33310g;
            if (aVar3 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar3.setMBgColor(this.r);
        }
        if (this.s != 0) {
            a aVar4 = this.f33310g;
            if (aVar4 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar4.setMBorderColor(this.s);
        }
        if (!this.M) {
            a aVar5 = this.f33310g;
            if (aVar5 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar5.setNeedAddColor(false);
        }
        a aVar6 = this.f33310g;
        if (aVar6 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar6.setMNeedPath(this.t);
        a aVar7 = this.f33310g;
        if (aVar7 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar7.setBubbleOrientation(a(this.f33304a));
        if (this.I != 0.0f) {
            a aVar8 = this.f33310g;
            if (aVar8 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar8.setMPadding(this.I);
        }
        this.U = new g(this);
    }

    public final void a(boolean z2) {
        a aVar = this.f33310g;
        if (aVar == null) {
            l.a("mDmtBubbleLayout");
        }
        if (!z2) {
            n--;
            this.R = true;
        }
        this.f33311h = new AnimatorSet();
        if (aVar != null) {
            aVar.post(new f(this, aVar, z2));
        }
    }

    public final void a(View view, float f2, int i2) {
        this.f33306c = i2;
        this.p = f2;
        a(view, 48, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(android.view.View r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.b.b.b(android.view.View, int, boolean):void");
    }

    public final void a(View view, int i2, boolean z2) {
        if (!this.f33312i.isFinishing() && view != null && view.getWindowToken() != null) {
            this.J = view.getMeasuredHeight();
            this.K = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.U);
            this.f33304a = i2;
            a aVar = this.f33310g;
            if (aVar == null) {
                l.a("mDmtBubbleLayout");
            }
            this.S = aVar.getPADDING();
            if (!isShowing()) {
                int a2 = a(i2);
                int i3 = this.A;
                if (i3 == 0 || this.B == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.B, 1073741824));
                }
                if (z2) {
                    if (i2 == 80 || i2 == 48) {
                        this.p = ((float) d()) / 2.0f;
                    } else {
                        this.p = ((float) c()) / 2.0f;
                    }
                } else if (!this.N) {
                    this.q += (float) (this.S * 8);
                    this.N = true;
                }
                a aVar2 = this.f33310g;
                if (aVar2 == null) {
                    l.a("mDmtBubbleLayout");
                }
                aVar2.a(a2, this.p + this.q);
                b(view, i2, z2);
                this.R = false;
                if (this.y > 0) {
                    getContentView().postDelayed(this.U, this.y);
                }
                n++;
                return;
            }
            super.dismiss();
        }
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        l.d(view, "");
        try {
            super.showAtLocation(view, i2, i3, i4);
            a(true);
        } catch (Exception unused) {
        }
    }

    public final void a(View view, int i2, int i3, int i4, float f2) {
        l.d(view, "");
        try {
            this.f33304a = i2;
            this.q = f2;
            a aVar = this.f33310g;
            if (aVar == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar.a(a(i2), this.p + this.q);
            showAtLocation(view, 0, i3, i4);
            if (this.y > 0) {
                getContentView().postDelayed(this.U, this.y);
            }
        } catch (Exception unused) {
        }
    }
}
