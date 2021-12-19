package com.bytedance.ies.ugc.network.partner;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class NetworkPartnerGroup {

    /* renamed from: a  reason: collision with root package name */
    public final List<b.a> f35216a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b.e> f35217b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b.f> f35218c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b.d> f35219d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b.AbstractC0800b> f35220e;

    /* renamed from: f  reason: collision with root package name */
    public final StringBuilder f35221f;

    public static final class PartnerInterceptor implements com.bytedance.retrofit2.c.a {

        /* renamed from: c  reason: collision with root package name */
        public static final h.h f35222c = i.a((h.f.a.a) b.f35230a);

        /* renamed from: d  reason: collision with root package name */
        public static final a f35223d = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public List<? extends b.AbstractC0800b> f35224a;

        /* renamed from: b  reason: collision with root package name */
        public final StringBuilder f35225b;

        /* renamed from: e  reason: collision with root package name */
        private final List<b.a> f35226e;

        /* renamed from: f  reason: collision with root package name */
        private final List<b.e> f35227f;

        /* renamed from: g  reason: collision with root package name */
        private final List<b.f> f35228g;

        /* renamed from: h  reason: collision with root package name */
        private final List<b.d> f35229h;

        public static final class a {
            static {
                Covode.recordClassIndex(21107);
            }

            public static Handler a() {
                return (Handler) PartnerInterceptor.f35222c.getValue();
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        static final class b extends m implements h.f.a.a<Handler> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f35230a = new b();

            static {
                Covode.recordClassIndex(21108);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Handler invoke() {
                HandlerThread handlerThread = new HandlerThread("PartnerBystanderThread");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PartnerInterceptor f35233a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Request f35234b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u f35235c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Throwable f35236d;

            static {
                Covode.recordClassIndex(21110);
            }

            d(PartnerInterceptor partnerInterceptor, Request request, u uVar, Throwable th) {
                this.f35233a = partnerInterceptor;
                this.f35234b = request;
                this.f35235c = uVar;
                this.f35236d = th;
            }

            public final void run() {
                try {
                    for (b.AbstractC0800b bVar : this.f35233a.f35224a) {
                        bVar.c(this.f35234b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PartnerInterceptor f35237a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f35238b;

            static {
                Covode.recordClassIndex(21111);
            }

            e(PartnerInterceptor partnerInterceptor, Throwable th) {
                this.f35237a = partnerInterceptor;
                this.f35238b = th;
            }

            public final void run() {
                try {
                    for (b.AbstractC0800b bVar : this.f35237a.f35224a) {
                        bVar.a(this.f35238b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PartnerInterceptor f35241a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Request f35242b;

            static {
                Covode.recordClassIndex(21113);
            }

            g(PartnerInterceptor partnerInterceptor, Request request) {
                this.f35241a = partnerInterceptor;
                this.f35242b = request;
            }

            public final void run() {
                try {
                    for (b.AbstractC0800b bVar : this.f35241a.f35224a) {
                        bVar.b(this.f35242b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PartnerInterceptor f35243a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f35244b;

            static {
                Covode.recordClassIndex(21114);
            }

            h(PartnerInterceptor partnerInterceptor, u uVar) {
                this.f35243a = partnerInterceptor;
                this.f35244b = uVar;
            }

            public final void run() {
                try {
                    for (b.AbstractC0800b bVar : this.f35243a.f35224a) {
                        bVar.a(this.f35244b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        static {
            Covode.recordClassIndex(21106);
        }

        /* access modifiers changed from: package-private */
        public static final class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PartnerInterceptor f35239a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Request f35240b;

            static {
                Covode.recordClassIndex(21112);
            }

            f(PartnerInterceptor partnerInterceptor, Request request) {
                this.f35239a = partnerInterceptor;
                this.f35240b = request;
            }

            public final void run() {
                boolean z;
                try {
                    for (b.AbstractC0800b bVar : this.f35239a.f35224a) {
                        bVar.a(this.f35240b);
                    }
                } catch (Throwable th) {
                    try {
                        com.bytedance.apm.b.a("fix2160NPE", (JSONObject) null, (JSONObject) null, new JSONObject().put("path", this.f35240b.getPath()).put("e", th.getMessage()));
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f35231a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.ies.ugc.network.partner.a.a f35232b;

            static {
                Covode.recordClassIndex(21109);
            }

            c(String str, com.bytedance.ies.ugc.network.partner.a.a aVar) {
                this.f35231a = str;
                this.f35232b = aVar;
            }

            public final void run() {
                String str = this.f35231a;
                l.b(str, "");
                com.bytedance.ies.ugc.network.partner.a.a aVar = this.f35232b;
                l.d(str, "");
                l.d(aVar, "");
                try {
                    aVar.f35255g.clear();
                    HashMap<String, Long> a2 = com.bytedance.ies.ugc.network.partner.a.a.a(com.bytedance.ies.ugc.network.partner.a.a.a(com.bytedance.ies.ugc.network.partner.a.a.a(com.bytedance.ies.ugc.network.partner.a.a.a(aVar.f35255g, aVar.f35251c), aVar.f35252d), aVar.f35253e), aVar.f35254f);
                    l.d(a2, "");
                    long j2 = 0;
                    for (Map.Entry<String, Long> entry : a2.entrySet()) {
                        j2 += entry.getValue().longValue();
                    }
                    JSONObject put = new JSONObject().put("all_handler_duration", j2).put("chain_proceed_duration", aVar.f35249a).put("partner_interceptor_duration", aVar.f35250b).put("partner_interceptor_self_duration", aVar.f35250b - aVar.f35249a).put("partner_process_duration", (aVar.f35250b - j2) - aVar.f35249a);
                    for (Map.Entry<String, Long> entry2 : aVar.f35251c.entrySet()) {
                        put.put(entry2.getKey() + '_' + "request" + "_duration", entry2.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry3 : aVar.f35252d.entrySet()) {
                        put.put(entry3.getKey() + '_' + "response" + "_duration", entry3.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry4 : aVar.f35253e.entrySet()) {
                        put.put(entry4.getKey() + '_' + "exception" + "_duration", entry4.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry5 : aVar.f35254f.entrySet()) {
                        put.put(entry5.getKey() + '_' + "block" + "_duration", entry5.getValue().longValue());
                    }
                    com.bytedance.apm.b.a("network_partner_log", (JSONObject) null, put, new JSONObject().put("path", str));
                } catch (Throwable unused) {
                }
            }
        }

        private final void a(Throwable th) {
            a.a().post(new e(this, th));
        }

        public PartnerInterceptor(NetworkPartnerGroup networkPartnerGroup) {
            boolean z;
            l.d(networkPartnerGroup, "");
            this.f35226e = new ArrayList(networkPartnerGroup.f35216a);
            this.f35227f = new ArrayList(networkPartnerGroup.f35217b);
            this.f35228g = new ArrayList(networkPartnerGroup.f35218c);
            this.f35229h = new ArrayList(networkPartnerGroup.f35219d);
            this.f35224a = new CopyOnWriteArrayList(networkPartnerGroup.f35220e);
            StringBuilder sb = new StringBuilder(networkPartnerGroup.f35221f);
            sb.append("PartnerInterceptor Bystanders, status={size: ").append(this.f35224a.size()).append(", data: [");
            for (Object obj : this.f35224a) {
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z).append(",");
            }
            sb.append("]}\n");
            this.f35225b = sb;
        }

        @Override // com.bytedance.retrofit2.c.a
        public final u intercept(a.AbstractC1036a aVar) {
            if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
                return a(aVar);
            }
            com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
            if (bVar.W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
                bVar.a(bVar.Y, uptimeMillis);
                bVar.b(bVar.Y, uptimeMillis);
            }
            bVar.a(getClass().getSimpleName());
            bVar.W = SystemClock.uptimeMillis();
            u<?> a2 = a(aVar);
            if (bVar.X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
                String simpleName = getClass().getSimpleName();
                bVar.a(simpleName, uptimeMillis2);
                bVar.c(simpleName, uptimeMillis2);
            }
            bVar.X = SystemClock.uptimeMillis();
            return a2;
        }

        private u<?> a(a.AbstractC1036a aVar) {
            Object obj;
            l.d(aVar, "");
            long uptimeMillis = SystemClock.uptimeMillis();
            Request a2 = aVar.a();
            l.b(a2, "");
            com.bytedance.ies.ugc.network.partner.b.f fVar = new com.bytedance.ies.ugc.network.partner.b.f(a2);
            a aVar2 = new a(aVar);
            com.bytedance.ies.ugc.network.partner.a.a aVar3 = aVar2.f35247c;
            try {
                u<?> a3 = a(fVar, aVar2);
                if (a3 != null) {
                    a(a2, a3, null);
                    return a3;
                }
                a.a().post(new f(this, a2));
                com.bytedance.ies.ugc.network.partner.a.a aVar4 = aVar2.f35247c;
                for (b.e eVar : this.f35227f) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    eVar.a(fVar, aVar2);
                    String a4 = eVar.a();
                    l.d(a4, "");
                    aVar4.f35251c.put(a4, Long.valueOf(com.bytedance.ies.ugc.network.partner.a.a.a(SystemClock.uptimeMillis() - uptimeMillis2, aVar4.f35251c.get(a4))));
                }
                Request b2 = fVar.b();
                u<?> b3 = b(fVar, aVar2);
                if (b3 != null) {
                    a(b2, b3, null);
                    String path = b2.getPath();
                    aVar3.f35250b = SystemClock.uptimeMillis() - uptimeMillis;
                    a.a().post(new c(path, aVar3));
                    return b3;
                }
                a.a().post(new g(this, b2));
                long uptimeMillis3 = SystemClock.uptimeMillis();
                try {
                    obj = q.m223constructorimpl(aVar.a(b2));
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                aVar3.f35249a = SystemClock.uptimeMillis() - uptimeMillis3;
                Throwable r14 = q.m226exceptionOrNullimpl(obj);
                if (r14 != null) {
                    a(r14);
                    com.bytedance.ies.ugc.network.partner.b.f fVar2 = new com.bytedance.ies.ugc.network.partner.b.f(b2);
                    com.bytedance.ies.ugc.network.partner.a.a aVar5 = aVar2.f35247c;
                    boolean z = false;
                    for (b.d dVar : this.f35229h) {
                        long uptimeMillis4 = SystemClock.uptimeMillis();
                        if (z || dVar.a(fVar2, aVar2, r14, z)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String a5 = dVar.a();
                        l.d(a5, "");
                        aVar5.f35253e.put(a5, Long.valueOf(com.bytedance.ies.ugc.network.partner.a.a.a(SystemClock.uptimeMillis() - uptimeMillis4, aVar5.f35253e.get(a5))));
                    }
                    if (!z) {
                        a(b2, null, r14);
                        throw r14;
                    }
                }
                r.a(obj);
                u uVar = (u) obj;
                a.a().post(new h(this, uVar));
                com.bytedance.ies.ugc.network.partner.b.g<?> gVar = new com.bytedance.ies.ugc.network.partner.b.g<>(uVar);
                com.bytedance.ies.ugc.network.partner.a.a aVar6 = aVar2.f35247c;
                for (b.f fVar3 : this.f35228g) {
                    long uptimeMillis5 = SystemClock.uptimeMillis();
                    fVar3.a(gVar, aVar2);
                    String a6 = fVar3.a();
                    l.d(a6, "");
                    aVar6.f35252d.put(a6, Long.valueOf(com.bytedance.ies.ugc.network.partner.a.a.a(SystemClock.uptimeMillis() - uptimeMillis5, aVar6.f35252d.get(a6))));
                }
                u<?> a7 = gVar.a();
                a(b2, a7, null);
                String path2 = b2.getPath();
                aVar3.f35250b = SystemClock.uptimeMillis() - uptimeMillis;
                a.a().post(new c(path2, aVar3));
                return a7;
            } finally {
                String path3 = a2.getPath();
                aVar3.f35250b = SystemClock.uptimeMillis() - uptimeMillis;
                a.a().post(new c(path3, aVar3));
            }
        }

        private final u<?> b(com.bytedance.ies.ugc.network.partner.b.f fVar, a aVar) {
            com.bytedance.ies.ugc.network.partner.a.a aVar2 = aVar.f35247c;
            try {
                for (b.a aVar3 : this.f35226e) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    aVar3.b(fVar, aVar);
                    aVar2.a(aVar3.a(), SystemClock.uptimeMillis() - uptimeMillis);
                }
                return null;
            } catch (Throwable th) {
                Object r1 = q.m223constructorimpl(r.a(th));
                Throwable r0 = q.m226exceptionOrNullimpl(r1);
                if (r0 == null) {
                    return (u) r1;
                }
                a(r0);
                throw r0;
            }
        }

        private final u<?> a(com.bytedance.ies.ugc.network.partner.b.f fVar, a aVar) {
            com.bytedance.ies.ugc.network.partner.a.a aVar2 = aVar.f35247c;
            try {
                for (b.a aVar3 : this.f35226e) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    u<?> a2 = aVar3.a(fVar, aVar);
                    aVar2.a(aVar3.a(), SystemClock.uptimeMillis() - uptimeMillis);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
            } catch (Throwable th) {
                Object r1 = q.m223constructorimpl(r.a(th));
                Throwable r0 = q.m226exceptionOrNullimpl(r1);
                if (r0 == null) {
                    return (u) r1;
                }
                a(r0);
                throw r0;
            }
        }

        private final void a(Request request, u<?> uVar, Throwable th) {
            a.a().post(new d(this, request, uVar, th));
        }
    }

    static {
        Covode.recordClassIndex(21105);
    }

    public final NetworkPartnerGroup a() {
        return new NetworkPartnerGroup(this);
    }

    public NetworkPartnerGroup() {
        this.f35216a = new ArrayList();
        this.f35217b = new ArrayList();
        this.f35218c = new ArrayList();
        this.f35219d = new ArrayList();
        this.f35220e = new ArrayList();
        this.f35221f = new StringBuilder();
    }

    public final NetworkPartnerGroup a(NetworkPartnerGroup networkPartnerGroup) {
        l.d(networkPartnerGroup, "");
        this.f35216a.addAll(networkPartnerGroup.f35216a);
        this.f35217b.addAll(networkPartnerGroup.f35217b);
        this.f35218c.addAll(networkPartnerGroup.f35218c);
        this.f35219d.addAll(networkPartnerGroup.f35219d);
        this.f35220e.addAll(networkPartnerGroup.f35220e);
        this.f35221f.append((CharSequence) networkPartnerGroup.f35221f);
        return this;
    }

    private NetworkPartnerGroup(NetworkPartnerGroup networkPartnerGroup) {
        this();
        a(networkPartnerGroup);
        this.f35221f.append((CharSequence) networkPartnerGroup.f35221f);
        StringBuilder append = this.f35221f.append("extend from super Group, ");
        l.b(append, "");
        a(append).append("\n");
    }

    public final NetworkPartnerGroup a(b bVar) {
        l.d(bVar, "");
        if (bVar instanceof b.AbstractC0800b) {
            StringBuilder append = this.f35221f.append("add bystander:");
            String a2 = bVar.a();
            if (a2 == null) {
                a2 = "null";
            }
            append.append(a2).append("\n");
            this.f35220e.add(bVar);
            return this;
        }
        if (bVar instanceof b.a) {
            this.f35216a.add(bVar);
        }
        if (bVar instanceof b.d) {
            this.f35219d.add(bVar);
        }
        if (bVar instanceof b.f) {
            this.f35218c.add(bVar);
        }
        if (bVar instanceof b.e) {
            this.f35217b.add(bVar);
        }
        return this;
    }

    public final StringBuilder a(StringBuilder sb) {
        boolean z;
        sb.append("status={size: ").append(this.f35220e.size()).append(", data: [");
        for (b.AbstractC0800b bVar : this.f35220e) {
            if (bVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z).append(",");
        }
        StringBuilder append = sb.append("]}");
        l.b(append, "");
        return append;
    }
}
