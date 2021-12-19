package com.linecorp.linesdk.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final PackageInfo f54953a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54954b;

    /* renamed from: c  reason: collision with root package name */
    private String f54955c;

    static {
        Covode.recordClassIndex(34514);
    }

    public final String a() {
        String str;
        String str2 = this.f54955c;
        if (str2 != null) {
            return str2;
        }
        PackageInfo packageInfo = this.f54953a;
        String str3 = "UNK";
        if (packageInfo == null) {
            str = str3;
        } else {
            str = packageInfo.packageName;
        }
        PackageInfo packageInfo2 = this.f54953a;
        if (packageInfo2 != null) {
            str3 = packageInfo2.versionName;
        }
        Locale locale = Locale.getDefault();
        String str4 = str + "/" + str3 + " ChannelSDK/" + this.f54954b + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + "-" + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.f54955c = str4;
        return str4;
    }

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    e(Context context, String str) {
        this.f54953a = a(context);
        this.f54954b = str;
    }
}
