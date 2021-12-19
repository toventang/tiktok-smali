package com.ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.f.z;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.c.b.a.k;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class UserProfileInfoVM extends AssemViewModel<n> {

    /* renamed from: j  reason: collision with root package name */
    public String f117690j;

    /* renamed from: k  reason: collision with root package name */
    public String f117691k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bytedance.assem.arch.a.a<q> f117692l;

    /* renamed from: m  reason: collision with root package name */
    private final i f117693m = new i(true, new a(this, null));

    static {
        Covode.recordClassIndex(76164);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.profile.widgets.h.a.b g() {
        return (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.f117693m.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ n f() {
        return new n();
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM.a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserResponse f117694a;

        static {
            Covode.recordClassIndex(76168);
        }

        c(UserResponse userResponse) {
            this.f117694a = userResponse;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            GsonProvider c2 = GsonHolder.c();
            l.b(c2, "");
            com.ss.android.ugc.aweme.framework.a.a.a(4, "aweme/v1/user", c2.b().b(this.f117694a));
            return null;
        }
    }

    public final Aweme h() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117249g;
        }
        return null;
    }

    public final User i() {
        i iVar = (i) com.bytedance.assem.arch.service.d.a(this, ab.a(j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        String str;
        ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            str = acVar.f117246d;
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "prop_page") || h() == null) {
            return str;
        }
        return "prop_page_detail_aweme";
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<n, n> {
        final /* synthetic */ g $action;
        final /* synthetic */ User $user;

        static {
            Covode.recordClassIndex(76169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(User user, g gVar) {
            super(1);
            this.$user = user;
            this.$action = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ n invoke(n nVar) {
            l.d(nVar, "");
            return n.a(new o(this.$user), this.$action);
        }
    }

    public UserProfileInfoVM(com.bytedance.assem.arch.a.a<q> aVar) {
        l.d(aVar, "");
        this.f117692l = aVar;
    }

    public final void a(Exception exc) {
        l.d(exc, "");
        com.ss.android.ugc.aweme.profile.f.ab abVar = z.f116476a;
        if (abVar != null) {
            abVar.c();
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", this.f117690j).a("enter_from", j()).a("is_success", 0).a("fail_info", exc.getMessage());
        l.b(a2, "");
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            a2.a("response", ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse());
        }
        Map<String, String> map = a2.f66730a;
        r.a("profile_request_response", map);
        com.ss.android.ugc.aweme.framework.a.a.a(4, "aweme/v1/user", map.toString());
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ g $action;
        final /* synthetic */ int $from;
        int label;
        final /* synthetic */ UserProfileInfoVM this$0;

        static {
            Covode.recordClassIndex(76166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserProfileInfoVM userProfileInfoVM, int i2, g gVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = userProfileInfoVM;
            this.$from = i2;
            this.$action = gVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$from, this.$action, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x013a A[Catch:{ Exception -> 0x0335 }, RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
            // Method dump skipped, instructions count: 840
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(int i2, g gVar) {
        l.d(gVar, "");
        bz unused = kotlinx.coroutines.i.a(aH_(), null, null, new b(this, i2, gVar, null), 3);
    }
}
