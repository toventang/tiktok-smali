package com.ss.android.ugc.aweme.kids.discovery.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class DiscoveryFeedActivity extends com.ss.android.ugc.aweme.kids.commonfeed.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106442a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f106443b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f106444c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f106445d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private HashMap f106446e;

    static {
        Covode.recordClassIndex(68017);
    }

    private final String g() {
        return (String) this.f106443b.getValue();
    }

    private final int h() {
        return ((Number) this.f106444c.getValue()).intValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106446e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106446e == null) {
            this.f106446e = new HashMap();
        }
        View view = (View) this.f106446e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106446e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String b() {
        return "discovery_feed_fragment";
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.kids.commonfeed.ui.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onCreate", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68018);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String e() {
        return g();
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String c() {
        String a2 = a(getIntent(), "enter_from");
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String d() {
        String a2 = a(getIntent(), "title");
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final String f() {
        return a(getIntent(), "current_id");
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ DiscoveryFeedActivity this$0;

        static {
            Covode.recordClassIndex(68019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.this$0 = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "challenge_id");
            if (a2 == null) {
                a2 = "";
            }
            l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ DiscoveryFeedActivity this$0;

        static {
            Covode.recordClassIndex(68020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.this$0 = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.getIntent().getIntExtra("feed_type", -1));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ DiscoveryFeedActivity this$0;

        static {
            Covode.recordClassIndex(68021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.this$0 = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.getIntent().getBooleanExtra("preload_from_cache", false));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.a
    public final com.ss.android.ugc.aweme.kids.commonfeed.c.a a() {
        return new a(g(), ((Boolean) this.f106445d.getValue()).booleanValue());
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

    @Override // androidx.fragment.app.e
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        l.d(str, "");
        l.d(context, "");
        l.d(attributeSet, "");
        View onCreateView = super.onCreateView(str, context, attributeSet);
        if (h() == 1) {
            com.ss.android.ugc.aweme.kids.common.c.c.f105889a = "category_id";
        } else if (h() == 0) {
            com.ss.android.ugc.aweme.kids.common.c.c.f105889a = "trending_content_id";
        }
        com.ss.android.ugc.aweme.kids.common.c.c.f105890b = g();
        return onCreateView;
    }
}
