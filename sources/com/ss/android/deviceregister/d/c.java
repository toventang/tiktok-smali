package com.ss.android.deviceregister.d;

import android.content.Context;
import android.provider.Settings;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

public final class c {
    static {
        Covode.recordClassIndex(36716);
    }

    public static String a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Pair<String, Boolean> b(Context context) {
        String str = null;
        boolean z = false;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                z = advertisingIdInfo.isLimitAdTrackingEnabled();
                str = advertisingIdInfo.getId();
            }
        } catch (Throwable th) {
            if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                return null;
            }
        }
        return new Pair<>(str, Boolean.valueOf(z));
    }
}
