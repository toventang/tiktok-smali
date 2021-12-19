package com.ss.android.ugc.aweme.services.function;

import com.bytedance.covode.number.Covode;

public interface IFunctionSupportService {
    static {
        Covode.recordClassIndex(79725);
    }

    boolean notSupport(IFunctionKey iFunctionKey);
}
