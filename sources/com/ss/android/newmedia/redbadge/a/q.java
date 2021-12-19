package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.ArrayList;
import java.util.List;

public class q implements a {
    static {
        Covode.recordClassIndex(37090);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return new ArrayList(0);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        MethodCollector.i(1949);
        if (context == null || componentName == null) {
            MethodCollector.o(1949);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i2);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        try {
            context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
            MethodCollector.o(1949);
        } catch (Throwable th) {
            d dVar = new d(th.getMessage());
            MethodCollector.o(1949);
            throw dVar;
        }
    }
}
