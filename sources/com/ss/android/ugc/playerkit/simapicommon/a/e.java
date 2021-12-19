package com.ss.android.ugc.playerkit.simapicommon.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class e implements c, Serializable {
    private static final long serialVersionUID = 4166900069421013042L;
    @com.google.gson.a.c(a = "bit_rate")
    int bitRate;
    @com.google.gson.a.c(a = "gear_name")
    String gearName;
    int isBytevc1;
    public Object origin;
    @com.google.gson.a.c(a = "play_addr")
    g playAddr;
    @com.google.gson.a.c(a = "play_addr_bytevc1")
    public g playAddrBytevc1;
    @com.google.gson.a.c(a = "quality_type")
    int qualityType;

    static {
        Covode.recordClassIndex(98032);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final int getBitRate() {
        return this.bitRate;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final String getGearName() {
        return this.gearName;
    }

    public final int getIsBytevc1() {
        return this.isBytevc1;
    }

    public final g getPlayAddr() {
        return this.playAddr;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final int getQualityType() {
        return this.qualityType;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final int isBytevc1() {
        return this.isBytevc1;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final int getSize() {
        g gVar = this.playAddr;
        if (gVar != null) {
            return (int) gVar.getSize();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final String getChecksum() {
        g gVar = this.playAddr;
        if (gVar == null || TextUtils.isEmpty(gVar.getFileCheckSum())) {
            return null;
        }
        return this.playAddr.getFileCheckSum();
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final String getUrlKey() {
        g gVar = this.playAddr;
        if (gVar == null || TextUtils.isEmpty(gVar.getUrlKey())) {
            return null;
        }
        return this.playAddr.getUrlKey();
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.c
    public final List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.bitRate * 31;
        String str = this.gearName;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i4 + i2) * 31) + this.qualityType) * 31;
        g gVar = this.playAddr;
        if (gVar != null) {
            i3 = gVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.isBytevc1) * 31;
        g gVar2 = this.playAddrBytevc1;
        if (gVar2 != null) {
            i5 = gVar2.hashCode();
        }
        return i7 + i5;
    }

    public final String toString() {
        return "SimBitRate{bitRate=" + this.bitRate + ", gearName='" + this.gearName + '\'' + ", qualityType=" + this.qualityType + ", isBytevc1=" + this.isBytevc1 + '}';
    }

    public final void setBitRate(int i2) {
        this.bitRate = i2;
    }

    public final void setBytevc1(int i2) {
        this.isBytevc1 = i2;
    }

    public final void setGearName(String str) {
        this.gearName = str;
    }

    public final void setPlayAddr(g gVar) {
        this.playAddr = gVar;
    }

    public final void setQualityType(int i2) {
        this.qualityType = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.bitRate != eVar.bitRate || this.qualityType != eVar.qualityType || this.isBytevc1 != eVar.isBytevc1) {
                return false;
            }
            String str = this.gearName;
            if (str == null ? eVar.gearName != null : !str.equals(eVar.gearName)) {
                return false;
            }
            g gVar = this.playAddr;
            if (gVar == null ? eVar.playAddr != null : !gVar.equals(eVar.playAddr)) {
                return false;
            }
            g gVar2 = this.playAddrBytevc1;
            g gVar3 = eVar.playAddrBytevc1;
            if (gVar2 != null) {
                return gVar2.equals(gVar3);
            }
            if (gVar3 == null) {
                return true;
            }
        }
        return false;
    }
}
