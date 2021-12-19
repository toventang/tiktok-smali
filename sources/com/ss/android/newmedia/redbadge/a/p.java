package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class p implements a {
    static {
        Covode.recordClassIndex(37089);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        Object obj;
        Object obj2 = "";
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                declaredField.setAccessible(true);
                if (i2 == 0) {
                    obj = obj2;
                } else {
                    try {
                        obj = Integer.valueOf(i2);
                    } catch (Throwable unused) {
                        declaredField.set(newInstance, Integer.valueOf(i2));
                        return;
                    }
                }
                declaredField.set(newInstance, String.valueOf(obj));
            } catch (Throwable unused2) {
                throw new d(th.getMessage());
            }
        }
    }
}
