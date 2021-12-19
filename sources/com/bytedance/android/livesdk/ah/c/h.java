package com.bytedance.android.livesdk.ah.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class h extends a {
    static {
        Covode.recordClassIndex(7632);
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final boolean a() {
        return super.a();
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final Intent a(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}
