package com.ss.android.ad.splash.core.video;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class h implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<SurfaceHolder.Callback> f58817a;

    static {
        Covode.recordClassIndex(36416);
    }

    public h(SurfaceHolder.Callback callback) {
        this.f58817a = new WeakReference<>(callback);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f58817a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f58817a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolder.Callback callback = this.f58817a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }
}
