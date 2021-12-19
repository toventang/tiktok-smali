package com.ss.android.ugc.g.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.ss.android.ugc.g.a.a.c;
import h.f.b.l;
import h.f.b.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final long f145605a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, c> f145606b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, HashMap<String, Object>> f145607c;

    static {
        Covode.recordClassIndex(95631);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map.Entry f145608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f145609b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f145610c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.a f145611d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f145612e;

        static {
            Covode.recordClassIndex(95632);
        }

        a(Map.Entry entry, b bVar, z.e eVar, z.a aVar, z.e eVar2) {
            this.f145608a = entry;
            this.f145609b = bVar;
            this.f145610c = eVar;
            this.f145611d = aVar;
            this.f145612e = eVar2;
        }

        public final void run() {
            try {
                IcmpDetectResult detectIcmp = Netecho.INSTANCE.detectIcmp(((c) this.f145608a.getValue()).f145587a, this.f145609b.f145605a, 3);
                this.f145610c.element.put(this.f145608a.getKey(), detectIcmp);
                if (detectIcmp.getSuccess()) {
                    this.f145611d.element = true;
                }
            } catch (Throwable unused) {
            }
            this.f145612e.element.countDown();
        }
    }

    @Override // com.ss.android.ugc.g.a.b.a
    public final com.ss.android.ugc.g.a.a.a a() {
        com.ss.android.ugc.g.a.b bVar;
        z.e eVar = new z.e();
        eVar.element = (T) new CountDownLatch(this.f145606b.size());
        z.a aVar = new z.a();
        aVar.element = false;
        z.e eVar2 = new z.e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (Map.Entry<String, c> entry : this.f145606b.entrySet()) {
            new Thread(new a(entry, this, eVar2, aVar, eVar)).start();
        }
        try {
            eVar.element.await(this.f145605a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = aVar.element;
        for (Map.Entry entry2 : eVar2.element.entrySet()) {
            HashMap<String, Object> hashMap = this.f145607c.get(entry2.getKey());
            if (hashMap != null) {
                hashMap.put("icmp_result", entry2.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            bVar = com.ss.android.ugc.g.a.b.NETWORK_GOOD;
        } else {
            bVar = com.ss.android.ugc.g.a.b.NO_NETWORK;
        }
        return new com.ss.android.ugc.g.a.a.a(z2, bVar);
    }

    public b(HashMap<String, c> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j2) {
        l.c(hashMap, "");
        l.c(hashMap2, "");
        this.f145606b = hashMap;
        this.f145607c = hashMap2;
        this.f145605a = j2;
    }
}
