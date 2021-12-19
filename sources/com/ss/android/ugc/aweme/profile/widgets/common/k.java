package com.ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class k extends a {

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f117710l;

    public static final class b extends m implements h.f.a.b<n, n> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76193);
        }

        public b() {
            super(1);
        }

        public final n invoke(n nVar) {
            l.c(nVar, "");
            return nVar;
        }
    }

    static {
        Covode.recordClassIndex(76191);
    }

    public final UserProfileInfoVM u() {
        return (UserProfileInfoVM) this.f117710l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.h
    public final String v() {
        return "others_homepage";
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ i e() {
        return new i();
    }

    static final class f extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(76198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.a, com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        AssemViewModel.a(u(), l.f117711a, null, new d(this), null, new c(this), 10);
    }

    public k() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        f fVar = new f(this);
        h.k.c a2 = ab.a(UserProfileInfoVM.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), fVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), fVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), fVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f117710l = bVar;
    }

    static final class e extends m implements h.f.a.b<i, i> {
        final /* synthetic */ g $action;
        final /* synthetic */ boolean $setSimpleUser;
        final /* synthetic */ User $user;

        static {
            Covode.recordClassIndex(76197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(User user, boolean z, g gVar) {
            super(1);
            this.$user = user;
            this.$setSimpleUser = z;
            this.$action = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ i invoke(i iVar) {
            i iVar2 = iVar;
            if (iVar2 != null) {
                return i.a(iVar2, this.$user, new com.bytedance.assem.arch.extensions.a(this.$user), this.$setSimpleUser, null, this.$action, 8);
            }
            return null;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(76196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            SpringLayout springLayout = this.this$0.f117703j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th2;
                int errorCode = aVar.getErrorCode();
                if (!(TextUtils.isEmpty(aVar.getErrorMsg()) || this.this$0.ar_() == null || errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.ar_()).a(aVar.getErrorMsg()).a();
                }
            }
            com.ss.android.ugc.aweme.profile.ui.v2.ab abVar = (com.ss.android.ugc.aweme.profile.ui.v2.ab) com.bytedance.assem.arch.service.d.c(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
            if (abVar != null) {
                abVar.d();
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<User, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(76194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(User user) {
            User user2 = user;
            final z.e eVar = new z.e();
            eVar.element = (T) g.NORMAL;
            k.a(this.this$0.u(), new h.f.a.b<n, h.z>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.common.k.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76195);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(n nVar) {
                    n nVar2 = nVar;
                    l.d(nVar2, "");
                    eVar.element = (T) nVar2.f117714b;
                    return h.z.f158842a;
                }
            });
            SpringLayout springLayout = this.this$0.f117703j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (user2 != null) {
                com.ss.android.ugc.aweme.profile.ui.v2.ab abVar = (com.ss.android.ugc.aweme.profile.ui.v2.ab) com.bytedance.assem.arch.service.d.c(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (abVar != null) {
                    abVar.c(user2);
                }
                com.ss.android.ugc.aweme.profile.ui.v2.ab abVar2 = (com.ss.android.ugc.aweme.profile.ui.v2.ab) com.bytedance.assem.arch.service.d.c(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (abVar2 != null) {
                    abVar2.b(user2);
                }
                j.a.a(this.this$0, user2, eVar.element, false, 4);
                com.ss.android.ugc.aweme.profile.f.ab abVar3 = com.ss.android.ugc.aweme.profile.f.z.f116476a;
                if (abVar3 != null) {
                    abVar3.d();
                }
                this.this$0.u();
                l.d(user2, "");
                com.bytedance.android.live.base.a.a aVar = new com.bytedance.android.live.base.a.a();
                String uid = user2.getUid();
                l.b(uid, "");
                aVar.f7363b = Long.parseLong(uid);
                aVar.f7362a = user2.roomId;
                aVar.f7364c = !user2.isLive();
                com.ss.android.ugc.d.a.c.a(aVar);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.j
    public final void a(int i2, g gVar) {
        l.d(gVar, "");
        u().a(i2, gVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.j
    public final void a(User user, g gVar, boolean z) {
        l.d(gVar, "");
        if (user != null) {
            e eVar = new e(user, z, gVar);
            Class<k> cls = k.class;
            Class<?>[] interfaces = cls.getInterfaces();
            l.a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        l.a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    com.bytedance.assem.arch.core.e eVar2 = bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar2.a((Class) g2, eVar);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
