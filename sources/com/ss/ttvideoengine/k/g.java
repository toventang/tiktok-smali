package com.ss.ttvideoengine.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.b;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class g extends a {

    /* renamed from: f  reason: collision with root package name */
    public InetAddress f153033f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f153034g;

    /* renamed from: h  reason: collision with root package name */
    private Future f153035h;

    static {
        Covode.recordClassIndex(101695);
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void c() {
        if (!this.f153008b) {
            this.f153008b = true;
            Future future = this.f153035h;
            if (future != null) {
                future.cancel(true);
                this.f153035h = null;
            }
        }
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void d() {
        super.d();
        this.f153008b = true;
        Future future = this.f153035h;
        if (future != null) {
            future.cancel(true);
            this.f153035h = null;
        }
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f153037a;

        static {
            Covode.recordClassIndex(101697);
        }

        public final void run() {
            MethodCollector.i(13160);
            g gVar = this.f153037a.get();
            if (gVar == null) {
                MethodCollector.o(13160);
                return;
            }
            synchronized (g.class) {
                try {
                    if (!gVar.f153034g) {
                        gVar.f153034g = true;
                        gVar.c(new c("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                } finally {
                    MethodCollector.o(13160);
                }
            }
        }

        public a(g gVar) {
            this.f153037a = new WeakReference<>(gVar);
        }
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void b() {
        try {
            this.f153035h = b.a(new Runnable() {
                /* class com.ss.ttvideoengine.k.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101696);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
                    if (r4 != null) goto L_0x0079;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
                    r8.f153036a.c(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainLocalDNS", -9997));
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(11762);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
                    r3 = new org.json.JSONObject();
                    r1 = new org.json.JSONArray();
                    r1.put(r4);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                    r3.put("ips", r1);
                    r3.put("time", java.lang.System.currentTimeMillis());
                    r3.put("dns_type", "localDNS");
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 218
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.k.g.AnonymousClass1.run():void");
                }
            });
        } catch (Exception e2) {
            c(new c("kTTVideoErrorDomainLocalDNS", -9968, e2.getMessage()));
        }
        this.f153007a.postDelayed(new a(this), 10000);
    }

    public g(String str) {
        super(str);
        j.a("LocalDNS", "DNS use LocalDNS");
    }
}
