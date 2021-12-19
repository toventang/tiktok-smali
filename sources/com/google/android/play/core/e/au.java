package com.google.android.play.core.e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.io.File;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public final Context f53262a;

    static {
        Covode.recordClassIndex(32915);
    }

    au(Context context) {
        this.f53262a = context;
    }

    static File a(Context context) {
        ApplicationInfo applicationInfo;
        String string;
        File file;
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
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107196d = context.getExternalFilesDir(null);
                }
                file = com.ss.android.ugc.aweme.lancet.d.f107196d;
            }
            return new File(file, string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
