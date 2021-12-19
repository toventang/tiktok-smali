package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.n;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptRoomNetUnavailable;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.q;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.c;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.l.b.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.base.a.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.ab;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.live.ad;
import com.ss.android.ugc.aweme.live.g.e;
import com.ss.android.ugc.aweme.live.h.a;
import com.ss.android.ugc.aweme.main.bc;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class LivePlayActivity extends a implements q, c, com.bytedance.android.livesdkapi.g.c, f, i, j {

    /* renamed from: g  reason: collision with root package name */
    private static long f108076g;

    /* renamed from: a  reason: collision with root package name */
    public e.a f108077a = new e.a();

    /* renamed from: b  reason: collision with root package name */
    private Rect f108078b;

    /* renamed from: c  reason: collision with root package name */
    private h f108079c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f108080d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f108081e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f108082f = false;

    /* renamed from: h  reason: collision with root package name */
    private a f108083h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f108084i = false;

    /* renamed from: j  reason: collision with root package name */
    private b f108085j = null;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.livesdk.watch.b f108086k;

    static {
        Covode.recordClassIndex(69298);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.live.a
    public final int e() {
        return 0;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new g(LivePlayActivity.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(43, new g(LivePlayActivity.class, "onEvent", com.ss.android.sdk.a.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.android.livesdk.q
    public final com.bytedance.android.livesdk.watch.b a() {
        return this.f108086k;
    }

    @Override // com.bytedance.android.livesdkapi.c
    public final void c() {
        a aVar = this.f108083h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bytedance.android.livesdkapi.c
    public final void d() {
        a aVar = this.f108083h;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        h hVar = this.f108079c;
        if (hVar != null) {
            hVar.s();
        }
    }

    private static boolean j() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean i2 = i();
        com.ss.android.ugc.aweme.lancet.j.f107226e = i2;
        return i2;
    }

    public final void g() {
        if (!this.f108080d) {
            k();
            super.finish();
            return;
        }
        com.ss.android.ugc.aweme.live.g.a.a(findViewById(R.id.dqk), this.f108078b, new am(this));
    }

    private void k() {
        if (getIntent() != null) {
            long longExtra = getIntent().getLongExtra("current_room_id", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
            if (longExtra > 0 && booleanExtra) {
                LiveHostOuterService.q().a(longExtra);
            }
        }
    }

    private static boolean l() {
        EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
        if (!in.d() && !in.f()) {
            return false;
        }
        String str = enterRoomConfig.f23299c.L;
        String str2 = enterRoomConfig.f23299c.L;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("enter_method", str2);
        a.C0976a.f39760a.a("ttlive_minor_mode_live", 1, hashMap);
        return true;
    }

    @Override // com.bytedance.android.livesdk.q
    public final void b() {
        if (!LiveDrawerVersion.INSTANCE.getValue() && this.f108086k == null) {
            n a2 = getSupportFragmentManager().a();
            com.bytedance.android.livesdk.watch.b a3 = com.bytedance.android.livesdkapi.f.a().a((FullDraggableContainer) findViewById(R.id.dqk), new Bundle());
            this.f108086k = a3;
            a2.a(R.id.cdk, a3.b()).c();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.bytedance.android.livesdk.watch.b bVar = this.f108086k;
        if (bVar == null || !bVar.c()) {
            h hVar = this.f108079c;
            if (hVar != null && (hVar.b() instanceof com.bytedance.android.livesdkapi.view.b) && !((com.bytedance.android.livesdkapi.view.b) this.f108079c.b()).g()) {
                super.onBackPressed();
                return;
            }
            return;
        }
        com.bytedance.android.b.a.a.f6785g.f6789c = "close_btn";
        this.f108086k.a(false, true);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.bytedance.android.b.a();
        com.bytedance.android.b.a.a aVar = com.bytedance.android.b.a.a.f6785g;
        aVar.f6788b = null;
        aVar.f6791e = 0;
        aVar.f6787a = 0;
        aVar.a().clear();
        aVar.b().clear();
        aVar.f6789c = "scroll";
        aVar.f6790d = "drawer";
        aVar.f6792f = 0;
        Live.getService().y();
        com.bytedance.android.live.l.a x = Live.getService().x();
        if (x != null) {
            x.b(false);
        }
        String a2 = a(getIntent(), "player_tag");
        if (!(a2 == null || Live.getService() == null)) {
            Live.getService().d(a2);
        }
        Live.getService().g().b(hashCode());
        if (this.f108079c == null) {
            f.a.f23366a.a().a(new Event("liveplay_activity_ondestory", 33814, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall));
        }
        if (this.f108084i) {
            com.ss.android.ugc.d.a.c.a(new ab(true));
        }
        com.bytedance.android.livesdkapi.depend.model.live.f.f23135a = null;
        com.bytedance.android.livesdk.watch.c b2 = Live.getService().b();
        if (b2 != null) {
            b2.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    @Override // com.bytedance.ies.foundation.activity.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LivePlayActivity.finish():void");
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public void setActivityResultListener(b bVar) {
        this.f108085j = bVar;
    }

    @r
    public void onEvent(com.ss.android.sdk.a.a aVar) {
        if (Live.getService() != null) {
            Live.getService().n();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        f.a.f23366a.a(bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        if (bundle != null) {
            bundle.putString("enter_room_session_id", fVar.f23364a);
            bundle.putParcelable("enter_room_session", fVar.a());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, android.view.ContextThemeWrapper, androidx.appcompat.app.d, android.app.Activity
    public void setTheme(int i2) {
        if (getIntent().getBooleanExtra("smooth_enter_room", false)) {
            super.setTheme(R.style.zl);
        } else {
            super.setTheme(R.style.zm);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        h hVar;
        boolean z;
        com.bytedance.android.livesdk.watch.b bVar;
        super.onNewIntent(intent);
        if (intent != null) {
            Event event = new Event("live_play_create_room_fg", 2820, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
            event.a("onNewIntent");
            f.a.f23366a.a().a(event);
            h hVar2 = this.f108079c;
            if (hVar2 == null || hVar2.c() == null) {
                hVar = null;
                z = false;
            } else {
                EnterRoomConfig w = this.f108079c.c().w();
                if (w == null) {
                    z = false;
                } else {
                    z = w.f23299c.O;
                }
                hVar = this.f108079c;
                if (!(hVar instanceof h)) {
                    hVar = null;
                }
            }
            EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
            long longExtra = intent.getLongExtra("room_id", 0);
            if (longExtra != -3) {
                if (longExtra == -4) {
                    if (!(getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3)) {
                        com.ss.android.ugc.aweme.live.h.a aVar = this.f108083h;
                        if (aVar == null) {
                            return;
                        }
                        if (!aVar.f108423c && !aVar.f108424d) {
                            return;
                        }
                    }
                    finish();
                    return;
                }
                if (getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3) {
                    setIntent(intent);
                } else {
                    this.f108083h = null;
                }
                if (z && ("push".equals(enterRoomConfig.f23299c.J) || "push".equals(enterRoomConfig.f23299c.L))) {
                    enterRoomConfig.f23299c.O = true;
                }
                enterRoomConfig.f23299c.R = longExtra;
                enterRoomConfig.f23299c.af.f23351a = f108076g;
                String a2 = a(intent, "player_tag");
                if (a2 != null) {
                    enterRoomConfig.f23299c.E = a2;
                }
                this.f108079c = Live.getService().a(enterRoomConfig);
                if (hVar != null) {
                    hVar.a(enterRoomConfig);
                }
                n a3 = getSupportFragmentManager().a();
                a3.b(R.id.b94, this.f108079c.b());
                a3.b();
                if (!LiveDrawerVersion.INSTANCE.getValue() && f.a.f23366a.a().f23354b.f23299c.aB == 1 && LiveDrawerSettings.INSTANCE.getValue().openDrawerReturn() && (bVar = this.f108086k) != null) {
                    bVar.a(true, false);
                }
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", true);
        if (bundle != null && bundle.containsKey("enter_room_session")) {
            f.a.f23366a.a(bundle);
        }
        com.bytedance.android.b.a(this);
        ad.a.f108097a.a((Context) this);
        Live.getService().a(this, 4);
        activityConfiguration(al.f108106a);
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("room_id", 0);
        super.onCreate(bundle);
        EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
        this.f108082f = TextUtils.equals("live_square", enterRoomConfig.f23299c.N);
        this.f108078b = enterRoomConfig.f23299c.G;
        this.f108081e = TextUtils.equals(enterRoomConfig.f23299c.J, "push");
        boolean z = enterRoomConfig.f23300d.f23303a;
        this.f108084i = z;
        if (z) {
            overridePendingTransition(0, 0);
        } else if (this.f108078b == null || !this.f108080d) {
            try {
                com.bytedance.android.livesdkapi.m.c.a(this, "convertFromTranslucent");
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.framework.a.a.a(th);
            }
            overridePendingTransition(R.anim.dq, R.anim.dv);
        } else {
            overridePendingTransition(0, 0);
        }
        String a2 = a(getIntent(), "schema");
        if (!TextUtils.isEmpty(a2)) {
            enterRoomConfig.f23299c.aF = a2;
        }
        View decorView = getWindow().getDecorView();
        if (decorView != null && this.f108084i) {
            decorView.setBackgroundColor(0);
            getWindow().setBackgroundDrawable(null);
        }
        setContentView(R.layout.ajm);
        if (this.f108080d && this.f108078b != null) {
            View findViewById = findViewById(R.id.dqk);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(findViewById, this.f108078b, new View[0]) {
                /* class com.ss.android.ugc.aweme.live.g.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View f108412a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Rect f108413b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ View[] f108414c;

                static {
                    Covode.recordClassIndex(69460);
                }

                public final void onGlobalLayout() {
                    this.f108412a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.f108412a.setPivotX((float) this.f108413b.centerX());
                    this.f108412a.setPivotY((float) this.f108413b.centerY());
                    this.f108412a.setScaleX(0.0f);
                    this.f108412a.setScaleY(0.0f);
                    this.f108412a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(b.f108415a).start();
                    View[] viewArr = this.f108414c;
                    if (!(viewArr == null || viewArr.length == 0)) {
                        for (View view : viewArr) {
                            Rect rect = new Rect();
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                rect.left = iArr[0];
                                rect.top = iArr[1];
                                rect.right = iArr[0] + view.getMeasuredWidth();
                                rect.bottom = iArr[1] + view.getMeasuredHeight();
                                view.setTranslationX((float) (this.f108413b.left - rect.left));
                                view.setTranslationY((float) (this.f108413b.top - rect.top));
                                view.setPivotX(0.0f);
                                view.setPivotY(0.0f);
                                view.setScaleX(((float) this.f108413b.width()) / ((float) view.getWidth()));
                                view.setScaleY(((float) this.f108413b.height()) / ((float) view.getHeight()));
                                view.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200).start();
                            }
                        }
                    }
                }

                {
                    this.f108412a = r1;
                    this.f108413b = r2;
                    this.f108414c = r3;
                }
            });
        }
        getWindow().setSoftInputMode(48);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT != 19 && !com.ss.android.ugc.aweme.app.b.a.a(this)) {
            LiveHostOuterService.q().a((Activity) this);
        }
        int i3 = Build.VERSION.SDK_INT;
        View decorView2 = getWindow().getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 1280);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        com.bytedance.android.live.l.a x = Live.getService().x();
        if (x != null) {
            x.a(false);
        }
        Live.getService().g().a(hashCode(), this);
        if (longExtra == -3) {
            com.ss.android.ugc.aweme.live.h.a aVar = new com.ss.android.ugc.aweme.live.h.a(this);
            this.f108083h = aVar;
            if (aVar.f108426f != null) {
                aVar.f108426f.setVisibility(0);
            }
            View view = aVar.f108425e;
            if (aVar.f108423c) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            com.bytedance.common.utility.n.a(view, i2);
            long j2 = f.a.f23366a.a().f23354b.f23299c.u;
            if (j2 > 0) {
                f.a.f23366a.a().f23354b.f23299c.u = 0;
                aVar.f108427g = SystemClock.elapsedRealtime() - j2;
            }
            com.ss.android.ugc.aweme.live.h.a aVar2 = this.f108083h;
            if (aVar2.f108424d && aVar2.f108421a != null) {
                com.bytedance.common.utility.n.a(aVar2.f108422b, 0);
            }
        } else {
            c();
            d();
            f.a.f23366a.a().a(new Event("live_play_create_room_fg", 2819, com.bytedance.android.livesdkapi.session.b.BussinessApiCall).a("onCreate"));
            f();
            n a3 = getSupportFragmentManager().a();
            EnterRoomConfig enterRoomConfig2 = f.a.f23366a.a().f23354b;
            enterRoomConfig2.f23299c.R = longExtra;
            enterRoomConfig2.f23299c.af.f23351a = f108076g;
            String a4 = a(intent, "player_tag");
            if (a4 != null) {
                enterRoomConfig2.f23299c.E = a4;
            }
            h a5 = Live.getService().a(enterRoomConfig2);
            this.f108079c = a5;
            a3.a(R.id.b94, a5.b());
            a3.b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static Object a(LivePlayActivity livePlayActivity, String str) {
        Object obj;
        MethodCollector.i(9961);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = livePlayActivity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = livePlayActivity.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = livePlayActivity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(9961);
                }
            }
        } else {
            obj = livePlayActivity.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, EnterRoomConfig enterRoomConfig) {
        if (!LiveOptRoomNetUnavailable.INSTANCE.isEnable() || j()) {
            if (!LivePerformanceManager.getInstance().hasInitValue()) {
                com.bytedance.android.live.u.h.a(ak.f108105a);
            }
            f.a.f23366a.a().a(new Event("create_live_play_activity", 2817, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
            if (l()) {
                f.a.f23366a.a().a(new Event("ttlive_minor_mode_live", 35584, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall).a("is ftc mode , can not watch live"));
                return;
            }
            long j2 = enterRoomConfig.f23299c.R;
            f108076g = System.currentTimeMillis();
            LiveHostOuterService.q();
            Intent intent = new Intent(context, LivePlayActivity.class);
            intent.putExtra("room_id", j2);
            intent.putExtra("smooth_enter_room", enterRoomConfig.f23300d.f23303a);
            intent.putExtra("backurl", enterRoomConfig.f23299c.T);
            int i2 = enterRoomConfig.f23299c.t;
            if (i2 >= 0) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", bc.a(Integer.valueOf(i2)));
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            f.a.f23366a.a().a(new Event("warm_up_player", 2818, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall).a("room player warm up.").a());
            if (enterRoomConfig.f23297a.f23347k) {
                enterRoomConfig.f23297a = new EnterRoomConfig.StreamData();
                enterRoomConfig.f23297a.f23347k = true;
            }
            String a2 = Live.getService().a(j2, enterRoomConfig, context);
            if (a2 != null) {
                intent.putExtra("player_tag", a2);
                if (enterRoomConfig.f23297a.f23337a) {
                    enterRoomConfig.f23299c.f23323b = Live.getService().a(a2, context);
                }
            }
            com.bytedance.android.livesdk.watch.c b2 = Live.getService().b();
            if (b2 != null) {
                b2.a(enterRoomConfig);
            }
            a(context, intent);
            return;
        }
        ao.a(y.e(), (int) R.string.gm8);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        b bVar = this.f108085j;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }
}
