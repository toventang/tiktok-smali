package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.b.c;
import com.bytedance.frameworks.baselib.network.b.d;
import com.bytedance.frameworks.baselib.network.b.f;
import com.bytedance.retrofit2.v;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f29380a;

    static {
        Covode.recordClassIndex(17130);
    }

    public final void execute(Runnable runnable) {
        int i2;
        if (runnable != null) {
            c.a aVar = c.a.NORMAL;
            boolean z = false;
            if (runnable instanceof v) {
                v vVar = (v) runnable;
                int a2 = vVar.a();
                if (a2 == 0) {
                    aVar = c.a.LOW;
                } else {
                    if (1 != a2) {
                        if (2 == a2) {
                            aVar = c.a.HIGH;
                        } else if (3 == a2) {
                            aVar = c.a.IMMEDIATE;
                        }
                    }
                    aVar = c.a.NORMAL;
                }
                z = vVar.b();
                i2 = vVar.c();
            } else {
                i2 = 0;
            }
            if (f29380a == null) {
                f29380a = f.b();
            }
            com.bytedance.frameworks.baselib.network.b.a aVar2 = new com.bytedance.frameworks.baselib.network.b.a("NetExecutor", aVar, i2, runnable, z);
            if (z) {
                f29380a.a(aVar2);
            } else {
                f29380a.b(aVar2);
            }
        }
    }
}
