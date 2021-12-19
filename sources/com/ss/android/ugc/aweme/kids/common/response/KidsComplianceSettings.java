package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class KidsComplianceSettings {
    @c(a = "settings_black_menu_list")
    private final List<String> blackSetting;
    @c(a = "cmpl_enc")
    private final String complianceEncrypt;
    @c(a = "interface_control_settings")
    private final String interfaceControlSettingsString;
    @c(a = "kids_log_events")
    private final List<String> kidsEvents;
    @c(a = "km_report_reasons")
    private final String kmReportReasons;
    @c(a = "policy_notice_enable")
    private final Boolean policyNoticeEnable;
    @c(a = "about_privacy_policy_url")
    private final String privacyPolicyUrl;
    @c(a = "screen_time_management_self")
    private Integer timeLockSelfInMin;
    @c(a = "wellbeing_setting")
    private final KidsWellbeingSetting wellbeingSetting;

    static {
        Covode.recordClassIndex(67768);
    }

    public KidsComplianceSettings() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsComplianceSettings copy$default(KidsComplianceSettings kidsComplianceSettings, List list, String str, Integer num, String str2, Boolean bool, List list2, String str3, String str4, KidsWellbeingSetting kidsWellbeingSetting, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = kidsComplianceSettings.blackSetting;
        }
        if ((i2 & 2) != 0) {
            str = kidsComplianceSettings.complianceEncrypt;
        }
        if ((i2 & 4) != 0) {
            num = kidsComplianceSettings.timeLockSelfInMin;
        }
        if ((i2 & 8) != 0) {
            str2 = kidsComplianceSettings.privacyPolicyUrl;
        }
        if ((i2 & 16) != 0) {
            bool = kidsComplianceSettings.policyNoticeEnable;
        }
        if ((i2 & 32) != 0) {
            list2 = kidsComplianceSettings.kidsEvents;
        }
        if ((i2 & 64) != 0) {
            str3 = kidsComplianceSettings.interfaceControlSettingsString;
        }
        if ((i2 & 128) != 0) {
            str4 = kidsComplianceSettings.kmReportReasons;
        }
        if ((i2 & 256) != 0) {
            kidsWellbeingSetting = kidsComplianceSettings.wellbeingSetting;
        }
        return kidsComplianceSettings.copy(list, str, num, str2, bool, list2, str3, str4, kidsWellbeingSetting);
    }

    public final List<String> component1() {
        return this.blackSetting;
    }

    public final String component2() {
        return this.complianceEncrypt;
    }

    public final Integer component3() {
        return this.timeLockSelfInMin;
    }

    public final String component4() {
        return this.privacyPolicyUrl;
    }

    public final Boolean component5() {
        return this.policyNoticeEnable;
    }

    public final List<String> component6() {
        return this.kidsEvents;
    }

    public final String component7() {
        return this.interfaceControlSettingsString;
    }

    public final String component8() {
        return this.kmReportReasons;
    }

    public final KidsWellbeingSetting component9() {
        return this.wellbeingSetting;
    }

    public final KidsComplianceSettings copy(List<String> list, String str, Integer num, String str2, Boolean bool, List<String> list2, String str3, String str4, KidsWellbeingSetting kidsWellbeingSetting) {
        return new KidsComplianceSettings(list, str, num, str2, bool, list2, str3, str4, kidsWellbeingSetting);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsComplianceSettings)) {
            return false;
        }
        KidsComplianceSettings kidsComplianceSettings = (KidsComplianceSettings) obj;
        return l.a(this.blackSetting, kidsComplianceSettings.blackSetting) && l.a(this.complianceEncrypt, kidsComplianceSettings.complianceEncrypt) && l.a(this.timeLockSelfInMin, kidsComplianceSettings.timeLockSelfInMin) && l.a(this.privacyPolicyUrl, kidsComplianceSettings.privacyPolicyUrl) && l.a(this.policyNoticeEnable, kidsComplianceSettings.policyNoticeEnable) && l.a(this.kidsEvents, kidsComplianceSettings.kidsEvents) && l.a(this.interfaceControlSettingsString, kidsComplianceSettings.interfaceControlSettingsString) && l.a(this.kmReportReasons, kidsComplianceSettings.kmReportReasons) && l.a(this.wellbeingSetting, kidsComplianceSettings.wellbeingSetting);
    }

    public final int hashCode() {
        List<String> list = this.blackSetting;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.complianceEncrypt;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.timeLockSelfInMin;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.policyNoticeEnable;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<String> list2 = this.kidsEvents;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.interfaceControlSettingsString;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.kmReportReasons;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        KidsWellbeingSetting kidsWellbeingSetting = this.wellbeingSetting;
        if (kidsWellbeingSetting != null) {
            i2 = kidsWellbeingSetting.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "KidsComplianceSettings(blackSetting=" + this.blackSetting + ", complianceEncrypt=" + this.complianceEncrypt + ", timeLockSelfInMin=" + this.timeLockSelfInMin + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", policyNoticeEnable=" + this.policyNoticeEnable + ", kidsEvents=" + this.kidsEvents + ", interfaceControlSettingsString=" + this.interfaceControlSettingsString + ", kmReportReasons=" + this.kmReportReasons + ", wellbeingSetting=" + this.wellbeingSetting + ")";
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final String getInterfaceControlSettingsString() {
        return this.interfaceControlSettingsString;
    }

    public final List<String> getKidsEvents() {
        return this.kidsEvents;
    }

    public final String getKmReportReasons() {
        return this.kmReportReasons;
    }

    public final Boolean getPolicyNoticeEnable() {
        return this.policyNoticeEnable;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final Integer getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final KidsWellbeingSetting getWellbeingSetting() {
        return this.wellbeingSetting;
    }

    public final void setTimeLockSelfInMin(Integer num) {
        this.timeLockSelfInMin = num;
    }

    public KidsComplianceSettings(List<String> list, String str, Integer num, String str2, Boolean bool, List<String> list2, String str3, String str4, KidsWellbeingSetting kidsWellbeingSetting) {
        this.blackSetting = list;
        this.complianceEncrypt = str;
        this.timeLockSelfInMin = num;
        this.privacyPolicyUrl = str2;
        this.policyNoticeEnable = bool;
        this.kidsEvents = list2;
        this.interfaceControlSettingsString = str3;
        this.kmReportReasons = str4;
        this.wellbeingSetting = kidsWellbeingSetting;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsComplianceSettings(List list, String str, Integer num, String str2, Boolean bool, List list2, String str3, String str4, KidsWellbeingSetting kidsWellbeingSetting, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? false : bool, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) == 0 ? kidsWellbeingSetting : null);
    }
}
