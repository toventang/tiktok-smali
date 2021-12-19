package com.ss.avframework.capture.audio;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioSource;

public abstract class AudioCapturer extends AudioSource {
    private int mMode = 1;
    protected boolean mMute;

    public interface AudioCaptureObserver {
        static {
            Covode.recordClassIndex(99711);
        }

        void onAudioCaptureError(int i2, Exception exc);
    }

    static {
        Covode.recordClassIndex(99710);
    }

    public void pause() {
    }

    public void resume() {
    }

    public abstract void start();

    public abstract void stop();

    public abstract int updateChannel();

    public int getMode() {
        return this.mMode;
    }

    public boolean isMute() {
        return this.mMute;
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.AudioSource
    public synchronized void release() {
        super.release();
    }

    public void setAudioQuantizeGapPeriod(long j2) {
        nativeSetAudioQuantizeGapPeriod(j2);
    }

    public void setMode(int i2) {
        this.mMode = i2;
    }

    public void setVolume(double d2) {
        nativeSetVolume(d2);
    }

    public void mute(boolean z) {
        this.mMute = z;
        nativeSetMute(z);
    }

    public void setOutputFormat(int i2, int i3, int i4) {
        nativeAdaptedOutputFormat(i2, i3, i4);
    }
}
