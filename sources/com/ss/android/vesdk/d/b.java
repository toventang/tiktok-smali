package com.ss.android.vesdk.d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.b;

public class b {

    /* renamed from: c  reason: collision with root package name */
    public i.b f151252c;

    /* renamed from: d  reason: collision with root package name */
    public TEFrameSizei f151253d;

    /* renamed from: e  reason: collision with root package name */
    public a f151254e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f151255f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f151256g;

    /* renamed from: h  reason: collision with root package name */
    SurfaceTexture f151257h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f151258i;

    public interface a extends b.a {
        static {
            Covode.recordClassIndex(99426);
        }

        void a(TEFrameSizei tEFrameSizei);

        @Override // com.ss.android.ttvecamera.j.b.a
        void onFrameCaptured(i iVar);

        @Override // com.ss.android.ttvecamera.j.b.a
        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: com.ss.android.vesdk.d.b$b  reason: collision with other inner class name */
    public interface AbstractC4059b extends a {
        static {
            Covode.recordClassIndex(99427);
        }

        void a(SurfaceTexture surfaceTexture, boolean z);

        void a(Object obj);
    }

    static {
        Covode.recordClassIndex(99425);
    }

    public SurfaceTexture a() {
        return this.f151257h;
    }

    public boolean b() {
        TEFrameSizei tEFrameSizei = this.f151253d;
        if (tEFrameSizei == null || tEFrameSizei.f61374a <= 0 || this.f151253d.f61375b <= 0 || this.f151254e == null) {
            return false;
        }
        return true;
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.f151257h = surfaceTexture;
    }

    public b(i.b bVar, TEFrameSizei tEFrameSizei, a aVar, SurfaceTexture surfaceTexture) {
        this.f151252c = bVar;
        this.f151253d = tEFrameSizei;
        this.f151254e = aVar;
        this.f151257h = surfaceTexture;
    }
}
