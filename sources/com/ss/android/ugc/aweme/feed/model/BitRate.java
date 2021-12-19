package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.f.a.a.a.a.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class BitRate implements c, Serializable {
    private static final long serialVersionUID = 4166900069421013042L;
    @com.google.gson.a.c(a = "bit_rate")
    public int bitRate;
    @com.google.gson.a.c(a = "gear_name")
    public String gearName;
    @com.google.gson.a.c(a = "is_bytevc1")
    public int isBytevc1;
    @com.google.gson.a.c(a = "play_addr")
    public UrlModel playAddr;
    @com.google.gson.a.c(a = "quality_type")
    public int qualityType;

    static {
        Covode.recordClassIndex(59348);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public int getQualityType() {
        return this.qualityType;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public int isBytevc1() {
        return this.isBytevc1;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public int getSize() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null) {
            return (int) urlModel.getSize();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public String getChecksum() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || !(urlModel instanceof VideoUrlModel) || TextUtils.isEmpty(((VideoUrlModel) urlModel).getFileCheckSum())) {
            return null;
        }
        return ((VideoUrlModel) this.playAddr).getFileCheckSum();
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public String getUrlKey() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUrlKey())) {
            return null;
        }
        return this.playAddr.getUrlKey();
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public String toString() {
        return "BitRate{bitRate=" + this.bitRate + ", gearName='" + this.gearName + '\'' + ", qualityType=" + this.qualityType + ", isBytevc1=" + this.isBytevc1 + '}';
    }

    public void setBitRate(int i2) {
        this.bitRate = i2;
    }

    public void setBytevc1(int i2) {
        this.isBytevc1 = i2;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i2) {
        this.qualityType = i2;
    }

    public static class ExcludeStrategy implements b {
        static {
            Covode.recordClassIndex(59349);
        }

        @Override // com.google.gson.b
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.b
        public boolean shouldSkipField(com.google.gson.c cVar) {
            if (cVar.f54666a.getDeclaringClass() != BitRate.class) {
                return false;
            }
            if (cVar.f54666a.getName().equals("playAddr") || cVar.f54666a.getName().equals("playAddrBytevc1") || cVar.f54666a.getName().equals("gear_name")) {
                return true;
            }
            return false;
        }
    }
}
