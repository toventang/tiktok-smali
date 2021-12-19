package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.i18n.musically.cut.j;
import com.zhiliaoapp.musically.R;

public final class I18nHeaderDetailActivity extends HeaderDetailActivity {
    public boolean r;
    private SparseArray s;

    static {
        Covode.recordClassIndex(75424);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final boolean c() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void d() {
        super.d();
        this.r = getIntent().getBooleanExtra("handle_with_video_avatar", false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void b() {
        if (this.r) {
            new b.a(this).a(getResources().getStringArray(R.array.ae), new a(this)).b().show();
        } else {
            super.e();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
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

    static final class b implements j.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nHeaderDetailActivity f116789a;

        static {
            Covode.recordClassIndex(75426);
        }

        b(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f116789a = i18nHeaderDetailActivity;
        }

        @Override // com.ss.android.ugc.aweme.i18n.musically.cut.j.a
        public final void a(String str) {
            this.f116789a.a(str);
        }
    }

    public final void a(String str) {
        try {
            Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
            if (parse != null) {
                k.a().e().a(parse);
                a(this.f116769c, false, parse.toString());
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.b51);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(androidx.core.content.b.c(this, R.color.a3));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", false);
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nHeaderDetailActivity f116788a;

        static {
            Covode.recordClassIndex(75425);
        }

        a(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f116788a = i18nHeaderDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == 0) {
                I18nHeaderDetailActivity i18nHeaderDetailActivity = this.f116788a;
                new j().a(i18nHeaderDetailActivity, new b(i18nHeaderDetailActivity));
            }
        }
    }
}
