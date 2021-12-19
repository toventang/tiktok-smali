package com.ss.android.ugc.aweme.discover.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.b;
import com.bytedance.jedi.a.b.c;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.b;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.discover.repo.fetcher.c;
import com.ss.android.ugc.aweme.discover.repo.gson.a;
import f.a.t;
import h.f.b.l;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1916a f81992b = new C1916a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.discover.repo.a.a f81993d = new com.ss.android.ugc.aweme.discover.repo.a.a();

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.discover.repo.fetcher.b f81994c;

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.a$a  reason: collision with other inner class name */
    public static final class C1916a {
        static {
            Covode.recordClassIndex(51035);
        }

        private C1916a() {
        }

        public /* synthetic */ C1916a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(51033);
    }

    public a() {
        com.ss.android.ugc.aweme.discover.repo.fetcher.b bVar = new com.ss.android.ugc.aweme.discover.repo.fetcher.b();
        this.f81994c = bVar;
        if (com.ss.android.ugc.aweme.discover.repo.gson.a.a()) {
            com.ss.android.ugc.aweme.discover.repo.gson.a.f82024b.submit(a.c.f82030a);
        }
        a(com.bytedance.jedi.a.c.b.a(bVar), com.bytedance.jedi.a.c.b.a(f81993d), a.b.a(a.b.C0952a.f39257a, AnonymousClass1.f81995a));
    }

    public final t<DiscoverSectionList> a(c cVar, boolean z) {
        t c2;
        l.d(cVar, "");
        if (cVar.getCursor() != -1 || !z) {
            c2 = this.f81994c.c(cVar);
        } else {
            c2 = com.bytedance.jedi.a.b.b.a(this.f81994c, f81993d, b.a.f39096a).a(c.b.f39099a).c(cVar);
        }
        t<DiscoverSectionList> b2 = c2.b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }
}
