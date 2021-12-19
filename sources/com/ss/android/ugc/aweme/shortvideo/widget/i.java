package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final int f132915a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f132916b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final b f132917c = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final Paint f132918d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f132919e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f132920f;

    /* renamed from: g  reason: collision with root package name */
    private final int f132921g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f132922h;

    /* renamed from: i  reason: collision with root package name */
    private final int f132923i;

    /* renamed from: j  reason: collision with root package name */
    private final int f132924j;

    /* renamed from: k  reason: collision with root package name */
    private final int f132925k;

    /* renamed from: l  reason: collision with root package name */
    private final int f132926l;

    /* renamed from: m  reason: collision with root package name */
    private final int f132927m;

    public final int getOpacity() {
        return -3;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(86946);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static void a(View view, int i2, int i3, int i4, int i5, int i6, int i7) {
            l.d(view, "");
            a a2 = new a().a(i2);
            a2.f132928a = i3;
            a2.f132929b = i4;
            a2.f132930c = i5;
            a2.f132931d = i6;
            a2.f132932e = i7;
            i a3 = a2.a();
            view.setLayerType(1, null);
            v.a(view, a3);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f132928a = 12;

        /* renamed from: b  reason: collision with root package name */
        int f132929b = Color.parseColor("#4d000000");

        /* renamed from: c  reason: collision with root package name */
        int f132930c = 18;

        /* renamed from: d  reason: collision with root package name */
        int f132931d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f132932e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f132933f = i.f132915a;

        /* renamed from: g  reason: collision with root package name */
        private int[] f132934g;

        static {
            Covode.recordClassIndex(86945);
        }

        public final i a() {
            return new i(this.f132933f, this.f132934g, this.f132928a, this.f132929b, this.f132930c, this.f132931d, this.f132932e, (byte) 0);
        }

        public a() {
            int[] iArr = new int[1];
            this.f132934g = iArr;
            iArr[0] = 0;
        }

        public final a a(int i2) {
            this.f132934g[0] = i2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(86944);
    }

    public final void setAlpha(int i2) {
        this.f132918d.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f132918d.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        l.d(canvas, "");
        int[] iArr = this.f132922h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f132919e.setColor(iArr[0]);
            } else {
                Paint paint = this.f132919e;
                RectF rectF = this.f132920f;
                if (rectF == null) {
                    l.b();
                }
                float f2 = rectF.left;
                RectF rectF2 = this.f132920f;
                if (rectF2 == null) {
                    l.b();
                }
                float height = rectF2.height() / 2.0f;
                RectF rectF3 = this.f132920f;
                if (rectF3 == null) {
                    l.b();
                }
                float f3 = rectF3.right;
                RectF rectF4 = this.f132920f;
                if (rectF4 == null) {
                    l.b();
                }
                paint.setShader(new LinearGradient(f2, height, f3, rectF4.height() / 2.0f, this.f132922h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.f132921g == f132915a) {
            RectF rectF5 = this.f132920f;
            if (rectF5 == null) {
                l.b();
            }
            int i2 = this.f132923i;
            canvas.drawRoundRect(rectF5, (float) i2, (float) i2, this.f132918d);
            RectF rectF6 = this.f132920f;
            if (rectF6 == null) {
                l.b();
            }
            int i3 = this.f132923i;
            canvas.drawRoundRect(rectF6, (float) i3, (float) i3, this.f132919e);
            return;
        }
        RectF rectF7 = this.f132920f;
        if (rectF7 == null) {
            l.b();
        }
        float centerX = rectF7.centerX();
        RectF rectF8 = this.f132920f;
        if (rectF8 == null) {
            l.b();
        }
        float centerY = rectF8.centerY();
        RectF rectF9 = this.f132920f;
        if (rectF9 == null) {
            l.b();
        }
        float width = rectF9.width();
        RectF rectF10 = this.f132920f;
        if (rectF10 == null) {
            l.b();
        }
        canvas.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / 2.0f, this.f132918d);
        RectF rectF11 = this.f132920f;
        if (rectF11 == null) {
            l.b();
        }
        float centerX2 = rectF11.centerX();
        RectF rectF12 = this.f132920f;
        if (rectF12 == null) {
            l.b();
        }
        float centerY2 = rectF12.centerY();
        RectF rectF13 = this.f132920f;
        if (rectF13 == null) {
            l.b();
        }
        float width2 = rectF13.width();
        RectF rectF14 = this.f132920f;
        if (rectF14 == null) {
            l.b();
        }
        canvas.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / 2.0f, this.f132919e);
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        int i6 = this.f132925k;
        int i7 = this.f132926l;
        int i8 = this.f132927m;
        this.f132920f = new RectF((float) ((i2 + i6) - i7), (float) ((i3 + i6) - i8), (float) ((i4 - i6) - i7), (float) ((i5 - i6) - i8));
    }

    private i(int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7) {
        this.f132921g = i2;
        this.f132922h = iArr;
        this.f132923i = i3;
        this.f132924j = i4;
        this.f132925k = i5;
        this.f132926l = i6;
        this.f132927m = i7;
        Paint paint = new Paint();
        this.f132918d = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer((float) i5, (float) i6, (float) i7, i4);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f132919e = paint2;
        paint2.setAntiAlias(true);
    }

    public /* synthetic */ i(int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7, byte b2) {
        this(i2, iArr, i3, i4, i5, i6, i7);
    }
}
