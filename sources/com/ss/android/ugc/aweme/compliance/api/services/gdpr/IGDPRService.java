package com.ss.android.ugc.aweme.compliance.api.services.gdpr;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.c.b;

public interface IGDPRService {
    static {
        Covode.recordClassIndex(47395);
    }

    void a(Activity activity);

    void a(Context context, b bVar);

    boolean a();

    int b();

    void c();
}
