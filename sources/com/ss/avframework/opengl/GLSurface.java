package com.ss.avframework.opengl;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.NativeObject;

public class GLSurface extends NativeObject {
    static {
        Covode.recordClassIndex(100525);
    }

    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native boolean nativeSurfaceChanged(int i2, int i3, int i4);

    public native boolean nativeSurfaceCreate(int i2, int i3, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();

    public boolean surfaceDestroy() {
        MethodCollector.i(11180);
        if (this.mNativeObj != 0) {
            boolean nativeSurfaceDestroy = nativeSurfaceDestroy();
            MethodCollector.o(11180);
            return nativeSurfaceDestroy;
        }
        MethodCollector.o(11180);
        return false;
    }
}
