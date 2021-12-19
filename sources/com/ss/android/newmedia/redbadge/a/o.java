package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Collections;
import java.util.List;

public class o implements a {
    static {
        Covode.recordClassIndex(37088);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Collections.singletonList("com.transsion.XOSLauncher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        MethodCollector.i(1524);
        Bundle bundle = new Bundle();
        try {
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i2);
            int i3 = Build.VERSION.SDK_INT;
            context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", (String) null, bundle);
            MethodCollector.o(1524);
        } catch (Exception e2) {
            e2.printStackTrace();
            d dVar = new d(e2.getMessage(), e2);
            MethodCollector.o(1524);
            throw dVar;
        }
    }
}
