package com.ss.avframework.livestreamv2.core;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.RenderView;

public interface IShortVideoPushManager {
    static {
        Covode.recordClassIndex(100069);
    }

    void activeSurface(Surface surface, int i2, int i3);

    void enableVideoMirror(boolean z, boolean z2);

    Surface getSurface();

    boolean isVideoMirror(boolean z);

    void release();

    void releaseSurface(Surface surface);

    void setFitMode(boolean z);

    void setRenderView(RenderView renderView);
}
