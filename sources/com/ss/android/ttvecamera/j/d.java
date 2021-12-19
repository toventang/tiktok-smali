package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.p;
import java.util.List;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    ImageReader f61625a;

    static {
        Covode.recordClassIndex(37913);
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final SurfaceTexture b() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int c() {
        return 2;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void d() {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface a() {
        ImageReader imageReader = this.f61625a;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void e() {
        super.e();
        ImageReader imageReader = this.f61625a;
        if (imageReader != null) {
            imageReader.close();
            this.f61625a = null;
        }
    }

    public d(c.a aVar, g gVar) {
        super(aVar, gVar);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.j.d.a(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f61608h = m.a(list, this.f61608h);
        }
        ImageReader imageReader = this.f61625a;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.f61608h.f61374a, this.f61608h.f61375b, i.a(this.f61607g), 1);
        this.f61625a = newInstance;
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.ss.android.ttvecamera.j.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37914);
            }

            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    try {
                        i iVar = new i(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.a(new p(acquireLatestImage.getPlanes()), d.this.f61609i.G(), d.this.f61607g, d.this.f61609i.u);
                        d.this.a(iVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    } finally {
                        acquireLatestImage.close();
                    }
                }
            }
        }, this.f61609i.r);
        return 0;
    }
}
