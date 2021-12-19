package com.ss.android.ugc.trill.setting;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.a.a.a.b;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

@b(a = g.class)
public class PushSettingActivity extends a<g> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    protected ButtonTitleBar f150538a;

    /* renamed from: b  reason: collision with root package name */
    protected CommonItemView f150539b;

    /* renamed from: c  reason: collision with root package name */
    protected CommonItemView f150540c;

    /* renamed from: d  reason: collision with root package name */
    protected CommonItemView f150541d;

    static {
        Covode.recordClassIndex(98996);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.trill.setting.a, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.trill.setting.a
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.trill.setting.a
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        CommonItemView commonItemView = this.f150539b;
        commonItemView.setChecked(!commonItemView.d());
        com.ss.android.ugc.aweme.account.b.g().updateShieldDiggNotice(!this.f150539b.d());
        a("like", this.f150539b.d());
    }

    public final void c() {
        CommonItemView commonItemView = this.f150540c;
        commonItemView.setChecked(!commonItemView.d());
        com.ss.android.ugc.aweme.account.b.g().updateShieldFollowNotice(!this.f150540c.d());
        a("follow", this.f150540c.d());
    }

    public final void d() {
        CommonItemView commonItemView = this.f150541d;
        commonItemView.setChecked(!commonItemView.d());
        com.ss.android.ugc.aweme.account.b.g().updateShieldCommentNotice(!this.f150541d.d());
        a("comment_page", this.f150541d.d());
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
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
        if (id == R.id.c_u) {
            ((g) a()).a(view.getId(), this.f150539b.d());
        } else if (id == R.id.b7t) {
            ((g) a()).a(view.getId(), this.f150540c.d());
        } else if (id == R.id.a_o) {
            ((g) a()).a(view.getId(), this.f150541d.d());
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.trill.setting.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        a.a(this, bundle);
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new e(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.by);
        this.f150538a = (ButtonTitleBar) findViewById(R.id.emo);
        this.f150539b = (CommonItemView) findViewById(R.id.c_u);
        this.f150540c = (CommonItemView) findViewById(R.id.b7t);
        this.f150541d = (CommonItemView) findViewById(R.id.a_o);
        this.f150538a.setTitle(getString(R.string.f2k));
        this.f150538a.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.trill.setting.PushSettingActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98997);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                PushSettingActivity.this.finish();
            }
        });
        this.f150539b.setOnClickListener(this);
        this.f150540c.setOnClickListener(this);
        this.f150541d.setOnClickListener(this);
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        CommonItemView commonItemView = this.f150539b;
        if (curUser.getShieldDiggNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        CommonItemView commonItemView2 = this.f150540c;
        if (curUser.getShieldFollowNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        commonItemView2.setChecked(z2);
        CommonItemView commonItemView3 = this.f150541d;
        if (curUser.getShieldCommentNotice() == 1) {
            z3 = false;
        }
        commonItemView3.setChecked(z3);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
    }

    private static void a(String str, boolean z) {
        String str2;
        s sVar = new s();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        sVar.a("to_status", str2);
        r.onEvent(MobClick.obtain().setEventName("notification_switch").setLabelName(str).setJsonObject(sVar.a()));
    }
}
