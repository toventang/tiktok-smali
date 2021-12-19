package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ad.splash.j;
import com.ss.android.ad.splash.l;
import com.ss.android.ad.splash.q;
import com.ss.android.ad.splash.v;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class NormalSplashAdActivity extends com.bytedance.ies.foundation.activity.a implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f34850a = new b();

    /* renamed from: c  reason: collision with root package name */
    public static int f34851c;

    /* renamed from: b  reason: collision with root package name */
    Handler f34852b = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        v f34855a;

        /* renamed from: b  reason: collision with root package name */
        View f34856b;

        /* renamed from: c  reason: collision with root package name */
        a f34857c;

        static {
            Covode.recordClassIndex(20904);
        }

        b() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f34855a = null;
            this.f34856b = null;
            this.f34857c = null;
        }

        public final boolean a(Context context, v vVar, View view, a aVar) {
            this.f34855a = vVar;
            this.f34856b = view;
            this.f34857c = aVar;
            if (view == null) {
                a();
                return false;
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().k();
            Intent intent = new Intent(context, NormalSplashAdActivity.class);
            if (context instanceof Activity) {
                intent.putExtra("from", context.getClass().getName());
            } else {
                intent.addFlags(268435456);
            }
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return true;
        }
    }

    public static class a implements l {

        /* renamed from: a  reason: collision with root package name */
        NormalSplashAdActivity f34853a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34854b;

        static {
            Covode.recordClassIndex(20903);
        }

        /* synthetic */ a() {
            this(false);
        }

        private a(boolean z) {
            this.f34854b = false;
        }

        @Override // com.ss.android.ad.splash.l
        public final void a(j jVar) {
            c.a(new com.bytedance.ies.ugc.aweme.commercialize.splash.b.b());
            NormalSplashAdActivity normalSplashAdActivity = this.f34853a;
            if (normalSplashAdActivity != null) {
                NormalSplashAdActivity.f34851c = jVar.a();
                normalSplashAdActivity.finish();
                if (NormalSplashAdActivity.f34851c == 1 || NormalSplashAdActivity.f34851c == 4) {
                    com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "skip");
                } else if (NormalSplashAdActivity.f34851c == 3) {
                    com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "click");
                } else {
                    com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "finish");
                }
            }
        }

        @Override // com.ss.android.ad.splash.l
        public final void a(q qVar) {
            NormalSplashAdActivity normalSplashAdActivity = this.f34853a;
            if (normalSplashAdActivity != null) {
                com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "click");
                com.ss.android.ugc.aweme.framework.a.a.a(3, null, "openSplashScheme: from = SplashAdActivity");
                TroubleshootingLogDelegate.INSTANCE.ordinarySplashLog("Click to open the screen and hang up");
                g gVar = c.f34859a;
                if (qVar != null) {
                    List<q.b> list = qVar.f59012j;
                    if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        Iterator<q.b> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            q.b next = it.next();
                            if (next != null) {
                                String str = next.f59029a;
                                int i2 = next.f59030b;
                                if (!TextUtils.isEmpty(str)) {
                                    long j2 = qVar.f59003a;
                                    String str2 = qVar.f59005c;
                                    if (i2 == 1) {
                                        com.bytedance.ies.ugc.aweme.commercialize.splash.f.c.a(normalSplashAdActivity, str, Long.valueOf(j2), str2, gVar);
                                        break;
                                    } else if (i2 != 2) {
                                        if (m.a(str) || (!str.toLowerCase().startsWith("http://") && !str.toLowerCase().startsWith("https://"))) {
                                            com.bytedance.ies.ugc.aweme.commercialize.splash.f.c.a(normalSplashAdActivity, str, Long.valueOf(j2), str2, gVar);
                                        } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.c.a(normalSplashAdActivity, str, qVar.f59009g, Long.valueOf(j2), str2, (ag) GsonHolder.c().b().a(qVar.p, ag.class), qVar.q, qVar.r)) {
                                            break;
                                        }
                                    } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.c.a(normalSplashAdActivity, str, qVar.f59009g, Long.valueOf(j2), str2, (ag) GsonHolder.c().b().a(qVar.p, ag.class), qVar.q, qVar.r)) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (this.f34854b) {
                    long a2 = com.bytedance.ies.abmock.b.a().a(true, "splashad_finish_delay", 0L);
                    if (a2 > 0) {
                        normalSplashAdActivity.f34852b.postDelayed(new b(normalSplashAdActivity), a2);
                        return;
                    }
                }
                normalSplashAdActivity.finish();
            }
        }

        @Override // com.ss.android.ad.splash.l
        public final void a(long j2, String str) {
            long currentTimeMillis = System.currentTimeMillis() - com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().l();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("splash_ad", "first_view", String.valueOf(j2), str, "0").a("launchduration", Long.valueOf(currentTimeMillis)).b();
            com.ss.android.ugc.aweme.commercialize.util.b.a(currentTimeMillis, 2, System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(20902);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().j();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        Handler handler = this.f34852b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d = false;
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
        MethodCollector.i(6032);
        Log.getStackTraceString(new RuntimeException());
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34770e = false;
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34771f) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34771f = false;
            synchronized (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34772g) {
                try {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34772g.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.o(6032);
                    throw th;
                }
            }
        }
        super.finish();
        int i2 = f34851c;
        if (i2 == 4) {
            overridePendingTransition(0, R.anim.e2);
        } else if (i2 != 1) {
            int a2 = SettingsManager.a().a("splash_disappear_time", 0);
            if (a2 == 1) {
                overridePendingTransition(0, R.anim.e0);
            } else if (a2 == 2) {
                overridePendingTransition(0, R.anim.e1);
            } else {
                overridePendingTransition(0, 0);
            }
        } else {
            overridePendingTransition(0, 0);
        }
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d = false;
        MethodCollector.o(6032);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        MethodCollector.i(6021);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().i();
        try {
            setContentView(R.layout.bq);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
            b bVar = f34850a;
            View view = bVar.f34856b;
            a aVar = bVar.f34857c;
            if (aVar != null) {
                aVar.f34853a = this;
            }
            bVar.a();
            if (view != null) {
                o.a((Activity) this);
                view.setBackgroundResource(R.drawable.bk_);
                ((ViewGroup) findViewById(R.id.e8_)).addView(view);
            } else {
                if (getIntent() != null) {
                    a(getIntent(), "from");
                }
                finish();
                overridePendingTransition(0, 0);
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34770e = true;
            MethodCollector.o(6021);
            return;
        } catch (RuntimeException e2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e2.toString());
            com.bytedance.ies.android.base.runtime.a.f31873b.monitorCommonLog("splash_set_content_view", jSONObject);
        } catch (Throwable unused) {
        }
        f34850a.a();
        finish();
        MethodCollector.o(6021);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
