package com.ss.avframework.livestreamv2.control;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IVideoCapturerControl {

    public static class Range {
        public float max;
        public float min;

        static {
            Covode.recordClassIndex(100027);
        }
    }

    static {
        Covode.recordClassIndex(100026);
    }

    void cancelAudioFocus();

    void cancelAutoFocus();

    boolean currentSupportISPControl();

    Range getExposureCompensationRange();

    float getInCaptureRealFps();

    JSONObject getRealCameraStatus();

    int queryZoomAbility(boolean z, boolean z2);

    int setExposureCompensation(float f2);

    int setFocusAreas(int i2, int i3, int i4, int i5);

    int startZoom(boolean z, float f2);

    int toggleFlashLight(boolean z);
}
