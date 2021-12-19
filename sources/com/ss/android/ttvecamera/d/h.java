package com.ss.android.ttvecamera.d;

import android.hardware.camera2.CaptureRequest;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.d.a;

public final class h extends b {
    static {
        Covode.recordClassIndex(37854);
    }

    public h(a.AbstractC1340a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ttvecamera.d.a, com.ss.android.ttvecamera.d.b
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
