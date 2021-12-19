package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.b;
import com.lynx.tasm.image.d;
import com.lynx.tasm.utils.BlurUtils;

/* access modifiers changed from: package-private */
public final class a extends d {
    static {
        Covode.recordClassIndex(35332);
    }

    a(d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, b bVar) {
        int i2;
        if (this.f56736a == 1 && (i2 = bVar.f56677c) > 0) {
            BlurUtils.iterativeBoxBlur(bitmap, i2);
        }
        super.b(canvas, bitmap, bVar);
    }
}
