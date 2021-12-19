package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class EglBase10 implements EglBase {
    private final EGL10 egl = ((EGL10) EGLContext.getEGL());
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    static {
        Covode.recordClassIndex(106559);
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EglBase$$CC.eglContextDestoryStart$$STATIC$$();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBase$$CC.eglContextDestoryEnd$$STATIC$$();
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        MethodCollector.i(11921);
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                } finally {
                    MethodCollector.o(11921);
                }
            }
            return;
        }
        RuntimeException runtimeException = new RuntimeException("No EGLSurface - can't swap buffers");
        MethodCollector.o(11921);
        throw runtimeException;
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            throw new RuntimeException("Unable to initialize EGL10: 0x" + Integer.toHexString(this.egl.eglGetError()));
        }
        throw new RuntimeException("Unable to get EGL10 display: 0x" + Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        MethodCollector.i(11919);
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    RuntimeException runtimeException = new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                    MethodCollector.o(11919);
                    throw runtimeException;
                }
            } finally {
                MethodCollector.o(11919);
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        MethodCollector.i(11756);
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    EGL10 egl10 = this.egl;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        RuntimeException runtimeException = new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                        MethodCollector.o(11756);
                        throw runtimeException;
                    }
                } finally {
                    MethodCollector.o(11756);
                }
            }
            return;
        }
        RuntimeException runtimeException2 = new RuntimeException("No EGLSurface - can't make current");
        MethodCollector.o(11756);
        throw runtimeException2;
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j2) {
        swapBuffers();
    }

    public static class Context implements EglBase.Context {
        public final EGLContext eglContext;

        static {
            Covode.recordClassIndex(106561);
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            return 0;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) {
            /* class org.webrtc.EglBase10.AnonymousClass1FakeSurfaceHolder */
            private final Surface surface;

            static {
                Covode.recordClassIndex(106560);
            }

            public void addCallback(SurfaceHolder.Callback callback) {
            }

            public Rect getSurfaceFrame() {
                return null;
            }

            public boolean isCreating() {
                return false;
            }

            public Canvas lockCanvas() {
                return null;
            }

            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            public void setFixedSize(int i2, int i3) {
            }

            public void setFormat(int i2) {
            }

            public void setKeepScreenOn(boolean z) {
            }

            public void setSizeFromLayout() {
            }

            public void setType(int i2) {
            }

            public void unlockCanvasAndPost(Canvas canvas) {
            }

            public Surface getSurface() {
                return this.surface;
            }

            {
                this.surface = r2;
            }
        });
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                    throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
    }

    public EglBase10(Context context, int[] iArr) {
        EGLDisplay eglDisplay2 = getEglDisplay();
        this.eglDisplay = eglDisplay2;
        EGLConfig eglConfig2 = getEglConfig(eglDisplay2, iArr);
        this.eglConfig = eglConfig2;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig2);
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
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
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i2, 12374, i3, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("Failed to create pixel buffer surface with size " + i2 + "x" + i3 + ": 0x" + Integer.toHexString(this.egl.eglGetError()));
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        MethodCollector.i(12069);
        if (context == null || context.eglContext != EGL10.EGL_NO_CONTEXT) {
            int[] iArr = {12440, 2, 12344};
            if (context == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            } else {
                eGLContext = context.eglContext;
            }
            synchronized (EglBase.lock) {
                try {
                    eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
                } catch (Throwable th) {
                    MethodCollector.o(12069);
                    throw th;
                }
            }
            if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                MethodCollector.o(12069);
                return eglCreateContext;
            }
            RuntimeException runtimeException = new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(this.egl.eglGetError()));
            MethodCollector.o(12069);
            throw runtimeException;
        }
        RuntimeException runtimeException2 = new RuntimeException("Invalid sharedContext");
        MethodCollector.o(12069);
        throw runtimeException2;
    }
}
