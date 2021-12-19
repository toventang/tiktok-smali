package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoDecoder;

final /* synthetic */ class VideoDecoderWrapper$$Lambda$0 implements VideoDecoder.Callback {
    private final long arg$1;

    static {
        Covode.recordClassIndex(106699);
    }

    VideoDecoderWrapper$$Lambda$0(long j2) {
        this.arg$1 = j2;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public final void onDecodedFrame(VideoFrame videoFrame) {
        VideoDecoderWrapper.lambda$createDecoderCallback$0$VideoDecoderWrapper(this.arg$1, videoFrame);
    }
}
