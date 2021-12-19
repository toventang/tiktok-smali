package com.ss.android.ugc.aweme.kids.homepage.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.HashMap;

public final class KidsDeepLinkHandlerActivity extends com.bytedance.ies.foundation.activity.a {
    public static final a Companion = new a((byte) 0);
    private HashMap _$_findViewCache;
    private String gdLabel = "";
    private boolean isOpenAwemeDetail;
    private boolean mNoMatched;
    private Uri mUri;

    static {
        Covode.recordClassIndex(68106);
    }

    public static int com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public final void KidsDeepLinkHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68107);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getMNoMatched() {
        return this.mNoMatched;
    }

    /* access modifiers changed from: protected */
    public final Uri getMUri() {
        return this.mUri;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        super.onDestroy();
        this.mNoMatched = false;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        super.onStart();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void setMNoMatched(boolean z) {
        this.mNoMatched = z;
    }

    /* access modifiers changed from: protected */
    public final void setMUri(Uri uri) {
        this.mUri = uri;
    }

    @Override // com.bytedance.ies.foundation.activity.a, android.view.ContextThemeWrapper, androidx.appcompat.app.d, android.app.Activity
    public final void setTheme(int i2) {
        try {
            super.setTheme(i2);
        } catch (Exception unused) {
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f106588a = new b();

        static {
            Covode.recordClassIndex(68108);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106589a);
            return z.f158842a;
        }
    }

    public static void com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        kidsDeepLinkHandlerActivity.KidsDeepLinkHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(kidsDeepLinkHandlerActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    private final boolean parseUri(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!com.bytedance.common.utility.m.a(action)) {
            if (action == null) {
                l.b();
            }
            if (p.a((CharSequence) action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                String com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "open_url");
                if (!com.bytedance.common.utility.m.a(com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                    try {
                        this.mUri = Uri.parse(com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    } catch (Exception e2) {
                        com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e(KidsDeepLinkHandlerActivity.class.getSimpleName(), "", e2);
                        return false;
                    }
                }
            }
        }
        if (this.mUri == null) {
            this.mUri = intent.getData();
        }
        Uri uri = this.mUri;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        activityConfiguration(b.f106588a);
        super.onCreate(bundle);
        f.a(this);
        Intent intent = getIntent();
        if (parseUri(intent)) {
            Uri data = intent.getData();
            if (!(data == null || data.getQueryParameter("gd_label") == null)) {
                String queryParameter = data.getQueryParameter("gd_label");
                if (queryParameter == null) {
                    l.b();
                }
                this.gdLabel = queryParameter;
            }
            SmartRouter.buildRoute(this, "//kids/main").open();
            if (TextUtils.equals("amazon_alexa", this.gdLabel) || TextUtils.equals("google_assistant", this.gdLabel)) {
                new com.bytedance.tux.g.b(this).a(getResources().getString(R.string.b5f)).a().b();
            }
        } else if (!isFinishing()) {
            finish();
        }
    }

    public static String com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
