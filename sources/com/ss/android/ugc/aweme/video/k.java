package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.adapter.ak;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.HashMap;

public class k {

    /* renamed from: c  reason: collision with root package name */
    public static long f143431c;

    /* renamed from: d  reason: collision with root package name */
    private static k f143432d;

    /* renamed from: a  reason: collision with root package name */
    public ak f143433a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, RoomStruct> f143434b = new HashMap<>();

    static {
        Covode.recordClassIndex(93861);
    }

    public final void b() {
        ak akVar = this.f143433a;
        if (akVar != null) {
            akVar.a();
        }
    }

    public final void c() {
        ak akVar = this.f143433a;
        if (akVar != null) {
            akVar.a();
        }
    }

    private k() {
    }

    public static k a() {
        MethodCollector.i(10128);
        if (f143432d == null) {
            synchronized (k.class) {
                try {
                    if (f143432d == null) {
                        f143432d = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10128);
                    throw th;
                }
            }
        }
        k kVar = f143432d;
        MethodCollector.o(10128);
        return kVar;
    }
}
