package com.bytedance.router.dynamic;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.util.Logger;

public class ServerParam {
    private int mAid;
    private String mChannel = "";
    private String mDeviceId = "";

    static {
        Covode.recordClassIndex(26180);
    }

    public int getAid() {
        return this.mAid;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public boolean isAvailable() {
        if (this.mAid <= 0) {
            Logger.e("aid <= 0, ServerParam is unavailable!!!");
            return false;
        } else if (!TextUtils.isEmpty(this.mDeviceId)) {
            return true;
        } else {
            Logger.e("device id is empty, ServerParam is unavailable!!!");
            return false;
        }
    }

    public ServerParam(int i2, String str, String str2) {
        this.mAid = i2;
        this.mDeviceId = str;
        this.mChannel = str2;
        if (i2 <= 0) {
            Logger.e("aid must > 0, it can request server!!!");
        }
        if (TextUtils.isEmpty(this.mDeviceId)) {
            Logger.e("deviceId must be nut null, it can request server!!!");
        }
        if (this.mChannel == null) {
            this.mChannel = "";
        }
    }
}
