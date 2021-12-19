package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoEncoder;

final /* synthetic */ class VideoEncoderWrapper$$Lambda$0 implements VideoEncoder.Callback {
    private final long arg$1;

    static {
        Covode.recordClassIndex(106707);
    }

    VideoEncoderWrapper$$Lambda$0(long j2) {
        this.arg$1 = j2;
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.lambda$createEncoderCallback$0$VideoEncoderWrapper(this.arg$1, encodedImage, codecSpecificInfo);
    }
}
