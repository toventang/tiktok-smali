package com.ss.android.ugc.aweme.live.deeplink;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f108348a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static UniqueIdApi f108349b;

    /* renamed from: com.ss.android.ugc.aweme.live.deeplink.b$b  reason: collision with other inner class name */
    static final class C2780b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C2780b f108351a = new C2780b();

        static {
            Covode.recordClassIndex(69424);
        }

        C2780b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(69422);
        Object a2 = RetrofitFactory.a().b("https://" + d.f34604k.f34586a).d().a(UniqueIdApi.class);
        l.b(a2, "");
        f108349b = (UniqueIdApi) a2;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f108350a;

        static {
            Covode.recordClassIndex(69423);
        }

        a(h.f.a.b bVar) {
            this.f108350a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f108350a.invoke(obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.deeplink.a
    public final void a(String str, h.f.a.b<? super c, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        f108349b.getRoomId(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(bVar), C2780b.f108351a);
    }
}
