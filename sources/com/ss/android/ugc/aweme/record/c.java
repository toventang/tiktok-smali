package com.ss.android.ugc.aweme.record;

import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(78230);
    }

    int getCameraOpenRetryCount();

    int getCameraPreviewRetryCount();

    boolean getCloseCameraAsyncIsOpen();

    boolean getEnablePreReleaseGPUResource();

    boolean getEnableRenderPause();
}
