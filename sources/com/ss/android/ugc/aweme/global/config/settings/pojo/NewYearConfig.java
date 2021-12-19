package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class NewYearConfig {
    @c(a = "auto_fold_vv_count")
    private Integer autoFoldVvCount;
    @c(a = "disabled")
    private Boolean disabled;
    @c(a = "max_amount")
    private Integer maxAmount;
    @c(a = "newyear_test_domain")
    private String newyearTestDomain;
    @c(a = "newyear_test_switch")
    private Boolean newyearTestSwitch;
    @c(a = "show_newyear_fresh_button")
    private Boolean showNewyearFreshButton;
    @c(a = "token")
    private String token;

    static {
        Covode.recordClassIndex(63063);
    }

    public Integer getAutoFoldVvCount() {
        Integer num = this.autoFoldVvCount;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getDisabled() {
        Boolean bool = this.disabled;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getMaxAmount() {
        Integer num = this.maxAmount;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getNewyearTestDomain() {
        String str = this.newyearTestDomain;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getNewyearTestSwitch() {
        Boolean bool = this.newyearTestSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getShowNewyearFreshButton() {
        Boolean bool = this.showNewyearFreshButton;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public String getToken() {
        String str = this.token;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
