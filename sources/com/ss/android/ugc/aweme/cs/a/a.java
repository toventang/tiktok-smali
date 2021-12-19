package com.ss.android.ugc.aweme.cs.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.bk;
import com.ss.android.ugc.aweme.cs.a.b.a;
import com.ss.android.ugc.aweme.cs.h.e;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.hz;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f78978a = i.a((h.f.a.a) c.f78989a);

    /* renamed from: b  reason: collision with root package name */
    private final h f78979b = i.a(new com.ss.android.ugc.aweme.cs.a.b.c());

    /* renamed from: c  reason: collision with root package name */
    private final h f78980c = i.a(new com.ss.android.ugc.aweme.cs.a.b.b());

    /* renamed from: d  reason: collision with root package name */
    private final h f78981d = i.a(new com.ss.android.ugc.aweme.cs.a.b.a());

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f78982e = bk.a();

    static {
        Covode.recordClassIndex(49017);
    }

    private final com.ss.android.ugc.aweme.cs.a.b.c c() {
        return (com.ss.android.ugc.aweme.cs.a.b.c) this.f78979b.getValue();
    }

    private final com.ss.android.ugc.aweme.cs.a.b.b d() {
        return (com.ss.android.ugc.aweme.cs.a.b.b) this.f78980c.getValue();
    }

    private final com.ss.android.ugc.aweme.cs.a.b.a e() {
        return (com.ss.android.ugc.aweme.cs.a.b.a) this.f78981d.getValue();
    }

    static final class c extends m implements h.f.a.a<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78989a = new c();

        static {
            Covode.recordClassIndex(49020);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<? extends String> invoke() {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            List<String> cacheCleanDefaultWhiteList = iESSettingsProxy.getCacheCleanDefaultWhiteList();
            l.b(cacheCleanDefaultWhiteList, "");
            return n.m(cacheCleanDefaultWhiteList);
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.e
    public final Set<String> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Set) this.f78978a.getValue());
        return linkedHashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    @Override // com.ss.android.ugc.aweme.cs.h.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.String> a() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cs.a.a.a():java.util.Set");
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.a.a$a  reason: collision with other inner class name */
    static final class C1834a<F, T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1834a f78983a = new C1834a();

        static {
            Covode.recordClassIndex(49018);
        }

        C1834a() {
        }

        @Override // com.google.c.a.f
        public final /* synthetic */ Object a(Object obj) {
            String str = (String) obj;
            if (str != null) {
                return new h.m.l("/data/user/0/").replaceFirst(str, "/data/data/");
            }
            return null;
        }
    }

    static final class b<F, T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78988a = new b();

        static {
            Covode.recordClassIndex(49019);
        }

        b() {
        }

        @Override // com.google.c.a.f
        public final /* synthetic */ Object a(Object obj) {
            String str = (String) obj;
            if (str != null) {
                return new h.m.l("/data/data/").replaceFirst(str, "/data/user/0/");
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.draft.n
    public final void a(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.cs.a.b.a e2 = e();
        e2.f78990a.set(true);
        if (hz.a()) {
            b.i.b(new a.CallableC1836a(e2), b.i.f4824a);
        } else {
            e2.a();
        }
    }
}
