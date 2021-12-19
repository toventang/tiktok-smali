package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.a;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.experiment.j;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.r;
import java.util.List;

public class InitAppsFlyer implements w {

    /* renamed from: a  reason: collision with root package name */
    private static final String f107781a = "XY8Lpakui8g4kBcposRgxA";

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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

    static {
        Covode.recordClassIndex(68991);
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (j.b()) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private static boolean c() {
        String packageName = d.a().getPackageName();
        if (!d() || a(packageName)) {
            return true;
        }
        return false;
    }

    private static boolean d() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi")) {
            return true;
        }
        return false;
    }

    private static boolean b(Context context) {
        try {
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, "preinsatll_appflyer", 0);
            if (a2.contains("is_microsoft_dou")) {
                return a2.getBoolean("is_microsoft_dou", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                boolean hasSystemFeature = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                a2.edit().putBoolean("is_microsoft_dou", hasSystemFeature).apply();
                return hasSystemFeature;
            }
            a2.edit().putBoolean("is_microsoft_dou", false).apply();
            return false;
        } catch (Exception unused) {
        }
    }

    private static boolean a(String str) {
        boolean z;
        try {
            z = ((Boolean) Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPackage", String.class).invoke(null, str)).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        a.a("app %s is preinstalled app %s", new Object[]{str, Boolean.valueOf(z)});
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011e, code lost:
        if (r12 != false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    @Override // com.ss.android.ugc.aweme.lego.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.a(android.content.Context):void");
    }

    static void a(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AppsFlyerLib.getInstance().init(f107781a, appsFlyerConversionListener, context);
        try {
            AppsFlyerLib.getInstance().setCollectIMEI(false);
            AppsFlyerLib.getInstance().setCollectOaid(false);
            if (com.ss.android.ugc.aweme.compliance.api.a.d().g()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            r.f143179a = true;
            r.a();
        } catch (Exception unused) {
        }
    }
}
