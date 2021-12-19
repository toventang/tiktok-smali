package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public class et extends RuntimeException {
    private boolean isRecover;
    private boolean isUserNetworkBad;

    static {
        Covode.recordClassIndex(84225);
    }

    public boolean isRecover() {
        return this.isRecover;
    }

    public boolean isUserNetworkBad() {
        return this.isUserNetworkBad;
    }

    public boolean isCauseByApiServerException() {
        return getCause() instanceof a;
    }

    public boolean isCauseByNoSpaceLeft() {
        if (!(getCause() instanceof ee) || ((ee) getCause()).getCode() != 100101) {
            return false;
        }
        return true;
    }

    public et(Throwable th) {
        super(th);
    }

    public void setRecover(boolean z) {
        this.isRecover = z;
    }

    public et(Throwable th, boolean z) {
        super(th);
        this.isUserNetworkBad = z;
    }
}
