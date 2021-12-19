package androidx.emoji.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;

public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    private static Paint f2818e;

    static {
        Covode.recordClassIndex(991);
    }

    public h(b bVar) {
        super(bVar);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        float f3 = f2;
        if (a.a().f2749f) {
            float f4 = (float) i4;
            float f5 = f3 + ((float) this.f2790b);
            float f6 = (float) i6;
            if (f2818e == null) {
                TextPaint textPaint = new TextPaint();
                f2818e = textPaint;
                textPaint.setColor(a.a().f2750g);
                f2818e.setStyle(Paint.Style.FILL);
            }
            f3 = f3;
            canvas.drawRect(f3, f4, f5, f6, f2818e);
        }
        b bVar = this.f2789a;
        Typeface typeface = bVar.f2772b.f2815d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i7 = bVar.f2771a * 2;
        canvas.drawText(bVar.f2772b.f2813b, i7, 2, f3, (float) i5, paint);
        paint.setTypeface(typeface2);
    }
}
