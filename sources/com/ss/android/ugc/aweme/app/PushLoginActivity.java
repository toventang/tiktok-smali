package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.accountsdk.g;
import com.ss.android.ugc.aweme.app.accountsdk.k;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;

public class PushLoginActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    private Handler f66503a = new Handler(Looper.myLooper());

    static {
        Covode.recordClassIndex(40875);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.f66503a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        final Bundle bundle2;
        final Intent intent;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", true);
        activityConfiguration(ag.f66558a);
        super.onCreate(bundle);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("next_step");
        final ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("next_steps");
        Intent intent3 = getIntent();
        final String str = null;
        if (intent3 != null) {
            bundle2 = intent3.getBundleExtra("multi_account");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundle2 == null || context == null)) {
                bundle2.setClassLoader(context.getClassLoader());
            }
            if (bundle2 != null) {
                intent = (Intent) bundle2.getParcelable("push_intent");
            }
            intent = null;
        } else {
            bundle2 = null;
            intent = null;
        }
        if (intent3 != null) {
            str = a(intent3, "multi_account_push_uid");
        }
        final RecordConfig recordConfig = (RecordConfig) getIntent().getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
        final Intent intent4 = new Intent();
        intent4.setClassName(this, "com.ss.android.ugc.aweme.main.MainActivity");
        AnonymousClass1 r9 = new f() {
            /* class com.ss.android.ugc.aweme.app.PushLoginActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(40876);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                PushLoginActivity.this.finish();
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                if (bundle2 == null || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str) || str.equals(b.g().getCurUserId())) {
                        Intent intent = intent2;
                        if (intent != null) {
                            a(PushLoginActivity.this, intent);
                        } else {
                            ArrayList arrayList = parcelableArrayListExtra;
                            if (arrayList != null && arrayList.size() > 1) {
                                PushLoginActivity pushLoginActivity = PushLoginActivity.this;
                                ArrayList arrayList2 = parcelableArrayListExtra;
                                pushLoginActivity.startActivities((Intent[]) arrayList2.toArray(new Intent[arrayList2.size()]));
                            }
                        }
                    }
                    if (recordConfig != null) {
                        AVExternalServiceImpl.a().asyncService("PushLogin", new SimpleServiceLoadCallback() {
                            /* class com.ss.android.ugc.aweme.app.PushLoginActivity.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(40877);
                            }

                            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                                asyncAVService.uiService().recordService().startRecord(PushLoginActivity.this, recordConfig);
                            }
                        });
                    }
                    PushLoginActivity.this.finish();
                    return;
                }
                if (TextUtils.equals(str, b.g().getCurUserId())) {
                    bundle2.putBoolean("login_jump", true);
                    bundle2.putParcelable("push_intent", intent);
                    LoginUtilsServiceImpl.a().a(bundle2);
                } else {
                    a(PushLoginActivity.this, intent4);
                }
                PushLoginActivity.this.finish();
            }

            private static void a(PushLoginActivity pushLoginActivity, Intent intent) {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, pushLoginActivity);
                pushLoginActivity.startActivity(intent);
            }
        };
        Bundle bundle3 = new Bundle();
        if (b.g().isLogin()) {
            bundle3.putBoolean("force_use_default_login_method", true);
            bundle3.putBoolean("need_auto_fill_latest_login_info", false);
        }
        bo b2 = b.b();
        IAccountService.d dVar = new IAccountService.d();
        dVar.f62401a = this;
        dVar.f62402b = "push";
        dVar.f62403c = "push";
        dVar.f62407g = true;
        dVar.f62404d = bundle3;
        dVar.f62406f = new g();
        dVar.f62405e = new k(r9);
        b2.showLoginAndRegisterView(dVar.a());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
