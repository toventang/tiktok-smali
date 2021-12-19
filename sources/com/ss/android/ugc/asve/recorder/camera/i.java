package com.ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VECameraSettings;

public final class i {
    static {
        Covode.recordClassIndex(38260);
    }

    public static final VECameraSettings.CAMERA_FACING_ID a(int i2) {
        if (i2 == 0) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        if (i2 == 1) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        if (i2 == 2) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        }
        if (i2 == 3) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_3RD;
        }
        throw new IllegalStateException();
    }
}
