package com.ss.android.ugc.aweme.kids.setting;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.items.language.d.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class KidsSettingActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public int f106810a;

    /* renamed from: b  reason: collision with root package name */
    public long f106811b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106812c;

    static {
        Covode.recordClassIndex(68292);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106812c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106812c == null) {
            this.f106812c = new HashMap();
        }
        View view = (View) this.f106812c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106812c.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ KidsSettingActivity this$0;

        static {
            Covode.recordClassIndex(68294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(KidsSettingActivity kidsSettingActivity) {
            super(0);
            this.this$0 = kidsSettingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.f354do, R.anim.dx);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        String str;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", true);
        super.onResume();
        com.ss.android.ugc.aweme.language.b a2 = a.b.f107065a.a();
        if (a2 != null) {
            str = a2.e();
        } else {
            str = null;
        }
        ((CommonItemView) _$_findCachedViewById(R.id.la)).setRightText(str);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", false);
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

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f106814a = new c();

        static {
            Covode.recordClassIndex(68295);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106815a);
            return z.f158842a;
        }
    }

    private static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            List<String> a2 = KidsComplianceServiceImpl.c().a();
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && a2.contains(tag)) {
                        childAt.setVisibility(8);
                    }
                }
            }
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsSettingActivity f106813a;

        static {
            Covode.recordClassIndex(68293);
        }

        a(KidsSettingActivity kidsSettingActivity) {
            this.f106813a = kidsSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (System.currentTimeMillis() - this.f106813a.f106811b < 500) {
                this.f106813a.f106810a++;
            } else {
                this.f106813a.f106810a = 0;
            }
            if (this.f106813a.f106810a >= 4) {
                TuxTextView tuxTextView = (TuxTextView) this.f106813a._$_findCachedViewById(R.id.fdd);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
                String c2 = KidsCommonServiceImpl.g().c();
                StringBuilder sb = new StringBuilder();
                sb.append("UserId: " + com.ss.android.ugc.aweme.kids.setting.a.a.a()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVerionCode: " + d.d()).append("\n").append("GitSHA: " + d.p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n").append(c2);
                TuxTextView tuxTextView2 = (TuxTextView) this.f106813a._$_findCachedViewById(R.id.fdd);
                l.b(tuxTextView2, "");
                tuxTextView2.setText(sb.toString());
                this.f106813a.f106810a = 0;
            }
            this.f106813a.f106811b = System.currentTimeMillis();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", true);
        activityConfiguration(c.f106814a);
        super.onCreate(bundle);
        setContentView(R.layout.adz);
        g gVar = new g();
        String string = getString(R.string.aja);
        l.b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(gVar.a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new b(this)));
        int i2 = Build.VERSION.SDK_INT;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e_f);
        l.b(_$_findCachedViewById, "");
        _$_findCachedViewById.getLayoutParams().height = com.bytedance.ies.uikit.c.a.a(this);
        String string2 = getString(R.string.fnj);
        l.b(string2, "");
        String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{d.i(), String.valueOf(d.h())}, 2));
        l.b(a2, "");
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ff3);
        l.b(tuxTextView, "");
        tuxTextView.setText(a2 + "");
        ((TuxTextView) _$_findCachedViewById(R.id.ff3)).setOnClickListener(new a(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dqn);
        l.b(relativeLayout, "");
        ((RelativeLayout) _$_findCachedViewById(R.id.dqn)).setBackgroundColor(androidx.core.content.b.c(relativeLayout.getContext(), R.color.f159928l));
        View findViewById = ((RelativeLayout) _$_findCachedViewById(R.id.dqn)).findViewById(R.id.cgl);
        l.b(findViewById, "");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        ((CommonItemView) _$_findCachedViewById(R.id.czh)).setLeftText("Debug Test");
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.czh);
        l.b(commonItemView, "");
        int i3 = 8;
        commonItemView.setVisibility(8);
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.cj6);
        l.b(commonItemView2, "");
        if (com.ss.android.ugc.aweme.kids.setting.a.a.b()) {
            i3 = 0;
        }
        commonItemView2.setVisibility(i3);
        a(viewGroup);
        p.a(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", false);
    }
}
