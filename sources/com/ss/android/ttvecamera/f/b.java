package com.ss.android.ttvecamera.f;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.o;
import java.util.List;

public final class b extends com.ss.android.ttvecamera.b.b {
    static {
        Covode.recordClassIndex(37873);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(List<Surface> list) {
        if (Build.VERSION.SDK_INT < 28 || list.size() != 1 || !this.A.R) {
            o.a("GNOBMediaVideo2Mode", "gnob media create normal session, surface size = " + list.size() + " video stable = " + this.A.R);
            return 0;
        }
        o.a("GNOBMediaVideo2Mode", "gnob media create session");
        return 57355;
    }

    public b(e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler, boolean z) {
        super.a(list, stateCallback, handler, true);
    }
}
