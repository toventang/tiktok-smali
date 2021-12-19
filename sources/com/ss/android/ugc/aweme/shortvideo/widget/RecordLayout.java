package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.setting.i.d;
import com.ss.android.ugc.aweme.setting.i.p;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.de;
import com.zhiliaoapp.musically.R;

public class RecordLayout extends FrameLayout implements View.OnTouchListener {
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private long J;
    private int K;
    private final int L;
    private long M;
    private long N;
    private final int[] O;
    private l P;
    private Activity Q;
    private boolean R;
    private final ArgbEvaluator S;
    private DashPathEffect T;
    private final boolean U;
    private final boolean V;
    private final View.OnClickListener W;

    /* renamed from: a  reason: collision with root package name */
    public boolean f132830a;

    /* renamed from: b  reason: collision with root package name */
    protected float f132831b;

    /* renamed from: c  reason: collision with root package name */
    protected float f132832c;

    /* renamed from: d  reason: collision with root package name */
    protected int f132833d;

    /* renamed from: e  reason: collision with root package name */
    protected int f132834e;

    /* renamed from: f  reason: collision with root package name */
    protected int f132835f;

    /* renamed from: g  reason: collision with root package name */
    protected int f132836g;

    /* renamed from: h  reason: collision with root package name */
    protected Paint f132837h;

    /* renamed from: i  reason: collision with root package name */
    protected Paint f132838i;

    /* renamed from: j  reason: collision with root package name */
    protected float f132839j;

    /* renamed from: k  reason: collision with root package name */
    protected float f132840k;

    /* renamed from: l  reason: collision with root package name */
    protected long f132841l;

    /* renamed from: m  reason: collision with root package name */
    protected final RectF f132842m;
    public boolean n;
    protected boolean o;
    protected boolean p;
    protected long q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected ScaleGestureDetector v;
    protected VideoRecordGestureLayout.a w;
    protected a x;
    public boolean y;
    private float z;

    public interface a {
        static {
            Covode.recordClassIndex(86909);
        }

        void a();

        void a(float f2);

        void a(int i2);

        boolean b();

        void c();

        void d();

        void e();

        void f();

        boolean g();

        void h();
    }

    static {
        Covode.recordClassIndex(86907);
    }

    private static double a(double d2) {
        double d3 = 1.0d - d2;
        double d4 = d2 * d2;
        double d5 = d3 * d3;
        return (d5 * d3 * 0.0d) + (d5 * 3.0d * d2 * 0.0d) + (d3 * 3.0d * d4 * 1.0d) + (d4 * d2 * 1.0d);
    }

    public int getCurrentScaleMode() {
        return this.f132835f;
    }

    public int getMode() {
        return this.f132834e;
    }

    /* access modifiers changed from: package-private */
    public class b implements a {

        /* renamed from: b  reason: collision with root package name */
        private final a f132845b;

