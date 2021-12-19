package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.a.i.a;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import f.a.ab;
import f.a.t;
import f.a.x;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f extends com.ss.android.ugc.aweme.friends.g.a {

    /* renamed from: b  reason: collision with root package name */
    private final e f96992b;

    /* renamed from: c  reason: collision with root package name */
    private final d f96993c;

    /* renamed from: d  reason: collision with root package name */
    private final a f96994d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.jedi.a.a.c<String, User> f96995e;

    /* renamed from: f  reason: collision with root package name */
    private final h f96996f;

    /* renamed from: g  reason: collision with root package name */
    private final b f96997g = new b();

    static {
        Covode.recordClassIndex(61636);
    }

    public f() {
        e eVar = new e();
        this.f96992b = eVar;
        d dVar = new d();
        this.f96993c = dVar;
        a aVar = new a();
        this.f96994d = aVar;
        com.bytedance.jedi.a.a.c<String, User> a2 = UserService.d().a();
        this.f96995e = a2;
        h hVar = new h();
        this.f96996f = hVar;
        a(eVar, dVar, new a());
        a(hVar, dVar, new b());
        a(dVar, a2, new d());
        a(a2, dVar, new c());
        b(aVar, dVar, new e());
    }

    public static final class a extends m implements h.f.a.b<a.c<g, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>>, z> {
        static {
            Covode.recordClassIndex(61637);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.c<g, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>> cVar) {
            invoke((a.c<g, List<com.ss.android.ugc.aweme.user.repository.b>, Integer, List<com.ss.android.ugc.aweme.user.repository.b>>) cVar);
            return z.f158842a;
        }

        public final void invoke(a.c<g, List<com.ss.android.ugc.aweme.user.repository.b>, Integer, List<com.ss.android.ugc.aweme.user.repository.b>> cVar) {
            l.c(cVar, "");
            cVar.a(new h.f.a.m<g, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61638);
                }

                {
                    this.this$0 = r2;
                }

                public final Integer invoke(g gVar, List<? extends com.ss.android.ugc.aweme.user.repository.b> list) {
                    return Integer.valueOf(gVar.f97001d);
                }
            });
            cVar.a(new q<g, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61639);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0014 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.ss.android.ugc.aweme.user.repository.b>, java.util.List<? extends com.ss.android.ugc.aweme.user.repository.b>] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r4v3, types: [h.a.z] */
                public final List<com.ss.android.ugc.aweme.user.repository.b> invoke(g gVar, List<? extends com.ss.android.ugc.aweme.user.repository.b> list, List<? extends com.ss.android.ugc.aweme.user.repository.b> list2) {
                    Integer num = gVar.f96999b;
                    if (num != null && num.intValue() != 0) {
                        if (list2 == null) {
                            list2 = h.a.z.INSTANCE;
                        }
                        if (list != 0 || (list = h.a.z.INSTANCE) != 0) {
                            return n.d((Collection) list2, (Iterable) list);
                        }
                        throw new RuntimeException();
                    } else if (list != 0) {
                        return list;
                    } else {
                        return null;
                    }
                }
            });
        }
    }

    public static final class b extends m implements h.f.a.b<a.c<i, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>>, z> {
        static {
            Covode.recordClassIndex(61640);
        }

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.c<i, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>> cVar) {
            invoke((a.c<i, List<com.ss.android.ugc.aweme.user.repository.b>, Integer, List<com.ss.android.ugc.aweme.user.repository.b>>) cVar);
            return z.f158842a;
        }

        public final void invoke(a.c<i, List<com.ss.android.ugc.aweme.user.repository.b>, Integer, List<com.ss.android.ugc.aweme.user.repository.b>> cVar) {
            l.c(cVar, "");
            cVar.a(new h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.user.repository.b>, Integer>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(61641);
                }

                {
                    this.this$0 = r2;
                }

                public final Integer invoke(i iVar, List<? extends com.ss.android.ugc.aweme.user.repository.b> list) {
                    return Integer.valueOf(iVar.f97012d);
                }
            });
            cVar.a(new q<i, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(61642);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0014 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.ss.android.ugc.aweme.user.repository.b>, java.util.List<? extends com.ss.android.ugc.aweme.user.repository.b>] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r4v3, types: [h.a.z] */
                public final List<com.ss.android.ugc.aweme.user.repository.b> invoke(i iVar, List<? extends com.ss.android.ugc.aweme.user.repository.b> list, List<? extends com.ss.android.ugc.aweme.user.repository.b> list2) {
                    Integer num = iVar.f97010b;
                    if (num != null && num.intValue() != 0) {
                        if (list2 == null) {
                            list2 = h.a.z.INSTANCE;
                        }
                        if (list != 0 || (list = h.a.z.INSTANCE) != 0) {
                            return n.d((Collection) list2, (Iterable) list);
                        }
                        throw new RuntimeException();
                    } else if (list != 0) {
                        return list;
                    } else {
                        return null;
                    }
                }
            });
        }
    }

    public static final class c extends m implements h.f.a.b<a.d<? extends Object, User, ? extends Object, List<? extends com.ss.android.ugc.aweme.user.repository.b>>, z> {
        static {
            Covode.recordClassIndex(61643);
        }

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.d<? extends Object, User, ? extends Object, List<? extends com.ss.android.ugc.aweme.user.repository.b>> dVar) {
            invoke((a.d<? extends Object, User, ? extends Object, List<com.ss.android.ugc.aweme.user.repository.b>>) dVar);
            return z.f158842a;
        }

        public final void invoke(a.d<? extends Object, User, ? extends Object, List<com.ss.android.ugc.aweme.user.repository.b>> dVar) {
            l.c(dVar, "");
            dVar.a(AnonymousClass1.INSTANCE);
            dVar.b(new h.f.a.m<User, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61645);
                }

                {
                    this.this$0 = r2;
                }

                public final List<com.ss.android.ugc.aweme.user.repository.b> invoke(User user, List<? extends com.ss.android.ugc.aweme.user.repository.b> list) {
                    l.c(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        User user2 = user;
                        T t2 = t;
                        if (l.a((Object) t2.f142427a.getUid(), (Object) user2.getUid())) {
                            l.d(user2, "");
                            t2.f142427a = user2;
                            t = t2;
                        }
                        arrayList.add(t);
                    }
                    return arrayList;
                }
            });
        }
    }

    public static final class d extends m implements h.f.a.b<a.C0951a<? extends Object, List<? extends com.ss.android.ugc.aweme.user.repository.b>, String, User>, z> {
        static {
            Covode.recordClassIndex(61646);
        }

        public d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.C0951a<? extends Object, List<? extends com.ss.android.ugc.aweme.user.repository.b>, String, User> aVar) {
            invoke((a.C0951a<? extends Object, List<com.ss.android.ugc.aweme.user.repository.b>, String, User>) aVar);
            return z.f158842a;
        }

        public final void invoke(a.C0951a<? extends Object, List<com.ss.android.ugc.aweme.user.repository.b>, String, User> aVar) {
            l.c(aVar, "");
            aVar.a(new h.f.a.b<List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends p<? extends String, ? extends User>>>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(61647);
                }

                {
                    this.this$0 = r2;
                }

                public final List<p<String, User>> invoke(List<? extends com.ss.android.ugc.aweme.user.repository.b> list) {
                    l.c(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(v.a(t.f142427a.getUid(), t.f142427a));
                    }
                    return arrayList;
                }
            });
        }
    }

    public static final class e extends m implements h.f.a.b<a.d<String, String, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>>, z> {
        static {
            Covode.recordClassIndex(61648);
        }

        public e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.d<String, String, Integer, List<? extends com.ss.android.ugc.aweme.user.repository.b>> dVar) {
            invoke((a.d<String, String, Integer, List<com.ss.android.ugc.aweme.user.repository.b>>) dVar);
            return z.f158842a;
        }

        public final void invoke(a.d<String, String, Integer, List<com.ss.android.ugc.aweme.user.repository.b>> dVar) {
            l.c(dVar, "");
            dVar.a(AnonymousClass1.INSTANCE);
            dVar.b(new h.f.a.m<String, List<? extends com.ss.android.ugc.aweme.user.repository.b>, List<? extends com.ss.android.ugc.aweme.user.repository.b>>(this) {
                /* class com.ss.android.ugc.aweme.friends.recommendlist.repository.f.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(61650);
                }

                {
                    this.this$0 = r2;
                }

                public final List<com.ss.android.ugc.aweme.user.repository.b> invoke(String str, List<? extends com.ss.android.ugc.aweme.user.repository.b> list) {
                    l.c(list, "");
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (!l.a((Object) t.f142427a.getUid(), (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g.a
    public final t<com.bytedance.jedi.a.c.f<List<com.ss.android.ugc.aweme.user.repository.b>>> a(int i2) {
        return com.bytedance.jedi.a.c.b.a(this.f96993c).a(Integer.valueOf(i2), com.bytedance.jedi.a.c.b.a(this.f96992b));
    }

    @Override // com.ss.android.ugc.aweme.friends.g.a
    public final ab<String> a(String str, String str2) {
        l.d(str, "");
        ab<String> a2 = ab.a((x) this.f96994d.c(new DislikeRecommendParams(str, str2)));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.friends.g.a
    public final t<RecommendUserDialogList> a(Integer num, Integer num2, String str) {
        Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(RecommendUserDialogApi.class);
        l.b(a2, "");
        return ((RecommendUserDialogApi) a2).fetchRecommendUserDialogList(num, num2, str);
    }

    @Override // com.ss.android.ugc.aweme.friends.g.a
    public final t<RecommendList> b(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        return this.f96996f.c(new i(num, num2, str, i2, num3, num4, str2, num5, str3));
    }

    @Override // com.ss.android.ugc.aweme.friends.g.a
    public final t<RecommendList> a(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        return this.f96992b.c(new g(num, num2, str, i2, num3, num4, str2, num5, str3));
    }
}
