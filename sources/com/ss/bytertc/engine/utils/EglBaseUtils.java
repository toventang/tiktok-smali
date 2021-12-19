package com.ss.bytertc.engine.utils;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;

public class EglBaseUtils {
    static {
        Covode.recordClassIndex(101039);
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        return eglBase.getEglBaseContext();
    }

    public static void releaseEGLBase(EglBase eglBase) {
        if (eglBase != null) {
            eglBase.release();
        }
    }

    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0;
    }

    public static EglBase createEGLBase(EGLContext eGLContext) {
        if (eGLContext == EGL14.EGL_NO_CONTEXT || eGLContext == null) {
            return EglBase$$CC.createEgl14$$STATIC$$(EglBase.CONFIG_PLAIN);
        }
        return EglBase$$CC.createEgl14$$STATIC$$(eGLContext, EglBase.CONFIG_PLAIN);
    }
}
