package com.ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.bdturing.g;
import com.bytedance.bdturing.verify.a.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.metasec.ov.a;
import com.bytedance.mobsec.metasec.ov.c;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.sec.a;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.m.p;
import h.n;
import java.lang.ref.WeakReference;

public final class SecApiImpl implements ISecApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121760a = new a((byte) 0);

    static {
        Covode.recordClassIndex(79304);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final String onEvent() {
        return "";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79305);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initTask() {
        com.bytedance.bdturing.ttnet.a.a();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void dismissCaptcha() {
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "dismissCaptcha");
        if (a.f121761a) {
            SecCaptcha secCaptcha = a.f121763c;
            if (secCaptcha == null) {
                l.a("captcha");
            }
            com.bytedance.bdturing.a aVar = secCaptcha.f121786a;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public static ISecApi a() {
        MethodCollector.i(1856);
        Object a2 = b.a(ISecApi.class, false);
        if (a2 != null) {
            ISecApi iSecApi = (ISecApi) a2;
            MethodCollector.o(1856);
            return iSecApi;
        }
        if (b.dj == null) {
            synchronized (ISecApi.class) {
                try {
                    if (b.dj == null) {
                        b.dj = new SecApiImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1856);
                    throw th;
                }
            }
        }
        SecApiImpl secApiImpl = (SecApiImpl) b.dj;
        MethodCollector.o(1856);
        return secApiImpl;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void setParams() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (AppLog.getServerDeviceId() != null) {
            str = AppLog.getServerDeviceId();
        } else {
            str = str2;
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        com.ss.android.ugc.aweme.framework.a.a.b(4, "Sec", "setParams:did = " + str + "  iid = " + str2);
        com.bytedance.mobsec.metasec.ov.b bVar = a.f121762b;
        if (bVar != null) {
            bVar.b(str);
        }
        com.bytedance.mobsec.metasec.ov.b bVar2 = a.f121762b;
        if (bVar2 != null) {
            bVar2.c(str2);
        }
        com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init setParamsTime = " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateCollectMode(com.ss.android.ugc.aweme.secapi.a.a aVar) {
        a.a();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void reportData(String str) {
        l.d(str, "");
        a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean needVerifyImage(int i2) {
        if (!a.f121761a) {
            return false;
        }
        if (a.f121763c == null) {
            l.a("captcha");
        }
        if (i2 != 3058 && i2 != 3059 && i2 != 1104 && i2 != 1105) {
            return false;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "needVerifyImage: ".concat(String.valueOf(i2)));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean isCaptchaUrl(String str) {
        l.d(str, "");
        l.d(str, "");
        if (a.f121761a) {
            if (a.f121763c == null) {
                l.a("captcha");
            }
            l.d(str, "");
            l.d(str, "");
            if (str.length() != 0 && (p.a((CharSequence) str, (CharSequence) "/passport/", false) || p.a((CharSequence) str, (CharSequence) "/login/", false))) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "isCaptchaUrl: ".concat(String.valueOf(str)));
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateDeviceIdAndInstallId(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.framework.a.a.b(4, "Sec", "updateDeviceIdAndInstallId:did = " + str + "  iid = " + str2);
        a.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptcha(Activity activity, int i2, com.ss.android.ugc.aweme.secapi.a aVar) {
        String str = "";
        l.d(activity, str);
        l.d(aVar, str);
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptcha - errorcode = ".concat(String.valueOf(i2)));
        l.d(activity, str);
        l.d(aVar, str);
        if (a.f121761a) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = a.f121763c;
            if (secCaptcha == null) {
                l.a("captcha");
            }
            l.d(activity, str);
            l.d(aVar, str);
            if (TextUtils.isEmpty(secCaptcha.f121792g.f121804d) && AppLog.getInstallId() != null) {
                com.ss.android.ugc.aweme.sec.captcha.a aVar2 = secCaptcha.f121792g;
                String installId = AppLog.getInstallId();
                l.b(installId, str);
                aVar2.a(installId);
                secCaptcha.a(secCaptcha.f121792g.f121805e, secCaptcha.f121792g.f121804d);
            }
            if (TextUtils.isEmpty(secCaptcha.f121792g.f121805e) && AppLog.getServerDeviceId() != null) {
                com.ss.android.ugc.aweme.sec.captcha.a aVar3 = secCaptcha.f121792g;
                String serverDeviceId = AppLog.getServerDeviceId();
                l.b(serverDeviceId, str);
                aVar3.b(serverDeviceId);
                secCaptcha.a(secCaptcha.f121792g.f121805e, secCaptcha.f121792g.f121804d);
            }
            if (activity.isFinishing()) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptcha-activity-finishing");
            } else {
                secCaptcha.f121787b = new WeakReference<>(activity);
                secCaptcha.f121788c = aVar;
                activity.runOnUiThread(new SecCaptcha.c(secCaptcha, activity));
                secCaptcha.a().B = i2;
                String str2 = secCaptcha.f121790e;
                String b2 = secCaptcha.f121793h.b();
                if (b2 == null) {
                    b2 = str;
                }
                if (!l.a((Object) str2, (Object) b2)) {
                    String b3 = secCaptcha.f121793h.b();
                    if (b3 == null) {
                        b3 = str;
                    }
                    secCaptcha.f121790e = b3;
                    String a2 = secCaptcha.f121793h.a();
                    if (a2 != null) {
                        str = a2;
                    }
                    secCaptcha.f121789d = str;
                }
                secCaptcha.a().f26417l = secCaptcha.f121792g.f121805e;
                secCaptcha.a().f26413h = secCaptcha.f121792g.f121804d;
                secCaptcha.a().E = secCaptcha.f121789d;
                String c2 = secCaptcha.f121793h.c();
                if (c2 != null) {
                    secCaptcha.a().f26408c = c2;
                }
                if (secCaptcha.f121786a != null) {
                    g.f26495a = 1;
                }
                com.bytedance.bdturing.a aVar4 = secCaptcha.f121786a;
                if (aVar4 != null) {
                    aVar4.a(activity, secCaptcha);
                }
            }
            com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "popCaptcha time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptchaV2(Activity activity, String str, com.ss.android.ugc.aweme.secapi.a aVar) {
        String str2 = "";
        l.d(activity, str2);
        l.d(str, str2);
        l.d(aVar, str2);
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptchaV2 - riskInfo = ".concat(String.valueOf(str)));
        l.d(str, str2);
        l.d(activity, str2);
        l.d(aVar, str2);
        if (a.f121761a) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = a.f121763c;
            if (secCaptcha == null) {
                l.a("captcha");
            }
            l.d(str, str2);
            l.d(activity, str2);
            l.d(aVar, str2);
            if (TextUtils.isEmpty(secCaptcha.f121792g.f121804d) && AppLog.getInstallId() != null) {
                com.ss.android.ugc.aweme.sec.captcha.a aVar2 = secCaptcha.f121792g;
                String installId = AppLog.getInstallId();
                l.b(installId, str2);
                aVar2.a(installId);
                secCaptcha.a(secCaptcha.f121792g.f121805e, secCaptcha.f121792g.f121804d);
            }
            if (TextUtils.isEmpty(secCaptcha.f121792g.f121805e) && AppLog.getServerDeviceId() != null) {
                com.ss.android.ugc.aweme.sec.captcha.a aVar3 = secCaptcha.f121792g;
                String serverDeviceId = AppLog.getServerDeviceId();
                l.b(serverDeviceId, str2);
                aVar3.b(serverDeviceId);
                secCaptcha.a(secCaptcha.f121792g.f121805e, secCaptcha.f121792g.f121804d);
            }
            if (activity.isFinishing()) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptchaV2-activity-finishing");
            } else {
                secCaptcha.f121787b = new WeakReference<>(activity);
                secCaptcha.f121788c = aVar;
                activity.runOnUiThread(new SecCaptcha.d(secCaptcha, activity));
                String str3 = secCaptcha.f121790e;
                String b2 = secCaptcha.f121793h.b();
                if (b2 == null) {
                    b2 = str2;
                }
                if (!l.a((Object) str3, (Object) b2)) {
                    String b3 = secCaptcha.f121793h.b();
                    if (b3 == null) {
                        b3 = str2;
                    }
                    secCaptcha.f121790e = b3;
                    String a2 = secCaptcha.f121793h.a();
                    if (a2 != null) {
                        str2 = a2;
                    }
                    secCaptcha.f121789d = str2;
                }
                secCaptcha.a().f26417l = secCaptcha.f121792g.f121805e;
                secCaptcha.a().f26413h = secCaptcha.f121792g.f121804d;
                secCaptcha.a().E = secCaptcha.f121789d;
                secCaptcha.a().p = com.ss.android.ugc.aweme.i18n.language.a.b();
                String c2 = secCaptcha.f121793h.c();
                if (c2 != null) {
                    secCaptcha.a().f26408c = c2;
                }
                if (secCaptcha.f121786a != null) {
                    g.f26495a = 1;
                }
                com.bytedance.bdturing.a aVar4 = secCaptcha.f121786a;
                if (aVar4 != null) {
                    aVar4.a(activity, new j(str, (byte) 0), secCaptcha);
                }
            }
            com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "popCaptchaV2 time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initSec(Context context, String str, int i2, String str2, String str3, boolean z, com.ss.android.ugc.aweme.secapi.b bVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(bVar, "");
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "initSec");
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(bVar, "");
        com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init language = " + str + ", aid = " + i2 + ", appName = " + str2 + ", channel= " + str3);
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        GlobalContext.setContext(context);
        a.C1011a aVar = new a.C1011a(String.valueOf(i2), "VlLU6B7ILeoQXxxvkmzveunQhnUoc/B11Y2DI5Z3QqvdgxLcky9YEgHcHrHdZ97EpcmNgtNxMEnCTGfpoc3vGgcxhpxmIK89ne8HoHrJi/Cvjh6aAJOF89hVwUMi3hwgFytnQagJ7UjdZjXUxX8Q5qb5w+JQSTlsLoC0g5ykT8l+FvMQmrzsc7/C2iGCFDB+2z+JW3qJd0BdPJe/OB8euYqI1KknJbiJH+P4oXu1qjYbbkEWMk8kB6gQkzIzGkrSlBh+KV4PdnGBDpTJkl+yUwCPiO/0jn6o3oUBWkvjNopH+L3jCPnNJ71Mj98vX/oD0xZ3tw==");
        aVar.b();
        aVar.a(str3);
        int i3 = 1;
        if (!l.a((Object) true, (Object) true)) {
            if (l.a((Object) true, (Object) false)) {
                i3 = 0;
            } else {
                throw new n();
            }
        }
        aVar.f159506l = i3;
        if (aVar.f159506l == -1 || aVar.f159507m == 0) {
            throw new IllegalArgumentException("MSConfig init error!");
        }
        c.a(context, new com.bytedance.mobsec.metasec.ov.a(aVar.c()));
        a.f121762b = c.a(String.valueOf(i2));
        com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init getSdkTime = " + (System.currentTimeMillis() - currentTimeMillis2));
        a.f121764d = new com.ss.android.ugc.aweme.sec.a.a(a.f121762b);
        i.a(1000).a(new a.C3152a(bVar, z, str, i2, str2, str3, context), i.f4824a, null);
        com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init Time = " + (System.currentTimeMillis() - currentTimeMillis));
    }
}
