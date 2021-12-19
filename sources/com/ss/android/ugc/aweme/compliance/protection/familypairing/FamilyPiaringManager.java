package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.m.p;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class FamilyPiaringManager implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.compliance.protection.common.a.b f77978a;

    /* renamed from: b  reason: collision with root package name */
    public static final FamilyPiaringManager f77979b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f77980c = h.i.a((h.f.a.a) c.f77983a);

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77984a = new d();

        static {
            Covode.recordClassIndex(48339);
        }

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    private static Keva f() {
        return (Keva) f77980c.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(249, new g(FamilyPiaringManager.class, "onParentalModeChanged", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private FamilyPiaringManager() {
    }

    static final class c extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77983a = new c();

        static {
            Covode.recordClassIndex(48338);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_parental_platform", 0);
        }
    }

    public static IFamilyPairingService.a a() {
        com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || (bVar = f77978a) == null) {
            return IFamilyPairingService.a.NONE;
        }
        return b(bVar);
    }

    public static boolean b() {
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar;
        Integer num;
        com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar = f77978a;
        if (bVar == null || (cVar = bVar.f77947b) == null || (num = cVar.f77951b) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar;
        Integer num;
        com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar = f77978a;
        if (bVar == null || (cVar = bVar.f77947b) == null || (num = cVar.f77950a) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public static int d() {
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar;
        Integer num;
        com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar = f77978a;
        if (bVar == null || (cVar = bVar.f77947b) == null || (num = cVar.f77950a) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String e() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            FeConfigCollection feConfigCollection = iESSettingsProxy.getFeConfigCollection();
            l.b(feConfigCollection, "");
            FEConfig guardianEntrance = feConfigCollection.getGuardianEntrance();
            l.b(guardianEntrance, "");
            String schema = guardianEntrance.getSchema();
            l.b(schema, "");
            return schema;
        } catch (com.bytedance.ies.a unused) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fmain%2Fguardian_entrance%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f77985a;

        static {
            Covode.recordClassIndex(48340);
        }

        e(boolean z) {
            this.f77985a = z;
        }

        public final void run() {
            int i2;
            com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b bVar;
            if (com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a()) {
                if (this.f77985a) {
                    bVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.OPEN;
                } else {
                    bVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.CLOSE;
                }
                com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(bVar);
            }
            com.ss.android.ugc.aweme.compliance.protection.common.a.e();
            Bundle bundle = new Bundle();
            bundle.putInt("filter_warn", com.ss.android.ugc.aweme.compliance.protection.common.a.d());
            AppLog.setCustomerHeader(bundle);
            if (this.f77985a) {
                i2 = R.string.feg;
            } else {
                i2 = R.string.fef;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(i2).a();
        }
    }

    static {
        Covode.recordClassIndex(48335);
        FamilyPiaringManager familyPiaringManager = new FamilyPiaringManager();
        f77979b = familyPiaringManager;
        EventBus.a(EventBus.a(), familyPiaringManager);
        if (f().getBoolean("valid", false)) {
            familyPiaringManager.a(new com.ss.android.ugc.aweme.compliance.protection.common.a.b(Integer.valueOf(f().getInt("parentalGuardianMode", 0)), new com.ss.android.ugc.aweme.compliance.protection.common.a.c(Integer.valueOf(f().getInt("screenTimeManagement", 0)), Integer.valueOf(f().getInt("teen_mode", 0)), Integer.valueOf(f().getInt("searchRestriction", 0)))));
        }
    }

    public final void a(com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar) {
        f77978a = bVar;
        c(bVar);
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f77982a;

        static {
            Covode.recordClassIndex(48337);
        }

        public b(Context context) {
            this.f77982a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.app.api.b.a.a(this.f77982a, (Throwable) obj, (int) R.string.g4j);
        }
    }

    public static void a(boolean z) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            l.b(myLooper, "");
            new Handler(myLooper).post(new e(z));
        }
    }

    public static IFamilyPairingService.a b(com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar) {
        Integer num;
        if (!(bVar == null || (num = bVar.f77946a) == null)) {
            if (num.intValue() == 0 || num.intValue() == 1) {
                return IFamilyPairingService.a.NONE;
            }
            if (num.intValue() == 2) {
                return IFamilyPairingService.a.CHILD;
            }
            if (num.intValue() == 3) {
                return IFamilyPairingService.a.PARENT;
            }
            if (num.intValue() == 4) {
                return IFamilyPairingService.a.UNLINK_LOCKED;
            }
        }
        return IFamilyPairingService.a.NONE;
    }

    @r(a = ThreadMode.MAIN)
    public final void onParentalModeChanged(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (TextUtils.equals("guardian_platform_open", jVar.f91311b.getString("eventName")) || TextUtils.equals("guardian_platform_close", jVar.f91311b.getString("eventName")) || TextUtils.equals("guardian_platform_child_unlink", jVar.f91311b.getString("eventName"))) {
            com.ss.android.ugc.aweme.compliance.protection.common.a.a(null);
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str) || str == null || !p.a((CharSequence) str, (CharSequence) "/falcon/rn/guardian_child", true)) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return false;
        }
        com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "qr_code_detail", "auto");
        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.czi).a();
        return true;
    }

    private static void c(com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar) {
        int i2;
        int i3;
        int i4;
        Integer num;
        Integer num2;
        Integer num3;
        int i5 = 0;
        if (bVar == null) {
            f().storeBoolean("valid", false);
            return;
        }
        f().storeBoolean("valid", true);
        Keva f2 = f();
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar = bVar.f77947b;
        if (cVar == null || (num3 = cVar.f77951b) == null) {
            i2 = 0;
        } else {
            i2 = num3.intValue();
        }
        f2.storeInt("teen_mode", i2);
        Keva f3 = f();
        Integer num4 = bVar.f77946a;
        if (num4 != null) {
            i3 = num4.intValue();
        } else {
            i3 = 0;
        }
        f3.storeInt("parentalGuardianMode", i3);
        Keva f4 = f();
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar2 = bVar.f77947b;
        if (cVar2 == null || (num2 = cVar2.f77950a) == null) {
            i4 = 0;
        } else {
            i4 = num2.intValue();
        }
        f4.storeInt("screenTimeManagement", i4);
        Keva f5 = f();
        com.ss.android.ugc.aweme.compliance.protection.common.a.c cVar3 = bVar.f77947b;
        if (!(cVar3 == null || (num = cVar3.f77952c) == null)) {
            i5 = num.intValue();
        }
        f5.storeInt("searchRestriction", i5);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f77981a;

        static {
            Covode.recordClassIndex(48336);
        }

        public a(Context context) {
            this.f77981a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Integer e2;
            com.ss.android.ugc.aweme.compliance.protection.familypairing.a.a aVar = (com.ss.android.ugc.aweme.compliance.protection.familypairing.a.a) obj;
            try {
                l.b(aVar, "");
                l.d(aVar, "");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                String b2 = com.bytedance.common.utility.d.b(g2.getCurUserId());
                if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(aVar.f77987b) && !TextUtils.isEmpty(aVar.f77988c)) {
                    l.b(b2, "");
                    Charset charset = h.m.d.f158808a;
                    if (b2 != null) {
                        byte[] bytes = b2.getBytes(charset);
                        l.b(bytes, "");
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        String str2 = aVar.f77988c;
                        Charset charset2 = h.m.d.f158808a;
                        if (str2 != null) {
                            byte[] bytes2 = str2.getBytes(charset2);
                            l.b(bytes2, "");
                            instance.init(2, secretKeySpec, new IvParameterSpec(bytes2));
                            byte[] doFinal = instance.doFinal(com.bytedance.common.utility.d.a(aVar.f77987b));
                            if (!(doFinal == null || (e2 = p.e((str = new String(doFinal, h.m.d.f158808a)))) == null || e2.intValue() < 0 || e2.intValue() > 9999 || str == null || str.length() == 0)) {
                                Context context = this.f77981a;
                                new b.a(context).a(String.valueOf(context.getString(R.string.bf6))).b(String.valueOf(str)).a(R.string.asg, d.f77984a).c();
                                return;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f77981a).a(R.string.do6).a();
            } catch (Exception unused) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f77981a).a(R.string.do6).a();
            }
        }
    }
}
