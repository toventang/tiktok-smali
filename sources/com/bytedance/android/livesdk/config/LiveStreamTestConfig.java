package com.bytedance.android.livesdk.config;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.HashMap;
import java.util.Map;

public class LiveStreamTestConfig {
    @c(a = "defaultbBitRate")
    public int mDefaultBitrate = -1;
    @c(a = "enable")
    public boolean mEnable;
    @c(a = "fps")
    public int mFps = -1;
    @c(a = "height")
    public int mHeight = -1;
    @c(a = "maxBitRate")
    public int mMaxBitrate = -1;
    @c(a = "minBitRate")
    public int mMinBitrate = -1;
    @c(a = "mixDefaultBitRate")
    public int mMixDefaultBitrate = -1;
    @c(a = "mixMaxBitRate")
    public int mMixMaxBitrate = -1;
    @c(a = "minMinBitRate")
    public int mMixMinBitrate = -1;
    @c(a = "useHardware")
    public boolean mUseHardware = true;
    @c(a = "vCode")
    public String mVCodec = "";
    @c(a = "with")
    public int mWidth = -1;

    static {
        Covode.recordClassIndex(9266);
    }

    public Map<String, String> getStringMap() {
        HashMap hashMap = new HashMap();
        if (!this.mEnable) {
            return hashMap;
        }
        try {
            int i2 = this.mWidth;
            if (i2 > 0) {
                hashMap.put("width", String.valueOf(i2));
            }
            int i3 = this.mHeight;
            if (i3 > 0) {
                hashMap.put("height", String.valueOf(i3));
            }
            int i4 = this.mDefaultBitrate;
            if (i4 > 0) {
                hashMap.put("defaultBitrate", String.valueOf(i4));
            }
            int i5 = this.mMinBitrate;
            if (i5 > 0) {
                hashMap.put("minBitrate", String.valueOf(i5));
            }
            int i6 = this.mMaxBitrate;
            if (i6 > 0) {
                hashMap.put("maxBitrate", String.valueOf(i6));
            }
            int i7 = this.mFps;
            if (i7 > 0) {
                hashMap.put("fps", String.valueOf(i7));
            }
            if (!TextUtils.isEmpty(this.mVCodec)) {
                hashMap.put("vCodec", this.mVCodec);
            }
            hashMap.put("useHardware", String.valueOf(this.mUseHardware));
            int i8 = this.mMixMaxBitrate;
            if (i8 > 0) {
                hashMap.put("mixMaxBitrate", String.valueOf(i8));
            }
            int i9 = this.mMixDefaultBitrate;
            if (i9 > 0) {
                hashMap.put("mixDefaultBitrate", String.valueOf(i9));
            }
            int i10 = this.mMixMinBitrate;
            if (i10 > 0) {
                hashMap.put("mixMinBitrate", String.valueOf(i10));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }
}
