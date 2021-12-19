package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.n;
import com.bytedance.android.livesdk.j.bd;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.tools.view.a.a;
import com.ss.android.ugc.tools.view.a.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class LiveBroadcastActivity extends a implements c, i, j {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.c f108040a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.n.j f108041b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f108042c = true;

    /* renamed from: d  reason: collision with root package name */
    b f108043d = new b() {
        /* class com.ss.android.ugc.aweme.live.LiveBroadcastActivity.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69282);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(BroadcastReceiver broadcastReceiver) {
            LiveBroadcastActivity.this.unregisterReceiver(broadcastReceiver);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(Bundle bundle) {
            if (LiveBroadcastActivity.this.f108042c.booleanValue()) {
                LiveBroadcastActivity.this.f108042c = false;
                LiveBroadcastActivity.this.f108041b = Live.getService().a(bundle);
                LiveBroadcastActivity.this.getSupportFragmentManager().a().b(R.id.b94, LiveBroadcastActivity.this.f108041b.a()).e();
            }
            LiveBroadcastActivity.this.f108040a = null;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.b
        public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            b(LiveBroadcastActivity.this, broadcastReceiver, intentFilter);
        }

        private static Intent a(LiveBroadcastActivity liveBroadcastActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return liveBroadcastActivity.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent b(com.ss.android.ugc.aweme.live.LiveBroadcastActivity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveBroadcastActivity.AnonymousClass1.b(com.ss.android.ugc.aweme.live.LiveBroadcastActivity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private final List<com.ss.android.ugc.tools.view.a.b> f108044e = new ArrayList();

    static {
        Covode.recordClassIndex(69281);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(a aVar) {
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(a aVar) {
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(a aVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.live.a
    public final int e() {
        return 1;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(43, new g(LiveBroadcastActivity.class, "onEvent", com.ss.android.sdk.a.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.bytedance.android.livesdkapi.depend.model.a.c cVar = this.f108040a;
        if (cVar == null || !cVar.j()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f108043d = null;
        Live.getService().a((Activity) null);
        ((h.f.a.b) DataChannelGlobal.f34575d.b(bd.class)).invoke(0);
        super.onDestroy();
        com.bytedance.android.live.l.a x = Live.getService().x();
        if (x != null) {
            x.b(true);
        }
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        this.f108044e.remove(bVar);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.ss.android.ugc.aweme.live.f.b.a(this, intent);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        this.f108044e.add(bVar);
    }

    @r
    public void onEvent(com.ss.android.sdk.a.a aVar) {
        if (Live.getService() != null) {
            Live.getService().n();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        activityConfiguration(u.f108627a);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        ((h.f.a.b) DataChannelGlobal.f34575d.b(bd.class)).invoke(1);
        super.onCreate(bundle);
        setContentView(R.layout.ajj);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        com.bytedance.android.live.l.a x = Live.getService().x();
        if (x != null) {
            x.a(true);
        }
        f();
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = a(getIntent());
        }
        com.bytedance.android.live.u.g.c(new v(this));
        this.f108040a = Live.getService().a(this.f108043d, bundle2);
        n a2 = getSupportFragmentManager().a();
        a2.b(R.id.b94, this.f108040a.g());
        a2.b();
        Live.getService().a((Activity) this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        for (com.ss.android.ugc.tools.view.a.b bVar : this.f108044e) {
            if (bVar.a(i2, i3, intent)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
    }
}
