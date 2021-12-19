package com.lynx.component.svg;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.a.e;
import com.lynx.component.svg.a.f;
import com.lynx.component.svg.a.g;

public final class a extends PictureDrawable {

    /* renamed from: a  reason: collision with root package name */
    private f f55208a;

    /* renamed from: b  reason: collision with root package name */
    private e f55209b;

    /* renamed from: c  reason: collision with root package name */
    private d f55210c;

    static {
        Covode.recordClassIndex(34631);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        f fVar = this.f55208a;
        if (fVar != null) {
            e eVar = this.f55209b;
            d dVar = this.f55210c;
            if (eVar == null) {
                eVar = new e(14.0f);
            }
            fVar.f55235d = eVar;
            if (!eVar.a()) {
                eVar.a((float) canvas.getWidth(), (float) canvas.getHeight());
            }
            new g(canvas, fVar.f55234c, eVar.f55231c, dVar).a(fVar, eVar);
        } else if (getPicture() != null) {
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.drawPicture(getPicture());
        }
        canvas.restore();
    }

    public a(f fVar, e eVar, d dVar) {
        super(null);
        Picture a2;
        int i2 = Build.VERSION.SDK_INT;
        fVar.f55235d = eVar;
        f.a aVar = fVar.f55232a.r;
        if (eVar != null && eVar.a()) {
            a2 = fVar.a((int) Math.ceil((double) eVar.f55230b.a()), (int) Math.ceil((double) eVar.f55230b.b()), eVar, dVar);
        } else if (fVar.f55232a.f55263c != null && fVar.f55232a.f55263c.f55331b != f.an.percent && fVar.f55232a.f55264d != null && fVar.f55232a.f55264d.f55331b != f.an.percent) {
            a2 = fVar.a((int) Math.ceil((double) fVar.f55232a.f55263c.a(fVar.f55234c, eVar.f55231c)), (int) Math.ceil((double) fVar.f55232a.f55264d.a(fVar.f55234c, eVar.f55231c)), eVar, dVar);
        } else if (fVar.f55232a.f55263c != null && aVar != null) {
            float a3 = fVar.f55232a.f55263c.a(fVar.f55234c, eVar.f55231c);
            a2 = fVar.a((int) Math.ceil((double) a3), (int) Math.ceil((double) ((aVar.f55241d * a3) / aVar.f55240c)), eVar, dVar);
        } else if (fVar.f55232a.f55264d == null || aVar == null) {
            a2 = fVar.a(512, 512, eVar, dVar);
        } else {
            float a4 = fVar.f55232a.f55264d.a(fVar.f55234c, eVar.f55231c);
            a2 = fVar.a((int) Math.ceil((double) ((aVar.f55240c * a4) / aVar.f55241d)), (int) Math.ceil((double) a4), eVar, dVar);
        }
        setPicture(a2);
    }
}
