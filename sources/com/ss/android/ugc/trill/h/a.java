package com.ss.android.ugc.trill.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;

public final class a {
    static {
        Covode.recordClassIndex(98967);
    }

    public static boolean a(Context context) {
        if (b(context) == 0) {
            return true;
        }
        return false;
    }

    public static int b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception unused) {
            return 1;
        }
    }
}
