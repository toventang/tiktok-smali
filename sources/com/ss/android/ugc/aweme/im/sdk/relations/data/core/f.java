package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class f extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f103111f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public int f103112e;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f103113g;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f103114h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f103115i;

    /* renamed from: j  reason: collision with root package name */
    private final h f103116j;

    /* renamed from: k  reason: collision with root package name */
    private final g<IMContact> f103117k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<IMContact> f103118l;

    static {
        Covode.recordClassIndex(66114);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66115);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103119a = new b();

        static {
            Covode.recordClassIndex(66116);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h invoke() {
            return new h.a().f103056a;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        if (!this.f103115i || !com.ss.android.ugc.aweme.social.a.e.f133661f || !l.a((Object) this.f102999d.f102981b, (Object) "aweme")) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ class c extends j implements h.f.a.a<Boolean> {
        static {
            Covode.recordClassIndex(66117);
        }

        c(f fVar) {
            super(0, fVar, f.class, "interceptStart", "interceptStart()Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if (com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.i() > 0) goto L_0x001b;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.receiver
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.a r0 = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a) r0
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r0.f102999d
                boolean r1 = r0.f102982c
                r2 = 0
                r0 = 1
                if (r1 == 0) goto L_0x001b
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c r1 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                int r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.i()
                if (r0 <= 0) goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f.c.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e c() {
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<R> aVar = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<R>) this.f103118l;
        if (aVar == null) {
            if (i()) {
                com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "enter share panel maf experiment");
                this.f103117k.a((com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h) this.f103116j.getValue());
            }
            a.C2608a a2 = new a.C2608a().a(this.f103117k);
            c cVar = new c(this);
            l.d(cVar, "");
            a2.f103014a.f103009b = cVar;
            aVar = a2.a(new d(this)).b(new e(this)).a(this).f103014a;
            this.f103118l = aVar;
            if (aVar == null) {
                l.b();
            }
        }
        return aVar;
    }

    public /* synthetic */ f(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        this(cVar, 15);
    }

    static final /* synthetic */ class d extends j implements h.f.a.b<a.c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(66118);
        }

        d(f fVar) {
            super(1, fVar, f.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(a.c<IMContact> cVar) {
            a.c<IMContact> cVar2 = cVar;
            l.d(cVar2, "");
            return Boolean.valueOf(((f) this.receiver).a(cVar2));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(Throwable th) {
        l.d(th, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "onLoadError ".concat(String.valueOf(th)));
        super.a(th);
    }

    static final /* synthetic */ class e extends j implements h.f.a.b<List<IMContact>, List<IMContact>> {
        static {
            Covode.recordClassIndex(66119);
        }

        e(f fVar) {
            super(1, fVar, f.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<IMContact> invoke(List<IMContact> list) {
            List<IMContact> list2 = list;
            l.d(list2, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "interceptFinish, before list size: " + list2.size());
            if (((f) this.receiver).i()) {
                list2 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.a(list2);
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "interceptFinish, after list size: " + list2.size());
            return list2;
        }
    }

    public final boolean a(a.c<IMContact> cVar) {
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "intercept begin " + cVar.f103017c.getClass().getName() + " list: " + cVar.f103016b.size() + " map: " + cVar.f103015a.size());
        cVar.f103015a.put(cVar.f103017c, cVar.f103016b);
        this.f103114h.addAll(a(cVar.f103016b));
        if (cVar.f103017c == this.f102997b) {
            this.f102998c = a(cVar.f103016b);
            List<String> list = this.f103113g;
            List<String> list2 = this.f102998c;
            if (list2 == null) {
                l.b();
            }
            list.addAll(n.g((Collection) list2));
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.a();
        }
        List<R> list3 = cVar.f103016b;
        ArrayList arrayList = new ArrayList(n.a(list3, 10));
        int i2 = 0;
        for (T t : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (!(t2 instanceof com.ss.android.ugc.aweme.social.c.a) && (t2 instanceof IMUser)) {
                T t3 = t2;
                com.ss.android.ugc.aweme.im.sdk.common.data.service.b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
                String uid = t3.getUid();
                l.b(uid, "");
                t3.setRecType(familiarService.a(uid, t3.getSecUid(), t3));
            }
            if (i2 < 5) {
                t2.setIsRecentTop5Contact(1);
            }
            arrayList.add(z.f158842a);
            i2 = i3;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "intercept finish " + cVar.f103017c.getClass().getName());
        if (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.b.b(cVar.f103015a) > this.f103112e) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(List<IMContact> list, boolean z) {
        l.d(list, "");
        int size = list.size();
        int i2 = this.f103112e;
        if (size > i2) {
            list = list.subList(0, i2);
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelRelationModel", "onLoadSuccess list: " + list.size() + " hasMore: " + z);
        super.a(list, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar, int i2) {
        super(cVar);
        boolean z;
        l.d(cVar, "");
        this.f103112e = i2;
        this.f103113g = new ArrayList();
        this.f103114h = new LinkedHashSet();
        if (!cVar.a() || cVar.f102990k != c.b.NORMAL) {
            z = false;
        } else {
            z = true;
        }
        this.f103115i = z;
        this.f103116j = i.a((h.f.a.a) b.f103119a);
        g<IMContact> a2 = g.a.a();
        a2.a(this.f102997b);
        a2.a(a());
        a2.a(b());
        this.f103117k = a2;
    }
}
