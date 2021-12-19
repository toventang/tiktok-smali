package com.ss.android.deviceregister;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f59470a;

    /* renamed from: b  reason: collision with root package name */
    final PackageManager f59471b;

    /* renamed from: c  reason: collision with root package name */
    final ComponentName f59472c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f59473d;

    static {
        Covode.recordClassIndex(36719);
    }

    private static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "STATE_DISABLED" : "STATE_ENABLED" : "STATE_DEFAULT";
    }

    e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        boolean z = false;
        SharedPreferences a2 = d.a(applicationContext, "device_register_migrate_detector", 0);
        this.f59470a = a2;
        PackageManager packageManager = applicationContext.getPackageManager();
        this.f59471b = packageManager;
        ComponentName componentName = new ComponentName(context, AActivity.class);
        this.f59472c = componentName;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        int i2 = a2.getInt("component_state", 0);
        a(componentEnabledSetting);
        a(i2);
        if (componentEnabledSetting == 0 && i2 == 2) {
            z = true;
        }
        this.f59473d = z;
    }
}
