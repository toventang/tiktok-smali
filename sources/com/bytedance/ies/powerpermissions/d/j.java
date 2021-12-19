package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import h.f.b.l;

public final class j implements a {
    static {
        Covode.recordClassIndex(20603);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.SYSTEM_ALERT_WINDOW";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        return a.C0769a.a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        if (com.bytedance.ies.powerpermissions.j.e()) {
            return Settings.canDrawOverlays(activity);
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        l.c(context, "");
        if (com.bytedance.ies.powerpermissions.j.e()) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            if (!com.bytedance.ies.powerpermissions.j.a()) {
                intent.setData(Uri.parse("package:" + context.getPackageName()));
            }
            if (com.bytedance.ies.powerpermissions.j.a(context, intent)) {
                return intent;
            }
        }
        return com.bytedance.ies.powerpermissions.j.b(context);
    }
}
