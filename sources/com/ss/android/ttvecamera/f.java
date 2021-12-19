package com.ss.android.ttvecamera;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public final class f {
    static {
        Covode.recordClassIndex(37871);
    }

    private static void a(CameraDevice cameraDevice) {
        if (!((Boolean) a.a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
            a.a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ttvecamera_TECamera2PolicyAdapter_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            cameraDevice.close();
            a.a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ttvecamera_TECamera2PolicyAdapter_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
        }
    }

    public static void a(PrivacyCert privacyCert, CameraDevice cameraDevice) {
        if (a(privacyCert, false)) {
            a(cameraDevice);
        }
    }

    private static boolean a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                a.C0570a.a(privacyCert);
            } catch (com.bytedance.bpea.basics.a e2) {
                o.d("TECamera2PolicyAdapter", "error:" + e2.getErrorMsg() + " errorCode:" + e2.getErrorCode());
                z2 = false;
            }
        } else {
            a.C0570a.b(privacyCert);
        }
        z2 = true;
        o.a("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    public static void a(PrivacyCert privacyCert, CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler) {
        if (a(privacyCert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
    }
}
