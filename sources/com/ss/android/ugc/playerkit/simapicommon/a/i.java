package com.ss.android.ugc.playerkit.simapicommon.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.c;
import java.util.Collections;
import java.util.List;

public class i extends g {
    private static final long serialVersionUID = 4566748102483196885L;

    /* renamed from: a  reason: collision with root package name */
    private transient c f148874a;
    private float aspectRatio;
    @com.google.gson.a.c(a = "bit_rate")
    private List<e> bitRate;
    private long cdnUrlExpired;
    private boolean coldBoot;
    private long createTime = SystemClock.elapsedRealtime();
    @com.google.gson.a.c(a = "duration")
    private double duration;
    private String fileKey;
    private int infoId;
    private boolean isBytevc1;
    private String mDashVideoId;
    private String mDashVideoModelString;
    private boolean mVr;
    private long preloadMillSec;
    private String ratio;
    private String ratioUri;
    private String sourceId;

    static {
        Covode.recordClassIndex(98036);
    }

    public static int com_ss_android_ugc_playerkit_simapicommon_model_SimVideoUrlModel_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDashVideoId() {
        return this.mDashVideoId;
    }

    public String getDashVideoModelStr() {
        return this.mDashVideoModelString;
    }

    public double getDuration() {
        return this.duration;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public c getHitBitrate() {
        return this.f148874a;
    }

    public int getInfoId() {
        return this.infoId;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public long getPreloadMillSec() {
        return this.preloadMillSec;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public String getaK() {
        return this.aK;
    }

    public boolean isBytevc1() {
        return this.isBytevc1;
    }

    public boolean isColdBoot() {
        return this.coldBoot;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public List<e> getBitRate() {
        List<e> list = this.bitRate;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public String getRatioUri() {
        String str;
        if (this.ratioUri == null) {
            String str2 = "";
            if (isBytevc1()) {
                str = "bytevc1";
            } else {
                str = str2;
            }
            if (this.uri != null) {
                StringBuilder append = new StringBuilder().append(this.uri);
                String str3 = this.ratio;
                if (str3 != null) {
                    str2 = str3;
                }
                str2 = append.append(str2).append(str).toString();
            }
            this.ratioUri = str2;
        }
        return this.ratioUri;
    }

    public String getBitRatedRatioUri() {
        String str;
        c cVar = this.f148874a;
        if (cVar == null) {
            return getUri();
        }
        String urlKey = cVar.getUrlKey();
        com_ss_android_ugc_playerkit_simapicommon_model_SimVideoUrlModel_com_ss_android_ugc_aweme_lancet_LogLancet_d("wbp_preload_all_path", a.a("getBitRatedRatioUri hitBitrate: result:%s, bytevc1:%s", new Object[]{urlKey, Integer.valueOf(cVar.isBytevc1())}));
        if (!TextUtils.isEmpty(urlKey)) {
            return urlKey;
        }
        if (cVar.isBytevc1() == 1) {
            str = "bytevc1";
        } else {
            str = "";
        }
        return getUri() + str + "T" + cVar.getBitRate();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        String str = this.sourceId;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((hashCode + i2) * 31) + (this.isBytevc1 ? 1 : 0)) * 31;
        List<e> list = this.bitRate;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.ratioUri;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.mDashVideoModelString;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str4 = this.mDashVideoId;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i10 + i6;
    }

    public String toString() {
        return "SimVideoUrlModel{uri='" + this.uri + '\'' + ", urlList=" + this.urlList + "sourceId='" + this.sourceId + '\'' + ", ratio='" + this.ratio + '\'' + ", mVr=" + this.mVr + ", duration=" + this.duration + ", bitRate=" + this.bitRate + ", createTime=" + this.createTime + ", isBytevc1=" + this.isBytevc1 + '}';
    }

    public void setAspectRatio(float f2) {
        this.aspectRatio = f2;
    }

    public void setBitRate(List<e> list) {
        this.bitRate = list;
    }

    public void setBytevc1(boolean z) {
        this.isBytevc1 = z;
    }

    public void setCdnUrlExpired(long j2) {
        this.cdnUrlExpired = j2;
    }

    public void setColdBoot(boolean z) {
        this.coldBoot = z;
    }

    public void setDashVideoId(String str) {
        this.mDashVideoId = str;
    }

    public void setDashVideoModelStr(String str) {
        this.mDashVideoModelString = str;
    }

    public void setDuration(double d2) {
        this.duration = d2;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileKey(String str) {
        this.fileKey = str;
    }

    public void setHitBitrate(c cVar) {
        this.f148874a = cVar;
    }

    public void setInfoId(int i2) {
        this.infoId = i2;
    }

    public void setPreloadMillSec(long j2) {
        this.preloadMillSec = j2;
    }

    public i setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public i setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public void setaK(String str) {
        this.aK = str;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.a.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.isBytevc1 != iVar.isBytevc1) {
            return false;
        }
        String str = this.sourceId;
        if (str == null ? iVar.sourceId != null : !str.equals(iVar.sourceId)) {
            return false;
        }
        List<e> list = this.bitRate;
        if (list == null ? iVar.bitRate != null : !list.equals(iVar.bitRate)) {
            return false;
        }
        String str2 = this.ratioUri;
        if (str2 == null ? iVar.ratioUri != null : !str2.equals(iVar.ratioUri)) {
            return false;
        }
        String str3 = this.mDashVideoModelString;
        if (str3 == null ? iVar.mDashVideoModelString != null : !str3.equals(iVar.mDashVideoModelString)) {
            return false;
        }
        String str4 = this.mDashVideoId;
        String str5 = iVar.mDashVideoId;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }
}
