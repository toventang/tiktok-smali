package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import org.webrtc.VideoEncoder;

class VideoEncoderWrapper {
    static {
        Covode.recordClassIndex(106706);
    }

    private static native void nativeOnEncodedFrame(long j2, ByteBuffer byteBuffer, int i2, int i3, long j3, int i4);

    VideoEncoderWrapper() {
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    static VideoEncoder.Callback createEncoderCallback(long j2) {
        return new VideoEncoderWrapper$$Lambda$0(j2);
    }

    static final /* synthetic */ void lambda$createEncoderCallback$0$VideoEncoderWrapper(long j2, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        MethodCollector.i(10070);
        nativeOnEncodedFrame(j2, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative());
        MethodCollector.o(10070);
    }
}
