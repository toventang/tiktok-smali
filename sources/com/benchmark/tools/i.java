package com.benchmark.tools;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static int f6383a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static int f6384b = 8;

    /* renamed from: c  reason: collision with root package name */
    public static int f6385c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static int f6386d = 8;

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f6387e;

    /* renamed from: f  reason: collision with root package name */
    public EGLConfig f6388f;

    /* renamed from: g  reason: collision with root package name */
    public EGLDisplay f6389g;

    /* renamed from: h  reason: collision with root package name */
    public EGLSurface f6390h;

    static {
        Covode.recordClassIndex(3069);
    }

    public static void c() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            Integer.toHexString(eglGetError);
        }
    }

    public final boolean b() {
        EGLDisplay eGLDisplay = this.f6389g;
        EGLSurface eGLSurface = this.f6390h;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f6387e)) {
            return true;
        }
        c();
        return false;
    }

    public final void a() {
        if (this.f6389g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f6389g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f6389g, this.f6387e);
            EGL14.eglDestroySurface(this.f6389g, this.f6390h);
            EGL14.eglTerminate(this.f6389g);
        }
        this.f6389g = EGL14.EGL_NO_DISPLAY;
        this.f6390h = EGL14.EGL_NO_SURFACE;
        this.f6387e = EGL14.EGL_NO_CONTEXT;
    }
}
