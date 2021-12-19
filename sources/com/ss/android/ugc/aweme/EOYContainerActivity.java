package com.ss.android.ugc.aweme;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.al.f;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.view.EOYPlayer;
import com.ss.android.ugc.aweme.view.NestedScrollUIList;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class EOYContainerActivity extends BulletContainerActivity implements i, j {

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f62391m;

    static {
        Covode.recordClassIndex(38350);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final View a(int i2) {
        if (this.f62391m == null) {
            this.f62391m = new SparseArray();
        }
        View view = (View) this.f62391m.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62391m.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(382, new g(EOYContainerActivity.class, "onLoginEvent", f.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
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

    public static final class b extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(38352);
        }

        b(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new NestedScrollUIList(jVar);
        }
    }

    public static final class c extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(38353);
        }

        c(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new EOYPlayer(jVar);
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onLoginEvent(f fVar) {
        l.d(fVar, "");
        com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("login", System.currentTimeMillis(), null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.EOYContainerActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class a implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EOYContainerActivity f62392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f62393b;

        static {
            Covode.recordClassIndex(38351);
        }

        a(EOYContainerActivity eOYContainerActivity, Map map) {
            this.f62392a = eOYContainerActivity;
            this.f62393b = map;
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.a
        public final Typeface a(String str, int i2) {
            String str2;
            if (p.a((CharSequence) "Proxima Nova", (CharSequence) str, false)) {
                str2 = (String) this.f62393b.get("ProximaNova-Reg");
            } else {
                if (p.a((CharSequence) "ProximaNova-Regular", (CharSequence) str, false)) {
                    str2 = (String) this.f62393b.get("ProximaNova-Reg");
                }
                return null;
            }
            if (str2 != null) {
                return com.lynx.tasm.behavior.shadow.text.r.a(this.f62392a.getAssets(), str2, i2, "font/");
            }
            return null;
        }
    }
}
