package com.ss.bytertc.engine.live;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;
import org.webrtc.VideoFrame;

public class LiveTranscodingObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(100974);
    }

    public boolean isSupportClientPushStream() {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl == null || (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) == null) {
            return false;
        }
        return liveTranscodingObserver.isSupportClientPushStream();
    }

    public LiveTranscodingObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onMixingVideoFrame(VideoFrame videoFrame) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onMixingVideoFrame(videoFrame);
        }
    }

    public void onDataFrame(byte[] bArr, long j2) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onDataFrame(bArr, j2);
        }
    }

    public void onMixingAudioFrame(byte[] bArr, int i2) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onMixingAudioFrame(bArr, i2);
        }
    }

    public void onStreamMixingEvent(int i2, String str, int i3, int i4) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onStreamMixingEvent(i2, str, i3, i4);
        }
    }
}
