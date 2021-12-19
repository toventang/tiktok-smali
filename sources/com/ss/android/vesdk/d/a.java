package com.ss.android.vesdk.d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.vesdk.d.b;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTexture f151250a;

    /* renamed from: b  reason: collision with root package name */
    public int f151251b;

    static {
        Covode.recordClassIndex(99424);
    }

    @Override // com.ss.android.vesdk.d.b
    public final SurfaceTexture a() {
        return this.f151250a;
    }

    @Override // com.ss.android.vesdk.d.b
    public final boolean b() {
        return super.b();
    }

    public a(TEFrameSizei tEFrameSizei, b.a aVar, SurfaceTexture surfaceTexture, int i2) {
        super(i.b.PIXEL_FORMAT_BUFFER, tEFrameSizei, aVar, surfaceTexture);
        this.f151250a = surfaceTexture;
        this.f151251b = i2;
    }
}
