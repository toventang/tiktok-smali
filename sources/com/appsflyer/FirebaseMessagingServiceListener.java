package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.af;
import com.appsflyer.internal.c;
import com.bytedance.covode.number.Covode;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ss.android.ugc.aweme.lancet.a.a;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    static {
        Covode.recordClassIndex(2685);
    }

    public static Context com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            c.a.C0078c r0 = c.a.C0078c.m175(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            c.a.C0078c cVar = new c.a.C0078c(currentTimeMillis, str);
            if (r0.m178(cVar)) {
                af.m128(com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this), cVar.f236);
            }
        }
    }
}
