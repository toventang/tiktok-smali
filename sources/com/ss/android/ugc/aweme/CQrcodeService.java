package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class CQrcodeService implements ICQrcodeService {
    static {
        Covode.recordClassIndex(38346);
    }

    @Override // com.ss.android.ugc.aweme.ICQrcodeService
    public final boolean a() {
        return av.a();
    }

    public static ICQrcodeService b() {
        MethodCollector.i(8421);
        Object a2 = b.a(ICQrcodeService.class, false);
        if (a2 != null) {
            ICQrcodeService iCQrcodeService = (ICQrcodeService) a2;
            MethodCollector.o(8421);
            return iCQrcodeService;
        }
        if (b.n == null) {
            synchronized (ICQrcodeService.class) {
                try {
                    if (b.n == null) {
                        b.n = new CQrcodeService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8421);
                    throw th;
                }
            }
        }
        CQrcodeService cQrcodeService = (CQrcodeService) b.n;
        MethodCollector.o(8421);
        return cQrcodeService;
    }

    @Override // com.ss.android.ugc.aweme.ICQrcodeService
    public final void a(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
        Intent intent = new Intent(activity, CQRCodeFailActivity.class);
        a.a(intent, activity);
        activity.startActivity(intent);
    }
}
