package com.ss.android.sdk.webview.di;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f60181b;

    /* renamed from: a  reason: collision with root package name */
    public IMainServiceForJsb f60182a;

    static {
        Covode.recordClassIndex(37176);
    }

    public static a a() {
        MethodCollector.i(1869);
        if (f60181b == null) {
            synchronized (a.class) {
                try {
                    if (f60181b == null) {
                        IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin = MainServiceForJsb.createIMainServiceForJsbbyMonsterPlugin(false);
                        if (createIMainServiceForJsbbyMonsterPlugin != null) {
                            a aVar = new a(createIMainServiceForJsbbyMonsterPlugin);
                            f60181b = aVar;
                            aVar.f60182a = createIMainServiceForJsbbyMonsterPlugin;
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Please add serviceImpl for IMainServiceForJsb");
                            MethodCollector.o(1869);
                            throw illegalStateException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1869);
                    throw th;
                }
            }
        }
        a aVar2 = f60181b;
        MethodCollector.o(1869);
        return aVar2;
    }

    private a(IMainServiceForJsb iMainServiceForJsb) {
        this.f60182a = iMainServiceForJsb;
    }

    public static synchronized void a(IMainServiceForJsb iMainServiceForJsb) {
        synchronized (a.class) {
            MethodCollector.i(1868);
            a aVar = f60181b;
            if (aVar == null) {
                f60181b = new a(iMainServiceForJsb);
                MethodCollector.o(1868);
                return;
            }
            aVar.f60182a = iMainServiceForJsb;
            MethodCollector.o(1868);
        }
    }
}
