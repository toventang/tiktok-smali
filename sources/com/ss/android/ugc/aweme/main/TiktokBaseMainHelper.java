package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieSyncManager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.tux.g.b;
import com.ss.android.e.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.List;

public abstract class TiktokBaseMainHelper implements m {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f109123a;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f109124b;

    /* renamed from: c  reason: collision with root package name */
    protected NotificationManager f109125c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f109126d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f109127e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f109128f;

    /* renamed from: g  reason: collision with root package name */
    protected final Handler f109129g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    protected long f109130h = 0;

    static {
        Covode.recordClassIndex(69878);
    }

    /* access modifiers changed from: package-private */
    public class AppStartJobTask implements w {
        static {
            Covode.recordClassIndex(69879);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            if (((Boolean) m.f107602j.getValue()).booleanValue()) {
                return ae.APP_BACKGROUND;
            }
            return ae.BOOT_FINISH;
        }

        private AppStartJobTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            new a(TiktokBaseMainHelper.this.f109124b).b();
            IMService.createIIMServicebyMonsterPlugin(false);
        }

        /* synthetic */ AppStartJobTask(TiktokBaseMainHelper tiktokBaseMainHelper, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.m
    public void a() {
        BusinessComponentServiceUtils.getMainHelperService().a();
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable unused) {
        }
        this.f109128f = true;
        this.f109124b.finish();
    }

    public final void c() {
        if (!this.f109126d && !this.f109127e) {
            new f.c().b((w) new AppStartJobTask(this, (byte) 0)).a();
        }
    }

    public final boolean d() {
        if (f109123a) {
            a();
            return true;
        } else if (System.currentTimeMillis() - this.f109130h <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            a();
            this.f109130h = 0;
            return true;
        } else {
            this.f109130h = System.currentTimeMillis();
            new b(this.f109124b).e(R.string.a2i).b();
            return false;
        }
    }

    protected TiktokBaseMainHelper(Activity activity) {
        this.f109124b = activity;
        this.f109125c = (NotificationManager) a(activity, "notification");
        this.f109126d = false;
        this.f109127e = false;
    }

    private static Object a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!i.f107219a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
