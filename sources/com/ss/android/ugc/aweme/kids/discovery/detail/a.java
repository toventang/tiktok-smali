package com.ss.android.ugc.aweme.kids.discovery.detail;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.discovery.api.DetailApi;
import com.ss.android.ugc.aweme.kids.discovery.b.a;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public final class a implements com.ss.android.ugc.aweme.kids.commonfeed.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2714a f106447a = new C2714a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f106448b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f106449c;

    /* renamed from: d  reason: collision with root package name */
    private final String f106450d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f106451e;

    static {
        Covode.recordClassIndex(68022);
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean c() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$a  reason: collision with other inner class name */
    public static final class C2714a {
        static {
            Covode.recordClassIndex(68023);
        }

        private C2714a() {
        }

        public /* synthetic */ C2714a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> e() {
        t<p<List<Aweme>, Integer>> b2 = t.b(v.a(z.INSTANCE, -1));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> f() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = DetailApi.a(this.f106450d, this.f106449c, 8).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(currentTimeMillis)).d(new c(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> d() {
        if (this.f106451e) {
            List<Aweme> a2 = a.C2713a.a();
            if (a2 == null || !(!a2.isEmpty())) {
                t<p<List<Aweme>, Integer>> b2 = t.b(v.a(z.INSTANCE, -1));
                l.b(b2, "");
                return b2;
            }
            Object a3 = a.C2713a.a();
            if (a3 == null) {
                a3 = z.INSTANCE;
            }
            t<p<List<Aweme>, Integer>> b3 = t.b(v.a(a3, 0));
            l.b(b3, "");
            return b3;
        }
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = DetailApi.a(this.f106450d, 0, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(currentTimeMillis)).d(new e(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106452a;

        static {
            Covode.recordClassIndex(68024);
        }

        b(long j2) {
            this.f106452a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 2, -1, this.f106452a);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106455a;

        static {
            Covode.recordClassIndex(68026);
        }

        d(long j2) {
            this.f106455a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 3, -1, this.f106455a);
        }
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106454b;

        static {
            Covode.recordClassIndex(68025);
        }

        c(a aVar, long j2) {
            this.f106453a = aVar;
            this.f106454b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.d dVar = (com.ss.android.ugc.aweme.kids.discovery.c.d) obj;
            l.d(dVar, "");
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 2, 0, this.f106454b);
            return this.f106453a.a(dVar);
        }
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106457b;

        static {
            Covode.recordClassIndex(68027);
        }

        e(a aVar, long j2) {
            this.f106456a = aVar;
            this.f106457b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.d dVar = (com.ss.android.ugc.aweme.kids.discovery.c.d) obj;
            l.d(dVar, "");
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_detail", 3, 0, this.f106457b);
            return this.f106456a.a(dVar);
        }
    }

    public final p<List<Aweme>, Integer> a(com.ss.android.ugc.aweme.kids.discovery.c.d dVar) {
        boolean z = true;
        if (dVar.f106440c != 1) {
            z = false;
        }
        this.f106448b = z;
        if (this.f106449c == dVar.f106439b) {
            return v.a(z.INSTANCE, -1);
        }
        this.f106449c = dVar.f106439b;
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

    public a(String str, boolean z) {
        l.d(str, "");
        this.f106450d = str;
        this.f106451e = z;
    }
}
