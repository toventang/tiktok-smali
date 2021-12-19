package com.ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class PoiMobParam implements Serializable {
    private final String contentType;
    private final String creationId;
    private String enterMethod;
    private final String shootWay;

    static {
        Covode.recordClassIndex(74160);
    }

    public PoiMobParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PoiMobParam copy$default(PoiMobParam poiMobParam, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = poiMobParam.creationId;
        }
        if ((i2 & 2) != 0) {
            str2 = poiMobParam.contentType;
        }
        if ((i2 & 4) != 0) {
            str3 = poiMobParam.shootWay;
        }
        if ((i2 & 8) != 0) {
            str4 = poiMobParam.enterMethod;
        }
        return poiMobParam.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.creationId;
    }

    public final String component2() {
        return this.contentType;
    }

    public final String component3() {
        return this.shootWay;
    }

    public final String component4() {
        return this.enterMethod;
    }

    public final PoiMobParam copy(String str, String str2, String str3, String str4) {
        return new PoiMobParam(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMobParam)) {
            return false;
        }
        PoiMobParam poiMobParam = (PoiMobParam) obj;
        return l.a(this.creationId, poiMobParam.creationId) && l.a(this.contentType, poiMobParam.contentType) && l.a(this.shootWay, poiMobParam.shootWay) && l.a(this.enterMethod, poiMobParam.enterMethod);
    }

    public final int hashCode() {
        String str = this.creationId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shootWay;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.enterMethod;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PoiMobParam(creationId=" + this.creationId + ", contentType=" + this.contentType + ", shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ")";
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public PoiMobParam(String str, String str2, String str3, String str4) {
        this.creationId = str;
        this.contentType = str2;
        this.shootWay = str3;
        this.enterMethod = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoiMobParam(String str, String str2, String str3, String str4, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4);
    }
}
