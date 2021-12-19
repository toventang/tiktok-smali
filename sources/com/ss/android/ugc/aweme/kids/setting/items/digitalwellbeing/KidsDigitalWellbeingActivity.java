package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.model.TimeLockUserSetting;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class KidsDigitalWellbeingActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f106885a;

    static {
        Covode.recordClassIndex(68365);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106885a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106885a == null) {
            this.f106885a = new HashMap();
        }
        View view = (View) this.f106885a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106885a.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ KidsDigitalWellbeingActivity this$0;

        static {
            Covode.recordClassIndex(68367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity) {
            super(0);
            this.this$0 = kidsDigitalWellbeingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    private final void a() {
        int i2;
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.am_);
        if (TimeLockRuler.isTimeLockOn()) {
            i2 = R.string.c_u;
        } else {
            i2 = R.string.dj5;
        }
        commonItemView.setRightText(getString(i2));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onResume", true);
        super.onResume();
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onResume", false);
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
        public static final c f106887a = new c();

        static {
            Covode.recordClassIndex(68368);
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
            baseActivityViewModel2.config(AnonymousClass1.f106888a);
            return z.f158842a;
        }
    }

    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        if (timeLockUserSetting != null && !timeLockUserSetting.isNotifyParentModeOnly()) {
            a();
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsDigitalWellbeingActivity f106886a;

        static {
            Covode.recordClassIndex(68366);
        }

        a(KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity) {
            this.f106886a = kidsDigitalWellbeingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity = this.f106886a;
            Intent intent = new Intent(this.f106886a, SetTimeLockActivity.class);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, kidsDigitalWellbeingActivity);
            kidsDigitalWellbeingActivity.startActivity(intent);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onCreate", true);
        activityConfiguration(c.f106887a);
        super.onCreate(bundle);
        setContentView(R.layout.ady);
        g gVar = new g();
        String string = getString(R.string.ghe);
        l.b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(gVar.a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new b(this)));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(true);
        ((CommonItemView) _$_findCachedViewById(R.id.am_)).setLeftText(getString(R.string.b7h));
        ((CommonItemView) _$_findCachedViewById(R.id.am_)).setRightIconRes(0);
        ((CommonItemView) _$_findCachedViewById(R.id.am_)).setOnClickListener(new a(this));
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onCreate", false);
    }
}
