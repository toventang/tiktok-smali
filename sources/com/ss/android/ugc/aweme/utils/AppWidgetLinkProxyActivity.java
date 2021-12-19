package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.e;
import h.f.b.l;
import java.io.Serializable;

public final class AppWidgetLinkProxyActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142561a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f142562b;

    static {
        Covode.recordClassIndex(93237);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f142562b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f142562b == null) {
            this.f142562b = new SparseArray();
        }
        View view = (View) this.f142562b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f142562b.put(i2, findViewById);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93238);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Intent a(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            Intent intent = new Intent(context, AppWidgetLinkProxyActivity.class);
            intent.putExtra("extra_widget_type", str);
            return intent;
        }
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        String a2 = a(getIntent(), "extra_widget_type");
        if (a2 == null) {
            a2 = "";
        }
        l.b(a2, "");
        p.a("launch_app", a2);
        UgCommonServiceImpl.j().h().a(e.a.WIDGET, a2);
        int intExtra = getIntent().getIntExtra("extra_jump_type", -1);
        if (intExtra == 1) {
            String a3 = a(getIntent(), "extra_challenge_id");
            if (!(a3 == null || a3.length() == 0)) {
                SmartRouter.buildRoute(this, "//challenge/detail").withParam("id", a3).withParam("extra_challenge_from", "").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).open(0);
            }
        } else if (intExtra == 2) {
            Serializable serializableExtra = getIntent().getSerializableExtra("extra_aweme");
            if (!(serializableExtra instanceof Aweme)) {
                serializableExtra = null;
            }
            Aweme aweme = (Aweme) serializableExtra;
            String a4 = a(getIntent(), "extra_challenge_id");
            if (a4 == null) {
                a4 = "";
            }
            l.b(a4, "");
            if (!(aweme == null || a4.length() == 0)) {
                SmartRouter.buildRoute(this, "aweme://aweme/detail/").withParam("id", aweme.getAid()).withParam("refer", "discovery").withParam("video_from", "from_discovery_challenge").withParam("video_type", 2).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("challenge_id", a4).open();
            }
        } else if (intExtra == 3) {
            SmartRouter.buildRoute(this, "//kids/main").open();
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
