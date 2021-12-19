package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;

public class DefaultABRModule implements IABRModule {
    private int mAlgoType = -1;
    private long mHandle;

    static {
        Covode.recordClassIndex(28007);
    }

    private native void _addBufferInfo(long j2, int i2, String str, long j3, long j4, long j5);

    private native long _create();

    private native double _getDoubleValue(long j2, int i2, double d2);

    private native float _getFloatValue(long j2, int i2, float f2);

    private native long _getLongValue(long j2, int i2, long j3);

    private native ABRResult _getPredict(long j2);

    private native String _getVersion();

    private native void _release(long j2);

    private native ABRResult _select(long j2, int i2, int i3);

    private native void _setDataSource(long j2, IPlayStateSupplier iPlayStateSupplier);

    private native void _setDeviceInfo(long j2, IDeviceInfo iDeviceInfo);

    private native void _setDoubleValue(long j2, int i2, double d2);

    private native void _setFloatValue(long j2, int i2, float f2);

    private native void _setInfoListener(long j2, IABRInfoListener iABRInfoListener);

    private native void _setIntValue(long j2, int i2, int i3);

    private native void _setLongValue(long j2, int i2, long j3);

    private native void _setMediaInfo(long j2, List<IVideoStream> list, List<IAudioStream> list2);

    private native void _setSRBenchmark(long j2, Map<Integer, Integer> map);

    private native void _setSRBenchmarkMap(long j2, Map<Integer, List<Integer>> map);

    private native void _setStringValue(long j2, int i2, String str);

    private native void _start(long j2, int i2, int i3);

    private native void _stop(long j2);

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult getPredict() {
        MethodCollector.i(4854);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4854);
            return null;
        }
        ABRResult _getPredict = _getPredict(j2);
        MethodCollector.o(4854);
        return _getPredict;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public String getVersion() {
        MethodCollector.i(4472);
        if (this.mHandle == 0) {
            MethodCollector.o(4472);
            return "j_2.57.0";
        }
        String _getVersion = _getVersion();
        MethodCollector.o(4472);
        return _getVersion;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void release() {
        MethodCollector.i(4869);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4869);
            return;
        }
        _release(j2);
        MethodCollector.o(4869);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void stop() {
        MethodCollector.i(4867);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4867);
            return;
        }
        _stop(j2);
        MethodCollector.o(4867);
    }

    public DefaultABRModule() {
        MethodCollector.i(4471);
        ABRJniLoader.loadLibrary();
        if (!ABRJniLoader.isLibraryLoaded) {
            MethodCollector.o(4471);
            return;
        }
        long _create = _create();
        this.mHandle = _create;
        _setIntValue(_create, 0, ABRConfig.getLogLevel());
        _setIntValue(this.mHandle, 1, ABRConfig.getSwitchSensitivity());
        _setIntValue(this.mHandle, 3, ABRConfig.getSwitchModel());
        _setIntValue(this.mHandle, 4, ABRConfig.getFixedLevel());
        _setIntValue(this.mHandle, 5, ABRConfig.getStartupModel());
        _setIntValue(this.mHandle, 37, ABRConfig.getStartupUseCache());
        _setFloatValue(this.mHandle, 8, ABRConfig.getStartupBandwidthParameter());
        _setFloatValue(this.mHandle, 9, ABRConfig.getStallPenaltyParameter());
        _setFloatValue(this.mHandle, 10, ABRConfig.getSwitchPenaltyParameter());
        _setFloatValue(this.mHandle, 11, ABRConfig.getBandwidthParameter());
        _setDoubleValue(this.mHandle, 29, ABRConfig.getStartupModelFirstParam());
        _setDoubleValue(this.mHandle, 30, ABRConfig.getStartupModelSecondParam());
        _setDoubleValue(this.mHandle, 31, ABRConfig.getStartupModelThirdParam());
        _setDoubleValue(this.mHandle, 32, ABRConfig.getStartupModelFourthParam());
        MethodCollector.o(4471);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void init(IPlayStateSupplier iPlayStateSupplier) {
        MethodCollector.i(4473);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4473);
            return;
        }
        try {
            _setDataSource(j2, iPlayStateSupplier);
            MethodCollector.o(4473);
        } catch (Throwable unused) {
            MethodCollector.o(4473);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        MethodCollector.i(4542);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4542);
            return;
        }
        _setDeviceInfo(j2, iDeviceInfo);
        MethodCollector.o(4542);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setInfoListener(IABRInfoListener iABRInfoListener) {
        MethodCollector.i(4608);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4608);
            return;
        }
        _setInfoListener(j2, iABRInfoListener);
        MethodCollector.o(4608);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmark(Map<Integer, Integer> map) {
        MethodCollector.i(4544);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4544);
            return;
        }
        _setSRBenchmark(j2, map);
        MethodCollector.o(4544);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmarkMap(Map<Integer, List<Integer>> map) {
        MethodCollector.i(4547);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4547);
            return;
        }
        _setSRBenchmarkMap(j2, map);
        MethodCollector.o(4547);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public float getFloatOption(int i2, float f2) {
        MethodCollector.i(4766);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4766);
            return f2;
        }
        float _getFloatValue = _getFloatValue(j2, i2, f2);
        MethodCollector.o(4766);
        return _getFloatValue;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult onceSelect(int i2, int i3) {
        MethodCollector.i(4853);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4853);
            return null;
        }
        ABRResult _select = _select(j2, i2, i3);
        MethodCollector.o(4853);
        return _select;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDoubleOptionForKey(int i2, double d2) {
        MethodCollector.i(4680);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4680);
            return;
        }
        _setDoubleValue(j2, i2, d2);
        MethodCollector.o(4680);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setFloatOptionForKey(int i2, float f2) {
        MethodCollector.i(4675);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4675);
            return;
        }
        _setFloatValue(j2, i2, f2);
        MethodCollector.o(4675);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setIntOptionForKey(int i2, int i3) {
        MethodCollector.i(4611);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4611);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(4611);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setLongOptionForKey(int i2, long j2) {
        MethodCollector.i(4677);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(4677);
            return;
        }
        _setLongValue(j3, i2, j2);
        MethodCollector.o(4677);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2) {
        MethodCollector.i(4540);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4540);
            return;
        }
        _setMediaInfo(j2, list, list2);
        MethodCollector.o(4540);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setStringOptionForKey(int i2, String str) {
        MethodCollector.i(4690);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4690);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(4690);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void start(int i2, int i3) {
        MethodCollector.i(4865);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4865);
            return;
        }
        this.mAlgoType = i2;
        _start(j2, i2, i3);
        MethodCollector.o(4865);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public long getLongOption(int i2, long j2) {
        MethodCollector.i(4763);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(4763);
            return j2;
        } else if (i2 == 19) {
            long j4 = (long) this.mAlgoType;
            MethodCollector.o(4763);
            return j4;
        } else {
            long _getLongValue = _getLongValue(j3, i2, j2);
            MethodCollector.o(4763);
            return _getLongValue;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void addBufferInfo(int i2, String str, long j2, long j3, long j4) {
        MethodCollector.i(4871);
        long j5 = this.mHandle;
        if (j5 == 0) {
            MethodCollector.o(4871);
            return;
        }
        _addBufferInfo(j5, i2, str, j2, j3, j4);
        MethodCollector.o(4871);
    }
}
