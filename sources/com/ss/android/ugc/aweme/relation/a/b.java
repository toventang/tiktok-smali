package com.ss.android.ugc.aweme.relation.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.zhiliaoapp.musically.R;
import h.z;

public final class b extends com.ss.android.ugc.aweme.base.arch.b {

    /* renamed from: d  reason: collision with root package name */
    public static final d f120307d = new d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f120308b;

    /* renamed from: c  reason: collision with root package name */
    public a f120309c;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f120310e;

    /* renamed from: j  reason: collision with root package name */
    private boolean f120311j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f120312k = h.i.a((h.f.a.a) new r(this));

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f120313l;

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$b  reason: collision with other inner class name */
    public static final class C3106b extends h.f.b.m implements h.f.a.m<SocialRecRequestState, Bundle, SocialRecRequestState> {
        public static final C3106b INSTANCE = new C3106b();

        static {
            Covode.recordClassIndex(78250);
        }

        public C3106b() {
            super(2);
        }

        public final SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState, Bundle bundle) {
            h.f.b.l.c(socialRecRequestState, "");
            return socialRecRequestState;
        }
    }

    static {
        Covode.recordClassIndex(78248);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.f120313l == null) {
            this.f120313l = new SparseArray();
        }
        View view = (View) this.f120313l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f120313l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.f120313l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final SocialRecRequestViewModel b() {
        return (SocialRecRequestViewModel) this.f120310e.getValue();
    }

    public final SocialRecFlowModel c() {
        return (SocialRecFlowModel) this.f120312k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(78253);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public static b a(a aVar) {
            h.f.b.l.d(aVar, "");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("consentConfig", aVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f120320b;

        static {
            Covode.recordClassIndex(78267);
        }

        o(b bVar, long j2) {
            this.f120319a = bVar;
            this.f120320b = j2;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                SocialRecFlowModel c2 = this.f120319a.c();
                if (c2 != null) {
                    c2.f120504c = true;
                }
                h.f.b.l.b(view, "");
                view.getContext();
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107229h = a();
                }
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                    new com.bytedance.tux.g.b(view).e(R.string.de8).b();
                    return;
                }
                TuxButton tuxButton = (TuxButton) this.f120319a.a(R.id.acy);
                if (tuxButton == null || !tuxButton.f44736a) {
                    TuxButton tuxButton2 = (TuxButton) this.f120319a.a(R.id.acy);
                    if (tuxButton2 != null) {
                        tuxButton2.setLoading(true);
                    }
                    com.ss.android.ugc.aweme.relation.c.d.a(b.a(this.f120319a).getSocialRecType(), b.a(this.f120319a).getStep(), "sync", System.currentTimeMillis() - this.f120320b);
                    b bVar = this.f120319a;
                    bVar.a(b.a(bVar).getSocialRecType(), b.a(this.f120319a).getStep());
                }
            }
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<SocialRecFlowModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialRecFlowModel invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                return ae.a(activity, (ad.b) null).a(SocialRecFlowModel.class);
            }
            return null;
        }
    }

    public final void e() {
        androidx.lifecycle.r<Bundle> rVar;
        SocialRecFlowModel c2 = c();
        if (c2 != null && (rVar = c2.f120503b) != null) {
            rVar.postValue(new Bundle());
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<SocialRecRequestViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_relation_consent_SocialConsentFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel> r0 = com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.relation.a.b$c$1 r0 = new com.ss.android.ugc.aweme.relation.a.b$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.b.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_relation_consent_SocialConsentFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public b() {
        h.k.c a2 = h.f.b.ab.a(SocialRecRequestViewModel.class);
        a aVar = new a(a2);
        this.f120310e = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, C3106b.INSTANCE));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        a aVar = this.f120309c;
        if (aVar == null) {
            h.f.b.l.a("consentConfig");
        }
        if (aVar.getSocialRecType() == 3) {
            a aVar2 = this.f120309c;
            if (aVar2 == null) {
                h.f.b.l.a("consentConfig");
            }
            if (aVar2.getStep() == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                str = "facebook";
            } else {
                str = "contact";
            }
            com.ss.android.ugc.aweme.relation.c.d.a(str, "background");
        }
    }

    public static final /* synthetic */ a a(b bVar) {
        a aVar = bVar.f120309c;
        if (aVar == null) {
            h.f.b.l.a("consentConfig");
        }
        return aVar;
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f120318b;

        static {
            Covode.recordClassIndex(78266);
        }

        n(b bVar, long j2) {
            this.f120317a = bVar;
            this.f120318b = j2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f120317a.a(true);
                com.ss.android.ugc.aweme.relation.c.d.a(b.a(this.f120317a).getSocialRecType(), b.a(this.f120317a).getStep(), "skip", System.currentTimeMillis() - this.f120318b);
            }
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120321a;

        static {
            Covode.recordClassIndex(78268);
        }

        p(b bVar) {
            this.f120321a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f120321a.e();
            if (b.a(this.f120321a).getStep() == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                str = "facebook";
            } else {
                str = "contact";
            }
            com.ss.android.ugc.aweme.relation.c.d.a(str, "click");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $skipStep$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar, int i2) {
            super(1);
            this.this$0 = bVar;
            this.$skipStep$inlined = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            int i2;
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            if (this.$skipStep$inlined == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                i2 = R.string.g17;
            } else {
                i2 = R.string.g18;
            }
            bVar2.a(i2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.relation.a.b.q.AnonymousClass1 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(78270);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    TuxButton tuxButton;
                    h.f.b.l.d(aVar, "");
                    TuxButton tuxButton2 = (TuxButton) this.this$0.this$0.a(R.id.acx);
                    if ((tuxButton2 == null || !tuxButton2.f44736a) && (tuxButton = (TuxButton) this.this$0.this$0.a(R.id.acx)) != null) {
                        tuxButton.setLoading(true);
                    }
                    this.this$0.this$0.a(b.a(this.this$0.this$0).getSocialRecType(), b.a(this.this$0.this$0).getStep());
                    com.ss.android.ugc.aweme.relation.c.d.a(this.this$0.$skipStep$inlined, "sync");
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.g19, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.relation.a.b.q.AnonymousClass2 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(78271);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b(this.this$0.$skipStep$inlined);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r6) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.b.b(int):void");
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        String str;
        a aVar = this.f120309c;
        if (aVar == null) {
            h.f.b.l.a("consentConfig");
        }
        if (aVar.getSocialRecType() == 3) {
            if (z) {
                a aVar2 = this.f120309c;
                if (aVar2 == null) {
                    h.f.b.l.a("consentConfig");
                }
                if (aVar2.getStep() == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                    SocialRecFlowModel c2 = c();
                    if (c2 != null) {
                        c2.b("2");
                    }
                } else {
                    SocialRecFlowModel c3 = c();
                    if (c3 == null || (str = c3.f120507f) == null) {
                        str = "";
                    }
                    SocialRecFlowModel c4 = c();
                    if (c4 != null) {
                        if (TextUtils.isEmpty(str)) {
                            str = "1";
                        } else if (TextUtils.equals("2", str)) {
                            str = "1,2";
                        }
                        c4.b(str);
                    }
                }
            }
            a aVar3 = this.f120309c;
            if (aVar3 == null) {
                h.f.b.l.a("consentConfig");
            }
            int step = aVar3.getStep();
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                SocialRecFlowModel c5 = c();
                if (c5 == null || c5.f120504c) {
                    b(step);
                    return;
                }
                SocialRecFlowModel c6 = c();
                if (c6 != null) {
                    c6.f120504c = true;
                }
                h.f.b.l.b(activity, "");
                com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
                if (step == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                    i2 = R.string.bt4;
                } else {
                    i2 = R.string.ato;
                }
                com.bytedance.tux.dialog.internal.b a2 = bVar.a(i2);
                if (step == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
                    i3 = R.string.bt3;
                } else {
                    i3 = R.string.atn;
                }
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a2.b(i3), new q(this, step)).a(false)).a().b().show();
                return;
            }
            return;
        }
        e();
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ String $toast;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, String str) {
            super(2);
            this.this$0 = bVar;
            this.$toast = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                new com.bytedance.tux.g.b(this.this$0).a(this.$toast).b();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a(false);
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            SocialRecFlowModel c2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue && (c2 = this.this$0.c()) != null) {
                c2.f120505d = true;
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.relation.a.b.l.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ l f120316a;

                    static {
                        Covode.recordClassIndex(78264);
                    }

                    {
                        this.f120316a = r1;
                    }

                    public final void run() {
                        this.f120316a.this$0.e();
                    }
                }, 1000);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                if (!this.this$0.b().f120510b) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.bgb).b();
                }
                this.this$0.b().f120510b = false;
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.relation.a.b.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f120314a;

                    static {
                        Covode.recordClassIndex(78255);
                    }

                    {
                        this.f120314a = r1;
                    }

                    public final void run() {
                        this.f120314a.this$0.a(false);
                    }
                }, 1000);
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, FriendList<? extends User>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, FriendList<? extends User> friendList) {
            androidx.lifecycle.r<com.ss.android.ugc.aweme.relation.viewmodel.e> rVar;
            FriendList<? extends User> friendList2 = friendList;
            h.f.b.l.d(iVar, "");
            if (friendList2 != null) {
                b bVar = this.this$0;
                com.ss.android.ugc.aweme.relation.viewmodel.e eVar = new com.ss.android.ugc.aweme.relation.viewmodel.e(com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue(), friendList2, null, null, 12);
                SocialRecFlowModel c2 = bVar.c();
                if (!(c2 == null || (rVar = c2.f120502a) == null)) {
                    rVar.postValue(eVar);
                }
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ int $socialRecType;
        final /* synthetic */ String $toast;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, int i2, String str) {
            super(2);
            this.this$0 = bVar;
            this.$socialRecType = i2;
            this.$toast = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r8, java.lang.Boolean r9) {
            /*
                r7 = this;
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r2 = r9.booleanValue()
                java.lang.String r6 = ""
                h.f.b.l.d(r8, r6)
                int r1 = r7.$socialRecType
                r0 = 3
                if (r1 != r0) goto L_0x003e
                java.lang.String r5 = "version_update"
            L_0x0012:
                java.lang.String r4 = "auto"
            L_0x0014:
                if (r2 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.relation.a.b r3 = r7.this$0
                android.content.Context r2 = r3.requireContext()
                h.f.b.l.b(r2, r6)
                java.lang.Class<com.ss.android.ugc.aweme.ufr.contact.ContactUFR> r1 = com.ss.android.ugc.aweme.ufr.contact.ContactUFR.class
                com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.utils.in.c()
                h.f.b.l.b(r0, r6)
                java.lang.String r0 = r0.getUid()
                f.a.t r1 = com.ss.android.ugc.aweme.ufr.b.a(r2, r1, r0, r5, r4)
                com.ss.android.ugc.aweme.relation.a.b$g$1 r0 = new com.ss.android.ugc.aweme.relation.a.b$g$1
                r0.<init>(r7)
                f.a.b.b r0 = r1.d(r0)
                r3.f120308b = r0
            L_0x003b:
                h.z r0 = h.z.f158842a
                return r0
            L_0x003e:
                java.lang.String r5 = "login_onboarding"
                if (r1 != r0) goto L_0x0043
                goto L_0x0012
            L_0x0043:
                java.lang.String r4 = "login"
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.b.g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            String str;
            int intValue = num.intValue();
            String str2 = "";
            h.f.b.l.d(iVar, str2);
            if (intValue > 0) {
                SocialRecFlowModel c2 = this.this$0.c();
                if (!(c2 == null || (str = c2.f120506e) == null)) {
                    str2 = str;
                }
                if (intValue == 1) {
                    SocialRecFlowModel c3 = this.this$0.c();
                    if (c3 != null) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = String.valueOf(intValue);
                        } else if (TextUtils.equals("2", str2)) {
                            str2 = "1,2";
                        }
                        c3.a(str2);
                    }
                } else {
                    SocialRecFlowModel c4 = this.this$0.c();
                    if (c4 != null) {
                        c4.a("2");
                    }
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, int i3) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (TextUtils.isEmpty(curUserId)) {
            e();
            return;
        }
        SocialRecRequestViewModel b2 = b();
        h.f.b.l.b(curUserId, "");
        b2.a(curUserId, i2, i3, "process");
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            if (r3 != false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
            if (r4 == 1) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            if (r2 == false) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
            r4 = com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_RECOMMEND.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
            if (r4 != 2) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
            if (r3 == false) goto L_0x0073;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r7, java.lang.Integer r8) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.b.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02dd, code lost:
        if (r8 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) goto L_0x02df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0301  */
    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 779
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a28, viewGroup, false);
    }
}