        static {
            Covode.recordClassIndex(86910);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a() {
            this.f132845b.a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final boolean b() {
            return this.f132845b.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void e() {
            this.f132845b.e();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void f() {
            this.f132845b.f();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final boolean g() {
            return this.f132845b.g();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void h() {
            this.f132845b.h();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void c() {
            bj.d("RecordLayout onRecordStart isRecording: " + RecordLayout.this.y);
            if (!RecordLayout.this.y) {
                this.f132845b.c();
                RecordLayout.this.y = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void d() {
            bj.d("RecordLayout onRecordEnd isRecording: " + RecordLayout.this.y);
            if (RecordLayout.this.y) {
                this.f132845b.d();
                RecordLayout.this.y = false;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a(float f2) {
            this.f132845b.a(f2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a(int i2) {
            this.f132845b.a(i2);
        }

        public b(a aVar) {
            this.f132845b = aVar;
        }
    }

    private void g() {
        int i2 = this.K;
        if (i2 != -1) {
            this.f132834e = i2;
            this.K = -1;
            invalidate();
        }
    }

    public long getActionDownTime() {
        Activity activity = this.Q;
        if (activity instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) activity).E;
        }
        return this.N;
    }

    private void e() {
        Paint paint = this.f132837h;
        if (paint != null && this.f132838i != null) {
            paint.setColor(this.D);
            this.f132838i.setColor(this.E);
        }
    }

    private boolean h() {
        if (System.currentTimeMillis() - this.M < 300) {
            return true;
        }
        return false;
    }

    public final void b() {
        int i2 = this.f132833d;
        if (i2 == 1) {
            b(2);
            invalidate();
        } else if (i2 == 3 || i2 == 2) {
            b(4);
        }
    }

    public final void c() {
        g();
        int i2 = this.f132833d;
        if (i2 == 3 || i2 == 2) {
            b(4);
            this.y = false;
            if (this.V || this.U) {
                invalidate();
            }
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.T == null) {
            this.T = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.T;
    }

    private void f() {
        Paint paint = this.f132837h;
        if (paint != null && this.f132838i != null) {
            paint.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
            this.f132838i.setColor(androidx.core.content.b.c(getContext(), R.color.ob));
        }
    }

    public final void d() {
        g();
        setHasBeenMoveScaled(false);
        this.x.f();
        int i2 = this.f132833d;
        if (i2 == 3 || i2 == 2) {
            b(4);
        }
        this.x.d();
        this.q = System.currentTimeMillis();
        invalidate();
    }

    public final void a() {
        Paint paint = this.f132837h;
        if (paint != null && this.f132838i != null) {
            paint.setColor(this.B);
            this.f132838i.setColor(this.C);
        }
    }

    public void setActivity(Activity activity) {
        this.Q = activity;
    }

    public void setCurrentScaleMode(int i2) {
        this.f132835f = i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setOnGestureListener(VideoRecordGestureLayout.a aVar) {
        this.w = aVar;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.v = scaleGestureDetector;
    }

    public void setCanTouch(Boolean bool) {
        this.R = bool.booleanValue();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    private int c(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        return this.L;
    }

    private void d(int i2) {
        this.f132836g = i2;
        this.J = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        this.f132833d = i2;
        this.f132841l = SystemClock.uptimeMillis();
    }

    public void setHasBeenMoveScaled(boolean z2) {
        this.n = z2;
        this.M = System.currentTimeMillis();
    }

    public void setRecordListener(a aVar) {
        if (aVar != null) {
            this.x = new b(aVar);
        } else {
            this.x = null;
        }
    }

    private int a(long j2) {
        return (int) (((((float) this.H) * 0.85f) * ((float) Math.min(300L, SystemClock.uptimeMillis() - j2))) / 300.0f);
    }

    private int b(long j2) {
        int i2;
        int i3;
        if (this.s) {
            i2 = this.D;
            i3 = this.B;
        } else {
            if (this.r) {
                i2 = this.B;
            } else {
                i2 = this.D;
            }
            i3 = this.D;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f132841l > 300) {
            return i3;
        }
        return ((Integer) this.S.evaluate((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
    }

    private int c(long j2) {
        int i2;
        int i3;
        if (this.s) {
            i2 = this.E;
            i3 = this.C;
        } else {
            if (this.r) {
                i2 = this.C;
            } else {
                i2 = this.E;
            }
            i3 = this.E;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        if (uptimeMillis > 300) {
            return i3;
        }
        return ((Integer) this.S.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r1 == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (r11.f132841l != 2) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        if (r11.f132836g != 0) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a(int i2) {
        super.setOnClickListener(this.W);
        this.K = this.f132834e;
        this.f132834e = 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0279, code lost:
        if (r19.f132836g == 2) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034d, code lost:
        if (r12 == 1) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0378, code lost:
        if (r12 == 2) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037a, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r20) {
        /*
        // Method dump skipped, instructions count: 1136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void a(int i2, boolean z2) {
        b(i2, z2);
    }

    public RecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10474);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(c(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(c(i3), 1073741824));
        MethodCollector.o(10474);
    }

    private int d(int i2, long j2) {
        int i3;
        int i4;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 == 2) {
            i3 = this.G;
            i4 = (int) ((((long) (this.F - i3)) * (uptimeMillis - j2)) / 300);
        } else if (i2 == 3) {
            i3 = this.G;
            i4 = this.F - i3;
        } else if (i2 == 4) {
            i3 = this.G;
            i4 = (int) (((float) (this.F - i3)) * (1.0f - ((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f)));
        } else if (i2 == 1) {
            return this.G;
        } else {
            return 0;
        }
        return i3 + i4;
    }

    private int a(int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 == 2) {
            int i3 = this.H;
            return (int) ((((float) i3) * 0.1f) + (((float) i3) * 0.7f * (1.0f - ((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f))));
        } else if (i2 == 3) {
            return (int) (((float) this.H) * 0.1f);
        } else {
            if (i2 == 4) {
                int i4 = this.H;
                return (int) ((((float) i4) * 0.1f) + (((((float) i4) * 0.7f) * ((float) (uptimeMillis - j2))) / 300.0f));
            } else if (i2 == 1) {
                return (int) (((float) this.H) * 0.8f);
            } else {
                return 0;
            }
        }
    }

    private int b(int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 == 2) {
            int i3 = this.H;
            return (int) ((((float) i3) * 0.4f) + (((float) i3) * 0.4f * (1.0f - ((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f))));
        } else if (i2 == 3) {
            return (int) (((float) this.H) * 0.4f);
        } else {
            if (i2 == 4) {
                int i4 = this.H;
                return (int) ((((float) i4) * 0.4f) + (((((float) i4) * 0.4f) * ((float) (uptimeMillis - j2))) / 300.0f));
            } else if (i2 == 1) {
                return (int) (((float) this.H) * 0.8f);
            } else {
                return 0;
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.R || this.w == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            this.w.a(motionEvent, this.O);
        } else if (action == 5) {
            this.w.d(motionEvent, this.O);
            this.w.b(motionEvent, this.O);
        } else if (action == 6) {
            this.w.e(motionEvent, this.O);
            this.w.c(motionEvent, this.O);
        }
        return false;
    }

    private void a(Canvas canvas, boolean z2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float a2 = (float) a(this.f132841l);
        int i2 = this.G;
        float f2 = (float) i2;
        float f3 = (((float) i2) * 0.8f) + ((1.0f - ((((float) (uptimeMillis - this.f132841l)) * 1.0f) / 300.0f)) * ((float) i2) * 0.2f);
        this.f132838i.setStrokeWidth(f2 - a2);
        this.f132838i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (f2 + a2) / 2.0f, this.f132838i);
        this.f132837h.setStrokeWidth(f3);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), f3 / 2.0f, this.f132837h);
        if (uptimeMillis - this.f132841l > 300) {
            b(1);
            if (z2) {
                this.f132834e = 3;
            } else {
                this.f132834e = 1;
            }
        }
        invalidate();
    }

    private void b(int i2, boolean z2) {
        this.r = this.s;
        int i3 = this.f132834e;
        this.f132834e = i2;
        this.s = z2;
        this.t = true;
        if (!this.o) {
            invalidate();
            super.setOnClickListener(this.W);
            this.o = !this.o;
        } else if (i2 != i3) {
            if (i2 == 1) {
                a();
                super.setOnClickListener(this.W);
                b(6);
            } else if (i2 == 3) {
                e();
                super.setOnClickListener(this.W);
                b(7);
            }
            invalidate();
        }
    }

    private int c(int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 == 2) {
            return (int) ((((long) this.H) * (uptimeMillis - j2)) / 300);
        }
        if (i2 == 3) {
            double d2 = (double) (uptimeMillis - j2);
            Double.isNaN(d2);
            double sin = Math.sin((d2 * 3.141592653589793d) / 700.0d) + 1.0d;
            if (this.V) {
                int i3 = this.f132836g;
                if (i3 != 2) {
                    if (i3 != 1) {
                        double d3 = (double) this.H;
                        double d4 = (double) (this.F - this.G);
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        return (int) (d3 + (sin * d4 * 0.30000001192092896d));
                    }
                } else if (this.I == 0) {
                    double d5 = (double) this.H;
                    double d6 = (double) (this.F - this.G);
                    Double.isNaN(d6);
                    Double.isNaN(d5);
                    this.I = (int) (d5 + (sin * d6 * 0.30000001192092896d));
                }
                return this.I;
            }
            double d7 = (double) this.H;
            double d8 = (double) (this.F - this.G);
            Double.isNaN(d8);
            Double.isNaN(d7);
            return (int) (d7 + (sin * d8 * 0.30000001192092896d));
        } else if (i2 == 4) {
            return (int) (((float) this.H) * (1.0f - ((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f)));
        } else {
            return 0;
        }
    }

    private static int a(int i2, int i3, float f2) {
        double d2 = (double) (i3 - i2);
        double a2 = a((double) f2);
        Double.isNaN(d2);
        return i2 + ((int) (d2 * a2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RecordLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        boolean z2;
        float f2;
        boolean z3 = false;
        MethodCollector.i(10329);
        this.f132830a = true;
        this.f132834e = 3;
        this.K = -1;
        this.L = (int) n.b(getContext(), 100.0f);
        this.f132842m = new RectF();
        this.M = 0;
        this.o = false;
        this.p = false;
        this.O = new int[]{0, 0};
        this.R = true;
        this.t = true;
        this.S = new ArgbEvaluator();
        if (d.a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.U = z2;
        z3 = p.a() != 0 ? true : z3;
        this.V = z3;
        this.x = new e();
        this.W = new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86908);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (RecordLayout.this.f132833d == 1) {
                    if (!new de().a(view) || RecordLayout.this.x.b()) {
                        return;
                    }
                    if (RecordLayout.this.s) {
                        RecordLayout.this.b(13);
                        RecordLayout.this.invalidate();
                        RecordLayout.this.x.e();
                        return;
                    }
                    RecordLayout.this.b(2);
                    RecordLayout.this.invalidate();
                    RecordLayout.this.x.c();
                } else if ((RecordLayout.this.f132833d == 3 || RecordLayout.this.f132833d == 2) && RecordLayout.this.t) {
                    RecordLayout.this.b(4);
                    RecordLayout.this.x.d();
                }
            }
        };
        if (z3) {
            f2 = 50.0f;
        } else {
            f2 = 55.0f;
        }
        this.F = (int) n.b(context, f2);
        this.G = (int) n.b(context, 40.0f);
        this.H = (int) n.b(context, 40.0f);
        if (context instanceof e) {
            this.P = new l((e) context);
        }
        this.f132833d = 1;
        Paint paint = new Paint();
        this.f132837h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f132837h.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f132838i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f132838i.setAntiAlias(true);
        this.D = androidx.core.content.b.c(getContext(), R.color.bh);
        this.E = androidx.core.content.b.c(getContext(), R.color.ob);
        this.B = androidx.core.content.b.c(getContext(), R.color.a2r);
        this.C = androidx.core.content.b.c(getContext(), R.color.a2r);
        e();
        setOnTouchListener(this);
        MethodCollector.o(10329);
    }
}
