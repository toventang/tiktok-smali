package com.ss.ttm.player;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f152056a = {12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12344};

    /* renamed from: b  reason: collision with root package name */
    final Handler f152057b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f152058c = new int[1];

    /* renamed from: d  reason: collision with root package name */
    EGLDisplay f152059d;

    /* renamed from: e  reason: collision with root package name */
    EGLContext f152060e;

    /* renamed from: f  reason: collision with root package name */
    EGLSurface f152061f;

    /* renamed from: g  reason: collision with root package name */
    SurfaceTexture f152062g;

    public final void run() {
        SurfaceTexture surfaceTexture = this.f152062g;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    static {
        Covode.recordClassIndex(101334);
    }

    public static final class a extends RuntimeException {
        static {
            Covode.recordClassIndex(101335);
        }

        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f152057b.post(this);
    }

    public e(Handler handler) {
        this.f152057b = handler;
    }
}
