package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a.b;
import com.bytedance.helios.api.b.k;
import com.bytedance.helios.api.b.l;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.f;
import com.bytedance.helios.sdk.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class n extends b implements com.bytedance.helios.api.a.c {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f30907d = {"FORE_START_FORE_END", "FORE_START_BACK_END", "BACK_START_FORE_END", "BACK_START_BACK_END"};

    /* renamed from: e  reason: collision with root package name */
    public static final a f30908e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.helios.api.b.n> f30909c = new ArrayList();

    public abstract String b();

    public abstract List<Integer> b(int i2);

    public static final class a {
        static {
            Covode.recordClassIndex(17936);
        }

        public static int a(boolean z, boolean z2) {
            return ((!z ? 1 : 0) << 1) | (!z2 ? 1 : 0);
        }

        public static String a(boolean z) {
            return z ? "FORE_START" : "BACK_START";
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.helios.api.a.c
    public List<com.bytedance.helios.api.b.n> getHoldingResources() {
        return this.f30909c;
    }

    static {
        Covode.recordClassIndex(17935);
    }

    public n() {
        b.a.a().addResourceChecker(b(), this);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final com.bytedance.helios.api.b.n f30910a;

        static {
            Covode.recordClassIndex(17937);
        }

        public final void run() {
            List<k> jsbEvents;
            l lVar = o.f30691g;
            if (lVar == null || (jsbEvents = lVar.getJsbEvents()) == null || !(!jsbEvents.isEmpty())) {
                this.f30910a.C = "";
                return;
            }
            this.f30910a.C = "jsb";
            this.f30910a.D = jsbEvents;
        }

        public b(com.bytedance.helios.api.b.n nVar) {
            h.f.b.l.c(nVar, "");
            this.f30910a = nVar;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f30911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f30912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f30913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f30914d;

        static {
            Covode.recordClassIndex(17938);
        }

        c(n nVar, List list, d dVar, e eVar) {
            this.f30911a = nVar;
            this.f30912b = list;
            this.f30913c = dVar;
            this.f30914d = eVar;
        }

        public final void run() {
            int i2;
            for (Number number : this.f30912b) {
                number.intValue();
                Object obj = this.f30913c.f30863b;
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                this.f30911a.a((long) i2, this.f30912b, this.f30914d, this.f30913c, null);
            }
        }
    }

    public long a(d dVar) {
        int i2;
        h.f.b.l.c(dVar, "");
        Object obj = dVar.f30863b;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (long) i2;
    }

    /* access modifiers changed from: protected */
    public final void b(d dVar) {
        h.f.b.l.c(dVar, "");
        for (T t : this.f30909c) {
            if (t.B == null && t.q == a(dVar)) {
                t.B = new com.bytedance.helios.api.b.b(dVar.f30866e, 2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(m mVar) {
        h.f.b.l.c(mVar, "");
        String a2 = mVar.a();
        String b2 = mVar.b();
        int[] c2 = mVar.c();
        String[] d2 = mVar.d();
        int[] e2 = mVar.e();
        int length = c2.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(c2[i2], new e(a2, b2, c2[i2], d2[i2], e2[i2]));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar, d dVar, Throwable th) {
        h.f.b.l.c(eVar, "");
        h.f.b.l.c(dVar, "");
        if (eVar.f30874b == 0) {
            b(eVar, dVar, th);
        } else if (eVar.f30874b == 1) {
            c(eVar, dVar, th);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar, d dVar, List<Integer> list) {
        h.f.b.l.c(eVar, "");
        h.f.b.l.c(dVar, "");
        h.f.b.l.c(list, "");
        g.b().post(new c(this, list, dVar, eVar));
    }

    public void c(e eVar, d dVar, Throwable th) {
        h.f.b.l.c(eVar, "");
        h.f.b.l.c(dVar, "");
        long a2 = a(dVar);
        List<Integer> b2 = b(eVar.f30875c);
        StringBuilder append = new StringBuilder("monitorTrigger factors=").append(eVar.f30875c).append(" calledTime=").append(dVar.f30866e).append(' ').append("runtimeObjHashcode=").append(a2).append(" eventCurrentPageHashCode=");
        f a3 = f.a();
        h.f.b.l.a((Object) a3, "");
        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", append.append(a3.f()).toString(), (String) null, 12);
        a(a2, b2, eVar, dVar, th);
    }

    public void b(e eVar, d dVar, Throwable th) {
        h.f.b.l.c(eVar, "");
        h.f.b.l.c(dVar, "");
        if (a(dVar) != 0) {
            com.bytedance.helios.api.b.n a2 = dVar.a(th);
            f a3 = f.a();
            h.f.b.l.a((Object) a3, "");
            boolean c2 = a3.c();
            long a4 = a(dVar);
            a2.a(b());
            a2.f(a.a(c2));
            a2.u.add("pair_monitor");
            a2.q = a4;
            a2.t = 0;
            a2.n.put("runtimeObjHashCode", Long.valueOf(a4));
            a2.A = new com.bytedance.helios.api.b.a(b.a.a().getAnchorTaskName(), 3);
            g.b().postDelayed(new b(a2), 50);
            Iterator<T> it = this.f30909c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (a2.q == next.q) {
                    if (next != null) {
                        this.f30909c.remove(next);
                    }
                }
            }
            this.f30909c.add(a2);
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=" + a2.f30673b + " calledTime=" + a2.f30683l + ' ' + "runtimeObjHashcode=" + a2.q + " eventCurrentPageHashCode=" + a2.f30682k, (String) null, 12);
            com.bytedance.helios.sdk.c.f.a(a2);
        }
    }

    public final void a(long j2, List<Integer> list, e eVar, d dVar, Throwable th) {
        for (int size = this.f30909c.size() - 1; size >= 0; size--) {
            com.bytedance.helios.api.b.n nVar = this.f30909c.get(size);
            if (nVar.q == j2 && list.contains(Integer.valueOf(nVar.f30673b))) {
                com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "removeEndApiCallTrace eventId=" + dVar.f30865d + " eventName=" + nVar.f30674c + ' ' + "calledTime=" + dVar.f30866e + " eventStartTime=" + nVar.f30683l, (String) null, 12);
                f a2 = f.a();
                h.f.b.l.a((Object) a2, "");
                int a3 = a.a(!nVar.f30679h, !a2.d());
                com.bytedance.helios.api.b.b bVar = nVar.B;
                if (bVar != null) {
                    bVar.f30648b = dVar.f30866e;
                }
                nVar.f30673b = eVar.f30875c;
                String str = eVar.f30876d;
                h.f.b.l.a((Object) str, "");
                nVar.b(str);
                nVar.f(f30907d[a3]);
                StringBuilder append = new StringBuilder().append(nVar.f30677f);
                if (th == null) {
                    h.f.b.l.a();
                }
                nVar.d(append.append(com.bytedance.helios.a.a.f.a(th)).toString());
                nVar.r = dVar.f30867f;
                nVar.t = 1;
                com.bytedance.helios.sdk.c.f.a(nVar);
                this.f30909c.remove(size);
            }
        }
    }
}
