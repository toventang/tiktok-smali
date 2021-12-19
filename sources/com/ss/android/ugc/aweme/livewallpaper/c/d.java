package com.ss.android.ugc.aweme.livewallpaper.c;

import android.opengl.EGL14;
import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    c f108805a;

    static {
        Covode.recordClassIndex(69696);
    }

    public final void a() {
        this.f108805a.a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            c cVar = this.f108805a;
            if (cVar != null) {
                cVar.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public static Object b() {
        if (i.f108812a) {
            return EGL14.eglGetCurrentContext();
        }
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public d(Object obj) {
        if (i.f108812a) {
            this.f108805a = new b(obj);
        } else {
            this.f108805a = new a(obj);
        }
    }

    public final int a(Object obj, int i2) {
        return this.f108805a.a(obj, i2);
    }
}
