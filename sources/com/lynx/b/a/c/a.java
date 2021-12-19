package com.lynx.b.a.c;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a.e;
import com.lynx.b.a.a.i;
import com.lynx.b.a.b.c;
import com.lynx.b.a.h.b;
import com.zhiliaoapp.musically.R;

public final class a extends com.lynx.b.a.f.a implements e {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f55153a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f55154b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f55155c;

    /* renamed from: d  reason: collision with root package name */
    protected int f55156d;

    /* renamed from: e  reason: collision with root package name */
    protected int f55157e;

    /* renamed from: f  reason: collision with root package name */
    protected float f55158f;

    /* renamed from: g  reason: collision with root package name */
    protected long f55159g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f55160h;

    /* renamed from: i  reason: collision with root package name */
    protected TimeInterpolator f55161i;

    static {
        Covode.recordClassIndex(34596);
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    private a a(int i2) {
        this.f55156d = i2;
        this.f55153a = true;
        if (!this.f55160h) {
            this.f55155c.setColor(i2);
        }
        return this;
    }

    private a b(int i2) {
        this.f55157e = i2;
        this.f55154b = true;
        if (this.f55160h) {
            this.f55155c.setColor(i2);
        }
        return this;
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void setPrimaryColors(int... iArr) {
        if (!this.f55154b && iArr.length > 1) {
            b(iArr[0]);
            this.f55154b = false;
        }
        if (!this.f55153a) {
            if (iArr.length > 1) {
                a(iArr[1]);
            } else if (iArr.length > 0) {
                a(androidx.core.graphics.a.a(-1711276033, iArr[0]));
            }
            this.f55153a = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        float f2;
        int width = getWidth();
        int height = getHeight();
        float f3 = this.f55158f;
        float min = (((float) Math.min(width, height)) - (f3 * 2.0f)) / 6.0f;
        float f4 = min * 2.0f;
        float f5 = (((float) width) / 2.0f) - (f3 + f4);
        float f6 = ((float) height) / 2.0f;
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        do {
            int i3 = i2 + 1;
            long j2 = (currentTimeMillis - this.f55159g) - ((long) (i3 * 120));
            if (j2 > 0) {
                f2 = ((float) (j2 % 750)) / 750.0f;
            } else {
                f2 = 0.0f;
            }
            float interpolation = this.f55161i.getInterpolation(f2);
            canvas.save();
            float f7 = (float) i2;
            canvas.translate((f4 * f7) + f5 + (this.f55158f * f7), f6);
            if (((double) interpolation) < 0.5d) {
                float f8 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f8, f8);
            } else {
                float f9 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f9, f9);
            }
            canvas.drawCircle(0.0f, 0.0f, min, this.f55155c);
            canvas.restore();
            i2 = i3;
        } while (i2 < 3);
        super.dispatchDraw(canvas);
        if (this.f55160h) {
            invalidate();
        }
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final int a(i iVar, boolean z) {
        this.f55160h = false;
        this.f55159g = 0;
        this.f55155c.setColor(this.f55156d);
        return 0;
    }

    private a(Context context, byte b2) {
        super(context);
        this.f55156d = -1118482;
        this.f55157e = -1615546;
        this.f55161i = new AccelerateDecelerateInterpolator();
        setMinimumHeight(b.a(60.0f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ad7, R.attr.ad8, R.attr.aeh});
        Paint paint = new Paint();
        this.f55155c = paint;
        paint.setColor(-1);
        this.f55155c.setStyle(Paint.Style.FILL);
        this.f55155c.setAntiAlias(true);
        this.x = c.f55144a;
        this.x = c.f55149f[obtainStyledAttributes.getInt(1, this.x.f55150g)];
        if (obtainStyledAttributes.hasValue(2)) {
            a(obtainStyledAttributes.getColor(2, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            b(obtainStyledAttributes.getColor(0, 0));
        }
        obtainStyledAttributes.recycle();
        this.f55158f = (float) b.a(4.0f);
    }

    @Override // com.lynx.b.a.a.g, com.lynx.b.a.f.a
    public final void b(i iVar, int i2, int i3) {
        if (!this.f55160h) {
            invalidate();
            this.f55160h = true;
            this.f55159g = System.currentTimeMillis();
            this.f55155c.setColor(this.f55157e);
        }
    }
}
