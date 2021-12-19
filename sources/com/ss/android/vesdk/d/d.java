package com.ss.android.vesdk.d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.vesdk.d.b;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f151261a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f151262b;

    static {
        Covode.recordClassIndex(99429);
    }

    @Override // com.ss.android.vesdk.d.b
    public final SurfaceTexture a() {
        return this.f151262b;
    }

    @Override // com.ss.android.vesdk.d.b
    public final boolean b() {
        if (!super.b() || this.f151262b == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vesdk.d.b
    public final void a(SurfaceTexture surfaceTexture) {
        this.f151262b = surfaceTexture;
    }

    public d(TEFrameSizei tEFrameSizei, b.a aVar, int i2, SurfaceTexture surfaceTexture) {
        super(i.b.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, aVar, surfaceTexture);
        this.f151261a = i2;
        this.f151262b = surfaceTexture;
    }
}
