package com.ss.android.pushmanager.setting;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f60124b;

    /* renamed from: a  reason: collision with root package name */
    public PushMultiProcessSharedProvider.b f60125a = PushMultiProcessSharedProvider.a(com.ss.android.message.a.f59817a);

    static {
        Covode.recordClassIndex(37144);
    }

    private a() {
    }

    private String c() {
        return this.f60125a.a("ssids", "");
    }

    public final String b() {
        HashMap hashMap = new HashMap();
        a(hashMap);
        return hashMap.get("device_id");
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(13182);
            if (f60124b == null) {
                synchronized (a.class) {
                    try {
                        if (f60124b == null) {
                            f60124b = new a();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(13182);
                        throw th;
                    }
                }
            }
            aVar = f60124b;
            MethodCollector.o(13182);
        }
        return aVar;
    }

    public final void a(Map<String, String> map) {
        Logger.debug();
        try {
            String c2 = c();
            if (!m.a(c2)) {
                m.a(c2, map);
            }
        } catch (Exception unused) {
        }
    }
}
