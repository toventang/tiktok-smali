package com.ss.android.ugc.aweme.kids.liked.detail;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public final class FavoriteFeedActivity extends com.ss.android.ugc.aweme.kids.commonfeed.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106719a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private HashMap f106720b;

    static {
        Covode.recordClassIndex(68215);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106720b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106720b == null) {
            this.f106720b = new HashMap();
        }
        View view = (View) this.f106720b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106720b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String b() {
        return "favorite_feed_fragment";
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String c() {
        return "like";
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String d() {
        return "";
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68216);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String f() {
        return a(getIntent(), "current_id");
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final com.ss.android.ugc.aweme.kids.commonfeed.c.a a() {
        List<Aweme> list;
        WeakReference<List<Aweme>> weakReference = com.ss.android.ugc.aweme.kids.liked.b.a.f106717a;
        if (weakReference == null || (list = weakReference.get()) == null) {
            list = z.INSTANCE;
        }
        return new a(list);
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

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
