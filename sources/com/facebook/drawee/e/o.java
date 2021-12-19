package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p.b;

public final class o extends n {
    static {
        Covode.recordClassIndex(28778);
    }

    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
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
        canvas.clipPath(this.f47421f);
        super.draw(canvas);
        b.a();
    }
}
