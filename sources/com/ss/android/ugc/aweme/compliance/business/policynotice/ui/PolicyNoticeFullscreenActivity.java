package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class PolicyNoticeFullscreenActivity extends com.bytedance.ies.foundation.activity.a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.compliance.api.model.i f77098a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f77099b;

    static {
        Covode.recordClassIndex(47642);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77099b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77099b == null) {
            this.f77099b = new SparseArray();
        }
        View view = (View) this.f77099b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77099b.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(PolicyNoticeFullscreenActivity.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ PolicyNoticeFullscreenActivity this$0;

        static {
            Covode.recordClassIndex(47644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            super(0);
            this.this$0 = policyNoticeFullscreenActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        Boolean bool;
        com.ss.android.ugc.aweme.compliance.api.model.i iVar = this.f77098a;
        if (iVar != null) {
            bool = iVar.isSubPopUp();
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            super.onBackPressed();
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

    public static final class c implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeFullscreenActivity f77100a;

        static {
            Covode.recordClassIndex(47645);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            this.f77100a = policyNoticeFullscreenActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f77100a.finish();
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z> {
        final /* synthetic */ PolicyNoticeFullscreenActivity this$0;

        static {
            Covode.recordClassIndex(47643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            super(1);
            this.this$0 = policyNoticeFullscreenActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
            l.d(jVar2, "");
            this.this$0.a(jVar2);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77101a = new d();

        static {
            Covode.recordClassIndex(47646);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f77102a);
            baseActivityViewModel2.config(AnonymousClass2.f77103a);
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77098a, jVar);
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.b();
        finish();
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (TextUtils.equals(jVar.f91311b.optString("eventName"), "cancel_post_success")) {
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeFullscreenActivity f77104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.j f77105b;

        static {
            Covode.recordClassIndex(47649);
        }

        e(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            this.f77104a = policyNoticeFullscreenActivity;
            this.f77105b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77105b, this.f77104a, new h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(47650);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
                    com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
                    l.d(jVar2, "");
                    this.this$0.f77104a.a(jVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(47651);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f77104a.finish();
                    return z.f158842a;
                }
            });
            String str = this.f77105b.f76668a;
            com.ss.android.ugc.aweme.compliance.api.model.i iVar = this.f77104a.f77098a;
            if (iVar == null) {
                l.b();
            }
            String business = iVar.getBusiness();
            com.ss.android.ugc.aweme.compliance.api.model.i iVar2 = this.f77104a.f77098a;
            if (iVar2 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(str, business, iVar2.getStyle());
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", true);
        activityConfiguration(d.f77101a);
        super.onCreate(bundle);
        setContentView(R.layout.u4);
        this.f77098a = com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77070d;
        List<PolicyBodyLinkList> list = null;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77070d = null;
        com.ss.android.ugc.aweme.compliance.api.model.i iVar = this.f77098a;
        if (iVar != null) {
            if (l.a((Object) iVar.isSubPopUp(), (Object) true)) {
                ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.em8);
                l.b(buttonTitleBar, "");
                buttonTitleBar.setVisibility(0);
                ((ButtonTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new c(this));
            } else {
                ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.em8);
                l.b(buttonTitleBar2, "");
                buttonTitleBar2.setVisibility(4);
            }
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.d6j);
            com.ss.android.ugc.aweme.compliance.api.model.i iVar2 = this.f77098a;
            if (iVar2 != null) {
                str = iVar2.getTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(23);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.adh);
            Context context = tuxTextView2.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.api.model.i iVar3 = this.f77098a;
            if (iVar3 != null) {
                str2 = iVar3.getBody();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.compliance.api.model.i iVar4 = this.f77098a;
            if (iVar4 != null) {
                list = iVar4.getPolicyLinkList();
            }
            tuxTextView2.setText(com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(context, str2, list, new a(this), new b(this)));
            tuxTextView2.setHighlightColor(androidx.core.content.b.c(tuxTextView2.getContext(), R.color.c9));
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            com.ss.android.ugc.aweme.compliance.api.model.i iVar5 = this.f77098a;
            if (iVar5 == null) {
                l.b();
            }
            String business = iVar5.getBusiness();
            com.ss.android.ugc.aweme.compliance.api.model.i iVar6 = this.f77098a;
            if (iVar6 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(business, iVar6.getStyle());
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.a0s);
            tuxTextView3.setTuxFont(43);
            com.ss.android.ugc.aweme.compliance.api.model.i iVar7 = this.f77098a;
            if (iVar7 == null) {
                l.b();
            }
            a(tuxTextView3, iVar7.getActions().get(0));
            com.ss.android.ugc.aweme.compliance.api.model.i iVar8 = this.f77098a;
            if (iVar8 == null) {
                l.b();
            }
            if (iVar8.getActions().size() > 1) {
                TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.a0t);
                tuxTextView4.setVisibility(0);
                com.ss.android.ugc.aweme.compliance.api.model.i iVar9 = this.f77098a;
                if (iVar9 == null) {
                    l.b();
                }
                a(tuxTextView4, iVar9.getActions().get(1));
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.a0t);
                l.b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
            EventBus.a(EventBus.a(), this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", false);
    }

    private final void a(TuxTextView tuxTextView, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f76668a);
            tuxTextView.setOnClickListener(new e(this, jVar));
        }
    }
}
