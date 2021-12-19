package com.ss.android.ugc.aweme.donation;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.a;

public interface IDonationService {
    static {
        Covode.recordClassIndex(51724);
    }

    IInterceptor a();

    a a(int i2, String str, Bundle bundle);

    void a(Context context, String str, String str2);

    a b(int i2, String str, Bundle bundle);
}
