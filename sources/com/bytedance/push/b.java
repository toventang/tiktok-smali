package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.h;
import com.bytedance.push.c.j;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static h f42047a = new e();

    static {
        Covode.recordClassIndex(25703);
    }

    public static j a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        com.ss.android.message.a.a((Application) applicationContext);
        return com.ss.android.pushmanager.setting.b.b();
    }
}
