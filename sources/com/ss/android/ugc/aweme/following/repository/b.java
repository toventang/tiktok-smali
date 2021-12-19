package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.i.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import f.a.t;
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
import java.util.Objects;

public final class b extends com.bytedance.jedi.a.j.b {

    /* renamed from: b  reason: collision with root package name */
    private final d f96357b;

    /* renamed from: c  reason: collision with root package name */
    private final g f96358c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.jedi.a.a.c<String, User> f96359d;

    static {
        Covode.recordClassIndex(61000);
    }

    public b() {
        d dVar = new d();
        this.f96357b = dVar;
        g gVar = new g();
        this.f96358c = gVar;
        com.bytedance.jedi.a.a.c<String, User> a2 = UserService.d().a();
        this.f96359d = a2;
        a(dVar, gVar, new a());
        a(gVar, a2, new c());
        a(a2, gVar, new C2321b());
    }

    public static final class a extends m implements h.f.a.b<a.c<a, List<? extends User>, z, List<? extends User>>, z> {
        static {
            Covode.recordClassIndex(61001);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.c<a, List<? extends User>, z, List<? extends User>> cVar) {
            invoke((a.c<a, List<User>, z, List<User>>) cVar);
            return z.f158842a;
        }

        public final void invoke(a.c<a, List<User>, z, List<User>> cVar) {
            l.c(cVar, "");
            cVar.a(new h.f.a.m<a, List<? extends User>, z>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.b.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61002);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.following.repository.a */
                /* JADX WARN: Multi-variable type inference failed */
                public final z invoke(a aVar, List<? extends User> list) {
                    if (l.a(a.class, z.class)) {
                        Objects.requireNonNull(aVar, "null cannot be cast to non-null type kotlin.Unit");
                        return aVar;
                    } else if (l.a(z.class, z.class)) {
                        return z.f158842a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.a(new q<a, List<? extends User>, List<? extends User>, List<? extends User>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.b.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61003);
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

    /* renamed from: com.ss.android.ugc.aweme.following.repository.b$b  reason: collision with other inner class name */
    public static final class C2321b extends m implements h.f.a.b<a.d<? extends Object, User, ? extends Object, List<? extends User>>, z> {
        static {
            Covode.recordClassIndex(61004);
        }

        public C2321b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.d<? extends Object, User, ? extends Object, List<? extends User>> dVar) {
            invoke((a.d<? extends Object, User, ? extends Object, List<User>>) dVar);
            return z.f158842a;
        }

        public final void invoke(a.d<? extends Object, User, ? extends Object, List<User>> dVar) {
            l.c(dVar, "");
            dVar.a(AnonymousClass1.INSTANCE);
            dVar.b(new h.f.a.m<User, List<? extends User>, List<? extends User>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.b.C2321b.AnonymousClass2 */
                final /* synthetic */ C2321b this$0;

                static {
                    Covode.recordClassIndex(61006);
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

    public static final class c extends m implements h.f.a.b<a.C0951a<? extends Object, List<? extends User>, String, User>, z> {
        static {
            Covode.recordClassIndex(61007);
        }

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.C0951a<? extends Object, List<? extends User>, String, User> aVar) {
            invoke((a.C0951a<? extends Object, List<User>, String, User>) aVar);
            return z.f158842a;
        }

        public final void invoke(a.C0951a<? extends Object, List<User>, String, User> aVar) {
            l.c(aVar, "");
            aVar.a(new h.f.a.b<List<? extends User>, List<? extends p<? extends String, ? extends User>>>(this) {
                /* class com.ss.android.ugc.aweme.following.repository.b.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61008);
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

    public final t<com.ss.android.ugc.aweme.following.a.b> a(String str, String str2, long j2, int i2, int i3, int i4, int i5) {
        l.d(str, "");
        l.d(str2, "");
        return this.f96357b.c(new a(str, str2, j2, i2, i3, i4, i5));
    }
}
