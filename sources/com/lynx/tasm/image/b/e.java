package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.b;
import com.lynx.tasm.image.d;

public final class e extends d {
    static {
        Covode.recordClassIndex(35336);
    }

    public e(d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = bVar.f56685k;
        if (iArr == null) {
            i2 = bVar.f56681g;
            i3 = bVar.f56682h;
            i4 = bVar.f56683i;
            i5 = bVar.f56684j;
        } else {
            i2 = bVar.f56681g + iArr[0];
            i3 = bVar.f56682h + iArr[1];
            i4 = bVar.f56683i + iArr[2];
            i5 = iArr[3] + bVar.f56684j;
        }
        bVar.f56686l = Math.max(i2, 0);
        bVar.f56687m = Math.max(i3, 0);
        bVar.n = Math.max(i4, 0);
        bVar.o = Math.max(i5, 0);
        super.b(canvas, bitmap, bVar);
    }
}
