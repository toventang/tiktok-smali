package com.ss.bytertc.engine.audio;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.utils.AudioFrame;

public abstract class IAudioMixingManager {
    static {
        Covode.recordClassIndex(100837);
    }

    public abstract void disableAudioMixingFrame();

    public abstract void enableAudioMixingFrame(AudioMixingType audioMixingType);

    public abstract int getAudioMixingCurrentPosition(int i2);

    public abstract int getAudioMixingDuration(int i2);

    public abstract void pauseAudioMixing(int i2);

    public abstract void preloadAudioMixing(int i2, String str);

    public abstract int pushAudioMixingFrame(AudioFrame audioFrame);

    public abstract void resumeAudioMixing(int i2);

    public abstract void setAudioMixingPosition(int i2, int i3);

    public abstract void setAudioMixingVolume(int i2, int i3, AudioMixingType audioMixingType);

    public abstract void startAudioMixing(int i2, String str, AudioMixingConfig audioMixingConfig);

    public abstract void stopAudioMixing(int i2);

    public abstract void unloadAudioMixing(int i2);
}
