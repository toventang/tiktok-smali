package com.google.firebase.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.firebase.b.c;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f54363a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f54364b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f54365c;

    /* renamed from: d  reason: collision with root package name */
    private final c f54366d;

    static {
        Covode.recordClassIndex(33749);
    }

    private boolean a() {
        ApplicationInfo applicationInfo;
        if (this.f54365c.contains("firebase_data_collection_default_enabled")) {
            return this.f54365c.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f54364b.getPackageManager();
            if (packageManager != null) {
                String packageName = this.f54364b.getPackageName();
                if (TextUtils.equals(packageName, d.a().getPackageName())) {
                    if (b.f107191a == null) {
                        b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = b.f107191a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public a(Context context, String str, c cVar) {
        Context context2;
        if (Build.VERSION.SDK_INT < 24 || androidx.core.content.b.b(context)) {
            context2 = context;
        } else {
            context2 = androidx.core.content.b.a(context);
        }
        this.f54364b = context2;
        this.f54365c = com.ss.android.ugc.aweme.bf.d.a(context, "com.google.firebase.common.prefs:".concat(String.valueOf(str)), 0);
        this.f54366d = cVar;
        this.f54363a = new AtomicBoolean(a());
    }
}
