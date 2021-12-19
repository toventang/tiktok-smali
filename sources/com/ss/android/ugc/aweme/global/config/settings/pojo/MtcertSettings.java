package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class MtcertSettings {
    @c(a = "cert_url_schema")
    private String certUrlSchema = "";
    @c(a = "enable_change_handle_notice")
    private Boolean enableChangeHandleNotice = false;
    @c(a = "enable_change_mobile_notice")
    private Boolean enableChangeMobileNotice = false;
    @c(a = "enable_change_nickname_notice")
    private Boolean enableChangeNicknameNotice = false;
    @c(a = "enable_private_account_notice")
    private Boolean enablePrivateAccountNotice = false;
    @c(a = "show_cert_entry")
    private Boolean showCertEntry = false;
    @c(a = "verification_badge_type")
    private List<VerificationBadgeType> verificationBadgeType = new ArrayList();

    static {
        Covode.recordClassIndex(63062);
    }

    public String getCertUrlSchema() {
        return this.certUrlSchema;
    }

    public Boolean getEnableChangeHandleNotice() {
        return this.enableChangeHandleNotice;
    }

    public Boolean getEnableChangeMobileNotice() {
        return this.enableChangeMobileNotice;
    }

    public Boolean getEnableChangeNicknameNotice() {
        return this.enableChangeNicknameNotice;
    }

    public Boolean getEnablePrivateAccountNotice() {
        return this.enablePrivateAccountNotice;
    }

    public Boolean getShowCertEntry() {
        return this.showCertEntry;
    }

    public List<VerificationBadgeType> getVerificationBadgeType() {
        return this.verificationBadgeType;
    }
}
