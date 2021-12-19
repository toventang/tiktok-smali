package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class c extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public float f95256a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f95257b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95258c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95259d;

    /* renamed from: e  reason: collision with root package name */
    private final int f95260e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95261f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95262g;

    /* renamed from: h  reason: collision with root package name */
    private final int f95263h;

    /* renamed from: i  reason: collision with root package name */
    private final float f95264i;

    /* renamed from: j  reason: collision with root package name */
    private float f95265j;

    /* renamed from: k  reason: collision with root package name */
    private float f95266k;

    /* renamed from: l  reason: collision with root package name */
    private final float f95267l;

    /* renamed from: m  reason: collision with root package name */
    private float f95268m;
    private Paint n;
    private Paint o;
    private WeakReference<Drawable> p;

    static {
        Covode.recordClassIndex(60344);
    }

    private final Drawable b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.p;
        if (weakReference != null && (drawable = weakReference.get()) != null) {
            return drawable;
        }
        Drawable c2 = c();
        this.p = new WeakReference<>(c2);
        return c2;
    }

    private Drawable c() {
        Drawable drawable = this.f95257b.getResources().getDrawable(this.f95260e);
        l.b(drawable, "");
        return drawable;
    }

    private final void a() {
        if (!TextUtils.isEmpty(this.f95258c) && this.o == null) {
            this.o = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.f95259d)) {
                    Paint paint = this.o;
                    if (paint == null) {
                        l.b();
                    }
                    paint.setColor(this.f95263h);
                } else {
                    Paint paint2 = this.o;
                    if (paint2 == null) {
                        l.b();
                    }
                    paint2.setColor(Color.parseColor(this.f95259d));
                }
            } catch (Exception unused) {
                Paint paint3 = this.o;
                if (paint3 == null) {
                    l.b();
                }
                paint3.setColor(this.f95263h);
            }
            Paint paint4 = this.o;
            if (paint4 == null) {
                l.b();
            }
            paint4.setTextSize(this.f95268m);
            Paint paint5 = this.o;
            if (paint5 == null) {
                l.b();
            }
            paint5.setAntiAlias(true);
        }
    }

    private final float a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        a();
        Rect rect = new Rect();
        Paint paint = this.o;
        if (paint == null) {
            l.b();
        }
        if (str == null) {
            l.b();
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f95267l * 4.0f * 3.0f) + ((float) b().getIntrinsicWidth());
    }

    private final void a(Canvas canvas, float f2, float f3) {
        String str;
        if (this.o != null && (str = this.f95258c) != null) {
            float intrinsicWidth = f2 + (this.f95267l * 6.0f) + ((float) b().getIntrinsicWidth());
            float f4 = f3 - (this.f95267l * 1.0f);
            Paint paint = this.o;
            if (paint != null) {
                canvas.drawText(str, intrinsicWidth, f4, paint);
            }
        }
    }

    private final void a(Canvas canvas, float f2, int i2) {
        Paint paint = this.o;
        if (paint != null && this.n != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f3 = (float) i2;
            float f4 = fontMetrics.ascent + f3;
            float f5 = f3 + fontMetrics.descent;
            float min = Math.min(Math.min(f4, ((float) canvas.getHeight()) - f5), (this.f95265j - (f5 - f4)) * 0.5f);
            float f6 = this.f95267l;
            RectF rectF = new RectF(f2, (f4 - min) - (f6 * 1.0f), this.f95264i + f2, (f5 + min) - (f6 * 1.0f));
            float f7 = this.f95266k;
            Paint paint2 = this.n;
            if (paint2 != null) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.d(paint, "");
        return (int) this.f95264i;
    }

    public c(Context context, String str, String str2, int i2, String str3, String str4, int i3, int i4) {
        l.d(context, "");
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        l.b(applicationContext, "");
        this.f95257b = applicationContext;
        this.f95263h = Color.parseColor("#FACE15");
        Resources resources = applicationContext.getResources();
        l.b(resources, "");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f95267l = applyDimension;
        this.f95268m = ((float) i3) * applyDimension;
        this.f95265j = ((float) i4) * applyDimension;
        this.f95266k = applyDimension * 2.0f;
        this.f95258c = str;
        this.f95259d = str2;
        this.f95260e = i2;
        this.f95261f = str3;
        this.f95262g = str4;
        this.f95264i = a(str);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int i7;
        l.d(canvas, "");
        l.d(paint, "");
        if (!TextUtils.isEmpty(this.f95262g) && this.n == null) {
            Paint paint2 = new Paint();
            this.n = paint2;
            try {
                paint2.setColor(Color.parseColor(this.f95262g));
            } catch (Exception unused) {
                Paint paint3 = this.n;
                if (paint3 == null) {
                    l.b();
                }
                paint3.setColor(-1);
            }
            Paint paint4 = this.n;
            if (paint4 == null) {
                l.b();
            }
            paint4.setStyle(Paint.Style.FILL);
            Paint paint5 = this.n;
            if (paint5 == null) {
                l.b();
            }
            paint5.setAntiAlias(true);
        }
        a();
        a(canvas, f2, i5);
        a(canvas, f2, (float) i5);
        Drawable b2 = b();
        if (!(b2 instanceof BitmapDrawable)) {
            b2 = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) b2;
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint6 = new Paint();
            try {
                if (TextUtils.isEmpty(this.f95261f)) {
                    i7 = this.f95263h;
                } else {
                    i7 = Color.parseColor(this.f95261f);
                }
            } catch (Exception unused2) {
                i7 = this.f95263h;
            }
            paint6.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_ATOP));
            paint6.setAntiAlias(true);
            canvas.drawBitmap(bitmap, f2 + n.b(this.f95257b, 4.0f), ((float) (i5 - bitmapDrawable.getMinimumHeight())) + n.b(this.f95257b, 1.0f) + this.f95256a, paint6);
        }
    }
}
