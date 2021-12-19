package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

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
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.g.a.a.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class c extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    static final Interpolator f68218a = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final Interpolator f68219f = new LinearInterpolator();

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f68220g = {-16777216};

    /* renamed from: b  reason: collision with root package name */
    final a f68221b;

    /* renamed from: c  reason: collision with root package name */
    public float f68222c;

    /* renamed from: d  reason: collision with root package name */
    float f68223d;

    /* renamed from: e  reason: collision with root package name */
    boolean f68224e;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<Animation> f68225h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private Resources f68226i;

    /* renamed from: j  reason: collision with root package name */
    private View f68227j;

    /* renamed from: k  reason: collision with root package name */
    private Animation f68228k;

    /* renamed from: l  reason: collision with root package name */
    private double f68229l;

    /* renamed from: m  reason: collision with root package name */
    private double f68230m;
    private final Drawable.Callback n;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f68230m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f68229l;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final RectF f68236a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f68237b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f68238c;

        /* renamed from: d  reason: collision with root package name */
        public float f68239d;

        /* renamed from: e  reason: collision with root package name */
        public float f68240e;

        /* renamed from: f  reason: collision with root package name */
        public float f68241f;

        /* renamed from: g  reason: collision with root package name */
        public float f68242g;

        /* renamed from: h  reason: collision with root package name */
        public float f68243h;

        /* renamed from: i  reason: collision with root package name */
        int[] f68244i;

        /* renamed from: j  reason: collision with root package name */
        int f68245j;

        /* renamed from: k  reason: collision with root package name */
        public float f68246k;

        /* renamed from: l  reason: collision with root package name */
        public float f68247l;

        /* renamed from: m  reason: collision with root package name */
        public float f68248m;
        boolean n;
        Path o;
        float p;
        public double q;
        int r;
        int s;
        public int t;
        final Paint u;
        public int v;
        public int w;
        private final Drawable.Callback x;

        static {
            Covode.recordClassIndex(42030);
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.x.invalidateDrawable(null);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return (this.f68245j + 1) % this.f68244i.length;
        }

        public final void b() {
            this.f68246k = this.f68239d;
            this.f68247l = this.f68240e;
            this.f68248m = this.f68241f;
        }

        public final void c() {
            this.f68246k = 0.0f;
            this.f68247l = 0.0f;
            this.f68248m = 0.0f;
            a(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public final void a(float f2) {
            this.f68239d = f2;
            d();
        }

        public final void b(float f2) {
            this.f68240e = f2;
            d();
        }

        public final void c(float f2) {
            this.f68241f = f2;
            d();
        }

        public final void a(int i2) {
            this.f68245j = i2;
            this.w = this.f68244i[i2];
        }

        public final void a(boolean z) {
            if (this.n != z) {
                this.n = z;
                d();
            }
        }

        a(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f68237b = paint;
            Paint paint2 = new Paint();
            this.f68238c = paint2;
            this.f68239d = 0.0f;
            this.f68240e = 0.0f;
            this.f68241f = 0.0f;
            this.f68242g = 5.0f;
            this.f68243h = 2.5f;
            this.u = new Paint(1);
            this.x = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public final void a(int[] iArr) {
            this.f68244i = iArr;
            a(0);
        }
    }

    public final int getAlpha() {
        return this.f68221b.t;
    }

    static {
        Covode.recordClassIndex(42026);
    }

    public final void stop() {
        this.f68227j.clearAnimation();
        d(0.0f);
        this.f68221b.a(false);
        this.f68221b.a(0);
        this.f68221b.c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f68225h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animation animation = arrayList.get(i2);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        this.f68228k.reset();
        this.f68221b.b();
        if (this.f68221b.f68240e != this.f68221b.f68239d) {
            this.f68224e = true;
            this.f68228k.setDuration(666);
            this.f68227j.startAnimation(this.f68228k);
            return;
        }
        this.f68221b.a(0);
        this.f68221b.c();
        this.f68228k.setDuration(1332);
        this.f68227j.startAnimation(this.f68228k);
    }

    public final void a(boolean z) {
        this.f68221b.a(z);
    }

    public final void b(int i2) {
        this.f68221b.v = i2;
    }

    public final void c(float f2) {
        this.f68221b.c(f2);
    }

    /* access modifiers changed from: package-private */
    public final void d(float f2) {
        this.f68222c = f2;
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        this.f68221b.t = i2;
    }

    public final void a(float f2) {
        a aVar = this.f68221b;
        if (f2 != aVar.p) {
            aVar.p = f2;
            aVar.d();
        }
    }

    public final void b(float f2) {
        this.f68221b.a(0.0f);
        this.f68221b.b(f2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.f68221b;
        aVar.f68237b.setColorFilter(colorFilter);
        aVar.d();
    }

    static float a(a aVar) {
        double d2 = (double) aVar.f68242g;
        Double.isNaN(d2);
        return (float) Math.toRadians(d2 / (aVar.q * 6.283185307179586d));
    }

    public final void a(int i2) {
        if (i2 == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f68222c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f68221b;
        RectF rectF = aVar.f68236a;
        rectF.set(bounds);
        rectF.inset(aVar.f68243h, aVar.f68243h);
        float f2 = (aVar.f68239d + aVar.f68241f) * 360.0f;
        float f3 = ((aVar.f68240e + aVar.f68241f) * 360.0f) - f2;
        aVar.f68237b.setColor(aVar.w);
        canvas.drawArc(rectF, f2, f3, false, aVar.f68237b);
        if (aVar.n) {
            if (aVar.o == null) {
                aVar.o = new Path();
                aVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.o.reset();
            }
            float f4 = ((float) (((int) aVar.f68243h) / 2)) * aVar.p;
            double cos = aVar.q * Math.cos(0.0d);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f5 = (float) (cos + exactCenterX);
            double sin = aVar.q * Math.sin(0.0d);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(((float) aVar.r) * aVar.p, 0.0f);
            aVar.o.lineTo((((float) aVar.r) * aVar.p) / 2.0f, ((float) aVar.s) * aVar.p);
            aVar.o.offset(f5 - f4, (float) (sin + exactCenterY));
            aVar.o.close();
            aVar.f68238c.setColor(aVar.w);
            canvas.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.o, aVar.f68238c);
        }
        if (aVar.t < 255) {
            aVar.u.setColor(aVar.v);
            aVar.u.setAlpha(255 - aVar.t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.u);
        }
        canvas.restoreToCount(save);
    }

    c(Context context, View view) {
        AnonymousClass3 r1 = new Drawable.Callback() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(42029);
            }

            public final void invalidateDrawable(Drawable drawable) {
                c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                c.this.scheduleSelf(runnable, j2);
            }
        };
        this.n = r1;
        this.f68227j = view;
        this.f68226i = context.getResources();
        final a aVar = new a(r1);
        this.f68221b = aVar;
        aVar.a(f68220g);
        a(1);
        AnonymousClass1 r12 = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42027);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                if (c.this.f68224e) {
                    a aVar = aVar;
                    c.a(f2, aVar);
                    aVar.a(aVar.f68246k + (((aVar.f68247l - c.a(aVar)) - aVar.f68246k) * f2));
                    aVar.b(aVar.f68247l);
                    aVar.c(aVar.f68248m + ((((float) (Math.floor((double) (aVar.f68248m / 0.8f)) + 1.0d)) - aVar.f68248m) * f2));
                    return;
                }
                float a2 = c.a(aVar);
                float f3 = aVar.f68247l;
                float f4 = aVar.f68246k;
                float f5 = aVar.f68248m;
                c.a(f2, aVar);
                if (f2 <= 0.5f) {
                    Interpolator interpolator = c.f68218a;
                    aVar.a(f4 + ((0.8f - a2) * interpolator.getInterpolation(f2 / 0.5f)));
                }
                if (f2 > 0.5f) {
                    Interpolator interpolator2 = c.f68218a;
                    aVar.b(f3 + ((0.8f - a2) * interpolator2.getInterpolation((f2 - 0.5f) / 0.5f)));
                }
                aVar.c(f5 + (0.25f * f2));
                c.this.d((f2 * 216.0f) + ((c.this.f68223d / 5.0f) * 1080.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f68219f);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(42028);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                c.this.f68223d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.b();
                a aVar = aVar;
                aVar.a(aVar.a());
                a aVar2 = aVar;
                aVar2.a(aVar2.f68240e);
                if (c.this.f68224e) {
                    c.this.f68224e = false;
                    animation.setDuration(1332);
                    aVar.a(false);
                    return;
                }
                c cVar = c.this;
                cVar.f68223d = (cVar.f68223d + 1.0f) % 5.0f;
            }
        });
        this.f68228k = r12;
    }

    static void a(float f2, a aVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int i2 = aVar.f68244i[aVar.f68245j];
            int i3 = aVar.f68244i[aVar.a()];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            aVar.w = ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f3))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f3))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f3))) << 8) | (i7 + ((int) (f3 * ((float) ((i3 & 255) - i7)))));
        }
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        double d6;
        a aVar = this.f68221b;
        float f4 = this.f68226i.getDisplayMetrics().density;
        double d7 = (double) f4;
        Double.isNaN(d7);
        this.f68229l = d2 * d7;
        Double.isNaN(d7);
        this.f68230m = d3 * d7;
        float f5 = ((float) d5) * f4;
        aVar.f68242g = f5;
        aVar.f68237b.setStrokeWidth(f5);
        aVar.d();
        Double.isNaN(d7);
        aVar.q = d4 * d7;
        aVar.a(0);
        aVar.r = (int) (f2 * f4);
        aVar.s = (int) (f3 * f4);
        float min = (float) Math.min((int) this.f68229l, (int) this.f68230m);
        if (aVar.q <= 0.0d || min < 0.0f) {
            d6 = Math.ceil((double) (aVar.f68242g / 2.0f));
        } else {
            double d8 = (double) (min / 2.0f);
            double d9 = aVar.q;
            Double.isNaN(d8);
            d6 = d8 - d9;
        }
        aVar.f68243h = (float) d6;
    }
}
