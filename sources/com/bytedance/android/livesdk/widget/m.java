package com.bytedance.android.livesdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.l;

public final class m extends f {

    /* renamed from: a  reason: collision with root package name */
    public int f22625a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f22626b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    public float f22627c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f22628d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f22629e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f22630f;

    /* renamed from: g  reason: collision with root package name */
    public int f22631g;

    /* renamed from: h  reason: collision with root package name */
    public float f22632h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f22633i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f22634j;

    static {
        Covode.recordClassIndex(13364);
    }

    public final void a(float f2) {
        this.f22627c = f2;
        i.a(this.f22626b, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Drawable drawable) {
        super(drawable);
        l.d(drawable, "");
        Path path = new Path();
        this.f22628d = path;
        Paint paint = new Paint(1);
        this.f22629e = paint;
        this.f22630f = new RectF();
        this.f22631g = -1;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(paint2.getStrokeWidth());
        paint2.setColor(this.f22631g);
        this.f22633i = paint2;
        this.f22634j = new RectF();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
    }

    @Override // com.bytedance.android.livesdk.widget.f
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.d(paint, "");
        return super.getSize(paint, charSequence, i2, i3, fontMetricsInt) + this.f22625a;
    }

    @Override // com.bytedance.android.livesdk.widget.f
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        boolean z;
        l.d(canvas, "");
        l.d(paint, "");
        if (this.f22625a <= 0 || a.f(getDrawable()) != 1) {
            z = false;
        } else {
            canvas.save();
            canvas.translate((float) this.f22625a, 0.0f);
            z = true;
        }
        float a2 = (float) a(i5, paint.getFontMetricsInt(), getDrawable());
        if (this.f22627c > 0.0f) {
            Drawable drawable = getDrawable();
            l.b(drawable, "");
            float width = f2 + ((float) drawable.getBounds().width());
            Drawable drawable2 = getDrawable();
            l.b(drawable2, "");
            float height = a2 + ((float) drawable2.getBounds().height());
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.saveLayer(f2, a2, width, height, null);
            } else {
                canvas.saveLayer(f2, a2, width, height, null, 31);
            }
        }
        super.draw(canvas, charSequence, i2, i3, f2, i4, i5, i6, paint);
        if (this.f22632h > 0.0f) {
            RectF rectF = this.f22634j;
            Drawable drawable3 = getDrawable();
            l.b(drawable3, "");
            Drawable drawable4 = getDrawable();
            l.b(drawable4, "");
            rectF.set(f2, a2, ((float) drawable3.getBounds().width()) + f2, ((float) drawable4.getBounds().height()) + a2);
            RectF rectF2 = this.f22634j;
            float f3 = this.f22627c;
            canvas.drawRoundRect(rectF2, f3, f3, this.f22633i);
        }
        if (this.f22627c > 0.0f) {
            RectF rectF3 = this.f22630f;
            Drawable drawable5 = getDrawable();
            l.b(drawable5, "");
            Drawable drawable6 = getDrawable();
            l.b(drawable6, "");
            rectF3.set(f2, a2, ((float) drawable5.getBounds().width()) + f2, ((float) drawable6.getBounds().height()) + a2);
            this.f22628d.reset();
            this.f22628d.addRoundRect(this.f22630f, this.f22626b, Path.Direction.CW);
            canvas.drawPath(this.f22628d, this.f22629e);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }
}
