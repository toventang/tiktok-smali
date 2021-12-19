package com.facebook.drawee.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p.b;
import java.lang.ref.WeakReference;

public final class k extends n {
    private WeakReference<Bitmap> A;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f47387a;
    private final Paint y;
    private final Bitmap z;

    static {
        Covode.recordClassIndex(28772);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.drawee.e.n
    public final boolean b() {
        if (!super.b() || this.z == null) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.drawee.e.n
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.e.n
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.e.n
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f47387a.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.e.n
    public final void setAlpha(int i2) {
        super.setAlpha(i2);
        if (i2 != this.f47387a.getAlpha()) {
            this.f47387a.setAlpha(i2);
            super.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.e.n
    public final void draw(Canvas canvas) {
        b.a();
        if (!b()) {
            super.draw(canvas);
            b.a();
            return;
        }
        c();
        d();
        WeakReference<Bitmap> weakReference = this.A;
        if (weakReference == null || weakReference.get() != this.z) {
            this.A = new WeakReference<>(this.z);
            this.f47387a.setFilterBitmap(true);
            Paint paint = this.f47387a;
            Bitmap bitmap = this.z;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f47422g = true;
        }
        if (this.f47422g) {
            this.f47387a.getShader().setLocalMatrix(this.x);
            this.f47422g = false;
        }
        int save = canvas.save();
        canvas.concat(this.u);
        canvas.drawPath(this.f47421f, this.f47387a);
        if (this.f47420e > 0.0f) {
            this.y.setStrokeWidth(this.f47420e);
            this.y.setColor(e.a(this.f47423h, this.f47387a.getAlpha()));
            canvas.drawPath(this.f47424i, this.y);
        }
        canvas.restoreToCount(save);
        b.a();
    }

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f47387a = paint2;
        Paint paint3 = new Paint(1);
        this.y = paint3;
        this.z = bitmap;
        if (Build.VERSION.SDK_INT >= 24 && (this.f47417b instanceof BitmapDrawable) && bitmap != null && bitmap.getDensity() == DisplayMetrics.DENSITY_DEVICE_STABLE) {
            ((BitmapDrawable) this.f47417b).setTargetDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        }
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }
}
