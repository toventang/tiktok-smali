package com.bytedance.android.livesdk.ah.c;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class d extends a {
    static {
        Covode.recordClassIndex(7627);
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final boolean a() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.ah.c.c, com.bytedance.android.livesdk.ah.c.a
    public final Intent a(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}
