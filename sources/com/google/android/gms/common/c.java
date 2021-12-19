package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.h;

public class c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = g.f50299b;
    private static final c zzab = new c();

    public boolean isUserResolvableError(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    c() {
    }

    public static c getInstance() {
        return zzab;
    }

    static {
        Covode.recordClassIndex(31350);
    }

    public int getApkVersion(Context context) {
        return g.e(context);
    }

    public Intent getErrorResolutionIntent(int i2) {
        return getErrorResolutionIntent(null, i2, null);
    }

    public String getErrorString(int i2) {
        return ConnectionResult.a(i2);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (!g.f50300c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) g.a(context, "notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        return g.b(context, i2);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return g.b(context, str);
    }

    public int isGooglePlayServicesAvailable(Context context, int i2) {
        int a2 = g.a(context, i2);
        if (g.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    private static String zza(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.c.c.f50295a.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return getErrorResolutionPendingIntent(context, i2, i3, null);
    }

    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !h.b(context)) {
                String zza = zza(context, str);
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(zza)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", zza);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i2 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i2, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, errorResolutionIntent, 134217728);
    }
}
