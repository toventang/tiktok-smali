package com.bytedance.android.livesdkapi.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class LiveRechargeAgreementConfig {
    @c(a = "live_room_recharge_agreement_for_global")
    public String agreementForGlobal;
    @c(a = "live_room_recharge_agreement_for_region")
    public List<AgreementForRegion> agreementsForRegion;
    @c(a = "is_show_recharge_rule_in_global")
    public boolean isShowRechargeLawInGlobal;
    @c(a = "is_show_recharge_rule_in_region")
    public boolean isShowRechargeLawInRegion;

    static {
        Covode.recordClassIndex(13838);
    }

    public class AgreementForRegion {
        @c(a = "title")
        public String lawName;
        @c(a = "url")
        public String lawUrl;

        static {
            Covode.recordClassIndex(13839);
        }

        public AgreementForRegion() {
        }
    }
}
