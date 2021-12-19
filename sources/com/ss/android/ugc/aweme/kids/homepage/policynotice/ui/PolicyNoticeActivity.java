package com.ss.android.ugc.aweme.kids.homepage.policynotice.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class PolicyNoticeActivity extends com.bytedance.ies.foundation.activity.a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106634a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f106635b;

    static {
        Covode.recordClassIndex(68133);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106635b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106635b == null) {
            this.f106635b = new HashMap();
        }
        View view = (View) this.f106635b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106635b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(89, new g(PolicyNoticeActivity.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ PolicyNoticeActivity this$0;

        static {
            Covode.recordClassIndex(68135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PolicyNoticeActivity policyNoticeActivity) {
            super(0);
            this.this$0 = policyNoticeActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        Boolean bool;
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = this.f106634a;
        if (aVar != null) {
            bool = aVar.isSubPopUp();
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
        final /* synthetic */ PolicyNoticeActivity f106636a;

        static {
            Covode.recordClassIndex(68136);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(PolicyNoticeActivity policyNoticeActivity) {
            this.f106636a = policyNoticeActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f106636a.finish();
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z> {
        final /* synthetic */ PolicyNoticeActivity this$0;

        static {
            Covode.recordClassIndex(68134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PolicyNoticeActivity policyNoticeActivity) {
            super(1);
            this.this$0 = policyNoticeActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.a(bVar2);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f106637a = new d();

        static {
            Covode.recordClassIndex(68137);
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
            baseActivityViewModel2.config(AnonymousClass1.f106638a);
            baseActivityViewModel2.config(AnonymousClass2.f106639a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeActivity f106640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b f106641b;

        static {
            Covode.recordClassIndex(68140);
        }

        e(PolicyNoticeActivity policyNoticeActivity, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            this.f106640a = policyNoticeActivity;
            this.f106641b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this.f106641b, this.f106640a, new h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(68141);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
                    com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
                    l.d(bVar2, "");
                    this.this$0.f106640a.a(bVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(68142);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f106640a.finish();
                    return z.f158842a;
                }
            });
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this.f106634a, bVar);
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this);
        finish();
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a aVar) {
        l.d(aVar, "");
        if (TextUtils.equals(aVar.f106614b.optString("eventName"), "cancel_post_success")) {
            finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", true);
        activityConfiguration(d.f106637a);
        super.onCreate(bundle);
        setContentView(R.layout.ac2);
        this.f106634a = com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106593d;
        List<PolicyBodyLinkList> list = null;
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106593d = null;
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = this.f106634a;
        if (aVar != null) {
            if (l.a((Object) aVar.isSubPopUp(), (Object) true)) {
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
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar2 = this.f106634a;
            if (aVar2 != null) {
                str = aVar2.getTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(23);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.adh);
            Context context = tuxTextView2.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar3 = this.f106634a;
            if (aVar3 != null) {
                str2 = aVar3.getBody();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar4 = this.f106634a;
            if (aVar4 != null) {
                list = aVar4.getPolicyLinkList();
            }
            tuxTextView2.setText(com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context, str2, list, new a(this), new b(this)));
            tuxTextView2.setHighlightColor(androidx.core.content.b.c(tuxTextView2.getContext(), R.color.c9));
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.a0s);
            tuxTextView3.setTuxFont(43);
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar5 = this.f106634a;
            if (aVar5 == null) {
                l.b();
            }
            a(tuxTextView3, aVar5.getActions().get(0));
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar6 = this.f106634a;
            if (aVar6 == null) {
                l.b();
            }
            if (aVar6.getActions().size() > 1) {
                TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.a0t);
                tuxTextView4.setVisibility(0);
                com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar7 = this.f106634a;
                if (aVar7 == null) {
                    l.b();
                }
                a(tuxTextView4, aVar7.getActions().get(1));
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.a0t);
                l.b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", false);
    }

    private final void a(TextView textView, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        if (textView != null) {
            textView.setText(bVar.f106622a);
            textView.setOnClickListener(new e(this, bVar));
        }
    }
}
