package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f34457a;

    static {
        Covode.recordClassIndex(20596);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return this.f34457a;
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
        if (!j.b() || b.a(activity, this.f34457a) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        if (!j.b()) {
            return false;
        }
        return a.C0769a.a(this, activity);
    }

    public c(String str) {
        l.c(str, "");
        this.f34457a = str;
        if ((!l.a((Object) str, (Object) "android.permission.ACCESS_MEDIA_LOCATION")) && (!l.a((Object) str, (Object) "android.permission.ACCESS_BACKGROUND_LOCATION"))) {
            throw new RuntimeException("PermissionAccessLocation only accept android.permission.ACCESS_MEDIA_LOCATION or android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }
}
