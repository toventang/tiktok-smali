package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;

final class b implements e {
    static {
        Covode.recordClassIndex(569);
    }

    @Override // androidx.cardview.widget.e
    public final void a() {
    }

    b() {
    }

    private static f j(d dVar) {
        return (f) dVar.c();
    }

    @Override // androidx.cardview.widget.e
    public final float a(d dVar) {
        return j(dVar).f1860b;
    }

    @Override // androidx.cardview.widget.e
    public final float d(d dVar) {
        return j(dVar).f1859a;
    }

    @Override // androidx.cardview.widget.e
    public final ColorStateList h(d dVar) {
        return j(dVar).f1861c;
    }

    @Override // androidx.cardview.widget.e
    public final float b(d dVar) {
        return j(dVar).f1859a * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public final float c(d dVar) {
        return j(dVar).f1859a * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public final float e(d dVar) {
        return dVar.d().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public final void f(d dVar) {
        b(dVar, j(dVar).f1860b);
    }

    @Override // androidx.cardview.widget.e
    public final void g(d dVar) {
        b(dVar, j(dVar).f1860b);
    }

    private static void i(d dVar) {
        if (!dVar.a()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float f2 = j(dVar).f1860b;
        float f3 = j(dVar).f1859a;
        int ceil = (int) Math.ceil((double) g.b(f2, f3, dVar.b()));
        int ceil2 = (int) Math.ceil((double) g.a(f2, f3, dVar.b()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public final void c(d dVar, float f2) {
        dVar.d().setElevation(f2);
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, ColorStateList colorStateList) {
        f j2 = j(dVar);
        j2.a(colorStateList);
        j2.invalidateSelf();
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, float f2) {
        f j2 = j(dVar);
        if (f2 != j2.f1859a) {
            j2.f1859a = f2;
            j2.a((Rect) null);
            j2.invalidateSelf();
        }
    }

    @Override // androidx.cardview.widget.e
    public final void b(d dVar, float f2) {
        j(dVar).a(f2, dVar.a(), dVar.b());
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        dVar.a(new f(colorStateList, f2));
        View d2 = dVar.d();
        d2.setClipToOutline(true);
        d2.setElevation(f3);
        b(dVar, f4);
    }
}
