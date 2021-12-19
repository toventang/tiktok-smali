package com.ss.android.common.applog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private static a f59188a;

    /* renamed from: b  reason: collision with root package name */
    private String f59189b;

    static {
        Covode.recordClassIndex(36595);
    }

    @Override // com.ss.android.common.applog.g
    public final String b() {
        return this.f59189b;
    }

    private a() {
        if (c()) {
            String a2 = a("ro.aliyun.clouduuid", "false");
            this.f59189b = a2;
            if (TextUtils.isEmpty(a2)) {
                this.f59189b = a("ro.sys.aliyun.clouduuid", "false");
            }
        }
    }

    public static a a() {
        MethodCollector.i(7899);
        if (f59188a == null) {
            synchronized (a.class) {
                try {
                    if (f59188a == null) {
                        f59188a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7899);
                    throw th;
                }
            }
        }
        a aVar = f59188a;
        MethodCollector.o(7899);
        return aVar;
    }

    private static boolean c() {
        try {
            if ((System.getProperty("java.vm.name") == null || !System.getProperty("java.vm.name").toLowerCase().contains("lemur")) && System.getProperty("ro.yunos.version") == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
