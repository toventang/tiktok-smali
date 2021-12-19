package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public class ActivityCompat {
    static {
        Covode.recordClassIndex(2699);
    }

    public static Uri getReferrer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String com_appsflyer_internal_ActivityCompat_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_appsflyer_internal_ActivityCompat_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "android.intent.extra.REFERRER_NAME");
        if (com_appsflyer_internal_ActivityCompat_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
            return Uri.parse(com_appsflyer_internal_ActivityCompat_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        }
        return null;
    }

    public static String com_appsflyer_internal_ActivityCompat_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
