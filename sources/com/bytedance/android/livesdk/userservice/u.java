package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private static volatile u f22110a;

    /* renamed from: b  reason: collision with root package name */
    private f f22111b;

    static {
        Covode.recordClassIndex(13021);
    }

    private u() {
    }

    public final f b() {
        if (this.f22111b == null) {
            this.f22111b = new c((IHostUser) a.a(IHostUser.class));
        }
        return this.f22111b;
    }

    public static u a() {
        MethodCollector.i(10498);
        if (f22110a == null) {
            synchronized (u.class) {
                try {
                    if (f22110a == null) {
                        f22110a = new u();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10498);
                    throw th;
                }
            }
        }
        u uVar = f22110a;
        MethodCollector.o(10498);
        return uVar;
    }
}
