package com.bytedance.android.livesdk.ah.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public class a implements c {
    static {
        Covode.recordClassIndex(7624);
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public boolean a() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public boolean b() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public Intent a(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }
}
