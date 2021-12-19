package com.ss.android.ugc.aweme.ecommerce.common;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import h.f.b.l;
import org.json.JSONObject;

public final class BackInterceptContainerActivity extends BulletContainerActivity implements IEventCenter.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f85699m = new a((byte) 0);
    private String n;
    private SparseArray o;

    static {
        Covode.recordClassIndex(53595);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53596);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void finish() {
        super.finish();
        String str = this.n;
        if (str != null && str.length() > 0) {
            SmartRouter.buildRoute(this, str).open();
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventCenter.a().b("ec_hybrid_container_intercept_back", this);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        l.b(intent, "");
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("back_open_url");
        } else {
            str = null;
        }
        this.n = str;
        EventCenter.a().a("ec_hybrid_container_intercept_back", this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.common.BackInterceptContainerActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) "ec_hybrid_container_intercept_back", (Object) str) && str2.length() > 0) {
            try {
                if (l.a((Object) g().getReactId(), (Object) new JSONObject(str2).optString("react_id"))) {
                    this.n = new JSONObject(str2).optString("back_open_url");
                }
            } catch (Throwable th) {
                com.bytedance.services.apm.api.a.a(th);
            }
        }
    }
}
