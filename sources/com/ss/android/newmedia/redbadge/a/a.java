package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class a implements com.ss.android.newmedia.redbadge.a {
    static {
        Covode.recordClassIndex(37071);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher", "org.adw.launcher.one");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            Intent intent = new Intent("org.adw.launcher.counter.SEND");
            intent.putExtra("PNAME", componentName.getPackageName());
            intent.putExtra("CNAME", componentName.getClassName());
            intent.putExtra("COUNT", i2);
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
