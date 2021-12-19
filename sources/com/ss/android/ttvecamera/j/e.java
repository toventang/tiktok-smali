package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.b;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.p;
import java.util.List;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    SurfaceTexture f61627a;

    /* renamed from: b  reason: collision with root package name */
    float[] f61628b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    int f61629c;

    /* renamed from: d  reason: collision with root package name */
    ImageReader[] f61630d;

    /* renamed from: e  reason: collision with root package name */
    Surface[] f61631e;

    static {
        Covode.recordClassIndex(37915);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int c() {
        return 8;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void d() {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final SurfaceTexture b() {
        return this.f61627a;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface[] g() {
        return this.f61631e;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface a() {
        Surface[] surfaceArr = this.f61631e;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int i() {
        if (this.f61627a != null) {
            return this.f61629c;
        }
        return super.i();
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void e() {
        Surface[] surfaceArr;
        super.e();
        ImageReader[] imageReaderArr = this.f61630d;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                imageReader.close();
            }
            this.f61630d = null;
        }
        if (!(this.f61627a == null || (surfaceArr = this.f61631e) == null || surfaceArr[0] == null)) {
            surfaceArr[0].release();
        }
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void a(SurfaceTexture surfaceTexture) {
        if (this.f61627a != null) {
            Surface[] surfaceArr = this.f61631e;
            if (!(surfaceArr == null || surfaceArr[0] == null)) {
                surfaceArr[0].release();
            }
            SurfaceTexture surfaceTexture2 = this.f61627a;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            this.f61627a = surfaceTexture;
            this.f61631e[0] = new Surface(this.f61627a);
            if (this.f61606f != null && (this.f61606f instanceof b.AbstractC1342b)) {
                ((b.AbstractC1342b) this.f61606f).a(this.f61627a);
            }
        }
    }

    public e(c.a aVar, g gVar) {
        super(aVar, gVar);
        int i2;
        this.f61627a = aVar.f61620d;
        this.f61629c = aVar.f61621e;
        this.f61630d = new ImageReader[this.f61611k];
        if (this.f61627a != null) {
            i2 = this.f61611k + 1;
        } else {
            i2 = this.f61611k;
        }
        Surface[] surfaceArr = new Surface[i2];
        this.f61631e = surfaceArr;
        if (this.f61627a != null) {
            surfaceArr[0] = new Surface(this.f61627a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    @Override // com.ss.android.ttvecamera.j.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.hardware.camera2.params.StreamConfigurationMap r6, com.ss.android.ttvecamera.TEFrameSizei r7) {
        /*
            r5 = this;
            int[] r4 = r6.getOutputFormats()
            com.ss.android.ttvecamera.i$b r0 = r5.f61607g
            int r3 = com.ss.android.ttvecamera.i.a(r0)
            int r2 = r4.length
            r0 = 0
            r0 = 0
        L_0x000d:
            if (r0 >= r2) goto L_0x0015
            r1 = r4[r0]
            if (r1 != r3) goto L_0x0028
            if (r1 != 0) goto L_0x001b
        L_0x0015:
            r1 = 35
            com.ss.android.ttvecamera.i$b r0 = com.ss.android.ttvecamera.i.b.PIXEL_FORMAT_YUV420
            r5.f61607g = r0
        L_0x001b:
            android.util.Size[] r0 = r6.getOutputSizes(r1)
            java.util.List r0 = a(r0)
            int r0 = r5.a(r0, r7)
            return r0
        L_0x0028:
            int r0 = r0 + 1
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.j.e.a(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f61608h = m.a(list, this.f61608h);
        }
        SurfaceTexture surfaceTexture = this.f61627a;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f61608h.f61374a, this.f61608h.f61375b);
        }
        for (int i2 = 0; i2 < this.f61611k; i2++) {
            this.f61630d[i2] = ImageReader.newInstance(this.f61608h.f61374a, this.f61608h.f61375b, i.a(this.f61607g), 1);
            this.f61630d[i2].setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.ss.android.ttvecamera.j.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37916);
                }

                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        i iVar = new i(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.a(new p(acquireNextImage.getPlanes()), e.this.f61609i.G(), e.this.f61607g, e.this.f61609i.u);
                        e.this.a(iVar);
                        acquireNextImage.close();
                    }
                }
            }, this.f61609i.r);
            if (this.f61627a != null) {
                this.f61631e[i2 + 1] = this.f61630d[i2].getSurface();
            } else {
                this.f61631e[i2] = this.f61630d[i2].getSurface();
            }
        }
        return 0;
    }
}
