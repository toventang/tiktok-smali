package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.utils.AudioFrame;
import java.lang.ref.WeakReference;

public class RTCAudioFrameObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(100953);
    }

    public RTCAudioFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public void onMixedAudioFrame(byte[] bArr, int i2, int i3, int i4, int i5) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onMixedAudioFrame(new AudioFrame(bArr, i2, AudioSampleRate.fromId(i5), AudioChannel.fromId(i4)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrame(byte[] bArr, int i2, int i3, int i4, int i5) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrame(new AudioFrame(bArr, i2, AudioSampleRate.fromId(i5), AudioChannel.fromId(i4)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onRecordAudioFrame(byte[] bArr, int i2, int i3, int i4, int i5) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onRecordAudioFrame(new AudioFrame(bArr, i2, AudioSampleRate.fromId(i5), AudioChannel.fromId(i4)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrameBeforeMixing(String str, byte[] bArr, int i2, int i3, int i4, int i5) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrameBeforeMixing(str, new AudioFrame(bArr, i2, AudioSampleRate.fromId(i5), AudioChannel.fromId(i4)));
        }
    }
}
