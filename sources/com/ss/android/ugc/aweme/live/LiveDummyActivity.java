package com.ss.android.ugc.aweme.live;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.container.g.b;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.b.d;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gw;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class LiveDummyActivity extends a implements c, i, j {

    /* renamed from: a  reason: collision with root package name */
    private d f108054a;

    /* renamed from: b  reason: collision with root package name */
    private b f108055b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.b.a f108056c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f108057d;

    /* renamed from: e  reason: collision with root package name */
    private View f108058e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f108059f;

    /* renamed from: g  reason: collision with root package name */
    private long f108060g = -1;

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new g(LiveDummyActivity.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(27, new g(LiveDummyActivity.class, "onEvent", com.bytedance.android.livesdkapi.n.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(69288);
        com.bytedance.l.a.a();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        if (gb.a(this)) {
            overridePendingTransition(R.anim.cs, R.anim.cu);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.bytedance.android.livesdkapi.b.a aVar = this.f108056c;
        if (aVar == null || !aVar.a("swipe")) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = this.f108057d;
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(-1);
        }
        if (this.f108059f) {
            ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).addLiveDuration(SystemClock.elapsedRealtime() - this.f108060g);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", true);
        super.onResume();
        this.f108057d = com.bytedance.ies.dmt.ui.f.a.f33482a;
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(2);
        }
        if (this.f108059f) {
            this.f108060g = SystemClock.elapsedRealtime();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (!isDestroyed() && TextUtils.equals("live_event", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f108058e, jVar);
        }
    }

    @Override // androidx.core.app.d, androidx.appcompat.app.d
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.bytedance.android.livesdkapi.b.a aVar;
        b bVar = this.f108055b;
        if (bVar != null && bVar.a(keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (aVar = this.f108056c) == null || !aVar.a("hardware_back_press")) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @r
    public void onEvent(final com.bytedance.android.livesdkapi.n.a aVar) {
        com.bytedance.android.livesdkapi.depend.d.b.d dVar = new com.bytedance.android.livesdkapi.depend.d.b.d();
        dVar.a(aVar.f23295c);
        LiveOuterService.s().d().a(this, new com.bytedance.android.livesdkapi.depend.d.b.b() {
            /* class com.ss.android.ugc.aweme.live.LiveDummyActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69289);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.b
            public final void a(int i2, int i3, String str) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.b
            public final void a(long j2) {
                aVar.f23293a.a();
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.b
            public final void a(Exception exc, String str) {
                aVar.f23293a.b();
            }
        }, aVar.f23294b, dVar).showNow(getSupportFragmentManager(), getClass().getSimpleName());
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        Fragment a2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", true);
        activityConfiguration(y.f108631a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.base.a.c.a(this, 0);
        setContentView(R.layout.ajz);
        this.f108058e = findViewById(R.id.b94);
        getWindow().getDecorView().setBackgroundColor(androidx.core.content.b.c(this, R.color.f159928l));
        getWindow().setSoftInputMode(18);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        if (intExtra == 1) {
            Bundle a3 = a(intent);
            com.bytedance.android.livesdkapi.service.d a4 = f.a();
            if (a4 != null) {
                gw.a().a(a3.getString("url"));
                d b2 = a4.b(a3);
                this.f108054a = b2;
                Fragment a5 = b2.a();
                this.f108056c = (com.bytedance.android.livesdkapi.b.a) a5;
                a3.putBoolean("is_dummy_host", true);
                a5.setArguments(a3);
                getSupportFragmentManager().a().a(R.id.b94, a5).c();
            }
        } else if (intExtra == 2) {
            Bundle a6 = a(intent);
            com.bytedance.android.livesdkapi.service.d a7 = f.a();
            if (a7 != null) {
                Fragment a8 = a7.a(this, a6);
                a8.setArguments(a6);
                getSupportFragmentManager().a().a(R.id.b94, a8).b();
            }
        } else if (intExtra == 3) {
            Bundle a9 = a(intent);
            com.bytedance.android.livesdkapi.service.d a10 = f.a();
            if (a10 != null) {
                getSupportFragmentManager().a().a(R.id.b94, a10.b(this, a9)).b();
            }
        } else if (intExtra == 4) {
            Bundle a11 = a(intent);
            com.bytedance.android.livesdkapi.service.d a12 = f.a();
            if (a12 != null) {
                Fragment c2 = a12.c(this, a11);
                if (c2 instanceof com.bytedance.android.livesdkapi.b.a) {
                    this.f108056c = (com.bytedance.android.livesdkapi.b.a) c2;
                }
                a11.putBoolean("is_dummy_host", true);
                c2.setArguments(a11);
                getSupportFragmentManager().a().a(R.id.b94, c2).c();
            }
        } else if (intExtra == 5) {
            Uri uri = (Uri) a(intent).getParcelable("bundle_uri");
            String queryParameter = uri.getQueryParameter("url");
            if (queryParameter == null || !queryParameter.contains("fe_tiktok_ecommerce_shop_cart")) {
                z = false;
            }
            this.f108059f = z;
            com.bytedance.android.livesdkapi.service.d a13 = f.a();
            if (!(a13 == null || (a2 = a13.a(uri, this)) == null)) {
                if (a2 instanceof b) {
                    this.f108055b = (b) a2;
                }
                this.f108058e.setFitsSystemWindows(false);
                getSupportFragmentManager().a().a(R.id.b94, a2).c();
            }
        } else {
            finish();
        }
        if (gb.a(this)) {
            overridePendingTransition(R.anim.cr, R.anim.ct);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }
}
