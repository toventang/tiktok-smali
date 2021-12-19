package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;

public class AudioMixingManager extends IAudioMixingManager {
    private long mNativeAudioMixingManager;

    static {
        Covode.recordClassIndex(100737);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void disableAudioMixingFrame() {
        MethodCollector.i(8917);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, DisableAudioMixingFrame failed.");
            MethodCollector.o(8917);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeDisableAudioMixingFrame(j2);
        MethodCollector.o(8917);
    }

    public AudioMixingManager(long j2) {
        this.mNativeAudioMixingManager = j2;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void pauseAudioMixing(int i2) {
        MethodCollector.i(8435);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, PauseAudioMixing failed.");
            MethodCollector.o(8435);
            return;
        }
        NativeAudioMixingManagerFunctions.nativePauseAudioMixing(j2, i2);
        MethodCollector.o(8435);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void resumeAudioMixing(int i2) {
        MethodCollector.i(8436);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, ResumeAudioMixing failed.");
            MethodCollector.o(8436);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeResumeAudioMixing(j2, i2);
        MethodCollector.o(8436);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void stopAudioMixing(int i2) {
        MethodCollector.i(8430);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, StopAudioMixing failed.");
            MethodCollector.o(8430);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeStopAudioMixing(j2, i2);
        MethodCollector.o(8430);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void unloadAudioMixing(int i2) {
        MethodCollector.i(8440);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, UnloadAudioMixing failed.");
            MethodCollector.o(8440);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeUnloadAudioMixing(j2, i2);
        MethodCollector.o(8440);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void enableAudioMixingFrame(AudioMixingType audioMixingType) {
        MethodCollector.i(8645);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, EnableAudioMixingFrame failed.");
            MethodCollector.o(8645);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeEnableAudioMixingFrame(j2, audioMixingType.value());
        MethodCollector.o(8645);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public int getAudioMixingCurrentPosition(int i2) {
        MethodCollector.i(8639);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, GetAudioMixingCurrentPosition failed.");
            MethodCollector.o(8639);
            return -1;
        }
        int nativeGetAudioMixingCurrentPosition = NativeAudioMixingManagerFunctions.nativeGetAudioMixingCurrentPosition(j2, i2);
        MethodCollector.o(8639);
        return nativeGetAudioMixingCurrentPosition;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public int getAudioMixingDuration(int i2) {
        MethodCollector.i(8636);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, GetAudioMixingDuration failed.");
            MethodCollector.o(8636);
            return -1;
        }
        int nativeGetAudioMixingDuration = NativeAudioMixingManagerFunctions.nativeGetAudioMixingDuration(j2, i2);
        MethodCollector.o(8636);
        return nativeGetAudioMixingDuration;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public int pushAudioMixingFrame(AudioFrame audioFrame) {
        MethodCollector.i(9115);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, PushAudioMixingFrame failed.");
            MethodCollector.o(9115);
            return -1;
        }
        int nativePushAudioMixingFrame = NativeAudioMixingManagerFunctions.nativePushAudioMixingFrame(j2, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
        MethodCollector.o(9115);
        return nativePushAudioMixingFrame;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void preloadAudioMixing(int i2, String str) {
        MethodCollector.i(8438);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, PreloadAudioMixing failed.");
            MethodCollector.o(8438);
            return;
        }
        NativeAudioMixingManagerFunctions.nativePreloadAudioMixing(j2, i2, str);
        MethodCollector.o(8438);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void setAudioMixingPosition(int i2, int i3) {
        MethodCollector.i(8644);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, SetAudioMixingPosition failed.");
            MethodCollector.o(8644);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeSetAudioMixingPosition(j2, i2, i3);
        MethodCollector.o(8644);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void setAudioMixingVolume(int i2, int i3, AudioMixingType audioMixingType) {
        MethodCollector.i(8442);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, SetAudioMixingVolume failed.");
            MethodCollector.o(8442);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeSetAudioMixingVolume(j2, i2, i3, audioMixingType.value());
        MethodCollector.o(8442);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void startAudioMixing(int i2, String str, AudioMixingConfig audioMixingConfig) {
        MethodCollector.i(8428);
        long j2 = this.mNativeAudioMixingManager;
        if (j2 == 0) {
            LogUtil.e("AudioMixingManager", "native AudioMixingManager is invalid, StartAudioMixing failed.");
            MethodCollector.o(8428);
            return;
        }
        NativeAudioMixingManagerFunctions.nativeStartAudioMixing(j2, i2, str, audioMixingConfig.type.value(), audioMixingConfig.playCount);
        MethodCollector.o(8428);
    }
}
