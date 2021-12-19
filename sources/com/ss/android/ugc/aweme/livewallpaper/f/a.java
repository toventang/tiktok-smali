package com.ss.android.ugc.aweme.livewallpaper.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;

public final class a {
    static {
        Covode.recordClassIndex(69736);
    }

    public static int a(Context context, String str) {
        String str2;
        int i2 = -1;
        if (context != null && !TextUtils.isEmpty(str)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    if (packageInfo != null) {
                        i2 = packageInfo.versionCode;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str2 = e2.getMessage();
                }
            }
            str2 = "";
            if (!TextUtils.isEmpty(str2)) {
                n.a("get_app_info", "", new c().a("errorMsg", str2).a());
            }
        }
        return i2;
    }
}
