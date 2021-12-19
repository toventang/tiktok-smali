package com.ss.android.ugc.aweme.views;

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
public final class n extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    static final Interpolator f144663a = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final Interpolator f144664f = new LinearInterpolator();

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f144665g = {-16777216};

    /* renamed from: b  reason: collision with root package name */
    final a f144666b;

    /* renamed from: c  reason: collision with root package name */
    public float f144667c;

    /* renamed from: d  reason: collision with root package name */
    float f144668d;

    /* renamed from: e  reason: collision with root package name */
    boolean f144669e;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<Animation> f144670h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private Resources f144671i;

    /* renamed from: j  reason: collision with root package name */
    private View f144672j;

    /* renamed from: k  reason: collision with root package name */
    private Animation f144673k;

    /* renamed from: l  reason: collision with root package name */
    private double f144674l;

    /* renamed from: m  reason: collision with root package name */
    private double f144675m;
    private final Drawable.Callback n;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f144675m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f144674l;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final RectF f144681a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f144682b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f144683c;

        /* renamed from: d  reason: collision with root package name */
        public float f144684d;

        /* renamed from: e  reason: collision with root package name */
        public float f144685e;

        /* renamed from: f  reason: collision with root package name */
        public float f144686f;

        /* renamed from: g  reason: collision with root package name */
        public float f144687g;

        /* renamed from: h  reason: collision with root package name */
        public float f144688h;

        /* renamed from: i  reason: collision with root package name */
        int[] f144689i;

        /* renamed from: j  reason: collision with root package name */
        int f144690j;

        /* renamed from: k  reason: collision with root package name */
        public float f144691k;

        /* renamed from: l  reason: collision with root package name */
        public float f144692l;

        /* renamed from: m  reason: collision with root package name */
        public float f144693m;
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
            Covode.recordClassIndex(94652);
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.x.invalidateDrawable(null);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return (this.f144690j + 1) % this.f144689i.length;
        }

        public final void b() {
            this.f144691k = this.f144684d;
            this.f144692l = this.f144685e;
            this.f144693m = this.f144686f;
        }

        public final void c() {
            this.f144691k = 0.0f;
            this.f144692l = 0.0f;
            this.f144693m = 0.0f;
            a(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public final void a(float f2) {
            this.f144684d = f2;
            d();
        }

        public final void b(float f2) {
            this.f144685e = f2;
            d();
        }

        public final void c(float f2) {
            this.f144686f = f2;
            d();
        }

        public final void d(float f2) {
            if (f2 != this.p) {
                this.p = f2;
                d();
            }
        }

        public final void a(int i2) {
            this.f144690j = i2;
            this.w = this.f144689i[i2];
        }

        public final void a(boolean z) {
            if (this.n != z) {
                this.n = z;
                d();
            }
        }

        a(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f144682b = paint;
            Paint paint2 = new Paint();
            this.f144683c = paint2;
            this.f144684d = 0.0f;
            this.f144685e = 0.0f;
            this.f144686f = 0.0f;
            this.f144687g = 5.0f;
            this.f144688h = 2.5f;
            this.u = new Paint(1);
            this.x = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public final void a(int[] iArr) {
            this.f144689i = iArr;
            a(0);
        }
    }

    public final int getAlpha() {
        return this.f144666b.t;
    }

    static {
        Covode.recordClassIndex(94648);
    }

    public final void stop() {
        this.f144672j.clearAnimation();
        d(0.0f);
        this.f144666b.a(false);
        this.f144666b.a(0);
        this.f144666b.c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f144670h;
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
        this.f144673k.reset();
        this.f144666b.b();
        if (this.f144666b.f144685e != this.f144666b.f144684d) {
            this.f144669e = true;
            this.f144673k.setDuration(666);
            this.f144672j.startAnimation(this.f144673k);
            return;
        }
        this.f144666b.a(0);
        this.f144666b.c();
        this.f144673k.setDuration(1332);
        this.f144672j.startAnimation(this.f144673k);
    }

    public final void a(float f2) {
        this.f144666b.d(f2);
    }

    public final void b(int i2) {
        this.f144666b.v = i2;
    }

    public final void c(float f2) {
        this.f144666b.c(f2);
    }

    /* access modifiers changed from: package-private */
    public final void d(float f2) {
        this.f144667c = f2;
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        this.f144666b.t = i2;
    }

    public final void a(boolean z) {
        this.f144666b.a(z);
    }

    public final void b(float f2) {
        this.f144666b.a(0.0f);
        this.f144666b.b(f2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.f144666b;
        aVar.f144682b.setColorFilter(colorFilter);
        aVar.d();
    }

    static float a(a aVar) {
        double d2 = (double) aVar.f144687g;
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
        canvas.rotate(this.f144667c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f144666b;
        RectF rectF = aVar.f144681a;
        rectF.set(bounds);
        rectF.inset(aVar.f144688h, aVar.f144688h);
        float f2 = (aVar.f144684d + aVar.f144686f) * 360.0f;
        float f3 = ((aVar.f144685e + aVar.f144686f) * 360.0f) - f2;
        aVar.f144682b.setColor(aVar.w);
        canvas.drawArc(rectF, f2, f3, false, aVar.f144682b);
        if (aVar.n) {
            if (aVar.o == null) {
                aVar.o = new Path();
                aVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.o.reset();
            }
            float f4 = ((float) (((int) aVar.f144688h) / 2)) * aVar.p;
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
            aVar.f144683c.setColor(aVar.w);
            canvas.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.o, aVar.f144683c);
        }
        if (aVar.t < 255) {
            aVar.u.setColor(aVar.v);
            aVar.u.setAlpha(255 - aVar.t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.u);
        }
        canvas.restoreToCount(save);
    }

    n(Context context, View view) {
        AnonymousClass3 r1 = new Drawable.Callback() {
            /* class com.ss.android.ugc.aweme.views.n.AnonymousClass3 */

            static {
                Covode.recordClassIndex(94651);
            }

            public final void invalidateDrawable(Drawable drawable) {
                n.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                n.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                n.this.scheduleSelf(runnable, j2);
            }
        };
        this.n = r1;
        this.f144672j = view;
        this.f144671i = context.getResources();
        final a aVar = new a(r1);
        this.f144666b = aVar;
        aVar.a(f144665g);
        a(1);
        AnonymousClass1 r12 = new Animation() {
            /* class com.ss.android.ugc.aweme.views.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94649);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                if (n.this.f144669e) {
                    a aVar = aVar;
                    n.a(f2, aVar);
                    aVar.a(aVar.f144691k + (((aVar.f144692l - n.a(aVar)) - aVar.f144691k) * f2));
                    aVar.b(aVar.f144692l);
                    aVar.c(aVar.f144693m + ((((float) (Math.floor((double) (aVar.f144693m / 0.8f)) + 1.0d)) - aVar.f144693m) * f2));
                    return;
                }
                float a2 = n.a(aVar);
                float f3 = aVar.f144692l;
                float f4 = aVar.f144691k;
                float f5 = aVar.f144693m;
                n.a(f2, aVar);
                if (f2 <= 0.5f) {
                    Interpolator interpolator = n.f144663a;
                    aVar.a(f4 + ((0.8f - a2) * interpolator.getInterpolation(f2 / 0.5f)));
                }
                if (f2 > 0.5f) {
                    Interpolator interpolator2 = n.f144663a;
                    aVar.b(f3 + ((0.8f - a2) * interpolator2.getInterpolation((f2 - 0.5f) / 0.5f)));
                }
                aVar.c(f5 + (0.25f * f2));
                n.this.d((f2 * 216.0f) + ((n.this.f144668d / 5.0f) * 1080.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f144664f);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.views.n.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94650);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                n.this.f144668d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.b();
                a aVar = aVar;
                aVar.a(aVar.a());
                a aVar2 = aVar;
                aVar2.a(aVar2.f144685e);
                if (n.this.f144669e) {
                    n.this.f144669e = false;
                    animation.setDuration(1332);
                    aVar.a(false);
                    return;
                }
                n nVar = n.this;
                nVar.f144668d = (nVar.f144668d + 1.0f) % 5.0f;
            }
        });
        this.f144673k = r12;
    }

    static void a(float f2, a aVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int i2 = aVar.f144689i[aVar.f144690j];
            int i3 = aVar.f144689i[aVar.a()];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            aVar.w = ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f3))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f3))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f3))) << 8) | (i7 + ((int) (f3 * ((float) ((i3 & 255) - i7)))));
        }
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        double d6;
        a aVar = this.f144666b;
        float f4 = this.f144671i.getDisplayMetrics().density;
        double d7 = (double) f4;
        Double.isNaN(d7);
        this.f144674l = d2 * d7;
        Double.isNaN(d7);
        this.f144675m = d3 * d7;
        float f5 = ((float) d5) * f4;
        aVar.f144687g = f5;
        aVar.f144682b.setStrokeWidth(f5);
        aVar.d();
        Double.isNaN(d7);
        aVar.q = d4 * d7;
        aVar.a(0);
        aVar.r = (int) (f2 * f4);
        aVar.s = (int) (f3 * f4);
        float min = (float) Math.min((int) this.f144674l, (int) this.f144675m);
        if (aVar.q <= 0.0d || min < 0.0f) {
            d6 = Math.ceil((double) (aVar.f144687g / 2.0f));
        } else {
            double d8 = (double) (min / 2.0f);
            double d9 = aVar.q;
            Double.isNaN(d8);
            d6 = d8 - d9;
        }
        aVar.f144688h = (float) d6;
    }
}
