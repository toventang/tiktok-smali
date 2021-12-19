package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsCreatePermissionCheckApi;
import com.ss.android.ugc.aweme.shoutouts.review.b;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import h.f.b.l;

public final class ShoutOutWriteReviewActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f133284a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f133285b;

    static {
        Covode.recordClassIndex(87175);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f133285b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f133285b == null) {
            this.f133285b = new SparseArray();
        }
        View view = (View) this.f133285b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f133285b.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a implements b.AbstractC3455b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutWriteReviewActivity f133286a;

        static {
            Covode.recordClassIndex(87176);
        }

        @Override // com.ss.android.ugc.aweme.shoutouts.review.b.AbstractC3455b
        public final void a() {
            this.f133286a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(ShoutOutWriteReviewActivity shoutOutWriteReviewActivity) {
            this.f133286a = shoutOutWriteReviewActivity;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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

    public static final class b implements ae<com.ss.android.ugc.aweme.shoutouts.model.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutWriteReviewActivity f133287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133288b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133289c;

        static {
            Covode.recordClassIndex(87177);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f133287a.finish();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.shoutouts.model.a aVar) {
            com.ss.android.ugc.aweme.shoutouts.model.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f133201a == 3004041) {
                DmtStatusView dmtStatusView = this.f133287a.f133284a;
                if (dmtStatusView == null) {
                    l.a("loadingView");
                }
                dmtStatusView.setVisibility(8);
                this.f133287a.finish();
                ShoutOutWriteReviewActivity shoutOutWriteReviewActivity = this.f133287a;
                String str = this.f133288b;
                if (str == null) {
                    l.b();
                }
                String str2 = aVar2.f133203c;
                String str3 = this.f133289c;
                l.d(shoutOutWriteReviewActivity, "");
                com.ss.android.ugc.aweme.shoutouts.b.a.b(shoutOutWriteReviewActivity, "https://www.tiktok.com/web-inapp/shoutouts/order/comment?__status_bar=true&hide_nav_bar=1&should_full_screen=1&product_id=" + str + "&rating_id=" + str2 + "&order_id=" + str3 + "&user=consumer&enter_from=" + "chat");
                return;
            }
            ShoutOutWriteReviewActivity shoutOutWriteReviewActivity2 = this.f133287a;
            String str4 = this.f133288b;
            String str5 = this.f133289c;
            DmtStatusView dmtStatusView2 = shoutOutWriteReviewActivity2.f133284a;
            if (dmtStatusView2 == null) {
                l.a("loadingView");
            }
            dmtStatusView2.setVisibility(8);
            n a2 = shoutOutWriteReviewActivity2.getSupportFragmentManager().a();
            a aVar3 = new a(shoutOutWriteReviewActivity2);
            l.d(aVar3, "");
            b bVar = new b(str4, str5, (byte) 0);
            bVar.f133352b = aVar3;
            a2.a(R.id.dqe, bVar).c();
        }

        b(ShoutOutWriteReviewActivity shoutOutWriteReviewActivity, String str, String str2) {
            this.f133287a = shoutOutWriteReviewActivity;
            this.f133288b = str;
            this.f133289c = str2;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b0f);
        View findViewById = findViewById(R.id.ci4);
        l.b(findViewById, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById;
        this.f133284a = dmtStatusView;
        if (dmtStatusView == null) {
            l.a("loadingView");
        }
        dmtStatusView.setBuilder(DmtStatusView.a.a(this));
        DmtStatusView dmtStatusView2 = this.f133284a;
        if (dmtStatusView2 == null) {
            l.a("loadingView");
        }
        dmtStatusView2.f();
        String a2 = a(getIntent(), "product_id");
        String a3 = a(getIntent(), "order_id");
        if (a2 == null || a3 == null) {
            finish();
        }
        Object a4 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(ShoutoutsCreatePermissionCheckApi.class);
        l.b(a4, "");
        ((ShoutoutsCreatePermissionCheckApi) a4).checkPermission(a2, a3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new b(this, a2, a3));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
