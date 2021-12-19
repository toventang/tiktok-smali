package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.m;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f103381a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f103382b = new h();

    /* renamed from: c  reason: collision with root package name */
    private static final h.h f103383c = i.a((h.f.a.a) a.f103385a);

    /* renamed from: d  reason: collision with root package name */
    private static int f103384d = -1;

    private static List<Runnable> a() {
        return (List) f103383c.getValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<List<Runnable>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103385a = new a();

        static {
            Covode.recordClassIndex(66251);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<Runnable> invoke() {
            return new ArrayList();
        }
    }

    static {
        Covode.recordClassIndex(66250);
    }

    public static final synchronized void a(boolean z) {
        int i2;
        synchronized (h.class) {
            MethodCollector.i(6794);
            com.ss.android.ugc.aweme.im.service.m.a.b("ShareStyle", "setShareHeadShow: ".concat(String.valueOf(z)));
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            f103384d = i2;
            f103381a = false;
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            a().clear();
            MethodCollector.o(6794);
        }
    }
}
