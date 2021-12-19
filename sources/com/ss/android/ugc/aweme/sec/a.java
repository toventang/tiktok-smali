package com.ss.android.ugc.aweme.sec;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.metasec.ov.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f121761a;

    /* renamed from: b  reason: collision with root package name */
    static b f121762b;

    /* renamed from: c  reason: collision with root package name */
    static SecCaptcha f121763c;

    /* renamed from: d  reason: collision with root package name */
    static com.ss.android.ugc.aweme.sec.a.a f121764d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f121765e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<String> f121766f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private static String f121767g;

    /* renamed from: h  reason: collision with root package name */
    private static String f121768h;

    /* renamed from: i  reason: collision with root package name */
    private static String f121769i;

    /* renamed from: j  reason: collision with root package name */
    private static String f121770j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f121771k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f121772l;

    private a() {
    }

    static {
        Covode.recordClassIndex(79306);
    }

    private static boolean c() {
        ITpcConsentService.a f2 = com.ss.android.ugc.aweme.compliance.api.a.r().f();
        if (f2 == ITpcConsentService.a.US || f2 == ITpcConsentService.a.EU) {
            return true;
        }
        return false;
    }

    public static void a() {
        com.ss.android.ugc.aweme.secapi.a.a aVar;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            if (in.e()) {
                aVar = com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_KIDS;
            } else {
                aVar = com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_ALL;
            }
            a(aVar);
        } else if (GuestModeServiceImpl.d().c()) {
            a(com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_EEA_GUEST);
        } else if (c()) {
            if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
                a(com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_INIT);
            } else {
                a(com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_EEA_GUEST);
            }
        } else if (com.ss.android.ugc.aweme.compliance.api.a.r().e()) {
            a(com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_EEA_GUEST);
        } else {
            a(com.ss.android.ugc.aweme.secapi.a.a.COLLECT_MODE_INIT);
        }
    }

    public static final void b() {
        MethodCollector.i(1030);
        if (f121771k || f121772l) {
            String str = f121767g;
            if (str == null) {
                l.a("currentDid");
            }
            String str2 = f121768h;
            if (str2 == null) {
                l.a("currentIid");
            }
            if (f121771k) {
                str = f121769i;
                if (str == null) {
                    l.a("targetDid");
                }
                f121771k = false;
            }
            if (f121772l) {
                str2 = f121770j;
                if (str2 == null) {
                    l.a("targetIid");
                }
                f121772l = false;
            }
            a(str, str2);
        }
        synchronized (f121765e) {
            try {
                ArrayList<String> arrayList = f121766f;
                if (!arrayList.isEmpty()) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        l.b(next, "");
                        a(next);
                    }
                }
            } finally {
                MethodCollector.o(1030);
            }
        }
    }

    private static void a(com.ss.android.ugc.aweme.secapi.a.a aVar) {
        if (aVar != null) {
            int i2 = b.f121781a[aVar.ordinal()];
            if (i2 == 1) {
                b bVar = f121762b;
                if (bVar != null) {
                    bVar.a(5);
                }
            } else if (i2 == 2) {
                b bVar2 = f121762b;
                if (bVar2 != null) {
                    bVar2.a(10);
                }
            } else if (i2 != 3) {
                if (i2 == 4) {
                    if (c()) {
                        b bVar3 = f121762b;
                        if (bVar3 != null) {
                            bVar3.a(503);
                            return;
                        }
                        return;
                    }
                    b bVar4 = f121762b;
                    if (bVar4 != null) {
                        bVar4.a(603);
                    }
                }
            } else if (c()) {
                b bVar5 = f121762b;
                if (bVar5 != null) {
                    bVar5.a(10);
                }
            } else {
                b bVar6 = f121762b;
                if (bVar6 != null) {
                    bVar6.a(503);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.a$a  reason: collision with other inner class name */
    static final class C3152a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.secapi.b f121773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f121774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f121775c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f121776d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f121777e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f121778f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f121779g;

        static {
            Covode.recordClassIndex(79307);
        }

        C3152a(com.ss.android.ugc.aweme.secapi.b bVar, boolean z, String str, int i2, String str2, String str3, Context context) {
            this.f121773a = bVar;
            this.f121774b = z;
            this.f121775c = str;
            this.f121776d = i2;
            this.f121777e = str2;
            this.f121778f = str3;
            this.f121779g = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            String str;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = this.f121773a.a();
            if (a2 == null) {
                a2 = "";
            }
            com.ss.android.ugc.aweme.sec.b.a.a("SecCaptcha", "initSCCheckUtil getSessionTime = " + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            b bVar = a.f121762b;
            if (bVar != null) {
                bVar.d(a2);
            }
            com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init setSessionTime = " + (System.currentTimeMillis() - currentTimeMillis2));
            if (AppLog.getServerDeviceId() != null) {
                str = AppLog.getServerDeviceId();
            } else {
                str = "";
            }
            if (AppLog.getInstallId() != null) {
                str2 = AppLog.getInstallId();
            } else {
                str2 = "";
            }
            a.a();
            b bVar2 = a.f121762b;
            if (bVar2 != null) {
                bVar2.b(str);
            }
            b bVar3 = a.f121762b;
            if (bVar3 != null) {
                bVar3.c(str2);
            }
            if (this.f121774b) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "Sec", "initCaptchaParams:did = " + str + "  iid = " + str2 + "  sid = " + a2);
                String str3 = this.f121775c;
                int i2 = this.f121776d;
                String str4 = this.f121777e;
                l.b(str2, "");
                l.b(str, "");
                com.ss.android.ugc.aweme.sec.captcha.a aVar = new com.ss.android.ugc.aweme.sec.captcha.a(str3, i2, str4, str2, str, this.f121778f, a2, (byte) 0);
                long currentTimeMillis3 = System.currentTimeMillis();
                Context applicationContext = this.f121779g.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                l.b(applicationContext, "");
                a.f121763c = new SecCaptcha(applicationContext, aVar, this.f121773a);
                com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "init createSecCaptchaTime = " + (System.currentTimeMillis() - currentTimeMillis3));
            }
            a.f121761a = true;
            com.ss.android.ugc.aweme.framework.a.a.b(4, "Sec", "secInitSuccessFlag");
            a.b();
            return z.f158842a;
        }
    }

    public static final synchronized void a(String str) {
        synchronized (a.class) {
            MethodCollector.i(1288);
            l.d(str, "");
            com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "report .... scene = " + str + ", initSuccess = " + f121761a);
            if (f121761a) {
                long currentTimeMillis = System.currentTimeMillis();
                com.ss.android.ugc.aweme.sec.a.a aVar = f121764d;
                if (aVar == null) {
                    l.a("report");
                }
                l.d(str, "");
                l.d(aVar, "");
                l.d(str, "");
                com.ss.android.ugc.aweme.sec.b.a.a("DataReport", "report .... scene = ".concat(String.valueOf(str)));
                b bVar = aVar.f121780a;
                if (bVar != null) {
                    bVar.a(str);
                }
                com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "report time = " + (System.currentTimeMillis() - currentTimeMillis));
                MethodCollector.o(1288);
                return;
            }
            f121766f.add(str);
            MethodCollector.o(1288);
        }
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (f121761a) {
            f121767g = str;
            f121768h = str2;
            long currentTimeMillis = System.currentTimeMillis();
            b bVar = f121762b;
            if (bVar != null) {
                bVar.b(str);
            }
            b bVar2 = f121762b;
            if (bVar2 != null) {
                bVar2.c(str2);
            }
            com.ss.android.ugc.aweme.sec.b.a.a("DmtSec", "updateDeviceIdAndInstallId setParamsTime = " + (System.currentTimeMillis() - currentTimeMillis) + ", deviceId = " + str + ", iid = " + str2);
            SecCaptcha secCaptcha = f121763c;
            if (secCaptcha == null) {
                l.a("captcha");
            }
            secCaptcha.a(str, str2);
            return;
        }
        f121770j = str2;
        f121769i = str;
        f121772l = true;
        f121771k = true;
    }
}
