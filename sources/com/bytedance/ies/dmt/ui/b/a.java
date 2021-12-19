package com.bytedance.ies.dmt.ui.b;

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
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    public static int f33291g;

    /* renamed from: h  reason: collision with root package name */
    public static int f33292h;

    /* renamed from: i  reason: collision with root package name */
    public static float f33293i;

    /* renamed from: j  reason: collision with root package name */
    public static float f33294j;

    /* renamed from: k  reason: collision with root package name */
    public static float f33295k;

    /* renamed from: l  reason: collision with root package name */
    public static int f33296l;

    /* renamed from: m  reason: collision with root package name */
    public static int f33297m;
    public static final C0727a n = new C0727a((byte) 0);
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private float G;

    /* renamed from: a  reason: collision with root package name */
    public Paint f33298a;

    /* renamed from: b  reason: collision with root package name */
    public Path f33299b;

    /* renamed from: c  reason: collision with root package name */
    public Path f33300c;

    /* renamed from: d  reason: collision with root package name */
    public Path f33301d;

    /* renamed from: e  reason: collision with root package name */
    public RectF f33302e;

    /* renamed from: f  reason: collision with root package name */
    public Matrix f33303f;
    private float o;
    private RectF p;
    private float q;
    private float r;
    private int s;
    private Bitmap t;
    private Canvas u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private float z;

    static {
        Covode.recordClassIndex(19888);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.a$a  reason: collision with other inner class name */
    public static final class C0727a {
        static {
            Covode.recordClassIndex(19889);
        }

        private C0727a() {
        }

        public /* synthetic */ C0727a(byte b2) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.v;
    }

    public final int getMBorderColor() {
        return this.w;
    }

    public final int getMBorderWidth() {
        return this.s;
    }

    public final float getMHeight() {
        return this.r;
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
        return this.y;
    }

    public final float getMPadding() {
        return this.o;
    }

    public final int getMShadowColor() {
        return this.x;
    }

    public final float getMTextViewMaxWidth() {
        return this.G;
    }

    public final float getMWidth() {
        return this.q;
    }

    public final boolean getUseDefaultView() {
        return this.F;
    }

    public final int getPADDING() {
        return f33291g / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f33301d;
        if (path == null) {
            l.a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f33303f;
        if (matrix == null) {
            l.a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f33302e;
        if (rectF == null) {
            l.a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f33300c;
        if (path == null) {
            l.a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f33298a;
        if (paint == null) {
            l.a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f33299b;
        if (path == null) {
            l.a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.z, f33295k);
        int i2 = this.A;
        if (i2 == 0) {
            return Math.min(max, this.q - f33295k);
        }
        if (i2 == 1) {
            return Math.min(max, this.r - f33295k);
        }
        if (i2 == 2) {
            return Math.min(max, this.r - f33295k);
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return Math.min(max, this.q - f33295k);
    }

    public final void setBubbleOrientation(int i2) {
        this.A = i2;
    }

    public final void setMBgColor(int i2) {
        this.v = i2;
    }

    public final void setMBorderColor(int i2) {
        this.w = i2;
    }

    public final void setMBorderWidth(int i2) {
        this.s = i2;
    }

    public final void setMHeight(float f2) {
        this.r = f2;
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
        this.y = z2;
    }

    public final void setMPadding(float f2) {
        this.o = f2;
    }

    public final void setMShadowColor(int i2) {
        this.x = i2;
    }

    public final void setMTextViewMaxWidth(float f2) {
        this.G = f2;
    }

    public final void setMWidth(float f2) {
        this.q = f2;
    }

    public final void setNeedAddColor(boolean z2) {
        this.E = z2;
    }

    public final void setUseDefaultView(boolean z2) {
        this.F = z2;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        l.d(path, "");
        this.f33301d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        l.d(matrix, "");
        this.f33303f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        l.d(rectF, "");
        this.f33302e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        l.d(path, "");
        this.f33300c = path;
    }

    public final void setMFillPaint(Paint paint) {
        l.d(paint, "");
        this.f33298a = paint;
    }

    public final void setMPath(Path path) {
        l.d(path, "");
        this.f33299b = path;
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
        MethodCollector.i(11580);
        l.d(canvas, "");
        if (this.t == null) {
            this.t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.t;
            if (bitmap == null) {
                l.b();
            }
            this.u = new Canvas(bitmap);
        }
        float f2 = this.q;
        float f3 = this.r;
        float max = Math.max(this.z, f33295k);
        Matrix matrix = new Matrix();
        this.f33303f = new Matrix();
        int i2 = this.A;
        if (i2 == 0) {
            float min = Math.min(max, f2 - f33295k);
            matrix.postRotate(90.0f);
            Matrix matrix2 = this.f33303f;
            if (matrix2 == null) {
                l.a("mBorderMatrix");
            }
            matrix2.postRotate(90.0f);
            Matrix matrix3 = this.f33303f;
            if (matrix3 == null) {
                l.a("mBorderMatrix");
            }
            int i3 = this.s;
            matrix3.postTranslate((((float) ((i3 * 3) / 2)) + min) - ((float) ((f33291g * 3) / 2)), ((float) i3) + 0.0f);
            setPadding(0, f33291g, 0, 0);
            setGravity(17);
            this.p = new RectF(0.0f, (float) f33291g, this.q, this.r);
            int i4 = this.s;
            matrix.postTranslate((min + ((float) ((i4 * 3) / 2))) - ((float) ((f33291g * 3) / 2)), ((float) ((i4 * 3) / 2)) + 0.0f);
        } else if (i2 == 1) {
            float min2 = Math.min(max, f3 - f33295k);
            setPadding(f33291g, 0, 0, 0);
            setGravity(17);
            Matrix matrix4 = this.f33303f;
            if (matrix4 == null) {
                l.a("mBorderMatrix");
            }
            int i5 = this.s;
            matrix4.postTranslate(((float) i5) + 0.0f, (((float) (i5 * 2)) + min2) - ((float) ((f33291g * 3) / 2)));
            this.p = new RectF((float) f33291g, 0.0f, this.q, this.r);
            int i6 = this.s;
            matrix.postTranslate(((float) ((i6 * 3) / 2)) + 0.0f, (min2 + ((float) (i6 * 2))) - ((float) ((f33291g * 3) / 2)));
        } else if (i2 == 2) {
            float min3 = Math.min(max, f3 - f33295k);
            matrix.postRotate(180.0f);
            Matrix matrix5 = this.f33303f;
            if (matrix5 == null) {
                l.a("mBorderMatrix");
            }
            matrix5.postRotate(180.0f);
            Matrix matrix6 = this.f33303f;
            if (matrix6 == null) {
                l.a("mBorderMatrix");
            }
            int i7 = this.s;
            matrix6.postTranslate(((float) (i7 * 2)) + f2, (((float) (i7 * 2)) + min3) - ((float) ((f33291g * 3) / 2)));
            setPadding(0, 0, f33291g, 0);
            setGravity(17);
            this.p = new RectF(0.0f, 0.0f, this.q - ((float) f33291g), this.r);
            int i8 = this.s;
            matrix.postTranslate(f2 + ((float) ((i8 * 3) / 2)), (min3 + ((float) (i8 * 2))) - ((float) ((f33291g * 3) / 2)));
        } else if (i2 == 3) {
            float min4 = Math.min(max, f2 - f33295k);
            matrix.postRotate(270.0f);
            Matrix matrix7 = this.f33303f;
            if (matrix7 == null) {
                l.a("mBorderMatrix");
            }
            matrix7.postRotate(270.0f);
            Matrix matrix8 = this.f33303f;
            if (matrix8 == null) {
                l.a("mBorderMatrix");
            }
            int i9 = this.s;
            matrix8.postTranslate((((float) ((i9 * 3) / 2)) + min4) - ((float) ((f33291g * 3) / 2)), ((float) (i9 * 2)) + f3);
            setPadding(0, 0, 0, f33291g);
            setGravity(17);
            this.p = new RectF(0.0f, 0.0f, this.q, this.r - ((float) f33291g));
            int i10 = this.s;
            matrix.postTranslate((min4 + ((float) ((i10 * 3) / 2))) - ((float) ((f33291g * 3) / 2)), f3 + ((float) ((i10 * 3) / 2)));
        }
        RectF rectF = this.p;
        if (rectF == null) {
            l.a("mRoundRect");
        }
        rectF.left += (float) ((this.s * 3) / 2);
        RectF rectF2 = this.p;
        if (rectF2 == null) {
            l.a("mRoundRect");
        }
        rectF2.top += (float) ((this.s * 3) / 2);
        RectF rectF3 = this.p;
        if (rectF3 == null) {
            l.a("mRoundRect");
        }
        rectF3.right += (float) ((this.s * 3) / 2);
        RectF rectF4 = this.p;
        if (rectF4 == null) {
            l.a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.s * 3) / 2);
        RectF rectF5 = new RectF();
        this.f33302e = rectF5;
        RectF rectF6 = this.p;
        if (rectF6 == null) {
            l.a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.s / 2));
        RectF rectF7 = this.f33302e;
        if (rectF7 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF8 = this.p;
        if (rectF8 == null) {
            l.a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.s / 2));
        RectF rectF9 = this.f33302e;
        if (rectF9 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF10 = this.p;
        if (rectF10 == null) {
            l.a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.s / 2));
        RectF rectF11 = this.f33302e;
        if (rectF11 == null) {
            l.a("mBorderRoundRect");
        }
        RectF rectF12 = this.p;
        if (rectF12 == null) {
            l.a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.s / 2));
        if (this.y) {
            Paint paint = this.f33298a;
            if (paint == null) {
                l.a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.x);
        }
        if (this.B) {
            Paint paint2 = this.f33298a;
            if (paint2 == null) {
                l.a("mFillPaint");
            }
            paint2.setColor(this.w);
            Paint paint3 = this.f33298a;
            if (paint3 == null) {
                l.a("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f33298a;
            if (paint4 == null) {
                l.a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.s);
            Path path = this.f33299b;
            if (path == null) {
                l.a("mPath");
            }
            path.reset();
            Path path2 = this.f33299b;
            if (path2 == null) {
                l.a("mPath");
            }
            RectF rectF13 = this.f33302e;
            if (rectF13 == null) {
                l.a("mBorderRoundRect");
            }
            float f4 = f33294j;
            int i11 = this.s;
            path2.addRoundRect(rectF13, ((float) (i11 / 2)) + f4, f4 + ((float) (i11 / 2)), Path.Direction.CW);
            if (this.D) {
                Path path3 = this.f33299b;
                if (path3 == null) {
                    l.a("mPath");
                }
                Path path4 = this.f33301d;
                if (path4 == null) {
                    l.a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f33303f;
                if (matrix9 == null) {
                    l.a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.u;
            if (canvas2 == null) {
                l.a("mCanvas");
            }
            Path path5 = this.f33299b;
            if (path5 == null) {
                l.a("mPath");
            }
            Paint paint5 = this.f33298a;
            if (paint5 == null) {
                l.a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.E) {
                Paint paint6 = this.f33298a;
                if (paint6 == null) {
                    l.a("mFillPaint");
                }
                paint6.setColor(b.c(getContext(), R.color.ae));
                Paint paint7 = this.f33298a;
                if (paint7 == null) {
                    l.a("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f33299b;
                if (path6 == null) {
                    l.a("mPath");
                }
                path6.reset();
                if (this.D) {
                    Path path7 = this.f33299b;
                    if (path7 == null) {
                        l.a("mPath");
                    }
                    Path path8 = this.f33301d;
                    if (path8 == null) {
                        l.a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f33303f;
                    if (matrix10 == null) {
                        l.a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f33299b;
                if (path9 == null) {
                    l.a("mPath");
                }
                RectF rectF14 = this.f33302e;
                if (rectF14 == null) {
                    l.a("mBorderRoundRect");
                }
                float f5 = f33294j;
                int i12 = this.s;
                path9.addRoundRect(rectF14, ((float) (i12 / 2)) + f5, f5 + ((float) (i12 / 2)), Path.Direction.CW);
                Canvas canvas3 = this.u;
                if (canvas3 == null) {
                    l.a("mCanvas");
                }
                Path path10 = this.f33299b;
                if (path10 == null) {
                    l.a("mPath");
                }
                Paint paint8 = this.f33298a;
                if (paint8 == null) {
                    l.a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f33298a;
        if (paint9 == null) {
            l.a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f33298a;
        if (paint10 == null) {
            l.a("mFillPaint");
        }
        paint10.setColor(this.v);
        Paint paint11 = this.f33298a;
        if (paint11 == null) {
            l.a("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f33299b;
        if (path11 == null) {
            l.a("mPath");
        }
        path11.reset();
        Path path12 = this.f33299b;
        if (path12 == null) {
            l.a("mPath");
        }
        RectF rectF15 = this.p;
        if (rectF15 == null) {
            l.a("mRoundRect");
        }
        float f6 = f33294j;
        path12.addRoundRect(rectF15, f6, f6, Path.Direction.CW);
        if (this.D) {
            Path path13 = this.f33299b;
            if (path13 == null) {
                l.a("mPath");
            }
            Path path14 = this.f33300c;
            if (path14 == null) {
                l.a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.u;
        if (canvas4 == null) {
            l.a("mCanvas");
        }
        Path path15 = this.f33299b;
        if (path15 == null) {
            l.a("mPath");
        }
        Paint paint12 = this.f33298a;
        if (paint12 == null) {
            l.a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f33298a;
        if (paint13 == null) {
            l.a("mFillPaint");
        }
        paint13.setXfermode(null);
        Bitmap bitmap2 = this.t;
        if (bitmap2 == null) {
            l.b();
        }
        canvas.drawBitmap(bitmap2, ((float) f33291g) - n.b(getContext(), 1.4f), ((float) f33291g) - n.b(getContext(), 1.3f), (Paint) null);
        MethodCollector.o(11580);
    }

    public final void a(int i2, float f2) {
        this.z = f2;
        this.A = i2;
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
        MethodCollector.i(11906);
        this.o = 12.0f;
        this.x = -16777216;
        this.z = 0.75f;
        this.A = 1;
        this.B = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = 197.0f;
        l.d(context, "");
        this.s = (int) n.b(context, 0.7f);
        f33291g = (int) n.b(context, 7.0f);
        f33293i = 2.0f;
        f33294j = n.b(context, 8.0f);
        f33295k = n.b(context, 3.0f);
        f33296l = (int) n.b(context, 40.0f);
        f33297m = (int) n.b(context, 56.0f);
        this.f33298a = new Paint();
        this.f33299b = new Path();
        this.f33301d = new Path();
        this.f33300c = new Path();
        Paint paint = this.f33298a;
        if (paint == null) {
            l.a("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f33298a;
        if (paint2 == null) {
            l.a("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f33298a;
        if (paint3 == null) {
            l.a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f33298a;
        if (paint4 == null) {
            l.a("mFillPaint");
        }
        paint4.setStrokeWidth(f33293i);
        Paint paint5 = this.f33298a;
        if (paint5 == null) {
            l.a("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.v = b.c(context, R.color.a2d);
        this.w = b.c(context, R.color.b4);
        Paint paint6 = this.f33298a;
        if (paint6 == null) {
            l.a("mFillPaint");
        }
        paint6.setColor(this.v);
        Paint paint7 = this.f33298a;
        if (paint7 == null) {
            l.a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.y) {
            Paint paint8 = this.f33298a;
            if (paint8 == null) {
                l.a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.x);
        }
        Path path = this.f33300c;
        if (path == null) {
            l.a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f33300c;
        if (path2 == null) {
            l.a("mBubbleArrowPath");
        }
        int i2 = f33291g;
        path2.lineTo((float) i2, (float) (-i2));
        Path path3 = this.f33300c;
        if (path3 == null) {
            l.a("mBubbleArrowPath");
        }
        int i3 = f33291g;
        path3.lineTo((float) i3, (float) i3);
        Path path4 = this.f33300c;
        if (path4 == null) {
            l.a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f33301d;
        if (path5 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f33301d;
        if (path6 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        double d2 = (double) f33291g;
        double d3 = (double) this.s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d3);
        Double.isNaN(d2);
        float f2 = (float) (d2 + (d3 * sqrt));
        double d4 = (double) (-f33291g);
        double d5 = (double) this.s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        Double.isNaN(d4);
        path6.lineTo(f2, (float) (d4 - (d5 * sqrt2)));
        Path path7 = this.f33301d;
        if (path7 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        double d6 = (double) f33291g;
        double d7 = (double) this.s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        Double.isNaN(d6);
        float f3 = (float) (d6 + (d7 * sqrt3));
        double d8 = (double) f33291g;
        double d9 = (double) this.s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        Double.isNaN(d8);
        path7.lineTo(f3, (float) (d8 + (d9 * sqrt4)));
        Path path8 = this.f33301d;
        if (path8 == null) {
            l.a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.o(11906);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        TextView textView;
        int measuredWidth;
        char c2;
        int measuredWidth2;
        int measuredHeight;
        int measureText;
        MethodCollector.i(11576);
        super.onMeasure(i2, i3);
        f33292h = (int) n.b(getContext(), this.o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(11576);
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
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > n.b(getContext(), this.G)) {
                measureText = (int) n.b(getContext(), this.G);
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
            int i4 = this.A;
            if (i4 == 2 || i4 == 1) {
                int i5 = f33296l;
                if (measuredWidth > i5) {
                    i5 = (f33292h * 2) + measuredWidth;
                }
                measuredWidth2 = i5 + f33291g;
            } else {
                measuredWidth2 = f33296l;
                if (measuredWidth > measuredWidth2) {
                    measuredWidth2 = (f33292h * 2) + measuredWidth;
                }
            }
            if (c2 == 1) {
                measuredHeight = f33297m;
            } else {
                measuredHeight = f33297m + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            l.b(contentView, "");
            measuredWidth2 = contentView.getMeasuredWidth() + (f33291g * 3) + f33292h;
            View contentView2 = popupWindow.getContentView();
            l.b(contentView2, "");
            measuredHeight = contentView2.getMeasuredHeight() + (f33291g * 3) + f33292h;
        }
        int i6 = this.s;
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
        this.q = (float) (getMeasuredWidth() - (f33291g * 2));
        this.r = (float) (getMeasuredHeight() - (f33291g * 2));
        MethodCollector.o(11576);
    }
}
