package com.ss.android.ugc.aweme.commercialize.im;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.im.a;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;

public final class ChatCheckLoginActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f74466d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f74467a = RouteArgExtension.INSTANCE.optionalArg(this, d.f74473a, "extra_uid", String.class);

    /* renamed from: b  reason: collision with root package name */
    final h f74468b = RouteArgExtension.INSTANCE.optionalArg(this, b.f74471a, "extra_ext", String.class);

    /* renamed from: c  reason: collision with root package name */
    final h f74469c = RouteArgExtension.INSTANCE.optionalArg(this, c.f74472a, "extra_imadlog", com.ss.android.ugc.aweme.im.service.model.e.class);

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f74470e;

    static {
        Covode.recordClassIndex(45928);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f74470e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f74470e == null) {
            this.f74470e = new SparseArray();
        }
        View view = (View) this.f74470e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f74470e.put(i2, findViewById);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45929);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context, String str, String str2, com.ss.android.ugc.aweme.im.service.model.e eVar) {
            l.d(context, "");
            SmartRouter.buildRoute(context, "//main/im/check_login").withParam("extra_uid", str).withParam("extra_ext", str2).withParam("extra_imadlog", eVar).open();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatCheckLoginActivity f74474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f74475b;

        static {
            Covode.recordClassIndex(45933);
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
            this.f74474a.finish();
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f74475b.element.invoke();
        }

        e(ChatCheckLoginActivity chatCheckLoginActivity, z.e eVar) {
            this.f74474a = chatCheckLoginActivity;
            this.f74475b = eVar;
        }
    }

    static final class f extends m implements h.f.a.a<h.z> {
        final /* synthetic */ ChatCheckLoginActivity this$0;

        static {
            Covode.recordClassIndex(45934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChatCheckLoginActivity chatCheckLoginActivity) {
            super(0);
            this.this$0 = chatCheckLoginActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            ChatCheckLoginActivity chatCheckLoginActivity = this.this$0;
            new a.C1680a(chatCheckLoginActivity, (String) chatCheckLoginActivity.f74467a.getValue(), (String) this.this$0.f74468b.getValue(), (com.ss.android.ugc.aweme.im.service.model.e) this.this$0.f74469c.getValue()).a();
            this.this$0.finish();
            return h.z.f158842a;
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

    static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74471a = new b();

        static {
            Covode.recordClassIndex(45930);
        }

        b() {
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

    static final class c extends m implements h.f.a.b<Boolean, com.ss.android.ugc.aweme.im.service.model.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f74472a = new c();

        static {
            Covode.recordClassIndex(45931);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.e invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f74473a = new d();

        static {
            Covode.recordClassIndex(45932);
        }

        d() {
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        z.e eVar = new z.e();
        eVar.element = (T) new f(this);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            eVar.element.invoke();
        } else {
            com.ss.android.ugc.aweme.login.c.a(this, "", "", new e(this, eVar));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", false);
    }
}
