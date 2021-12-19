package com.ss.android.ugc.aweme.dh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static int f80079a;

    /* renamed from: b  reason: collision with root package name */
    public static int f80080b;

    /* renamed from: c  reason: collision with root package name */
    public static int f80081c;

    /* renamed from: d  reason: collision with root package name */
    public static float f80082d;

    /* renamed from: e  reason: collision with root package name */
    public static float f80083e;

    /* renamed from: f  reason: collision with root package name */
    public static float f80084f;

    /* renamed from: g  reason: collision with root package name */
    public static int f80085g;

    /* renamed from: h  reason: collision with root package name */
    public static int f80086h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f80087i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f80088j;

    /* renamed from: k  reason: collision with root package name */
    private final Path f80089k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f80090l;

    /* renamed from: m  reason: collision with root package name */
    private float f80091m;
    private float n;
    private Path o;
    private RectF p;
    private int q;
    private Matrix r;
    private Bitmap s;
    private Canvas t;
    private int u;
    private int v;
    private float w;
    private int x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(49849);
    }

    private void a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.start();
        ofFloat.addUpdateListener(b.f80092a);
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.w, f80084f);
        int i2 = this.x;
        if (i2 == 0) {
            return Math.min(max, this.f80091m - f80084f);
        }
        if (i2 == 1) {
            return Math.min(max, this.n - f80084f);
        }
        if (i2 == 2) {
            return Math.min(max, this.n - f80084f);
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return Math.min(max, this.f80091m - f80084f);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void setBgColor(int i2) {
        this.u = i2;
    }

    public final void setBorderColor(int i2) {
        this.v = i2;
    }

    public final void setBubbleOrientation(int i2) {
        this.x = i2;
    }

    public final void setNeedPath(boolean z2) {
        this.y = z2;
    }

    public final void setNeedPressFade(boolean z2) {
        this.z = z2;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.z) {
                    a();
                }
            } else if (this.z) {
                a();
            }
        } else if (this.z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(c.f80093a);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(1320);
        if (this.s == null) {
            this.s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.t = new Canvas(this.s);
        }
        float f2 = this.f80091m;
        float f3 = this.n;
        float max = Math.max(this.w, f80084f);
        float min = Math.min(max, f3 - f80084f);
        Matrix matrix = new Matrix();
        this.r = new Matrix();
        int i2 = this.x;
        if (i2 != 0) {
            if (i2 == 1) {
                f3 = Math.min(max, f3 - f80084f);
                setPadding(f80079a, 0, 0, 0);
                setGravity(17);
                Matrix matrix2 = this.r;
                int i3 = this.q;
                matrix2.postTranslate(((float) i3) + 0.0f, ((float) ((i3 * 3) / 2)) + f3);
                this.f80090l = new RectF((float) f80079a, 0.0f, this.f80091m, this.n);
            } else if (i2 == 2) {
                f3 = Math.min(max, f3 - f80084f);
                matrix.postRotate(180.0f);
                this.r.postRotate(180.0f);
                Matrix matrix3 = this.r;
                int i4 = this.q;
                matrix3.postTranslate(((float) (i4 * 2)) + f2, ((float) ((i4 * 3) / 2)) + f3);
                setPadding(0, 0, f80079a, 0);
                setGravity(17);
                this.f80090l = new RectF(0.0f, 0.0f, this.f80091m - ((float) f80079a), this.n);
            } else if (i2 != 3) {
                f3 = min;
            } else {
                f2 = Math.min(max, f2 - f80084f);
                matrix.postRotate(270.0f);
                this.r.postRotate(270.0f);
                Matrix matrix4 = this.r;
                int i5 = this.q;
                matrix4.postTranslate(((float) ((i5 * 3) / 2)) + f2, ((float) (i5 * 2)) + f3);
                setPadding(0, 0, 0, f80079a);
                setGravity(17);
                this.f80090l = new RectF(0.0f, 0.0f, this.f80091m, this.n - ((float) f80079a));
            }
            f2 = 0.0f;
        } else {
            f2 = Math.min(max, f2 - f80084f);
            matrix.postRotate(90.0f);
            this.r.postRotate(90.0f);
            Matrix matrix5 = this.r;
            int i6 = this.q;
            matrix5.postTranslate(((float) ((i6 * 3) / 2)) + f2, ((float) i6) + 0.0f);
            setPadding(0, f80079a, 0, 0);
            setGravity(17);
            this.f80090l = new RectF(0.0f, (float) f80079a, this.f80091m, this.n);
            f3 = 0.0f;
        }
        this.f80090l.left += (float) ((this.q * 3) / 2);
        this.f80090l.top += (float) ((this.q * 3) / 2);
        this.f80090l.right += (float) ((this.q * 3) / 2);
        this.f80090l.bottom += (float) ((this.q * 3) / 2);
        RectF rectF = new RectF();
        this.p = rectF;
        rectF.left = this.f80090l.left - ((float) (this.q / 2));
        this.p.top = this.f80090l.top - ((float) (this.q / 2));
        this.p.right = this.f80090l.right + ((float) (this.q / 2));
        this.p.bottom = this.f80090l.bottom + ((float) (this.q / 2));
        int i7 = this.q;
        matrix.postTranslate(f2 + ((float) ((i7 * 3) / 2)), f3 + ((float) ((i7 * 3) / 2)));
        this.f80087i.setColor(this.v);
        this.f80087i.setStyle(Paint.Style.STROKE);
        this.f80087i.setStrokeWidth((float) this.q);
        if (this.y) {
            this.f80088j.reset();
            Path path = this.f80088j;
            RectF rectF2 = this.p;
            float f4 = f80083e;
            int i8 = this.q;
            path.addRoundRect(rectF2, ((float) (i8 / 2)) + f4, f4 + ((float) (i8 / 2)), Path.Direction.CW);
            this.f80088j.addPath(this.o, this.r);
            this.t.drawPath(this.f80088j, this.f80087i);
        }
        this.f80087i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f80087i.setColor(this.u);
        this.f80087i.setStyle(Paint.Style.FILL);
        this.f80088j.reset();
        Path path2 = this.f80088j;
        RectF rectF3 = this.f80090l;
        float f5 = f80083e;
        path2.addRoundRect(rectF3, f5, f5, Path.Direction.CW);
        this.f80088j.addPath(this.f80089k, matrix);
        this.t.drawPath(this.f80088j, this.f80087i);
        this.f80087i.setXfermode(null);
        canvas.drawBitmap(this.s, 0.0f, 0.0f, (Paint) null);
        MethodCollector.o(1320);
    }

    public final void a(int i2, float f2) {
        this.w = f2;
        this.x = i2;
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        TextView textView;
        int measuredWidth;
        int i4;
        MethodCollector.i(1055);
        super.onMeasure(i2, i3);
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (textView != null) {
            measuredWidth = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
        }
        int i5 = this.x;
        if (i5 == 2 || i5 == 1) {
            int i6 = f80085g;
            if (measuredWidth > i6) {
                i6 = (f80080b * 2) + measuredWidth;
            }
            i4 = i6 + f80079a;
        } else {
            i4 = f80085g;
            if (measuredWidth > i4) {
                i4 = (f80080b * 2) + measuredWidth;
            }
        }
        int i7 = f80086h;
        int i8 = this.q;
        int i9 = i4 + (i8 * 3);
        int i10 = i7 + (i8 * 3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i9, i10);
            }
            setMeasuredDimension(i9, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i10);
                }
            }
            setMeasuredDimension(i9, size2);
        }
        this.f80091m = (float) (getMeasuredWidth() - (this.q * 3));
        this.n = (float) (getMeasuredHeight() - (this.q * 3));
        MethodCollector.o(1055);
    }

    private a(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(1028);
        this.f80088j = new Path();
        Path path = new Path();
        this.f80089k = path;
        this.o = new Path();
        this.w = 0.75f;
        this.x = 1;
        this.y = true;
        int a2 = (int) a(context, 0.5f);
        this.q = a2;
        if (a2 < 2) {
            this.q = 2;
        }
        f80079a = (int) a(context, 7.0f);
        f80080b = (int) a(context, 10.0f);
        f80081c = (int) a(context, 6.0f);
        f80082d = 2.0f;
        f80083e = a(context, 6.0f);
        f80084f = (float) (f80079a + f80081c);
        f80085g = (int) a(context, 50.0f);
        f80086h = (int) a(context, 46.0f);
        Paint paint = new Paint();
        this.f80087i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f80087i.setStrokeCap(Paint.Cap.BUTT);
        this.f80087i.setAntiAlias(true);
        this.f80087i.setStrokeWidth(f80082d);
        this.f80087i.setStrokeJoin(Paint.Join.MITER);
        this.u = b.c(context, R.color.bj);
        this.v = Color.parseColor("#1DFFFFFF");
        this.f80087i.setColor(this.u);
        setLayerType(1, this.f80087i);
        path.moveTo(0.0f, 0.0f);
        int i2 = f80079a;
        path.lineTo((float) i2, (float) (-i2));
        int i3 = f80079a;
        path.lineTo((float) i3, (float) i3);
        path.close();
        this.o.moveTo(0.0f, 0.0f);
        Path path2 = this.o;
        double d2 = (double) f80079a;
        double d3 = (double) this.q;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d3);
        Double.isNaN(d2);
        float f2 = (float) (d2 + (d3 * sqrt));
        double d4 = (double) (-f80079a);
        double d5 = (double) this.q;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        Double.isNaN(d4);
        path2.lineTo(f2, (float) (d4 - (d5 * sqrt2)));
        Path path3 = this.o;
        double d6 = (double) f80079a;
        double d7 = (double) this.q;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        Double.isNaN(d6);
        float f3 = (float) (d6 + (d7 * sqrt3));
        double d8 = (double) f80079a;
        double d9 = (double) this.q;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        Double.isNaN(d8);
        path3.lineTo(f3, (float) (d8 + (d9 * sqrt4)));
        this.o.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.o(1028);
    }
}
