package com.bytedance.android.live.uikit.a;

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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

final class c extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f12869a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Interpolator f12870b = new C0268c((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f12871g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f12872h = new AccelerateDecelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final b f12873c;

    /* renamed from: d  reason: collision with root package name */
    public float f12874d;

    /* renamed from: e  reason: collision with root package name */
    public float f12875e;

    /* renamed from: f  reason: collision with root package name */
    boolean f12876f;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f12877i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<Animation> f12878j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private Resources f12879k;

    /* renamed from: l  reason: collision with root package name */
    private View f12880l;

    /* renamed from: m  reason: collision with root package name */
    private Animation f12881m;
    private double n;
    private double o;
    private final Drawable.Callback p;

    public final int getOpacity() {
        return -3;
    }

    static class a extends AccelerateDecelerateInterpolator {
        static {
            Covode.recordClassIndex(7155);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final float getInterpolation(float f2) {
            return super.getInterpolation(Math.max(0.0f, (f2 - 0.5f) * 2.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.c$c  reason: collision with other inner class name */
    static class C0268c extends AccelerateDecelerateInterpolator {
        static {
            Covode.recordClassIndex(7157);
        }

        private C0268c() {
        }

        /* synthetic */ C0268c(byte b2) {
            this();
        }

        public final float getInterpolation(float f2) {
            return super.getInterpolation(Math.min(1.0f, f2 * 2.0f));
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.o;
    }

    public final int getIntrinsicWidth() {
        return (int) this.n;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final RectF f12887a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f12888b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f12889c;

        /* renamed from: d  reason: collision with root package name */
        public float f12890d;

        /* renamed from: e  reason: collision with root package name */
        public float f12891e;

        /* renamed from: f  reason: collision with root package name */
        public float f12892f;

        /* renamed from: g  reason: collision with root package name */
        public float f12893g;

        /* renamed from: h  reason: collision with root package name */
        public float f12894h;

        /* renamed from: i  reason: collision with root package name */
        int[] f12895i;

        /* renamed from: j  reason: collision with root package name */
        public int f12896j;

        /* renamed from: k  reason: collision with root package name */
        public float f12897k;

        /* renamed from: l  reason: collision with root package name */
        public float f12898l;

        /* renamed from: m  reason: collision with root package name */
        public float f12899m;
        boolean n;
        Path o;
        float p;
        public double q;
        int r;
        int s;
        public int t;
        final Paint u;
        public int v;
        private final Drawable.Callback w;

        static {
            Covode.recordClassIndex(7156);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.w.invalidateDrawable(null);
        }

        public final void a() {
            this.f12897k = this.f12890d;
            this.f12898l = this.f12891e;
            this.f12899m = this.f12892f;
        }

        public final void b() {
            this.f12897k = 0.0f;
            this.f12898l = 0.0f;
            this.f12899m = 0.0f;
            a(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public final void a(float f2) {
            this.f12890d = f2;
            c();
        }

        public final void b(float f2) {
            this.f12891e = f2;
            c();
        }

        public final void c(float f2) {
            this.f12892f = f2;
            c();
        }

        public final void a(boolean z) {
            if (this.n != z) {
                this.n = z;
                c();
            }
        }

        public final void a(int[] iArr) {
            this.f12895i = iArr;
            this.f12896j = 0;
        }

        public b(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f12888b = paint;
            Paint paint2 = new Paint();
            this.f12889c = paint2;
            this.f12890d = 0.0f;
            this.f12891e = 0.0f;
            this.f12892f = 0.0f;
            this.f12893g = 5.0f;
            this.f12894h = 2.5f;
            this.u = new Paint();
            this.w = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }
    }

    public final int getAlpha() {
        return this.f12873c.t;
    }

    public final void stop() {
        this.f12880l.clearAnimation();
        b(0.0f);
        this.f12873c.a(false);
        this.f12873c.f12896j = 0;
        this.f12873c.b();
    }

    static {
        Covode.recordClassIndex(7151);
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f12878j;
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
        this.f12881m.reset();
        this.f12873c.a();
        if (this.f12873c.f12891e != this.f12873c.f12890d) {
            this.f12876f = true;
            this.f12881m.setDuration(666);
            this.f12880l.startAnimation(this.f12881m);
            return;
        }
        this.f12873c.f12896j = 0;
        this.f12873c.b();
        this.f12881m.setDuration(1333);
        this.f12880l.startAnimation(this.f12881m);
    }

    public final void a(boolean z) {
        this.f12873c.a(z);
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2) {
        this.f12874d = f2;
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        this.f12873c.t = i2;
    }

    public final void a(float f2) {
        this.f12873c.a(0.0f);
        this.f12873c.b(f2);
    }

    public final void b(int i2) {
        this.f12873c.v = i2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f12873c;
        bVar.f12888b.setColorFilter(colorFilter);
        bVar.c();
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
        canvas.rotate(this.f12874d, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f12873c;
        RectF rectF = bVar.f12887a;
        rectF.set(bounds);
        rectF.inset(bVar.f12894h, bVar.f12894h);
        float f2 = (bVar.f12890d + bVar.f12892f) * 360.0f;
        float f3 = ((bVar.f12891e + bVar.f12892f) * 360.0f) - f2;
        bVar.f12888b.setColor(bVar.f12895i[bVar.f12896j]);
        canvas.drawArc(rectF, f2, f3, false, bVar.f12888b);
        if (bVar.n) {
            if (bVar.o == null) {
                bVar.o = new Path();
                bVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                bVar.o.reset();
            }
            float f4 = ((float) (((int) bVar.f12894h) / 2)) * bVar.p;
            double cos = bVar.q * Math.cos(0.0d);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f5 = (float) (cos + exactCenterX);
            double sin = bVar.q * Math.sin(0.0d);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            bVar.o.moveTo(0.0f, 0.0f);
            bVar.o.lineTo(((float) bVar.r) * bVar.p, 0.0f);
            bVar.o.lineTo((((float) bVar.r) * bVar.p) / 2.0f, ((float) bVar.s) * bVar.p);
            bVar.o.offset(f5 - f4, (float) (sin + exactCenterY));
            bVar.o.close();
            bVar.f12889c.setColor(bVar.f12895i[bVar.f12896j]);
            canvas.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(bVar.o, bVar.f12889c);
        }
        if (bVar.t < 255) {
            bVar.u.setColor(bVar.v);
            bVar.u.setAlpha(255 - bVar.t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), bVar.u);
        }
        canvas.restoreToCount(save);
    }

    public c(Context context, View view) {
        int[] iArr = {-16777216};
        this.f12877i = iArr;
        AnonymousClass3 r1 = new Drawable.Callback() {
            /* class com.bytedance.android.live.uikit.a.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(7154);
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
        this.p = r1;
        this.f12880l = view;
        this.f12879k = context.getResources();
        final b bVar = new b(r1);
        this.f12873c = bVar;
        bVar.a(iArr);
        a(1);
        AnonymousClass1 r12 = new Animation() {
            /* class com.bytedance.android.live.uikit.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7152);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                if (c.this.f12876f) {
                    b bVar = bVar;
                    bVar.a(bVar.f12897k + ((bVar.f12898l - bVar.f12897k) * f2));
                    bVar.c(bVar.f12899m + ((((float) (Math.floor((double) (bVar.f12899m / 0.8f)) + 1.0d)) - bVar.f12899m) * f2));
                    return;
                }
                double d2 = (double) bVar.f12893g;
                Double.isNaN(d2);
                float radians = (float) Math.toRadians(d2 / (bVar.q * 6.283185307179586d));
                float f3 = bVar.f12898l;
                float f4 = bVar.f12897k;
                float f5 = bVar.f12899m;
                bVar.b(f3 + ((0.8f - radians) * c.f12870b.getInterpolation(f2)));
                bVar.a(f4 + (c.f12869a.getInterpolation(f2) * 0.8f));
                bVar.c(f5 + (0.25f * f2));
                c.this.b((f2 * 144.0f) + ((c.this.f12875e / 5.0f) * 720.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f12871g);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.bytedance.android.live.uikit.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7153);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                c.this.f12875e = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                bVar.a();
                b bVar = bVar;
                bVar.f12896j = (bVar.f12896j + 1) % bVar.f12895i.length;
                b bVar2 = bVar;
                bVar2.a(bVar2.f12891e);
                if (c.this.f12876f) {
                    c.this.f12876f = false;
                    animation.setDuration(1333);
                    bVar.a(false);
                    return;
                }
                c cVar = c.this;
                cVar.f12875e = (cVar.f12875e + 1.0f) % 5.0f;
            }
        });
        this.f12881m = r12;
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        double d6;
        b bVar = this.f12873c;
        float f4 = this.f12879k.getDisplayMetrics().density;
        double d7 = (double) f4;
        Double.isNaN(d7);
        this.n = d2 * d7;
        Double.isNaN(d7);
        this.o = d3 * d7;
        float f5 = ((float) d5) * f4;
        bVar.f12893g = f5;
        bVar.f12888b.setStrokeWidth(f5);
        bVar.c();
        Double.isNaN(d7);
        bVar.q = d4 * d7;
        bVar.f12896j = 0;
        bVar.r = (int) (f2 * f4);
        bVar.s = (int) (f3 * f4);
        float min = (float) Math.min((int) this.n, (int) this.o);
        if (bVar.q <= 0.0d || min < 0.0f) {
            d6 = Math.ceil((double) (bVar.f12893g / 2.0f));
        } else {
            double d8 = (double) (min / 2.0f);
            double d9 = bVar.q;
            Double.isNaN(d8);
            d6 = d8 - d9;
        }
        bVar.f12894h = (float) d6;
    }
}
