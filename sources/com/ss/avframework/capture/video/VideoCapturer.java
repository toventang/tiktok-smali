package com.ss.avframework.capture.video;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSource;

public abstract class VideoCapturer extends VideoSource {

    public interface VideoCapturerObserver {
        static {
            Covode.recordClassIndex(99738);
        }

        void onVideoCapturerError(int i2, Exception exc);

        void onVideoCapturerStarted();

        void onVideoCapturerStoped();
    }

    static {
        Covode.recordClassIndex(99737);
    }

    public float getInCapFps() {
        return 0.0f;
    }

    @Override // com.ss.avframework.engine.VideoSource
    public boolean isScreenCast() {
        return false;
    }

    public abstract void start(int i2, int i3, int i4);

    public abstract void stop();

    public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
        return nativeOnFrame(buffer, i2, i3, i4, j2);
    }
}
