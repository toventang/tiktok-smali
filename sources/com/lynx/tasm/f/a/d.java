package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;

public final class d extends c {
    static {
        Covode.recordClassIndex(35304);
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.c, com.lynx.tasm.f.a.a
    public final void b(Canvas canvas) {
        this.f56614h.end();
        this.f56614h.setCaching(true);
        this.f56614h.setLeftTopRightBottom(this.f56608b, this.f56609c, this.f56610d, this.f56611e);
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.c, com.lynx.tasm.f.a.a
    public final Canvas b(int i2, int i3) {
        return this.f56614h.start(i2, i3);
    }
}
