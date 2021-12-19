package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.VideoDecoder;

class VideoDecoderWrapper {
    static long nativeVideoDecoder;

    static {
        Covode.recordClassIndex(106698);
    }

    private static native void nativeOnDecodedFrame(long j2, VideoFrame videoFrame);

    private static native void nativeSetDecoderInitCostTime(long j2, long j3);

    VideoDecoderWrapper() {
    }

    static VideoDecoder.Callback createDecoderCallback(long j2) {
        nativeVideoDecoder = j2;
        return new VideoDecoderWrapper$$Lambda$0(j2);
    }

    public static void SetDecoderInitCostTime(long j2) {
        MethodCollector.i(9699);
        long j3 = nativeVideoDecoder;
        if (j3 != 0) {
            nativeSetDecoderInitCostTime(j3, j2);
        }
        MethodCollector.o(9699);
    }

    static final /* synthetic */ void lambda$createDecoderCallback$0$VideoDecoderWrapper(long j2, VideoFrame videoFrame) {
        MethodCollector.i(9867);
        nativeOnDecodedFrame(j2, videoFrame);
        MethodCollector.o(9867);
    }
}
