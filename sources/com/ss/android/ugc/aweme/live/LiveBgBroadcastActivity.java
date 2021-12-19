package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.n;
import com.bytedance.android.live.n.j;
import com.bytedance.android.livesdk.j.bd;
import com.bytedance.android.livesdkapi.depend.model.a.a;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

public class LiveBgBroadcastActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    public a f108036a;

    /* renamed from: b  reason: collision with root package name */
    public j f108037b;

    /* renamed from: c  reason: collision with root package name */
    b f108038c = new b() {
        /* class com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69280);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(BroadcastReceiver broadcastReceiver) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(Bundle bundle) {
            LiveBgBroadcastActivity.this.f108037b = Live.getService().a(bundle);
            LiveBgBroadcastActivity.this.getSupportFragmentManager().a().b(R.id.b94, LiveBgBroadcastActivity.this.f108037b.a()).e();
            LiveBgBroadcastActivity.this.f108036a = null;
        }
    };

    static {
        Covode.recordClassIndex(69279);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        a aVar = this.f108036a;
        if (aVar != null) {
            aVar.a();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        a aVar = this.f108036a;
        if (aVar == null || !aVar.b()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        Live.getService().a((Activity) null);
        ((h.f.a.b) DataChannelGlobal.f34575d.b(bd.class)).invoke(0);
        this.f108038c = null;
        Live.getService().g().b(hashCode());
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.ss.android.ugc.aweme.live.f.b.a(this, intent);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        ((h.f.a.b) DataChannelGlobal.f34575d.b(bd.class)).invoke(2);
        setContentView(R.layout.ajj);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = a(getIntent());
        }
        n a2 = getSupportFragmentManager().a();
        Live.getService().g().a(hashCode(), this);
        a b2 = Live.getService().b(this.f108038c, bundle2);
        this.f108036a = b2;
        a2.b(R.id.b94, b2.c());
        a2.b();
        Live.getService().a((Activity) this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }
}
