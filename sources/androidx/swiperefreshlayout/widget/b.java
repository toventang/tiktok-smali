package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;

public class b extends Drawable implements Animatable {

    /* renamed from: e  reason: collision with root package name */
    private static final Interpolator f4391e = new LinearInterpolator();

    /* renamed from: f  reason: collision with root package name */
    private static final Interpolator f4392f = new androidx.g.a.a.b();

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f4393g = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    final a f4394a;

    /* renamed from: b  reason: collision with root package name */
    public float f4395b;

    /* renamed from: c  reason: collision with root package name */
    float f4396c;

    /* renamed from: d  reason: collision with root package name */
    boolean f4397d;

    /* renamed from: h  reason: collision with root package name */
    private Resources f4398h;

    /* renamed from: i  reason: collision with root package name */
    private Animator f4399i;

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final RectF f4404a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f4405b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f4406c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f4407d;

        /* renamed from: e  reason: collision with root package name */
        public float f4408e;

        /* renamed from: f  reason: collision with root package name */
        public float f4409f;

        /* renamed from: g  reason: collision with root package name */
        public float f4410g;

        /* renamed from: h  reason: collision with root package name */
        public float f4411h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f4412i;

        /* renamed from: j  reason: collision with root package name */
        int f4413j;

        /* renamed from: k  reason: collision with root package name */
        public float f4414k;

        /* renamed from: l  reason: collision with root package name */
        public float f4415l;

        /* renamed from: m  reason: collision with root package name */
        public float f4416m;
        public boolean n;
        Path o;
        public float p;
        public float q;
        int r;
        int s;
        public int t;
        public int u;

        static {
            Covode.recordClassIndex(1707);
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            return this.f4412i[this.f4413j];
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return (this.f4413j + 1) % this.f4412i.length;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f4414k = this.f4408e;
            this.f4415l = this.f4409f;
            this.f4416m = this.f4410g;
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.f4414k = 0.0f;
            this.f4415l = 0.0f;
            this.f4416m = 0.0f;
            this.f4408e = 0.0f;
            this.f4409f = 0.0f;
            this.f4410g = 0.0f;
        }

