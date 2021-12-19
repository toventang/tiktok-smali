package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class EglBase14 implements EglBase {
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public static int org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    static {
        Covode.recordClassIndex(106562);
    }

    @Override // org.webrtc.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public static class Context implements EglBase.Context {
        public final EGLContext egl14Context;

        static {
            Covode.recordClassIndex(106563);
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            if (EglBase14.CURRENT_SDK_VERSION >= 21) {
                return this.egl14Context.getNativeHandle();
            }
            return (long) this.egl14Context.getHandle();
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "This object has been released");
            throw new RuntimeException("This object has been released");
        }
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public static boolean isEGL14Supported() {
        boolean z;
        StringBuilder sb = new StringBuilder("SDK version: ");
        int i2 = CURRENT_SDK_VERSION;
        StringBuilder append = sb.append(i2).append(". isEGL14Supported: ");
        if (i2 >= 18) {
            z = true;
        } else {
            z = false;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_d("EglBase14", append.append(z).toString());
        if (i2 >= 18) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EglBase$$CC.eglContextDestoryStart$$STATIC$$();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBase$$CC.eglContextDestoryEnd$$STATIC$$();
        if (!GlReleaseThreadByPass.isEglReleaseThreadByPass()) {
            EGL14.eglReleaseThread();
        }
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        MethodCollector.i(10939);
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                } finally {
                    MethodCollector.o(10939);
                }
            }
            return;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "No EGLSurface - can't swap buffers");
        RuntimeException runtimeException = new RuntimeException("No EGLSurface - can't swap buffers");
        MethodCollector.o(10939);
        throw runtimeException;
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new RuntimeException("Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        throw new RuntimeException("Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        MethodCollector.i(10937);
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    RuntimeException runtimeException = new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    MethodCollector.o(10937);
                    throw runtimeException;
                }
            } finally {
                MethodCollector.o(10937);
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        MethodCollector.i(10780);
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                        RuntimeException runtimeException = new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                        MethodCollector.o(10780);
                        throw runtimeException;
                    }
                } finally {
                    MethodCollector.o(10780);
                }
            }
            return;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "No EGLSurface - can't make current");
        RuntimeException runtimeException2 = new RuntimeException("No EGLSurface - can't make current");
        MethodCollector.o(10780);
        throw runtimeException2;
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
                return;
            }
            org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Already has an EGLSurface");
            throw new RuntimeException("Already has an EGLSurface");
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Input must be either a Surface or SurfaceTexture");
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j2) {
        MethodCollector.i(10942);
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j2);
                    EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                } finally {
                    MethodCollector.o(10942);
                }
            }
            return;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "No EGLSurface - can't swap buffers");
        RuntimeException runtimeException = new RuntimeException("No EGLSurface - can't swap buffers");
        MethodCollector.o(10942);
        throw runtimeException;
    }

    public EglBase14(Context context, int[] iArr) {
        EGLDisplay eglDisplay2 = getEglDisplay();
        this.eglDisplay = eglDisplay2;
        EGLConfig eglConfig2 = getEglConfig(eglDisplay2, iArr);
        this.eglConfig = eglConfig2;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig2);
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i2, int i3) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i2, 12374, i3, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Failed to create pixel buffer surface with size " + i2 + "x" + i3 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException("Failed to create pixel buffer surface with size " + i2 + "x" + i3 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            return;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Already has an EGLSurface");
        throw new RuntimeException("Already has an EGLSurface");
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        MethodCollector.i(11421);
        if (context == null || context.egl14Context != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {12440, 2, 12344};
            if (context == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            } else {
                eGLContext = context.egl14Context;
            }
            synchronized (EglBase.lock) {
                try {
                    eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
                } catch (Throwable th) {
                    MethodCollector.o(11421);
                    throw th;
                }
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                MethodCollector.o(11421);
                return eglCreateContext;
            }
            org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
            RuntimeException runtimeException = new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
            MethodCollector.o(11421);
            throw runtimeException;
        }
        org_webrtc_EglBase14_com_ss_android_ugc_aweme_lancet_LogLancet_e("EglBase14", "Invalid sharedContext");
        RuntimeException runtimeException2 = new RuntimeException("Invalid sharedContext");
        MethodCollector.o(11421);
        throw runtimeException2;
    }
}
