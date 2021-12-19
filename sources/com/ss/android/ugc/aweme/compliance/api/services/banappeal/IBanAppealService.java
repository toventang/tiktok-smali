package com.ss.android.ugc.aweme.compliance.api.services.banappeal;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.c.d;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;

public interface IBanAppealService {
    static {
        Covode.recordClassIndex(47377);
    }

    d a(Activity activity, AppealStatusResponse appealStatusResponse);

    void a(Context context);

    void a(Context context, String str);

    void a(e eVar);

    void a(String str, g<AppealStatusResponse, Void> gVar);

    boolean a();

    boolean a(int i2);

    String b();

    void c();

    void d();

    void e();
}
