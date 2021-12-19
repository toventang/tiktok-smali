package com.ss.android.ttvecamera.g;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class j extends e {

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Float> f61552d = new HashMap();

    static {
        Covode.recordClassIndex(37888);
    }

    public j(Context context) {
        super(context);
    }

    public final String a(CameraManager cameraManager, int i2, String[] strArr) {
        Map<String, Float> map;
        int i3;
        int i4 = 0;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i3 == i2 && i3 == 1) {
                this.f61552d.put(str, Float.valueOf(((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getHeight()));
                i4++;
            }
        }
        if (i4 < 2 || (map = this.f61552d) == null) {
            return null;
        }
        float f2 = 0.0f;
        String str2 = "";
        for (String str3 : map.keySet()) {
            float floatValue = this.f61552d.get(str3).floatValue();
            if (f2 < floatValue) {
                str2 = str3;
                f2 = floatValue;
            }
        }
        return str2;
    }
}
