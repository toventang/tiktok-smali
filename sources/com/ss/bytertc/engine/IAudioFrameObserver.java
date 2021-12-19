package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.AudioFrame;

public interface IAudioFrameObserver {
    static {
        Covode.recordClassIndex(100749);
    }

    void onMixedAudioFrame(AudioFrame audioFrame);

    void onPlaybackAudioFrame(AudioFrame audioFrame);

    void onPlaybackAudioFrameBeforeMixing(String str, AudioFrame audioFrame);

    void onRecordAudioFrame(AudioFrame audioFrame);
}
