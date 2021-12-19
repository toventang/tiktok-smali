package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class g extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    static a f1870a;

    /* renamed from: g  reason: collision with root package name */
    private static final double f1871g = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public float f1872b;

    /* renamed from: c  reason: collision with root package name */
    public float f1873c;

    /* renamed from: d  reason: collision with root package name */
    public float f1874d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f1875e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1876f = true;

    /* renamed from: h  reason: collision with root package name */
    private final int f1877h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f1878i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f1879j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f1880k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f1881l;

    /* renamed from: m  reason: collision with root package name */
    private Path f1882m;
    private float n;
    private final int o;
    private final int p;
    private boolean q = true;
    private boolean r;

    interface a {
        static {
            Covode.recordClassIndex(576);
        }

        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    static {
        Covode.recordClassIndex(575);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1875e;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        float f2 = this.f1873c;
        return (Math.max(f2, this.f1872b + ((float) this.f1877h) + (f2 / 2.0f)) * 2.0f) + ((this.f1873c + ((float) this.f1877h)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        float f2 = this.f1873c;
        return (Math.max(f2, this.f1872b + ((float) this.f1877h) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1873c * 1.5f) + ((float) this.f1877h)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1876f = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1878i.setColorFilter(colorFilter);
    }

    private static int a(float f2) {
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            return i2 - 1;
        }
        return i2;
    }

    public final void setAlpha(int i2) {
        this.f1878i.setAlpha(i2);
        this.f1879j.setAlpha(i2);
        this.f1880k.setAlpha(i2);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1875e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1878i.getColor() == colorForState) {
            return false;
        }
        this.f1878i.setColor(colorForState);
        this.f1876f = true;
        invalidateSelf();
        return true;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.f1873c, this.f1872b, this.q));
        int ceil2 = (int) Math.ceil((double) b(this.f1873c, this.f1872b, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1875e = colorStateList;
        this.f1878i.setColor(colorStateList.getColorForState(getState(), this.f1875e.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f1876f) {
            Rect bounds = getBounds();
            float f2 = this.f1873c * 1.5f;
            this.f1881l.set(((float) bounds.left) + this.f1873c, ((float) bounds.top) + f2, ((float) bounds.right) - this.f1873c, ((float) bounds.bottom) - f2);
            float f3 = this.f1872b;
            RectF rectF = new RectF(-f3, -f3, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f4 = this.n;
            rectF2.inset(-f4, -f4);
            Path path = this.f1882m;
            if (path == null) {
                this.f1882m = new Path();
            } else {
                path.reset();
            }
            this.f1882m.setFillType(Path.FillType.EVEN_ODD);
            this.f1882m.moveTo(-this.f1872b, 0.0f);
            this.f1882m.rLineTo(-this.n, 0.0f);
            this.f1882m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1882m.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1882m.close();
            float f5 = this.f1872b;
            float f6 = f5 / (this.n + f5);
            Paint paint = this.f1879j;
            float f7 = this.f1872b + this.n;
            int i2 = this.o;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{i2, i2, this.p}, new float[]{0.0f, f6, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1880k;
            float f8 = this.f1872b;
            float f9 = this.n;
            float f10 = (-f8) + f9;
            float f11 = (-f8) - f9;
            int i3 = this.o;
            paint2.setShader(new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i3, i3, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1880k.setAntiAlias(false);
            this.f1876f = false;
        }
        canvas.translate(0.0f, this.f1874d / 2.0f);
        float f12 = this.f1872b;
        float f13 = (-f12) - this.n;
        float f14 = f12 + ((float) this.f1877h) + (this.f1874d / 2.0f);
        float f15 = f14 * 2.0f;
        if (this.f1881l.width() - f15 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1881l.height() - f15 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        canvas.translate(this.f1881l.left + f14, this.f1881l.top + f14);
        canvas.drawPath(this.f1882m, this.f1879j);
        if (z) {
            canvas.drawRect(0.0f, f13, this.f1881l.width() - f15, -this.f1872b, this.f1880k);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f1881l.right - f14, this.f1881l.bottom - f14);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1882m, this.f1879j);
        if (z) {
            canvas.drawRect(0.0f, f13, this.f1881l.width() - f15, (-this.f1872b) + this.n, this.f1880k);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1881l.left + f14, this.f1881l.bottom - f14);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1882m, this.f1879j);
        if (z2) {
            canvas.drawRect(0.0f, f13, this.f1881l.height() - f15, -this.f1872b, this.f1880k);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f1881l.right - f14, this.f1881l.top + f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1882m, this.f1879j);
        if (z2) {
            canvas.drawRect(0.0f, f13, this.f1881l.height() - f15, -this.f1872b, this.f1880k);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1874d) / 2.0f);
        f1870a.a(canvas, this.f1881l, this.f1872b, this.f1878i);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float a2 = (float) a(f2);
            float a3 = (float) a(f3);
            if (a2 > a3) {
                if (!this.r) {
                    this.r = true;
                }
                a2 = a3;
            }
            if (this.f1874d != a2 || this.f1873c != a3) {
                this.f1874d = a2;
                this.f1873c = a3;
                this.n = (float) ((int) ((a2 * 1.5f) + ((float) this.f1877h) + 0.5f));
                this.f1876f = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    static float a(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = (double) (f2 * 1.5f);
        double d3 = 1.0d - f1871g;
        double d4 = (double) f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    static float b(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = (double) f2;
        double d3 = 1.0d - f1871g;
        double d4 = (double) f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.o = resources.getColor(R.color.ev);
        this.p = resources.getColor(R.color.eu);
        this.f1877h = resources.getDimensionPixelSize(R.dimen.e8);
        this.f1878i = new Paint(5);
        a(colorStateList);
        Paint paint = new Paint(5);
        this.f1879j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1872b = (float) ((int) (f2 + 0.5f));
        this.f1881l = new RectF();
        Paint paint2 = new Paint(this.f1879j);
        this.f1880k = paint2;
        paint2.setAntiAlias(false);
        a(f3, f4);
    }
}
