package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class e implements a {
    static {
        Covode.recordClassIndex(20598);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.ACTIVITY_RECOGNITION";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        l.c(context, "");
        return null;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        if (!j.b()) {
            if (activity.checkSelfPermission("android.permission.BODY_SENSORS") == 0) {
                return true;
            }
            return false;
        } else if (b.a(activity, "android.permission.ACTIVITY_RECOGNITION") == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        if (j.b()) {
            return a.C0769a.a(this, activity);
        }
        if (activity.checkSelfPermission("android.permission.BODY_SENSORS") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.ACTIVITY_RECOGNITION")) {
            return false;
        }
        return true;
    }
}
