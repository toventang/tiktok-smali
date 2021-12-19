package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;

public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final Object lock = new Object();

    public interface Context {
        static {
            Covode.recordClassIndex(106557);
        }

        long getNativeEglContext();
    }

    public interface EglContextChecker {
        static {
            Covode.recordClassIndex(106558);
        }

        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i2, int i3);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j2);

    static {
        Covode.recordClassIndex(106555);
    }
}
