package com.ss.android.ugc.aweme.account.login.loginlog;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.logging.LogManager;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f63488b;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<LoginLog> f63489a = new ArrayList<>();

    static {
        Covode.recordClassIndex(39131);
    }

    public static a a() {
        MethodCollector.i(2343);
        if (f63488b == null) {
            synchronized (LogManager.class) {
                try {
                    if (f63488b == null) {
                        f63488b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2343);
                    throw th;
                }
            }
        }
        a aVar = f63488b;
        MethodCollector.o(2343);
        return aVar;
    }
}
