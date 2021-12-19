package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.b;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class g extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f103146j = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c f103147e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f103148f;

    /* renamed from: g  reason: collision with root package name */
    final b f103149g;

    /* renamed from: h  reason: collision with root package name */
    final b f103150h;

    /* renamed from: i  reason: collision with root package name */
    final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c f103151i;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f103152m = h.i.a((h.f.a.a) C2616g.f103153a);
    private final h.h n = h.i.a((h.f.a.a) h.f103154a);
    private final String o;
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.b.b p;
    private final String q;
    private List<IMContact> r;
    private List<IMContact> s;
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c t;
    private final h.h u;
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g<IMContact> v;
    private com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<IMContact> w;

    static {
        Covode.recordClassIndex(66135);
    }

    public final List<Integer> i() {
        return (List) this.f103152m.getValue();
    }

    public final List<String> j() {
        return (List) this.n.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h k() {
        return (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h) this.u.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66136);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c a() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c b() {
        return this.f103151i;
    }

    static final class b extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(66137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.this$0.f102998c;
        }
    }

    static final class c extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(66138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.this$0.f103148f;
        }
    }

    static final class d extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(66139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.this$0.f102998c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$g  reason: collision with other inner class name */
    static final class C2616g extends m implements h.f.a.a<List<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2616g f103153a = new C2616g();

        static {
            Covode.recordClassIndex(66142);
        }

        C2616g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<Integer> invoke() {
            return new ArrayList();
        }
    }

    static final class h extends m implements h.f.a.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f103154a = new h();

        static {
            Covode.recordClassIndex(66143);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    static final class i extends m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f103155a = new i();

        static {
            Covode.recordClassIndex(66144);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h invoke() {
            return new h.a().f103056a;
        }
    }

    static final class e extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.b.c $parameters;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(66140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
            super(0);
            this.this$0 = gVar;
            this.$parameters = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<String> invoke() {
            if (this.$parameters.f102989j) {
                return this.this$0.f103148f;
            }
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final z g() {
        j().clear();
        i().clear();
        return super.g();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a
    public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e c() {
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<R> aVar = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a<R>) this.w;
        if (aVar == null) {
            aVar = new a.C2608a().a(this.v).a(new j(this)).b(new k(this)).a(this).f103014a;
            this.w = aVar;
            if (aVar == null) {
                h.f.b.l.b();
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        if (!com.ss.android.ugc.aweme.social.a.f.f133665a || !h.f.b.l.a((Object) this.f102999d.f102980a, (Object) true) || !h.f.b.l.a((Object) this.f102999d.f102981b, (Object) "aweme")) {
            return false;
        }
        return true;
    }

    static final class f extends m implements h.f.a.b<IMContact, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.b.c $parameters;

        static {
            Covode.recordClassIndex(66141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
            super(1);
            this.$parameters = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(IMContact iMContact) {
            IMContact iMContact2 = iMContact;
            h.f.b.l.d(iMContact2, "");
            return Boolean.valueOf(c.a.a(this.$parameters).a(iMContact2));
        }
    }

    static final class l extends m implements h.f.a.b<IMContact, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.b.c $parameters;

        static {
            Covode.recordClassIndex(66147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
            super(1);
            this.$parameters = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(IMContact iMContact) {
            IMContact iMContact2 = iMContact;
            h.f.b.l.d(iMContact2, "");
            return Boolean.valueOf(c.a.a(this.$parameters).a(iMContact2));
        }
    }

    static void b(a.c<IMContact> cVar) {
        for (R r2 : cVar.f103016b) {
            r2.setType(16);
        }
        cVar.f103015a.put(cVar.f103017c, cVar.f103016b);
    }

    static final /* synthetic */ class k extends h.f.b.j implements h.f.a.b<List<IMContact>, List<IMContact>> {
        static {
            Covode.recordClassIndex(66146);
        }

        k(g gVar) {
            super(1, gVar, g.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<IMContact> invoke(List<IMContact> list) {
            List<IMContact> list2 = list;
            h.f.b.l.d(list2, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("SortWeightRelationModel", "interceptFinish, before list size: " + list2.size());
            if (((g) this.receiver).l()) {
                list2 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.a(g.b(list2));
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("SortWeightRelationModel", "interceptFinish, after list size: " + list2.size());
            return list2;
        }
    }

    static List<IMContact> c(List<IMContact> list) {
        int i2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IMContact iMContact = list.get(i3);
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser.getFollowStatus() == 2) {
                IMUser clone = iMUser.clone();
                if (arrayList.isEmpty()) {
                    h.f.b.l.b(clone, "");
                    clone.setType(5);
                } else {
                    h.f.b.l.b(clone, "");
                    clone.setType(6);
                }
                arrayList.add(clone);
            }
            if (i3 == 0) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            iMUser.setType(i2);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(a.c<IMContact> cVar) {
        int size = cVar.f103016b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                cVar.f103016b.get(i2).setType(2);
            } else {
                cVar.f103016b.get(i2).setType(1);
                if (i2 >= 5) {
                }
            }
            cVar.f103016b.get(i2).setIsRecentTop5Contact(1);
        }
        LinkedHashMap<com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e<R>, List<R>> linkedHashMap = cVar.f103015a;
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e<R> eVar = cVar.f103017c;
        int size2 = cVar.f103016b.size();
        List<R> list = cVar.f103016b;
        if (size2 > 15) {
            list = list.subList(0, 15);
        }
        linkedHashMap.put(eVar, list);
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.a();
        this.r.clear();
    }

    /* access modifiers changed from: package-private */
    public final void d(List<IMContact> list) {
        int size = list.size();
        String str = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            IMContact iMContact = list.get(i3);
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            String initialLetter = ((IMUser) iMContact).getInitialLetter();
            if (!TextUtils.isEmpty(initialLetter)) {
                if (str == null || TextUtils.equals(initialLetter, str)) {
                    i2++;
                } else {
                    j().add(str);
                    i().add(Integer.valueOf(i2));
                    i2 = 1;
                }
                if (i3 == list.size() - 1) {
                    List<String> j2 = j();
                    h.f.b.l.b(initialLetter, "");
                    j2.add(initialLetter);
                    i().add(Integer.valueOf(i2));
                }
                str = initialLetter;
            }
        }
    }

    static List<IMContact> b(List<IMContact> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (true ^ (t2 instanceof com.ss.android.ugc.aweme.social.c.a)) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (T t3 : list) {
            if (t3 instanceof com.ss.android.ugc.aweme.social.c.a) {
                arrayList3.add(t3);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            return list;
        }
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            IMContact iMContact = (IMContact) listIterator.previous();
            if (iMContact.getType() == 6 || iMContact.getType() == 5 || iMContact.getType() == 1 || iMContact.getType() == 2) {
                z = true;
            } else {
                z = false;
            }
            if ((iMContact instanceof IMUser) && z) {
                int nextIndex = listIterator.nextIndex();
                if (nextIndex != -1) {
                    int size = arrayList2.size();
                    int i2 = nextIndex + 1;
                    if (i2 < 0 || size <= i2) {
                        return list;
                    }
                    List<IMContact> g2 = n.g((Collection) arrayList2);
                    g2.addAll(i2, arrayList4);
                    return g2;
                }
            }
        }
        return list;
    }

    static final /* synthetic */ class j extends h.f.b.j implements h.f.a.b<a.c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(66145);
        }

        j(g gVar) {
            super(1, gVar, g.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(a.c<IMContact> cVar) {
            a.c<IMContact> cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            g gVar = (g) this.receiver;
            boolean z = true;
            if ((!h.f.b.l.a(cVar2.f103017c, gVar.f103149g)) && (!h.f.b.l.a(cVar2.f103017c, gVar.f103150h))) {
                List<R> list = cVar2.f103016b;
                ArrayList arrayList = new ArrayList(n.a(list, 10));
                for (T t : list) {
                    if (!(t instanceof com.ss.android.ugc.aweme.social.c.a) && (t instanceof IMUser)) {
                        T t2 = t;
                        com.ss.android.ugc.aweme.im.sdk.common.data.service.b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
                        String uid = t2.getUid();
                        h.f.b.l.b(uid, "");
                        t2.setRecType(familiarService.a(uid, t2.getSecUid(), t2));
                    }
                    arrayList.add(z.f158842a);
                }
            }
            if (cVar2.f103017c == gVar.f102997b) {
                gVar.a(cVar2);
            } else if (h.f.b.l.a(cVar2.f103017c, gVar.k())) {
                g.b(cVar2);
            } else {
                if (gVar.f102999d.b()) {
                    List<R> list2 = cVar2.f103015a.get(gVar.f102997b);
                    if (list2 != null && !list2.isEmpty()) {
                        gVar.j().add("recent");
                        gVar.i().add(Integer.valueOf(list2.size()));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<IMContact> c2 = g.c(cVar2.f103016b);
                    if (!c2.isEmpty()) {
                        if (gVar.f102999d.f102992m) {
                            gVar.d(c2);
                        } else {
                            gVar.j().add("Friend");
                            gVar.i().add(Integer.valueOf(c2.size()));
                        }
                        arrayList2.addAll(c2);
                    }
                    if (!gVar.f102999d.f102992m && (!cVar2.f103016b.isEmpty())) {
                        gVar.d(cVar2.f103016b);
                        arrayList2.addAll(cVar2.f103016b);
                    }
                    cVar2.f103015a.put(cVar2.f103017c, arrayList2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    List<IMContact> c3 = g.c(cVar2.f103016b);
                    if (!c3.isEmpty()) {
                        gVar.j().add("Friend");
                        gVar.i().add(Integer.valueOf(c3.size()));
                        arrayList3.addAll(c3);
                    }
                    if (!gVar.f102999d.f102992m && (!cVar2.f103016b.isEmpty())) {
                        gVar.d(cVar2.f103016b);
                        arrayList3.addAll(cVar2.f103016b);
                    }
                    cVar2.f103015a.put(cVar2.f103017c, arrayList3);
                }
                if (h.f.b.l.a(cVar2.f103017c, gVar.f103151i) || h.f.b.l.a(cVar2.f103017c, gVar.f103147e)) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        super(cVar);
        String f2;
        h.f.b.l.d(cVar, "");
        if (cVar.f102992m) {
            f2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c();
        } else {
            f2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.f();
        }
        this.o = f2;
        c.a a2 = new c.a().a(true);
        h.f.b.l.b(f2, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c cVar2 = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c) a2.a(f2).a(-1).b(new l(cVar)).b();
        this.f103147e = cVar2;
        this.p = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102978c;
        String d2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.d();
        this.q = d2;
        this.f103148f = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        b.a a3 = new b.a().a(new b(this)).a(com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102977b);
        String d3 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.d();
        h.f.b.l.b(d3, "");
        this.f103149g = (b) a3.a(d3).a(-1).b();
        b.a aVar = new b.a();
        String e2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.e();
        h.f.b.l.b(e2, "");
        this.f103150h = (b) aVar.a(e2).a(new d(this)).a(com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102977b).a(-1).b();
        c.a aVar2 = new c.a();
        h.f.b.l.b(d2, "");
        this.t = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c) aVar2.a(d2).a(false).a(new c(this)).a(-1).b();
        c.a aVar3 = new c.a();
        String f3 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.f();
        h.f.b.l.b(f3, "");
        this.f103151i = (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c) aVar3.a(f3).a(false).a(new e(this, cVar)).b(new f(cVar)).a(-1).b();
        this.u = h.i.a((h.f.a.a) i.f103155a);
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g a4 = g.a.a();
        if (cVar.b() && a4 != null) {
            a4.a(this.f102997b);
        }
        if (l() && a4 != null) {
            a4.a(k());
        }
        this.v = a4.a(cVar2);
    }
}
