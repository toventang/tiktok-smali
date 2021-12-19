package com.ss.android.ugc.aweme.services.external.ability.camera;

import com.bytedance.covode.number.Covode;

public interface IAVESCameraInterface {
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};

    public static class CameraErrorCode {
        static {
            Covode.recordClassIndex(79675);
        }
    }

    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3;

        static {
            Covode.recordClassIndex(79676);
        }
    }

    static {
        Covode.recordClassIndex(79674);
    }
}
