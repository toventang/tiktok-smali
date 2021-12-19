package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class k implements a {
    static {
        Covode.recordClassIndex(20604);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.WRITE_SETTINGS";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        return a.C0769a.a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        if (j.e()) {
            return Settings.System.canWrite(activity);
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        l.c(context, "");
        if (j.e()) {
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (j.a(context, intent)) {
                return intent;
            }
        }
        return j.b(context);
    }
}
