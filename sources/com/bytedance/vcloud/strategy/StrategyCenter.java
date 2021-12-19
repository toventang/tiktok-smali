package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class StrategyCenter {
    private boolean mDidStart;
    private long mHandle;
    private IStrategyEventListener mListener;
    private int mLogLevel = 3;

    static {
        Covode.recordClassIndex(28060);
    }

    private native void _addMedia(long j2, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z);

    private native void _businessEvent(long j2, int i2, int i3);

    private native void _businessEvent(long j2, int i2, String str);

    private native long _create(IStrategyEventListener iStrategyEventListener);

    private native void _createPlayer(long j2, long j3, String str, String str2);

    private native void _createScene(long j2, String str);

    private native void _destroyScene(long j2, String str);

    private native void _focusMedia(long j2, String str, int i2);

    private native float _getFloatValue(long j2, int i2, float f2);

    private native int _getIntValue(long j2, int i2, int i3);

    private native long _getLongValue(long j2, int i2, long j3);

    private native long _getLongValue(long j2, int i2, String str, long j3);

    private native String _getStrValue(long j2, int i2, String str);

    private native int _iPlayerVersion(long j2);

    private native boolean _isIOManagerVersionMatch(long j2);

    private native void _makeCurrentPlayer(long j2, String str);

    private native void _moveToScene(long j2, String str);

    private native void _playSelection(long j2, String str, int i2, int i3);

    private native void _release(long j2);

    private native void _releasePlayer(long j2, String str, String str2);

    private native void _removeAllMedia(long j2, String str, int i2);

    private native void _removeMedia(long j2, String str, String str2);

    private native String _selectBitrate(long j2, String str, int i2, String str2, Object obj);

    private native void _setAlgorithmJson(long j2, int i2, String str);

    private native void _setAppInfo(long j2, String str);

    private native void _setEventListener(long j2, IStrategyEventListener iStrategyEventListener);

    private native void _setFloatValue(long j2, int i2, float f2);

    private native void _setIOManager(long j2, long j3, long j4);

    private native void _setIntValue(long j2, int i2, int i3);

    private native void _setIntervalMS(long j2, int i2);

    private native void _setLogCallback(long j2, ILogCallback iLogCallback);

    private native void _setLongValue(long j2, int i2, long j3);

    private native void _setPlayTaskProgress(long j2, float f2);

    private native void _setProbeType(long j2, int i2);

    private native void _setSettingsInfo(long j2, String str, String str2);

    private native void _setStateSupplier(long j2, IStrategyStateSupplier iStrategyStateSupplier);

    private native void _setStrValue(long j2, int i2, String str);

    private native void _start(long j2);

    private native void _stop(long j2);

    private native void _updateMedia(long j2, String str, String str2, String str3);

    public static int com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public boolean isRunning() {
        return this.mDidStart;
    }

    public boolean isLoadLibrarySucceed() {
        if (this.mHandle != 0) {
            return true;
        }
        return false;
    }

    public int iPlayerVersion() {
        MethodCollector.i(563);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(563);
            return -1;
        }
        int _iPlayerVersion = _iPlayerVersion(j2);
        MethodCollector.o(563);
        return _iPlayerVersion;
    }

    public boolean isIOManagerVersionMatch() {
        MethodCollector.i(555);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(555);
            return false;
        }
        boolean _isIOManagerVersionMatch = _isIOManagerVersionMatch(j2);
        MethodCollector.o(555);
        return _isIOManagerVersionMatch;
    }

    public void stop() {
        MethodCollector.i(480);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(480);
            return;
        }
        _stop(j2);
        this.mDidStart = false;
        MethodCollector.o(480);
    }

    public StrategyCenter(IStrategyEventListener iStrategyEventListener) {
        this.mListener = iStrategyEventListener;
    }

    public void createScene(String str) {
        MethodCollector.i(545);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(545);
            return;
        }
        _createScene(j2, str);
        MethodCollector.o(545);
    }

    public void destroyScene(String str) {
        MethodCollector.i(546);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(546);
            return;
        }
        _destroyScene(j2, str);
        MethodCollector.o(546);
    }

    public void makeCurrentPlayer(String str) {
        MethodCollector.i(551);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(551);
            return;
        }
        _makeCurrentPlayer(j2, str);
        MethodCollector.o(551);
    }

    public void setAppInfo(String str) {
        MethodCollector.i(556);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(556);
            return;
        }
        _setAppInfo(j2, str);
        MethodCollector.o(556);
    }

    public void setEventListener(IStrategyEventListener iStrategyEventListener) {
        MethodCollector.i(482);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(482);
            return;
        }
        _setEventListener(j2, iStrategyEventListener);
        MethodCollector.o(482);
    }

    public void setLogCallback(ILogCallback iLogCallback) {
        MethodCollector.i(559);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(559);
            return;
        }
        _setLogCallback(j2, iLogCallback);
        MethodCollector.o(559);
    }

    public void setStateSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        MethodCollector.i(535);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(535);
            return;
        }
        _setStateSupplier(j2, iStrategyStateSupplier);
        MethodCollector.o(535);
    }

    public void switchToScene(String str) {
        MethodCollector.i(547);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(547);
            return;
        }
        _moveToScene(j2, str);
        MethodCollector.o(547);
    }

    public void create(boolean z) {
        MethodCollector.i(473);
        if (!isLoadLibrarySucceed()) {
            if (z) {
                StrategyCenterJniLoader.loadLibrary();
                if (!StrategyCenterJniLoader.isLibraryLoaded) {
                    com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_i("StrategyCenter", "load library fail.");
                    MethodCollector.o(473);
                    return;
                }
            }
            this.mHandle = _create(this.mListener);
        }
        MethodCollector.o(473);
    }

    public void start(boolean z) {
        MethodCollector.i(477);
        if (this.mDidStart) {
            MethodCollector.o(477);
            return;
        }
        create(z);
        if (this.mHandle == 0) {
            MethodCollector.o(477);
            return;
        }
        setIntValue(10000, this.mLogLevel);
        _start(this.mHandle);
        this.mDidStart = true;
        MethodCollector.o(477);
    }

    public void businessEvent(int i2, int i3) {
        MethodCollector.i(560);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(560);
            return;
        }
        _businessEvent(j2, i2, i3);
        MethodCollector.o(560);
    }

    public void focusMedia(String str, int i2) {
        MethodCollector.i(542);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(542);
            return;
        }
        _focusMedia(j2, str, i2);
        MethodCollector.o(542);
    }

    public void releasePlayer(String str, String str2) {
        MethodCollector.i(550);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(550);
            return;
        }
        _releasePlayer(j2, str, str2);
        MethodCollector.o(550);
    }

    public void removeAllMedia(String str, int i2) {
        MethodCollector.i(541);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(541);
            return;
        }
        _removeAllMedia(j2, str, i2);
        MethodCollector.o(541);
    }

    public void removeMedia(String str, String str2) {
        MethodCollector.i(538);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(538);
            return;
        }
        _removeMedia(j2, str, str2);
        MethodCollector.o(538);
    }

    public void setAlgorithmJson(int i2, String str) {
        MethodCollector.i(557);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(557);
            return;
        }
        _setAlgorithmJson(j2, i2, str);
        MethodCollector.o(557);
    }

    public void setFloatValue(int i2, float f2) {
        MethodCollector.i(534);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(534);
            return;
        }
        _setFloatValue(j2, i2, f2);
        MethodCollector.o(534);
    }

    public void setIOManager(long j2, long j3) {
        MethodCollector.i(554);
        long j4 = this.mHandle;
        if (j4 == 0) {
            MethodCollector.o(554);
            return;
        }
        _setIOManager(j4, j2, j3);
        MethodCollector.o(554);
    }

    public void setIntValue(int i2, int i3) {
        MethodCollector.i(484);
        if (i2 == 10000) {
            this.mLogLevel = i3;
        }
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(484);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(484);
    }

    public void setSettingsInfo(String str, String str2) {
        MethodCollector.i(558);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(558);
            return;
        }
        _setSettingsInfo(j2, str, str2);
        MethodCollector.o(558);
    }

    public void businessEvent(int i2, String str) {
        MethodCollector.i(561);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(561);
            return;
        }
        _businessEvent(j2, i2, str);
        MethodCollector.o(561);
    }

    public float getFloatValue(int i2, float f2) {
        MethodCollector.i(490);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(490);
            return f2;
        }
        try {
            float _getFloatValue = _getFloatValue(j2, i2, f2);
            MethodCollector.o(490);
            return _getFloatValue;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(490);
            return f2;
        }
    }

    public int getIntValue(int i2, int i3) {
        MethodCollector.i(485);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(485);
            return i3;
        }
        try {
            int _getIntValue = _getIntValue(j2, i2, i3);
            MethodCollector.o(485);
            return _getIntValue;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(485);
            return i3;
        }
    }

    public long getLongValue(int i2, long j2) {
        MethodCollector.i(499);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(499);
            return j2;
        }
        try {
            long _getLongValue = _getLongValue(j3, i2, j2);
            MethodCollector.o(499);
            return _getLongValue;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(499);
            return j2;
        }
    }

    public String getStringValue(int i2, String str) {
        MethodCollector.i(529);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(529);
            return str;
        }
        try {
            String _getStrValue = _getStrValue(j2, i2, str);
            MethodCollector.o(529);
            return _getStrValue;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(529);
            return str;
        }
    }

    public void setLongValue(int i2, long j2) {
        MethodCollector.i(497);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(497);
            return;
        }
        try {
            _setLongValue(j3, i2, j2);
            MethodCollector.o(497);
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(497);
        }
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(511);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(511);
            return;
        }
        try {
            _setStrValue(j2, i2, str);
            MethodCollector.o(511);
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(511);
        }
    }

    public void createPlayer(long j2, String str, String str2) {
        MethodCollector.i(548);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(548);
            return;
        }
        _createPlayer(j3, j2, str, str2);
        MethodCollector.o(548);
    }

    public void playSelection(String str, int i2, int i3) {
        MethodCollector.i(552);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(552);
            return;
        }
        _playSelection(j2, str, i2, i3);
        MethodCollector.o(552);
    }

    public void updateMedia(String str, String str2, String str3) {
        MethodCollector.i(543);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(543);
            return;
        }
        try {
            _updateMedia(j2, str, str2, str3);
            MethodCollector.o(543);
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(543);
        }
    }

    public long getLongValue(int i2, String str, long j2) {
        MethodCollector.i(509);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(509);
            return j2;
        }
        try {
            long _getLongValue = _getLongValue(j3, i2, str, j2);
            MethodCollector.o(509);
            return _getLongValue;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e("StrategyCenter", th.toString());
            MethodCollector.o(509);
            return j2;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z) {
        MethodCollector.i(537);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(537);
            return;
        }
        _addMedia(j2, str, iSelectBitrateListener, str2, z);
        MethodCollector.o(537);
    }

    public String selectBitrate(String str, int i2, String str2, Object obj) {
        MethodCollector.i(562);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(562);
            return null;
        }
        try {
            String _selectBitrate = _selectBitrate(j2, str, i2, str2, obj);
            MethodCollector.o(562);
            return _selectBitrate;
        } catch (Throwable th) {
            com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_i("StrategyCenter", th.toString());
            MethodCollector.o(562);
            return null;
        }
    }
}
