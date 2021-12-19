package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import android.view.HardwareCanvas;
import com.bytedance.covode.number.Covode;

public class c extends b {
    static {
        Covode.recordClassIndex(35303);
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.a
    public final boolean b() {
        return this.f56614h.isValid();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.a
    public final void a() {
        try {
            if (this.f56615i == null) {
                this.f56615i = Class.forName("android.view.GLES20DisplayList").getDeclaredConstructor(String.class);
                this.f56615i.setAccessible(true);
            }
            this.f56614h = (DisplayList) this.f56615i.newInstance("");
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.a
    public final void a(Canvas canvas) {
        a(canvas, this.f56614h);
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.a
    public void b(Canvas canvas) {
        ((HardwareCanvas) canvas).onPostDraw();
        this.f56614h.end();
        this.f56614h.setCaching(true);
        this.f56614h.setLeftTopRightBottom(this.f56608b, this.f56609c, this.f56610d, this.f56611e);
    }

    @Override // com.lynx.tasm.f.a.b
    public final void a(Canvas canvas, Object obj) {
        ((HardwareCanvas) canvas).drawDisplayList((DisplayList) obj, (Rect) null, 1);
    }

    @Override // com.lynx.tasm.f.a.b, com.lynx.tasm.f.a.a
    public Canvas b(int i2, int i3) {
        HardwareCanvas start = this.f56614h.start();
        a(i2, i3, start);
        start.onPreDraw((Rect) null);
        return start;
    }
}
