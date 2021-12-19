package com.ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f61065a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static int f61066b = 8;

    /* renamed from: c  reason: collision with root package name */
    public static int f61067c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static int f61068d = 8;

    /* renamed from: i  reason: collision with root package name */
    private static final String f61069i = e.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f61070e;

    /* renamed from: f  reason: collision with root package name */
    public EGLConfig f61071f;

    /* renamed from: g  reason: collision with root package name */
    public EGLDisplay f61072g;

    /* renamed from: h  reason: collision with root package name */
    public EGLSurface f61073h;

    public static void d() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            Integer.toHexString(eglGetError);
        }
    }

    public final boolean c() {
        return EGL14.eglSwapBuffers(this.f61072g, this.f61073h);
    }

    static {
        Covode.recordClassIndex(37610);
    }

    public final boolean b() {
        EGLDisplay eGLDisplay = this.f61072g;
        EGLSurface eGLSurface = this.f61073h;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f61070e)) {
            return true;
        }
        d();
        return false;
    }

    public final void a() {
        if (this.f61072g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f61072g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f61072g, this.f61070e);
            EGL14.eglDestroySurface(this.f61072g, this.f61073h);
            EGL14.eglTerminate(this.f61072g);
        }
        this.f61072g = EGL14.EGL_NO_DISPLAY;
        this.f61073h = EGL14.EGL_NO_SURFACE;
        this.f61070e = EGL14.EGL_NO_CONTEXT;
    }

    public final void a(long j2) {
        EGLExt.eglPresentationTimeANDROID(this.f61072g, this.f61073h, j2);
        d();
    }

    public final boolean a(Object obj) {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f61072g;
        if (!(eGLDisplay == null || (eGLSurface = this.f61073h) == null)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        int[] iArr = {12375, 0, 12374, 0, 12344};
        iArr[0] = 12344;
        iArr[2] = 12344;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f61072g, this.f61071f, obj, iArr, 0);
        this.f61073h = eglCreateWindowSurface;
        if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return b();
        }
        d();
        return false;
    }
}
