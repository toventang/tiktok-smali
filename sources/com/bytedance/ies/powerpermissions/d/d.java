package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class d implements a {
    static {
        Covode.recordClassIndex(20597);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.ACCESS_NOTIFICATION_POLICY";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        return j.a(activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        return a.C0769a.a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        l.c(context, "");
        if (j.d()) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            if (j.a(context, intent)) {
                return intent;
            }
        }
        return j.b(context);
    }
}
