package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MobParam {
    private final String creationId;
    private final String enterFrom;
    private final String shootWay;

    static {
        Covode.recordClassIndex(79783);
    }

    public static /* synthetic */ MobParam copy$default(MobParam mobParam, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mobParam.enterFrom;
        }
        if ((i2 & 2) != 0) {
            str2 = mobParam.shootWay;
        }
        if ((i2 & 4) != 0) {
            str3 = mobParam.creationId;
        }
        return mobParam.copy(str, str2, str3);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.shootWay;
    }

    public final String component3() {
        return this.creationId;
    }

    public final MobParam copy(String str, String str2, String str3) {
        return new MobParam(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobParam)) {
            return false;
        }
        MobParam mobParam = (MobParam) obj;
        return l.a(this.enterFrom, mobParam.enterFrom) && l.a(this.shootWay, mobParam.shootWay) && l.a(this.creationId, mobParam.creationId);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shootWay;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.creationId;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MobParam(enterFrom=" + this.enterFrom + ", shootWay=" + this.shootWay + ", creationId=" + this.creationId + ")";
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public MobParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
    }
}
