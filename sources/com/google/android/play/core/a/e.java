package com.google.android.play.core.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.c.c;
import com.google.android.play.core.install.InstallState;

public final class e extends c<InstallState> {
    static {
        Covode.recordClassIndex(32639);
    }

    public e(Context context) {
        super(new b("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.google.android.play.core.c.c
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(a(intent, "package.name"))) {
            this.f53183d.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", a(intent, "package.name"));
            return;
        }
        this.f53183d.a("List of extras in received intent:", new Object[0]);
        for (String str : a(intent).keySet()) {
            this.f53183d.a("Key: %s; value: %s", str, a(a(intent), str));
        }
        b bVar = this.f53183d;
        bVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        bVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        bVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        com.google.android.play.core.install.c cVar = new com.google.android.play.core.install.c(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0), intent.getLongExtra("total.bytes.to.download", 0), intent.getIntExtra("error.code", 0), a(intent, "package.name"));
        this.f53183d.a("ListenerRegistryBroadcastReceiver.onReceive: %s", cVar);
        a(cVar);
    }
}
