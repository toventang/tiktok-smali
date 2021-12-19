package com.bytedance.tux.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends ShapeDrawable {

    /* renamed from: a  reason: collision with root package name */
    public final RoundRectShape f45648a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1122a f45649b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorDrawable f45650c;

    /* renamed from: com.bytedance.tux.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC1122a {
        static {
            Covode.recordClassIndex(27787);
        }

        boolean a();

        float[] b();
    }

    static {
        Covode.recordClassIndex(27786);
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        if (!this.f45649b.a()) {
            this.f45650c.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public a(AbstractC1122a aVar, ColorDrawable colorDrawable) {
        l.c(aVar, "");
        l.c(colorDrawable, "");
        this.f45649b = aVar;
        this.f45650c = colorDrawable;
        RoundRectShape roundRectShape = new RoundRectShape(aVar.b(), null, null);
        this.f45648a = roundRectShape;
        setShape(roundRectShape);
        Paint paint = getPaint();
        l.a((Object) paint, "");
        paint.setColor(colorDrawable.getColor());
    }
}
