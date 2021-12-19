package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IDeviceInfo {
    static {
        Covode.recordClassIndex(28014);
    }

    int getHDRInfo();

    int getHWDecodeMaxLength();

    int getScreenFps();

    int getScreenHeight();

    int getScreenWidth();
}
