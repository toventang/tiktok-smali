package com.bytedance.android.ecommerce.ocr.c.a.a.a;

import android.hardware.Camera;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(3481);
    }

    public static int a(int i2) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        if (i2 < 0) {
            z = false;
            i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i2++;
            }
        } else {
            z = true;
        }
        if (i2 < numberOfCameras) {
            return i2;
        }
        if (z) {
            return -1;
        }
        return 0;
    }
}
