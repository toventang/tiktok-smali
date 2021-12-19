package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class b implements a {
    static {
        Covode.recordClassIndex(20595);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.ACCEPT_HANDOVER";
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
        if (j.c() && androidx.core.content.b.a(activity, "android.permission.ACCEPT_HANDOVER") == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        if (!j.c()) {
            return false;
        }
        return a.C0769a.a(this, activity);
    }
}
