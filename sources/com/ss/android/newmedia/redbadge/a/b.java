package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class b implements a {
    static {
        Covode.recordClassIndex(37072);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
            intent.putExtra("package", componentName.getPackageName());
            intent.putExtra("count", i2);
            intent.putExtra("badgecount", i2);
            intent.putExtra("class", componentName.getClassName());
            context.sendBroadcast(intent);
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
