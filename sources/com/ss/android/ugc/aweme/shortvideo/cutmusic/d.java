package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f126345a;

    /* renamed from: b  reason: collision with root package name */
    int f126346b;

    /* renamed from: c  reason: collision with root package name */
    int f126347c;

    /* renamed from: d  reason: collision with root package name */
    public int f126348d;

    /* renamed from: e  reason: collision with root package name */
    int f126349e;

    /* renamed from: f  reason: collision with root package name */
    int f126350f;

    /* renamed from: g  reason: collision with root package name */
    int f126351g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f126352h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f126353i;

    /* renamed from: j  reason: collision with root package name */
    private int f126354j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f126355k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f126356l;

    /* renamed from: m  reason: collision with root package name */
    private int f126357m;
    private Paint n;

    static {
        Covode.recordClassIndex(82912);
    }

    public d() {
        this.f126352h = new float[0];
        this.f126357m = -1;
        this.f126353i = true;
    }

    public d(Context context) {
        l.d(context, "");
        this.f126352h = new float[0];
        this.f126357m = -1;
        this.f126353i = true;
        a(context);
    }

    public final void a(int i2) {
        this.f126357m = i2;
        Paint paint = this.f126355k;
        if (paint == null) {
            l.a("mPaint");
        }
        paint.setColor(i2);
        Paint paint2 = this.f126356l;
        if (paint2 == null) {
            l.a("mOuterPaint");
        }
        paint2.setColor(i2);
    }

    public final void a(float[] fArr) {
        if (k.b.a(fArr)) {
            if (fArr == null) {
                l.b();
            }
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            l.b(copyOf, "");
            this.f126352h = copyOf;
        }
    }

    public final void a(Context context) {
        l.d(context, "");
        Paint paint = new Paint();
        this.f126355k = paint;
        paint.setColor(this.f126357m);
        Paint paint2 = this.f126355k;
        if (paint2 == null) {
            l.a("mPaint");
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.f126355k;
        if (paint3 == null) {
            l.a("mPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f126356l = paint4;
        paint4.setColor(this.f126357m);
        Paint paint5 = this.f126356l;
        if (paint5 == null) {
            l.a("mOuterPaint");
        }
        paint5.setStyle(Paint.Style.FILL);
        Paint paint6 = this.f126356l;
        if (paint6 == null) {
            l.a("mOuterPaint");
        }
        paint6.setAntiAlias(true);
        Paint paint7 = this.f126356l;
        if (paint7 == null) {
            l.a("mOuterPaint");
        }
        paint7.setAlpha(127);
        Paint paint8 = new Paint();
        this.n = paint8;
        paint8.setColor(b.c(context, R.color.v));
        Paint paint9 = this.n;
        if (paint9 == null) {
            l.a("centerLinePaint");
        }
        paint9.setStrokeWidth((float) ((int) n.b(context, 1.0f)));
        Paint paint10 = this.n;
        if (paint10 == null) {
            l.a("centerLinePaint");
        }
        paint10.setStyle(Paint.Style.FILL);
        Paint paint11 = this.n;
        if (paint11 == null) {
            l.a("centerLinePaint");
        }
        paint11.setAntiAlias(true);
        this.f126351g = (int) n.b(context, 3.0f);
        this.f126345a = (int) n.b(context, 3.0f);
        this.f126346b = (int) n.b(context, 2.0f);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        int i2;
        l.d(canvas, "");
        if (this.f126353i) {
            int i3 = this.f126347c;
            int i4 = this.f126348d;
            float f2 = (float) ((i3 / 2) + i4);
            float f3 = (float) this.f126354j;
            float f4 = (float) ((i3 / 2) + i4);
            Paint paint2 = this.n;
            if (paint2 == null) {
                l.a("centerLinePaint");
            }
            canvas.drawLine(0.0f, f2, f3, f4, paint2);
        }
        int length = this.f126352h.length;
        for (int i5 = 0; i5 < length; i5++) {
            float f5 = this.f126352h[i5];
            int i6 = this.f126347c;
            int i7 = (int) (f5 * ((float) i6));
            int i8 = this.f126346b;
            int i9 = this.f126345a;
            int i10 = (i8 + i9) * i5;
            int i11 = this.f126350f;
            if (i11 > 0 && i11 > this.f126349e) {
                i9 = 0;
            }
            int i12 = i10 + i9;
            int i13 = ((i6 - i7) / 2) + this.f126348d;
            int i14 = i8 + i12;
            RectF rectF = new RectF((float) i12, (float) i13, (float) i14, (float) (i7 + i13));
            int i15 = this.f126351g;
            float f6 = (float) i15;
            float f7 = (float) i15;
            int i16 = this.f126350f;
            if (i16 <= 0 || i16 <= (i2 = this.f126349e) || (i14 > i2 && i12 < i16)) {
                paint = this.f126355k;
                if (paint == null) {
                    l.a("mPaint");
                }
            } else {
                paint = this.f126356l;
                if (paint == null) {
                    l.a("mOuterPaint");
                }
            }
            canvas.drawRoundRect(rectF, f6, f7, paint);
        }
    }

    public final void a(int i2, int i3) {
        this.f126354j = i2;
        this.f126347c = i3;
        this.f126347c = i3 - (this.f126348d * 2);
    }
}
