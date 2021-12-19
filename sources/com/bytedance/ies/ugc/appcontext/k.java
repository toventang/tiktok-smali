package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.lang.ref.WeakReference;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Bundle> f34649a;

    static {
        Covode.recordClassIndex(20761);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static int b(Context context, String str) {
        return ((Integer) a(context, str)).intValue();
    }

    static Object a(Context context, String str) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            WeakReference<Bundle> weakReference = f34649a;
            if (weakReference != null) {
                bundle = weakReference.get();
            } else {
                bundle = null;
            }
            if (bundle == null) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                if (TextUtils.equals(packageName, d.a().getPackageName())) {
                    if (b.f107191a == null) {
                        b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = b.f107191a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                bundle = applicationInfo.metaData;
                f34649a = new WeakReference<>(bundle);
            }
            return a(bundle, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
