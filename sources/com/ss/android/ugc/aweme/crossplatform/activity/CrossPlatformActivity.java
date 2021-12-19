package com.ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.sdk.webview.q;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.commercialize.utils.l;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.a.d;
import com.ss.android.ugc.aweme.crossplatform.b.d;
import com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout;
import com.ss.android.ugc.aweme.framework.d.c;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.utils.gw;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class CrossPlatformActivity extends com.bytedance.ies.foundation.activity.a implements f, com.ss.android.ugc.aweme.base.a.f, i, j {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f78495b = true;

    /* renamed from: c  reason: collision with root package name */
    public static long f78496c;

    /* renamed from: a  reason: collision with root package name */
    public AbsActivityContainer f78497a;

    /* renamed from: d  reason: collision with root package name */
    public a f78498d;

    /* renamed from: e  reason: collision with root package name */
    boolean f78499e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f78500f;

    /* renamed from: g  reason: collision with root package name */
    private b f78501g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f78502h = true;

    /* renamed from: i  reason: collision with root package name */
    private c f78503i;

    /* renamed from: j  reason: collision with root package name */
    private long f78504j;

    public interface a {
        static {
            Covode.recordClassIndex(48761);
        }

        boolean a();
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(273, new g(CrossPlatformActivity.class, "onEvent", com.ss.android.ugc.aweme.al.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void dismissCustomToast() {
        c cVar = this.f78503i;
        if (cVar != null) {
            cVar.c();
        }
    }

    static {
        Covode.recordClassIndex(48760);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        c cVar = this.f78503i;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        super.onResume();
        c cVar = this.f78503i;
        if (cVar != null) {
            cVar.f96684f = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    private boolean a() {
        if (isDestroyed()) {
            return false;
        }
        if (this.f78503i != null) {
            return true;
        }
        c cVar = new c(this);
        this.f78503i = cVar;
        cVar.f96685g = false;
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        if (this.f78497a != null && this.f78502h) {
            this.f78499e = true;
            a aVar = this.f78498d;
            if (aVar == null || !aVar.a()) {
                this.f78497a.b();
            }
            com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2 = this.f78500f;
            if (aVar2 != null) {
                String str = aVar2.f78741a.f78730c;
                if (!TextUtils.isEmpty(str)) {
                    SpecActServiceImpl.i().c(str);
                }
            }
        }
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

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        if (this.f78502h) {
            l.a(this);
            super.finish();
            com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78500f;
            if (aVar == null || !aVar.f78744d.n) {
                com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2 = this.f78500f;
                if (aVar2 == null || !aVar2.f78744d.f78793a) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                        super.overridePendingTransition(R.anim.dq, R.anim.dv);
                    } else {
                        super.overridePendingTransition(R.anim.f354do, R.anim.dx);
                    }
                } else if (this.f78499e) {
                    super.overridePendingTransition(0, R.anim.ah);
                } else {
                    super.overridePendingTransition(0, 0);
                }
            } else {
                super.overridePendingTransition(0, R.anim.ah);
            }
            AbsActivityContainer absActivityContainer = this.f78497a;
            if (absActivityContainer != null) {
                absActivityContainer.j();
            }
            ay.f75622a = null;
            EventBus.a().b(com.ss.android.ugc.aweme.ug.a.class);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        String str;
        MethodCollector.i(10389);
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f78504j = System.currentTimeMillis() - this.f78504j;
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.crossplatform.b.b(Long.valueOf(this.f78504j)));
        com.ss.android.ugc.d.a.c.a(new d(this.f78504j));
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78500f;
        if (!(aVar == null || aVar.f78741a == null)) {
            q a2 = q.a();
            String a3 = q.a(this.f78500f.f78741a.f78730c);
            if (a3 != null) {
                a2.f60252a.remove(a3);
            }
        }
        v a4 = v.a();
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2 = this.f78500f;
        if (aVar2 != null) {
            String str2 = aVar2.f78741a.f78730c;
            if (!TextUtils.isEmpty(str2)) {
                synchronized (a4.f78581e) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23 && !a4.a(str2) && a4.f78577a.size() < a4.f78580d) {
                            com.bytedance.ies.ugc.appcontext.d.a().getMainLooper().getQueue().addIdleHandler(new x(a4));
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(10389);
                        throw th;
                    }
                }
            }
        }
        super.onDestroy();
        c cVar = this.f78503i;
        if (cVar != null) {
            cVar.a();
        }
        String str3 = null;
        if (com.ss.android.ugc.aweme.favorites.j.d.f90679a != null) {
            com.ss.android.ugc.aweme.favorites.j.d.f90679a = null;
        }
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar3 = this.f78500f;
        if (aVar3 == null || aVar3.f78741a == null) {
            str = null;
        } else {
            str3 = this.f78500f.f78741a.f78730c;
            str = this.f78500f.f78741a.f78737j;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.b(2, str3, str));
        EventBus.a().b(this);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str3);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("ad_webview_close", System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(hashMap)));
        if (this.f78500f.f78745e.f78808c != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f78500f.f78745e.f78808c);
                jSONObject.put("duration", System.currentTimeMillis() - f78496c);
                r.a("anchor_stay_time", jSONObject);
                MethodCollector.o(10389);
                return;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.o(10389);
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.al.c cVar) {
        finish();
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public void setActivityResultListener(b bVar) {
        this.f78501g = bVar;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        d.a.f78490a.a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbsActivityContainer absActivityContainer = this.f78497a;
        if (absActivityContainer != null) {
            absActivityContainer.a(configuration);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(String str) {
        if (a()) {
            this.f78503i.a(str);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65563i = true;
        activityConfiguration(new f(xVar));
        f78496c = System.currentTimeMillis();
        super.onCreate(bundle);
        AbsActivityContainer absActivityContainer = this.f78497a;
        if (absActivityContainer != null) {
            absActivityContainer.c();
        }
        Intent intent = getIntent();
        intent.putExtra("webview_progress_bar", com.ss.android.ugc.aweme.crossplatform.a.a.a(a(intent)));
        com.ss.android.ugc.aweme.crossplatform.d.a.a a2 = a.C1829a.a(intent);
        this.f78500f = a2;
        if (a2 != null) {
            String str2 = a2.f78741a.f78730c;
            if (!TextUtils.isEmpty(str2) && str2.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                try {
                    a2.f78741a.f78730c = Uri.parse(str2).buildUpon().appendQueryParameter("webview_created_timestamp", String.valueOf(f78496c)).build().toString();
                } catch (Throwable unused) {
                }
            }
        }
        Uri data = intent.getData();
        if (this.f78500f.f78741a.f78728a.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (data == null || data.isOpaque() || (!z && !TextUtils.equals("bullet", data.getQueryParameter("hybrid_sdk_version")))) {
            this.f78502h = getIntent().getBooleanExtra("key_support_back", true);
            Uri data2 = getIntent().getData();
            com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78500f;
            if (!(aVar == null || aVar.f78741a.f78730c == null)) {
                data2 = Uri.parse(this.f78500f.f78741a.f78730c);
            }
            if (data2 != null && ((data2.toString().startsWith("http") || data2.toString().startsWith("https")) && TextUtils.equals(data2.getQueryParameter("__live_platform__"), "webcast"))) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("bundle_no_hw_acceleration", this.f78500f.f78741a.f78739l);
                bundle2.putBoolean("hide_nav_bar", this.f78500f.f78744d.t);
                bundle2.putBoolean("hide_status_bar", this.f78500f.f78744d.u);
                bundle2.putBoolean("hide_more", !this.f78500f.f78744d.f78804l);
                bundle2.putInt("bundle_web_view_background_color", this.f78500f.f78744d.B);
                bundle2.putLong("ad_id", this.f78500f.f78742b.f78759a);
                bundle2.putString("title", this.f78500f.f78744d.f78797e);
                LiveOuterService.s().f().a(data2.toString(), bundle2, this);
                finish();
            }
            com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2 = this.f78500f;
            IMixActivityContainerProvider a3 = MixActivityContainerProvider.a();
            if (a3 != null) {
                this.f78497a = a3.a(this, aVar2);
            }
            if (this.f78497a == null) {
                this.f78497a = new MixActivityContainer(this, aVar2);
            }
            this.f78497a.a(new g(this));
            getLifecycle().a(this.f78497a);
            if (!this.f78497a.a()) {
                this.f78502h = true;
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
                return;
            }
            if (this.f78500f.f78744d.n) {
                super.overridePendingTransition(R.anim.cd, 0);
            } else if (this.f78500f.f78744d.f78793a) {
                super.overridePendingTransition(0, 0);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    super.overridePendingTransition(R.anim.f354do, R.anim.dx);
                } else {
                    super.overridePendingTransition(R.anim.dq, R.anim.dv);
                }
            }
            supportRequestWindowFeature(10);
            setContentView(R.layout.v1);
            new a(this);
            this.f78497a.a(a(getIntent()));
            this.f78497a.k();
            EventBus.a(EventBus.a(), this);
            if (this.f78500f.f78743c != null && TextUtils.equals("page_movie_detail", this.f78500f.f78743c.f78784e)) {
                com.ss.android.ugc.aweme.favorites.j.d.f90679a = new WeakReference<>(this.f78497a.f());
            }
            com.ss.android.ugc.aweme.crossplatform.d.a.a aVar3 = this.f78500f;
            String str3 = null;
            if (aVar3 == null || aVar3.f78741a == null) {
                str = null;
            } else {
                str3 = this.f78500f.f78741a.f78730c;
                str = this.f78500f.f78741a.f78737j;
            }
            q a4 = q.a();
            if (this.f78500f.f78742b.f78759a != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a4.a(z2, str3);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.b(1, str3, str));
            this.f78504j = System.currentTimeMillis();
            gw.a().a(data);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
            return;
        }
        BulletService.f().a(this, data.toString(), a(intent));
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.common.utility.f
    public void showCustomLongToast(int i2, String str) {
        if (a()) {
            this.f78503i.a(i2, str);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(int i2, String str) {
        if (a()) {
            this.f78503i.b(i2, str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        super.startActivity(intent, bundle);
        AbsActivityContainer absActivityContainer = this.f78497a;
        if (absActivityContainer != null) {
            absActivityContainer.i();
        }
    }

    private static void a(boolean z, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("webViewPoolIsCache", z);
            jSONObject.put("webViewPoolCostTime", j2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        o.b("service_monitor", "webview_pool_cache", jSONObject);
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        b bVar = this.f78501g;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
        AbsActivityContainer absActivityContainer = this.f78497a;
        if (absActivityContainer != null) {
            absActivityContainer.a(i2, i3, intent);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(String str, int i2, int i3) {
        if (a()) {
            this.f78503i.a(0, str, i2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.common.utility.f
    public void showCustomToast(int i2, String str, int i3, int i4) {
        if (a()) {
            this.f78503i.a(i2, str, i3);
        }
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout")) {
            WebViewFrameLayout webViewFrameLayout = new WebViewFrameLayout(context, attributeSet);
            SingleWebView a2 = v.a().a(this, this.f78500f);
            if (a2 != null) {
                webViewFrameLayout.setId(R.id.fma);
                webViewFrameLayout.addView(a2, new FrameLayout.LayoutParams(-1, -1));
                return webViewFrameLayout;
            }
        }
        if (!v.a().a(this.f78500f) || !TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout")) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        WebViewFrameLayout webViewFrameLayout2 = new WebViewFrameLayout(context, attributeSet);
        SingleWebView a3 = v.a().a(this);
        if (a3 == null) {
            a3 = new SingleWebView(this, attributeSet);
            a(false, SystemClock.uptimeMillis() - uptimeMillis);
        } else {
            a(true, SystemClock.uptimeMillis() - uptimeMillis);
        }
        webViewFrameLayout2.setId(R.id.fma);
        webViewFrameLayout2.addView(a3, new FrameLayout.LayoutParams(-1, -1));
        return webViewFrameLayout2;
    }
}
