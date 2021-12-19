package com.ss.avframework.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

public class NativeAudioEffect extends NativeObject {
    static {
        Covode.recordClassIndex(99781);
    }

    private native void nativeCreate(int i2, int i3);

    public native TEBundle nativeGetParameter();

    public native int nativeProcessAudioFrame(long j2, ByteBuffer byteBuffer, int i2, int i3, int i4);

    public native void nativeSetParameter(TEBundle tEBundle);

    public TEBundle getParameter() {
        MethodCollector.i(14562);
        TEBundle nativeGetParameter = nativeGetParameter();
        MethodCollector.o(14562);
        return nativeGetParameter;
    }

    public double getPitch() {
        TEBundle parameter = getParameter();
        double d2 = parameter.getDouble("pitch_shift");
        parameter.release();
        return d2;
    }

    public void enableAutoVolume(boolean z) {
        TEBundle parameter = getParameter();
        parameter.setBool("adm_enable_karaoke_agc", z);
        setParameter(parameter);
        parameter.release();
    }

    public void enablePitchShift(boolean z) {
        TEBundle parameter = getParameter();
        parameter.setBool("adm_enable_shift_pitch", z);
        setParameter(parameter);
        parameter.release();
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.i(14569);
        nativeSetParameter(tEBundle);
        MethodCollector.o(14569);
    }

    public void setPitch(double d2) {
        TEBundle parameter = getParameter();
        parameter.setDouble("pitch_shift", d2);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanySourceLufs(float f2) {
        TEBundle parameter = getParameter();
        parameter.setDouble("source_lufs", (double) f2);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanySourcePeak(float f2) {
        TEBundle parameter = getParameter();
        parameter.setDouble("source_peak", (double) f2);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanyTargetLufs(float f2) {
        TEBundle parameter = getParameter();
        parameter.setDouble("target_lufs", (double) f2);
        setParameter(parameter);
        parameter.release();
    }

    public NativeAudioEffect(int i2, int i3) {
        MethodCollector.i(14560);
        nativeCreate(i2, i3);
        MethodCollector.o(14560);
    }

    public int process(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(14574);
        int nativeProcessAudioFrame = nativeProcessAudioFrame(this.mNativeObj, byteBuffer, i2, i3, i4);
        MethodCollector.o(14574);
        return nativeProcessAudioFrame;
    }
}
