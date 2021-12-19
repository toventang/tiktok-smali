package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.de;
import com.zhiliaoapp.musically.R;

public class LighteningRecordLayout extends FrameLayout implements View.OnTouchListener {
    protected ScaleGestureDetector A;
    protected VideoRecordGestureLayout.a B;
    protected c C;
    public boolean D;
    private boolean E;
    private long F;
    private float G;
    private float H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    public boolean f132795a;
    private int aa;
    private int ab;
    private int ac;
    private long ad;
    private int ae;
    private final int af;
    private long ag;
    private long ah;
    private int[] ai;
    private l aj;
    private Activity ak;
    private boolean al;
    private ArgbEvaluator am;
    private DashPathEffect an;
    private final boolean ao;
    private b ap;
    private View.OnClickListener aq;

    /* renamed from: b  reason: collision with root package name */
    protected float f132796b;

    /* renamed from: c  reason: collision with root package name */
    protected float f132797c;

    /* renamed from: d  reason: collision with root package name */
    protected float f132798d;

    /* renamed from: e  reason: collision with root package name */
    protected int f132799e;

    /* renamed from: f  reason: collision with root package name */
    protected int f132800f;

    /* renamed from: g  reason: collision with root package name */
    protected int f132801g;

    /* renamed from: h  reason: collision with root package name */
    protected int f132802h;

    /* renamed from: i  reason: collision with root package name */
    protected Paint f132803i;

    /* renamed from: j  reason: collision with root package name */
    protected Paint f132804j;

    /* renamed from: k  reason: collision with root package name */
    protected Paint f132805k;

    /* renamed from: l  reason: collision with root package name */
    protected Paint f132806l;

    /* renamed from: m  reason: collision with root package name */
    protected float f132807m;
    protected float n;
    protected long o;
    protected final RectF p;
    public boolean q;
    protected boolean r;
    protected boolean s;
    protected long t;
    protected boolean u;
    protected boolean v;
    protected boolean w;
    public a x;
    public ImageView y;
    public FrameLayout z;

    public interface b {
        static {
            Covode.recordClassIndex(86903);
        }

        void a(float f2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(86904);
        }

        void a(float f2);

        void a(int i2);

        void a(boolean z);

        boolean a();

        void b();

        void c();

        void d();

        boolean e();
    }

    static {
        Covode.recordClassIndex(86895);
    }

    private static double a(double d2) {
        double d3 = 1.0d - d2;
        double d4 = d2 * d2;
        double d5 = d3 * d3;
        return (d5 * d3 * 0.0d) + (d5 * 3.0d * d2 * 0.0d) + (d3 * 3.0d * d4 * 1.0d) + (d4 * d2 * 1.0d);
    }

    public int getCurrentScaleMode() {
        return this.f132801g;
    }

    public int getMode() {
        return this.f132800f;
    }

    class d implements c {

        /* renamed from: b  reason: collision with root package name */
        private final c f132816b;

