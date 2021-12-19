package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

public interface IDeleteAccountService {
    static {
        Covode.recordClassIndex(61358);
    }

    boolean toAccountRecover(String str);
}
