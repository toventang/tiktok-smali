package com.ss.android.ugc.awemepushlib.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(95068);
    }

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 4;
    }

    public static boolean b() {
        try {
            return true ^ "Hisense".equalsIgnoreCase(Build.BRAND);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean a() {
        if (f.j() == null) {
            return true;
        }
        return false;
    }

    private static boolean c() {
        try {
            if (!com.ss.android.common.util.f.d() && Build.VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Runnable runnable) {
        if (n.a()) {
            e.a(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean a(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8804);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8804);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static boolean a(int i2, Context context, Intent intent) {
        if (i2 == 0) {
            try {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:195:0x00cc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.core.app.i$g] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.core.app.i$f] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.core.app.i$c] */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.media.a.a$a] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.core.app.i$h] */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.core.app.i$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0362, code lost:
        if (r0 == false) goto L_0x0377;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x035e A[Catch:{ Exception -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x035f A[Catch:{ Exception -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03e5 A[LOOP:1: B:188:0x03e3->B:189:0x03e5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification a(android.content.Context r14, com.ss.android.ugc.awemepushlib.c.b r15, android.graphics.Bitmap r16, android.graphics.Bitmap r17, android.content.Intent r18) {
        /*
        // Method dump skipped, instructions count: 1149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.f.a.a(android.content.Context, com.ss.android.ugc.awemepushlib.c.b, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent):android.app.Notification");
    }
}
