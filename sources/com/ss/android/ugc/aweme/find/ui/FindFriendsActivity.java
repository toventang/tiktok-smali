package com.ss.android.ugc.aweme.find.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ai;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.find.b.a;
import com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity;
import com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.hs;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class FindFriendsActivity extends com.bytedance.ies.foundation.activity.a implements com.bytedance.analytics.page.b, ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f96030a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.find.a.a f96031b;

    /* renamed from: c  reason: collision with root package name */
    public final SearchKeywordPresenter f96032c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.find.b.a f96033d;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f96034e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.b.a f96035f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f96036g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f96037h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f96038i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f96039j;

    public static final class a extends h.f.b.m implements h.f.a.m<FindFriendsState, Bundle, FindFriendsState> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(60818);
        }

        public a() {
            super(2);
        }

        public final FindFriendsState invoke(FindFriendsState findFriendsState, Bundle bundle) {
            h.f.b.l.c(findFriendsState, "");
            return findFriendsState;
        }
    }

    static {
        Covode.recordClassIndex(60817);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f96039j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f96039j == null) {
            this.f96039j = new SparseArray();
        }
        View view = (View) this.f96039j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f96039j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "2793";
    }

    public final FindFriendsViewModel e() {
        return (FindFriendsViewModel) this.f96034e.getValue();
    }

    public final WrapLinearLayoutManager f() {
        return (WrapLinearLayoutManager) this.f96036g.getValue();
    }

    public final x.AnonymousClass1 g() {
        return (x.AnonymousClass1) this.f96038i.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f96030a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96040a;

        static {
            Covode.recordClassIndex(60821);
        }

        c(FindFriendsActivity findFriendsActivity) {
            this.f96040a = findFriendsActivity;
        }

        public final void run() {
            this.f96040a.f96031b.f96014b = false;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<WrapLinearLayoutManager> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(FindFriendsActivity findFriendsActivity) {
            super(0);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WrapLinearLayoutManager invoke() {
            return new WrapLinearLayoutManager();
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(FindFriendsActivity findFriendsActivity) {
            super(0);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new FriendsSearchResultView.a(this) {
                /* class com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.x.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x f96056a;

                static {
                    Covode.recordClassIndex(60849);
                }

                @Override // com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView.a
                public final void a() {
                    DmtEditText dmtEditText = (DmtEditText) this.f96056a.this$0._$_findCachedViewById(R.id.ay3);
                    h.f.b.l.b(dmtEditText, "");
                    if (dmtEditText.isCursorVisible()) {
                        DmtEditText dmtEditText2 = (DmtEditText) this.f96056a.this$0._$_findCachedViewById(R.id.ay3);
                        h.f.b.l.b(dmtEditText2, "");
                        dmtEditText2.setCursorVisible(false);
                        com.ss.android.ugc.aweme.common.f.e.a(this.f96056a.this$0, this.f96056a.this$0._$_findCachedViewById(R.id.ay3));
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f96056a = r1;
                }
            };
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return b.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        h.f.b.l.d(this, "");
        return null;
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        withState(e(), new f(this));
    }

    static final class w implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96055a;

        static {
            Covode.recordClassIndex(60847);
        }

        w(FindFriendsActivity findFriendsActivity) {
            this.f96055a = findFriendsActivity;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f96055a.f96031b.ag_();
            this.f96055a.e().a(-2);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.f96035f.a();
        com.ss.android.ugc.aweme.find.b.a aVar = this.f96033d;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onResume", true);
        super.onResume();
        e().a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onResume", false);
    }

    public static final class h implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96044a;

        static {
            Covode.recordClassIndex(60826);
        }

        @Override // com.ss.android.ugc.aweme.find.b.a.b
        public final void b() {
            if (!this.f96044a.isDestroyed()) {
                TuxTextView tuxTextView = (TuxTextView) this.f96044a._$_findCachedViewById(R.id.f6k);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) this.f96044a._$_findCachedViewById(R.id.c7t);
                h.f.b.l.b(friendsSearchResultView, "");
                friendsSearchResultView.setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.find.b.a.b
        public final void a() {
            if (!this.f96044a.isDestroyed()) {
                ((DmtEditText) this.f96044a._$_findCachedViewById(R.id.ay3)).clearFocus();
                TuxTextView tuxTextView = (TuxTextView) this.f96044a._$_findCachedViewById(R.id.f6k);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) this.f96044a._$_findCachedViewById(R.id.c7t);
                h.f.b.l.b(friendsSearchResultView, "");
                friendsSearchResultView.setVisibility(8);
                this.f96044a.a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(FindFriendsActivity findFriendsActivity) {
            this.f96044a = findFriendsActivity;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FindFriendsViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ androidx.appcompat.app.d $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(60819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.d dVar, h.k.c cVar, h.f.a.m mVar, h.k.c cVar2) {
            super(0);
            this.$this_viewModel = dVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                h.f.b.l.a(r1, r3)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_find_ui_FindFriendsActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel> r0 = com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0038
                h.f.b.l.a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$b$1 r0 = new com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$b$1
                r0.<init>(r4)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_find_ui_FindFriendsActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public FindFriendsActivity() {
        h.k.c a2 = h.f.b.ab.a(FindFriendsViewModel.class);
        this.f96034e = new lifecycleAwareLazy(this, new b(this, a2, a.INSTANCE, a2));
        this.f96031b = new com.ss.android.ugc.aweme.find.a.a();
        this.f96035f = new f.a.b.a();
        this.f96032c = new SearchKeywordPresenter(this);
        this.f96036g = h.i.a((h.f.a.a) new u(this));
        this.f96037h = RouteArgExtension.INSTANCE.optionalArg(this, e.f96041a, "previous_page", String.class);
        this.f96038i = h.i.a((h.f.a.a) new x(this));
    }

    static final class e extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f96041a = new e();

        static {
            Covode.recordClassIndex(60823);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    public static final class t implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96051a;

        static {
            Covode.recordClassIndex(60842);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(FindFriendsActivity findFriendsActivity) {
            this.f96051a = findFriendsActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f96051a.finish();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends").f66730a);
            com.ss.android.ugc.aweme.qrcode.k.f119754a.a((Context) this.f96051a, false, false);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96046a;

        static {
            Covode.recordClassIndex(60829);
        }

        j(FindFriendsActivity findFriendsActivity) {
            this.f96046a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96046a.e().c(0);
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96047a;

        static {
            Covode.recordClassIndex(60830);
        }

        k(FindFriendsActivity findFriendsActivity) {
            this.f96047a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96047a.e().c(3);
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96050a;

        static {
            Covode.recordClassIndex(60834);
        }

        o(FindFriendsActivity findFriendsActivity) {
            this.f96050a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96050a.e().b(-1);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(FindFriendsActivity findFriendsActivity) {
            super(1);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.friends.e.a.a("find_friends_page");
            FindFriendsActivity findFriendsActivity = this.this$0;
            Intent a2 = InviteFriendsActivity.a(findFriendsActivity, "find_friends_page");
            com.ss.android.ugc.tiktok.security.a.a.a(a2, findFriendsActivity);
            findFriendsActivity.startActivity(a2);
            return z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f96052a = new v();

        static {
            Covode.recordClassIndex(60844);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f96053a);
            baseActivityViewModel2.config(AnonymousClass2.f96054a);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ List $list;
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FindFriendsActivity findFriendsActivity, List list) {
            super(1);
            this.this$0 = findFriendsActivity;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            h.f.b.l.d(findFriendsState2, "");
            if (this.$list.isEmpty() && findFriendsState2.getChannels().size() == 1) {
                RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(R.id.die);
                h.f.b.l.b(recyclerView, "");
                recyclerView.setVisibility(8);
                ((DmtStatusView) this.this$0._$_findCachedViewById(R.id.e_o)).g();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FindFriendsActivity findFriendsActivity) {
            super(1);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            h.f.b.l.d(findFriendsState2, "");
            if (findFriendsState2.getSearchType().f96147a != 0) {
                this.this$0.e().c(0);
            } else {
                FindFriendsActivity.super.finish();
            }
            return z.f158842a;
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96048a;

        static {
            Covode.recordClassIndex(60831);
        }

        l(FindFriendsActivity findFriendsActivity) {
            this.f96048a = findFriendsActivity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2 = (String) obj;
            SearchKeywordPresenter searchKeywordPresenter = this.f96048a.f96032c;
            if (str2 != null) {
                str = str2.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            searchKeywordPresenter.a(new com.ss.android.ugc.aweme.keyword.b(str, ""));
            if (str2 == null || str2.length() <= 0) {
                this.f96048a.e().c(3);
            } else {
                this.f96048a.e().c(2);
            }
        }
    }

    public final void a(boolean z) {
        int i2;
        boolean z2;
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c7q);
        h.f.b.l.b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AppBarLayout.b bVar = (AppBarLayout.b) layoutParams;
        int n2 = f().n() + 1;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.die);
        h.f.b.l.b(recyclerView, "");
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i2 = adapter.getItemCount();
        } else {
            i2 = 0;
        }
        if (n2 < i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            bVar.f52175a = 0;
            ((AppBarLayout) _$_findCachedViewById(R.id.l_)).setExpanded(true);
        } else {
            bVar.f52175a = 1;
        }
        FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c7q);
        h.f.b.l.b(frameLayout2, "");
        frameLayout2.setLayoutParams(bVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onCreate", true);
        activityConfiguration(v.f96052a);
        super.onCreate(bundle);
        setContentView(R.layout.a20);
        String str = (String) this.f96037h.getValue();
        if (str != null) {
            FindFriendsViewModel e2 = e();
            h.f.b.l.d(str, "");
            e2.f96128c = str;
        }
        f.a.b.b unused = selectSubscribe(e(), a.f96069a, b.f96070a, new ah(), new p(this));
        selectSubscribe(e(), c.f96071a, ai.b(), new q(this));
        selectSubscribe(e(), d.f96072a, ai.b(), new r(this));
        f.a.b.b unused2 = selectSubscribe(e(), e.f96073a, new ah(), new s(this));
        ((com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.em8)).setTitle(R.string.bxu);
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.em8);
        h.f.b.l.b(normalTitleBar, "");
        ((com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.em8)).setTitleColor(androidx.core.content.b.c(normalTitleBar.getContext(), R.color.bx));
        ((NormalTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new t(this));
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            NormalTitleBar normalTitleBar2 = (NormalTitleBar) _$_findCachedViewById(R.id.em8);
            h.f.b.l.b(normalTitleBar2, "");
            ImageView endBtn = normalTitleBar2.getEndBtn();
            h.f.b.l.b(endBtn, "");
            endBtn.setVisibility(8);
        }
        ((FriendsSearchResultView) _$_findCachedViewById(R.id.c7t)).a(this, this.f96032c, g());
        View _$_findCachedViewById = _$_findCachedViewById(R.id.an5);
        h.f.b.l.b(_$_findCachedViewById, "");
        _$_findCachedViewById.setVisibility(8);
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = h();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107229h) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c7q);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.ay3)).setOnTouchListener(new i(this));
        ((TuxTextView) _$_findCachedViewById(R.id.f6k)).setOnClickListener(new j(this));
        ((ImageButton) _$_findCachedViewById(R.id.zl)).setOnClickListener(new k(this));
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.ay3);
        h.f.b.l.b(dmtEditText, "");
        h.f.b.l.d(dmtEditText, "");
        z.e eVar = new z.e();
        eVar.element = null;
        f.a.t a2 = f.a.t.a(new hs.b(eVar));
        h.f.b.l.b(a2, "");
        hs.c cVar = new hs.c(eVar);
        dmtEditText.addTextChangedListener(cVar);
        f.a.t a3 = a2.a(new hs.a(dmtEditText, cVar));
        h.f.b.l.b(a3, "");
        f.a.b.b d2 = a3.d(500, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new l(this));
        h.f.b.l.b(d2, "");
        f.a.j.a.a(d2, this.f96035f);
        ((DmtEditText) _$_findCachedViewById(R.id.ay3)).setOnEditorActionListener(new m(this));
        if (this.f96033d == null) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c7r);
            h.f.b.l.b(frameLayout2, "");
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f6k);
            h.f.b.l.b(tuxTextView, "");
            FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) _$_findCachedViewById(R.id.c7t);
            h.f.b.l.b(friendsSearchResultView, "");
            this.f96033d = new com.ss.android.ugc.aweme.find.b.a(frameLayout2, tuxTextView, friendsSearchResultView, new h(this));
        }
        com.bytedance.track.c.a(this).f44410c.a().a("tracker_key", new com.ss.android.ugc.aweme.search.n.d(null, null, 3, null), com.ss.android.ugc.aweme.search.n.d.class);
        this.f96031b.f96013a = e().f96128c;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.die);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(this.f96031b);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.die);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setLayoutManager(f());
        z.a aVar = new z.a();
        aVar.element = false;
        ((RecyclerView) _$_findCachedViewById(R.id.die)).a(new g(this, aVar));
        com.bytedance.ies.dmt.ui.widget.d a4 = com.ss.android.ugc.aweme.views.h.a(this, new o(this));
        com.bytedance.ies.dmt.ui.widget.e eVar2 = new com.bytedance.ies.dmt.ui.widget.e(this);
        eVar2.setStatus(a4);
        f fVar = new f(this, (byte) 0);
        fVar.setOnClickButtonListener(new n(this));
        ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).setBuilder(DmtStatusView.a.a(this).a().b(fVar).c(eVar2));
        e().b(-1);
        User c2 = in.c();
        h.f.b.l.b(c2, "");
        f.a.b.b g2 = com.ss.android.ugc.aweme.ufr.b.a(this, com.ss.android.ugc.aweme.ufr.a.a.class, c2.getUid(), "find_friends_page", "auto", false, true, null).g();
        h.f.b.l.b(g2, "");
        f.a.j.a.a(g2, this.f96035f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onCreate", false);
    }

    public static final class g extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f96043b;

        static {
            Covode.recordClassIndex(60825);
        }

        g(FindFriendsActivity findFriendsActivity, z.a aVar) {
            this.f96042a = findFriendsActivity;
            this.f96043b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            int i4;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (!this.f96043b.element) {
                this.f96043b.element = true;
                int n = this.f96042a.f().n() + 1;
                RecyclerView recyclerView2 = (RecyclerView) this.f96042a._$_findCachedViewById(R.id.die);
                h.f.b.l.b(recyclerView2, "");
                RecyclerView.a adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    i4 = adapter.getItemCount();
                } else {
                    i4 = 0;
                }
                if (n == i4) {
                    FrameLayout frameLayout = (FrameLayout) this.f96042a._$_findCachedViewById(R.id.c7q);
                    h.f.b.l.b(frameLayout, "");
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                    AppBarLayout.b bVar = (AppBarLayout.b) layoutParams;
                    bVar.f52175a = 0;
                    FrameLayout frameLayout2 = (FrameLayout) this.f96042a._$_findCachedViewById(R.id.c7q);
                    h.f.b.l.b(frameLayout2, "");
                    frameLayout2.setLayoutParams(bVar);
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Integer>, h.z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Integer> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final List<? extends Integer> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            iVar2.withState(this.this$0.e(), new h.f.a.b<FindFriendsState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.q.AnonymousClass1 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(60838);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    h.f.b.l.d(findFriendsState2, "");
                    if (findFriendsState2.getResType().f96145a != -1 && findFriendsState2.getList().isEmpty() && list2.size() == 1) {
                        RecyclerView recyclerView = (RecyclerView) this.this$0.this$0._$_findCachedViewById(R.id.die);
                        h.f.b.l.b(recyclerView, "");
                        recyclerView.setVisibility(8);
                        ((DmtStatusView) this.this$0.this$0._$_findCachedViewById(R.id.e_o)).g();
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.find.viewmodel.e, h.z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.find.viewmodel.e eVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final com.ss.android.ugc.aweme.find.viewmodel.e eVar2 = eVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(eVar2, "");
            iVar2.withState(this.this$0.e(), new h.f.a.b<FindFriendsState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.s.AnonymousClass1 */
                final /* synthetic */ s this$0;

                static {
                    Covode.recordClassIndex(60841);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    h.f.b.l.d(findFriendsState2, "");
                    List<com.ss.android.ugc.aweme.find.viewmodel.a> list = findFriendsState2.getList();
                    List<Integer> channels = findFriendsState2.getChannels();
                    boolean hasMore = findFriendsState2.getHasMore();
                    int i2 = eVar2.f96145a;
                    if (i2 == -1) {
                        FindFriendsActivity findFriendsActivity = this.this$0.this$0;
                        RecyclerView recyclerView = (RecyclerView) findFriendsActivity._$_findCachedViewById(R.id.die);
                        h.f.b.l.b(recyclerView, "");
                        recyclerView.setVisibility(8);
                        findFriendsActivity.e().a(0);
                        ((DmtStatusView) findFriendsActivity._$_findCachedViewById(R.id.e_o)).f();
                    } else if (i2 == 1) {
                        FindFriendsActivity findFriendsActivity2 = this.this$0.this$0;
                        ((DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e_o)).d();
                        DmtStatusView dmtStatusView = (DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e_o);
                        h.f.b.l.b(dmtStatusView, "");
                        dmtStatusView.setVisibility(8);
                        RecyclerView recyclerView2 = (RecyclerView) findFriendsActivity2._$_findCachedViewById(R.id.die);
                        h.f.b.l.b(recyclerView2, "");
                        recyclerView2.setVisibility(0);
                        FrameLayout frameLayout = (FrameLayout) findFriendsActivity2._$_findCachedViewById(R.id.c7q);
                        h.f.b.l.b(frameLayout, "");
                        if (frameLayout.getVisibility() == 8) {
                            FrameLayout frameLayout2 = (FrameLayout) findFriendsActivity2._$_findCachedViewById(R.id.c7q);
                            h.f.b.l.b(frameLayout2, "");
                            frameLayout2.setVisibility(0);
                        }
                        findFriendsActivity2.f96031b.b_(list);
                        if (!hasMore) {
                            findFriendsActivity2.f96031b.a((h.a) null);
                            findFriendsActivity2.f96031b.d(false);
                        } else {
                            findFriendsActivity2.f96031b.ai_();
                            findFriendsActivity2.f96031b.d(true);
                            findFriendsActivity2.f96031b.a((h.a) new w(findFriendsActivity2));
                        }
                        if (list.isEmpty() && !hasMore && channels.size() == 1) {
                            RecyclerView recyclerView3 = (RecyclerView) findFriendsActivity2._$_findCachedViewById(R.id.die);
                            h.f.b.l.b(recyclerView3, "");
                            recyclerView3.setVisibility(8);
                            ((DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e_o)).g();
                        }
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            FrameLayout frameLayout3 = (FrameLayout) this.this$0.this$0._$_findCachedViewById(R.id.c7q);
                            h.f.b.l.b(frameLayout3, "");
                            if (frameLayout3.getVisibility() == 0) {
                                FrameLayout frameLayout4 = (FrameLayout) this.this$0.this$0._$_findCachedViewById(R.id.c7q);
                                h.f.b.l.b(frameLayout4, "");
                                frameLayout4.setVisibility(8);
                            }
                            RecyclerView recyclerView4 = (RecyclerView) this.this$0.this$0._$_findCachedViewById(R.id.die);
                            h.f.b.l.b(recyclerView4, "");
                            recyclerView4.setVisibility(8);
                            ((DmtStatusView) this.this$0.this$0._$_findCachedViewById(R.id.e_o)).h();
                        } else if (i2 != 4) {
                            switch (i2) {
                                case com.bytedance.nita.c.a.f41622a:
                                    FindFriendsActivity findFriendsActivity3 = this.this$0.this$0;
                                    findFriendsActivity3.f96031b.f96014b = true;
                                    findFriendsActivity3.f96031b.b_(list);
                                    ((RecyclerView) findFriendsActivity3._$_findCachedViewById(R.id.die)).post(new c(findFriendsActivity3));
                                    findFriendsActivity3.withState(findFriendsActivity3.e(), new d(findFriendsActivity3, list));
                                    break;
                                case 101:
                                    FindFriendsActivity findFriendsActivity4 = this.this$0.this$0;
                                    findFriendsActivity4.startActivityForResult(InviteFriendsActivity.a(findFriendsActivity4, "find_friends_page"), 101);
                                    break;
                                case 102:
                                    c.b bVar = c.b.f141662a;
                                    User c2 = in.c();
                                    h.f.b.l.b(c2, "");
                                    com.ss.android.ugc.aweme.friends.e.a.d("fb", hl.a(bVar.a(c2.getUid())));
                                    Intent intent = new Intent(this.this$0.this$0, InviteUserListActivity.class);
                                    intent.putExtra(StringSet.type, 3);
                                    FindFriendsActivity findFriendsActivity5 = this.this$0.this$0;
                                    com.ss.android.ugc.tiktok.security.a.a.a(intent, findFriendsActivity5);
                                    findFriendsActivity5.startActivity(intent);
                                    break;
                                case 103:
                                    com.ss.android.ugc.aweme.friends.e.a.d("contact", c.a.f141661a.c());
                                    SmartRouter.buildRoute(this.this$0.this$0, "//friends/contacts").open();
                                    break;
                            }
                        } else {
                            this.this$0.this$0.f96031b.j();
                        }
                    } else if (hasMore) {
                        this.this$0.this$0.f96031b.ai_();
                        this.this$0.this$0.f96031b.b_(list);
                    } else {
                        this.this$0.this$0.f96031b.a((h.a) null);
                        this.this$0.this$0.f96031b.d(false);
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96045a;

        static {
            Covode.recordClassIndex(60827);
        }

        i(FindFriendsActivity findFriendsActivity) {
            this.f96045a = findFriendsActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 1) {
                return false;
            }
            DmtEditText dmtEditText = (DmtEditText) this.f96045a._$_findCachedViewById(R.id.ay3);
            h.f.b.l.b(dmtEditText, "");
            dmtEditText.setCursorVisible(true);
            FindFriendsActivity findFriendsActivity = this.f96045a;
            findFriendsActivity.withState(findFriendsActivity.e(), new h.f.a.b<FindFriendsState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(60828);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
                    h.f.b.l.d(findFriendsState, "");
                    this.this$0.f96045a.e().c(1);
                    return h.z.f158842a;
                }
            });
            return false;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.find.viewmodel.f, h.z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.find.viewmodel.f fVar) {
            com.ss.android.ugc.aweme.find.viewmodel.f fVar2 = fVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(fVar2, "");
            int i2 = fVar2.f96147a;
            if (i2 == 0) {
                FindFriendsActivity findFriendsActivity = this.this$0;
                com.ss.android.ugc.aweme.common.f.e.a(findFriendsActivity, findFriendsActivity._$_findCachedViewById(R.id.ay3));
                this.this$0.f96032c.a(new com.ss.android.ugc.aweme.keyword.b("", ""));
                DmtEditText dmtEditText = (DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3);
                h.f.b.l.b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    text.clear();
                }
                DmtEditText dmtEditText2 = (DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3);
                h.f.b.l.b(dmtEditText2, "");
                dmtEditText2.setCursorVisible(false);
                ((DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3)).clearFocus();
                ImageButton imageButton = (ImageButton) this.this$0._$_findCachedViewById(R.id.zl);
                h.f.b.l.b(imageButton, "");
                imageButton.setVisibility(8);
                ((FriendsSearchResultView) this.this$0._$_findCachedViewById(R.id.c7t)).a();
                com.ss.android.ugc.aweme.find.b.a aVar = this.this$0.f96033d;
                if (aVar != null) {
                    aVar.c();
                    if (aVar.f96019a != 0) {
                        aVar.a().start();
                    }
                }
            } else if (i2 == 1) {
                FindFriendsActivity findFriendsActivity2 = this.this$0;
                ((FriendsSearchResultView) this.this$0._$_findCachedViewById(R.id.c7t)).a(findFriendsActivity2, findFriendsActivity2.f96032c, this.this$0.g());
                com.ss.android.ugc.aweme.find.b.a aVar2 = this.this$0.f96033d;
                if (aVar2 != null) {
                    aVar2.c();
                    if (aVar2.f96019a != 1) {
                        aVar2.b().start();
                    }
                }
                this.this$0.a(false);
            } else if (i2 == 2) {
                ImageButton imageButton2 = (ImageButton) this.this$0._$_findCachedViewById(R.id.zl);
                h.f.b.l.b(imageButton2, "");
                imageButton2.setVisibility(0);
                ((FriendsSearchResultView) this.this$0._$_findCachedViewById(R.id.c7t)).c();
            } else if (i2 == 3) {
                ImageButton imageButton3 = (ImageButton) this.this$0._$_findCachedViewById(R.id.zl);
                h.f.b.l.b(imageButton3, "");
                if (imageButton3.getVisibility() == 0) {
                    this.this$0.f96032c.a(new com.ss.android.ugc.aweme.keyword.b("", ""));
                    DmtEditText dmtEditText3 = (DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3);
                    h.f.b.l.b(dmtEditText3, "");
                    Editable text2 = dmtEditText3.getText();
                    if (text2 != null) {
                        text2.clear();
                    }
                    DmtEditText dmtEditText4 = (DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3);
                    h.f.b.l.b(dmtEditText4, "");
                    dmtEditText4.setCursorVisible(true);
                    ((DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3)).requestFocus();
                    ImageButton imageButton4 = (ImageButton) this.this$0._$_findCachedViewById(R.id.zl);
                    h.f.b.l.b(imageButton4, "");
                    imageButton4.setVisibility(8);
                    com.ss.android.ugc.aweme.common.f.e.a(this.this$0._$_findCachedViewById(R.id.ay3));
                    ((FriendsSearchResultView) this.this$0._$_findCachedViewById(R.id.c7t)).a();
                }
            } else if (i2 == 4) {
                DmtEditText dmtEditText5 = (DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3);
                h.f.b.l.b(dmtEditText5, "");
                dmtEditText5.setCursorVisible(false);
                ((DmtEditText) this.this$0._$_findCachedViewById(R.id.ay3)).clearFocus();
                FindFriendsActivity findFriendsActivity3 = this.this$0;
                com.ss.android.ugc.aweme.common.f.e.a(findFriendsActivity3, findFriendsActivity3._$_findCachedViewById(R.id.ay3));
                ((FriendsSearchResultView) this.this$0._$_findCachedViewById(R.id.c7t)).c();
            }
            return h.z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        e().a();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class m implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsActivity f96049a;

        static {
            Covode.recordClassIndex(60832);
        }

        m(FindFriendsActivity findFriendsActivity) {
            this.f96049a = findFriendsActivity;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 3) {
                return false;
            }
            if (TextUtils.isEmpty(this.f96049a.f96032c.a().f105233a)) {
                return true;
            }
            this.f96049a.e().c(4);
            return true;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, Boolean, Boolean, h.z> {
        final /* synthetic */ FindFriendsActivity this$0;

        static {
            Covode.recordClassIndex(60835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(FindFriendsActivity findFriendsActivity) {
            super(3);
            this.this$0 = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, Boolean bool2) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            bool.booleanValue();
            bool2.booleanValue();
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.e(), new h.f.a.b<FindFriendsState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.find.ui.FindFriendsActivity.p.AnonymousClass1 */
                final /* synthetic */ p this$0;

                static {
                    Covode.recordClassIndex(60836);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    h.f.b.l.d(findFriendsState2, "");
                    if (findFriendsState2.getHasMore() || !findFriendsState2.getCanShowEmtpyTail()) {
                        this.this$0.this$0.f96031b.m();
                    } else {
                        this.this$0.this$0.f96031b.l();
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
