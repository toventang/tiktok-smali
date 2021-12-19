package com.ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import java.nio.Buffer;

public abstract class IAudioFilterManager extends AudioEffectProcessor {
    boolean mEnable;

    static {
        Covode.recordClassIndex(100384);
    }

    public IAudioStrangeVoice getAudioStrangeVoice() {
        return null;
    }

    public double getPitchShift() {
        return 0.0d;
    }

    public boolean isDummy() {
        return true;
    }

    public abstract String name();

    public void setPitchShift(double d2) {
    }

    public void setTranspose(int i2) {
    }

    public void setVoiceAccompanySourceLufs(float f2) {
    }

    public void setVoiceAccompanySourcePeak(float f2) {
    }

    public void setVoiceAccompanyTargetLufs(float f2) {
    }

    public void setVoiceTargetLufs(float f2) {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public static IAudioFilterManager create(Context context, Handler handler, AudioDeviceModule audioDeviceModule, LiveStreamBuilder liveStreamBuilder, IFilterManager iFilterManager) {
        return new IAudioFilterManager() {
            /* class com.ss.avframework.livestreamv2.filter.IAudioFilterManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100385);
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void initEarMonitor() {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final boolean isSupportHardWareEarMonitor() {
                return false;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IAudioFilterManager
            public final String name() {
                return "dummy";
            }

            @Override // com.ss.avframework.engine.AudioProcessor
            public final Buffer process(Buffer buffer, int i2, int i3, int i4, long j2) {
                return buffer;
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, long j2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, String str2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, String str2, long j2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMVolume(float f2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setDRCEnable(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setEchoMode(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setLoopEnable(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setMixerEnable(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setMusicPitch(int i2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setOriginEnable(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setTuningParams(String str) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setTuningParams(String str, String str2) {
            }

            @Override // com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setVoiceVolume(float f2) {
            }
        };
    }
}