        a() {
            Paint paint = new Paint();
            this.f4405b = paint;
            Paint paint2 = new Paint();
            this.f4406c = paint2;
            Paint paint3 = new Paint();
            this.f4407d = paint3;
            this.f4408e = 0.0f;
            this.f4409f = 0.0f;
            this.f4410g = 0.0f;
            this.f4411h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2) {
            this.f4411h = f2;
            this.f4405b.setStrokeWidth(f2);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            this.f4413j = i2;
            this.u = this.f4412i[i2];
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int[] iArr) {
            this.f4412i = iArr;
            a(0);
        }
    }

    public int getAlpha() {
        return this.f4394a.t;
    }

    public boolean isRunning() {
        return this.f4399i.isRunning();
    }

    static {
        Covode.recordClassIndex(1704);
    }

    public void stop() {
        this.f4399i.cancel();
        this.f4395b = 0.0f;
        this.f4394a.a(false);
        this.f4394a.a(0);
        this.f4394a.d();
        invalidateSelf();
    }

    public void start() {
        this.f4399i.cancel();
        this.f4394a.c();
        if (this.f4394a.f4409f != this.f4394a.f4408e) {
            this.f4397d = true;
            this.f4399i.setDuration(666);
            this.f4399i.start();
            return;
        }
        this.f4394a.a(0);
        this.f4394a.d();
        this.f4399i.setDuration(1332);
        this.f4399i.start();
    }

    public void setAlpha(int i2) {
        this.f4394a.t = i2;
        invalidateSelf();
    }

    public final void a(float f2) {
        a aVar = this.f4394a;
        if (f2 != aVar.p) {
            aVar.p = f2;
        }
        invalidateSelf();
    }

    public final void b(float f2) {
        this.f4394a.f4408e = 0.0f;
        this.f4394a.f4409f = f2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4394a.f4405b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void a(int i2) {
        if (i2 == 0) {
            a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public b(Context context) {
        this.f4398h = ((Context) g.a(context)).getResources();
        final a aVar = new a();
        this.f4394a = aVar;
        aVar.a(f4393g);
        aVar.a(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class androidx.swiperefreshlayout.widget.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1705);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b.a(floatValue, aVar);
                b.this.a(floatValue, aVar, false);
                b.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4391e);
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class androidx.swiperefreshlayout.widget.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1706);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                b.this.f4396c = 0.0f;
            }

            public final void onAnimationRepeat(Animator animator) {
                b.this.a(1.0f, aVar, true);
                aVar.c();
                a aVar = aVar;
                aVar.a(aVar.a());
                if (b.this.f4397d) {
                    b.this.f4397d = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.a(false);
                    return;
                }
                b.this.f4396c += 1.0f;
            }
        });
        this.f4399i = ofFloat;
    }

    public final void a(boolean z) {
        this.f4394a.a(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4395b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f4394a;
        RectF rectF = aVar.f4404a;
        float f2 = aVar.q + (aVar.f4411h / 2.0f);
        if (aVar.q <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.r) * aVar.p) / 2.0f, aVar.f4411h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = (aVar.f4408e + aVar.f4410g) * 360.0f;
        float f4 = ((aVar.f4409f + aVar.f4410g) * 360.0f) - f3;
        aVar.f4405b.setColor(aVar.u);
        aVar.f4405b.setAlpha(aVar.t);
        float f5 = aVar.f4411h / 2.0f;
        rectF.inset(f5, f5);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f4407d);
        float f6 = -f5;
        rectF.inset(f6, f6);
        canvas.drawArc(rectF, f3, f4, false, aVar.f4405b);
        if (aVar.n) {
            if (aVar.o == null) {
                aVar.o = new Path();
                aVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.o.reset();
            }
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(((float) aVar.r) * aVar.p, 0.0f);
            aVar.o.lineTo((((float) aVar.r) * aVar.p) / 2.0f, ((float) aVar.s) * aVar.p);
            aVar.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) aVar.r) * aVar.p) / 2.0f), rectF.centerY() + (aVar.f4411h / 2.0f));
            aVar.o.close();
            aVar.f4406c.setColor(aVar.u);
            aVar.f4406c.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, aVar.f4406c);
            canvas.restore();
        }
        canvas.restore();
    }

    static void a(float f2, a aVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int b2 = aVar.b();
            int i2 = aVar.f4412i[aVar.a()];
            int i3 = (b2 >> 24) & 255;
            int i4 = (b2 >> 16) & 255;
            int i5 = (b2 >> 8) & 255;
            int i6 = b2 & 255;
            aVar.u = ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f3))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f3))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f3))) << 8) | (i6 + ((int) (f3 * ((float) ((i2 & 255) - i6)))));
            return;
        }
        aVar.u = aVar.b();
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, a aVar, boolean z) {
        float f3;
        float interpolation;
        if (this.f4397d) {
            a(f2, aVar);
            aVar.f4408e = aVar.f4414k + (((aVar.f4415l - 0.01f) - aVar.f4414k) * f2);
            aVar.f4409f = aVar.f4415l;
            aVar.f4410g = aVar.f4416m + ((((float) (Math.floor((double) (aVar.f4416m / 0.8f)) + 1.0d)) - aVar.f4416m) * f2);
        } else if (f2 != 1.0f || z) {
            float f4 = aVar.f4416m;
            if (f2 < 0.5f) {
                interpolation = aVar.f4414k;
                f3 = (f4392f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f3 = aVar.f4414k + 0.79f;
                interpolation = f3 - (((1.0f - f4392f.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            aVar.f4408e = interpolation;
            aVar.f4409f = f3;
            aVar.f4410g = f4 + (0.20999998f * f2);
            this.f4395b = (f2 + this.f4396c) * 216.0f;
        }
    }

    private void a(float f2, float f3, float f4, float f5) {
        a aVar = this.f4394a;
        float f6 = this.f4398h.getDisplayMetrics().density;
        aVar.a(f3 * f6);
        aVar.q = f2 * f6;
        aVar.a(0);
        aVar.r = (int) (f4 * f6);
        aVar.s = (int) (f5 * f6);
    }
}
