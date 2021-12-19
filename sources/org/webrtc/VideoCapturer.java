package org.webrtc;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface VideoCapturer {
    static {
        Covode.recordClassIndex(106691);
    }

    void changeCaptureFormat(int i2, int i3, int i4);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i2, int i3, int i4);

    void startCapture(int i2, int i3, int i4, int i5);

    void stopCapture();
}
