package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final RectF f1857a = new RectF();

    static {
        Covode.recordClassIndex(570);
    }

    @Override // androidx.cardview.widget.e
    public final void f(d dVar) {
    }

    c() {
    }

    @Override // androidx.cardview.widget.e
    public void a() {
        g.f1870a = new g.a() {
            /* class androidx.cardview.widget.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(571);
            }

            @Override // androidx.cardview.widget.g.a
            public final void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
                float f3 = 2.0f * f2;
                float width = (rectF.width() - f3) - 1.0f;
                float height = (rectF.height() - f3) - 1.0f;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                if (f2 >= 1.0f) {
                    float f4 = f2 + 0.5f;
                    float f5 = -f4;
                    c.this.f1857a.set(f5, f5, f4, f4);
                    int save = canvas2.save();
                    canvas2.translate(rectF.left + f4, rectF.top + f4);
                    canvas2.drawArc(c.this.f1857a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(c.this.f1857a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(c.this.f1857a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2 = canvas2;
                    canvas2.drawArc(c.this.f1857a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas2.drawRect((rectF.left + f4) - 1.0f, rectF.top, (rectF.right - f4) + 1.0f, rectF.top + f4, paint2);
                    paint2 = paint2;
                    canvas2.drawRect((rectF.left + f4) - 1.0f, rectF.bottom - f4, (rectF.right - f4) + 1.0f, rectF.bottom, paint2);
                }
                canvas2.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint2);
            }
        };
    }

    private static g j(d dVar) {
        return (g) dVar.c();
    }

    @Override // androidx.cardview.widget.e
    public final float a(d dVar) {
        return j(dVar).f1873c;
    }

    @Override // androidx.cardview.widget.e
    public final float d(d dVar) {
        return j(dVar).f1872b;
    }

    @Override // androidx.cardview.widget.e
    public final float e(d dVar) {
        return j(dVar).f1874d;
    }

    @Override // androidx.cardview.widget.e
    public final ColorStateList h(d dVar) {
        return j(dVar).f1875e;
    }

    @Override // androidx.cardview.widget.e
    public final float b(d dVar) {
        return j(dVar).a();
    }

    @Override // androidx.cardview.widget.e
    public final float c(d dVar) {
        return j(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public final void g(d dVar) {
        j(dVar).a(dVar.b());
        i(dVar);
    }

    private static void i(d dVar) {
        Rect rect = new Rect();
        j(dVar).getPadding(rect);
        dVar.a((int) Math.ceil((double) j(dVar).a()), (int) Math.ceil((double) j(dVar).b()));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public final void b(d dVar, float f2) {
        g j2 = j(dVar);
        j2.a(j2.f1874d, f2);
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public final void c(d dVar, float f2) {
        g j2 = j(dVar);
        j2.a(f2, j2.f1873c);
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, float f2) {
        g j2 = j(dVar);
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (j2.f1872b != f3) {
                j2.f1872b = f3;
                j2.f1876f = true;
                j2.invalidateSelf();
            }
            i(dVar);
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, ColorStateList colorStateList) {
        g j2 = j(dVar);
        j2.a(colorStateList);
        j2.invalidateSelf();
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g gVar = new g(context.getResources(), colorStateList, f2, f3, f4);
        gVar.a(dVar.b());
        dVar.a(gVar);
        i(dVar);
    }
}
