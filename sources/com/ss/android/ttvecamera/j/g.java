package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.b;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.m;
import java.util.List;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    SurfaceTexture f61639a;

    /* renamed from: b  reason: collision with root package name */
    Surface f61640b;

    /* renamed from: c  reason: collision with root package name */
    float[] f61641c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    int f61642d;

    /* renamed from: e  reason: collision with root package name */
    SurfaceTexture.OnFrameAvailableListener f61643e = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.ss.android.ttvecamera.j.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37920);
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (g.this.f61609i != null) {
                surfaceTexture.getTransformMatrix(g.this.f61641c);
                i iVar = new i(g.this.f61608h.f61374a, g.this.f61608h.f61375b, surfaceTexture.getTimestamp());
                iVar.a(g.this.f61642d, g.this.f61609i.G(), g.this.f61641c, g.this.f61607g, g.this.f61609i.u);
                iVar.f61567b = g.this.f61612l;
                g.this.a(iVar);
            }
        }
    };

    static {
        Covode.recordClassIndex(37919);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int c() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface a() {
        return this.f61640b;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final SurfaceTexture b() {
        return this.f61639a;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int i() {
        return this.f61642d;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void e() {
        super.e();
        Surface surface = this.f61640b;
        if (surface != null) {
            surface.release();
            this.f61640b = null;
        }
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void h() {
        super.h();
        this.f61643e.onFrameAvailable(this.f61639a);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void d() {
        Surface surface = this.f61640b;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f61639a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f61639a = new SurfaceTexture(this.f61642d);
        this.f61640b = new Surface(this.f61639a);
        this.f61606f.onNewSurfaceTexture(this.f61639a);
    }

    private void a(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f61639a.setOnFrameAvailableListener(onFrameAvailableListener, this.f61609i.r);
        } else {
            this.f61639a.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = this.f61640b;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.f61639a;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f61639a = surfaceTexture;
        this.f61640b = new Surface(this.f61639a);
        a(this.f61643e);
        if (this.f61606f != null && (this.f61606f instanceof b.AbstractC1342b)) {
            ((b.AbstractC1342b) this.f61606f).a(this.f61639a);
        }
    }

    public g(c.a aVar, com.ss.android.ttvecamera.g gVar) {
        super(aVar, gVar);
        this.f61639a = aVar.f61620d;
        this.f61642d = aVar.f61621e;
        this.f61640b = new Surface(this.f61639a);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f61609i.o.Y) {
            return a(a(outputSizes), tEFrameSizei);
        }
        List<TEFrameSizei> a2 = a(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
        List<TEFrameSizei> a3 = a(outputSizes);
        a3.retainAll(a2);
        return a(a3, tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f61608h = m.a(list, this.f61608h);
        }
        this.f61639a.setDefaultBufferSize(this.f61608h.f61374a, this.f61608h.f61375b);
        a(this.f61643e);
        return 0;
    }
}
