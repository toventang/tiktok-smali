package com.bytedance.android.live.core.widget.a;

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
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends PopupWindow {

    /* renamed from: l  reason: collision with root package name */
    public static volatile int f9319l;

    /* renamed from: m  reason: collision with root package name */
    public static final C0138b f9320m = new C0138b((byte) 0);
    private String A = "";
    private int B;
    private float C;
    private float D = 13.0f;
    private int E;
    private Typeface F;
    private boolean G = true;
    private float H = 12.0f;
    private int I;
    private int J;
    private boolean K = true;
    private boolean L = true;
    private boolean M;
    private TextView N;
    private boolean O;
    private int P;
    private Activity Q;
    private View R;
    private c<Point> S;
    private final Runnable T;

    /* renamed from: a  reason: collision with root package name */
    public int f9321a;

    /* renamed from: b  reason: collision with root package name */
    public float f9322b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9323c;

    /* renamed from: d  reason: collision with root package name */
    public int f9324d;

    /* renamed from: e  reason: collision with root package name */
    public long f9325e = 200;

    /* renamed from: f  reason: collision with root package name */
    public int f9326f;

    /* renamed from: g  reason: collision with root package name */
    public a f9327g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f9328h;

    /* renamed from: i  reason: collision with root package name */
    public c f9329i;

    /* renamed from: j  reason: collision with root package name */
    public e f9330j;

    /* renamed from: k  reason: collision with root package name */
    public d f9331k;
    private float n;
    private int o;
    private int p;
    private boolean q = true;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private int v;
    private long w = 5000;
    private boolean x = true;
    private int y;
    private int z;

    public interface c {
        static {
            Covode.recordClassIndex(4755);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(4756);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(4757);
        }
    }

    static {
        Covode.recordClassIndex(4752);
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

    /* renamed from: com.bytedance.android.live.core.widget.a.b$b  reason: collision with other inner class name */
    public static final class C0138b {
        static {
            Covode.recordClassIndex(4754);
        }

        private C0138b() {
        }

        public /* synthetic */ C0138b(byte b2) {
            this();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9349a;

        static {
            Covode.recordClassIndex(4760);
        }

        g(b bVar) {
            this.f9349a = bVar;
        }

        public final void run() {
            this.f9349a.a(false);
        }
    }

    public final int c() {
        a();
        View contentView = getContentView();
        l.b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.O) {
            a(false);
            getContentView().removeCallbacks(this.T);
            this.f9324d = 0;
            this.v = 0;
        }
    }

    public final void a() {
        int i2 = this.y;
        if (i2 == 0 || this.z == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.z, 1073741824));
    }

    public final void b() {
        AnimatorSet animatorSet = this.f9328h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f9328h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f9328h = null;
        if (!this.Q.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f9346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9347c;

        static {
            Covode.recordClassIndex(4758);
        }

        f(b bVar, a aVar, boolean z) {
            this.f9345a = bVar;
            this.f9346b = aVar;
            this.f9347c = z;
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
            if (this.f9345a.f9328h != null) {
                int i4 = this.f9345a.f9321a;
                if (i4 != 3) {
                    if (i4 == 5) {
                        i2 = (int) this.f9346b.getX();
                        f3 = this.f9346b.getY();
                        f4 = b.a(this.f9345a).getBubbleOffset();
                    } else if (i4 == 48) {
                        i2 = (int) (this.f9346b.getX() + b.a(this.f9345a).getBubbleOffset());
                        f3 = this.f9346b.getY();
                        f4 = (float) this.f9346b.getMeasuredHeight();
                    } else if (i4 != 80) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        i2 = (int) (this.f9346b.getX() + b.a(this.f9345a).getBubbleOffset());
                        f2 = this.f9346b.getY();
                        i3 = (int) f2;
                    }
                    f2 = f3 + f4;
                    i3 = (int) f2;
                } else {
                    i2 = (int) (this.f9346b.getX() + ((float) this.f9346b.getMeasuredWidth()));
                    f3 = this.f9346b.getY();
                    f4 = b.a(this.f9345a).getBubbleOffset();
                    f2 = f3 + f4;
                    i3 = (int) f2;
                }
                this.f9346b.setPivotY((float) i3);
                this.f9346b.setPivotX((float) i2);
                a aVar = this.f9346b;
                float[] fArr = new float[2];
                boolean z = this.f9347c;
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
                a aVar2 = this.f9346b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f9347c;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9346b, "translationY", 0.0f);
                l.b(ofFloat3, "");
                if (this.f9347c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat3.setDuration(j2);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9346b, "translationY", 0.0f);
                l.b(ofFloat4, "");
                if (this.f9347c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat4.setDuration(j3);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9346b, "translationX", 0.0f);
                l.b(ofFloat5, "");
                if (this.f9347c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat5.setDuration(j4);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9346b, "translationX", 0.0f);
                l.b(ofFloat6, "");
                if (this.f9347c) {
                    j5 = 500;
                } else {
                    j5 = 200;
                }
                ofFloat6.setDuration(j5);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f9346b, "translationY", 0.0f, 10.0f);
                l.b(ofFloat7, "");
                if (this.f9347c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat7.setDuration(j6);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f9346b, "translationY", 0.0f, -10.0f);
                l.b(ofFloat8, "");
                if (this.f9347c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat8.setDuration(j7);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f9346b, "translationX", 0.0f, -10.0f);
                l.b(ofFloat9, "");
                if (this.f9347c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat9.setDuration(j8);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f9346b, "translationX", 0.0f, 10.0f);
                l.b(ofFloat10, "");
                if (this.f9347c) {
                    j9 = 200;
                } else {
                    j9 = 150;
                }
                ofFloat10.setDuration(j9);
                this.f9346b.setVisibility(0);
                if (this.f9347c) {
                    int i5 = this.f9345a.f9321a;
                    if (i5 == 3) {
                        ofFloat9.setInterpolator(new com.bytedance.android.live.core.widget.e());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f9345a.f9328h;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i5 == 5) {
                        ofFloat10.setInterpolator(new com.bytedance.android.live.core.widget.e());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f9345a.f9328h;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i5 == 48) {
                        ofFloat8.setInterpolator(new com.bytedance.android.live.core.widget.e());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f9345a.f9328h;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i5 == 80) {
                        ofFloat7.setInterpolator(new com.bytedance.android.live.core.widget.e());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f9345a.f9328h;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i6 = this.f9345a.f9321a;
                    if (i6 == 3) {
                        ofFloat6.setInterpolator(new com.bytedance.android.live.core.widget.d());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f9345a.f9328h;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i6 == 5) {
                        ofFloat5.setInterpolator(new com.bytedance.android.live.core.widget.d());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f9345a.f9328h;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i6 == 48) {
                        ofFloat3.setInterpolator(new com.bytedance.android.live.core.widget.d());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f9345a.f9328h;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i6 == 80) {
                        ofFloat4.setInterpolator(new com.bytedance.android.live.core.widget.d());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f9345a.f9328h;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f9345a.f9328h;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.bytedance.android.live.core.widget.a.b.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f9348a;

                        static {
                            Covode.recordClassIndex(4759);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f9348a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f9348a.f9347c) {
                                this.f9348a.f9346b.setVisibility(8);
                                this.f9348a.f9345a.b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            l.d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f9348a.f9347c) {
                                this.f9348a.f9346b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f9345a.f9323c && (animatorSet = this.f9345a.f9328h) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f9345a.f9328h;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9350a;

        static {
            Covode.recordClassIndex(4761);
        }

        h(b bVar) {
            this.f9350a = bVar;
        }

        public final void onClick(View view) {
            this.f9350a.dismiss();
        }
    }

    public static final /* synthetic */ a a(b bVar) {
        a aVar = bVar.f9327g;
        if (aVar == null) {
            l.a("mDmtBubbleLayout");
        }
        return aVar;
    }

    public static final class a {
        public float A = 12.0f;
        public boolean B = true;
        public boolean C;
        public int D;
        public boolean E = true;
        public Activity F;

        /* renamed from: a  reason: collision with root package name */
        public int f9332a;

        /* renamed from: b  reason: collision with root package name */
        public float f9333b;

        /* renamed from: c  reason: collision with root package name */
        public int f9334c;

        /* renamed from: d  reason: collision with root package name */
        public int f9335d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9336e = true;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9337f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9338g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9339h;

        /* renamed from: i  reason: collision with root package name */
        public int f9340i;

        /* renamed from: j  reason: collision with root package name */
        public int f9341j;

        /* renamed from: k  reason: collision with root package name */
        public long f9342k = 800;

        /* renamed from: l  reason: collision with root package name */
        public long f9343l = 5000;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9344m = true;
        public View n;
        public int o;
        public int p;
        public String q = "";
        public int r;
        public float s = 197.0f;
        public float t = 13.0f;
        public Typeface u;
        public int v;
        public c w;
        public d x;
        public e y;
        public boolean z = true;

        static {
            Covode.recordClassIndex(4753);
        }

        public a(Activity activity) {
            l.d(activity, "");
            this.F = activity;
        }
    }

    public final void a(boolean z2) {
        a aVar = this.f9327g;
        if (aVar == null) {
            l.a("mDmtBubbleLayout");
        }
        if (!z2) {
            f9319l--;
            this.O = true;
        }
        this.f9328h = new AnimatorSet();
        if (aVar != null) {
            aVar.post(new f(this, aVar, z2));
        }
    }

    private final void b(View view) {
        a aVar = new a(this.Q);
        this.f9327g = aVar;
        aVar.setBackgroundColor(0);
        a aVar2 = this.f9327g;
        if (aVar2 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar2.addView(view);
        a aVar3 = this.f9327g;
        if (aVar3 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        a aVar4 = this.f9327g;
        if (aVar4 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar4.setLayoutParams(marginLayoutParams);
        a aVar5 = this.f9327g;
        if (aVar5 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar5.setVisibility(8);
        if (this.o != 0) {
            a aVar6 = this.f9327g;
            if (aVar6 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar6.setMBgColor(this.o);
        }
        a aVar7 = this.f9327g;
        if (aVar7 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar7.setMNeedPath(this.q);
        a aVar8 = this.f9327g;
        if (aVar8 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar8.setMNeedArrow(this.G);
        a aVar9 = this.f9327g;
        if (aVar9 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar9.setMNeedPressFade(this.r);
        a aVar10 = this.f9327g;
        if (aVar10 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar10.setMNeedShadow(this.s);
        a aVar11 = this.f9327g;
        if (aVar11 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar11.setMShadowColor(this.t);
        a aVar12 = this.f9327g;
        if (aVar12 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar12.setOnClickListener(new h(this));
        a aVar13 = this.f9327g;
        if (aVar13 == null) {
            l.a("mDmtBubbleLayout");
        }
        setContentView(aVar13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r1 == null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.widget.a.b.a(android.view.View):void");
    }

    public b(a aVar) {
        View view;
        l.d(aVar, "");
        this.Q = aVar.F;
        this.f9321a = aVar.f9332a;
        this.n = aVar.f9333b;
        this.o = aVar.f9334c;
        this.p = aVar.f9335d;
        this.q = aVar.f9336e;
        this.r = aVar.f9337f;
        this.f9323c = aVar.f9338g;
        this.u = aVar.f9339h;
        this.f9324d = aVar.f9340i;
        this.v = aVar.f9341j;
        this.f9325e = aVar.f9342k;
        this.w = aVar.f9343l;
        this.x = aVar.f9344m;
        this.R = aVar.n;
        this.z = aVar.p;
        this.y = aVar.o;
        this.A = aVar.q;
        this.B = aVar.r;
        this.C = aVar.s;
        this.D = aVar.t;
        this.E = aVar.v;
        this.F = aVar.u;
        this.f9329i = aVar.w;
        this.f9331k = aVar.x;
        this.f9330j = aVar.y;
        this.G = aVar.z;
        this.H = aVar.A;
        this.K = aVar.B;
        this.s = aVar.C;
        this.t = aVar.D;
        this.L = aVar.E;
        this.f9326f = (int) n.b(this.Q, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.K);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.x || (view = this.R) == null) {
            LiveTextView liveTextView = new LiveTextView(this.Q);
            this.N = liveTextView;
            if (this.E != 0) {
                liveTextView.setTextColor(this.E);
            } else {
                liveTextView.setTextColor(this.Q.getResources().getColor(R.color.a1y));
            }
            TextView textView = this.N;
            if (textView == null) {
                l.a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i2 = Build.VERSION.SDK_INT;
            TextView textView2 = this.N;
            if (textView2 == null) {
                l.a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.N;
            if (textView3 == null) {
                l.a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.N;
            if (textView4 == null) {
                l.a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.N;
            if (textView5 == null) {
                l.a("mTextView");
            }
            textView5.setMaxWidth((int) n.b(this.Q, this.C));
            TextView textView6 = this.N;
            if (textView6 == null) {
                l.a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.N;
            if (textView7 == null) {
                l.a("mTextView");
            }
            b(textView7);
            this.u = true;
            if (!TextUtils.isEmpty(this.A)) {
                TextView textView8 = this.N;
                if (textView8 == null) {
                    l.a("mTextView");
                }
                textView8.setText(this.A);
            }
            if (this.B != 0) {
                TextView textView9 = this.N;
                if (textView9 == null) {
                    l.a("mTextView");
                }
                textView9.setText(this.B);
            }
            if (this.D != 0.0f) {
                TextView textView10 = this.N;
                if (textView10 == null) {
                    l.a("mTextView");
                }
                textView10.setTextSize(1, this.D);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            b(view);
            a aVar2 = this.f9327g;
            if (aVar2 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar2.setUseDefaultView(false);
        }
        int i3 = this.y;
        if (!(i3 == 0 || this.z == 0)) {
            setWidth(i3);
            setHeight(this.z);
            a.n = getWidth();
            a.o = getHeight();
        }
        if (this.u) {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            l.b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.o != 0) {
            a aVar3 = this.f9327g;
            if (aVar3 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar3.setMBgColor(this.o);
        }
        if (this.p != 0) {
            a aVar4 = this.f9327g;
            if (aVar4 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar4.setMBorderColor(this.p);
        }
        if (!this.L) {
            a aVar5 = this.f9327g;
            if (aVar5 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar5.setNeedAddColor(false);
        }
        a aVar6 = this.f9327g;
        if (aVar6 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar6.setMNeedPath(this.q);
        a aVar7 = this.f9327g;
        if (aVar7 == null) {
            l.a("mDmtBubbleLayout");
        }
        aVar7.setBubbleOrientation(a(this.f9321a));
        if (this.H != 0.0f) {
            a aVar8 = this.f9327g;
            if (aVar8 == null) {
                l.a("mDmtBubbleLayout");
            }
            aVar8.setMPadding(this.H);
        }
        this.T = new g(this);
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        l.d(view, "");
        try {
            super.showAtLocation(view, i2, i3, i4);
            a(true);
        } catch (Exception unused) {
        }
    }
}
