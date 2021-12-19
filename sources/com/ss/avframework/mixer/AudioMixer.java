package com.ss.avframework.mixer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioSink;

public class AudioMixer extends NativeMixer {
    static {
        Covode.recordClassIndex(100509);
    }

    private native void nativeAddAudioSink(long j2, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j2);

    private native void nativeRemoveAudioSink(long j2, AudioSink audioSink);

    @Override // com.ss.avframework.mixer.Mixer
    public boolean isAudioMixer() {
        return true;
    }

    public static class AudioMixerDescription {
        public float volumeCoeff;

        static {
            Covode.recordClassIndex(100510);
        }

        public float getColumeCoeff() {
            return this.volumeCoeff;
        }

        public AudioMixerDescription() {
            this.volumeCoeff = 1.0f;
        }

        public AudioMixerDescription(float f2) {
            this.volumeCoeff = f2;
        }
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(12482);
        if (this.mNativeObj != 0) {
            nativeAudioMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
        MethodCollector.o(12482);
    }

    public AudioMixer(long j2) {
        setNativeObj(j2);
    }

    public int createTrack(AudioMixerDescription audioMixerDescription) {
        return super.nativeCreateTrack(audioMixerDescription);
    }

    public AudioMixerDescription getDescription(int i2) {
        return (AudioMixerDescription) super.nativeGetDescription(i2);
    }

    public void addAudioSink(AudioSink audioSink) {
        MethodCollector.i(12343);
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
        MethodCollector.o(12343);
    }

    public void removeAudioSink(AudioSink audioSink) {
        MethodCollector.i(12481);
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
        MethodCollector.o(12481);
    }

    public void updateDescription(int i2, AudioMixerDescription audioMixerDescription) {
        super.nativeUpdateDescription(i2, audioMixerDescription);
    }
}
