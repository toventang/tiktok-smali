package g.a.a.a.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f158077a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f158078b;

    /* renamed from: c  reason: collision with root package name */
    protected int f158079c;

    /* renamed from: d  reason: collision with root package name */
    protected int f158080d;

    static {
        Covode.recordClassIndex(104955);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f158080d;
    }

    public final int getIntrinsicWidth() {
        return this.f158079c;
    }

    public final int getMinimumHeight() {
        return this.f158080d;
    }

    public final int getMinimumWidth() {
        return this.f158079c;
    }

    public final void setAlpha(int i2) {
        this.f158078b.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f158078b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f158077a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f158077a, 0.0f, 0.0f, this.f158078b);
        }
    }

    public a(Bitmap bitmap) {
        this.f158077a = bitmap;
        if (bitmap != null) {
            this.f158079c = bitmap.getWidth();
            this.f158080d = this.f158077a.getHeight();
        } else {
            this.f158079c = 0;
            this.f158080d = 0;
        }
        Paint paint = new Paint();
        this.f158078b = paint;
        paint.setDither(true);
        this.f158078b.setFilterBitmap(true);
    }
}
