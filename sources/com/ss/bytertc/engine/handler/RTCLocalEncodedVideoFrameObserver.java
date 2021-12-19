package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import java.lang.ref.WeakReference;
import org.webrtc.VideoStream;

public class RTCLocalEncodedVideoFrameObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(100958);
    }

    public RTCLocalEncodedVideoFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public void onLocalEncodedVideoFrame(int i2, VideoStream videoStream, long j2, long j3, long j4, long j5, long j6, int i3, int i4, int i5) {
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (encodedVideoFrameObserver = rTCEngineImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver.onLocalEncodedVideoFrame(StreamIndex.fromId(i2), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j2, j3, j4, j5, j6, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i3), VideoPictureType.fromId(i4), VideoRotation.fromId(i5)));
        }
    }
}
