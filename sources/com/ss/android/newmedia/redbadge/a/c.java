package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class c implements a {
    static {
        Covode.recordClassIndex(37073);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.lge.launcher3");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i2);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
            intent.putExtra("badge_vip_count", 0);
            if (com.ss.android.newmedia.redbadge.c.a.a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new d(th.getMessage());
                }
            } else {
                throw new d("unable to resolve intent: " + intent.toString());
            }
        }
    }
}
