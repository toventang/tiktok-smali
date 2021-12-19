package com.ss.android.ttvecamera.d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.d.a;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.o;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends d {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f61489a;

    /* renamed from: b  reason: collision with root package name */
    protected a.AbstractC1340a f61490b;

    /* renamed from: f  reason: collision with root package name */
    public boolean f61491f = true;

    static {
        Covode.recordClassIndex(37847);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final int a() {
        return this.f61490b.f();
    }

    public e(a.AbstractC1340a aVar) {
        this.f61490b = aVar;
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final CameraCaptureSession.CaptureCallback a(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37849);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && e.this.f61486c != null) {
                    e.this.f61486c.f61854m.a(-411, e.this.f61487d.f61802e, captureFailure.toString());
                }
                o.d("TEImageFocus", "Manual Metering Failed: ".concat(String.valueOf(captureFailure)));
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    o.c("TEImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && e.this.f61486c != null) {
                        e.this.f61486c.f61854m.a(e.this.f61486c.a(), e.this.f61487d.f61802e, "Done");
                    }
                    e.this.f61490b.g();
                }
                if (e.this.f61491f) {
                    e.this.f61491f = m.a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void b(CaptureRequest.Builder builder, Rect rect) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final CameraCaptureSession.CaptureCallback a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f61489a = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.e.AnonymousClass1 */

            /* renamed from: d  reason: collision with root package name */
            private int f61495d = -1;

            /* renamed from: e  reason: collision with root package name */
            private boolean f61496e;

            static {
                Covode.recordClassIndex(37848);
            }

            private void a() {
                if (e.this.f61489a != null) {
                    e.this.f61489a.set(false);
                }
            }

            private void b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    e.this.f61490b.a(builder);
                }
                a();
            }

            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i2);
                o.d("TEImageFocus", "Manual Focus capture abort ");
                e.this.f61486c.f61854m.a(-438, e.this.f61487d.f61802e, "Manual Focus capture abort ");
                b();
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                o.d("TEImageFocus", "Manual Focus Failed: ".concat(String.valueOf(captureFailure)));
                e.this.f61486c.f61854m.a(-411, e.this.f61487d.f61802e, captureFailure.toString());
                b();
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                    o.c("TEImageFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    o.c("TEImageFocus", "Focus failed.");
                    a();
                    return;
                }
                if (this.f61495d != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        e.this.f61490b.a(builder);
                    } else {
                        e.this.f61490b.f();
                    }
                    if (!this.f61496e) {
                        this.f61496e = true;
                        e.this.f61486c.f61854m.a(e.this.f61486c.a(), e.this.f61487d.f61802e, "Done");
                    }
                    a();
                    o.a("TEImageFocus", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f61496e || num.intValue() == 4 || num.intValue() == 5)) {
                    o.d("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    e.this.f61490b.f();
                }
                this.f61495d = num.intValue();
                if (e.this.f61491f) {
                    e.this.f61491f = m.a(totalCaptureResult);
                }
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                o.d("TEImageFocus", "Manual Focus capture buffer lost ");
                e.this.f61486c.f61854m.a(-411, e.this.f61487d.f61802e, "Manual Focus capture buffer lost ");
                b();
            }
        };
    }
}
