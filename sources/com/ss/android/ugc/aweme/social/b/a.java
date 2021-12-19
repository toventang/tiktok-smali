package com.ss.android.ugc.aweme.social.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.n;
import com.ss.android.ugc.aweme.experiment.fa;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IContactService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.c.i;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.social.a.e;
import h.c.b.a.k;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;

public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f133673a = "RecUserLego";

    static {
        Covode.recordClassIndex(87439);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.SPARSE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class c extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(87442);
        }

        public c(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a("MAFSource-startup", "Error refreshing MAF user", th);
        }
    }

    static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                com.ss.android.ugc.aweme.common.f.a(this.this$0.f133673a, "start to load contact");
                n a2 = ((IContactService) ServiceManager.get().getService(IContactService.class)).a();
                this.label = 1;
                if (a2.b() == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.social.widget.b.b $source;
        int label;

        static {
            Covode.recordClassIndex(87443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.social.widget.b.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.$source = bVar;
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
                h.r.a(obj);
                com.ss.android.ugc.aweme.social.widget.b.b bVar = this.$source;
                this.label = 1;
                if (bVar.a(this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.b.a$a  reason: collision with other inner class name */
    public static final class C3463a extends h.c.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f133674a;

        static {
            Covode.recordClassIndex(87440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3463a(f.c cVar, a aVar) {
            super(cVar);
            this.f133674a = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            com.ss.android.ugc.aweme.common.f.a(this.f133674a.f133673a, "Error init local contact cache", th);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        boolean z2;
        com.ss.android.ugc.aweme.social.widget.b.b bVar = new com.ss.android.ugc.aweme.social.widget.b.b();
        com.bytedance.provider.impl.c.f42017b.a().a("source_default_key", bVar, com.ss.android.ugc.aweme.social.widget.b.a.class);
        bVar.f133717a.clear();
        if (!e.f133661f || IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() >= 15) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || ((com.ss.android.ugc.aweme.social.a.f.f133665a && IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() < 15) || i.a())) {
            bz unused = kotlinx.coroutines.i.a(an.a(cu.a().plus(bf.f159041b)), bf.f159041b.plus(new c(CoroutineExceptionHandler.f158926c)), null, new d(bVar, null), 2);
        }
        if (fa.f90019a) {
            bz unused2 = kotlinx.coroutines.i.a(an.a(cu.a().plus(bf.f159041b)), bf.f159041b.plus(new C3463a(CoroutineExceptionHandler.f158926c, this)), null, new b(this, null), 2);
        }
    }
}
