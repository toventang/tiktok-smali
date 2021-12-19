package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.i.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import f.a.d.f;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.jedi.a.j.b {

    /* renamed from: b  reason: collision with root package name */
    public final g f96360b;

    /* renamed from: c  reason: collision with root package name */
    public final String f96361c = "FollowingListRepo";

    /* renamed from: d  reason: collision with root package name */
    public f.a.b.b f96362d;

    /* renamed from: e  reason: collision with root package name */
    private final e f96363e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.jedi.a.a.c<String, User> f96364f;

    static {
        Covode.recordClassIndex(61009);
    }

    public c() {
        e eVar = new e();
        this.f96363e = eVar;
        g gVar = new g();
        this.f96360b = gVar;
        com.bytedance.jedi.a.a.c<String, User> a2 = UserService.d().a();
        this.f96364f = a2;
        a(eVar, gVar, new a());
        a(gVar, a2, new C2322c());
        a(a2, gVar, new b());
        this.f96362d = com.bytedance.jedi.a.c.b.a(a2).a(true, new e[0]).a(new f(this) {
            /* class com.ss.android.ugc.aweme.following.repository.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f96365a;

            static {
                Covode.recordClassIndex(61010);
            }

            {
                this.f96365a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Iterable iterable;
                List<T> list = (List) obj;
                HashMap hashMap = new HashMap();
                l.b(list, "");
                for (T t : list) {
                    User user = (User) t.getSecond();
                    if (user != null) {
                        String uid = user.getUid();
                        l.b(uid, "");
                        hashMap.put(uid, user);
                    }
                }
                p pVar = (p) n.h(this.f96365a.f96360b.c());
                if (pVar == null || (iterable = (List) pVar.getSecond()) == null) {
                    iterable = z.INSTANCE;
                }
                for (T t2 : iterable) {
                    User user2 = (User) hashMap.get(t2.getUid());
                    if (user2 != null) {
                        l.b(user2, "");
                        t2.setFollowStatus(user2.getFollowStatus());
                    }
                }
            }
        }, new f(this) {
            /* class com.ss.android.ugc.aweme.following.repository.c.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f96366a;

            static {
                Covode.recordClassIndex(61011);
            }

            {
                this.f96366a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.framework.a.a.b(this.f96366a.f96361c, "subscribe failed ".concat(String.valueOf(obj)));
            }
        });
    }

    public static final class a extends m implements h.f.a.b<a.c<a, List<? extends User>, h.z, List<? extends User>>, h.z> {
        static {
            Covode.recordClassIndex(61012);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ h.z invoke(a.c<a, List<? extends User>, h.z, List<? extends User>> cVar) {
            invoke((a.c<a, List<User>, h.z, List<User>>) cVar);
            return h.z.f158842a;
        }

        public final void invoke(a.c<a, List<User>, h.z, List<User>> cVar) {
            l.c(cVar, "");
            cVar.a(new h.f.a.m<a, List<? extends User>, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.c.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61013);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.following.repository.a */
                /* JADX WARN: Multi-variable type inference failed */
                public final h.z invoke(a aVar, List<? extends User> list) {
                    if (l.a(a.class, h.z.class)) {
                        Objects.requireNonNull(aVar, "null cannot be cast to non-null type kotlin.Unit");
                        return aVar;
                    } else if (l.a(h.z.class, h.z.class)) {
                        return h.z.f158842a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.a(new q<a, List<? extends User>, List<? extends User>, List<? extends User>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.c.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61014);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:5:0x0011 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User>] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r7v3, types: [h.a.z] */
                public final List<User> invoke(a aVar, List<? extends User> list, List<? extends User> list2) {
                    if (aVar.f96350c != 0) {
                        if (list2 == null) {
                            list2 = z.INSTANCE;
                        }
                        if (list != 0 || (list = z.INSTANCE) != 0) {
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

    public static final class b extends m implements h.f.a.b<a.d<? extends Object, User, ? extends Object, List<? extends User>>, h.z> {
        static {
            Covode.recordClassIndex(61015);
        }

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ h.z invoke(a.d<? extends Object, User, ? extends Object, List<? extends User>> dVar) {
            invoke((a.d<? extends Object, User, ? extends Object, List<User>>) dVar);
            return h.z.f158842a;
        }

        public final void invoke(a.d<? extends Object, User, ? extends Object, List<User>> dVar) {
            l.c(dVar, "");
            dVar.a(AnonymousClass1.INSTANCE);
            dVar.b(new h.f.a.m<User, List<? extends User>, List<? extends User>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.c.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(61017);
                }

                {
                    this.this$0 = r2;
                }

                public final List<User> invoke(User user, List<? extends User> list) {
                    l.c(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (User user2 : list) {
                        if (l.a((Object) user2.getUid(), (Object) user.getUid()) && (user instanceof Object) && user != null) {
                            user2 = user;
                        }
                        arrayList.add(user2);
                    }
                    return arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.c$c  reason: collision with other inner class name */
    public static final class C2322c extends m implements h.f.a.b<a.C0951a<? extends Object, List<? extends User>, String, User>, h.z> {
        static {
            Covode.recordClassIndex(61018);
        }

        public C2322c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ h.z invoke(a.C0951a<? extends Object, List<? extends User>, String, User> aVar) {
            invoke((a.C0951a<? extends Object, List<User>, String, User>) aVar);
            return h.z.f158842a;
        }

        public final void invoke(a.C0951a<? extends Object, List<User>, String, User> aVar) {
            l.c(aVar, "");
            aVar.a(new h.f.a.b<List<? extends User>, List<? extends p<? extends String, ? extends User>>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.c.C2322c.AnonymousClass1 */
                final /* synthetic */ C2322c this$0;

                static {
                    Covode.recordClassIndex(61019);
                }

                {
                    this.this$0 = r2;
                }

                public final List<p<String, User>> invoke(List<? extends User> list) {
                    l.c(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(v.a(t.getUid(), t));
                    }
                    return arrayList;
                }
            });
        }
    }

    public final t<com.ss.android.ugc.aweme.following.a.c> a(String str, String str2, long j2, int i2, int i3, int i4, int i5, int i6) {
        l.d(str, "");
        l.d(str2, "");
        return this.f96363e.c(new a(str, str2, j2, 20, i2, i3, i4, i5, i6));
    }
}
