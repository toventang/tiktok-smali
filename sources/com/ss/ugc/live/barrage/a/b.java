package com.ss.ugc.live.barrage.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f154074a;

    static {
        Covode.recordClassIndex(102739);
    }

    @Override // com.ss.ugc.live.barrage.a.a
    public final Bitmap b() {
        return this.f154074a;
    }

    public b(Bitmap bitmap) {
        l.c(bitmap, "");
        this.f154074a = bitmap;
        this.f154067j.right = this.f154067j.left + ((float) bitmap.getWidth());
        this.f154067j.bottom = this.f154067j.top + ((float) bitmap.getHeight());
        this.f154065h = true;
    }
}
