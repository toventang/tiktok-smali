package org.webrtc;

import android.media.MediaRecorder;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import org.webrtc.CameraEnumerationAndroid;

public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        static {
            Covode.recordClassIndex(106547);
        }

        void onCameraClosed();

        void onCameraConfig(int i2, int i3, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public interface CameraSwitchHandler {
        static {
            Covode.recordClassIndex(106550);
        }

        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface MediaRecorderHandler {
        static {
            Covode.recordClassIndex(106551);
        }

        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    static {
        Covode.recordClassIndex(106545);
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(106552);
        }

        public static ORIENTATION_MODE convertFromInt(int i2) {
            return values()[i2];
        }

        private ORIENTATION_MODE(int i2) {
            this.value = i2;
        }
    }

    public static class CameraStatistics {
        private final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        static {
            Covode.recordClassIndex(106548);
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }

        private void checkThread() {
            if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper2, CameraEventsHandler cameraEventsHandler) {
            AnonymousClass1 r3 = new Runnable() {
                /* class org.webrtc.CameraVideoCapturer.CameraStatistics.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(106549);
                }

                public void run() {
                    Logging.i("CameraStatistics", "Camera fps: " + Math.round((((float) CameraStatistics.this.frameCount) * 1000.0f) / 2000.0f) + ".");
                    if (CameraStatistics.this.frameCount == 0) {
                        CameraStatistics.this.freezePeriodCount++;
                        if (CameraStatistics.this.freezePeriodCount * LiveNetAdaptiveHurryTimeSetting.DEFAULT >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            Logging.e("CameraStatistics", "Camera freezed.");
                            if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        CameraStatistics.this.freezePeriodCount = 0;
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            };
            this.cameraObserver = r3;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper2.getHandler().postDelayed(r3, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }
    }
}
