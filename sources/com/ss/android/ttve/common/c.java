package com.ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public EGLContext f61056a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b  reason: collision with root package name */
    public EGLSurface f61057b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c  reason: collision with root package name */
    public EGLSurface f61058c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f61059d = EGL14.EGL_NO_DISPLAY;

    static {
        Covode.recordClassIndex(37607);
    }

    public final void a() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        this.f61056a = eglGetCurrentContext;
        eglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT);
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        this.f61057b = eglGetCurrentSurface;
        eglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE);
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        this.f61058c = eglGetCurrentSurface2;
        eglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE);
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        this.f61059d = eglGetCurrentDisplay;
        eglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY);
    }
}
