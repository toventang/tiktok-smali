package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Collections;
import java.util.List;

public class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private static int f59987a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f59988b = Integer.MIN_VALUE;

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    static {
        Covode.recordClassIndex(37080);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        MethodCollector.i(4969);
        if (context == null || componentName == null) {
            MethodCollector.o(4969);
            return;
        }
        int i3 = this.f59988b;
        if (i3 == i2 || (i3 > 99 && i2 > 99)) {
            MethodCollector.o(4969);
            return;
        }
        this.f59988b = i2;
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i2);
        intent.putExtra("upgradeNumber", i2);
        if (com.ss.android.newmedia.redbadge.c.a.a(context, intent)) {
            try {
                context.sendBroadcast(intent);
                if (i2 <= 0 && Build.VERSION.SDK_INT < 23) {
                    Intent intent2 = (Intent) intent.clone();
                    intent2.putExtra("number", -1);
                    intent2.putExtra("upgradeNumber", -1);
                    context.sendBroadcast(intent2);
                }
                MethodCollector.o(4969);
            } catch (Throwable th) {
                d dVar = new d(th.getMessage());
                MethodCollector.o(4969);
                throw dVar;
            }
        } else {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i2);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                if (i2 <= 0 && Build.VERSION.SDK_INT < 23) {
                    Bundle bundle2 = (Bundle) bundle.clone();
                    bundle2.putInt("app_badge_count", -1);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle2);
                }
                MethodCollector.o(4969);
            } catch (Throwable unused) {
                d dVar2 = new d("unable to resolve intent: " + intent.toString());
                MethodCollector.o(4969);
                throw dVar2;
            }
        }
    }
}
