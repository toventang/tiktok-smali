package com.ss.android.ugc.aweme.setting.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class PushSettingNotificationChoiceActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122773a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private ButtonTitleBar f122774b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f122775c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f122776d;

    static {
        Covode.recordClassIndex(80587);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f122776d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f122776d == null) {
            this.f122776d = new SparseArray();
        }
        View view = (View) this.f122776d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f122776d.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80588);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", true);
        super.onResume();
        if (!fg.a(this)) {
            finish();
            overridePendingTransition(0, 0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", false);
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

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PushSettingNotificationChoiceActivity f122777a;

        static {
            Covode.recordClassIndex(80589);
        }

        b(PushSettingNotificationChoiceActivity pushSettingNotificationChoiceActivity) {
            this.f122777a = pushSettingNotificationChoiceActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f122777a.onBackPressed();
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f122778a = new c();

        static {
            Covode.recordClassIndex(80590);
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
            baseActivityViewModel2.config(AnonymousClass1.f122779a);
            baseActivityViewModel2.config(AnonymousClass2.f122780a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", true);
        activityConfiguration(c.f122778a);
        super.onCreate(bundle);
        setContentView(R.layout.ay9);
        i supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a("FRAGMENT_PUSH_MANAGER_LIST");
        if (a2 == null) {
            a2 = ae.f115954a.e();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("enter_from", a(getIntent(), "enter_from"));
        a2.setArguments(bundle2);
        n a3 = supportFragmentManager.a();
        l.b(a3, "");
        a3.b(R.id.b94, a2, "FRAGMENT_PUSH_MANAGER_LIST").c();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.emo);
        Objects.requireNonNull(_$_findCachedViewById, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById;
        this.f122774b = buttonTitleBar;
        if (buttonTitleBar == null) {
            l.a("mButtonTitleBar");
        }
        DmtTextView titleView = buttonTitleBar.getTitleView();
        l.b(titleView, "");
        this.f122775c = titleView;
        ButtonTitleBar buttonTitleBar2 = this.f122774b;
        if (buttonTitleBar2 == null) {
            l.a("mButtonTitleBar");
        }
        buttonTitleBar2.getStartBtn().setOnClickListener(new b(this));
        TextView textView = this.f122775c;
        if (textView == null) {
            l.a("mTitle");
        }
        textView.setText(getString(R.string.eg5));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
