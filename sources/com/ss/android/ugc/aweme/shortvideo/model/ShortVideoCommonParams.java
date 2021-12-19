package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ShortVideoCommonParams {
    public final String contentSource;
    public final String contentType;
    public final String creationId;
    public final String shootWay;

    static {
        Covode.recordClassIndex(84479);
    }

    public static /* synthetic */ ShortVideoCommonParams copy$default(ShortVideoCommonParams shortVideoCommonParams, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shortVideoCommonParams.shootWay;
        }
        if ((i2 & 2) != 0) {
            str2 = shortVideoCommonParams.contentSource;
        }
        if ((i2 & 4) != 0) {
            str3 = shortVideoCommonParams.contentType;
        }
        if ((i2 & 8) != 0) {
            str4 = shortVideoCommonParams.creationId;
        }
        return shortVideoCommonParams.copy(str, str2, str3, str4);
    }

    public final ShortVideoCommonParams copy(String str, String str2, String str3, String str4) {
        return new ShortVideoCommonParams(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCommonParams)) {
            return false;
        }
        ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) obj;
        return l.a(this.shootWay, shortVideoCommonParams.shootWay) && l.a(this.contentSource, shortVideoCommonParams.contentSource) && l.a(this.contentType, shortVideoCommonParams.contentType) && l.a(this.creationId, shortVideoCommonParams.creationId);
    }

    public final int hashCode() {
        String str = this.shootWay;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentSource;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.creationId;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ShortVideoCommonParams(shootWay=" + this.shootWay + ", contentSource=" + this.contentSource + ", contentType=" + this.contentType + ", creationId=" + this.creationId + ")";
    }

    public ShortVideoCommonParams(String str, String str2, String str3, String str4) {
        this.shootWay = str;
        this.contentSource = str2;
        this.contentType = str3;
        this.creationId = str4;
    }
}
