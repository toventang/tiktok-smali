package com.bytedance.sdk.bdlynx.a.a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.thread.BdpThreadService;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f43650a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f43651b = i.a((h.f.a.a) a.f43652a);

    private static BdpThreadService a() {
        return (BdpThreadService) f43651b.getValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<BdpThreadService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f43652a = new a();

        static {
            Covode.recordClassIndex(26714);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpThreadService invoke() {
            return BdpManager.getInst().getService(BdpThreadService.class);
        }
    }

    static {
        Covode.recordClassIndex(26713);
    }

    public static void b(Runnable runnable) {
        l.c(runnable, "");
        a().runOnWorker(runnable);
    }

    public static void a(Runnable runnable) {
        l.c(runnable, "");
        a().runOnUIThread(runnable);
    }
}
