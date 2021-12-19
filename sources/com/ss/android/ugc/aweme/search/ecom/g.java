package com.ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.b.b;
import com.ss.android.ugc.aweme.search.ecom.b.c;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<User> f121068a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<r> f121069b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<String> f121070c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<String> f121071d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<Boolean> f121072e;

    /* renamed from: f  reason: collision with root package name */
    private final h f121073f = i.a((h.f.a.a) a.f121074a);

    static {
        Covode.recordClassIndex(78873);
    }

    public final Map<String, Boolean> a() {
        return (Map) this.f121073f.getValue();
    }

    static final class a extends m implements h.f.a.a<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121074a = new a();

        static {
            Covode.recordClassIndex(78874);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Boolean> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecom.e
    public final void a(com.ss.android.ugc.aweme.search.ecom.a.a aVar, int i2) {
        String str;
        l.d(aVar, "");
        String str2 = aVar.f121033a;
        if (str2 != null && str2.length() != 0 && this.f121072e.invoke().booleanValue()) {
            boolean z = a().get(str2);
            if (z == null) {
                a().put(str2, true);
                z = false;
            }
            if (!l.a((Object) z, (Object) true)) {
                r invoke = this.f121069b.invoke();
                Map<String, String> a2 = c.a(this.f121068a.invoke(), aVar, invoke);
                a2.put("item_order", String.valueOf(i2 + 1));
                new b().b(a2).f();
                d dVar = (d) ((d) ((d) ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(invoke).g(invoke.n)).x(this.f121070c.invoke())).w(this.f121071d.invoke())).r("mt_goods");
                User invoke2 = this.f121068a.invoke();
                if (invoke2 != null) {
                    str = invoke2.getUid();
                } else {
                    str = null;
                }
                ((d) ((d) dVar.v(str)).s(aVar.f121034b)).d(Integer.valueOf(i2)).f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(h.f.a.a<? extends User> aVar, h.f.a.a<r> aVar2, h.f.a.a<String> aVar3, h.f.a.a<String> aVar4, h.f.a.a<Boolean> aVar5) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        l.d(aVar5, "");
        this.f121068a = aVar;
        this.f121069b = aVar2;
        this.f121070c = aVar3;
        this.f121071d = aVar4;
        this.f121072e = aVar5;
    }
}
