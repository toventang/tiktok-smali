package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class DeviceInfo {
    @c(a = "brand")
    private String brand;
    @c(a = "device")
    private String device;
    @c(a = "model")
    private String model;

    static {
        Covode.recordClassIndex(63027);
    }

    public String getBrand() {
        String str = this.brand;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getDevice() {
        String str = this.device;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getModel() {
        String str = this.model;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
