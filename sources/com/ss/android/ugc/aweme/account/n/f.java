package com.ss.android.ugc.aweme.account.n;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class f {
    static {
        Covode.recordClassIndex(40067);
    }

    public static boolean a(Context context) {
        if (b(context) == 0) {
            return true;
        }
        return false;
    }

    public static int b(Context context) {
        try {
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            return instance.isGooglePlayServicesAvailable(applicationContext);
        } catch (Exception unused) {
            return 1;
        }
    }
}
