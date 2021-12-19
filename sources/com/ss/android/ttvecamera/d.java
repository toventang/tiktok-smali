package com.ss.android.ttvecamera;

import android.hardware.Camera;
import android.util.Pair;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public final class d {
    static {
        Covode.recordClassIndex(37839);
    }

    private static Camera a() {
        Pair<Boolean, Object> a2 = a.a(Camera.class, new Object[0], 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open();
        a.a(open, Camera.class, new Object[0], 100100, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_open()Landroid/hardware/Camera;");
        return open;
    }

    private static Camera a(int i2) {
        Pair<Boolean, Object> a2 = a.a(Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open(i2);
        a.a(open, Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    private static void a(Camera camera) {
        if (!((Boolean) a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            a.a(null, camera, new Object[0], 100106, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            a.a(null, camera, new Object[0], 100101, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    public static void a(PrivacyCert privacyCert, Camera camera) {
        if (a(privacyCert, false)) {
            a(camera);
        }
    }

    public static Camera a(PrivacyCert privacyCert, int i2) {
        if (!a(privacyCert, true)) {
            return null;
        }
        if (i2 >= 0) {
            return a(i2);
        }
        return a();
    }

    private static boolean a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                a.C0570a.a(privacyCert);
            } catch (com.bytedance.bpea.basics.a e2) {
                o.d("TECamera1PolicyAdapter", "error:" + e2.getErrorMsg() + " errorCode:" + e2.getErrorCode());
                z2 = false;
            }
        } else {
            a.C0570a.b(privacyCert);
        }
        z2 = true;
        o.a("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }
}
