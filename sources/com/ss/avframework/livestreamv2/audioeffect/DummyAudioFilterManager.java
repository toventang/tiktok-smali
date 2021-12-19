package com.ss.avframework.livestreamv2.audioeffect;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import java.nio.Buffer;

public class DummyAudioFilterManager extends IAudioFilterManager {
    static {
        Covode.recordClassIndex(99954);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IAudioFilterManager
    public double getPitchShift() {
        return 0.0d;
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void initEarMonitor() {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public boolean isSupportHardWareEarMonitor() {
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IAudioFilterManager
    public String name() {
        return "DummyAudioFilter";
    }

    @Override // com.ss.avframework.engine.AudioProcessor
    public Buffer process(Buffer buffer, int i2, int i3, int i4, long j2) {
        return buffer;
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, long j2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2, long j2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMVolume(float f2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setDRCEnable(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setEchoMode(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setLoopEnable(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMixerEnable(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMusicPitch(int i2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setOriginEnable(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.filter.IAudioFilterManager
    public void setPitchShift(double d2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(String str) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(String str, String str2) {
    }

    @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setVoiceVolume(float f2) {
    }
}
