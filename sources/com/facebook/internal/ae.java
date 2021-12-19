package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.m;
import com.facebook.n;
import java.util.Collection;
import java.util.List;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    private static final String f48526a = ae.class.getName();

    static {
        Covode.recordClassIndex(29272);
    }

    public static void a() {
        if (!m.a()) {
            throw new n("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static String b() {
        a();
        String str = m.f48915a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static String c() {
        a();
        String str = m.f48917c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static <T> void a(Collection<T> collection, String str) {
        c(collection, str);
        b(collection, str);
    }

    public static void a(Context context, boolean z) {
        a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void b(Context context, boolean z) {
        if (!z) {
            try {
                c(context, z);
            } catch (Exception unused) {
            }
        } else {
            c(context, z);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    private static <T> void b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }

    private static void c(Context context, boolean z) {
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1) != null) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z) {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static void a(String str, String str2) {
        if (ad.a(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    private static <T> void c(Collection<T> collection, String str) {
        a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static boolean a(Context context, String str) {
        List<ResolveInfo> list;
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
