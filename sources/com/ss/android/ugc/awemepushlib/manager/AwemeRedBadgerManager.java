package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.w;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.message.a.a;
import com.ss.android.newmedia.redbadge.d;
import com.ss.android.newmedia.redbadge.e;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.I18nLancet;
import com.ss.android.ugc.awemepushlib.c.b;
import com.ss.android.ugc.awemepushlib.interaction.aa;
import org.json.JSONObject;

public class AwemeRedBadgerManager implements f {

    /* renamed from: b  reason: collision with root package name */
    public static AwemeRedBadgerManager f145477b = new AwemeRedBadgerManager();

    /* renamed from: a  reason: collision with root package name */
    e f145478a = e.a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f145479c = "oppo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: d  reason: collision with root package name */
    private boolean f145480d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f145481e;

    static {
        Covode.recordClassIndex(95130);
    }

    private static String b() {
        if (!TextUtils.isEmpty(I18nLancet.f107161a)) {
            return I18nLancet.f107161a;
        }
        String a2 = a.a();
        I18nLancet.f107161a = a2;
        return a2;
    }

    public AwemeRedBadgerManager() {
        boolean z;
        boolean equalsIgnoreCase = "vivo".equalsIgnoreCase(Build.BRAND);
        this.f145480d = equalsIgnoreCase;
        if (this.f145479c || equalsIgnoreCase) {
            z = true;
        } else {
            z = false;
        }
        this.f145481e = z;
    }

    public final void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            w.f3548i.getLifecycle().a(this);
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this));
        }
    }

    public final void b(Context context) {
        if (aa.f145425a == 0 || aa.f145425a == 2) {
            this.f145478a.a(context, 0);
        }
    }

    public static void a(Context context) {
        try {
            if (!m.a(AppLog.getClientId()) && !m.a(com.bytedance.ies.ugc.statisticlogger.a.a())) {
                com.ss.android.newmedia.redbadge.b.a.a(context).c(AppLog.getSessionKey());
                com.ss.android.newmedia.redbadge.b.a.a(context).d(b());
            }
        } catch (Throwable unused) {
        }
    }

    private static String c(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return "";
        }
        return resolveInfo.activityInfo.packageName;
    }

    private void a(Context context, int i2) {
        this.f145478a.b(context, i2);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95131);
                }

                public final void run() {
                    AwemeRedBadgerManager.this.b(com.ss.android.ugc.aweme.framework.d.a.f96678a);
                }
            });
        }
    }

    public static boolean a(JSONObject jSONObject, Context context) {
        boolean z;
        boolean z2;
        boolean a2 = com.ss.android.newmedia.redbadge.b.a.a(context).a();
        String b2 = com.ss.android.newmedia.redbadge.b.a.a(context).b();
        boolean z3 = true;
        if (jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (AccountService.a().e().isChildrenMode()) {
                z = false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (z != a2) {
            PushMultiProcessSharedProvider.a a3 = com.ss.android.newmedia.redbadge.b.a.a(context).f60017a.a();
            a3.f60120b.put("is_desktop_red_badge_show", Boolean.valueOf(z));
            a3.a();
            z2 = true;
        } else {
            z2 = false;
        }
        String optString = jSONObject.optString("desktop_red_badge_args", "");
        if (optString == null || optString.equals(b2)) {
            z3 = z2;
        } else {
            com.ss.android.newmedia.redbadge.b.a.a(context).f60017a.a().a("desktop_red_badge_args", optString).a();
        }
        if (!com.ss.android.newmedia.redbadge.b.a.a(context).a() && aa.f145425a == 0) {
            e.a().a(context, 0);
        }
        return z3;
    }

    public final boolean a(Context context, b bVar) {
        boolean z;
        try {
            String str = "";
            boolean z2 = true;
            if (1 != bVar.extra.redBadgeOnly || bVar.extra.badgeCount < 0) {
                if (bVar.extra.badgeCount >= 0) {
                    try {
                        a(context, bVar.extra.badgeCount);
                    } catch (d e2) {
                        e2.printStackTrace();
                        str = Log.getStackTraceString(e2);
                        z2 = false;
                    }
                    a(context, z2, str, bVar);
                    a(context, bVar.extra.badgeCount, z2, str, bVar);
                }
                return false;
            }
            try {
                a(context, bVar.extra.badgeCount);
                z = true;
            } catch (d e3) {
                e3.printStackTrace();
                str = Log.getStackTraceString(e3);
                z = false;
            }
            a(context, z, str, bVar);
            a(context, bVar.extra.badgeCount, z, str, bVar);
            return true;
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, boolean z, String str, b bVar) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = str3;
            }
            bundle.putString("stack_info", str);
        }
        String c2 = c(context);
        if (c2 != null) {
            str3 = c2;
        }
        bundle.putString("launcher_package", str3);
        bundle.putLong("rule_id", bVar.id);
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString("show_type", str2);
        r.a("red_badge_receive", bundle);
    }

    private static void a(Context context, int i2, boolean z, String str, b bVar) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i2);
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = str3;
            }
            bundle.putString("stack_info", str);
        }
        String c2 = c(context);
        if (c2 != null) {
            str3 = c2;
        }
        bundle.putString("launcher_package", str3);
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString("show_type", str2);
        bundle.putLong("rule_id", bVar.id);
        r.a("red_badge_show", bundle);
    }
}
