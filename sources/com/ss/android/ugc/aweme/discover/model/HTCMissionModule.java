package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class HTCMissionModule implements Serializable {
    @c(a = "is_eligible_user")
    private final Boolean isEligibleUser;
    @c(a = "mission_id")
    private final String missionId;
    @c(a = "mission_stage")
    private final Integer missionLabelType;
    @c(a = "open_url")
    private final String openUrl;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(50902);
    }

    public HTCMissionModule() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HTCMissionModule copy$default(HTCMissionModule hTCMissionModule, String str, String str2, String str3, Boolean bool, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hTCMissionModule.missionId;
        }
        if ((i2 & 2) != 0) {
            str2 = hTCMissionModule.text;
        }
        if ((i2 & 4) != 0) {
            str3 = hTCMissionModule.openUrl;
        }
        if ((i2 & 8) != 0) {
            bool = hTCMissionModule.isEligibleUser;
        }
        if ((i2 & 16) != 0) {
            num = hTCMissionModule.missionLabelType;
        }
        return hTCMissionModule.copy(str, str2, str3, bool, num);
    }

    public final String component1() {
        return this.missionId;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final Boolean component4() {
        return this.isEligibleUser;
    }

    public final Integer component5() {
        return this.missionLabelType;
    }

    public final HTCMissionModule copy(String str, String str2, String str3, Boolean bool, Integer num) {
        return new HTCMissionModule(str, str2, str3, bool, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTCMissionModule)) {
            return false;
        }
        HTCMissionModule hTCMissionModule = (HTCMissionModule) obj;
        return l.a(this.missionId, hTCMissionModule.missionId) && l.a(this.text, hTCMissionModule.text) && l.a(this.openUrl, hTCMissionModule.openUrl) && l.a(this.isEligibleUser, hTCMissionModule.isEligibleUser) && l.a(this.missionLabelType, hTCMissionModule.missionLabelType);
    }

    public final int hashCode() {
        String str = this.missionId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.openUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.isEligibleUser;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.missionLabelType;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "HTCMissionModule(missionId=" + this.missionId + ", text=" + this.text + ", openUrl=" + this.openUrl + ", isEligibleUser=" + this.isEligibleUser + ", missionLabelType=" + this.missionLabelType + ")";
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final Integer getMissionLabelType() {
        return this.missionLabelType;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isEligibleUser() {
        return this.isEligibleUser;
    }

    public HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num) {
        this.missionId = str;
        this.text = str2;
        this.openUrl = str3;
        this.isEligibleUser = bool;
        this.missionLabelType = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? false : bool, (i2 & 16) == 0 ? num : null);
    }
}
