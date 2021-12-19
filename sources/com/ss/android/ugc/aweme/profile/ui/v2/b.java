package com.ss.android.ugc.aweme.profile.ui.v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.bytedance.analytics.page.d;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.w;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.feed.ui.bc;
import com.ss.android.ugc.aweme.metrics.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.al;
import com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView;
import com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.ab;
import h.m.p;
import h.u;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class b extends al implements com.bytedance.analytics.page.d, com.bytedance.hox.a.d, s, com.ss.android.ugc.aweme.profile.ui.d.b, x, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    private final f.a.b.a A = new f.a.b.a();
    private bc B;
    private SparseArray C;
    public boolean u;
    private boolean v = true;
    private String w;
    private boolean y;
    private int z;

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f117262a = new e();

        static {
            Covode.recordClassIndex(75713);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75708);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.profile.ui.al
    public final boolean H() {
        return true;
    }

    public final View a(int i2) {
        if (this.C == null) {
            this.C = new SparseArray();
        }
        View view = (View) this.C.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.C.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "8727";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(77, new org.greenrobot.eventbus.g(b.class, "onUpdateUserEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new org.greenrobot.eventbus.g(b.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(78, new org.greenrobot.eventbus.g(b.class, "onUpdateUserSuccessEvent", com.ss.android.ugc.aweme.base.d.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(79, new org.greenrobot.eventbus.g(b.class, "onSaveUserDataEvent", com.ss.android.ugc.aweme.profile.b.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final int k() {
        return R.layout.ao5;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final boolean l() {
        return true;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return d.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return d.a.b(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ w e() {
        return new w();
    }

    private static boolean r() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.metrics.s
    public final String f() {
        if (this.f116874j == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.C;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.ss.android.ugc.aweme.account.b.g().updateLeaveTime(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("personal_homepage");
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    public final void o() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        this.f116876l = g2.getCurUser();
        c(this.f116876l);
        if (com.ss.android.ugc.aweme.account.b.g().shouldRefresh() || this.y) {
            q();
        }
        this.y = false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        f.a.b.b d2 = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), j.f117266a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(k.f117267a);
        h.f.b.l.b(d2, "");
        f.a.j.a.a(d2, this.A);
        if (this.u) {
            n();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f.a.b.b d2 = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(l.f117268a);
        h.f.b.l.b(d2, "");
        f.a.j.a.a(d2, this.A);
        o();
        this.v = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.x
    public final void p() {
        bc bcVar = this.B;
        if (bcVar != null) {
            bcVar.a();
        } else if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (!activity.isFinishing()) {
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                activity2.finish();
            }
        }
    }

    private final void q() {
        if (this.f35364f && !this.v) {
            getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = r();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
            } else {
                j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), null, 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        if (r1.containsKey(r0.getCurUserId()) != false) goto L_0x0090;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.al
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.i():void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.b
    public final void a(bc bcVar) {
        this.B = bcVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.x
    public final void b(User user) {
        this.f116876l = user;
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final k f117267a = new k();

        static {
            Covode.recordClassIndex(75742);
        }

        k() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar.f117256a && com.bytedance.ies.ugc.appcontext.f.f34637l) {
                aVar.f117257b.h();
            }
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f117268a = new l();

        static {
            Covode.recordClassIndex(75743);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            h.f.b.l.d(iTpcConsentService, "");
            iTpcConsentService.i();
        }
    }

    @r
    public final void onSaveUserDataEvent(com.ss.android.ugc.aweme.profile.b.e eVar) {
        this.y = true;
        if (isResumed()) {
            q();
        }
    }

    @r
    public final void onUpdateUserSuccessEvent(com.ss.android.ugc.aweme.base.d.d dVar) {
        h.f.b.l.d(dVar, "");
        com.ss.android.ugc.aweme.account.b.g().queryUser();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$b  reason: collision with other inner class name */
    public static final class C2979b extends h.f.b.m implements h.f.a.b<w, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2979b f117259a = new C2979b();

        static {
            Covode.recordClassIndex(75710);
        }

        C2979b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, false, false, 61);
            }
            return null;
        }
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final c f117260a = new c();

        static {
            Covode.recordClassIndex(75711);
        }

        c() {
        }

        @Override // f.a.w
        public final void subscribe(v<String> vVar) {
            h.f.b.l.d(vVar, "");
            vVar.a(com.ss.android.ugc.aweme.account.b.g().queryUserPermission().toString());
            vVar.a();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<w, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f117264a = new h();

        static {
            Covode.recordClassIndex(75739);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, null, null, new com.bytedance.assem.arch.extensions.a(true), null, false, false, 59);
            }
            return null;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<w, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f117265a = new i();

        static {
            Covode.recordClassIndex(75740);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, null, null, new com.bytedance.assem.arch.extensions.a(false), null, false, false, 59);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<w, w> {
        final /* synthetic */ User $user;

        static {
            Covode.recordClassIndex(75744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(User user) {
            super(1);
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, new com.bytedance.assem.arch.extensions.a(this.$user), null, null, null, false, false, 62);
            }
            return null;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<w, w> {
        final /* synthetic */ boolean $isVisibleToUser;

        static {
            Covode.recordClassIndex(75745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(boolean z) {
            super(1);
            this.$isVisibleToUser = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, null, null, null, null, this.$isVisibleToUser, false, 47);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.x
    public final void a(User user) {
        if (ab_()) {
            ProfileViewModel profileViewModel = this.r;
            if (user == null) {
                h.f.b.l.b();
            }
            profileViewModel.a(user);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final void b(View view) {
        h.f.b.l.d(view, "");
        super.b(view);
        com.bytedance.assem.arch.extensions.d.a(this, new f(this, view));
    }

    @r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/profile/other/?", false)) {
            EventBus.a().d(aVar);
            q();
        }
    }

    @r
    public final void onUpdateUserEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
        h.f.b.l.d(cVar, "");
        this.y = false;
        this.f116876l = cVar.f68103a;
        c(this.f116876l);
    }

    static final class g extends h.f.b.m implements h.f.a.b<w, w> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;

        static {
            Covode.recordClassIndex(75738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2, int i3, Intent intent) {
            super(1);
            this.$requestCode = i2;
            this.$resultCode = i3;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ w invoke(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                return w.a(wVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(new u(Integer.valueOf(this.$requestCode), Integer.valueOf(this.$resultCode), this.$data)), false, false, 55);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        this.f116869a = g2.getCurUserId();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        this.f116870b = g3.getCurSecUserId();
        EventBus.a(EventBus.a(), this);
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f117261a = new d();

        static {
            Covode.recordClassIndex(75712);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            h.f.b.l.b(str, "");
            h.f.b.l.d(str, "");
            if (p.a((CharSequence) str, (CharSequence) "permissions", false) && p.a((CharSequence) str, (CharSequence) "age_gate_region", false)) {
                HashMap hashMap = new HashMap();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                hashMap.put(g2.getCurUserId(), str);
                if (com.ss.android.ugc.aweme.account.login.w.f65123a.contains("user_permission_info")) {
                    w.a.a(new JSONObject(com.ss.android.ugc.aweme.account.login.w.f65123a.getString("user_permission_info", "")), hashMap);
                }
                com.ss.android.ugc.aweme.account.login.w.f65123a.storeString("user_permission_info", new JSONObject(hashMap).toString());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.b
    public final void a(String str) {
        com.ss.android.ugc.aweme.profile.widgets.b.h hVar = (com.ss.android.ugc.aweme.profile.widgets.b.h) com.bytedance.assem.arch.service.d.d(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.h.class));
        if (hVar != null) {
            hVar.a(str);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(75714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, View view) {
            super(1);
            this.this$0 = bVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75715);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    String str;
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    h.f.b.l.d(iVar2, "");
                    String str2 = this.this$0.this$0.f116873e;
                    Bundle arguments = this.this$0.this$0.getArguments();
                    if (arguments != null) {
                        str = arguments.getString("enter_from");
                    } else {
                        str = null;
                    }
                    iVar2.a(new com.ss.android.ugc.aweme.profile.widgets.h.a.a(str2, str, true, this.this$0.this$0.f116869a, this.this$0.this$0.f116870b));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass12 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75718);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.common.b.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.common.b();
                    qVar2.f25599e = (RelativeLayout) this.this$0.this$0.a(R.id.dba);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass17 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75723);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.navbar.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.navbar.a();
                    qVar2.f25599e = (TuxNavBar) this.this$0.this$0.a(R.id.csl);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass18 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75724);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.g.c.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.g.c.a();
                    qVar2.f25599e = (ViewStub) this.this$0.this$0.getView().findViewById(R.id.dbk);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass19 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75725);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.g.a.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.g.a.a();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass20 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75727);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.g.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.g.a();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass21 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75728);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.l.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.l.a();
                    qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.fdt);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass22 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75729);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.userId.d.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.userId.d();
                    qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.fda);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass23 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75730);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.userId.b.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.userId.b();
                    qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.fd5);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f117263a);
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass3 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75731);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.c.a.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.c.a.a();
                    qVar2.f25599e = (TuxButton) this.this$0.this$0.a(R.id.tb);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass4 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75732);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.i.a.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.i.a.a();
                    qVar2.f25599e = (TuxButton) this.this$0.this$0.a(R.id.eij);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass5 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75733);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.e.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.e.a();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass6 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75734);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.a.c.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.a.c();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass7 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75735);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.f.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.f.a();
                    qVar2.f25599e = (RelativeLayout) this.this$0.this$0.a(R.id.cs3);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass8 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75736);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.b.d.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.b.d();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            if (com.ss.android.ugc.aweme.profile.experiment.g.a()) {
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass9 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75737);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.b.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.b();
                        AdvancedFeaturesHorizontalScrollView advancedFeaturesHorizontalScrollView = (AdvancedFeaturesHorizontalScrollView) this.this$0.this$0.a(R.id.i2);
                        h.f.b.l.b(advancedFeaturesHorizontalScrollView, "");
                        advancedFeaturesHorizontalScrollView.setVisibility(0);
                        qVar2.f25599e = (AdvancedFeaturesHorizontalScrollView) this.this$0.this$0.a(R.id.i2);
                        return z.f158842a;
                    }
                });
            } else {
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass10 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75716);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.j.a.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.j.a();
                        qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.f57);
                        return z.f158842a;
                    }
                });
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass11 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75717);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(TranslationsAssem.class));
                        qVar2.f25596b = new TranslationsAssem();
                        qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.f9y);
                        return z.f158842a;
                    }
                });
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass13 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75719);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.m.a.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.m.a();
                        qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.f9j);
                        return z.f158842a;
                    }
                });
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass14 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75720);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.k.a.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.k.a();
                        qVar2.f25599e = (TuxTextView) this.this$0.this$0.a(R.id.e3m);
                        return z.f158842a;
                    }
                });
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass15 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75721);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.d.a.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.d.a();
                        qVar2.f25599e = (DonationLinkView) this.this$0.this$0.a(R.id.ao6);
                        return z.f158842a;
                    }
                });
                assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.b.f.AnonymousClass16 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(75722);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        h.f.b.l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.d.d.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.d.d();
                        qVar2.f25599e = (ProfileLiveEventView) this.this$0.this$0.a(R.id.cd0);
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r11.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(com.ss.android.ugc.aweme.profile.model.User r15) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.c(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        if (r10.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        r10 = r4.element;
        r9 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        if (r9 == java.lang.Object.class) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0138, code lost:
        r13 = r9.getInterfaces();
        h.f.b.l.a((java.lang.Object) r13, "");
        r12 = new java.util.ArrayList();
        r3 = r13.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        if (r2 >= r3) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        r1 = r13[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        r12.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0158, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0162, code lost:
        if (r1.hasNext() == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0164, code lost:
        r0 = (java.lang.Class) r1.next();
        h.f.b.l.a((java.lang.Object) r0, "");
        r10.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
        r9 = r9.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0181, code lost:
        if (r9 != null) goto L_0x0134;
     */
    @Override // com.bytedance.hox.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.a(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r11.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0129;
     */
    @Override // com.bytedance.hox.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.b(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x00e7;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUserVisibleHint(boolean r16) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.setUserVisibleHint(boolean):void");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f117256a;

        /* renamed from: b  reason: collision with root package name */
        public final ITpcConsentService f117257b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<Activity> f117258c;

        static {
            Covode.recordClassIndex(75709);
        }

        public a(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            h.f.b.l.d(iTpcConsentService, "");
            h.f.b.l.d(weakReference, "");
            this.f117257b = iTpcConsentService;
            this.f117258c = weakReference;
            this.f117256a = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
        }
    }

    static final class j<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final j f117266a = new j();

        static {
            Covode.recordClassIndex(75741);
        }

        j() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            h.f.b.l.d(iTpcConsentService, "");
            h.f.b.l.d(obj2, "");
            return new a(iTpcConsentService, new WeakReference(obj2));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        androidx.fragment.app.e activity;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.widget.c g2 = g();
        if (g2 != null) {
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup == null) {
                h.f.b.l.b();
            }
            g2.a(new MyProfileGuideWidgetV2(viewGroup));
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && (activity = getActivity()) != null) {
            h.f.b.l.b(activity, "");
            if (!activity.isFinishing()) {
                com.ss.android.ugc.aweme.compliance.api.a.r().a(activity, "deeplink");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.f.b.l.d(strArr, "");
        h.f.b.l.d(iArr, "");
        com.ss.android.ugc.aweme.utils.permission.a.a(getActivity(), i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0110;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.b.onActivityResult(int, int, android.content.Intent):void");
    }
}
