package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class AdPersonalitySettings implements Serializable {
    @c(a = "popup_business")
    private final String business;
    @c(a = "pop_up_copywriting")
    private final CopyWritingInfo copyWriting;
    @c(a = "description")
    private final String description;
    @c(a = "is_follow_sys_config")
    private final Boolean isFollowSystemConfig;
    @c(a = "is_show_settings")
    private final Boolean isShowSettings;
    @c(a = "limit_ad_tracking")
    private final Boolean lat;
    @c(a = "mode")
    private final Integer mode;
    @c(a = "need_pop_up")
    private final Boolean needPopUp;
    @c(a = "new_pers_ad_settings")
    private final NewPersAdSettings newPersAdSettings;
    @c(a = "pers_ad_main_mode_title")
    private final String paMainTitle;
    @c(a = "pers_ad_data_received_partner_mode")
    private final Integer partnerAdMode;
    @c(a = "personalization_data_text")
    private final PersonalizationDataText personalizationDataText;
    @c(a = "popup_check_text_style")
    private final Integer promptStyle;
    @c(a = "setting_type")
    private final Integer settingType;
    @c(a = "use_new_interests")
    private final Integer showInterestItemType;
    @c(a = "pers_ad_show_interest_label")
    private final Boolean showInterestLabel;
    @c(a = "pers_ad_show_data_received_partner")
    private final Boolean showPartnerAd;
    @c(a = "pers_ad_show_third_party_networks")
    private final Boolean showThirdAd;
    @c(a = "pers_ad_show_third_part_measurement")
    private final Boolean showThirdPartyMeasurement;
    @c(a = "pers_ad_third_party_networks_mode")
    private final Integer thirdAdMode;

    static {
        Covode.recordClassIndex(47323);
    }

    public AdPersonalitySettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ AdPersonalitySettings copy$default(AdPersonalitySettings adPersonalitySettings, Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num4, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num5, NewPersAdSettings newPersAdSettings2, Integer num6, int i2, Object obj) {
        Boolean bool9 = bool3;
        CopyWritingInfo copyWritingInfo2 = copyWritingInfo;
        String str4 = str2;
        Integer num7 = num;
        Boolean bool10 = bool;
        Boolean bool11 = bool2;
        String str5 = str;
        Boolean bool12 = bool7;
        Integer num8 = num4;
        Boolean bool13 = bool6;
        Integer num9 = num2;
        Integer num10 = num3;
        Boolean bool14 = bool4;
        Boolean bool15 = bool5;
        NewPersAdSettings newPersAdSettings3 = newPersAdSettings2;
        Boolean bool16 = bool8;
        String str6 = str3;
        Integer num11 = num6;
        PersonalizationDataText personalizationDataText3 = personalizationDataText2;
        Integer num12 = num5;
        if ((i2 & 1) != 0) {
            num7 = adPersonalitySettings.mode;
        }
        if ((i2 & 2) != 0) {
            bool10 = adPersonalitySettings.needPopUp;
        }
        if ((i2 & 4) != 0) {
            bool11 = adPersonalitySettings.isFollowSystemConfig;
        }
        if ((i2 & 8) != 0) {
            str5 = adPersonalitySettings.description;
        }
        if ((i2 & 16) != 0) {
            str4 = adPersonalitySettings.paMainTitle;
        }
        if ((i2 & 32) != 0) {
            copyWritingInfo2 = adPersonalitySettings.copyWriting;
        }
        if ((i2 & 64) != 0) {
            bool9 = adPersonalitySettings.isShowSettings;
        }
        if ((i2 & 128) != 0) {
            num9 = adPersonalitySettings.thirdAdMode;
        }
        if ((i2 & 256) != 0) {
            num10 = adPersonalitySettings.partnerAdMode;
        }
        if ((i2 & 512) != 0) {
            bool14 = adPersonalitySettings.showThirdAd;
        }
        if ((i2 & 1024) != 0) {
            bool15 = adPersonalitySettings.showPartnerAd;
        }
        if ((i2 & 2048) != 0) {
            bool13 = adPersonalitySettings.showInterestLabel;
        }
        if ((i2 & 4096) != 0) {
            num8 = adPersonalitySettings.showInterestItemType;
        }
        if ((i2 & 8192) != 0) {
            bool12 = adPersonalitySettings.showThirdPartyMeasurement;
        }
        if ((i2 & 16384) != 0) {
            bool16 = adPersonalitySettings.lat;
        }
        if ((32768 & i2) != 0) {
            str6 = adPersonalitySettings.business;
        }
        if ((65536 & i2) != 0) {
            personalizationDataText3 = adPersonalitySettings.personalizationDataText;
        }
        if ((131072 & i2) != 0) {
            num12 = adPersonalitySettings.settingType;
        }
        if ((262144 & i2) != 0) {
            newPersAdSettings3 = adPersonalitySettings.newPersAdSettings;
        }
        if ((i2 & 524288) != 0) {
            num11 = adPersonalitySettings.promptStyle;
        }
        return adPersonalitySettings.copy(num7, bool10, bool11, str5, str4, copyWritingInfo2, bool9, num9, num10, bool14, bool15, bool13, num8, bool12, bool16, str6, personalizationDataText3, num12, newPersAdSettings3, num11);
    }

    public final Integer component1() {
        return this.mode;
    }

    public final Boolean component10() {
        return this.showThirdAd;
    }

    public final Boolean component11() {
        return this.showPartnerAd;
    }

    public final Boolean component12() {
        return this.showInterestLabel;
    }

    public final Integer component13() {
        return this.showInterestItemType;
    }

    public final Boolean component14() {
        return this.showThirdPartyMeasurement;
    }

    public final Boolean component15() {
        return this.lat;
    }

    public final String component16() {
        return this.business;
    }

    public final PersonalizationDataText component17() {
        return this.personalizationDataText;
    }

    public final Integer component18() {
        return this.settingType;
    }

    public final NewPersAdSettings component19() {
        return this.newPersAdSettings;
    }

    public final Boolean component2() {
        return this.needPopUp;
    }

    public final Integer component20() {
        return this.promptStyle;
    }

    public final Boolean component3() {
        return this.isFollowSystemConfig;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.paMainTitle;
    }

    public final CopyWritingInfo component6() {
        return this.copyWriting;
    }

    public final Boolean component7() {
        return this.isShowSettings;
    }

    public final Integer component8() {
        return this.thirdAdMode;
    }

    public final Integer component9() {
        return this.partnerAdMode;
    }

    public final AdPersonalitySettings copy(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num4, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num5, NewPersAdSettings newPersAdSettings2, Integer num6) {
        return new AdPersonalitySettings(num, bool, bool2, str, str2, copyWritingInfo, bool3, num2, num3, bool4, bool5, bool6, num4, bool7, bool8, str3, personalizationDataText2, num5, newPersAdSettings2, num6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdPersonalitySettings)) {
            return false;
        }
        AdPersonalitySettings adPersonalitySettings = (AdPersonalitySettings) obj;
        return l.a(this.mode, adPersonalitySettings.mode) && l.a(this.needPopUp, adPersonalitySettings.needPopUp) && l.a(this.isFollowSystemConfig, adPersonalitySettings.isFollowSystemConfig) && l.a(this.description, adPersonalitySettings.description) && l.a(this.paMainTitle, adPersonalitySettings.paMainTitle) && l.a(this.copyWriting, adPersonalitySettings.copyWriting) && l.a(this.isShowSettings, adPersonalitySettings.isShowSettings) && l.a(this.thirdAdMode, adPersonalitySettings.thirdAdMode) && l.a(this.partnerAdMode, adPersonalitySettings.partnerAdMode) && l.a(this.showThirdAd, adPersonalitySettings.showThirdAd) && l.a(this.showPartnerAd, adPersonalitySettings.showPartnerAd) && l.a(this.showInterestLabel, adPersonalitySettings.showInterestLabel) && l.a(this.showInterestItemType, adPersonalitySettings.showInterestItemType) && l.a(this.showThirdPartyMeasurement, adPersonalitySettings.showThirdPartyMeasurement) && l.a(this.lat, adPersonalitySettings.lat) && l.a(this.business, adPersonalitySettings.business) && l.a(this.personalizationDataText, adPersonalitySettings.personalizationDataText) && l.a(this.settingType, adPersonalitySettings.settingType) && l.a(this.newPersAdSettings, adPersonalitySettings.newPersAdSettings) && l.a(this.promptStyle, adPersonalitySettings.promptStyle);
    }

    public final int hashCode() {
        Integer num = this.mode;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.needPopUp;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isFollowSystemConfig;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.paMainTitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        CopyWritingInfo copyWritingInfo = this.copyWriting;
        int hashCode6 = (hashCode5 + (copyWritingInfo != null ? copyWritingInfo.hashCode() : 0)) * 31;
        Boolean bool3 = this.isShowSettings;
        int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Integer num2 = this.thirdAdMode;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.partnerAdMode;
        int hashCode9 = (hashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool4 = this.showThirdAd;
        int hashCode10 = (hashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.showPartnerAd;
        int hashCode11 = (hashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.showInterestLabel;
        int hashCode12 = (hashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Integer num4 = this.showInterestItemType;
        int hashCode13 = (hashCode12 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool7 = this.showThirdPartyMeasurement;
        int hashCode14 = (hashCode13 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
        Boolean bool8 = this.lat;
        int hashCode15 = (hashCode14 + (bool8 != null ? bool8.hashCode() : 0)) * 31;
        String str3 = this.business;
        int hashCode16 = (hashCode15 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PersonalizationDataText personalizationDataText2 = this.personalizationDataText;
        int hashCode17 = (hashCode16 + (personalizationDataText2 != null ? personalizationDataText2.hashCode() : 0)) * 31;
        Integer num5 = this.settingType;
        int hashCode18 = (hashCode17 + (num5 != null ? num5.hashCode() : 0)) * 31;
        NewPersAdSettings newPersAdSettings2 = this.newPersAdSettings;
        int hashCode19 = (hashCode18 + (newPersAdSettings2 != null ? newPersAdSettings2.hashCode() : 0)) * 31;
        Integer num6 = this.promptStyle;
        if (num6 != null) {
            i2 = num6.hashCode();
        }
        return hashCode19 + i2;
    }

    public final String toString() {
        return "AdPersonalitySettings(mode=" + this.mode + ", needPopUp=" + this.needPopUp + ", isFollowSystemConfig=" + this.isFollowSystemConfig + ", description=" + this.description + ", paMainTitle=" + this.paMainTitle + ", copyWriting=" + this.copyWriting + ", isShowSettings=" + this.isShowSettings + ", thirdAdMode=" + this.thirdAdMode + ", partnerAdMode=" + this.partnerAdMode + ", showThirdAd=" + this.showThirdAd + ", showPartnerAd=" + this.showPartnerAd + ", showInterestLabel=" + this.showInterestLabel + ", showInterestItemType=" + this.showInterestItemType + ", showThirdPartyMeasurement=" + this.showThirdPartyMeasurement + ", lat=" + this.lat + ", business=" + this.business + ", personalizationDataText=" + this.personalizationDataText + ", settingType=" + this.settingType + ", newPersAdSettings=" + this.newPersAdSettings + ", promptStyle=" + this.promptStyle + ")";
    }

    public final String getBusiness() {
        return this.business;
    }

    public final CopyWritingInfo getCopyWriting() {
        return this.copyWriting;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getLat() {
        return this.lat;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final Boolean getNeedPopUp() {
        return this.needPopUp;
    }

    public final NewPersAdSettings getNewPersAdSettings() {
        return this.newPersAdSettings;
    }

    public final String getPaMainTitle() {
        return this.paMainTitle;
    }

    public final Integer getPartnerAdMode() {
        return this.partnerAdMode;
    }

    public final PersonalizationDataText getPersonalizationDataText() {
        return this.personalizationDataText;
    }

    public final Integer getPromptStyle() {
        return this.promptStyle;
    }

    public final Integer getSettingType() {
        return this.settingType;
    }

    public final Integer getShowInterestItemType() {
        return this.showInterestItemType;
    }

    public final Boolean getShowInterestLabel() {
        return this.showInterestLabel;
    }

    public final Boolean getShowPartnerAd() {
        return this.showPartnerAd;
    }

    public final Boolean getShowThirdAd() {
        return this.showThirdAd;
    }

    public final Boolean getShowThirdPartyMeasurement() {
        return this.showThirdPartyMeasurement;
    }

    public final Integer getThirdAdMode() {
        return this.thirdAdMode;
    }

    public final Boolean isFollowSystemConfig() {
        return this.isFollowSystemConfig;
    }

    public final Boolean isShowSettings() {
        return this.isShowSettings;
    }

    public AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num4, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num5, NewPersAdSettings newPersAdSettings2, Integer num6) {
        this.mode = num;
        this.needPopUp = bool;
        this.isFollowSystemConfig = bool2;
        this.description = str;
        this.paMainTitle = str2;
        this.copyWriting = copyWritingInfo;
        this.isShowSettings = bool3;
        this.thirdAdMode = num2;
        this.partnerAdMode = num3;
        this.showThirdAd = bool4;
        this.showPartnerAd = bool5;
        this.showInterestLabel = bool6;
        this.showInterestItemType = num4;
        this.showThirdPartyMeasurement = bool7;
        this.lat = bool8;
        this.business = str3;
        this.personalizationDataText = personalizationDataText2;
        this.settingType = num5;
        this.newPersAdSettings = newPersAdSettings2;
        this.promptStyle = num6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AdPersonalitySettings(java.lang.Integer r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r29, java.lang.Boolean r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Boolean r33, java.lang.Boolean r34, java.lang.Boolean r35, java.lang.Integer r36, java.lang.Boolean r37, java.lang.Boolean r38, java.lang.String r39, com.ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText r40, java.lang.Integer r41, com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings r42, java.lang.Integer r43, int r44, h.f.b.g r45) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText, java.lang.Integer, com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings, java.lang.Integer, int, h.f.b.g):void");
    }
}
