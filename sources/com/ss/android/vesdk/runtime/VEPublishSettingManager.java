package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public class VEPublishSettingManager {

    /* renamed from: a  reason: collision with root package name */
    public VEVideoEncodeSettings f151393a;

    private native int nativeSetVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings, long j2);

    public native int nativeGetEnableRemuxErrorCode();

    public native boolean nativeIsCanRemuxVideo();

    public native boolean nativeIsUseFilterProcess();

    public native int nativeSetEditorStatus(long j2);

    public native void nativeUpdateVideoEncodeSettings();

    private VEPublishSettingManager() {
    }

    static {
        Covode.recordClassIndex(99565);
        d.a();
    }

    public enum a {
        INSTANCE;
        
        public VEPublishSettingManager vePublishSettingManager = new VEPublishSettingManager((byte) 0);

        static {
            Covode.recordClassIndex(99566);
        }

        private a(String str) {
        }
    }

    /* synthetic */ VEPublishSettingManager(byte b2) {
        this();
    }

    public final int a(VEVideoEncodeSettings vEVideoEncodeSettings, long j2) {
        MethodCollector.i(8141);
        int nativeSetVideoEncodeSettings = nativeSetVideoEncodeSettings(vEVideoEncodeSettings, j2);
        if (nativeSetVideoEncodeSettings != 0) {
            MethodCollector.o(8141);
            return nativeSetVideoEncodeSettings;
        }
        this.f151393a = vEVideoEncodeSettings;
        MethodCollector.o(8141);
        return 0;
    }
}
