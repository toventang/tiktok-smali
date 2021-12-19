package com.bytedance.android.live.core.f.b;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.android.live.core.f.b.a.b;
import com.bytedance.android.live.core.f.b.a.c;
import com.bytedance.android.live.core.f.b.a.d;
import com.bytedance.android.live.core.f.b.a.e;
import com.bytedance.android.live.core.f.b.a.f;
import com.bytedance.android.live.core.f.b.a.g;
import com.bytedance.android.live.core.f.b.a.h;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    static Map<String, c> f9050b = new HashMap<String, c>() {
        /* class com.bytedance.android.live.core.f.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(4618);
        }

        {
            put("OPPO", new e());
            put("VIVO", new g());
            put("HISENSE", new b());
            put("HUAWEI", new d());
            put("XIAOMI", new h());
            put("ASUS", new com.bytedance.android.live.core.f.b.a.a());
            put("ONEPLUS", new f());
        }
    };

    /* renamed from: c  reason: collision with root package name */
    static Map<String, c> f9051c = new HashMap<String, c>() {
        /* class com.bytedance.android.live.core.f.b.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(4619);
        }

        {
            put("HONOR", new c());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f9052a;

    static {
        Covode.recordClassIndex(4617);
    }

    public a(Context context) {
        boolean z;
        if (b(context) || a(context)) {
            z = true;
        } else {
            z = false;
        }
        this.f9052a = z;
    }

    private static boolean a(Context context) {
        boolean z;
        boolean z2;
        try {
            String trim = Build.MANUFACTURER.toUpperCase().trim();
            String trim2 = Build.BRAND.toUpperCase().trim();
            c cVar = f9050b.get(trim);
            c cVar2 = f9051c.get(trim2);
            if (cVar == null || !cVar.a(context)) {
                z = false;
            } else {
                z = true;
            }
            if (cVar2 == null || cVar == cVar2 || !cVar2.a(context)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean b(Context context) {
        androidx.fragment.app.e a2 = p.a(context);
        if (a2 == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = a2.getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            com.ss.a.a.a.b("DigHoleCheck", Log.getStackTraceString(e2));
            return false;
        }
    }
}
