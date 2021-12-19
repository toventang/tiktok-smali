package com.ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;

public class TEAudioEffectInterface {
    private long mNative;

    static {
        Covode.recordClassIndex(99520);
    }

    private native int nativeUpdateAudioDspFilterParam(long j2, int i2, int i3, VEAudioDspFilterParam vEAudioDspFilterParam);

    private native int nativeUpdateAudioEffectFilterParam(long j2, int i2, int i3, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j2, int i2, int i3, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioLoudnessBalanceFilterParam(long j2, int i2, int i3, VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter);

    private native int nativeUpdateAudioNoiseFilterParam(long j2, int i2, int i3, VEAudioNoiseFilterParam vEAudioNoiseFilterParam);

    private native int nativeUpdateAudioSamiFilterParam(long j2, int i2, int i3, VEAudioSamiFilterParam vEAudioSamiFilterParam);

    private native int nativeUpdateAudioVolumeFilterParam(long j2, int i2, int i3, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    public void clearNative() {
        this.mNative = 0;
    }

    public TEAudioEffectInterface(long j2) {
        this.mNative = j2;
    }

    public int updateAudioFilterParam(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        MethodCollector.i(7778);
        if (this.mNative == 0) {
            MethodCollector.o(7778);
            return -112;
        } else if (vEBaseFilterParam.filterName.equals("audio volume filter")) {
            int nativeUpdateAudioVolumeFilterParam = nativeUpdateAudioVolumeFilterParam(this.mNative, i2, i3, (VEAudioVolumeFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioVolumeFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio fading")) {
            int nativeUpdateAudioFadeFilterParam = nativeUpdateAudioFadeFilterParam(this.mNative, i2, i3, (VEAudioFadeFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioFadeFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio effect")) {
            int nativeUpdateAudioEffectFilterParam = nativeUpdateAudioEffectFilterParam(this.mNative, i2, i3, (VEAudioEffectFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioEffectFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio noise")) {
            int nativeUpdateAudioNoiseFilterParam = nativeUpdateAudioNoiseFilterParam(this.mNative, i2, i3, (VEAudioNoiseFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioNoiseFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("loudness balance")) {
            int nativeUpdateAudioLoudnessBalanceFilterParam = nativeUpdateAudioLoudnessBalanceFilterParam(this.mNative, i2, i3, (VEAudioLoudnessBalanceFilter) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioLoudnessBalanceFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio dsp filter")) {
            int nativeUpdateAudioDspFilterParam = nativeUpdateAudioDspFilterParam(this.mNative, i2, i3, (VEAudioDspFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioDspFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio sami filter")) {
            int nativeUpdateAudioSamiFilterParam = nativeUpdateAudioSamiFilterParam(this.mNative, i2, i3, (VEAudioSamiFilterParam) vEBaseFilterParam);
            MethodCollector.o(7778);
            return nativeUpdateAudioSamiFilterParam;
        } else {
            MethodCollector.o(7778);
            return -1;
        }
    }
}
