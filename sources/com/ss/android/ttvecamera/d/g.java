package com.ss.android.ttvecamera.d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.d.a;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.o;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g extends d {

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC1340a f61499a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f61500b;

    static {
        Covode.recordClassIndex(37851);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final int a() {
        return this.f61499a.f();
    }

    public g(a.AbstractC1340a aVar) {
        this.f61499a = aVar;
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final CameraCaptureSession.CaptureCallback a(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.g.AnonymousClass2 */

            /* renamed from: c  reason: collision with root package name */
            private boolean f61508c;

            static {
                Covode.recordClassIndex(37853);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && g.this.f61486c != null) {
                    g.this.f61486c.f61854m.a(-411, g.this.f61487d.f61802e, captureFailure.toString());
                }
                o.d("TEVideoFocus", "Manual Metering Failed: ".concat(String.valueOf(captureFailure)));
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    o.c("TEVideoFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && g.this.f61486c != null && !this.f61508c) {
                        g.this.f61486c.f61854m.a(g.this.f61486c.a(), g.this.f61487d.f61802e, "Done");
                        this.f61508c = true;
                    }
                    g.this.f61499a.g();
                }
                if (g.this.f61488e) {
                    g.this.f61488e = m.a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void b(CaptureRequest.Builder builder, Rect rect) {
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
        this.f61500b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.g.AnonymousClass1 */

            /* renamed from: d  reason: collision with root package name */
            private int f61504d = -1;

            /* renamed from: e  reason: collision with root package name */
            private boolean f61505e;

            static {
                Covode.recordClassIndex(37852);
            }

            private void a() {
                if (g.this.f61500b != null) {
                    g.this.f61500b.set(false);
                }
            }

            private void b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    g.this.f61499a.a(builder);
                }
                a();
            }

            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i2);
                o.d("TEVideoFocus", "Manual Focus capture abort ");
                g.this.f61486c.f61854m.a(-438, g.this.f61487d.f61802e, "Manual Focus capture abort ");
                b();
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                o.a("TEVideoFocus", "Focus onCaptureProgressed!");
            }

            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                o.a("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
                a();
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                o.d("TEVideoFocus", "Manual Focus Failed: ".concat(String.valueOf(captureFailure)));
                g.this.f61486c.f61854m.a(-411, g.this.f61487d.f61802e, captureFailure.toString());
                b();
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                    o.c("TEVideoFocus", "Not focus request!");
                    a();
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    o.c("TEVideoFocus", "Focus failed.");
                    a();
                    return;
                }
                if (this.f61504d != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        g.this.f61499a.a(builder);
                    } else {
                        g.this.f61499a.f();
                    }
                    if (!this.f61505e) {
                        this.f61505e = true;
                        g.this.f61486c.f61854m.a(g.this.f61486c.a(), g.this.f61487d.f61802e, "Done");
                    }
                    a();
                    o.a("TEVideoFocus", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f61505e || num.intValue() == 4 || num.intValue() == 5)) {
                    o.d("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    g.this.f61499a.f();
                }
                this.f61504d = num.intValue();
                if (g.this.f61488e) {
                    g.this.f61488e = m.a(totalCaptureResult);
                }
            }

            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j3);
                o.a("TEVideoFocus", "Focus onCaptureStarted!");
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                o.d("TEVideoFocus", "Manual Focus capture buffer lost ");
                g.this.f61486c.f61854m.a(-411, g.this.f61486c.a(), "Manual Focus capture buffer lost ");
                b();
            }
        };
    }
}
