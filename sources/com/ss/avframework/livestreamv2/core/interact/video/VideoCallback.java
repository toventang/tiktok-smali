package com.ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGLContext;

public interface VideoCallback {
    static {
        Covode.recordClassIndex(100302);
    }

    void onVideoWarning(String str);

    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i2, boolean z, float[] fArr, int i3, int i4, long j2, Object... objArr);
}
