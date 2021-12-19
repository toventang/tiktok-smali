package com.ss.android.ugc.aweme.compliance.business.vzbv.ui;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.w;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;

public class PrivacyAccountTipActivity extends a implements View.OnClickListener, x {

    /* renamed from: a  reason: collision with root package name */
    boolean f77266a;

    /* renamed from: b  reason: collision with root package name */
    w f77267b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f77268c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f77269d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f77270e;

    static {
        Covode.recordClassIndex(47781);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        w newUserPresenter = ae.f115954a.newUserPresenter();
        this.f77267b = newUserPresenter;
        newUserPresenter.a(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        a.C0732a.f33434a.a(b.a.PRIVATE_ACCOUNT_TIP);
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

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            int id = view.getId();
            if (id == R.id.ym) {
                com.ss.android.ugc.aweme.compliance.api.a.i().d();
                SettingServiceImpl.v().providePushSettingChangePresenter().a("notify_private_account", 1);
                finish();
                com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("tns_privacy_notify_skip");
            } else if (id != R.id.yl) {
            } else {
                if (!this.f77268c) {
                    if (!isDestroyed()) {
                        new a.C0731a(this).b(R.string.bny).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.c5b, (DialogInterface.OnClickListener) new a(this), false).a().b();
                    }
                    com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("tns_privacy_notify_enable");
                    return;
                }
                SettingServiceImpl.v().providePushSettingChangePresenter().a("notify_private_account", 1);
                com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.b("privacy_account_setting_confirm", this.f77266a);
                finish();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u5);
        this.f77269d = (TextView) findViewById(R.id.ym);
        this.f77270e = (TextView) findViewById(R.id.yl);
        this.f77269d.setText(getString(R.string.g1_));
        this.f77270e.setText(getString(R.string.evf));
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.adh);
        TextView textView3 = (TextView) findViewById(R.id.a4f);
        boolean b2 = com.ss.android.ugc.aweme.compliance.api.a.i().b();
        this.f77268c = b2;
        if (b2) {
            this.f77269d.setVisibility(8);
            textView.setText(R.string.nc);
            this.f77270e.setText(R.string.c5o);
            textView2.setText(R.string.bo0);
            textView3.setVisibility(8);
        }
        this.f77269d.setOnClickListener(this);
        this.f77270e.setOnClickListener(this);
        if (getIntent() != null) {
            this.f77266a = getIntent().getBooleanExtra("isFirstLaunch", false);
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.i().b()) {
            com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.b("privacy_account_setting_show", this.f77266a);
        } else {
            com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("privacy_account_setting_show", this.f77266a);
        }
        com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("tns_privacy_notify");
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        if (i2 == 122) {
            new com.bytedance.tux.g.b(this).e(R.string.h07).b();
        }
    }
}
