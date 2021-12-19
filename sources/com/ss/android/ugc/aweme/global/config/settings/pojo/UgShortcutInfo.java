package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgShortcutInfo {
    @c(a = "h5_link")
    private String h5Link;
    @c(a = "money_symbol")
    private String moneySymbol;
    @c(a = "will_get_most")
    private String willGetMost;
    @c(a = "withdrawal_req_interval")
    private int withdrawalReqInterval;

    static {
        Covode.recordClassIndex(63099);
    }

    public int getWithdrawalReqInterval() {
        return this.withdrawalReqInterval;
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getMoneySymbol() {
        String str = this.moneySymbol;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getWillGetMost() {
        String str = this.willGetMost;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
