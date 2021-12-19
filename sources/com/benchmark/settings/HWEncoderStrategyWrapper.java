package com.benchmark.settings;

import com.benchmark.ByteBenchBundle;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.benchmark.mediacodec.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class HWEncoderStrategyWrapper {
    private long mStrategyHandle;

    static {
        Covode.recordClassIndex(3044);
    }

    private native TEMediaCodecEncodeSettings native_getSetting(long j2, TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings);

    private native String native_getVideoOutputPath(long j2);

    private native String native_getYUVPath(long j2);

    private native void native_update(long j2, long j3);

    public String getVideoOutputPath() {
        MethodCollector.i(9714);
        String native_getVideoOutputPath = native_getVideoOutputPath(this.mStrategyHandle);
        MethodCollector.o(9714);
        return native_getVideoOutputPath;
    }

    public String getYUVPath() {
        MethodCollector.i(9712);
        String native_getYUVPath = native_getYUVPath(this.mStrategyHandle);
        MethodCollector.o(9712);
        return native_getYUVPath;
    }

    public TEMediaCodecEncodeSettings getSettings() {
        MethodCollector.i(9886);
        TEMediaCodecEncodeSettings native_getSetting = native_getSetting(this.mStrategyHandle, new TEMediaCodecEncodeSettings());
        MethodCollector.o(9886);
        return native_getSetting;
    }

    public HWEncoderStrategyWrapper(long j2) {
        this.mStrategyHandle = j2;
    }

    public void update(i iVar, i iVar2, int i2) {
        MethodCollector.i(10059);
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        if (iVar.f6280b != null) {
            obtain.setInt("encode_frame_size", iVar.f6280b.length);
        } else {
            obtain.setInt("encode_frame_size", 0);
        }
        obtain.setLong("pts", iVar.f6282d);
        obtain.setBool("key_frame", iVar.f6284f);
        obtain.setBool("end_frame", iVar.f6285g);
        native_update(this.mStrategyHandle, obtain.getHandle());
        obtain.recycle();
        MethodCollector.o(10059);
    }
}
