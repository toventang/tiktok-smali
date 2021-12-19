package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public abstract class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f2429a;

    /* renamed from: b  reason: collision with root package name */
    public int f2430b = 119;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f2431c = new Paint(3);

    /* renamed from: d  reason: collision with root package name */
    public final BitmapShader f2432d;

    /* renamed from: e  reason: collision with root package name */
    public float f2433e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f2434f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2435g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2436h;

    /* renamed from: i  reason: collision with root package name */
    private int f2437i = 160;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f2438j = new Matrix();

    /* renamed from: k  reason: collision with root package name */
    private final RectF f2439k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    private int f2440l;

    /* renamed from: m  reason: collision with root package name */
    private int f2441m;

    static {
        Covode.recordClassIndex(787);
    }

    private static boolean b(float f2) {
        return f2 > 0.05f;
    }

    public int getIntrinsicHeight() {
        return this.f2441m;
    }

    public int getIntrinsicWidth() {
        return this.f2440l;
    }

    public int getAlpha() {
        return this.f2431c.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2431c.getColorFilter();
    }

    public final void b() {
        this.f2433e = (float) (Math.min(this.f2441m, this.f2440l) / 2);
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f2430b != 119 || this.f2436h || (bitmap = this.f2429a) == null || bitmap.hasAlpha() || this.f2431c.getAlpha() < 255 || b(this.f2433e)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f2435g) {
            if (this.f2436h) {
                int min = Math.min(this.f2440l, this.f2441m);
                a(this.f2430b, min, min, getBounds(), this.f2434f);
                int min2 = Math.min(this.f2434f.width(), this.f2434f.height());
                this.f2434f.inset(Math.max(0, (this.f2434f.width() - min2) / 2), Math.max(0, (this.f2434f.height() - min2) / 2));
                this.f2433e = ((float) min2) * 0.5f;
            } else {
                a(this.f2430b, this.f2440l, this.f2441m, getBounds(), this.f2434f);
            }
            this.f2439k.set(this.f2434f);
            if (this.f2432d != null) {
                this.f2438j.setTranslate(this.f2439k.left, this.f2439k.top);
                this.f2438j.preScale(this.f2439k.width() / ((float) this.f2429a.getWidth()), this.f2439k.height() / ((float) this.f2429a.getHeight()));
                this.f2432d.setLocalMatrix(this.f2438j);
                this.f2431c.setShader(this.f2432d);
            }
            this.f2435g = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f2436h) {
            b();
        }
        this.f2435g = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2431c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f2431c.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f2431c.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        if (i2 != this.f2431c.getAlpha()) {
            this.f2431c.setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void a(float f2) {
        if (this.f2433e != f2) {
            this.f2436h = false;
            if (b(f2)) {
                this.f2431c.setShader(this.f2432d);
            } else {
                this.f2431c.setShader(null);
            }
            this.f2433e = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f2429a;
        if (bitmap != null) {
            a();
            if (this.f2431c.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f2434f, this.f2431c);
                return;
            }
            RectF rectF = this.f2439k;
            float f2 = this.f2433e;
            canvas.drawRoundRect(rectF, f2, f2, this.f2431c);
        }
    }

    b(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f2437i = resources.getDisplayMetrics().densityDpi;
        }
        this.f2429a = bitmap;
        if (bitmap != null) {
            this.f2440l = bitmap.getScaledWidth(this.f2437i);
            this.f2441m = bitmap.getScaledHeight(this.f2437i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f2432d = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f2441m = -1;
        this.f2440l = -1;
        this.f2432d = null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }
}
