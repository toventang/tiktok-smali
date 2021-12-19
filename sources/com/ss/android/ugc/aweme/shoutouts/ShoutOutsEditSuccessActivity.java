package com.ss.android.ugc.aweme.shoutouts;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.e.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;
import java.util.HashMap;

public final class ShoutOutsEditSuccessActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: d  reason: collision with root package name */
    private HashMap f133108d;

    static {
        Covode.recordClassIndex(87038);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean cs_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f133108d == null) {
            this.f133108d = new HashMap();
        }
        View view = (View) this.f133108d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f133108d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    public final void finish() {
        super.finish();
        com.ss.android.ugc.aweme.tools.a.b(this, 3);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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
        final /* synthetic */ ShoutOutsEditSuccessActivity f133110a;

        static {
            Covode.recordClassIndex(87041);
        }

        b(ShoutOutsEditSuccessActivity shoutOutsEditSuccessActivity) {
            this.f133110a = shoutOutsEditSuccessActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133110a.finish();
        }
    }

    static final class a extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ ShoutOutsEditSuccessActivity this$0;

        static {
            Covode.recordClassIndex(87039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShoutOutsEditSuccessActivity shoutOutsEditSuccessActivity) {
            super(1);
            this.this$0 = shoutOutsEditSuccessActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setButtonSize(3);
            tuxButton2.setText(this.this$0.getString(R.string.g0c));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f133109a;

                static {
                    Covode.recordClassIndex(87040);
                }

                {
                    this.f133109a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f133109a.this$0, "//shoutouts/detail").withParam("enter_from", 1).open();
                    this.f133109a.this$0.finish();
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("shoutout_edit_price", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("shoutout_hide_button", false);
        ShoutOutServiceImpl.b().a("shoutouts_edit_post_success_time_" + c.u.c(), System.currentTimeMillis());
        System.currentTimeMillis();
        String string = getString(R.string.co6);
        String str = "";
        l.b(string, str);
        String string2 = getString(R.string.co5);
        l.b(string2, str);
        String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{AVExternalServiceImpl.a().shoutOutsService().getShoutOutSettingsModel().a()}, 1));
        l.b(a2, str);
        if (booleanExtra) {
            string = getString(R.string.g0e);
            l.b(string, str);
        } else {
            str = a2;
        }
        setContentView(R.layout.b_);
        com.ss.android.ugc.aweme.tools.a.a(this, 3);
        TuxStatusView.c b2 = new TuxStatusView.c().a(0, 2131233806).a(string).a((CharSequence) str).b((int) n.b(this, 72.0f), (int) n.b(this, 72.0f));
        if (!booleanExtra2) {
            b2.f45362j = new a(this);
        }
        ((TuxStatusView) findViewById(R.id.e_o)).setStatus(b2);
        findViewById(R.id.a7h).setOnClickListener(new b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", false);
    }
}
