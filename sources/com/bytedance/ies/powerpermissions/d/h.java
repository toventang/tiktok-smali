package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class h implements a {
    static {
        Covode.recordClassIndex(20601);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.READ_PHONE_NUMBERS";
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
        if (!j.d()) {
            if (activity.checkSelfPermission("android.permission.READ_PHONE_STATE") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_NUMBERS")) {
                return false;
            }
            return true;
        } else if (b.a(activity, "android.permission.READ_PHONE_NUMBERS") == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        if (j.d()) {
            return a.C0769a.a(this, activity);
        }
        if (activity.checkSelfPermission("android.permission.READ_PHONE_STATE") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_NUMBERS")) {
            return false;
        }
        return true;
    }
}
