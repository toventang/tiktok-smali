package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.m;
import java.util.List;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public float[] f61633a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    int f61634b;

    /* renamed from: c  reason: collision with root package name */
    private Surface f61635c;

    /* renamed from: d  reason: collision with root package name */
    private Surface f61636d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f61637e;

    static {
        Covode.recordClassIndex(37917);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int c() {
        return 16;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface a() {
        return this.f61636d;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final SurfaceTexture b() {
        return this.f61637e;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface f() {
        return this.f61635c;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void e() {
        super.e();
        Surface surface = this.f61636d;
        if (surface != null) {
            surface.release();
            this.f61636d = null;
        }
        Surface surface2 = this.f61635c;
        if (surface2 != null) {
            surface2.release();
            this.f61635c = null;
        }
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void d() {
        Surface surface = this.f61636d;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f61637e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f61637e = new SurfaceTexture(this.f61634b);
        this.f61636d = new Surface(this.f61637e);
        this.f61606f.onNewSurfaceTexture(this.f61637e);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return a(a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    public f(c.a aVar, g gVar) {
        super(aVar, gVar);
        this.f61637e = aVar.f61620d;
        this.f61634b = aVar.f61621e;
        this.f61636d = new Surface(aVar.f61620d);
        this.f61635c = aVar.f61623g;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f61608h = m.a(list, this.f61608h);
        }
        this.f61637e.setDefaultBufferSize(this.f61608h.f61374a, this.f61608h.f61375b);
        AnonymousClass1 r2 = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.ss.android.ttvecamera.j.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37918);
            }

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (f.this.f61609i != null) {
                    surfaceTexture.getTransformMatrix(f.this.f61633a);
                    i iVar = new i(f.this.f61608h.f61374a, f.this.f61608h.f61375b, surfaceTexture.getTimestamp());
                    iVar.a(f.this.f61634b, f.this.f61609i.G(), f.this.f61633a, f.this.f61607g, f.this.f61609i.u);
                    f.this.a(iVar);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 21) {
            this.f61637e.setOnFrameAvailableListener(r2, this.f61609i.r);
            return 0;
        }
        this.f61637e.setOnFrameAvailableListener(r2);
        return 0;
    }
}
