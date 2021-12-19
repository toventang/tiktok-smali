package com.bytedance.android.livesdk.ah.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public class f extends a {
    static {
        Covode.recordClassIndex(7630);
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final boolean a() {
        if (Build.VERSION.SDK_INT == 23) {
            return true;
        }
        return super.a();
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final Intent a(Context context) {
        String string;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i2 = applicationInfo.labelRes;
        if (i2 == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i2);
        }
        intent.putExtra("app_name", string);
        intent.putExtra("class_name", f.class.getSimpleName());
        return intent;
    }
}
