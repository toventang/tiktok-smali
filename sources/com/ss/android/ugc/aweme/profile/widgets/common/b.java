package com.ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM;
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
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b extends h {

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f117697l;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$b  reason: collision with other inner class name */
    public static final class C2990b extends m implements h.f.a.b<e, e> {
        public static final C2990b INSTANCE = new C2990b();

        static {
            Covode.recordClassIndex(76173);
        }

        public C2990b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(76171);
    }

    public final MineProfileInfoVM u() {
        return (MineProfileInfoVM) this.f117697l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.h
    public final String v() {
        return "personal_homepage";
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ i e() {
        return new i();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76172);
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

    public b() {
        h.k.c a2 = ab.a(MineProfileInfoVM.class);
        this.f117697l = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), C2990b.INSTANCE, u.b(this), u.c(this));
    }

    static final class e extends m implements h.f.a.b<i, i> {
        final /* synthetic */ g $action;
        final /* synthetic */ User $user;

        static {
            Covode.recordClassIndex(76177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(User user, g gVar) {
            super(1);
            this.$user = user;
            this.$action = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ i invoke(i iVar) {
            i iVar2 = iVar;
            if (iVar2 != null) {
                return i.a(iVar2, this.$user, new com.bytedance.assem.arch.extensions.a(this.$user), false, null, this.$action, 12);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.h, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        super.b(view);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        j.a.a(this, g2.getCurUser(), null, false, 6);
        AssemViewModel.a(u(), c.f117698a, null, new d(this), null, new c(this), 10);
    }

    static final class c extends m implements h.f.a.b<User, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(User user) {
            User user2 = user;
            final z.e eVar = new z.e();
            eVar.element = (T) g.NORMAL;
            b.a(this.this$0.u(), new h.f.a.b<e, h.z>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.common.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76175);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(e eVar) {
                    e eVar2 = eVar;
                    l.d(eVar2, "");
                    eVar.element = (T) eVar2.f117701b;
                    return h.z.f158842a;
                }
            });
            SpringLayout springLayout = this.this$0.f117703j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (user2 != null) {
                j.a.a(this.this$0, user2, eVar.element, false, 4);
                ((x) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(x.class))).b(user2);
                ((x) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(x.class))).a(user2);
            }
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
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
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.j
    public final void a(int i2, g gVar) {
        l.d(gVar, "");
        MineProfileInfoVM u = u();
        l.d(gVar, "");
        bz unused = i.a(u.aH_(), null, null, new MineProfileInfoVM.a(u, i2, gVar, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.j
    public final void a(User user, g gVar, boolean z) {
        l.d(gVar, "");
        if (user != null) {
            e eVar = new e(user, gVar);
            Class<b> cls = b.class;
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
