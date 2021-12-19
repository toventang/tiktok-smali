package com.ss.android.ugc.effectmanager.common.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import h.f.b.g;
import h.f.b.l;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public final class EGLUtils {
    public static final Companion Companion = new Companion(null);
    private EGL10 egl;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private GL10 gl10;
    private final boolean isMiPlay;
    private final EGLContext shareContext = EGL10.EGL_NO_CONTEXT;

    static {
        Covode.recordClassIndex(95330);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95331);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final GL10 getGl10() {
        return this.gl10;
    }

    public EGLUtils() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            l.a((Object) str, "");
        } else {
            str = null;
        }
        this.isMiPlay = l.a((Object) "mi play", (Object) str);
    }

    public final void destroy() {
        EGL10 egl10 = this.egl;
        if (egl10 == null) {
            return;
        }
        if (!this.isMiPlay) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
            egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
            egl10.eglTerminate(this.eglDisplay);
        } else if (this.eglDisplay != EGL10.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = this.eglSurface;
            if (!(eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE)) {
                EGLDisplay eGLDisplay2 = this.eglDisplay;
                EGLSurface eGLSurface3 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay3 = this.eglDisplay;
            if (eGLDisplay3 != null) {
                egl10.eglTerminate(eGLDisplay3);
                this.eglDisplay = null;
            }
        }
    }

    private final void logOrThrowException(String str) {
        if (!this.isMiPlay) {
            EPLog.e("EGLUtils", "get gpu info error:".concat(String.valueOf(str)));
            return;
        }
        throw new RuntimeException(str);
    }

    private final void checkError(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            logOrThrowException("EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public final void eglInit(int i2, int i3) {
        GL gl;
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGL egl2 = EGLContext.getEGL();
        GL10 gl102 = null;
        if (!(egl2 instanceof EGL10)) {
            egl2 = null;
        }
        EGL10 egl10 = (EGL10) egl2;
        if (egl10 != null) {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                logOrThrowException("unable to get EGL10 display");
            }
            checkError(egl10);
            if (!egl10.eglInitialize(this.eglDisplay, new int[2])) {
                logOrThrowException("unable to initialize EGL10");
            }
            checkError(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.eglDisplay, iArr, null, 0, iArr2)) {
                logOrThrowException("eglChooseConfig failed");
            }
            checkError(egl10);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
            if (!egl10.eglChooseConfig(this.eglDisplay, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                logOrThrowException("eglChooseConfig#2 failed");
            }
            checkError(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.eglConfig = eGLConfig;
            if (eGLConfig == null) {
                logOrThrowException("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i2, 12374, i3, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || this.eglSurface == null) {
                logOrThrowException("surface was null");
            }
            checkError(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.shareContext, new int[]{12440, 2, 12344});
            this.eglContext = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || this.eglContext == null) {
                logOrThrowException("context was null");
            }
            checkError(egl10);
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                logOrThrowException("eglMakeCurrent failed");
            }
            checkError(egl10);
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                gl = eGLContext.getGL();
            } else {
                gl = null;
            }
            if (gl instanceof GL10) {
                gl102 = gl;
            }
            this.gl10 = gl102;
            this.egl = egl10;
        }
    }
}
