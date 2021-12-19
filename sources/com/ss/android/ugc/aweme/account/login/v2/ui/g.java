package com.ss.android.ugc.aweme.account.login.v2.ui;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class g implements Serializable {
    private boolean needCreatePwdForPhone;
    private boolean needSetUserName;
    private boolean needShowPrivateAccountTips;

    static {
        Covode.recordClassIndex(39994);
    }

    public final boolean getNeedCreatePwdForPhone() {
        return this.needCreatePwdForPhone;
    }

    public final boolean getNeedSetUserName() {
        return this.needSetUserName;
    }

    public final boolean getNeedShowPrivateAccountTips() {
        return this.needShowPrivateAccountTips;
    }

    public final void setNeedCreatePwdForPhone(boolean z) {
        this.needCreatePwdForPhone = z;
    }

    public final void setNeedSetUserName(boolean z) {
        this.needSetUserName = z;
    }

    public final void setNeedShowPrivateAccountTips(boolean z) {
        this.needShowPrivateAccountTips = z;
    }
}
