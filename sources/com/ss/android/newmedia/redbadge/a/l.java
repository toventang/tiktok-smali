package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class l implements a {
    static {
        Covode.recordClassIndex(37082);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.smartisanos.launcher", "com.smartisanos.home");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        MethodCollector.i(156);
        if (context == null || componentName == null) {
            MethodCollector.o(156);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        Intent intent = new Intent("com.smartisanos.launcher.new_message");
        intent.putExtra("extra_packagename", componentName.getPackageName());
        intent.putExtra("extra_componentname", componentName.getClassName());
        intent.putExtra("extra_message_count", i2);
        if (com.ss.android.newmedia.redbadge.c.a.a(context, intent)) {
            try {
                context.sendBroadcast(intent);
                MethodCollector.o(156);
            } catch (Throwable th) {
                d dVar = new d(th.getMessage());
                MethodCollector.o(156);
                throw dVar;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("badge_num", i2);
            try {
                context.getContentResolver().call(Uri.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", (String) null, bundle);
                MethodCollector.o(156);
            } catch (Throwable unused) {
                d dVar2 = new d("unable to resolve intent: " + intent.toString());
                MethodCollector.o(156);
                throw dVar2;
            }
        }
    }
}
