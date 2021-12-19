package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.b.a.a;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.f.g;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import d.a.d.a.d;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class j extends aj<Effect> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f153843a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153844b;

    /* renamed from: c  reason: collision with root package name */
    private final String f153845c;

    /* renamed from: d  reason: collision with root package name */
    private final Effect f153846d;

    static {
        Covode.recordClassIndex(102611);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102612);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        if (d.f(this.f153846d.getTransResPath())) {
            d.g(this.f153846d.getTransResPath());
        }
    }

    @Override // com.ss.ugc.effectplatform.task.aj
    public final void a() {
        String uri;
        String str = this.f153845c;
        if (str == null || p.a((CharSequence) str)) {
            b();
            throw new Exception("effectDir is null");
        }
        UrlModel trans_file_url = this.f153846d.getTrans_file_url();
        String str2 = null;
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !p.a((CharSequence) uri) && p.a((CharSequence) this.f153846d.getTransResPath())) {
            com.ss.ugc.effectplatform.util.j.a(this.f153845c, this.f153846d);
        }
        d.a.e.b.a("DownloadTransResourceTask", "fetchEffect: " + this.f153846d.getEffect_id() + " name: " + this.f153846d.getName() + " download trans res: " + this.f153846d.getTransResPath());
        if (!d.f(this.f153846d.getTransResPath())) {
            com.ss.ugc.effectplatform.l.a.a(this.f153845c, this.f153846d);
            List<String> b2 = com.ss.ugc.effectplatform.util.j.b(this.f153846d.getTrans_file_url());
            if (b2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b2) {
                    if (!p.a((CharSequence) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    String str3 = this.f153845c;
                    String transResPath = this.f153846d.getTransResPath();
                    UrlModel trans_file_url2 = this.f153846d.getTrans_file_url();
                    if (trans_file_url2 != null) {
                        str2 = trans_file_url2.getUri();
                    }
                    a(str3, arrayList2, transResPath, str2);
                    return;
                }
            }
            b();
            throw new g("trans file url not exist");
        }
    }

    public static final class b implements d.a.f.c<e, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a.f.c f153847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a.f.c f153848b;

        static {
            Covode.recordClassIndex(102613);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // d.a.f.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(com.ss.ugc.effectplatform.a.c.e r3) {
            /*
                r2 = this;
                d.a.f.c r0 = r2.f153847a
                java.lang.Object r1 = r0.a(r3)
                d.a.f.c r0 = r2.f153848b
                java.lang.Object r0 = r0.a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.j.b.a(java.lang.Object):java.lang.Object");
        }

        public b(d.a.f.c cVar, d.a.f.c cVar2) {
            this.f153847a = cVar;
            this.f153848b = cVar2;
        }
    }

    public static final class c implements d.a.f.c<e, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a.f.c f153849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a.f.c f153850b;

        static {
            Covode.recordClassIndex(102614);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // d.a.f.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(com.ss.ugc.effectplatform.a.c.e r3) {
            /*
                r2 = this;
                d.a.f.c r0 = r2.f153849a
                java.lang.Object r1 = r0.a(r3)
                d.a.f.c r0 = r2.f153850b
                java.lang.Object r0 = r0.a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.j.c.a(java.lang.Object):java.lang.Object");
        }

        public c(d.a.f.c cVar, d.a.f.c cVar2) {
            this.f153849a = cVar;
            this.f153850b = cVar2;
        }
    }

    public j(com.ss.ugc.effectplatform.a aVar, String str, Effect effect) {
        l.c(aVar, "");
        l.c(effect, "");
        this.f153844b = aVar;
        this.f153845c = str;
        this.f153846d = effect;
    }

    private final void a(String str, List<String> list, String str2, String str3) {
        String d2;
        if (!d.f(str)) {
            d.e(str);
        }
        Exception e2 = null;
        c cVar = new c(new b(new com.ss.ugc.effectplatform.task.b.d(this.f153844b.r.f156544a), new com.ss.ugc.effectplatform.task.b.c(str, str2 + ".zip", str3)), new com.ss.ugc.effectplatform.task.b.b(str2));
        for (String str4 : list) {
            try {
                cVar.a(new e(str4, com.ss.ugc.effectplatform.a.c.c.GET, null, null, false, 28));
                f a2 = com.ss.ugc.effectplatform.b.d.a(str);
                if (!(a2 == null || (d2 = d.d(this.f153846d.getTransResPath())) == null)) {
                    ((com.ss.ugc.effectplatform.b.c) a2).g(a.C4084a.a(d2));
                    return;
                }
                return;
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        b();
        if (e2 != null) {
            throw e2;
        }
        throw new Exception("unknown exception");
    }
}
