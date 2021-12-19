package com.ss.ttm.player;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

public class x implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    private static final String f152127a = x.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private j f152128b;

    static {
        Covode.recordClassIndex(101378);
    }

    x(j jVar) {
        this.f152128b = jVar;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f152128b;
        if (jVar != null) {
            jVar.a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f152128b;
        if (jVar != null) {
            jVar.a();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        j jVar = this.f152128b;
        if (jVar != null) {
            jVar.b();
        }
    }
}
