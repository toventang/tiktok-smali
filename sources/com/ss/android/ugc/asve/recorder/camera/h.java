package com.ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VECameraSettings;
import h.f.b.l;

public final class h {
    static {
        Covode.recordClassIndex(38259);
    }

    public static final boolean a(VECameraController vECameraController) {
        l.d(vECameraController, "");
        if (!b.f62211b || vECameraController.p.a() != VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
            return false;
        }
        return true;
    }

    public static final boolean b(VECameraController vECameraController) {
        l.d(vECameraController, "");
        if (!vECameraController.s || a(vECameraController)) {
            return false;
        }
        return true;
    }
}
