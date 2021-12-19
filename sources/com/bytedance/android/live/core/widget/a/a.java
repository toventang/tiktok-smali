package com.bytedance.android.live.core.widget.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class a extends LinearLayout {

    /* renamed from: i  reason: collision with root package name */
    public static int f9306i;

    /* renamed from: j  reason: collision with root package name */
    public static int f9307j;

    /* renamed from: k  reason: collision with root package name */
    public static float f9308k;

    /* renamed from: l  reason: collision with root package name */
    public static float f9309l;

    /* renamed from: m  reason: collision with root package name */
    public static float f9310m;
    public static int n;
    public static int o;
    public static final C0137a p = new C0137a((byte) 0);
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;

    /* renamed from: a  reason: collision with root package name */
    public Paint f9311a;

    /* renamed from: b  reason: collision with root package name */
    public Path f9312b;

    /* renamed from: c  reason: collision with root package name */
    public Path f9313c;

    /* renamed from: d  reason: collision with root package name */
    public Path f9314d;

    /* renamed from: e  reason: collision with root package name */
    public RectF f9315e;

    /* renamed from: f  reason: collision with root package name */
    public Matrix f9316f;

    /* renamed from: g  reason: collision with root package name */
    float f9317g;

    /* renamed from: h  reason: collision with root package name */
    int f9318h;
    private float q;
    private RectF r;
    private float s;
    private float t;
    private int u;
    private Bitmap v;
    private Canvas w;
    private int x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(4750);
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.a$a  reason: collision with other inner class name */
    public static final class C0137a {
        static {
            Covode.recordClassIndex(4751);
        }

        private C0137a() {
        }

        public /* synthetic */ C0137a(byte b2) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.x;
    }

    public final int getMBorderColor() {
        return this.y;
    }

    public final int getMBorderWidth() {
        return this.u;
    }

    public final float getMHeight() {
        return this.t;
    }

    public final boolean getMNeedAddColor() {
        return this.E;
    }

    public final boolean getMNeedArrow() {
        return this.D;
    }

    public final boolean getMNeedPath() {
        return this.B;
    }

    public final boolean getMNeedPressFade() {
        return this.C;
    }

    public final boolean getMNeedShadow() {
        return this.A;
    }

    public final float getMPadding() {
        return this.q;
    }

    public final int getMShadowColor() {
        return this.z;
    }

    public final float getMWidth() {
        return this.s;
    }

    public final boolean getUseDefaultView() {
        return this.F;
    }

    public final int getPADDING() {
        return f9306i / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f9314d;
        if (path == null) {
            l.a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f9316f;
        if (matrix == null) {
            l.a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f9315e;
        if (rectF == null) {
            l.a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f9313c;
        if (path == null) {
            l.a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f9311a;
        if (paint == null) {
            l.a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f9312b;
        if (path == null) {
            l.a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f9317g, f9310m);
        int i2 = this.f9318h;
        if (i2 == 0) {
            return Math.min(max, this.s - f9310m);
        }
        if (i2 == 1) {
            return Math.min(max, this.t - f9310m);
        }
        if (i2 == 2) {
            return Math.min(max, this.t - f9310m);
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return Math.min(max, this.s - f9310m);
    }

    public final void setBubbleOrientation(int i2) {
        this.f9318h = i2;
    }

    public final void setMBgColor(int i2) {
        this.x = i2;
    }

    public final void setMBorderColor(int i2) {
        this.y = i2;
    }

    public final void setMBorderWidth(int i2) {
        this.u = i2;
    }

    public final void setMHeight(float f2) {
        this.t = f2;
    }

    public final void setMNeedAddColor(boolean z2) {
        this.E = z2;
    }

    public final void setMNeedArrow(boolean z2) {
        this.D = z2;
    }

    public final void setMNeedPath(boolean z2) {
        this.B = z2;
    }

    public final void setMNeedPressFade(boolean z2) {
        this.C = z2;
    }

    public final void setMNeedShadow(boolean z2) {
        this.A = z2;
    }

    public final void setMPadding(float f2) {
        this.q = f2;
    }

    public final void setMShadowColor(int i2) {
        this.z = i2;
    }

    public final void setMWidth(float f2) {
        this.s = f2;
    }

    public final void setNeedAddColor(boolean z2) {
        this.E = z2;
    }

    public final void setUseDefaultView(boolean z2) {
        this.F = z2;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        l.d(path, "");
        this.f9314d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        l.d(matrix, "");
        this.f9316f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        l.d(rectF, "");
        this.f9315e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        l.d(path, "");
        this.f9313c = path;
    }

    public final void setMFillPaint(Paint paint) {
        l.d(paint, "");
        this.f9311a = paint;
    }

    public final void setMPath(Path path) {
        l.d(path, "");
        this.f9312b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(10176);
        l.d(canvas, "");
        if (this.v == null) {
            this.v = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.v;
            if (bitmap == null) {
                l.b();
            }
            this.w = new Canvas(bitmap);
        }
        float f2 = this.s;
        float f3 = this.t;
        float max = Math.max(this.f9317g, f9310m);
        Matrix matrix = new Matrix();
        this.f9316f = new Matrix();
        int i2 = this.f9318h;
        if (i2 == 0) {
            float min = Math.min(max, f2 - f9310m);
            matrix.postRotate(90.0f);
            Matrix matrix2 = this.f9316f;
            if (matrix2 == null) {
                l.a("mBorderMatrix");
            }
            matrix2.postRotate(90.0f);
            Matrix matrix3 = this.f9316f;
            if (matrix3 == null) {
                l.a("mBorderMatrix");
            }
            int i3 = this.u;
            matrix3.postTranslate((((float) ((i3 * 3) / 2)) + min) - ((float) ((f9306i * 3) / 2)), ((float) i3) + 0.0f);
            setPadding(0, f9306i, 0, 0);
            setGravity(17);
            this.r = new RectF(0.0f, (float) f9306i, this.s, this.t);
            int i4 = this.u;
            matrix.postTranslate((min + ((float) ((i4 * 3) / 2))) - ((float) ((f9306i * 3) / 2)), ((float) ((i4 * 3) / 2)) + 0.0f);
        } else if (i2 == 1) {
            float min2 = Math.min(max, f3 - f9310m);
            setPadding(f9306i, 0, 0, 0);
            setGravity(17);
            Matrix matrix4 = this.f9316f;
            if (matrix4 == null) {
                l.a("mBorderMatrix");
            }
            int i5 = this.u;
            matrix4.postTranslate(((float) i5) + 0.0f, (((float) (i5 * 2)) + min2) - ((float) ((f9306i * 3) / 2)));
            this.r = new RectF((float) f9306i, 0.0f, this.s, this.t);
            int i6 = this.u;
            matrix.postTranslate(((float) ((i6 * 3) / 2)) + 0.0f, (min2 + ((float) (i6 * 2))) - ((float) ((f9306i * 3) / 2)));
        } else if (i2 == 2) {
            float min3 = Math.min(max, f3 - f9310m);
            matrix.postRotate(180.0f);
            Matrix matrix5 = this.f9316f;
            if (matrix5 == null) {
                l.a("mBorderMatrix");
            }
            matrix5.postRotate(180.0f);
            Matrix matrix6 = this.f9316f;
            if (matrix6 == null) {
                l.a("mBorderMatrix");
            }
            int i7 = this.u;
            matrix6.postTranslate(((float) (i7 * 2)) + f2, (((float) (i7 * 2)) + min3) - ((float) ((f9306i * 3) / 2)));
            setPadding(0, 0, f9306i, 0);
            setGravity(17);
            this.r = new RectF(0.0f, 0.0f, this.s - ((float) f9306i), this.t);
            int i8 = this.u;
            matrix.postTranslate(f2 + ((float) ((i8 * 3) / 2)), (min3 + ((float) (i8 * 2))) - ((float) ((f9306i * 3) / 2)));
        } else if (i2 == 3) {
            float min4 = Math.min(max, f2 - f9310m);
            matrix.postRotate(270.0f);
            Matrix matrix7 = this.f9316f;
            if (matrix7 == null) {
                l.a("mBorderMatrix");
            }
            matrix7.postRotate(270.0f);
            Matrix matrix8 = this.f9316f;
            if (matrix8 == null) {
                l.a("mBorderMatrix");
            }
            int i9 = this.u;
            matrix8.postTranslate((((float) ((i9 * 3) / 2)) + min4) - ((float) ((f9306i * 3) / 2)), ((float) (i9 * 2)) + f3);
            setPadding(0, 0, 0, f9306i);
            setGravity(17);
            this.r = new RectF(0.0f, 0.0f, this.s, this.t - ((float) f9306i));
            int i10 = this.u;
            matrix.postTranslate((min4 + ((float) ((i10 * 3) / 2))) - ((float) ((f9306i * 3) / 2)), f3 + ((float) ((i10 * 3) / 2)));
        }
        RectF rectF = this.r;
        if (rectF == null) {
            l.a("mRoundRect");
        }
        rectF.left += (float) ((this.u * 3) / 2);
        RectF rectF2 = this.r;
        if (rectF2 == null) {
            l.a("mRoundRect");
        }
        rectF2.top += (float) ((this.u * 3) / 2);
        RectF rectF3 = this.r;
        if (rectF3 == null) {
            l.a("mRoundRect");
        }
        rectF3.right += (float) ((this.u * 3) / 2);
        RectF rectF4 = this.r;
        if (rectF4 == null) {
            l.a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.u * 3) / 2);
        RectF rectF5 = new RectF();
        this.f9315e = rectF5;
        RectF rectF6 = this.r;
        if (rectF6 == null) {
            l.a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.u / 2));
        RectF rectF7 = this.f9315e;
        if (rectF7 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF8 = this.r;
        if (rectF8 == null) {
            l.a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.u / 2));
        RectF rectF9 = this.f9315e;
        if (rectF9 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF10 = this.r;
        if (rectF10 == null) {
            l.a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.u / 2));
        RectF rectF11 = this.f9315e;
        if (rectF11 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF12 = this.r;
        if (rectF12 == null) {
            l.a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.u / 2));
        if (this.A) {
            Paint paint = this.f9311a;
            if (paint == null) {
                l.a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.z);
        }
        if (this.B) {
            Paint paint2 = this.f9311a;
            if (paint2 == null) {
                l.a("mFillPaint");
            }
            paint2.setColor(this.y);
            Paint paint3 = this.f9311a;
            if (paint3 == null) {
                l.a("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f9311a;
            if (paint4 == null) {
                l.a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.u);
            Path path = this.f9312b;
            if (path == null) {
                l.a("mPath");
            }
            path.reset();
            Path path2 = this.f9312b;
            if (path2 == null) {
                l.a("mPath");
            }
            RectF rectF13 = this.f9315e;
            if (rectF13 == null) {
                l.a("mBorderRoundRect");
            }
            float f4 = f9309l;
            int i11 = this.u;
            path2.addRoundRect(rectF13, ((float) (i11 / 2)) + f4, f4 + ((float) (i11 / 2)), Path.Direction.CW);
            if (this.D) {
                Path path3 = this.f9312b;
                if (path3 == null) {
                    l.a("mPath");
                }
                Path path4 = this.f9314d;
                if (path4 == null) {
                    l.a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f9316f;
                if (matrix9 == null) {
                    l.a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.w;
            if (canvas2 == null) {
                l.a("mCanvas");
            }
            Path path5 = this.f9312b;
            if (path5 == null) {
                l.a("mPath");
            }
            Paint paint5 = this.f9311a;
            if (paint5 == null) {
                l.a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.E) {
                Paint paint6 = this.f9311a;
                if (paint6 == null) {
                    l.a("mFillPaint");
                }
                paint6.setColor(getResources().getColor(R.color.a1z));
                Paint paint7 = this.f9311a;
                if (paint7 == null) {
                    l.a("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f9312b;
                if (path6 == null) {
                    l.a("mPath");
                }
                path6.reset();
                if (this.D) {
                    Path path7 = this.f9312b;
                    if (path7 == null) {
                        l.a("mPath");
                    }
                    Path path8 = this.f9314d;
                    if (path8 == null) {
                        l.a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f9316f;
                    if (matrix10 == null) {
                        l.a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f9312b;
                if (path9 == null) {
                    l.a("mPath");
                }
                RectF rectF14 = this.f9315e;
                if (rectF14 == null) {
                    l.a("mBorderRoundRect");
                }
                float f5 = f9309l;
                int i12 = this.u;
                path9.addRoundRect(rectF14, ((float) (i12 / 2)) + f5, f5 + ((float) (i12 / 2)), Path.Direction.CW);
                Canvas canvas3 = this.w;
                if (canvas3 == null) {
                    l.a("mCanvas");
                }
                Path path10 = this.f9312b;
                if (path10 == null) {
                    l.a("mPath");
                }
                Paint paint8 = this.f9311a;
                if (paint8 == null) {
                    l.a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f9311a;
        if (paint9 == null) {
            l.a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f9311a;
        if (paint10 == null) {
            l.a("mFillPaint");
        }
        paint10.setColor(this.x);
        Paint paint11 = this.f9311a;
        if (paint11 == null) {
            l.a("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f9312b;
        if (path11 == null) {
            l.a("mPath");
        }
        path11.reset();
        Path path12 = this.f9312b;
        if (path12 == null) {
            l.a("mPath");
        }
        RectF rectF15 = this.r;
        if (rectF15 == null) {
            l.a("mRoundRect");
        }
        float f6 = f9309l;
        path12.addRoundRect(rectF15, f6, f6, Path.Direction.CW);
        if (this.D) {
            Path path13 = this.f9312b;
            if (path13 == null) {
                l.a("mPath");
            }
            Path path14 = this.f9313c;
            if (path14 == null) {
                l.a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.w;
        if (canvas4 == null) {
            l.a("mCanvas");
        }
        Path path15 = this.f9312b;
        if (path15 == null) {
            l.a("mPath");
        }
        Paint paint12 = this.f9311a;
        if (paint12 == null) {
            l.a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f9311a;
        if (paint13 == null) {
            l.a("mFillPaint");
        }
        paint13.setXfermode(null);
        Bitmap bitmap2 = this.v;
        if (bitmap2 == null) {
            l.b();
        }
        canvas.drawBitmap(bitmap2, ((float) f9306i) - n.b(getContext(), 1.4f), ((float) f9306i) - n.b(getContext(), 1.3f), (Paint) null);
        MethodCollector.o(10176);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private a(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10341);
        this.q = 12.0f;
        this.z = -16777216;
        this.f9317g = 0.75f;
        this.f9318h = 1;
        this.B = true;
        this.D = true;
        this.E = true;
        this.F = true;
        l.d(context, "");
        this.u = (int) n.b(context, 0.7f);
        f9306i = (int) n.b(context, 7.0f);
        f9308k = 2.0f;
        f9309l = n.b(context, 8.0f);
        f9310m = n.b(context, 3.0f);
        n = (int) n.b(context, 40.0f);
        o = (int) n.b(context, 56.0f);
        this.f9311a = new Paint();
        this.f9312b = new Path();
        this.f9314d = new Path();
        this.f9313c = new Path();
        Paint paint = this.f9311a;
        if (paint == null) {
            l.a("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f9311a;
        if (paint2 == null) {
            l.a("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f9311a;
        if (paint3 == null) {
            l.a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f9311a;
        if (paint4 == null) {
            l.a("mFillPaint");
        }
        paint4.setStrokeWidth(f9308k);
        Paint paint5 = this.f9311a;
        if (paint5 == null) {
            l.a("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.x = getResources().getColor(R.color.a1x);
        this.y = getResources().getColor(R.color.a18);
        Paint paint6 = this.f9311a;
        if (paint6 == null) {
            l.a("mFillPaint");
        }
        paint6.setColor(this.x);
        Paint paint7 = this.f9311a;
        if (paint7 == null) {
            l.a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.A) {
            Paint paint8 = this.f9311a;
            if (paint8 == null) {
                l.a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.z);
        }
        Path path = this.f9313c;
        if (path == null) {
            l.a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f9313c;
        if (path2 == null) {
            l.a("mBubbleArrowPath");
        }
        int i2 = f9306i;
        path2.lineTo((float) i2, (float) (-i2));
        Path path3 = this.f9313c;
        if (path3 == null) {
            l.a("mBubbleArrowPath");
        }
        int i3 = f9306i;
        path3.lineTo((float) i3, (float) i3);
        Path path4 = this.f9313c;
        if (path4 == null) {
            l.a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f9314d;
        if (path5 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f9314d;
        if (path6 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        double d2 = (double) f9306i;
        double d3 = (double) this.u;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d3);
        Double.isNaN(d2);
        float f2 = (float) (d2 + (d3 * sqrt));
        double d4 = (double) (-f9306i);
        double d5 = (double) this.u;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        Double.isNaN(d4);
        path6.lineTo(f2, (float) (d4 - (d5 * sqrt2)));
        Path path7 = this.f9314d;
        if (path7 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        double d6 = (double) f9306i;
        double d7 = (double) this.u;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        Double.isNaN(d6);
        float f3 = (float) (d6 + (d7 * sqrt3));
        double d8 = (double) f9306i;
        double d9 = (double) this.u;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        Double.isNaN(d8);
        path7.lineTo(f3, (float) (d8 + (d9 * sqrt4)));
        Path path8 = this.f9314d;
        if (path8 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.o(10341);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        TextView textView;
        int measuredWidth;
        char c2;
        int measuredWidth2;
        int measuredHeight;
        int measureText;
        MethodCollector.i(10172);
        super.onMeasure(i2, i3);
        f9307j = (int) n.b(getContext(), this.q + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(10172);
                throw nullPointerException;
            }
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (textView != null) {
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > n.b(getContext(), 197.0f)) {
                measureText = (int) n.b(getContext(), 197.0f);
                String obj = textView.getText().toString();
                if (p.e((CharSequence) obj, (CharSequence) "\n")) {
                    TextPaint paint = textView.getPaint();
                    int a2 = p.a((CharSequence) obj, "\n", 0, false, 6);
                    if (obj != null) {
                        String substring = obj.substring(0, a2);
                        l.b(substring, "");
                        int measureText2 = (int) paint.measureText(substring);
                        if (measureText2 < measureText) {
                            measureText = measureText2;
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.o(10172);
                        throw nullPointerException2;
                    }
                }
                c2 = 2;
            } else {
                measureText = (int) textView.getPaint().measureText(textView.getText().toString());
                c2 = 1;
            }
            measuredWidth = measureText + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
            c2 = 0;
        }
        if (this.F) {
            int i4 = this.f9318h;
            if (i4 == 2 || i4 == 1) {
                int i5 = n;
                if (measuredWidth > i5) {
                    i5 = (f9307j * 2) + measuredWidth;
                }
                measuredWidth2 = i5 + f9306i;
            } else {
                measuredWidth2 = n;
                if (measuredWidth > measuredWidth2) {
                    measuredWidth2 = (f9307j * 2) + measuredWidth;
                }
            }
            if (c2 == 1) {
                measuredHeight = o;
            } else {
                measuredHeight = o + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            l.b(contentView, "");
            measuredWidth2 = contentView.getMeasuredWidth() + (f9306i * 3) + f9307j;
            View contentView2 = popupWindow.getContentView();
            l.b(contentView2, "");
            measuredHeight = contentView2.getMeasuredHeight() + (f9306i * 3) + f9307j;
        }
        int i6 = this.u;
        int i7 = measuredWidth2 + (i6 * 3);
        int i8 = measuredHeight + (i6 * 3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i7, i8);
            }
            setMeasuredDimension(i7, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i8);
                }
            }
            setMeasuredDimension(i7, size2);
        }
        this.s = (float) (getMeasuredWidth() - (f9306i * 2));
        this.t = (float) (getMeasuredHeight() - (f9306i * 2));
        MethodCollector.o(10172);
    }
}
