package androidx.core.c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(701);
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        int i2 = Build.VERSION.SDK_INT;
        return connectivityManager.isActiveNetworkMetered();
    }

    private static NetworkInfo b(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }
}
