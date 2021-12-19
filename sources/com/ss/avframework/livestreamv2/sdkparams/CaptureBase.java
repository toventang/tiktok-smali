package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public class CaptureBase {
    @Serialized(name = "audioCapture")
    public AudioCaptureParams audioCapture = new AudioCaptureParams();
    @Serialized(name = "videoCapture")
    public VideoCaptureParams videoCapture = new VideoCaptureParams();

    public static class AudioCaptureParams {
        public int audioCaptureBitwidth = 16;
        @Serialized(name = "audioCaptureChannel")
        public int channel = 1;
        @Serialized(name = "audioCaptureChannelOnVoIP")
        public int channelOnVoIP = 1;
        @Serialized(name = "audioCaptureDevice")
        public int device = 5;
        @Serialized(name = "audioCaptureSample")
        public int sample = 44100;
        @Serialized(name = "audioCaptureSampleOnVoIP")
        public int sampleOnVoIP = 16000;
        @Serialized(name = "audioUsingHighQuality")
        public boolean useHighQuality;

        static {
            Covode.recordClassIndex(100453);
        }
    }

    public static class VideoCaptureParams {
        @Serialized(name = "enableFaceAE")
        public boolean cameraEnableFaceAE;
        @Serialized(name = "cameraFrameFormat")
        public int cameraFrameFormat;
        @Serialized(name = "camera_log_level")
        public int cameraLogLevel;
        @Serialized(name = "camera_open_retry_cnt")
        public int cameraOpenRetryCount;
        @Serialized(name = "camera_retry_start_preview_cnt")
        public int cameraRetryStartPreviewCount;
        @Serialized(name = "videoCaptureDevice")
        public int device = 4;
        @Serialized(name = "enableCameraStabilization")
        public boolean enableCameraStabilization = true;
        @Serialized(name = "enableFallback")
        public boolean enableFallback;
        @Serialized(name = "enableWideAngle")
        public boolean enableWideAngle;
        @Serialized(name = "enableWideFov")
        public boolean enableWideFov = true;
        @Serialized(name = "videoCaptureFps")
        public int fps = 30;
        @Serialized(name = "videoCaptureHeight")
        public int height = 1280;
        @Serialized(name = "is_camera_open_close_sync")
        public boolean isCameraOpenCloseSync;
        @Serialized(name = "isForceCloseCamera")
        public boolean isForceCloseCamera;
        @Serialized(name = "videoCaptureMinFps")
        public int minFps;
        @Serialized(name = "resetFpsRange")
        public boolean resetFpsRange;
        @Serialized(name = "textureMinFilter")
        public String textureMinFilter;
        @Serialized(name = "useCamera2API")
        public boolean useCamera2Api;
        @Serialized(name = "videoCaptureWidth")
        public int width = 720;

        static {
            Covode.recordClassIndex(100454);
        }
    }

    static {
        Covode.recordClassIndex(100452);
    }
}
