package com.ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.v;

public final class b implements c {
    static {
        Covode.recordClassIndex(42964);
    }

    @Override // com.ss.android.ugc.aweme.canvas.c
    public final p<Integer, Integer> a(Bitmap bitmap) {
        l.d(bitmap, "");
        if (!p.f69743a) {
            return v.a(-16777216, -16777216);
        }
        return new d().a(bitmap);
    }
}
