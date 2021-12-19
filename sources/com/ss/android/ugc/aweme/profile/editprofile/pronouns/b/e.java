package com.ss.android.ugc.aweme.profile.editprofile.pronouns.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends com.bytedance.assem.arch.d.a implements i {

    /* renamed from: j  reason: collision with root package name */
    private final h.h f116189j = h.i.a((h.f.a.a) new h(this));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f116190k = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f116191l;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.a, com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(74959);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.a invoke(com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(74957);
    }

    private final TuxNavBar x() {
        return (TuxNavBar) this.f116189j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ProfileEditPronounsNavBarViewModel u() {
        return (ProfileEditPronounsNavBarViewModel) this.f116191l.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ j e() {
        return new j();
    }

    static final class h extends m implements h.f.a.a<TuxNavBar> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(74965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxNavBar invoke() {
            return this.this$0.s().findViewById(R.id.dd0);
        }
    }

    static final class k extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(74968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(0);
            this.this$0 = eVar;
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

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.i
    public final void v() {
        x().a("save", d.f116192a);
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.i
    public final void w() {
        x().a("save", C2966e.f116193a);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(74958);
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

    public static final class c extends m implements h.f.a.a<d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(74960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d> r1 = com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.e.c.invoke():java.lang.Object");
        }
    }

    public static final class j implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f116196a;

        static {
            Covode.recordClassIndex(74967);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            ((a) com.bytedance.assem.arch.service.d.a(this.f116196a, ab.a(a.class))).a(((n) com.bytedance.assem.arch.service.d.a(this.f116196a, ab.a(n.class))).A());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(e eVar) {
            this.f116196a = eVar;
        }
    }

    public static final class i implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f116195a;

        static {
            Covode.recordClassIndex(74966);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            e eVar = this.f116195a;
            ((a) com.bytedance.assem.arch.service.d.a(eVar, ab.a(a.class))).a();
            ProfileEditPronounsNavBarViewModel u = eVar.u();
            String B = ((n) com.bytedance.assem.arch.service.d.a(eVar, ab.a(n.class))).B();
            l.d(B, "");
            f.a.b.b a2 = ((com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.a) ((com.bytedance.assem.arch.a.a) u.f116226k.getValue()).a()).a(B).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ProfileEditPronounsNavBarViewModel.b(u), new ProfileEditPronounsNavBarViewModel.c(u));
            l.b(a2, "");
            f.a.j.a.a(a2, u.f116225j);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(e eVar) {
            this.f116195a = eVar;
        }
    }

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        k kVar = new k(this);
        h.k.c a2 = ab.a(ProfileEditPronounsNavBarViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), kVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), kVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), kVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f116191l = bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116192a = new d();

        static {
            Covode.recordClassIndex(74961);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            ((com.bytedance.tux.navigation.a.e) cVar2).f45203c = false;
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.e$e  reason: collision with other inner class name */
    static final class C2966e extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2966e f116193a = new C2966e();

        static {
            Covode.recordClassIndex(74962);
        }

        C2966e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            ((com.bytedance.tux.navigation.a.e) cVar2).f45203c = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        String str2;
        String str3;
        ProfileEditPronounsNavBarViewModel u;
        Resources resources;
        Resources resources2;
        l.d(view, "");
        com.bytedance.tux.navigation.a.e a2 = new com.bytedance.tux.navigation.a.e().a((Object) "cancel");
        Context ar_ = ar_();
        if (ar_ == null || (resources2 = ar_.getResources()) == null || (str = resources2.getString(R.string.a7u)) == null) {
            str = "";
        }
        l.b(str, "");
        com.bytedance.tux.navigation.a.e a3 = a2.a(str).a(com.bytedance.tux.navigation.a.f.SECONDARY).a((com.bytedance.tux.navigation.a.d) new j(this));
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        d dVar = (d) this.f116190k.getValue();
        if (dVar == null || (str2 = dVar.f116187a) == null) {
            str2 = "";
        }
        com.bytedance.tux.navigation.a.g a4 = gVar.a(str2).a((Object) "title");
        com.bytedance.tux.navigation.a.e a5 = new com.bytedance.tux.navigation.a.e().a((Object) "save");
        Context ar_2 = ar_();
        if (ar_2 == null || (resources = ar_2.getResources()) == null || (str3 = resources.getString(R.string.bkt)) == null) {
            str3 = "";
        }
        l.b(str3, "");
        com.bytedance.tux.navigation.a.e a6 = a5.a(str3).a((com.bytedance.tux.navigation.a.d) new i(this));
        TuxNavBar x = x();
        TuxNavBar.a b2 = new TuxNavBar.a().a(a3).a(a4).b(a6);
        b2.f45188d = true;
        x.setNavActions(b2);
        v();
        a(u, f.f116197a, g.f116198a, com.bytedance.assem.arch.viewModel.l.a(u().f25686c), null, new f(this));
        f.a.a(this, u(), h.f116199a, (com.bytedance.assem.arch.viewModel.k) null, g.f116194a, 6);
    }

    static final class g extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f116194a = new g();

        static {
            Covode.recordClassIndex(74964);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            p pVar2 = pVar;
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            l.d(pVar2, "");
            if (aVar2 != null) {
                new com.bytedance.tux.g.b(pVar2.s()).e(aVar2.f25631b.intValue()).b();
                ((a) com.bytedance.assem.arch.service.d.a(pVar2, ab.a(a.class))).b();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements q<p, String, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(74963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(3);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(p pVar, String str, Boolean bool) {
            String str2 = str;
            boolean booleanValue = bool.booleanValue();
            l.d(pVar, "");
            l.d(str2, "");
            if (booleanValue) {
                ((a) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(a.class))).a(str2);
                l.d("save_profile", "");
                l.d("click_save", "");
                l.d("pronoun", "");
                l.d(str2, "");
                r.a("save_profile", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "pronoun").a("enter_method", "click_save").a("pronoun", str2).f66730a);
            }
            return z.f158842a;
        }
    }
}
