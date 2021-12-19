package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.c.b;

/* access modifiers changed from: package-private */
public final class da {

    /* renamed from: a  reason: collision with root package name */
    public final Context f53032a;

    static {
        Covode.recordClassIndex(32747);
    }

    public da(Context context) {
        this.f53032a = context;
    }

    static String a(Context context) {
        ApplicationInfo applicationInfo;
        try {
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
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
