package com.ss.android.ugc.aweme.main.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ad;

public interface ICommerceService {
    static {
        Covode.recordClassIndex(70015);
    }

    ad a(String str);

    boolean a(Context context, String str, String str2);

    boolean a(Context context, String str, boolean z);
}
