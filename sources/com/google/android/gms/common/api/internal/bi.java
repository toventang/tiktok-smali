package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bi extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f50097a;

    /* renamed from: b  reason: collision with root package name */
    private final bh f50098b;

    static {
        Covode.recordClassIndex(31252);
    }

    public final synchronized void a() {
        MethodCollector.i(11771);
        Context context = this.f50097a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f50097a = null;
        MethodCollector.o(11771);
    }

    public bi(bh bhVar) {
        this.f50098b = bhVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f50098b.a();
            a();
        }
    }
}
