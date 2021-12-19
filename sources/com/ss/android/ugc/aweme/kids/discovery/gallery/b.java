package com.ss.android.ugc.aweme.kids.discovery.gallery;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.discovery.api.DetailApi;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public final class b implements com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106466a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f106467b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f106468c;

    /* renamed from: d  reason: collision with root package name */
    private final String f106469d;

    static {
        Covode.recordClassIndex(68035);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68036);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final boolean a() {
        return this.f106467b;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final t<p<List<Aweme>, Integer>> b() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = DetailApi.a(this.f106469d, 0, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(currentTimeMillis)).d(new e(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final t<p<List<Aweme>, Integer>> c() {
        if (!this.f106467b) {
            t<p<List<Aweme>, Integer>> b2 = t.b(v.a(z.INSTANCE, -1));
            l.b(b2, "");
            return b2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = DetailApi.a(this.f106469d, this.f106468c, 8).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new C2716b(currentTimeMillis)).d(new c(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$b  reason: collision with other inner class name */
    static final class C2716b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106470a;

        static {
            Covode.recordClassIndex(68037);
        }

        C2716b(long j2) {
            this.f106470a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 2, -1, this.f106470a);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106473a;

        static {
            Covode.recordClassIndex(68039);
        }

        d(long j2) {
            this.f106473a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 1, -1, this.f106473a);
        }
    }

    public b(String str) {
        l.d(str, "");
        this.f106469d = str;
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106472b;

        static {
            Covode.recordClassIndex(68038);
        }

        c(b bVar, long j2) {
            this.f106471a = bVar;
            this.f106472b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.d dVar = (com.ss.android.ugc.aweme.kids.discovery.c.d) obj;
            l.d(dVar, "");
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 2, 0, this.f106472b);
            return this.f106471a.a(dVar);
        }
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106475b;

        static {
            Covode.recordClassIndex(68040);
        }

        e(b bVar, long j2) {
            this.f106474a = bVar;
            this.f106475b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.d dVar = (com.ss.android.ugc.aweme.kids.discovery.c.d) obj;
            l.d(dVar, "");
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 1, 0, this.f106475b);
            return this.f106474a.a(dVar);
        }
    }

    public final p<List<Aweme>, Integer> a(com.ss.android.ugc.aweme.kids.discovery.c.d dVar) {
        boolean z = true;
        if (dVar.f106440c != 1) {
            z = false;
        }
        this.f106467b = z;
        if (this.f106468c == dVar.f106439b) {
            return v.a(z.INSTANCE, -1);
        }
        this.f106468c = dVar.f106439b;
        List<? extends Aweme> list = dVar.f106438a;
        if (list == null) {
            return v.a(z.INSTANCE, -1);
        }
        if (((Aweme) list.get(0)).getLogPbBean() == null) {
            for (Aweme aweme : list) {
                aweme.setLogPbBean(dVar.f106441d);
            }
        }
        if (list.isEmpty()) {
            return v.a(z.INSTANCE, -1);
        }
        return v.a(list, 0);
    }
}
