package com.ss.android.ugc.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import com.ss.android.ugc.g.a.a.c;
import com.ss.android.ugc.g.a.a.d;
import com.ss.android.ugc.g.a.a.e;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.p;
import h.z;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArrayList<p<m<b, HashMap<String, HashMap<String, Object>>, z>, b<HashMap<String, Object>, z>>> f145567a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<Long> f145568b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.g.a.b.a> f145569c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, HashMap<String, Object>> f145570d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, c> f145571e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.g.a.a.b f145572f;

    /* renamed from: g  reason: collision with root package name */
    private final d f145573g;

    static {
        Covode.recordClassIndex(95622);
    }

    /* renamed from: com.ss.android.ugc.g.a.a$a  reason: collision with other inner class name */
    static final class RunnableC3869a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f145574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f145575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f145576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f145577d;

        static {
            Covode.recordClassIndex(95623);
        }

        RunnableC3869a(String str, z.e eVar, long j2, z.e eVar2) {
            this.f145574a = str;
            this.f145575b = eVar;
            this.f145576c = j2;
            this.f145577d = eVar2;
        }

        public final void run() {
            try {
                List<String> b2 = h.m.p.b(this.f145574a, new String[]{":"});
                if (b2.size() == 2) {
                    int parseInt = Integer.parseInt(b2.get(1));
                    if (1 <= parseInt) {
                        if (65534 >= parseInt) {
                            this.f145575b.element.put(this.f145574a, new p(Netecho.INSTANCE.resolveDns(b2.get(0), this.f145576c), Integer.valueOf(parseInt)));
                            p pVar = (p) this.f145575b.element.get(this.f145574a);
                            if (pVar != null) {
                                pVar.getFirst();
                            }
                            p pVar2 = (p) this.f145575b.element.get(this.f145574a);
                            if (pVar2 != null) {
                                pVar2.getSecond();
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.f145577d.element.countDown();
        }
    }

    public final void run() {
        String str;
        String[] strArr = this.f145572f.f145586g;
        long j2 = (long) this.f145572f.f145581b;
        z.e eVar = new z.e();
        eVar.element = (T) new CountDownLatch(strArr.length);
        z.e eVar2 = new z.e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (String str2 : strArr) {
            new Thread(new RunnableC3869a(str2, eVar2, j2, eVar)).start();
        }
        try {
            eVar.element.await(j2 + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        eVar2.element.size();
        for (Map.Entry entry : eVar2.element.entrySet()) {
            DnsResolveResult dnsResolveResult = (DnsResolveResult) ((p) entry.getValue()).getFirst();
            this.f145570d.put(entry.getKey(), new HashMap());
            HashMap<String, Object> hashMap = this.f145570d.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("dns_result", dnsResolveResult);
            }
            if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                AbstractMap abstractMap = this.f145571e;
                Object key = entry.getKey();
                String ip = ((DnsResolveResult) ((p) entry.getValue()).getFirst()).getIp();
                if (ip == null) {
                    l.a();
                }
                abstractMap.put(key, new c(ip, ((Number) ((p) entry.getValue()).getSecond()).intValue()));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = b.UNKNOWN_STATUS;
        try {
            long j3 = -1;
            long j4 = -1;
            for (T t : this.f145569c) {
                long currentTimeMillis2 = System.currentTimeMillis();
                com.ss.android.ugc.g.a.a.a a2 = t.a();
                if (t instanceof com.ss.android.ugc.g.a.b.b) {
                    j4 = System.currentTimeMillis() - currentTimeMillis2;
                } else if (t instanceof com.ss.android.ugc.g.a.b.c) {
                    j3 = System.currentTimeMillis() - currentTimeMillis2;
                }
                if (!Thread.interrupted()) {
                    bVar = a2.f145579b;
                    if (!a2.f145578a) {
                        break;
                    }
                } else {
                    return;
                }
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (bVar == b.NETWORK_GOOD) {
                d.f145629a = currentTimeMillis3;
            }
            if (bVar == b.NO_NETWORK && this.f145571e.size() == 0) {
                bVar = b.UNKNOWN_STATUS;
                str = "2";
            } else {
                str = null;
            }
            long j5 = currentTimeMillis3 - currentTimeMillis;
            if (j5 > ((long) this.f145572f.f145582c) + ((long) this.f145572f.f145583d) + 3000) {
                bVar = b.UNKNOWN_STATUS;
                str = "3";
            }
            this.f145570d.put("extra_info", com.ss.android.ugc.g.a.c.a.a(str, this.f145573g));
            boolean z = false;
            for (T t2 : this.f145567a) {
                ((m) t2.getFirst()).invoke(bVar, this.f145570d);
                if (!z) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(e.f145600j, String.valueOf(bVar.ordinal()));
                    hashMap2.put(e.f145593c, Long.valueOf(currentTimeMillis));
                    if (j3 != -1) {
                        hashMap2.put(e.f145596f, Long.valueOf(j3));
                    }
                    if (j4 != -1) {
                        hashMap2.put(e.f145595e, Long.valueOf(j4));
                    }
                    hashMap2.put(e.f145597g, Long.valueOf(j5));
                    hashMap2.put(e.f145601k, this.f145570d);
                    ((b) t2.getSecond()).invoke(hashMap2);
                    z = true;
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public a(com.ss.android.ugc.g.a.a.b bVar, d dVar) {
        l.c(bVar, "");
        l.c(dVar, "");
        this.f145572f = bVar;
        this.f145573g = dVar;
        ArrayList<com.ss.android.ugc.g.a.b.a> arrayList = new ArrayList<>();
        this.f145569c = arrayList;
        arrayList.add(new com.ss.android.ugc.g.a.b.b(this.f145571e, this.f145570d, (long) bVar.f145582c));
        arrayList.add(new com.ss.android.ugc.g.a.b.c(this.f145571e, this.f145570d, (long) bVar.f145583d));
    }
}
