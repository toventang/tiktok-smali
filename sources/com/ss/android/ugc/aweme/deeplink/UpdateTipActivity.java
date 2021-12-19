package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class UpdateTipActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    String f79422a = "";

    /* renamed from: b  reason: collision with root package name */
    private UpdateTipsArgs f79423b;

    static {
        Covode.recordClassIndex(49321);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        a();
    }

    private void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("schema_url", this.f79422a);
        hashMap.put("click_position", "back");
        r.a("schema_update_toast_click", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Intent intent = new Intent(this, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass());
        intent.addFlags(131072);
        a(this, intent);
        d();
        finish();
    }

    private void b() {
        if (a(getIntent()) != null) {
            this.f79422a = this.f79423b.getUrlToGo();
            if (TextUtils.equals(d.s, "local_test") && !this.f79422a.isEmpty()) {
                TextView textView = (TextView) findViewById(R.id.aiw);
                textView.setText(this.f79422a);
                textView.setVisibility(0);
            }
        }
    }

    private void c() {
        if (a(getIntent()) != null) {
            String versionRequire = this.f79423b.getVersionRequire();
            if (!TextUtils.isEmpty(versionRequire)) {
                ((TextView) findViewById(R.id.aix)).setText(com.a.a(getResources().getString(R.string.ffb), new Object[]{versionRequire}));
            }
        }
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        c();
        b();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ca);
        this.f79423b = UpdateTipsArgs.getOrNew(this);
        View findViewById = findViewById(R.id.aiy);
        View findViewById2 = findViewById(R.id.aiv);
        findViewById.setOnClickListener(new x(this));
        if (TextUtils.equals(d.s, "local_test")) {
            findViewById2.setVisibility(4);
        } else {
            findViewById2.setOnClickListener(new y(this));
        }
        c();
        b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", false);
    }

    public static void a(UpdateTipActivity updateTipActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, updateTipActivity);
        updateTipActivity.startActivity(intent);
    }
}
