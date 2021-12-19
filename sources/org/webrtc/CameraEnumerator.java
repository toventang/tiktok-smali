package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public interface CameraEnumerator {
    static {
        Covode.recordClassIndex(106539);
    }

    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
