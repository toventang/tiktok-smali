package com.ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.v;

public final class z implements c {
    static {
        Covode.recordClassIndex(43012);
    }

    @Override // com.ss.android.ugc.aweme.canvas.c
    public final p<Integer, Integer> a(Bitmap bitmap) {
        l.d(bitmap, "");
        if (!ac.f69669a) {
            return v.a(-16777216, -16777216);
        }
        return new d().a(bitmap);
    }
}
