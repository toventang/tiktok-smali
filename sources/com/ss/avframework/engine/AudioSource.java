package com.ss.avframework.engine;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.ss.avframework.statics.StaticsReport;
import java.nio.Buffer;

public abstract class AudioSource extends MediaSource {
    public AudioDeviceModule mADM;
    private PowerObserver mObserver;

    public interface PowerObserver {
        static {
            Covode.recordClassIndex(99813);
        }

        void onCalculatePcmPowerEvent(int i2);
    }

    static {
        Covode.recordClassIndex(99812);
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i2, int i3, int i4);

    public native void nativeOnData(Buffer buffer, int i2, int i3, int i4, long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetAudioQuantizeGapPeriod(long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetMute(boolean z);

    /* access modifiers changed from: protected */
    public native void nativeSetVolume(double d2);

    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(PowerObserver powerObserver) {
        this.mObserver = powerObserver;
    }

    private void onEvent(int i2) {
        PowerObserver powerObserver = this.mObserver;
        if (powerObserver != null) {
            powerObserver.onCalculatePcmPowerEvent(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i2, int i3, int i4, long j2) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}
