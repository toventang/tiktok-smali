package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class AdjustPercentBar extends View {
    static Drawable M;
    static Drawable N;
    int A;
    String B;
    float C;
    boolean D;
    boolean E;
    Context F;
    boolean G;
    Rect H;
    public String I;
    public int J;
    Boolean K;
    boolean L;
    boolean O;
    ValueAnimator P;
    boolean Q;
    public int R;
    public String S;
    public ValueAnimator T;
    public float U;
    public Handler V;
    public Runnable W;

    /* renamed from: a  reason: collision with root package name */
    int f22425a;
    private b aa;
    private int ab;
    private float ac;
    private float ad;
    private float ae;
    private float af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private Runnable ak;
    private int al;
    private boolean am;

    /* renamed from: b  reason: collision with root package name */
    int f22426b;

    /* renamed from: c  reason: collision with root package name */
    int f22427c;

    /* renamed from: d  reason: collision with root package name */
    int f22428d;

    /* renamed from: e  reason: collision with root package name */
    int f22429e;

    /* renamed from: f  reason: collision with root package name */
    int f22430f;

    /* renamed from: g  reason: collision with root package name */
    int f22431g;

    /* renamed from: h  reason: collision with root package name */
    int f22432h;

    /* renamed from: i  reason: collision with root package name */
    int f22433i;

    /* renamed from: j  reason: collision with root package name */
    int f22434j;

    /* renamed from: k  reason: collision with root package name */
    int f22435k;

    /* renamed from: l  reason: collision with root package name */
    int f22436l;

    /* renamed from: m  reason: collision with root package name */
    int f22437m;
    int n;
    int o;
    int p;
    float q;
    int r;
    int s;
    Paint t;
    Paint u;
    Paint v;
    Paint w;
    Paint x;
    Paint y;
    int z;

    public interface b {
        static {
            Covode.recordClassIndex(13254);
        }

        void a(int i2);

        void b(int i2);
    }

    public static class c implements b {
        static {
            Covode.recordClassIndex(13255);
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
        public void a(int i2) {
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
        public final void b(int i2) {
        }
    }

    static {
        Covode.recordClassIndex(13246);
    }

    public int getPercent() {
        return this.z;
    }

    private boolean b() {
        if (this.aj != 0) {
            return true;
        }
        int i2 = this.J;
        if (i2 == 0 || i2 == 100) {
            return false;
        }
        return true;
    }

    public void buildDrawingCache() {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    private void c() {
        float f2;
        removeCallbacks(this.ak);
        if (!this.Q && !TextUtils.isEmpty(this.B)) {
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.P.cancel();
            }
            Paint paint = this.y;
            if (this.O) {
                f2 = 0.0f;
            } else {
                f2 = 3.0f;
            }
            paint.setShadowLayer((float) y.a(f2), 0.0f, 0.0f, this.f22436l);
            setTextAlpha(255);
            this.Q = true;
            invalidate();
        }
    }

    class a implements Runnable {
        static {
            Covode.recordClassIndex(13251);
        }

        public final void run() {
            if (AdjustPercentBar.this.Q) {
                if (AdjustPercentBar.this.P != null) {
                    AdjustPercentBar.this.P.removeAllListeners();
                    AdjustPercentBar.this.P.cancel();
                }
                AdjustPercentBar.this.y.setShadowLayer(0.0f, 0.0f, 0.0f, AdjustPercentBar.this.f22436l);
                AdjustPercentBar.this.P = ValueAnimator.ofFloat(1.0f);
                AdjustPercentBar.this.P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(13252);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AdjustPercentBar.this.setTextAlpha((int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0f));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                AdjustPercentBar.this.P.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(13253);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
                AdjustPercentBar.this.P.setDuration(300L);
                AdjustPercentBar.this.P.start();
                AdjustPercentBar.this.Q = false;
            }
        }

        private a() {
        }

        /* synthetic */ a(AdjustPercentBar adjustPercentBar, byte b2) {
            this();
        }
    }

    private void a() {
        this.o = this.f22425a / 2;
        this.p = y.a(32.0f);
        this.q = (((float) this.f22425a) - (this.af * 2.0f)) / ((float) this.ah);
        this.G = true;
        invalidate();
    }

    public void setIsTwoWayMode(boolean z2) {
        this.am = z2;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.I = str;
    }

    public void setTextInCenter(boolean z2) {
        this.L = z2;
    }

    public void setOnLevelChangeListener(final b bVar) {
        this.aa = new b() {
            /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.AnonymousClass4 */

            static {
                Covode.recordClassIndex(13250);
            }

            @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
            public final void b(int i2) {
                bVar.b(i2);
            }

            @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
            public final void a(int i2) {
                AdjustPercentBar.this.V.removeCallbacks(AdjustPercentBar.this.W);
                if (AdjustPercentBar.this.S != null && i2 == AdjustPercentBar.this.J) {
                    AdjustPercentBar.this.V.postDelayed(AdjustPercentBar.this.W, 100);
                } else if (AdjustPercentBar.this.T != null) {
                    AdjustPercentBar.this.T.cancel();
                    AdjustPercentBar.this.T = null;
                }
                bVar.a(i2);
            }
        };
    }

    public void setPercent(int i2) {
        this.z = i2;
        invalidate();
    }

    private int c(int i2) {
        if (y.g()) {
            return this.ai - i2;
        }
        return i2;
    }

    public void setTextAlpha(int i2) {
        this.al = i2;
        this.y.setAlpha(i2);
        this.x.setAlpha(i2);
    }

    private int b(int i2) {
        int i3;
        int i4 = this.ag;
        if (((float) (i2 % i4)) >= ((float) i4) / 2.0f) {
            i3 = (i2 / i4) + 1;
        } else {
            i3 = i2 / i4;
        }
        return i3 * i4;
    }

    private int a(int i2) {
        int i3;
        if (this.ag > 1) {
            i2 = b(i2);
        }
        if (i2 > this.ah) {
            i3 = this.ai;
        } else if (i2 <= 0) {
            i3 = this.aj;
        } else {
            i3 = i2 + this.aj;
        }
        if (!b()) {
            return i3;
        }
        int i4 = this.J;
        return (i3 < i4 + -2 || i3 > i4 + 2) ? i3 : i4;
    }

    public void buildDrawingCache(boolean z2) {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z2);
        }
    }

    private void a(boolean z2) {
        this.t.setColor(this.f22432h);
        if (z2) {
            this.t.setShadowLayer((float) y.a(1.0f), 0.0f, 0.0f, this.f22436l);
        }
        this.u.setColor(this.f22433i);
        if (z2) {
            this.u.setShadowLayer((float) y.a(1.0f), 0.0f, 0.0f, this.f22436l);
        }
        this.v.setColor(this.r);
        if (z2) {
            this.v.setShadowLayer((float) y.a(3.0f), 0.0f, 0.0f, this.f22436l);
        }
        this.w.setColor(this.n);
        this.x.setColor(this.s);
        this.y.setColor(this.f22432h);
        setTextAlpha(this.al);
        this.O = false;
        if (!this.O && M == null) {
            M = getResources().getDrawable(R.drawable.btc);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        String str;
        Paint paint;
        int i2;
        Drawable drawable;
        MethodCollector.i(10322);
        super.onDraw(canvas);
        if (!this.G) {
            MethodCollector.o(10322);
            return;
        }
        if (y.g()) {
            f2 = this.af;
            f3 = (float) (this.ai - this.z);
            f4 = this.q;
        } else {
            f2 = this.af;
            f3 = (float) (this.z - this.aj);
            f4 = this.q;
        }
        float f8 = f2 + (f3 * f4);
        if (y.g()) {
            f5 = this.af;
            f6 = (float) (this.ai - this.J);
            f7 = this.q;
        } else {
            f5 = this.af;
            f6 = (float) (this.J - this.aj);
            f7 = this.q;
        }
        float f9 = f5 + (f6 * f7);
        float f10 = this.af;
        int i3 = this.p;
        canvas.drawLine(f10, (float) i3, ((float) this.f22425a) - f10, (float) i3, this.u);
        if (!this.K.booleanValue()) {
            y.g();
            int i4 = this.p;
            canvas.drawLine(f8, (float) i4, f9, (float) i4, this.t);
        } else if (y.g()) {
            int i5 = this.p;
            canvas.drawLine(f8, (float) i5, ((float) this.f22425a) - this.af, (float) i5, this.t);
        } else {
            float f11 = this.af;
            int i6 = this.p;
            canvas.drawLine(f11, (float) i6, f8, (float) i6, this.t);
        }
        int i7 = 255;
        this.v.setAlpha(255);
        this.w.setAlpha(255);
        this.y.setAlpha(255);
        this.x.setAlpha(255);
        canvas.drawCircle(f8, (float) this.p, this.ad, this.v);
        int i8 = this.J;
        if (i8 >= this.aj && i8 <= this.ai && b()) {
            canvas.drawCircle(f9, (float) this.p, (float) this.f22429e, this.w);
        }
        int i9 = this.R;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.z;
        }
        if (this.U == 0.0f) {
            str = String.valueOf(i9);
        } else {
            str = this.S;
            if (str == null) {
                str = "";
            }
        }
        if (TextUtils.isEmpty(this.I) || TextUtils.isEmpty(str)) {
            this.B = str;
        } else {
            this.B = this.I + " " + str;
        }
        if (TextUtils.isEmpty(this.B)) {
            MethodCollector.o(10322);
            return;
        }
        if (this.L) {
            paint = this.y;
        } else {
            paint = this.x;
        }
        Paint paint2 = this.x;
        String str2 = this.B;
        paint2.getTextBounds(str2, 0, str2.length(), this.H);
        int width = this.H.width();
        int a2 = y.a(14.0f);
        if (this.L) {
            i2 = this.o;
        } else {
            i2 = (int) f8;
        }
        int a3 = (i2 - (width / 2)) - y.a(1.0f);
        int i10 = this.p - a2;
        if (this.O) {
            drawable = N;
        } else {
            drawable = M;
        }
        if (!this.L && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int max = Math.max(width, intrinsicWidth);
            float f12 = this.U;
            if (f12 == 1.0f) {
                i7 = this.al;
                max += intrinsicWidth;
            } else if (f12 > 0.0f) {
                float f13 = (float) intrinsicWidth;
                max = (int) (((float) ((int) ((((float) (max - intrinsicWidth)) * f12) + f13))) + (f13 * f12));
            } else {
                i7 = this.al;
            }
            drawable.setAlpha(i7);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(((float) i2) - (((float) max) / 2.0f), (float) (this.p - y.a(57.0f)));
            drawable.draw(canvas);
            canvas.restore();
        }
        float f14 = this.U;
        if (f14 <= 0.0f || f14 >= 1.0f) {
            canvas.drawText(this.B, (float) a3, (float) i10, paint);
            MethodCollector.o(10322);
            return;
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (this.U * 255.0f));
        canvas.drawText(this.B, (float) a3, (float) i10, paint);
        paint.setAlpha(alpha);
        MethodCollector.o(10322);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        b bVar;
        if (!this.E) {
            return true;
        }
        boolean z2 = false;
        if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.af - ((float) this.f22430f) || motionEvent.getX() > ((float) y.c()) - (this.af - ((float) this.f22430f)))) {
            return false;
        }
        if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - ((float) this.p)) > ((float) (this.f22426b - this.p))) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            c();
            this.A = this.z;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            double abs = (double) Math.abs(x2 - (this.af + (((float) (this.z - this.aj)) * this.q)));
            double d2 = (double) this.f22428d;
            Double.isNaN(d2);
            if (abs <= d2 * 2.5d) {
                double abs2 = (double) Math.abs(y2 - ((float) this.p));
                double d3 = (double) this.f22428d;
                Double.isNaN(d3);
                if (abs2 <= d3 * 2.5d) {
                    z2 = true;
                }
            }
            this.D = !z2;
            float x3 = motionEvent.getX();
            this.C = x3;
            int c2 = c(a((int) ((x3 - this.af) / this.q)));
            if (this.z != c2) {
                this.z = c2;
                this.A = c2;
                b bVar2 = this.aa;
                if (bVar2 != null) {
                    bVar2.a(c2);
                }
                invalidate();
            }
        } else if (action == 1) {
            float x4 = motionEvent.getX();
            if (!this.D || Math.abs(x4 - this.C) > ((float) y.a(3.0f))) {
                b bVar3 = this.aa;
                if (bVar3 != null) {
                    bVar3.b(this.z);
                }
            } else {
                final int c3 = c(a((int) ((x4 - this.af) / this.q)));
                b bVar4 = this.aa;
                if (bVar4 != null) {
                    this.z = c3;
                    bVar4.a(c3);
                    this.aa.b(c3);
                }
                final int i4 = this.z;
                this.E = false;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setTarget(this);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(13248);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        AdjustPercentBar adjustPercentBar = AdjustPercentBar.this;
                        int i2 = i4;
                        adjustPercentBar.z = (int) (((float) i2) + (((float) (c3 - i2)) * floatValue));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(13249);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        AdjustPercentBar.this.E = true;
                        super.onAnimationEnd(animator);
                    }
                });
                ofFloat.setDuration(50L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
            }
        } else if (action == 2) {
            c();
            float x5 = motionEvent.getX();
            if (y.g()) {
                i2 = this.ai;
                i3 = this.A;
            } else {
                i2 = this.A;
                i3 = this.aj;
            }
            int c4 = c(a((i2 - i3) + ((int) ((x5 - this.C) / this.q))));
            b bVar5 = this.aa;
            if (!(bVar5 == null || this.z == c4)) {
                this.z = c4;
                bVar5.a(c4);
            }
            invalidate();
        } else if (action == 3 && (bVar = this.aa) != null) {
            bVar.b(this.z);
        }
        return true;
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a(int i2, int i3, int i4) {
        this.f22432h = i2;
        this.f22433i = i3;
        this.r = i4;
        a(false);
    }

    private AdjustPercentBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10148);
        this.f22427c = y.a(4.0f);
        this.f22428d = y.a(9.0f);
        this.f22429e = y.a(4.0f);
        this.f22430f = y.a(10.0f);
        this.f22431g = 1;
        this.E = true;
        this.G = false;
        this.H = new Rect();
        this.I = null;
        this.ab = 0;
        this.ac = 0.0f;
        this.ad = 0.0f;
        this.ae = 0.0f;
        this.af = (float) y.a(40.0f);
        this.K = true;
        this.L = false;
        this.Q = true;
        this.R = Integer.MIN_VALUE;
        this.ak = new a(this, (byte) 0);
        this.al = 0;
        this.U = 0.1f;
        this.V = new Handler(Looper.getMainLooper());
        this.W = new Runnable() {
            /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13247);
            }

            public final void run() {
            }
        };
        this.F = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an3, R.attr.an7, R.attr.ann, R.attr.ano, R.attr.ao4, R.attr.ao5, R.attr.ao6});
            String string = obtainStyledAttributes.getString(4);
            this.I = string == null ? "" : string;
            this.ab = obtainStyledAttributes.getColor(5, -16777216);
            this.ac = obtainStyledAttributes.getDimension(6, (float) y.a(14.0f));
            this.af = obtainStyledAttributes.getDimension(0, (float) y.a(40.0f));
            this.ad = obtainStyledAttributes.getDimension(2, (float) this.f22428d);
            this.ae = obtainStyledAttributes.getDimension(1, (float) this.f22427c);
            this.ag = obtainStyledAttributes.getInt(3, this.f22431g);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f22432h = y.b((int) R.color.a24);
            this.f22433i = 1040187391;
            this.f22434j = y.b((int) R.color.ve);
            this.f22435k = y.b((int) R.color.yb);
            this.f22436l = 1073741824;
            this.f22437m = y.b((int) R.color.c9);
            this.r = y.a("#ff4e33", y.b((int) R.color.a24));
            this.s = y.b((int) R.color.a24);
            this.n = y.b((int) R.color.a24);
            Paint paint = new Paint();
            this.t = paint;
            paint.setStyle(Paint.Style.FILL);
            this.t.setStrokeWidth(this.ae);
            this.t.setStrokeCap(Paint.Cap.ROUND);
            this.t.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.u = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.u.setStrokeWidth(this.ae);
            this.u.setStrokeCap(Paint.Cap.ROUND);
            this.u.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.v = paint3;
            paint3.setStyle(Paint.Style.FILL);
            this.v.setAntiAlias(true);
            Paint paint4 = new Paint();
            this.w = paint4;
            paint4.setStyle(Paint.Style.FILL);
            this.w.setAntiAlias(true);
            Paint paint5 = new Paint();
            this.x = paint5;
            paint5.setTextSize(this.ac);
            this.x.setAntiAlias(true);
            Paint paint6 = new Paint();
            this.y = paint6;
            paint6.setTextSize(this.ac);
            this.y.setAntiAlias(true);
            a(true);
        }
        MethodCollector.o(10148);
    }

    public final void a(int i2, int i3, int i4, boolean z2) {
        b(i2, i3, i4, z2);
    }

    private void b(int i2, int i3, int i4, boolean z2) {
        this.ai = i2;
        this.aj = i3;
        if (i4 > i2 || i4 < i3) {
            this.J = i2;
        } else {
            this.J = i4;
        }
        this.ah = i2 - i3;
        this.K = Boolean.valueOf(z2);
        if (this.f22425a > 0 && this.f22426b > 0) {
            a();
        }
        invalidate();
        this.S = null;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        this.U = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f22426b != getMeasuredHeight() || this.f22425a != getMeasuredWidth()) {
            this.f22425a = getMeasuredWidth();
            this.f22426b = getMeasuredHeight();
            a();
        }
    }
}
