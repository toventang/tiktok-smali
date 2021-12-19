package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.adaptation.b;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.publish.ac;
import com.ss.android.ugc.aweme.sticker.text.c;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;

public class DraftBoxActivity extends b {

    /* renamed from: d  reason: collision with root package name */
    private x f139329d;

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(91082);
        com.ss.android.ugc.aweme.sticker.text.b.a();
        c.a();
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        x xVar = this.f139329d;
        if (xVar != null) {
            xVar.b();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
        AVCommerceServiceImpl.h().c();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
        g.a().o().g().a();
    }

    private static x h() {
        if (g.a().A().a()) {
            return new com.ss.android.ugc.aweme.tools.draft.ftc.pages.g();
        }
        if (bc.a()) {
            return new at();
        }
        return new z();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        x xVar = (x) getSupportFragmentManager().a(R.id.b94);
        this.f139329d = xVar;
        if (xVar == null) {
            this.f139329d = h();
            if (getIntent() != null) {
                this.f139329d.setArguments(a(getIntent()));
            }
            getSupportFragmentManager().a().a(R.id.b94, this.f139329d).c();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public void onStop() {
        a.d(this);
        g.a().o().g().c();
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            a(context, new Intent(context, DraftBoxActivity.class));
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.br);
        cr.a().d();
        if (g.a().b().a(this) == 0) {
            g();
        } else {
            g.a().b().a(this, new y(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
        TTUploaderService.c();
        ac.a();
        g.a().o().a();
        g.a().o().p().a();
        AVCommerceServiceImpl.h().a((int) r.a(this, 15.0f));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, DraftBoxActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            a(context, intent);
        }
    }
}
