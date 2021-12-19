package com.ss.android.ugc.aweme.ecommerce.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.base.a.d;
import com.ss.android.ugc.aweme.ecommerce.common.b;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import com.ss.android.ugc.aweme.ecommerce.track.e;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class ProductReviewActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f86967a;

    static {
        Covode.recordClassIndex(54528);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f86967a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f86967a == null) {
            this.f86967a = new SparseArray();
        }
        View view = (View) this.f86967a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86967a.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ ProductReviewActivity this$0;

        static {
            Covode.recordClassIndex(54529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ProductReviewActivity productReviewActivity) {
            super(0);
            this.this$0 = productReviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        d.a(this, 0, false);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Object obj;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.q_);
        d.a(this, 0, true);
        a.C1099a.a(this).b(true).a().f44923a.d();
        try {
            obj = j.a().a(a(getIntent(), "track_params"), Map.class);
        } catch (Exception unused) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map == null) {
            map = new HashMap();
        }
        String a2 = a(getIntent(), "product_id");
        if (a2 == null) {
            a2 = "";
        }
        l.b(a2, "");
        float floatExtra = getIntent().getFloatExtra("review_score", -1.0f);
        int intExtra = getIntent().getIntExtra("review_count", 0);
        Map d2 = ag.d(map);
        d2.put("page_name", "product_review");
        d2.put("product_id", a2);
        d2.putAll(map);
        d2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        TrackerProvider.a.a(this, new e(d2));
        n a3 = getSupportFragmentManager().a();
        a aVar = new a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("product_id", a2);
        bundle2.putInt("review_count", intExtra);
        if (floatExtra >= 0.0f) {
            bundle2.putFloat("review_score", floatExtra);
        }
        aVar.setArguments(bundle2);
        a3.b(R.id.b94, aVar, "PRODUCT_COMMENT_FRAGMENT_TAG").c();
        TuxNavBar.a aVar2 = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a4 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr);
        a4.f45194b = true;
        TuxNavBar.a a5 = aVar2.a(a4.a((h.f.a.a<z>) new a(this)));
        g gVar = new g();
        String string = getString(R.string.bi1, new Object[]{String.valueOf(intExtra)});
        l.b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).setNavActions(a5.a(gVar.a(string)));
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).a(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
