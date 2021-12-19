package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class n implements a {
    static {
        Covode.recordClassIndex(37087);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.vivo.launcher", "com.bbk.launcher2");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            try {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", componentName.getClassName());
                intent.putExtra("notificationNum", i2);
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.addFlags(16777216);
                }
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new d(th.getMessage());
            }
        }
    }
}
