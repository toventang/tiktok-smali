package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class h implements a {
    static {
        Covode.recordClassIndex(37078);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
            intent.putExtra("com.htc.launcher.extra.COUNT", i2);
            Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent2.putExtra("packagename", componentName.getPackageName());
            intent2.putExtra("count", i2);
            if (com.ss.android.newmedia.redbadge.c.a.a(context, intent) || com.ss.android.newmedia.redbadge.c.a.a(context, intent2)) {
                try {
                    context.sendBroadcast(intent);
                    context.sendBroadcast(intent2);
                } catch (Throwable th) {
                    throw new d(th.getMessage());
                }
            } else {
                throw new d("unable to resolve intent: " + intent2.toString());
            }
        }
    }
}
