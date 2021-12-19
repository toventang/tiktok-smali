package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.android.live.design.widget.b.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

public final class a<T extends View> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    float f9601a;

    /* renamed from: b  reason: collision with root package name */
    ColorStateList f9602b;

    /* renamed from: c  reason: collision with root package name */
    float f9603c;

    /* renamed from: d  reason: collision with root package name */
    float f9604d;

    /* renamed from: e  reason: collision with root package name */
    float f9605e;

    /* renamed from: f  reason: collision with root package name */
    float f9606f;

    /* renamed from: g  reason: collision with root package name */
    float f9607g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9608i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9609j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9610k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9611l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9612m;
    private final float[] n = new float[8];
    private final Path o;
    private final Path p;
    private final Paint q;
    private final Paint r;
    private final RectF s;
    private boolean t;
    private int[] u;
    private float[] v;
    private final Paint w;
    private int x;

    static {
        Covode.recordClassIndex(4873);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        d();
        c();
        this.f9590h.invalidate();
    }

    private void c() {
        float f2;
        float width;
        if (this.f9590h.getWidth() > 0 && this.f9590h.getHeight() > 0) {
            boolean z = true;
            if (v.e(this.f9590h) != 1) {
                z = false;
            }
            if (this.u == null) {
                this.w.setShader(null);
            } else if (this.x == 0) {
                Paint paint = this.w;
                if (z) {
                    f2 = (float) this.f9590h.getWidth();
                } else {
                    f2 = 0.0f;
                }
                if (z) {
                    width = 0.0f;
                } else {
                    width = (float) this.f9590h.getWidth();
                }
                paint.setShader(new LinearGradient(f2, 0.0f, width, 0.0f, this.u, this.v, Shader.TileMode.CLAMP));
            } else {
                this.w.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f9590h.getHeight(), this.u, this.v, Shader.TileMode.CLAMP));
            }
        }
    }

    private void d() {
        boolean z;
        if (this.f9590h.getWidth() > 0 && this.f9590h.getHeight() > 0) {
            if (v.e(this.f9590h) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.o.reset();
            this.p.reset();
            this.t = false;
            float width = (float) this.f9590h.getWidth();
            float height = (float) this.f9590h.getHeight();
            this.s.set(0.0f, 0.0f, width, height);
            Arrays.fill(this.n, 0.0f);
            float min = Math.min(width, height) / 2.0f;
            float f2 = this.f9603c;
            if (f2 > 0.0f) {
                float[] fArr = this.n;
                fArr[7] = f2;
                fArr[6] = f2;
                fArr[5] = f2;
                fArr[4] = f2;
                fArr[3] = f2;
                fArr[2] = f2;
                fArr[1] = f2;
                fArr[0] = f2;
                this.t = true;
            }
            float f3 = this.f9604d;
            if (f3 > 0.0f) {
                if (!z) {
                    float[] fArr2 = this.n;
                    fArr2[1] = f3;
                    fArr2[0] = f3;
                } else {
                    float[] fArr3 = this.n;
                    fArr3[3] = f3;
                    fArr3[2] = f3;
                }
                this.t = true;
            }
            float f4 = this.f9605e;
            if (f4 > 0.0f) {
                if (!z) {
                    float[] fArr4 = this.n;
                    fArr4[3] = f4;
                    fArr4[2] = f4;
                } else {
                    float[] fArr5 = this.n;
                    fArr5[1] = f4;
                    fArr5[0] = f4;
                }
                this.t = true;
            }
            float f5 = this.f9606f;
            if (f5 > 0.0f) {
                if (!z) {
                    float[] fArr6 = this.n;
                    fArr6[7] = f5;
                    fArr6[6] = f5;
                } else {
                    float[] fArr7 = this.n;
                    fArr7[5] = f5;
                    fArr7[4] = f5;
                }
                this.t = true;
            }
            float f6 = this.f9607g;
            if (f6 > 0.0f) {
                if (!z) {
                    float[] fArr8 = this.n;
                    fArr8[5] = f6;
                    fArr8[4] = f6;
                } else {
                    float[] fArr9 = this.n;
                    fArr9[7] = f6;
                    fArr9[6] = f6;
                }
                this.t = true;
            }
            if (this.f9608i) {
                Arrays.fill(this.n, min);
                this.t = true;
            }
            if (this.f9609j) {
                if (!z) {
                    float[] fArr10 = this.n;
                    fArr10[1] = min;
                    fArr10[0] = min;
                } else {
                    float[] fArr11 = this.n;
                    fArr11[3] = min;
                    fArr11[2] = min;
                }
                this.t = true;
            }
            if (this.f9610k) {
                if (!z) {
                    float[] fArr12 = this.n;
                    fArr12[3] = min;
                    fArr12[2] = min;
                } else {
                    float[] fArr13 = this.n;
                    fArr13[1] = min;
                    fArr13[0] = min;
                }
                this.t = true;
            }
            if (this.f9611l) {
                if (!z) {
                    float[] fArr14 = this.n;
                    fArr14[7] = min;
                    fArr14[6] = min;
                } else {
                    float[] fArr15 = this.n;
                    fArr15[5] = min;
                    fArr15[4] = min;
                }
                this.t = true;
            }
            if (this.f9612m) {
                if (!z) {
                    float[] fArr16 = this.n;
                    fArr16[5] = min;
                    fArr16[4] = min;
                } else {
                    float[] fArr17 = this.n;
                    fArr17[7] = min;
                    fArr17[6] = min;
                }
                this.t = true;
            }
            if (this.t) {
                this.o.addRoundRect(this.s, this.n, Path.Direction.CW);
            }
            this.p.addRoundRect(this.s, this.n, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{16843165, 16843166, 16843275, R.attr.ks, R.attr.kt, R.attr.kw, R.attr.kx, R.attr.np, R.attr.v5, R.attr.v6, R.attr.v7, R.attr.a8p, R.attr.afn, R.attr.afo, R.attr.ajs, R.attr.ajt, R.attr.ajw, R.attr.ajx};
    }

    public final void e(int i2) {
        f(i2);
    }

    public final void a(float f2) {
        this.f9601a = f2;
        this.f9590h.invalidate();
    }

    public final void a(int i2) {
        this.f9602b = ColorStateList.valueOf(i2);
        this.f9590h.invalidate();
    }

    public final void c(float f2) {
        this.f9604d = f2;
        d();
        this.f9590h.invalidate();
    }

    public final void d(float f2) {
        this.f9605e = f2;
        d();
        this.f9590h.invalidate();
    }

    public final void e(float f2) {
        this.f9606f = f2;
        d();
        this.f9590h.invalidate();
    }

    public final void f(float f2) {
        this.f9607g = f2;
        d();
        this.f9590h.invalidate();
    }

    public final void a(ColorStateList colorStateList) {
        this.f9602b = colorStateList;
        this.f9590h.invalidate();
    }

    public final void b(float f2) {
        this.f9603c = f2;
        d();
        this.f9590h.invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void c(Canvas canvas) {
        if (this.t) {
            canvas.drawPath(this.o, this.q);
            canvas.restore();
        }
    }

    public final void d(int i2) {
        this.x = i2;
        c();
        this.f9590h.invalidate();
    }

    public final void e(boolean z) {
        this.f9612m = z;
        d();
        this.f9590h.invalidate();
    }

    public final void a(boolean z) {
        this.f9608i = z;
        d();
        this.f9590h.invalidate();
    }

    public final void b(int i2) {
        if (i2 != 0) {
            TypedArray obtainTypedArray = this.f9590h.getContext().getResources().obtainTypedArray(i2);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = obtainTypedArray.getColor(i3, -16777216);
            }
            a(iArr);
            obtainTypedArray.recycle();
        }
    }

    public final void c(int i2) {
        if (i2 != 0) {
            TypedArray obtainTypedArray = this.f9590h.getContext().getResources().obtainTypedArray(i2);
            int length = obtainTypedArray.length();
            float[] fArr = new float[length];
            for (int i3 = 0; i3 < length; i3++) {
                fArr[i3] = obtainTypedArray.getFloat(i3, 0.0f);
            }
            a(fArr);
            obtainTypedArray.recycle();
        }
    }

    public final void d(boolean z) {
        this.f9611l = z;
        d();
        this.f9590h.invalidate();
    }

    public a(T t2) {
        super(t2);
        Path path = new Path();
        this.o = path;
        Path path2 = new Path();
        this.p = path2;
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = 0;
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        path2.setFillType(Path.FillType.WINDING);
        paint2.setStyle(Paint.Style.STROKE);
        t2.setWillNotDraw(false);
    }

    /* access modifiers changed from: package-private */
    public final void a(Canvas canvas) {
        ColorStateList colorStateList;
        int colorForState;
        if (this.u != null) {
            canvas.drawRect(0.0f, 0.0f, (float) this.f9590h.getWidth(), (float) this.f9590h.getHeight(), this.w);
        }
        if (this.f9601a > 0.0f && (colorStateList = this.f9602b) != null && (colorForState = colorStateList.getColorForState(this.f9590h.getDrawableState(), 0)) != 0) {
            this.r.setStrokeWidth(this.f9601a * 2.0f);
            this.r.setColor(colorForState);
            canvas.drawPath(this.p, this.r);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Canvas canvas) {
        if (!this.t) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.saveLayer(0.0f, 0.0f, (float) this.f9590h.getWidth(), (float) this.f9590h.getHeight(), null);
        } else {
            canvas.saveLayer(0.0f, 0.0f, (float) this.f9590h.getWidth(), (float) this.f9590h.getHeight(), null, 31);
        }
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        this.f9608i = typedArray.getBoolean(7, this.f9608i);
        this.f9609j = typedArray.getBoolean(14, this.f9609j);
        this.f9610k = typedArray.getBoolean(16, this.f9610k);
        this.f9611l = typedArray.getBoolean(3, this.f9611l);
        this.f9612m = typedArray.getBoolean(5, this.f9612m);
        this.f9603c = typedArray.getDimension(11, this.f9603c);
        this.f9604d = typedArray.getDimension(15, this.f9604d);
        this.f9605e = typedArray.getDimension(17, this.f9605e);
        this.f9606f = typedArray.getDimension(4, this.f9606f);
        this.f9607g = typedArray.getDimension(6, this.f9607g);
        int resourceId = typedArray.getResourceId(12, 0);
        if (resourceId != 0) {
            this.f9602b = androidx.appcompat.a.a.a.a(this.f9590h.getContext(), resourceId);
        } else if (typedArray.hasValue(12)) {
            this.f9602b = typedArray.getColorStateList(12);
        }
        this.f9601a = typedArray.getDimension(13, this.f9601a);
        this.u = null;
        this.v = null;
        if (typedArray.hasValue(0) && typedArray.hasValue(1)) {
            int color = typedArray.getColor(0, 0);
            int color2 = typedArray.getColor(1, 0);
            if (typedArray.hasValue(2)) {
                this.u = new int[]{color, typedArray.getColor(2, 0), color2};
            } else {
                this.u = new int[]{color, color2};
            }
        } else if (typedArray.hasValue(8)) {
            b(typedArray.getResourceId(8, 0));
        }
        if (typedArray.hasValue(10)) {
            c(typedArray.getResourceId(10, 0));
        }
        this.x = typedArray.getInt(9, this.x);
        d();
        c();
    }

    public final void b(boolean z) {
        this.f9609j = z;
        d();
        this.f9590h.invalidate();
    }

    public final void c(boolean z) {
        this.f9610k = z;
        d();
        this.f9590h.invalidate();
    }

    public final void a(float[] fArr) {
        this.v = fArr;
        c();
        this.f9590h.invalidate();
    }

    public final void a(int[] iArr) {
        if (iArr == null || iArr.length >= 2) {
            this.u = iArr;
            c();
            this.f9590h.invalidate();
        }
    }
}
