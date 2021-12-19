package com.lynx.b.a.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a.f;
import com.lynx.b.a.a.i;
import com.lynx.b.a.b.c;
import com.lynx.b.a.h.b;
import com.zhiliaoapp.musically.R;

public final class a extends com.lynx.b.a.f.a implements f {

    /* renamed from: a  reason: collision with root package name */
    protected int f55162a;

    /* renamed from: b  reason: collision with root package name */
    protected int f55163b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f55164c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f55165d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f55166e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f55167f;

    /* renamed from: g  reason: collision with root package name */
    protected Path f55168g;

    /* renamed from: h  reason: collision with root package name */
    protected Paint f55169h;

    /* renamed from: i  reason: collision with root package name */
    protected int f55170i;

    /* renamed from: j  reason: collision with root package name */
    protected int f55171j;

    /* renamed from: k  reason: collision with root package name */
    protected int f55172k;

    /* renamed from: l  reason: collision with root package name */
    protected int f55173l;

    /* renamed from: m  reason: collision with root package name */
    protected float f55174m;
    protected float n;
    protected float o;
    protected float p;
    protected int q;
    protected float r;
    protected float s;
    protected float t;
    protected Animator u;
    protected RectF v;

    static {
        Covode.recordClassIndex(34597);
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final boolean a() {
        return this.f55167f;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.u;
        if (animator != null) {
            animator.removeAllListeners();
            this.u.end();
            this.u = null;
        }
    }

    /* renamed from: com.lynx.b.a.d.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55175a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 34598(0x8726, float:4.8482E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.b.a.b.b[] r0 = com.lynx.b.a.b.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.b.a.d.a.AnonymousClass1.f55175a = r2
                com.lynx.b.a.b.b r0 = com.lynx.b.a.b.b.None     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.b.a.d.a.AnonymousClass1.f55175a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.b.a.b.b r0 = com.lynx.b.a.b.b.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.d.a.AnonymousClass1.<clinit>():void");
        }
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    private a a(int i2) {
        this.f55163b = i2;
        this.f55164c = true;
        return this;
    }

    private a b(int i2) {
        this.f55162a = i2;
        this.f55165d = true;
        return this;
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void setPrimaryColors(int... iArr) {
        if (iArr.length > 0 && !this.f55164c) {
            a(iArr[0]);
            this.f55164c = false;
        }
        if (iArr.length > 1 && !this.f55165d) {
            b(iArr[1]);
            this.f55165d = false;
        }
    }

    /* renamed from: com.lynx.b.a.d.a$a  reason: collision with other inner class name */
    protected class C1253a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        byte f55176a;

        static {
            Covode.recordClassIndex(34599);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            byte b2 = this.f55176a;
            if (b2 == 0) {
                a.this.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b2) {
                if (a.this.f55166e) {
                    valueAnimator.cancel();
                    return;
                } else {
                    a.this.f55171j = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
                }
            } else if (2 == b2) {
                a.this.f55174m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b2) {
                a.this.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b2) {
                a.this.q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            a.this.invalidate();
        }

        C1253a(byte b2) {
            this.f55176a = b2;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        float f4;
        int width = getWidth();
        if (isInEditMode()) {
            i2 = getHeight();
        } else {
            i2 = this.f55173l;
        }
        this.f55168g.reset();
        this.f55168g.lineTo(0.0f, (float) this.f55170i);
        Path path = this.f55168g;
        int i3 = this.f55172k;
        float f5 = 2.0f;
        if (i3 >= 0) {
            f2 = (float) i3;
        } else {
            f2 = ((float) width) / 2.0f;
        }
        int i4 = this.f55170i;
        float f6 = (float) width;
        path.quadTo(f2, (float) (this.f55171j + i4), f6, (float) i4);
        this.f55168g.lineTo(f6, 0.0f);
        this.f55169h.setColor(this.f55163b);
        canvas.drawPath(this.f55168g, this.f55169h);
        if (this.f55174m > 0.0f) {
            this.f55169h.setColor(this.f55162a);
            float f7 = (float) i2;
            float f8 = f7 / b.f55193c;
            float f9 = 7.0f;
            float f10 = (f6 * 1.0f) / 7.0f;
            float f11 = this.n;
            float f12 = f10 * f11;
            if (f11 > 1.0f) {
                f3 = ((f11 - 1.0f) * f10) / f11;
            } else {
                f3 = 0.0f;
            }
            float f13 = f12 - f3;
            if (f11 > 1.0f) {
                f4 = (((f11 - 1.0f) * f7) / 2.0f) / f11;
            } else {
                f4 = 0.0f;
            }
            float f14 = f7 - f4;
            int i5 = 0;
            do {
                float f15 = (((float) i5) + 1.0f) - 4.0f;
                Paint paint = this.f55169h;
                double abs = (double) (this.f55174m * (1.0f - ((Math.abs(f15) / f9) * f5)) * 255.0f);
                double d2 = (double) f8;
                Double.isNaN(d2);
                Double.isNaN(abs);
                paint.setAlpha((int) (abs * (1.0d - (1.0d / Math.pow((d2 / 800.0d) + 1.0d, 15.0d)))));
                float f16 = this.o * (1.0f - (1.0f / ((f8 / 10.0f) + 1.0f)));
                canvas.drawCircle(((f6 / 2.0f) - (f16 / 2.0f)) + (f13 * f15), f14 / 2.0f, f16, this.f55169h);
                i5++;
                f9 = 7.0f;
                f5 = 2.0f;
            } while (i5 < 7);
            this.f55169h.setAlpha(255);
        }
        if (this.u != null || isInEditMode()) {
            float f17 = this.r;
            float f18 = this.t;
            float f19 = f17 * f18;
            float f20 = this.s * f18;
            this.f55169h.setColor(this.f55162a);
            this.f55169h.setStyle(Paint.Style.FILL);
            float f21 = f6 / 2.0f;
            float f22 = ((float) i2) / 2.0f;
            canvas.drawCircle(f21, f22, f19, this.f55169h);
            this.f55169h.setStyle(Paint.Style.STROKE);
            float f23 = f19 + f20;
            canvas.drawCircle(f21, f22, f23, this.f55169h);
            this.f55169h.setColor((this.f55163b & 16777215) | 1426063360);
            this.f55169h.setStyle(Paint.Style.FILL);
            this.v.set(f21 - f19, f22 - f19, f21 + f19, f19 + f22);
            canvas.drawArc(this.v, 270.0f, (float) this.q, true, this.f55169h);
            this.f55169h.setStyle(Paint.Style.STROKE);
            this.v.set(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
            canvas.drawArc(this.v, 270.0f, (float) this.q, false, this.f55169h);
            this.f55169h.setStyle(Paint.Style.FILL);
        }
        if (this.p > 0.0f) {
            this.f55169h.setColor(this.f55162a);
            canvas.drawCircle(f6 / 2.0f, ((float) i2) / 2.0f, this.p, this.f55169h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final int a(i iVar, boolean z) {
        Animator animator = this.u;
        if (animator != null) {
            animator.removeAllListeners();
            this.u.end();
            this.u = null;
        }
        int width = getWidth();
        int i2 = this.f55173l;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, (float) Math.sqrt((double) ((width * width) + (i2 * i2))));
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new C1253a((byte) 3));
        ofFloat.start();
        return 400;
    }

    private a(Context context, byte b2) {
        super(context);
        this.f55172k = -1;
        this.v = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.x = c.f55146c;
        this.f55168g = new Path();
        Paint paint = new Paint();
        this.f55169h = paint;
        paint.setAntiAlias(true);
        this.o = (float) b.a(7.0f);
        this.r = (float) b.a(20.0f);
        this.s = (float) b.a(7.0f);
        this.f55169h.setStrokeWidth((float) b.a(3.0f));
        setMinimumHeight(b.a(100.0f));
        if (isInEditMode()) {
            this.f55170i = 1000;
            this.t = 1.0f;
            this.q = 270;
        } else {
            this.t = 0.0f;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ad6, R.attr.ado, R.attr.aei});
        this.f55167f = obtainStyledAttributes.getBoolean(1, this.f55167f);
        b(obtainStyledAttributes.getColor(0, -1));
        a(obtainStyledAttributes.getColor(2, -14540254));
        this.f55165d = obtainStyledAttributes.hasValue(0);
        this.f55164c = obtainStyledAttributes.hasValue(2);
        obtainStyledAttributes.recycle();
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void a(float f2, int i2, int i3) {
        this.f55172k = i2;
        invalidate();
    }

    @Override // com.lynx.b.a.f.a, com.lynx.b.a.g.f
    public final void a(i iVar, com.lynx.b.a.b.b bVar, com.lynx.b.a.b.b bVar2) {
        int i2 = AnonymousClass1.f55175a[bVar2.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.f55174m = 1.0f;
            this.t = 0.0f;
            this.p = 0.0f;
        }
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void a(i iVar, int i2, int i3) {
        this.f55170i = i2 - 1;
        this.f55166e = false;
        b bVar = new b(b.f55192b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(bVar);
        ofFloat.addUpdateListener(new C1253a((byte) 2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(bVar);
        ofFloat2.addUpdateListener(new C1253a((byte) 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.setDuration(720L);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C1253a((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofInt);
        animatorSet.start();
        int i4 = this.f55171j;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i4, 0, -((int) (((float) i4) * 0.8f)), 0, -((int) (((float) i4) * 0.4f)), 0);
        ofInt2.addUpdateListener(new C1253a((byte) 1));
        ofInt2.setInterpolator(new b(b.f55192b));
        ofInt2.setDuration(800L);
        ofInt2.start();
        this.u = animatorSet;
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void a(boolean z, float f2, int i2, int i3, int i4) {
        this.f55173l = i2;
        if (z || this.f55166e) {
            this.f55166e = true;
            this.f55170i = Math.min(i3, i2);
            this.f55171j = (int) (((float) Math.max(0, i2 - i3)) * 1.9f);
            this.n = f2;
            invalidate();
        }
    }
}
