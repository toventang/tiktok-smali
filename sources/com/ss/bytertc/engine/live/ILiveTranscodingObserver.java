package com.ss.bytertc.engine.live;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

public interface ILiveTranscodingObserver {
    static {
        Covode.recordClassIndex(100963);
    }

    boolean isSupportClientPushStream();

    void onDataFrame(byte[] bArr, long j2);

    void onMixingAudioFrame(byte[] bArr, int i2);

    void onMixingVideoFrame(VideoFrame videoFrame);

    void onStreamMixingEvent(int i2, String str, int i3, int i4);

    public enum StreamMixingType {
        StreamMixingTypeByServer,
        StreamMixingTypeByClient;

        static {
            Covode.recordClassIndex(100965);
        }
    }

    public enum StreamMixingEvent {
        StreamMixingChangeMixeType,
        StreamMixingFirstAudioFrameByClientMixer,
        StreamMixingFirstVideoFrameByClientMixer,
        StreamMixingStart,
        StreamMixingStartFailed,
        StreamMixingStartSuccess,
        StreamMixingStop,
        StreamMixingStopTimeout,
        StreamMixingUpdateTimeout;

        static {
            Covode.recordClassIndex(100964);
        }
    }
}
