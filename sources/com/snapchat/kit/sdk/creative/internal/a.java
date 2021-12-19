package com.snapchat.kit.sdk.creative.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.snapchat.kit.sdk.creative.d.a f57315a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57316b;

    static {
        Covode.recordClassIndex(35839);
    }

    public static String a(Context context) {
        CharSequence applicationLabel;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.setPackage(packageName);
        intent.addCategory("android.intent.category.LAUNCHER");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            if (!(resolveInfo.activityInfo == null || TextUtils.isEmpty(resolveInfo.activityInfo.nonLocalizedLabel))) {
                return resolveInfo.activityInfo.nonLocalizedLabel.toString();
            }
        }
        try {
            TextUtils.equals(packageName, d.a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (!(applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public a(String str, com.snapchat.kit.sdk.creative.d.a aVar) {
        this.f57316b = str;
        this.f57315a = aVar;
    }
}
