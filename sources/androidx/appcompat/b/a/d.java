package androidx.appcompat.b.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import com.bytedance.covode.number.Covode;

public final class d extends Drawable {

    /* renamed from: i  reason: collision with root package name */
    private static final float f1047i = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1048a;

    /* renamed from: b  reason: collision with root package name */
    public float f1049b;

    /* renamed from: c  reason: collision with root package name */
    public float f1050c;

    /* renamed from: d  reason: collision with root package name */
    public float f1051d;

    /* renamed from: e  reason: collision with root package name */
    public float f1052e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1053f;

    /* renamed from: g  reason: collision with root package name */
    public float f1054g;

    /* renamed from: h  reason: collision with root package name */
    public int f1055h;

    /* renamed from: j  reason: collision with root package name */
    private final Path f1056j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1057k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1058l;

    /* renamed from: m  reason: collision with root package name */
    private float f1059m;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f1057k;
    }

    public final int getIntrinsicWidth() {
        return this.f1057k;
    }

    static {
        Covode.recordClassIndex(303);
    }

    public final void a(float f2) {
        if (this.f1054g != f2) {
            this.f1054g = f2;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1048a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void a(boolean z) {
        if (this.f1058l != z) {
            this.f1058l = z;
            invalidateSelf();
        }
    }

    public final void setAlpha(int i2) {
        if (i2 != this.f1048a.getAlpha()) {
            this.f1048a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        float f2;
        float f3;
        int i2;
        Rect bounds = getBounds();
        int i3 = this.f1055h;
        boolean z = false;
        if (i3 != 0 && (i3 == 1 || (i3 == 3 ? a.f(this) == 0 : a.f(this) == 1))) {
            z = true;
        }
        float f4 = this.f1049b;
        float f5 = this.f1050c;
        float f6 = this.f1054g;
        float sqrt = ((((float) Math.sqrt((double) ((f4 * f4) * 2.0f))) - f5) * f6) + f5;
        float f7 = f5 + ((this.f1051d - f5) * f6);
        float round = (float) Math.round(((this.f1059m - 0.0f) * f6) + 0.0f);
        float f8 = f1047i;
        float f9 = this.f1054g;
        float f10 = ((f8 - 0.0f) * f9) + 0.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = -180.0f;
        }
        if (z) {
            f3 = 180.0f;
        } else {
            f3 = 0.0f;
        }
        float f11 = f2 + ((f3 - f2) * f9);
        double d2 = (double) sqrt;
        double d3 = (double) f10;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        float round2 = (float) Math.round(cos * d2);
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        float round3 = (float) Math.round(d2 * sin);
        this.f1056j.rewind();
        float strokeWidth = this.f1052e + this.f1048a.getStrokeWidth();
        float f12 = strokeWidth + (((-this.f1059m) - strokeWidth) * this.f1054g);
        float f13 = (-f7) / 2.0f;
        this.f1056j.moveTo(f13 + round, 0.0f);
        this.f1056j.rLineTo(f7 - (round * 2.0f), 0.0f);
        this.f1056j.moveTo(f13, f12);
        this.f1056j.rLineTo(round2, round3);
        this.f1056j.moveTo(f13, -f12);
        this.f1056j.rLineTo(round2, -round3);
        this.f1056j.close();
        canvas.save();
        float strokeWidth2 = this.f1048a.getStrokeWidth();
        float f14 = this.f1052e;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) ((((float) bounds.height()) - (3.0f * strokeWidth2)) - (2.0f * f14))) / 4) * 2)) + (strokeWidth2 * 1.5f) + f14);
        if (this.f1053f) {
            if (this.f1058l ^ z) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            canvas.rotate(f11 * ((float) i2));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1056j, this.f1048a);
        canvas.restore();
    }
}
