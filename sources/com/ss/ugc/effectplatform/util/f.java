package com.ss.ugc.effectplatform.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import d.a.e.b;
import h.f.b.l;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public final class f {

    /* renamed from: i  reason: collision with root package name */
    public static final a f153953i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    EGL10 f153954a;

    /* renamed from: b  reason: collision with root package name */
    EGLDisplay f153955b;

    /* renamed from: c  reason: collision with root package name */
    EGLConfig f153956c;

    /* renamed from: d  reason: collision with root package name */
    EGLSurface f153957d;

    /* renamed from: e  reason: collision with root package name */
    EGLContext f153958e;

    /* renamed from: f  reason: collision with root package name */
    public GL10 f153959f;

    /* renamed from: g  reason: collision with root package name */
    final EGLContext f153960g = EGL10.EGL_NO_CONTEXT;

    /* renamed from: h  reason: collision with root package name */
    final boolean f153961h;

    static {
        Covode.recordClassIndex(102670);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102671);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            l.a((Object) str, "");
        } else {
            str = null;
        }
        this.f153961h = l.a((Object) "mi play", (Object) str);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!this.f153961h) {
            b.a("EGLUtils", "get gpu info error:".concat(String.valueOf(str)), null);
            return;
        }
        throw new RuntimeException(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            a("EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }
}
