package com.ss.avframework.capture.audio;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.utils.TEBundle;

public class AudioCapturerFromADM extends AudioCapturer {
    private AudioDeviceModule mAdm;
    private int mMode;
    AudioCapturer.AudioCaptureObserver mObserver;
    private int mStat;

    static {
        Covode.recordClassIndex(99714);
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        super.pause();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.pause();
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        super.resume();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.resume();
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void stop() {
        this.mAdm.stopRecording();
        this.mStat = 2;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mAdm.getParameter().getInt("audio_channels");
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.AudioSource, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.i(14470);
        super.release();
        this.mAdm = null;
        MethodCollector.o(14470);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void start() {
        int startRecording = this.mAdm.startRecording();
        if (startRecording == 0) {
            this.mStat = 1;
            return;
        }
        throw new IllegalStateException("Start adm audio record failure (" + startRecording + ")");
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void mute(boolean z) {
        this.mMute = z;
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicMute(z);
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void setOutputFormat(int i2, int i3, int i4) {
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("audio_channels", i3);
            parameter.setInt("audio_sample", i2);
            this.mAdm.setParameter(parameter);
        }
    }

    public AudioCapturerFromADM(int i2, AudioDeviceModule audioDeviceModule, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAdm = audioDeviceModule;
        this.mObserver = audioCaptureObserver;
        audioDeviceModule.setAudioCaptureObserver(audioCaptureObserver);
        this.mAdm.setParameter(this.mAdm.getParameter());
        setMode(i2);
    }
}
