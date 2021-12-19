package com.ss.android.ugc.aweme.account.login.v2.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sdk.a.e.g;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.activity.processor.aa;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;

public class CommonFlowActivity extends b {

    /* renamed from: f  reason: collision with root package name */
    public static SparseArray<IAccountService.g> f64700f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public static final a f64701g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private k f64702a = k.PHONE_SMS_CHANGE_PASSWORD;

    /* renamed from: b  reason: collision with root package name */
    public boolean f64703b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f64704c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f64705d = true;

    /* renamed from: e  reason: collision with root package name */
    public Integer f64706e;

    /* renamed from: h  reason: collision with root package name */
    private final h f64707h = i.a((h.f.a.a) new d(this));

    /* renamed from: i  reason: collision with root package name */
    private HashMap f64708i;

    public static final void a(Activity activity, k kVar, j jVar, Bundle bundle, IAccountService.g gVar, Class<? extends Activity> cls, Boolean bool) {
        a.a(activity, kVar, jVar, bundle, gVar, cls, bool);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f64708i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f64708i == null) {
            this.f64708i = new HashMap();
        }
        View view = (View) this.f64708i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f64708i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public int c() {
        return 0;
    }

    public final Bundle h() {
        return (Bundle) this.f64707h.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39756);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static void a(Activity activity, int i2, IAccountService.g gVar, Boolean bool) {
            l.d(activity, "");
            if (gVar != null) {
                if (l.a((Object) bool, (Object) true)) {
                    CommonFlowActivity.f64700f.put(i2, gVar);
                } else if (activity instanceof m) {
                    CommonFlowActivity.f64700f.put(i2, gVar);
                    m mVar = (m) activity;
                    mVar.getLifecycle().a(new CommonFlowActivity$Companion$addResult$1(i2, mVar));
                } else {
                    throw new IllegalArgumentException("activity must be a LifecycleOwner!");
                }
            }
        }

        public static void a(Activity activity, k kVar, j jVar, Bundle bundle, IAccountService.g gVar, Class<? extends Activity> cls, Boolean bool) {
            l.d(activity, "");
            l.d(kVar, "");
            l.d(jVar, "");
            l.d(bundle, "");
            int i2 = bundle.getInt("current_scene", -1);
            if (i2 != -1) {
                bundle.putInt("last_scene", i2);
            }
            if (cls == null) {
                cls = CommonFlowActivity.class;
            }
            Intent intent = new Intent(activity, cls);
            bundle.putInt("next_page", kVar.getValue());
            bundle.putInt("current_scene", jVar.getValue());
            intent.putExtras(bundle);
            intent.putExtra("action_type", jVar.getValue());
            a(activity, jVar.getValue(), gVar, bool);
            a(activity, intent);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Bundle> {
        final /* synthetic */ CommonFlowActivity this$0;

        static {
            Covode.recordClassIndex(39761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommonFlowActivity commonFlowActivity) {
            super(0);
            this.this$0 = commonFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle a2 = a(this.this$0.getIntent());
            if (a2 == null) {
                a2 = new Bundle();
            }
            l.b(a2, "");
            a2.remove("next_page");
            return a2;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(39754);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        int i2;
        super.finish();
        int intExtra = getIntent().getIntExtra("action_type", -1);
        if (intExtra != -1 && f64700f.get(intExtra) != null) {
            if (!this.f64705d || this.f64703b) {
                IAccountService.g gVar = f64700f.get(intExtra);
                if (gVar == null) {
                    l.b();
                }
                IAccountService.g gVar2 = gVar;
                Integer num = this.f64706e;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = intExtra;
                }
                gVar2.onResult(i2, 1, this.f64704c);
            } else {
                IAccountService.g gVar3 = f64700f.get(intExtra);
                if (gVar3 == null) {
                    l.b();
                }
                gVar3.onResult(intExtra, 2, null);
            }
            f64700f.remove(intExtra);
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ CommonFlowActivity this$0;

        static {
            Covode.recordClassIndex(39757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommonFlowActivity commonFlowActivity) {
            super(1);
            this.this$0 = commonFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(39758);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    return new aa(this.this$0.this$0.c());
                }
            });
            baseActivityViewModel2.config(AnonymousClass2.f64711a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        Bundle bundle2;
        this.f64703b = true;
        if (bundle == null || (bundle2 = bundle.getBundle("final_data")) == null) {
            bundle2 = new Bundle();
        }
        this.f64704c = bundle2;
        finish();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        k a2 = k.a.a(bundle2.getInt("next_page", k.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        int i2 = bundle2.getInt("previous_page", -1);
        if (i2 != a2.getValue() || i2 == -1) {
            bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
            bundle2.putInt("current_page", a2.getValue());
            int i3 = bundle2.getInt("next_next_page", -1);
            if (i3 != -1) {
                bundle2.putInt("next_page", i3);
                bundle2.remove("next_next_page");
            } else {
                bundle2.remove("next_page");
            }
            b.a(this, com.ss.android.ugc.aweme.account.login.v2.ui.i.a(a2), bundle2);
            return;
        }
        onBackPressed();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", true);
        activityConfiguration(new b(this));
        super.onCreate(bundle);
        this.f64702a = k.a.a(getIntent().getIntExtra("next_page", k.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        if (bundle == null) {
            r<Bundle> rVar = ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a;
            Bundle a2 = a(getIntent());
            if (a2 == null) {
                a2 = new Bundle();
            }
            a2.putString("enter_from", e());
            a2.putString("enter_method", f());
            a2.putString("enter_type", g());
            a2.putInt("next_page", this.f64702a.getValue());
            rVar.postValue(a2);
        }
        com.bytedance.sdk.a.e.d.a().a(c.f64712a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", false);
    }

    static final class c implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f64712a = new c();

        static {
            Covode.recordClassIndex(39760);
        }

        c() {
        }

        @Override // com.bytedance.sdk.a.e.g.a
        public final void a(String str, Bundle bundle) {
            com.ss.android.ugc.aweme.common.r.a(str, bundle);
        }
    }

    public final void a(int i2, Bundle bundle) {
        this.f64704c = bundle;
        this.f64706e = Integer.valueOf(i2);
        this.f64705d = false;
        finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.sdk.a.e.d.a().a(i2, i3, intent);
    }
}
