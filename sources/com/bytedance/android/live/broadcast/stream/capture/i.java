package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final EGLContext[] f8563a;

    static {
        Covode.recordClassIndex(4392);
    }

    i(EGLContext[] eGLContextArr) {
        this.f8563a = eGLContextArr;
    }

    public final void run() {
        EGLContext[] eGLContextArr = this.f8563a;
        EGL egl = EGLContext.getEGL();
        if (egl instanceof EGL10) {
            eGLContextArr[0] = ((EGL10) egl).eglGetCurrentContext();
        }
    }
}