        static {
            Covode.recordClassIndex(86905);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void c() {
            this.f132816b.c();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void d() {
            this.f132816b.d();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final boolean e() {
            return this.f132816b.e();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final boolean a() {
            return this.f132816b.a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void b() {
            bj.d("RecordLayout onRecordStart isRecording: " + LighteningRecordLayout.this.D);
            if (!LighteningRecordLayout.this.D) {
                this.f132816b.b();
                LighteningRecordLayout.this.D = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void a(float f2) {
            this.f132816b.a(f2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void a(int i2) {
            this.f132816b.a(i2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
        public final void a(boolean z) {
            bj.d("RecordLayout onRecordEnd isRecording: " + LighteningRecordLayout.this.D);
            if (LighteningRecordLayout.this.D) {
                this.f132816b.a(z);
                LighteningRecordLayout.this.D = false;
            }
        }

        public d(c cVar) {
            this.f132816b = cVar;
        }
    }

    private void q() {
        int i2 = this.ae;
        if (i2 != -1) {
            this.f132800f = i2;
            this.ae = -1;
            invalidate();
        }
    }

    public final void g() {
        a(10);
        invalidate();
    }

    private boolean getShouldDrawBorderInner() {
        int i2;
        if (!this.E || (i2 = this.f132799e) == 3 || i2 == 2 || i2 == 4) {
            return false;
        }
        return true;
    }

    private void h() {
        if (this.z == null) {
            return;
        }
        if (this.x == a.PLAN_B || this.x == a.PLAN_C) {
            this.z.setVisibility(0);
        }
    }

    private void i() {
        if (this.z == null) {
            return;
        }
        if (this.x == a.PLAN_B || this.x == a.PLAN_C) {
            this.z.setVisibility(8);
        }
    }

    private void k() {
        if (this.y != null && this.x == a.PLAN_C) {
            this.y.setVisibility(0);
        }
    }

    private void m() {
        if (this.y != null && this.x == a.PLAN_C) {
            this.y.setVisibility(8);
        }
    }

    private int p() {
        int i2;
        if (this.v) {
            i2 = this.J;
        } else {
            i2 = this.L;
        }
        int i3 = ((SystemClock.uptimeMillis() - this.o) > 350 ? 1 : ((SystemClock.uptimeMillis() - this.o) == 350 ? 0 : -1));
        return i2;
    }

    private boolean r() {
        if (System.currentTimeMillis() - this.ag < 300) {
            return true;
        }
        return false;
    }

    public final void b() {
        super.setOnClickListener(this.aq);
        this.ae = this.f132800f;
        this.f132800f = 1;
    }

    public final void f() {
        int i2 = this.f132799e;
        if (i2 == 10 || i2 == 9 || i2 == 3) {
            a(12);
            invalidate();
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.an == null) {
            this.an = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.an;
    }

    private void l() {
        if (this.y != null && this.x == a.PLAN_C) {
            int i2 = this.f132800f;
            if (i2 == 3) {
                this.y.setImageResource(R.drawable.gx);
            } else if (i2 == 1) {
                this.y.setImageResource(R.drawable.gw);
            }
        }
    }

    private void n() {
        Paint paint = this.f132803i;
        if (paint != null && this.f132804j != null && this.f132806l != null && this.f132805k != null) {
            paint.setColor(this.L);
            this.f132804j.setColor(this.M);
            this.f132806l.setColor(this.O);
            this.f132805k.setColor(this.N);
        }
    }

    private void o() {
        Paint paint = this.f132803i;
        if (paint != null && this.f132804j != null) {
            paint.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
            this.f132804j.setColor(androidx.core.content.b.c(getContext(), R.color.ob));
        }
    }

    public final void c() {
        int i2 = this.f132799e;
        if (i2 == 1 || i2 == 4 || i2 == 12) {
            a(2);
            invalidate();
        } else if (i2 == 10 || i2 == 9) {
            a(11);
            invalidate();
        } else if (i2 == 3 || i2 == 2) {
            a(4);
        }
    }

    public final void d() {
        q();
        int i2 = this.f132799e;
        if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
            if (this.F <= 0 || i2 == 13 || i2 == 14) {
                a(4);
            } else {
                a(9);
            }
            this.D = false;
            if (this.ao) {
                invalidate();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f132813a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 86901(0x15375, float:1.21774E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a[] r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.f132813a = r2
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.f132813a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.PLAN_A     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.f132813a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.PLAN_B     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.f132813a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.PLAN_C     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.f132813a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.a.PLAN_LIGHTENING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass4.<clinit>():void");
        }
    }

    public enum a {
        DEFAULT,
        PLAN_A,
        PLAN_B,
        PLAN_C,
        PLAN_LIGHTENING;

        static {
            Covode.recordClassIndex(86902);
        }
    }

    private void j() {
        if (this.z == null) {
            return;
        }
        if (this.x == a.PLAN_B) {
            int i2 = this.f132800f;
            if (i2 == 3) {
                this.z.setBackground(com.ss.android.ugc.tools.view.a.a(this.M, 0, (int) com.bytedance.lighten.a.d.c.a(getContext(), 8.0f)));
            } else if (i2 == 1) {
                this.z.setBackground(com.ss.android.ugc.tools.view.a.a(0, this.J, 0));
            }
        } else if (this.x == a.PLAN_C) {
            int i3 = this.f132800f;
            if (i3 == 3) {
                this.z.setBackground(com.ss.android.ugc.tools.view.a.a(0, this.L, 0));
            } else if (i3 == 1) {
                this.z.setBackground(com.ss.android.ugc.tools.view.a.a(0, this.J, 0));
            }
        }
    }

    public final void a() {
        Paint paint = this.f132803i;
        if (paint != null && this.f132804j != null) {
            paint.setColor(this.J);
            this.f132804j.setColor(this.K);
        }
    }

    public final void e() {
        q();
        setHasBeenMoveScaled(false);
        this.C.d();
        int i2 = this.f132799e;
        if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
            if (this.F <= 0 || i2 == 13 || i2 == 14) {
                a(4);
            } else {
                a(9);
            }
        }
        this.C.a(true);
        this.t = System.currentTimeMillis();
        invalidate();
    }

    public void setActivity(Activity activity) {
        this.ak = activity;
    }

    public void setCurrentScaleMode(int i2) {
        this.f132801g = i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setOnGestureListener(VideoRecordGestureLayout.a aVar) {
        this.B = aVar;
    }

    public void setRecordLayoutUIChangedListener(b bVar) {
        this.ap = bVar;
    }

    public void setRecordingTime(long j2) {
        this.F = j2;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.A = scaleGestureDetector;
    }

    public void setCanTouch(Boolean bool) {
        this.al = bool.booleanValue();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    private int b(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        return this.af;
    }

    private void c(int i2) {
        this.f132802h = i2;
        this.ad = SystemClock.uptimeMillis();
    }

    public void setColorSchemeBackground(FrameLayout frameLayout) {
        this.z = frameLayout;
        j();
        h();
    }

    public void setColorSchemeIcon(ImageView imageView) {
        this.y = imageView;
        l();
        k();
    }

    public void setHasBeenMoveScaled(boolean z2) {
        this.q = z2;
        this.ag = System.currentTimeMillis();
    }

    public void setRecordListener(c cVar) {
        if (cVar != null) {
            this.C = new d(cVar);
        } else {
            this.C = null;
        }
    }

    public void setShouldDrawBorder(boolean z2) {
        boolean z3 = this.E;
        this.E = z2;
        if (z3 != z2) {
            invalidate();
        }
    }

    private int a(long j2) {
        int i2;
        if (this.v) {
            i2 = this.K;
        } else {
            i2 = this.M;
        }
        int i3 = ((SystemClock.uptimeMillis() - j2) > 350 ? 1 : ((SystemClock.uptimeMillis() - j2) == 350 ? 0 : -1));
        return i2;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        this.f132799e = i2;
        this.o = SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r8 == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (r13.f132802h == 0) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
        // Method dump skipped, instructions count: 1450
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public LighteningRecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10945);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(b(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(b(i3), 1073741824));
        MethodCollector.o(10945);
    }

    private int b(int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i3 = this.U - this.V;
        float f2 = ((float) (uptimeMillis - j2)) / 350.0f;
        if (i2 == 1 || i2 == 6 || i2 == 7 || i2 == 8) {
            return i3;
        }
        if (i2 == 2) {
            return a(i3, 0, f2);
        }
        if (i2 == 12) {
            return a(0, i3, f2);
        }
        if (i2 == 4) {
            return a(0, i3, f2);
        }
        return 0;
    }

    private int c(int i2, long j2) {
        float uptimeMillis = (((float) (SystemClock.uptimeMillis() - j2)) * 1.0f) / 350.0f;
        if (i2 == 1 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) {
            return this.ab;
        }
        if (i2 == 2 || i2 == 11) {
            return a(this.ab, this.ac, uptimeMillis);
        }
        if (i2 == 3) {
            return this.ac;
        }
        if (i2 == 4 || i2 == 9) {
            return a(this.ac, this.ab, uptimeMillis);
        }
        return 0;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.al || this.B == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            this.B.a(motionEvent, this.ai);
        } else if (action == 5) {
            this.B.d(motionEvent, this.ai);
            this.B.b(motionEvent, this.ai);
        } else if (action == 6) {
            this.B.e(motionEvent, this.ai);
            this.B.c(motionEvent, this.ai);
        }
        return false;
    }

    private int a(int i2, long j2) {
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - j2)) / 350.0f;
        if (i2 == 1 || i2 == 6 || i2 == 7 || i2 == 8) {
            int i3 = this.U;
            this.ap.a((float) i3);
            return i3;
        } else if (i2 == 2) {
            int a2 = a(this.U, this.S, uptimeMillis);
            this.ap.a((float) a2);
            return a2;
        } else if (i2 == 3) {
            int i4 = this.S;
            this.ap.a((float) i4);
            return i4;
        } else if (i2 == 9) {
            int a3 = a(this.S, this.T, uptimeMillis);
            this.ap.a((float) a3);
            return a3;
        } else if (i2 == 10) {
            int i5 = this.T;
            this.ap.a((float) i5);
            return i5;
        } else if (i2 == 11) {
            int a4 = a(this.T, this.S, uptimeMillis);
            this.ap.a((float) a4);
            return a4;
        } else if (i2 == 12) {
            int a5 = a(this.T, this.U, uptimeMillis);
            this.ap.a((float) a5);
            return a5;
        } else if (i2 != 4) {
            return 0;
        } else {
            int a6 = a(this.S, this.T, uptimeMillis);
            this.ap.a((float) a6);
            return a6;
        }
    }

    public final void a(int i2, boolean z2) {
        this.u = this.v;
        int i3 = this.f132800f;
        this.I = i3;
        this.f132800f = i2;
        this.v = z2;
        this.w = true;
        if (!this.r) {
            invalidate();
            super.setOnClickListener(this.aq);
            this.r = !this.r;
        } else if (i2 != i3) {
            l();
            k();
            j();
            h();
            if (i2 == 1) {
                a();
                super.setOnClickListener(this.aq);
                a(6);
            } else if (i2 == 0) {
                this.f132803i.setColor(this.L);
                this.f132804j.setColor(this.M);
                super.setOnClickListener(null);
                a(8);
            } else if (i2 == 3) {
                n();
                super.setOnClickListener(this.aq);
                a(7);
            }
            invalidate();
        }
    }

    private static int a(int i2, int i3, float f2) {
        double d2 = (double) (i3 - i2);
        double a2 = a((double) f2);
        Double.isNaN(d2);
        return i2 + ((int) (d2 * a2));
    }

    private LighteningRecordLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        boolean z2;
        MethodCollector.i(10782);
        this.f132795a = true;
        this.E = true;
        this.f132800f = 3;
        this.I = -1;
        this.ae = -1;
        this.af = (int) n.b(getContext(), 100.0f);
        this.p = new RectF();
        this.ag = 0;
        this.r = false;
        this.s = false;
        this.ai = new int[]{0, 0};
        this.al = true;
        this.w = true;
        this.am = new ArgbEvaluator();
        this.x = a.DEFAULT;
        if (com.ss.android.ugc.aweme.setting.i.d.a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ao = z2;
        this.ap = new b() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86896);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.b
            public final void a(float f2) {
            }
        };
        this.C = new c() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(86897);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(float f2) {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final boolean a() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void c() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void d() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final boolean e() {
                return false;
            }
        };
        this.aq = new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86898);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (LighteningRecordLayout.this.f132799e == 1) {
                    if (!new de().a(view) || LighteningRecordLayout.this.C.a()) {
                        return;
                    }
                    if (LighteningRecordLayout.this.v) {
                        if (LighteningRecordLayout.this.z != null && (LighteningRecordLayout.this.x == a.PLAN_B || LighteningRecordLayout.this.x == a.PLAN_C)) {
                            LighteningRecordLayout.this.z.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                /* class com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass3.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(86899);
                                }

                                public final void run() {
                                    LighteningRecordLayout.this.z.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        if (LighteningRecordLayout.this.y != null && LighteningRecordLayout.this.x == a.PLAN_C) {
                            LighteningRecordLayout.this.y.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                /* class com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AnonymousClass3.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(86900);
                                }

                                public final void run() {
                                    LighteningRecordLayout.this.y.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        LighteningRecordLayout.this.a(13);
                        LighteningRecordLayout.this.invalidate();
                        LighteningRecordLayout.this.C.c();
                        return;
                    }
                    LighteningRecordLayout.this.a(2);
                    LighteningRecordLayout.this.invalidate();
                    LighteningRecordLayout.this.C.b();
                } else if ((LighteningRecordLayout.this.f132799e == 3 || LighteningRecordLayout.this.f132799e == 2) && LighteningRecordLayout.this.w) {
                    LighteningRecordLayout.this.a(9);
                    LighteningRecordLayout.this.C.a(false);
                }
            }
        };
        this.P = (int) n.b(context, 55.0f);
        this.Q = (int) n.b(context, 40.0f);
        this.R = (int) n.b(context, 40.0f);
        this.S = (int) n.b(context, 58.0f);
        this.T = (int) n.b(context, 48.0f);
        this.U = (int) n.b(context, 40.0f);
        this.V = (int) n.b(context, 6.0f);
        this.W = (int) n.b(context, 8.0f);
        this.aa = (int) n.b(context, 18.0f);
        this.ab = (int) n.b(context, 32.0f);
        this.ac = (int) n.b(context, 18.0f);
        if (context instanceof e) {
            this.aj = new l((e) context);
        }
        this.f132799e = 1;
        Paint paint = new Paint();
        this.f132803i = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f132803i.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f132804j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f132804j.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f132805k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f132805k.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f132806l = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.f132806l.setAntiAlias(true);
        this.x = a.PLAN_LIGHTENING;
        int i2 = AnonymousClass4.f132813a[this.x.ordinal()];
        if (i2 == 1) {
            this.L = androidx.core.content.b.c(getContext(), R.color.bh);
            this.M = androidx.core.content.b.c(getContext(), R.color.ob);
            this.J = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.K = androidx.core.content.b.c(getContext(), R.color.re);
            this.O = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.N = androidx.core.content.b.c(getContext(), R.color.ns);
        } else if (i2 == 2) {
            this.L = androidx.core.content.b.c(getContext(), R.color.bh);
            this.M = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.J = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.K = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.O = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.N = androidx.core.content.b.c(getContext(), R.color.ns);
        } else if (i2 == 3) {
            this.L = 0;
            this.M = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.J = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.K = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.O = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.N = androidx.core.content.b.c(getContext(), R.color.ns);
        } else if (i2 == 4) {
            this.L = androidx.core.content.b.c(getContext(), R.color.bh);
            this.M = androidx.core.content.b.c(getContext(), R.color.bh);
            this.J = androidx.core.content.b.c(getContext(), R.color.bh);
            this.K = androidx.core.content.b.c(getContext(), R.color.bh);
            this.O = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.N = androidx.core.content.b.c(getContext(), R.color.ns);
        } else if (i2 == 5) {
            this.L = androidx.core.content.b.c(getContext(), R.color.bh);
            this.M = androidx.core.content.b.c(getContext(), R.color.ob);
            this.J = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.K = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.O = androidx.core.content.b.c(getContext(), R.color.f159928l);
            this.N = androidx.core.content.b.c(getContext(), R.color.ns);
        }
        n();
        setOnTouchListener(this);
        MethodCollector.o(10782);
    }

    private int a(int i2, int i3, long j2, long j3) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float f2 = (((float) (uptimeMillis - j2)) * 1.0f) / 350.0f;
        float f3 = (((float) (uptimeMillis - j3)) * 1.0f) / 350.0f;
        if (i2 == 1 || i2 == 6 || i2 == 7 || i2 == 8) {
            return this.ab;
        }
        if (i2 == 2) {
            return a(this.ab, this.W, f2);
        }
        if (i2 == 3) {
            if (i3 == 0) {
                return this.W;
            }
            if (i3 == 2) {
                return a(this.W, this.aa, f3);
            }
            if (i3 == 1) {
                return this.aa;
            }
        }
        if (i2 == 9 || i2 == 4) {
            if (i3 == 0) {
                return a(this.W, this.ab, f2);
            }
            if (i3 == 2) {
                return 0;
            }
            if (i3 == 1) {
                return a(this.aa, this.ab, f2);
            }
        }
        if (i2 == 10) {
            return this.ab;
        }
        if (i2 == 11) {
            return a(this.ab, this.W, f2);
        }
        if (i2 == 12) {
            return this.ab;
        }
        return 0;
    }
}
