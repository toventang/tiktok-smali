package com.ss.android.token;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static String f61036a;

    static {
        Covode.recordClassIndex(37594);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC, Splitter:B:29:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.token.g.a():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if (b2 == null || b2.contains(":") || !b2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    private static String b(Context context) {
        String str = f61036a;
        if (!m.a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f61036a = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e.a(e2);
        }
        String a2 = a();
        f61036a = a2;
        return a2;
    }

    public static String a(String str) {
        String[] split;
        String str2 = "";
        try {
            str2 = new URI(str).getHost().toLowerCase();
            Matcher matcher = Pattern.compile("[^\\.]+(\\.com|\\.net|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.app|\\.edu)").matcher(str2);
            if (matcher.find()) {
                return matcher.group();
            }
        } catch (Exception e2) {
            e.a(e2);
        }
        try {
            if (TextUtils.isEmpty(str2) || (split = str2.split("\\.")) == null || split.length <= 1) {
                return null;
            }
            return split[split.length - 2] + "." + split[split.length - 1];
        } catch (Exception e3) {
            e.a(e3);
            return null;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11647);
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
                    MethodCollector.o(11647);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(String str, Set<String> set) {
        if (!TextUtils.isEmpty(str) && set != null && !set.isEmpty()) {
            try {
                String lowerCase = new URI(str).getHost().toLowerCase();
                if (TextUtils.isEmpty(lowerCase)) {
                    return false;
                }
                for (String str2 : set) {
                    if (!TextUtils.isEmpty(str2) && lowerCase.endsWith(str2)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                e.a(e2);
            }
        }
        return false;
    }
}
