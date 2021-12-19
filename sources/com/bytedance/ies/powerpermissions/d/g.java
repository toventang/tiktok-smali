package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.a;
import com.bytedance.ies.powerpermissions.j;
import h.a.i;
import h.f.b.l;
import java.util.List;

public final class g implements a {
    static {
        Covode.recordClassIndex(20600);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final String a() {
        return "android.permission.MANAGE_EXTERNAL_STORAGE";
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean b(Activity activity) {
        l.c(activity, "");
        return a.C0769a.a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final Intent a(Context context) {
        l.c(context, "");
        if (j.a()) {
            l.c(context, "");
            if (j.a()) {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent.setData(Uri.parse("package:" + context.getPackageName()));
                if (j.a(context, intent)) {
                    return intent;
                }
            }
            return j.b(context);
        }
        l.c(context, "");
        return null;
    }

    @Override // com.bytedance.ies.powerpermissions.d.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        l.c(activity, "");
        if (j.a()) {
            return Environment.isExternalStorageManager();
        }
        List<String> j2 = i.j(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        if (!j.e()) {
            return true;
        }
        for (String str : j2) {
            if (!(str == null || j.a((Context) activity, str))) {
                return false;
            }
        }
        return true;
    }
}
