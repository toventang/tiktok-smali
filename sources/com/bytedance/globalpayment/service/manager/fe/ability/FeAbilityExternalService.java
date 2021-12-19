package com.bytedance.globalpayment.service.manager.fe.ability;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.c.a;

public interface FeAbilityExternalService {
    static {
        Covode.recordClassIndex(17774);
    }

    a getECommerceInterceptor();

    void init();

    boolean openWebPageByScheme(Context context, String str);
}
