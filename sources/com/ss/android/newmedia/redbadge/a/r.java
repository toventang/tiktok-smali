package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Collections;
import java.util.List;

public class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f59995a = Uri.parse("content://com.android.badge/badge");

    static {
        Covode.recordClassIndex(37091);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        MethodCollector.i(4708);
        if (context == null || componentName == null) {
            MethodCollector.o(4708);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i2);
            context.getContentResolver().call(this.f59995a, "setAppBadgeCount", (String) null, bundle);
            MethodCollector.o(4708);
        } catch (Throwable th) {
            d dVar = new d(th.getMessage());
            MethodCollector.o(4708);
            throw dVar;
        }
    }
}
