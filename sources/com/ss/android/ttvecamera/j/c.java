package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.b;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61615a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public b f61616b;

    static {
        Covode.recordClassIndex(37911);
    }

    public final int a() {
        b bVar = this.f61616b;
        if (bVar != null) {
            return bVar.c();
        }
        return 0;
    }

    public final Surface b() {
        b bVar = this.f61616b;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final Surface[] c() {
        b bVar = this.f61616b;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public final SurfaceTexture d() {
        b bVar = this.f61616b;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public final TEFrameSizei e() {
        if (this.f61616b.f61610j) {
            return this.f61616b.f61608h;
        }
        return null;
    }

    public final TEFrameSizei f() {
        if (!this.f61616b.f61610j) {
            return this.f61616b.f61608h;
        }
        return new TEFrameSizei(1080, 1920);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f61617a = true;

        /* renamed from: b  reason: collision with root package name */
        public TEFrameSizei f61618b;

        /* renamed from: c  reason: collision with root package name */
        public b.a f61619c;

        /* renamed from: d  reason: collision with root package name */
        public SurfaceTexture f61620d;

        /* renamed from: e  reason: collision with root package name */
        public int f61621e;

        /* renamed from: f  reason: collision with root package name */
        public int f61622f;

        /* renamed from: g  reason: collision with root package name */
        public Surface f61623g;

        /* renamed from: h  reason: collision with root package name */
        public i.b f61624h = i.b.PIXEL_FORMAT_Count;

        static {
            Covode.recordClassIndex(37912);
        }

        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f61617a + ", mSize = " + this.f61618b + ", mListener = " + this.f61619c + ", mSurfaceTexture = " + this.f61620d + ", mTextureOES = " + this.f61621e + ", mImageReaderCount = " + this.f61622f + "]";
        }

        public a(a aVar) {
            this.f61617a = aVar.f61617a;
            this.f61618b = aVar.f61618b;
            this.f61619c = aVar.f61619c;
            this.f61620d = aVar.f61620d;
            this.f61621e = aVar.f61621e;
            this.f61622f = aVar.f61622f;
        }

        public a(TEFrameSizei tEFrameSizei, b.a aVar, boolean z, SurfaceTexture surfaceTexture, int i2) {
            this.f61618b = tEFrameSizei;
            this.f61619c = aVar;
            this.f61620d = surfaceTexture;
            this.f61621e = i2;
            this.f61617a = z;
            this.f61624h = i.b.PIXEL_FORMAT_OpenGL_OES;
        }

        public a(TEFrameSizei tEFrameSizei, b.a aVar, boolean z, SurfaceTexture surfaceTexture, int i2, Surface surface) {
            this.f61618b = tEFrameSizei;
            this.f61619c = aVar;
            this.f61620d = surfaceTexture;
            this.f61621e = i2;
            this.f61617a = z;
            this.f61624h = i.b.PIXEL_FORMAT_Recorder;
            this.f61623g = surface;
        }

        public a(TEFrameSizei tEFrameSizei, b.a aVar, boolean z, SurfaceTexture surfaceTexture, i.b bVar, int i2) {
            this.f61618b = tEFrameSizei;
            this.f61619c = aVar;
            this.f61620d = surfaceTexture;
            this.f61617a = z;
            this.f61624h = bVar;
            this.f61622f = i2;
        }
    }

    public final int a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        b bVar = this.f61616b;
        if (bVar == null) {
            return -112;
        }
        return bVar.a(streamConfigurationMap, tEFrameSizei);
    }

    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        b bVar = this.f61616b;
        if (bVar != null) {
            return bVar.a(list, tEFrameSizei);
        }
        return -112;
    }
}
