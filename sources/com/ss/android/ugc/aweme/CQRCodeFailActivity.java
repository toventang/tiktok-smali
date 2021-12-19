package com.ss.android.ugc.aweme;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class CQRCodeFailActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62388a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f62389b;

    static {
        Covode.recordClassIndex(38341);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f62389b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62389b == null) {
            this.f62389b = new SparseArray();
        }
        View view = (View) this.f62389b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62389b.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38342);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ CQRCodeFailActivity this$0;

        static {
            Covode.recordClassIndex(38345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CQRCodeFailActivity cQRCodeFailActivity) {
            super(0);
            this.this$0 = cQRCodeFailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            r.onEventV3("deeplink_preview_error_toast_click");
            this.this$0.finish();
            return z.f158842a;
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

    static final class b extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ CQRCodeFailActivity this$0;

        static {
            Covode.recordClassIndex(38343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CQRCodeFailActivity cQRCodeFailActivity) {
            super(1);
            this.this$0 = cQRCodeFailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setText(this.this$0.getString(R.string.ff7));
            tuxButton2.setTextColor(androidx.core.content.b.c(this.this$0, R.color.a9));
            tuxButton2.setButtonVariant(0);
            tuxButton2.setButtonSize(3);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.CQRCodeFailActivity.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f62390a;

                static {
                    Covode.recordClassIndex(38344);
                }

                {
                    this.f62390a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    r.onEventV3("deeplink_preview_error_toast_click");
                    this.f62390a.this$0.finish();
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c0);
        TuxStatusView.c a2 = new TuxStatusView.c().a(0, R.drawable.bbb);
        String string = getString(R.string.ff9);
        l.b(string, "");
        TuxStatusView.c a3 = a2.a(string);
        String string2 = getString(R.string.ff8);
        l.b(string2, "");
        TuxStatusView.c a4 = a3.a((CharSequence) string2);
        a4.f45362j = new b(this);
        ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).setStatus(a4);
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a5 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_chevron_left_offset_ltr);
        a5.f45194b = true;
        TuxNavBar.a a6 = aVar.a(a5.a((h.f.a.a<z>) new c(this)));
        g gVar = new g();
        String string3 = getString(R.string.ff_);
        l.b(string3, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.em8)).setNavActions(a6.a(gVar.a(string3)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onCreate", false);
    }
}
