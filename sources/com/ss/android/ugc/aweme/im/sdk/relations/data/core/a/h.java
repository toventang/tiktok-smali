package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.c.b.a.k;
import h.c.f;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class h extends f<com.ss.android.ugc.aweme.social.c.a, IMContact> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.b<com.ss.android.ugc.aweme.social.c.a, IMContact> f103055a;

    static {
        Covode.recordClassIndex(66066);
    }

    public static final class a extends f.a<h, com.ss.android.ugc.aweme.social.c.a, IMContact> {

        /* renamed from: a  reason: collision with root package name */
        public final h f103056a = new h((byte) 0);

        static {
            Covode.recordClassIndex(66067);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ h a() {
            return this.f103056a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ h b() {
            return this.f103056a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final h.f.a.b<com.ss.android.ugc.aweme.social.c.a, IMContact> a() {
        return this.f103055a;
    }

    private h() {
        this.f103055a = b.f103057a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<com.ss.android.ugc.aweme.social.c.a> d() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<com.ss.android.ugc.aweme.social.c.a> c() {
        com.ss.android.ugc.aweme.social.widget.b.a aVar;
        int i2 = 0;
        if (IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() >= 15) {
            return new ArrayList();
        }
        com.bytedance.provider.b a2 = com.bytedance.provider.impl.c.f42017b.a().a("source_default_key", com.ss.android.ugc.aweme.social.widget.b.a.class);
        if (a2 == null || (aVar = (com.ss.android.ugc.aweme.social.widget.b.a) a2.a()) == null) {
            return new ArrayList();
        }
        bz unused = i.a(bs.f159054a, bf.f159041b.plus(new c(CoroutineExceptionHandler.f158926c)), null, new d(aVar, null), 2);
        List<User> a3 = aVar.a();
        ArrayList arrayList = new ArrayList(n.a((Iterable) a3, 10));
        for (T t : a3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            com.ss.android.ugc.aweme.social.c.a a4 = com.ss.android.ugc.aweme.social.c.b.a((User) t);
            a4.setSortIndex(i2);
            arrayList.add(a4);
            i2 = i3;
        }
        List<com.ss.android.ugc.aweme.social.c.a> g2 = n.g((Collection) arrayList);
        com.ss.android.ugc.aweme.im.service.m.a.c("MAFLoader", "load MaF size: " + g2.size());
        return g2;
    }

    public static final class c extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(66069);
        }

        public c(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a("MAFSource-Loader", "Error refreshing MAF user", th);
        }
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.social.c.a, com.ss.android.ugc.aweme.social.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103057a = new b();

        static {
            Covode.recordClassIndex(66068);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.social.c.a invoke(com.ss.android.ugc.aweme.social.c.a aVar) {
            l.d(aVar, "");
            return aVar;
        }
    }

    static final class d extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.social.widget.b.a $source;
        int label;

        static {
            Covode.recordClassIndex(66070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.social.widget.b.a aVar, h.c.d dVar) {
            super(2, dVar);
            this.$source = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.$source, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.social.widget.b.a aVar2 = this.$source;
                this.label = 1;
                if (aVar2.a(this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }
}
