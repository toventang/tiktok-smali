package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* access modifiers changed from: package-private */
public interface CameraSession {

    public interface CreateSessionCallback {
        static {
            Covode.recordClassIndex(106542);
        }

        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    public interface Events {
        static {
            Covode.recordClassIndex(106543);
        }

        void onCameraClosed(CameraSession cameraSession);

        void onCameraConfig(int i2, int i3, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    static {
        Covode.recordClassIndex(106540);
    }

    void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode);

    void stop();

    public enum FailureType {
        ERROR,
        DISCONNECTED;

        static {
            Covode.recordClassIndex(106544);
        }
    }
}
