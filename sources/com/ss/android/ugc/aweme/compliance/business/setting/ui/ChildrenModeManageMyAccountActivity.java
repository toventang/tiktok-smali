package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.util.g;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;

public class ChildrenModeManageMyAccountActivity extends a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    TextTitleBar f77174a;

    /* renamed from: b  reason: collision with root package name */
    CommonItemView f77175b;

    /* renamed from: c  reason: collision with root package name */
    TuxTextView f77176c;

    /* renamed from: d  reason: collision with root package name */
    protected User f77177d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f77178e;

    static {
        Covode.recordClassIndex(47721);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void a() {
        this.f77177d = b.g().getCurUser();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", true);
        super.onResume();
        b.g().getSetPasswordStatus(new cv() {
            /* class com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(47723);
            }

            @Override // com.ss.android.ugc.aweme.cv
            public final void onUpdateFailed(String str) {
            }

            @Override // com.ss.android.ugc.aweme.cv
            public final void onUpdateSuccess(boolean z) {
                ChildrenModeManageMyAccountActivity.this.f77178e = z;
                SharePrefCache.inst().getUserHasPassword().b(Boolean.valueOf(ChildrenModeManageMyAccountActivity.this.f77178e));
            }
        });
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", false);
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
        int id = view.getId();
        if (id == R.id.a4i) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("have_set_password", this.f77178e);
            r.a("manage_account_password_click", new d().f66730a);
            b.f().changePassword(this, "manage_my_account", "password_click", bundle, null);
        } else if (id == R.id.ajr) {
            ab.a("enter_delete_account").b("previous_page", "account_security_settings").b("enter_method", "click_button").f();
            g.a(this);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.f159928l;
        activityConfiguration(new a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.tx);
        a();
        TextTitleBar textTitleBar = (TextTitleBar) findViewById(R.id.em8);
        this.f77174a = textTitleBar;
        textTitleBar.setTitle(R.string.d1x);
        this.f77174a.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47722);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                ChildrenModeManageMyAccountActivity.this.finish();
            }
        });
        TextTitleBar textTitleBar2 = this.f77174a;
        textTitleBar2.setBackgroundColor(androidx.core.content.b.c(textTitleBar2.getContext(), R.color.f159928l));
        this.f77175b = (CommonItemView) findViewById(R.id.a4i);
        this.f77176c = (TuxTextView) findViewById(R.id.ajr);
        this.f77175b.setOnClickListener(this);
        this.f77176c.setOnClickListener(this);
        com.ss.android.ugc.aweme.compliance.api.a.l().a("new_kids_mode_visit", true ^ in.d(), new d().a("activity", "ChildrenModeManageMyAccountActivity").f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", false);
    }
}
