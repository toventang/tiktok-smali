package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import java.util.ArrayList;
import java.util.List;

public final class d implements a {
    static {
        Covode.recordClassIndex(37074);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return new ArrayList(0);
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
            if (com.ss.android.newmedia.redbadge.c.a.a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new com.ss.android.newmedia.redbadge.d(th.getMessage());
                }
            } else {
                throw new com.ss.android.newmedia.redbadge.d("unable to resolve intent: " + intent.toString());
            }
        }
    }
}
