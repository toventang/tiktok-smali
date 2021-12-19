package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.c;
import java.util.ArrayList;
import java.util.List;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private a f61604a = new a() {
        /* class com.ss.android.ttvecamera.j.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37907);
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onFrameCaptured(i iVar) {
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private a f61605b = new AbstractC1342b() {
        /* class com.ss.android.ttvecamera.j.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(37908);
        }

        @Override // com.ss.android.ttvecamera.j.b.AbstractC1342b
        public final void a(SurfaceTexture surfaceTexture) {
        }

        @Override // com.ss.android.ttvecamera.j.b.AbstractC1342b
        public final void a(Object obj) {
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onFrameCaptured(i iVar) {
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: f  reason: collision with root package name */
    a f61606f;

    /* renamed from: g  reason: collision with root package name */
    public i.b f61607g;

    /* renamed from: h  reason: collision with root package name */
    public TEFrameSizei f61608h = new TEFrameSizei();

    /* renamed from: i  reason: collision with root package name */
    g f61609i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f61610j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f61611k = 1;

    /* renamed from: l  reason: collision with root package name */
    public i.c f61612l;

    public interface a {
        static {
            Covode.recordClassIndex(37909);
        }

        void onFrameCaptured(i iVar);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: com.ss.android.ttvecamera.j.b$b  reason: collision with other inner class name */
    public interface AbstractC1342b extends a {
        static {
            Covode.recordClassIndex(37910);
        }

        void a(SurfaceTexture surfaceTexture);

        void a(Object obj);
    }

    static {
        Covode.recordClassIndex(37906);
    }

    public int a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    public abstract int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    public abstract Surface a();

    public abstract void a(SurfaceTexture surfaceTexture);

    public abstract SurfaceTexture b();

    public abstract int c();

    public abstract void d();

    public Surface f() {
        return null;
    }

    public Surface[] g() {
        return null;
    }

    public void h() {
    }

    public int i() {
        return -1;
    }

    public void e() {
        if (this.f61606f instanceof AbstractC1342b) {
            this.f61606f = this.f61605b;
        } else {
            this.f61606f = this.f61604a;
        }
    }

    public static List<TEFrameSizei> a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public final void a(i iVar) {
        a aVar = this.f61606f;
        if (aVar != null) {
            aVar.onFrameCaptured(iVar);
        }
    }

    public final void a(Object obj) {
        a aVar = this.f61606f;
        if (aVar != null && (aVar instanceof AbstractC1342b)) {
            ((AbstractC1342b) aVar).a(obj);
        }
    }

    public b(c.a aVar, g gVar) {
        this.f61607g = aVar.f61624h;
        this.f61606f = aVar.f61619c;
        this.f61608h = aVar.f61618b;
        this.f61609i = gVar;
        this.f61610j = aVar.f61617a;
        this.f61611k = aVar.f61622f;
    }
}
