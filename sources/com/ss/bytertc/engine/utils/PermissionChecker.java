package com.ss.bytertc.engine.utils;

import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.base.utils.RtcContextUtils;

public class PermissionChecker {
    static {
        Covode.recordClassIndex(101051);
    }

    public static boolean checkAudioPermission() {
        if (b.a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (b.a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
