package com.ss.android.ugc.aweme.deeplink;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import java.util.regex.Pattern;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f79443a;

    static {
        Covode.recordClassIndex(49351);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(10339);
        if (f79443a == null) {
            synchronized (b.class) {
                try {
                    if (f79443a == null) {
                        f79443a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10339);
                    throw th;
                }
            }
        }
        b bVar = f79443a;
        MethodCollector.o(10339);
        return bVar;
    }

    public static boolean a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || !Pattern.compile("\\d+\\.\\d+\\.\\d+").matcher(str).matches()) {
            return false;
        }
        String[] split = d.i().split("\\.");
        String[] split2 = str.split("\\.");
        for (int i2 = 0; i2 < split.length; i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt < parseInt2) {
                SmartRouter.buildRoute(context, "//main/update_tips").withParam("debug_url", str2).withParam("version_required", str).addFlags(603979776).open();
                HashMap hashMap = new HashMap();
                hashMap.put("schema_url", str2);
                r.a("schema_update_toast_show", hashMap);
                return true;
            } else if (parseInt > parseInt2) {
                break;
            }
        }
        return false;
    }
}
