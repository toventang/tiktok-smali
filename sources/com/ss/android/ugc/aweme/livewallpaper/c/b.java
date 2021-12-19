package com.ss.android.ugc.aweme.livewallpaper.c;

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

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private EGLDisplay f108802a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b  reason: collision with root package name */
    private EGLContext f108803b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c  reason: collision with root package name */
    private EGLConfig f108804c;

    static {
        Covode.recordClassIndex(69694);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void finalize() {
        if (this.f108802a != EGL14.EGL_NO_DISPLAY) {
            a();
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a() {
        if (this.f108802a != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f108802a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f108802a, this.f108803b);
            int i2 = Build.VERSION.SDK_INT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f108802a);
        }
        this.f108802a = EGL14.EGL_NO_DISPLAY;
        this.f108803b = EGL14.EGL_NO_CONTEXT;
        this.f108804c = null;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a(Object obj) {
        EGL14.eglDestroySurface(this.f108802a, (EGLSurface) obj);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final boolean d(Object obj) {
        return EGL14.eglSwapBuffers(this.f108802a, (EGLSurface) obj);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!EGL14.eglMakeCurrent(this.f108802a, eGLSurface, eGLSurface, this.f108803b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    private static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final Object b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f108802a, this.f108804c, obj, new int[]{12344}, 0);
            a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        throw new RuntimeException("invalid surface: ".concat(String.valueOf(obj)));
    }

    public b(Object obj) {
        EGLConfig eGLConfig;
        if (this.f108802a == EGL14.EGL_NO_DISPLAY) {
            obj = obj == null ? EGL14.EGL_NO_CONTEXT : obj;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f108802a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = {0, 1};
                if (!EGL14.eglInitialize(this.f108802a, iArr, 0, iArr, 1)) {
                    this.f108802a = null;
                    throw new RuntimeException("unable to initialize EGL14");
                } else if (this.f108803b == EGL14.EGL_NO_CONTEXT) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f108802a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f108802a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344}, 0);
                        a("eglCreateContext");
                        this.f108804c = eGLConfig;
                        this.f108803b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL14 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final int a(Object obj, int i2) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f108802a, (EGLSurface) obj, i2, iArr, 0);
        return iArr[0];
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a(Object obj, long j2) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            EGLExt.eglPresentationTimeANDROID(this.f108802a, (EGLSurface) obj, j2);
        } catch (NoClassDefFoundError unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final Object a(int i2, int i3) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f108802a, this.f108804c, new int[]{12375, 1, 12374, 1, 12344}, 0);
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
