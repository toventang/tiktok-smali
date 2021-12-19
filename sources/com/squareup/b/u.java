package com.squareup.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;

/* access modifiers changed from: package-private */
public final class u extends BitmapDrawable {

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f58103e = new Paint();

    /* renamed from: a  reason: collision with root package name */
    Drawable f58104a;

    /* renamed from: b  reason: collision with root package name */
    long f58105b;

    /* renamed from: c  reason: collision with root package name */
    boolean f58106c;

    /* renamed from: d  reason: collision with root package name */
    int f58107d = 255;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f58108f;

    /* renamed from: g  reason: collision with root package name */
    private final float f58109g;

    /* renamed from: h  reason: collision with root package name */
    private final t.d f58110h;

    static {
        Covode.recordClassIndex(36086);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f58104a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i2) {
        this.f58107d = i2;
        Drawable drawable = this.f58104a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f58104a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (!this.f58106c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f58105b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f58106c = false;
                this.f58104a = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f58104a;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f58107d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f58107d);
                int i2 = Build.VERSION.SDK_INT;
            }
        }
        if (this.f58108f) {
            Paint paint = f58103e;
            paint.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int) (this.f58109g * 16.0f)), paint);
            paint.setColor(this.f58110h.debugColor);
            canvas.drawPath(a(new Point(0, 0), (int) (this.f58109g * 15.0f)), paint);
        }
    }

    private static Path a(Point point, int i2) {
        Point point2 = new Point(point.x + i2, point.y);
        Point point3 = new Point(point.x, point.y + i2);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    static void a(ImageView imageView, Context context, Bitmap bitmap, t.d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, dVar, z, z2));
    }

    private u(Context context, Bitmap bitmap, Drawable drawable, t.d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f58108f = z2;
        this.f58109g = context.getResources().getDisplayMetrics().density;
        this.f58110h = dVar;
        if (dVar != t.d.MEMORY && !z) {
            this.f58104a = drawable;
            this.f58106c = true;
            this.f58105b = SystemClock.uptimeMillis();
        }
    }
}
