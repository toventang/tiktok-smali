package com.ss.android.ttvecamera.j;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.m;
import java.util.List;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61597a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public Camera.PreviewCallback f61598b;

    /* renamed from: c  reason: collision with root package name */
    int f61599c;

    /* renamed from: d  reason: collision with root package name */
    public byte[][] f61600d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f61601e;

    /* renamed from: m  reason: collision with root package name */
    private SurfaceTexture f61602m;

    @Override // com.ss.android.ttvecamera.j.b
    public final Surface a() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int c() {
        return 4;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final void d() {
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final SurfaceTexture b() {
        return this.f61602m;
    }

    static {
        Covode.recordClassIndex(37904);
    }

    public a(c.a aVar, g gVar) {
        super(aVar, gVar);
        this.f61602m = aVar.f61620d;
    }

    @Override // com.ss.android.ttvecamera.j.b
    public final int a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f61608h = m.a(list, tEFrameSizei);
        }
        this.f61602m.setDefaultBufferSize(this.f61608h.f61374a, this.f61608h.f61375b);
        this.f61598b = new Camera.PreviewCallback() {
            /* class com.ss.android.ttvecamera.j.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37905);
            }

            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                a aVar = a.this;
                if (bArr != null && bArr.length > 0 && aVar.f61608h != null && aVar.f61599c < 3) {
                    aVar.f61599c++;
                    int i2 = aVar.f61608h.f61374a * aVar.f61608h.f61375b;
                    int i3 = i2 / 300;
                    int i4 = i3 / 2;
                    byte b2 = bArr[0];
                    byte b3 = bArr[i2];
                    int i5 = 0;
                    while (true) {
                        if (b2 != bArr[i5 * i3] || b3 != bArr[(i5 * i4) + i2]) {
                            break;
                        }
                        i5++;
                        if (i5 >= 300) {
                            break;
                        }
                    }
                }
                i iVar = new i(a.this.f61608h.f61374a, a.this.f61608h.f61375b, System.currentTimeMillis() * 1000);
                iVar.a(bArr, a.this.f61609i.G(), i.b.PIXEL_FORMAT_NV21, a.this.f61609i.o.f61802e);
                a.this.a(iVar);
                if (camera != null) {
                    camera.addCallbackBuffer(bArr);
                }
            }
        };
        return 0;
    }
}
