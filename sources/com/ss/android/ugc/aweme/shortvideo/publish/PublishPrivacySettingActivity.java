package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.setting.br;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class PublishPrivacySettingActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: d  reason: collision with root package name */
    public String f129660d = "";

    /* renamed from: e  reason: collision with root package name */
    private boolean f129661e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f129662f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f129663g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, String> f129664h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f129665i = true;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f129666j;

    static {
        Covode.recordClassIndex(85116);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f129666j == null) {
            this.f129666j = new HashMap();
        }
        View view = (View) this.f129666j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f129666j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        CommonItemView commonItemView = (CommonItemView) d_(R.id.aa3);
        l.b(commonItemView, "");
        bundle.putBoolean("comment_item_checked", commonItemView.d());
        CommonItemView commonItemView2 = (CommonItemView) d_(R.id.aqs);
        l.b(commonItemView2, "");
        bundle.putBoolean("react_duet_item_checked", commonItemView2.d());
        CommonItemView commonItemView3 = (CommonItemView) d_(R.id.j4);
        l.b(commonItemView3, "");
        bundle.putBoolean("download_item_checked", commonItemView3.d());
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.onBackPressed();
    }

    public static final class c implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishPrivacySettingActivity f129669a;

        static {
            Covode.recordClassIndex(85119);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f129669a = publishPrivacySettingActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f129669a.onBackPressed();
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishPrivacySettingActivity f129667a;

        static {
            Covode.recordClassIndex(85117);
        }

        a(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f129667a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!t.f129886a) {
                CommonItemView commonItemView = (CommonItemView) this.f129667a.d_(R.id.j4);
                l.b(commonItemView, "");
                if (!commonItemView.d()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f129667a).a(R.string.bc9).a();
                    return;
                }
            }
            CommonItemView commonItemView2 = (CommonItemView) this.f129667a.d_(R.id.j4);
            l.b(commonItemView2, "");
            CommonItemView commonItemView3 = (CommonItemView) this.f129667a.d_(R.id.j4);
            l.b(commonItemView3, "");
            commonItemView2.setChecked(!commonItemView3.d());
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f129667a.f129660d).a("enter_from", "video_post_page");
            CommonItemView commonItemView4 = (CommonItemView) this.f129667a.d_(R.id.j4);
            l.b(commonItemView4, "");
            if (commonItemView4.d()) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("click_download_control", a2.a("to_status", str).f149193a);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishPrivacySettingActivity f129668a;

        static {
            Covode.recordClassIndex(85118);
        }

        b(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f129668a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            int i2;
            String str;
            ClickAgent.onClick(view);
            g.a().e().setReactDuetSettingChanged(true);
            AVPreferences e2 = g.a().e();
            CommonItemView commonItemView = (CommonItemView) this.f129668a.d_(R.id.aqs);
            l.b(commonItemView, "");
            if (commonItemView.d()) {
                i2 = br.f122115e;
            } else {
                i2 = br.f122116f;
            }
            e2.setReactDuetSettingCurrent(i2);
            CommonItemView commonItemView2 = (CommonItemView) this.f129668a.d_(R.id.aqs);
            l.b(commonItemView2, "");
            CommonItemView commonItemView3 = (CommonItemView) this.f129668a.d_(R.id.aqs);
            l.b(commonItemView3, "");
            commonItemView2.setChecked(true ^ commonItemView3.d());
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f129668a.f129660d).a("enter_from", "video_post_page");
            CommonItemView commonItemView4 = (CommonItemView) this.f129668a.d_(R.id.aqs);
            l.b(commonItemView4, "");
            if (commonItemView4.d()) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("click_react_duet_control", a2.a("to_status", str).f149193a);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bx);
        this.f129661e = getIntent().getBooleanExtra("comment_item_checked", false);
        this.f129662f = getIntent().getBooleanExtra("react_duet_item_checked", false);
        this.f129663g = getIntent().getBooleanExtra("download_item_checked", true);
        this.f129665i = getIntent().getBooleanExtra("can_react_duet", true);
        String a2 = a(getIntent(), "creation_id");
        if (a2 == null) {
            a2 = "";
        }
        this.f129660d = a2;
        Serializable serializableExtra = getIntent().getSerializableExtra("mob_data");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        this.f129664h = (HashMap) serializableExtra;
        com.ss.android.ugc.aweme.port.in.c.r.a((CommonItemView) d_(R.id.aa3), this.f129661e, this.f129664h);
        if (this.f129665i) {
            CommonItemView commonItemView = (CommonItemView) d_(R.id.aqs);
            l.b(commonItemView, "");
            commonItemView.setVisibility(0);
            CommonItemView commonItemView2 = (CommonItemView) d_(R.id.aqs);
            l.b(commonItemView2, "");
            commonItemView2.setChecked(this.f129662f);
            ((CommonItemView) d_(R.id.aqs)).setOnClickListener(new b(this));
        } else {
            CommonItemView commonItemView3 = (CommonItemView) d_(R.id.aqs);
            l.b(commonItemView3, "");
            commonItemView3.setVisibility(8);
        }
        if (t.a()) {
            CommonItemView commonItemView4 = (CommonItemView) d_(R.id.j4);
            l.b(commonItemView4, "");
            commonItemView4.setVisibility(0);
            CommonItemView commonItemView5 = (CommonItemView) d_(R.id.j4);
            l.b(commonItemView5, "");
            commonItemView5.setChecked(this.f129663g);
            ((CommonItemView) d_(R.id.j4)).setOnClickListener(new a(this));
        } else {
            CommonItemView commonItemView6 = (CommonItemView) d_(R.id.j4);
            l.b(commonItemView6, "");
            commonItemView6.setVisibility(8);
        }
        ((com.bytedance.ies.dmt.ui.titlebar.a) d_(R.id.em8)).setTitle(R.string.euk);
        ((ButtonTitleBar) d_(R.id.em8)).setOnTitleBarClickListener(new c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
