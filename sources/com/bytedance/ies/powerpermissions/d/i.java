package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class i implements a {
    static {
        Covode.recordClassIndex(20602);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.REQUEST_INSTALL_PACKAGES";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        return a.C0769a.a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        l.c(activity, "");
        if (j.d()) {
            return activity.getPackageManager().canRequestPackageInstalls();
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        l.c(context, "");
        if (j.d()) {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (j.a(context, intent)) {
                return intent;
            }
        }
        return j.b(context);
    }
}
