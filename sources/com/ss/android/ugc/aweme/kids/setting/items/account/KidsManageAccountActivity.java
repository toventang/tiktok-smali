package com.ss.android.ugc.aweme.kids.setting.items.account;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class KidsManageAccountActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f106837a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f106838b;

    static {
        Covode.recordClassIndex(68322);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106838b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106838b == null) {
            this.f106838b = new HashMap();
        }
        View view = (View) this.f106838b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106838b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ KidsManageAccountActivity this$0;

        static {
            Covode.recordClassIndex(68326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(KidsManageAccountActivity kidsManageAccountActivity) {
            super(0);
            this.this$0 = kidsManageAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onResume", true);
        super.onResume();
        KidsAccountServiceImpl.h().a(new a(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onResume", false);
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

    public static final class a implements com.ss.android.ugc.aweme.kids.api.account.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsManageAccountActivity f106839a;

        static {
            Covode.recordClassIndex(68323);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f106839a = kidsManageAccountActivity;
        }

        @Override // com.ss.android.ugc.aweme.kids.api.account.a
        public final void a(boolean z) {
            this.f106839a.f106837a = z;
        }
    }

    static final class e extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f106842a = new e();

        static {
            Covode.recordClassIndex(68327);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106843a);
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsManageAccountActivity f106840a;

        static {
            Covode.recordClassIndex(68324);
        }

        b(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f106840a = kidsManageAccountActivity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r6)
                com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity r4 = r5.f106840a
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                boolean r1 = r4.f106837a
                java.lang.String r0 = "have_set_password"
                r3.putBoolean(r0, r1)
                java.lang.String r0 = "enter_password_settings"
                com.ss.android.ugc.aweme.kids.common.c.f.a(r0)
                com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService r2 = com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl.h()
                java.lang.String r1 = "manage_my_account"
                java.lang.String r0 = "password_click"
                r2.a(r4, r1, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity.b.onClick(android.view.View):void");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsManageAccountActivity f106841a;

        static {
            Covode.recordClassIndex(68325);
        }

        c(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f106841a = kidsManageAccountActivity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r7)
                com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity r5 = r6.f106841a
                java.lang.String r0 = "delete_account"
                com.ss.android.ugc.aweme.kids.common.c.f.a(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "https://www.tiktok.com/web-inapp/account/delete/confirm_child?hide_nav_bar=1&should_full_screen=1&__status_bar=true&"
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = "locale="
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = com.ss.android.ugc.aweme.kids.setting.items.language.d.a.c()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r4 = r0.toString()
                com.ss.android.ugc.aweme.bullet.api.IBulletService r3 = com.ss.android.ugc.aweme.bullet.impl.BulletService.f()
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r0 = "hide_nav_bar"
                r1 = 1
                r2.putBoolean(r0, r1)
                java.lang.String r0 = "hide_status_bar"
                r2.putBoolean(r0, r1)
                java.lang.String r0 = "kids_mode"
                r3.a(r5, r4, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity.c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onCreate", true);
        activityConfiguration(e.f106842a);
        super.onCreate(bundle);
        setContentView(R.layout.ac0);
        g gVar = new g();
        String string = getString(R.string.d1x);
        l.b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(gVar.a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new d(this)));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(true);
        ((CommonItemView) _$_findCachedViewById(R.id.a4i)).setOnClickListener(new b(this));
        ((TuxTextView) _$_findCachedViewById(R.id.ajr)).setOnClickListener(new c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onCreate", false);
    }
}
