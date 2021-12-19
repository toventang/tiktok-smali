package com.ss.ttvideoengine;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;

public final class as implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<aj> f152283a;

    static {
        Covode.recordClassIndex(101494);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    public as(aj ajVar) {
        this.f152283a = new WeakReference<>(ajVar);
        j.b("TTVideoEngineSurfaceCallback", "new surface callback:".concat(String.valueOf(this)));
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j.b("TTVideoEngineSurfaceCallback", "surfaceCreated, ".concat(String.valueOf(surfaceHolder)));
        aj ajVar = this.f152283a.get();
        if (ajVar != null) {
            ajVar.b(surfaceHolder.getSurface());
            VideoSurface videoSurface = ajVar.bn;
            if (videoSurface != null) {
                videoSurface.b(25, 1);
                j.b("TTVideoEngineSurfaceCallback", "set texturerender force draw");
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j.b("TTVideoEngineSurfaceCallback", "surfaceDestroyed, ".concat(String.valueOf(surfaceHolder)));
        aj ajVar = this.f152283a.get();
        if (ajVar != null) {
            VideoSurface videoSurface = ajVar.bn;
            if (videoSurface != null) {
                videoSurface.b(9, 1);
            }
            ajVar.b((Surface) null);
            if (videoSurface != null) {
                videoSurface.b(9, 0);
            }
        }
    }
}
