package com.bytedance.android.livesdk.ah.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class b extends a {
    static {
        Covode.recordClassIndex(7625);
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final boolean a() {
        return super.a();
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final Intent a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}
