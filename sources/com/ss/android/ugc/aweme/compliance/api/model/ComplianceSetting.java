package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ComplianceSetting extends BaseResponse implements Serializable {
    @c(a = "ad_personality_settings")
    private final AdPersonalitySettings adPersonalitySettings;
    @c(a = "add_terms_consent_for_register")
    private final Boolean addTermsConsentForRegister;
    @c(a = "set_appsflyer_sharing_block")
    private final Boolean afSharingBlock;
    @c(a = "age_gate_info")
    private final AgeGateInfo ageGateInfo;
    @c(a = "algo_free_enabled")
    private final Boolean algoFreeEnabled;
    @c(a = "algo_free_info")
    private final AlgoFreeInfo algoFreeInfo;
    @c(a = "settings_black_menu_list")
    private final List<String> blackSetting;
    @c(a = "cmpl_enc")
    private final String complianceEncrypt;
    @c(a = "default_vpa_content_choice")
    private final Integer defaultVpaContentChoice;
    @c(a = "device_limit_register_expired_time")
    private final Long deviceLimitRegisterExpiredTime;
    @c(a = "enable_impressum")
    private final Integer enableImpressum;
    @c(a = "enable_terms_consent_popup")
    private final Boolean enableTermsConsentPopup;
    @c(a = "enable_vpa")
    private final Boolean enableVpa;
    @c(a = "force_private_account")
    private final Boolean forcePrivateAccount;
    @c(a = "impressum_url")
    private final String impressumUrl;
    @c(a = "interface_control_settings")
    private final String interfaceControlSettingsString;
    @c(a = "kids_log_events")
    private final List<String> kidsEvents;
    @c(a = "kids_request_param_control")
    private final KidsRequestParamControl kidsRequestParamControl;
    @c(a = "legal_entity_change_info")
    private final LegalEntityChangeInfo legalEntityChangeInfo;
    @c(a = "log_pb")
    private final LogPbBean logPb;
    @c(a = "notify_private_account")
    private final Integer notifyPrivateAccount;
    @c(a = "about_privacy_policy_url")
    private final String privacyPolicyUrl;
    @c(a = "terms_consent_for_register_info")
    private final TermsConsentInfo termsConsentInfo;
    @c(a = "traffic_control")
    private TrafficControl trafficControl;
    @c(a = "vpa_info_bar_url")
    private final String vpaInfoBarUrl;

    static {
        Covode.recordClassIndex(47330);
    }

    public ComplianceSetting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public static /* synthetic */ ComplianceSetting copy$default(ComplianceSetting complianceSetting, List list, Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, AgeGateInfo ageGateInfo2, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo2, Boolean bool6, TrafficControl trafficControl2, String str5, Long l2, KidsRequestParamControl kidsRequestParamControl2, List list2, int i2, Object obj) {
        Integer num4 = num;
        List<String> list3 = list;
        Boolean bool7 = bool5;
        Boolean bool8 = bool4;
        Boolean bool9 = bool;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        Integer num5 = num2;
        Boolean bool10 = bool2;
        AlgoFreeInfo algoFreeInfo3 = algoFreeInfo2;
        AdPersonalitySettings adPersonalitySettings3 = adPersonalitySettings2;
        Integer num6 = num3;
        Boolean bool11 = bool3;
        LogPbBean logPbBean2 = logPbBean;
        AgeGateInfo ageGateInfo3 = ageGateInfo2;
        String str9 = str4;
        TermsConsentInfo termsConsentInfo3 = termsConsentInfo2;
        List list4 = list2;
        LegalEntityChangeInfo legalEntityChangeInfo3 = legalEntityChangeInfo2;
        Boolean bool12 = bool6;
        TrafficControl trafficControl3 = trafficControl2;
        String str10 = str5;
        Long l3 = l2;
        KidsRequestParamControl kidsRequestParamControl3 = kidsRequestParamControl2;
        if ((i2 & 1) != 0) {
            list3 = complianceSetting.blackSetting;
        }
        if ((i2 & 2) != 0) {
            num4 = complianceSetting.enableImpressum;
        }
        if ((i2 & 4) != 0) {
            str8 = complianceSetting.impressumUrl;
        }
        if ((i2 & 8) != 0) {
            str7 = complianceSetting.privacyPolicyUrl;
        }
        if ((i2 & 16) != 0) {
            str6 = complianceSetting.vpaInfoBarUrl;
        }
        if ((i2 & 32) != 0) {
            bool9 = complianceSetting.enableVpa;
        }
        if ((i2 & 64) != 0) {
            num5 = complianceSetting.defaultVpaContentChoice;
        }
        if ((i2 & 128) != 0) {
            bool10 = complianceSetting.algoFreeEnabled;
        }
        if ((i2 & 256) != 0) {
            algoFreeInfo3 = complianceSetting.algoFreeInfo;
        }
        if ((i2 & 512) != 0) {
            adPersonalitySettings3 = complianceSetting.adPersonalitySettings;
        }
        if ((i2 & 1024) != 0) {
            num6 = complianceSetting.notifyPrivateAccount;
        }
        if ((i2 & 2048) != 0) {
            bool11 = complianceSetting.forcePrivateAccount;
        }
        if ((i2 & 4096) != 0) {
            bool8 = complianceSetting.addTermsConsentForRegister;
        }
        if ((i2 & 8192) != 0) {
            bool7 = complianceSetting.enableTermsConsentPopup;
        }
        if ((i2 & 16384) != 0) {
            termsConsentInfo3 = complianceSetting.termsConsentInfo;
        }
        if ((32768 & i2) != 0) {
            str9 = complianceSetting.complianceEncrypt;
        }
        if ((65536 & i2) != 0) {
            ageGateInfo3 = complianceSetting.ageGateInfo;
        }
        if ((131072 & i2) != 0) {
            logPbBean2 = complianceSetting.logPb;
        }
        if ((262144 & i2) != 0) {
            legalEntityChangeInfo3 = complianceSetting.legalEntityChangeInfo;
        }
        if ((524288 & i2) != 0) {
            bool12 = complianceSetting.afSharingBlock;
        }
        if ((1048576 & i2) != 0) {
            trafficControl3 = complianceSetting.trafficControl;
        }
        if ((2097152 & i2) != 0) {
            str10 = complianceSetting.interfaceControlSettingsString;
        }
        if ((4194304 & i2) != 0) {
            l3 = complianceSetting.deviceLimitRegisterExpiredTime;
        }
        if ((8388608 & i2) != 0) {
            kidsRequestParamControl3 = complianceSetting.kidsRequestParamControl;
        }
        if ((i2 & 16777216) != 0) {
            list4 = complianceSetting.kidsEvents;
        }
        return complianceSetting.copy(list3, num4, str8, str7, str6, bool9, num5, bool10, algoFreeInfo3, adPersonalitySettings3, num6, bool11, bool8, bool7, termsConsentInfo3, str9, ageGateInfo3, logPbBean2, legalEntityChangeInfo3, bool12, trafficControl3, str10, l3, kidsRequestParamControl3, list4);
    }

    public final List<String> component1() {
        return this.blackSetting;
    }

    public final AdPersonalitySettings component10() {
        return this.adPersonalitySettings;
    }

    public final Integer component11() {
        return this.notifyPrivateAccount;
    }

    public final Boolean component12() {
        return this.forcePrivateAccount;
    }

    public final Boolean component13() {
        return this.addTermsConsentForRegister;
    }

    public final Boolean component14() {
        return this.enableTermsConsentPopup;
    }

    public final TermsConsentInfo component15() {
        return this.termsConsentInfo;
    }

    public final String component16() {
        return this.complianceEncrypt;
    }

    public final AgeGateInfo component17() {
        return this.ageGateInfo;
    }

    public final LogPbBean component18() {
        return this.logPb;
    }

    public final LegalEntityChangeInfo component19() {
        return this.legalEntityChangeInfo;
    }

    public final Integer component2() {
        return this.enableImpressum;
    }

    public final Boolean component20() {
        return this.afSharingBlock;
    }

    public final TrafficControl component21() {
        return this.trafficControl;
    }

    public final String component22() {
        return this.interfaceControlSettingsString;
    }

    public final Long component23() {
        return this.deviceLimitRegisterExpiredTime;
    }

    public final KidsRequestParamControl component24() {
        return this.kidsRequestParamControl;
    }

    public final List<String> component25() {
        return this.kidsEvents;
    }

    public final String component3() {
        return this.impressumUrl;
    }

    public final String component4() {
        return this.privacyPolicyUrl;
    }

    public final String component5() {
        return this.vpaInfoBarUrl;
    }

    public final Boolean component6() {
        return this.enableVpa;
    }

    public final Integer component7() {
        return this.defaultVpaContentChoice;
    }

    public final Boolean component8() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo component9() {
        return this.algoFreeInfo;
    }

    public final ComplianceSetting copy(List<String> list, Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, AgeGateInfo ageGateInfo2, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo2, Boolean bool6, TrafficControl trafficControl2, String str5, Long l2, KidsRequestParamControl kidsRequestParamControl2, List<String> list2) {
        return new ComplianceSetting(list, num, str, str2, str3, bool, num2, bool2, algoFreeInfo2, adPersonalitySettings2, num3, bool3, bool4, bool5, termsConsentInfo2, str4, ageGateInfo2, logPbBean, legalEntityChangeInfo2, bool6, trafficControl2, str5, l2, kidsRequestParamControl2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplianceSetting)) {
            return false;
        }
        ComplianceSetting complianceSetting = (ComplianceSetting) obj;
        return l.a(this.blackSetting, complianceSetting.blackSetting) && l.a(this.enableImpressum, complianceSetting.enableImpressum) && l.a(this.impressumUrl, complianceSetting.impressumUrl) && l.a(this.privacyPolicyUrl, complianceSetting.privacyPolicyUrl) && l.a(this.vpaInfoBarUrl, complianceSetting.vpaInfoBarUrl) && l.a(this.enableVpa, complianceSetting.enableVpa) && l.a(this.defaultVpaContentChoice, complianceSetting.defaultVpaContentChoice) && l.a(this.algoFreeEnabled, complianceSetting.algoFreeEnabled) && l.a(this.algoFreeInfo, complianceSetting.algoFreeInfo) && l.a(this.adPersonalitySettings, complianceSetting.adPersonalitySettings) && l.a(this.notifyPrivateAccount, complianceSetting.notifyPrivateAccount) && l.a(this.forcePrivateAccount, complianceSetting.forcePrivateAccount) && l.a(this.addTermsConsentForRegister, complianceSetting.addTermsConsentForRegister) && l.a(this.enableTermsConsentPopup, complianceSetting.enableTermsConsentPopup) && l.a(this.termsConsentInfo, complianceSetting.termsConsentInfo) && l.a(this.complianceEncrypt, complianceSetting.complianceEncrypt) && l.a(this.ageGateInfo, complianceSetting.ageGateInfo) && l.a(this.logPb, complianceSetting.logPb) && l.a(this.legalEntityChangeInfo, complianceSetting.legalEntityChangeInfo) && l.a(this.afSharingBlock, complianceSetting.afSharingBlock) && l.a(this.trafficControl, complianceSetting.trafficControl) && l.a(this.interfaceControlSettingsString, complianceSetting.interfaceControlSettingsString) && l.a(this.deviceLimitRegisterExpiredTime, complianceSetting.deviceLimitRegisterExpiredTime) && l.a(this.kidsRequestParamControl, complianceSetting.kidsRequestParamControl) && l.a(this.kidsEvents, complianceSetting.kidsEvents);
    }

    public final int hashCode() {
        List<String> list = this.blackSetting;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.enableImpressum;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.impressumUrl;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.vpaInfoBarUrl;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.enableVpa;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.defaultVpaContentChoice;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool2 = this.algoFreeEnabled;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        AlgoFreeInfo algoFreeInfo2 = this.algoFreeInfo;
        int hashCode9 = (hashCode8 + (algoFreeInfo2 != null ? algoFreeInfo2.hashCode() : 0)) * 31;
        AdPersonalitySettings adPersonalitySettings2 = this.adPersonalitySettings;
        int hashCode10 = (hashCode9 + (adPersonalitySettings2 != null ? adPersonalitySettings2.hashCode() : 0)) * 31;
        Integer num3 = this.notifyPrivateAccount;
        int hashCode11 = (hashCode10 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.forcePrivateAccount;
        int hashCode12 = (hashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.addTermsConsentForRegister;
        int hashCode13 = (hashCode12 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.enableTermsConsentPopup;
        int hashCode14 = (hashCode13 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        TermsConsentInfo termsConsentInfo2 = this.termsConsentInfo;
        int hashCode15 = (hashCode14 + (termsConsentInfo2 != null ? termsConsentInfo2.hashCode() : 0)) * 31;
        String str4 = this.complianceEncrypt;
        int hashCode16 = (hashCode15 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AgeGateInfo ageGateInfo2 = this.ageGateInfo;
        int hashCode17 = (hashCode16 + (ageGateInfo2 != null ? ageGateInfo2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode18 = (hashCode17 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        LegalEntityChangeInfo legalEntityChangeInfo2 = this.legalEntityChangeInfo;
        int hashCode19 = (hashCode18 + (legalEntityChangeInfo2 != null ? legalEntityChangeInfo2.hashCode() : 0)) * 31;
        Boolean bool6 = this.afSharingBlock;
        int hashCode20 = (hashCode19 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        TrafficControl trafficControl2 = this.trafficControl;
        int hashCode21 = (hashCode20 + (trafficControl2 != null ? trafficControl2.hashCode() : 0)) * 31;
        String str5 = this.interfaceControlSettingsString;
        int hashCode22 = (hashCode21 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l2 = this.deviceLimitRegisterExpiredTime;
        int hashCode23 = (hashCode22 + (l2 != null ? l2.hashCode() : 0)) * 31;
        KidsRequestParamControl kidsRequestParamControl2 = this.kidsRequestParamControl;
        int hashCode24 = (hashCode23 + (kidsRequestParamControl2 != null ? kidsRequestParamControl2.hashCode() : 0)) * 31;
        List<String> list2 = this.kidsEvents;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode24 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ComplianceSetting(blackSetting=" + this.blackSetting + ", enableImpressum=" + this.enableImpressum + ", impressumUrl=" + this.impressumUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", vpaInfoBarUrl=" + this.vpaInfoBarUrl + ", enableVpa=" + this.enableVpa + ", defaultVpaContentChoice=" + this.defaultVpaContentChoice + ", algoFreeEnabled=" + this.algoFreeEnabled + ", algoFreeInfo=" + this.algoFreeInfo + ", adPersonalitySettings=" + this.adPersonalitySettings + ", notifyPrivateAccount=" + this.notifyPrivateAccount + ", forcePrivateAccount=" + this.forcePrivateAccount + ", addTermsConsentForRegister=" + this.addTermsConsentForRegister + ", enableTermsConsentPopup=" + this.enableTermsConsentPopup + ", termsConsentInfo=" + this.termsConsentInfo + ", complianceEncrypt=" + this.complianceEncrypt + ", ageGateInfo=" + this.ageGateInfo + ", logPb=" + this.logPb + ", legalEntityChangeInfo=" + this.legalEntityChangeInfo + ", afSharingBlock=" + this.afSharingBlock + ", trafficControl=" + this.trafficControl + ", interfaceControlSettingsString=" + this.interfaceControlSettingsString + ", deviceLimitRegisterExpiredTime=" + this.deviceLimitRegisterExpiredTime + ", kidsRequestParamControl=" + this.kidsRequestParamControl + ", kidsEvents=" + this.kidsEvents + ")";
    }

    public final AdPersonalitySettings getAdPersonalitySettings() {
        return this.adPersonalitySettings;
    }

    public final Boolean getAddTermsConsentForRegister() {
        return this.addTermsConsentForRegister;
    }

    public final Boolean getAfSharingBlock() {
        return this.afSharingBlock;
    }

    public final AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public final Boolean getAlgoFreeEnabled() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo getAlgoFreeInfo() {
        return this.algoFreeInfo;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final Integer getDefaultVpaContentChoice() {
        return this.defaultVpaContentChoice;
    }

    public final Long getDeviceLimitRegisterExpiredTime() {
        return this.deviceLimitRegisterExpiredTime;
    }

    public final Integer getEnableImpressum() {
        return this.enableImpressum;
    }

    public final Boolean getEnableTermsConsentPopup() {
        return this.enableTermsConsentPopup;
    }

    public final Boolean getEnableVpa() {
        return this.enableVpa;
    }

    public final Boolean getForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public final String getImpressumUrl() {
        return this.impressumUrl;
    }

    public final String getInterfaceControlSettingsString() {
        return this.interfaceControlSettingsString;
    }

    public final List<String> getKidsEvents() {
        return this.kidsEvents;
    }

    public final KidsRequestParamControl getKidsRequestParamControl() {
        return this.kidsRequestParamControl;
    }

    public final LegalEntityChangeInfo getLegalEntityChangeInfo() {
        return this.legalEntityChangeInfo;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Integer getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final TermsConsentInfo getTermsConsentInfo() {
        return this.termsConsentInfo;
    }

    public final TrafficControl getTrafficControl() {
        return this.trafficControl;
    }

    public final String getVpaInfoBarUrl() {
        return this.vpaInfoBarUrl;
    }

    public final void setTrafficControl(TrafficControl trafficControl2) {
        this.trafficControl = trafficControl2;
    }

    public ComplianceSetting(List<String> list, Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, AgeGateInfo ageGateInfo2, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo2, Boolean bool6, TrafficControl trafficControl2, String str5, Long l2, KidsRequestParamControl kidsRequestParamControl2, List<String> list2) {
        this.blackSetting = list;
        this.enableImpressum = num;
        this.impressumUrl = str;
        this.privacyPolicyUrl = str2;
        this.vpaInfoBarUrl = str3;
        this.enableVpa = bool;
        this.defaultVpaContentChoice = num2;
        this.algoFreeEnabled = bool2;
        this.algoFreeInfo = algoFreeInfo2;
        this.adPersonalitySettings = adPersonalitySettings2;
        this.notifyPrivateAccount = num3;
        this.forcePrivateAccount = bool3;
        this.addTermsConsentForRegister = bool4;
        this.enableTermsConsentPopup = bool5;
        this.termsConsentInfo = termsConsentInfo2;
        this.complianceEncrypt = str4;
        this.ageGateInfo = ageGateInfo2;
        this.logPb = logPbBean;
        this.legalEntityChangeInfo = legalEntityChangeInfo2;
        this.afSharingBlock = bool6;
        this.trafficControl = trafficControl2;
        this.interfaceControlSettingsString = str5;
        this.deviceLimitRegisterExpiredTime = l2;
        this.kidsRequestParamControl = kidsRequestParamControl2;
        this.kidsEvents = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplianceSetting(List list, Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, AgeGateInfo ageGateInfo2, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo2, Boolean bool6, TrafficControl trafficControl2, String str5, Long l2, KidsRequestParamControl kidsRequestParamControl2, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : num, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? false : bool, (i2 & 64) != 0 ? 1 : num2, (i2 & 128) != 0 ? false : bool2, (i2 & 256) != 0 ? null : algoFreeInfo2, (i2 & 512) != 0 ? null : adPersonalitySettings2, (i2 & 1024) != 0 ? 0 : num3, (i2 & 2048) != 0 ? false : bool3, (i2 & 4096) != 0 ? false : bool4, (i2 & 8192) != 0 ? false : bool5, (i2 & 16384) != 0 ? null : termsConsentInfo2, (32768 & i2) != 0 ? null : str4, (65536 & i2) != 0 ? null : ageGateInfo2, (131072 & i2) != 0 ? null : logPbBean, (262144 & i2) != 0 ? null : legalEntityChangeInfo2, (524288 & i2) != 0 ? false : bool6, (1048576 & i2) != 0 ? null : trafficControl2, (2097152 & i2) != 0 ? null : str5, (4194304 & i2) != 0 ? 0L : l2, (8388608 & i2) != 0 ? null : kidsRequestParamControl2, (i2 & 16777216) != 0 ? null : list2);
    }
}
