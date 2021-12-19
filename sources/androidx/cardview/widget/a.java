package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.bytedance.covode.number.Covode;

final class a extends c {
    static {
        Covode.recordClassIndex(567);
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public final void a() {
        g.f1870a = new g.a() {
            /* class androidx.cardview.widget.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(568);
            }

            @Override // androidx.cardview.widget.g.a
            public final void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
        };
    }
}
