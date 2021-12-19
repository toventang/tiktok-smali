package com.ss.android.ugc.g.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.TcpDetectResult;
import com.ss.android.ugc.g.a.b;
import h.f.b.l;
import h.f.b.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final long f145613a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, com.ss.android.ugc.g.a.a.c> f145614b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, HashMap<String, Object>> f145615c;

    static {
        Covode.recordClassIndex(95633);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map.Entry f145616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f145617b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f145618c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.a f145619d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f145620e;

        static {
            Covode.recordClassIndex(95634);
        }

        a(Map.Entry entry, c cVar, z.e eVar, z.a aVar, z.e eVar2) {
            this.f145616a = entry;
            this.f145617b = cVar;
            this.f145618c = eVar;
            this.f145619d = aVar;
            this.f145620e = eVar2;
        }

        public final void run() {
            try {
                TcpDetectResult detectTcp = Netecho.INSTANCE.detectTcp(((com.ss.android.ugc.g.a.a.c) this.f145616a.getValue()).f145587a, ((com.ss.android.ugc.g.a.a.c) this.f145616a.getValue()).f145588b, this.f145617b.f145613a);
                this.f145618c.element.put(this.f145616a.getKey(), detectTcp);
                if (detectTcp.getSuccess()) {
                    this.f145619d.element = true;
                }
            } catch (Throwable unused) {
            }
            this.f145620e.element.countDown();
        }
    }

    @Override // com.ss.android.ugc.g.a.b.a
    public final com.ss.android.ugc.g.a.a.a a() {
        b bVar;
        z.e eVar = new z.e();
        eVar.element = (T) new CountDownLatch(this.f145614b.size());
        z.a aVar = new z.a();
        aVar.element = false;
        z.e eVar2 = new z.e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (Map.Entry<String, com.ss.android.ugc.g.a.a.c> entry : this.f145614b.entrySet()) {
            new Thread(new a(entry, this, eVar2, aVar, eVar)).start();
        }
        try {
            eVar.element.await(this.f145613a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = aVar.element;
        for (Map.Entry entry2 : eVar2.element.entrySet()) {
            HashMap<String, Object> hashMap = this.f145615c.get(entry2.getKey());
            if (hashMap != null) {
                hashMap.put("tcp_result", entry2.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            bVar = b.NETWORK_GOOD;
        } else {
            bVar = b.NO_NETWORK;
        }
        return new com.ss.android.ugc.g.a.a.a(z2, bVar);
    }

    public c(HashMap<String, com.ss.android.ugc.g.a.a.c> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j2) {
        l.c(hashMap, "");
        l.c(hashMap2, "");
        this.f145614b = hashMap;
        this.f145615c = hashMap2;
        this.f145613a = j2;
    }
}
