package com.ss.android.ugc.aweme.livewallpaper.c;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private EGLDisplay f108798a = EGL10.EGL_NO_DISPLAY;

    /* renamed from: b  reason: collision with root package name */
    private EGLContext f108799b = EGL10.EGL_NO_CONTEXT;

    /* renamed from: c  reason: collision with root package name */
    private EGLConfig f108800c;

    /* renamed from: d  reason: collision with root package name */
    private EGL10 f108801d = ((EGL10) EGLContext.getEGL());

    static {
        Covode.recordClassIndex(69693);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a(Object obj, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void finalize() {
        if (this.f108798a != EGL10.EGL_NO_DISPLAY) {
            a();
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a() {
        if (this.f108798a != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f108801d;
            EGLDisplay eGLDisplay = this.f108798a;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f108801d.eglDestroyContext(this.f108798a, this.f108799b);
            this.f108801d.eglTerminate(this.f108798a);
        }
        this.f108798a = EGL10.EGL_NO_DISPLAY;
        this.f108799b = EGL10.EGL_NO_CONTEXT;
        this.f108800c = null;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final boolean d(Object obj) {
        return this.f108801d.eglSwapBuffers(this.f108798a, (EGLSurface) obj);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void a(Object obj) {
        this.f108801d.eglDestroySurface(this.f108798a, (EGLSurface) obj);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final void c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!this.f108801d.eglMakeCurrent(this.f108798a, eGLSurface, eGLSurface, this.f108799b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    private void a(String str) {
        int eglGetError = this.f108801d.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final Object b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = this.f108801d.eglCreateWindowSurface(this.f108798a, this.f108800c, obj, new int[]{12344});
            a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        throw new RuntimeException("invalid surface: ".concat(String.valueOf(obj)));
    }

    public a(Object obj) {
        EGLConfig eGLConfig;
        if (this.f108798a == EGL10.EGL_NO_DISPLAY) {
            obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
            EGLDisplay eglGetDisplay = this.f108801d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f108798a = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL10 display");
            } else if (!this.f108801d.eglInitialize(this.f108798a, new int[2])) {
                this.f108798a = null;
                throw new RuntimeException("unable to initialize EGL10");
            } else if (this.f108799b == EGL10.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.f108801d.eglChooseConfig(this.f108798a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]) && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = this.f108801d.eglCreateContext(this.f108798a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344});
                    a("eglCreateContext");
                    this.f108800c = eGLConfig;
                    this.f108799b = eglCreateContext;
                    return;
                }
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final int a(Object obj, int i2) {
        int[] iArr = new int[1];
        this.f108801d.eglQuerySurface(this.f108798a, (EGLSurface) obj, i2, iArr);
        return iArr[0];
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.c
    public final Object a(int i2, int i3) {
        EGLSurface eglCreatePbufferSurface = this.f108801d.eglCreatePbufferSurface(this.f108798a, this.f108800c, new int[]{12375, 1, 12374, 1, 12344});
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
