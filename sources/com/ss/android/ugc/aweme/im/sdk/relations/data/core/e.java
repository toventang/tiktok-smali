package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import java.util.Comparator;
import java.util.List;

public final class e extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f103105e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final String f103106f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c f103107g;

    /* renamed from: h  reason: collision with root package name */
    private final g<IMContact> f103108h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<IMContact> f103109i;

    static {
        Covode.recordClassIndex(66109);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66110);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e<IMContact> c() {
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<IMContact> aVar = this.f103109i;
        if (aVar != null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<R> aVar2 = new a.C2608a().a(this.f103108h).a(new c(this)).a(this).f103014a;
        this.f103109i = aVar2;
        if (aVar2 == null) {
            l.b();
        }
        return aVar2;
    }

    static final class b extends m implements h.f.a.b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103110a = new b();

        static {
            Covode.recordClassIndex(66111);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends IMUser> invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            l.d(list2, "");
            return n.a((Iterable) list2, (Comparator) new a());
        }

        public static final class a<T> implements Comparator {
            static {
                Covode.recordClassIndex(66112);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(Integer.valueOf(t2.getFollowStatus()), Integer.valueOf(t.getFollowStatus()));
            }
        }
    }

    static final /* synthetic */ class c extends j implements h.f.a.b<a.c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(66113);
        }

        c(e eVar) {
            super(1, eVar, e.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(a.c<IMContact> cVar) {
            a.c<IMContact> cVar2 = cVar;
            l.d(cVar2, "");
            return Boolean.valueOf(((e) this.receiver).a(cVar2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        super(cVar);
        String f2;
        l.d(cVar, "");
        if (cVar.f102992m) {
            f2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c();
        } else {
            f2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.f();
        }
        this.f103106f = f2;
        c.a aVar = new c.a();
        l.b(f2, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c cVar2 = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c) aVar.a(f2).a(false).a(100).a(b.f103110a).b();
        this.f103107g = cVar2;
        this.f103108h = g.a.a().a(this.f102997b).a(cVar2);
    }

    public final boolean a(a.c<IMContact> cVar) {
        List<R> list;
        if (cVar.f103017c != this.f102997b || cVar.f103016b.size() <= 15) {
            list = cVar.f103016b;
        } else {
            list = cVar.f103016b.subList(0, 15);
        }
        cVar.f103015a.put(cVar.f103017c, list);
        if (cVar.f103017c != this.f102997b || !(!list.isEmpty())) {
            if (cVar.f103017c == this.f103107g && ((com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c) cVar.f103017c).f103031e == 1 && (!list.isEmpty())) {
                list.get(0).setType(3);
            }
            return false;
        }
        list.get(0).setType(2);
        this.f102998c = a(list);
        return true;
    }
}
