package com.ss.android.ugc.aweme.story.feed.ui.progress;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.d;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

public final class StoryProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137734a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final RectF f137735b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f137736c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f137737d;
    private float drawPercentProgress;

    /* renamed from: e  reason: collision with root package name */
    private int f137738e;

    /* renamed from: f  reason: collision with root package name */
    private int f137739f;

    /* renamed from: g  reason: collision with root package name */
    private int f137740g;

    /* renamed from: h  reason: collision with root package name */
    private int f137741h;

    /* renamed from: i  reason: collision with root package name */
    private float f137742i;

    /* renamed from: j  reason: collision with root package name */
    private long f137743j;

    /* renamed from: k  reason: collision with root package name */
    private ValueAnimator f137744k;

    /* renamed from: l  reason: collision with root package name */
    private float f137745l;

    /* renamed from: m  reason: collision with root package name */
    private float f137746m;
    private final Paint n;
    private final Paint o;

    enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT;

        static {
            Covode.recordClassIndex(90128);
        }
    }

    static {
        Covode.recordClassIndex(90126);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90127);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final float getDrawPercentProgress() {
        return this.drawPercentProgress;
    }

    public final int getOrientation() {
        return this.f137738e;
    }

    private final void a() {
        Arrays.fill(this.f137737d, 0.0f);
    }

    public final void setAnimationInterval(long j2) {
        this.f137743j = j2;
    }

    public final void setOrientation(int i2) {
        this.f137738e = i2;
    }

    public final void setDrawPercentProgress(float f2) {
        this.drawPercentProgress = f2;
        invalidate();
    }

    public final void setProgressBarConfig(a aVar) {
        if (aVar != null) {
            if (aVar.f137752a > 0.0f) {
                this.f137742i = aVar.f137752a;
            }
            if (aVar.f137753b > 0) {
                this.f137740g = aVar.f137753b;
            }
            if (aVar.f137754c > 0) {
                this.f137741h = aVar.f137754c;
            }
            if (aVar.f137755d > 0.0f) {
                this.f137745l = aVar.f137755d;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryProgressBar(Context context) {
        super(context, null, 0);
        l.d(context, "");
        int i2 = 0;
        MethodCollector.i(3108);
        this.f137735b = new RectF();
        this.f137736c = new Path();
        this.f137737d = new float[8];
        this.f137739f = -1;
        Integer a2 = d.a(context, R.attr.ae);
        this.f137740g = a2 != null ? a2.intValue() : i2;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f137742i = TypedValue.applyDimension(1, 1.5f, system.getDisplayMetrics());
        this.f137743j = 300;
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.f137745l = TypedValue.applyDimension(1, 7.0f, system2.getDisplayMetrics());
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        this.f137746m = TypedValue.applyDimension(1, 3.0f, system3.getDisplayMetrics());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f137739f);
        paint.setStyle(Paint.Style.FILL);
        this.n = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(this.f137740g);
        paint2.setStyle(Paint.Style.FILL);
        this.o = paint2;
        MethodCollector.o(3108);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(2567);
        super.onDraw(canvas);
        if (canvas != null) {
            if (getOrientation() == 0) {
                this.f137735b.set(0.0f, this.f137745l, (float) getWidth(), this.f137745l + this.f137746m);
            } else {
                this.f137735b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            }
            int i2 = this.f137741h;
            if (i2 != 0) {
                this.o.setColor(i2);
                RectF rectF = this.f137735b;
                float f2 = this.f137742i;
                canvas.drawRoundRect(rectF, f2, f2, this.o);
            }
            this.o.setColor(this.f137740g);
            RectF rectF2 = this.f137735b;
            float f3 = this.f137742i;
            canvas.drawRoundRect(rectF2, f3, f3, this.o);
            this.f137736c.reset();
            a();
            if (getOrientation() == 0) {
                float width = ((float) getWidth()) * this.drawPercentProgress;
                if (((float) getWidth()) <= this.f137742i) {
                    a(b.TOP_LEFT, this.f137742i);
                    a(b.BOTTOM_LEFT, this.f137742i);
                    a(b.TOP_RIGHT, this.f137742i);
                    a(b.BOTTOM_RIGHT, this.f137742i);
                    RectF rectF3 = this.f137735b;
                    float f4 = this.f137745l;
                    rectF3.set(0.0f, f4, width, this.f137746m + f4);
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                } else if (this.drawPercentProgress == 0.0f) {
                    RectF rectF4 = this.f137735b;
                    float f5 = this.f137745l;
                    rectF4.set(0.0f, f5, width, this.f137746m + f5);
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                } else {
                    Context context = getContext();
                    l.b(context, "");
                    if (i.a(context)) {
                        this.f137735b.set(((float) getWidth()) - (this.f137742i * 2.0f), this.f137745l, (float) getWidth(), this.f137745l + this.f137746m);
                    } else {
                        RectF rectF5 = this.f137735b;
                        float f6 = this.f137745l;
                        rectF5.set(0.0f, f6, this.f137742i * 2.0f, this.f137746m + f6);
                    }
                    RectF rectF6 = this.f137735b;
                    float f7 = this.f137742i;
                    canvas.drawRoundRect(rectF6, f7, f7, this.n);
                    a();
                    Context context2 = getContext();
                    l.b(context2, "");
                    if (i.a(context2)) {
                        a(b.TOP_LEFT, this.f137742i);
                        a(b.BOTTOM_LEFT, this.f137742i);
                    }
                    a(b.TOP_RIGHT, this.f137742i);
                    a(b.BOTTOM_RIGHT, this.f137742i);
                    Context context3 = getContext();
                    l.b(context3, "");
                    if (i.a(context3)) {
                        this.f137735b.set(((float) getWidth()) - width, this.f137745l, (float) getWidth(), this.f137745l + this.f137746m);
                    } else {
                        RectF rectF7 = this.f137735b;
                        float f8 = this.f137742i;
                        float f9 = this.f137745l;
                        rectF7.set(f8, f9, width, this.f137746m + f9);
                    }
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                }
            } else {
                float height = ((float) getHeight()) * this.drawPercentProgress;
                if (((float) getHeight()) <= this.f137742i) {
                    a(b.TOP_LEFT, this.f137742i);
                    a(b.BOTTOM_LEFT, this.f137742i);
                    a(b.TOP_RIGHT, this.f137742i);
                    a(b.BOTTOM_RIGHT, this.f137742i);
                    this.f137735b.set(0.0f, 0.0f, (float) getWidth(), height);
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                } else if (this.drawPercentProgress == 0.0f) {
                    this.f137735b.set(0.0f, 0.0f, (float) getWidth(), height);
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                } else {
                    this.f137735b.set(0.0f, 0.0f, (float) getWidth(), this.f137742i);
                    RectF rectF8 = this.f137735b;
                    float f10 = this.f137742i;
                    canvas.drawRoundRect(rectF8, f10, f10, this.n);
                    a();
                    a(b.BOTTOM_LEFT, this.f137742i);
                    a(b.BOTTOM_RIGHT, this.f137742i);
                    this.f137735b.set(0.0f, this.f137742i / 2.0f, (float) getWidth(), height);
                    this.f137736c.addRoundRect(this.f137735b, this.f137737d, Path.Direction.CW);
                    canvas.drawPath(this.f137736c, this.n);
                    MethodCollector.o(2567);
                }
            }
        } else {
            MethodCollector.o(2567);
        }
    }

    public /* synthetic */ StoryProgressBar(Context context, byte b2) {
        this(context);
    }

    private final void a(b bVar, float f2) {
        int i2 = b.f137756a[bVar.ordinal()];
        if (i2 == 1) {
            float[] fArr = this.f137737d;
            fArr[0] = f2;
            fArr[1] = f2;
        } else if (i2 == 2) {
            float[] fArr2 = this.f137737d;
            fArr2[2] = f2;
            fArr2[3] = f2;
        } else if (i2 == 3) {
            float[] fArr3 = this.f137737d;
            fArr3[4] = f2;
            fArr3[5] = f2;
        } else if (i2 == 4) {
            float[] fArr4 = this.f137737d;
            fArr4[6] = f2;
            fArr4[7] = f2;
        }
    }

    public final void a(float f2, boolean z) {
        boolean z2;
        float f3 = this.drawPercentProgress;
        if (f2 <= 0.0f || f2 > f3) {
            if (getWidth() <= 0 || getHeight() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2 || f2 <= f3 || f2 >= 1.0f) {
                ValueAnimator valueAnimator = this.f137744k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                setDrawPercentProgress(f2);
                return;
            }
            clearAnimation();
            ValueAnimator valueAnimator2 = this.f137744k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "drawPercentProgress", f3, f2);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(this.f137743j);
            int i2 = Build.VERSION.SDK_INT;
            ofFloat.setAutoCancel(true);
            this.f137744k = ofFloat;
            ofFloat.start();
            return;
        }
        setDrawPercentProgress(f2);
    }
}
