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

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC1340a f61468a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f61469b;

    static {
        Covode.recordClassIndex(37842);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final int a() {
        return this.f61468a.f();
    }

    public b(a.AbstractC1340a aVar) {
        this.f61468a = aVar;
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final CameraCaptureSession.CaptureCallback a(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.b.AnonymousClass2 */

            /* renamed from: c  reason: collision with root package name */
            private boolean f61477c;

            static {
                Covode.recordClassIndex(37844);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && b.this.f61486c != null) {
                    b.this.f61486c.f61854m.a(-411, b.this.f61487d.f61802e, captureFailure.toString());
                }
                o.d("TEFocusAndMeterStrategy", "Manual Metering Failed: ".concat(String.valueOf(captureFailure)));
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    o.c("TEFocusAndMeterStrategy", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && b.this.f61486c != null && !this.f61477c) {
                        b.this.f61486c.f61854m.a(b.this.f61486c.a(), b.this.f61487d.f61802e, "Done");
                        this.f61477c = true;
                    }
                    b.this.f61468a.g();
                }
                if (b.this.f61488e) {
                    b.this.f61488e = m.a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.d.a
    public void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void b(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final void a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // com.ss.android.ttvecamera.d.a
    public final CameraCaptureSession.CaptureCallback a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f61469b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.d.b.AnonymousClass1 */

            /* renamed from: d  reason: collision with root package name */
            private int f61473d = -1;

            /* renamed from: e  reason: collision with root package name */
            private boolean f61474e;

            static {
                Covode.recordClassIndex(37843);
            }

            private void a() {
                if (b.this.f61469b != null) {
                    b.this.f61469b.set(false);
                }
            }

            private void b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    b.this.f61468a.a(builder);
                }
                a();
            }

            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i2);
                o.d("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
                b.this.f61486c.f61854m.a(-438, b.this.f61487d.f61802e, "Manual Focus capture abort ");
                b();
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                o.b("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
            }

            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                o.b("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
                a();
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                o.d("TEFocusAndMeterStrategy", "Manual Focus Failed: ".concat(String.valueOf(captureFailure)));
                b.this.f61486c.f61854m.a(-411, b.this.f61487d.f61802e, captureFailure.toString());
                b();
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    o.c("TEFocusAndMeterStrategy", "Focus failed.");
                    a();
                    return;
                }
                boolean z = false;
                if (this.f61473d != num.intValue()) {
                    o.a("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = ".concat(String.valueOf(num)));
                    z = true;
                }
                this.f61473d = num.intValue();
                if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        b.this.f61468a.a(builder);
                    } else {
                        b.this.f61468a.f();
                    }
                    if (!this.f61474e) {
                        this.f61474e = true;
                        b.this.f61486c.f61854m.a(b.this.f61486c.a(), b.this.f61487d.f61802e, "Done");
                    }
                    a();
                    o.a("TEFocusAndMeterStrategy", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f61474e || num.intValue() == 4 || num.intValue() == 5)) {
                    o.d("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    b.this.f61468a.f();
                }
                if (b.this.f61488e) {
                    b.this.f61488e = m.a(totalCaptureResult);
                }
            }

            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j3);
                o.b("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                o.d("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost ");
                b.this.f61486c.f61854m.a(-411, b.this.f61486c.a(), "Manual Focus capture buffer lost ");
                b();
            }
        };
    }
}
