package com.ss.android.ugc.aweme;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.account.share.data.write.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.d.c;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.utils.u;
import f.a.t;
import h.f.b.l;
import h.w;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;

public final class dn {

    /* renamed from: a  reason: collision with root package name */
    public boolean f82953a;

    static {
        Covode.recordClassIndex(51718);
    }

    static /* synthetic */ Object c() {
        c.a("");
        b();
        return null;
    }

    public dn() {
        if (!f.a(e.f142364k.a())) {
            a.f65142b = "not login";
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            i.b(Cdo.f82954a, g.a());
        } else {
            f.f142379d.d();
        }
    }

    public static void b() {
        try {
            Context a2 = d.a();
            d.a().getPackageName();
            b.a(a2, "key_account_info", "");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a() {
        String str;
        try {
            com.bytedance.sdk.a.a.d a2 = com.bytedance.sdk.a.f.e.a(d.a());
            if (!a2.b()) {
                Context a3 = d.a();
                d.a().getPackageName();
                b.a(a3, "key_account_info", "");
                return;
            }
            com.ss.android.account.share.data.a.a aVar = new com.ss.android.account.share.data.a.a();
            aVar.f58200a = a2.c();
            aVar.f58207h = AppLog.getInstallId();
            boolean z = true;
            aVar.f58206g = 1;
            aVar.f58205f = d.n;
            User curUser = AccountService.a().e().getCurUser();
            aVar.f58201b = curUser.getNickname();
            UrlModel a4 = u.a(curUser);
            if (a4 != null) {
                List<String> urlList = a4.getUrlList();
                if (urlList == null || urlList.isEmpty()) {
                    str = "";
                } else {
                    str = urlList.get(0);
                }
                aVar.f58202c = str;
            }
            aVar.f58204e = curUser.getAccountType();
            String a5 = a2.a();
            if (!TextUtils.isEmpty(a5)) {
                if (a5 == null) {
                    l.a();
                }
                Charset charset = h.m.d.f158808a;
                if (a5 != null) {
                    byte[] bytes = a5.getBytes(charset);
                    l.a((Object) bytes, "");
                    byte[] bytes2 = a5.getBytes(h.m.d.f158808a);
                    l.a((Object) bytes2, "");
                    aVar.f58203d = Base64.encodeToString(EncryptorUtil.a(bytes, bytes2.length), 2);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            if (!a2.d().f43474l && curUser.getUserMode() != 2) {
                z = false;
            }
            aVar.f58210k = Boolean.valueOf(z);
            Context a6 = d.a();
            l.c(a6, "");
            l.c(aVar, "");
            String b2 = ((com.google.gson.f) b.f58235e.getValue()).b(aVar);
            l.a((Object) b2, "");
            b.a(a6, "key_account_info", b2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ Object b(com.bytedance.sdk.a.n.a aVar) {
        com.ss.android.ugc.aweme.account.i.a.a("begin to update sp");
        c.a(aVar.n.toString());
        com.ss.android.ugc.aweme.account.i.a.a("asynchronous_check");
        a();
        return null;
    }

    public final synchronized void a(com.bytedance.sdk.a.n.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        com.ss.android.account.b.a aVar2;
        MethodCollector.i(7013);
        if (!(aVar == null || aVar.f43463a == 0)) {
            boolean z4 = aVar.f43467e;
            this.f82953a = z4;
            boolean z5 = false;
            if (z4 && GuestModeServiceImpl.d().c()) {
                AgeGateServiceImpl.e().a(false);
            }
            com.ss.android.account.c cVar = (com.ss.android.account.c) aVar;
            com.ss.android.sdk.a.b bVar = com.ss.android.sdk.a.b.f60131a;
            Application application = a.f62426a;
            com.ss.android.sdk.a.c[] cVarArr = bVar.f60132b;
            int length = cVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                com.ss.android.sdk.a.c cVar2 = cVarArr[i2];
                cVar2.o = z5;
                if (cVar != null) {
                    if (cVar2.f60147m == null || cVar2.f60147m.length == 0) {
                        aVar2 = cVar.f43464b.get(cVar2.f60146l);
                        if (aVar2 == null) {
                        }
                    } else {
                        String[] strArr = cVar2.f60147m;
                        int length2 = strArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                break;
                            }
                            aVar2 = cVar.f43464b.get(strArr[i3]);
                            if (aVar2 != null) {
                                break;
                            }
                            i3++;
                        }
                    }
                    cVar2.o = true;
                    cVar2.s = aVar2.f58187j;
                    cVar2.t = aVar2.f58188k;
                    cVar2.p = aVar2.f58181d;
                    cVar2.q = aVar2.f58182e;
                    cVar2.r = aVar2.f58183f;
                    cVar2.u = -1;
                }
                i2++;
                z5 = false;
            }
            bVar.a(application);
            try {
                string = aVar.f43475m.getString("country_code");
            } catch (JSONException unused) {
            }
            e.f142364k.d(String.valueOf(aVar.f43463a));
            if (!TextUtils.isEmpty(aVar.f43475m.optString("mandatory_2sv_nudge_period"))) {
                z = true;
            } else {
                z = false;
            }
            f.b().edit().putBoolean("mandatory_2sv", z).apply();
            String optString = aVar.f43475m.optString("mandatory_2sv_nudge_period");
            l.d(optString, "");
            f.b().edit().putString("mandatory_2sv_nudge_period", optString).apply();
            e eVar = e.f142364k;
            f.a a2 = f.a.C3805a.a(cVar.f43463a, cVar.f43468f, cVar.p, cVar.N, string, cVar.f43465c, cVar.f43474l);
            l.d(a2, "");
            if (l.a((Object) a2.f142387a, (Object) eVar.e())) {
                eVar.f142372g = null;
            }
            l.d(a2, "");
            t a3 = t.c(new f.l(a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            if (a3 != null) {
                a3.g();
            }
            l.d(cVar, "");
            String valueOf = String.valueOf(cVar.f43463a);
            String str = cVar.p;
            l.b(str, "");
            String str2 = cVar.r;
            l.b(str2, "");
            String str3 = cVar.f43465c;
            if (str3 == null) {
                str3 = "";
            }
            com.ss.android.ugc.aweme.user.c cVar3 = new com.ss.android.ugc.aweme.user.c(valueOf, "", "", str, str2, str3, (long) cVar.V);
            l.d(cVar3, "");
            l.d(cVar3, "");
            t a4 = t.c(new f.n(cVar3)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            if (a4 != null) {
                a4.g();
            }
            com.ss.android.ugc.aweme.account.i.a.a("synchronous_check");
            if (aVar.f43475m.has("user_device_record_status")) {
                int optInt = aVar.f43475m.optInt("user_device_record_status");
                int i4 = 2;
                if (optInt == 0) {
                    com.ss.android.ugc.aweme.account.b.a();
                    boolean saveLoginStatus = com.ss.android.ugc.aweme.account.b.f62864a.k().getSaveLoginStatus();
                    com.ss.android.ugc.aweme.account.b.a();
                    bn k2 = com.ss.android.ugc.aweme.account.b.f62864a.k();
                    if (saveLoginStatus) {
                        i4 = 1;
                    }
                    k2.updateLoginHistoryState(i4, null);
                } else {
                    String str4 = aVar.f43465c;
                    if (optInt == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.ss.android.ugc.aweme.user.a.a(str4, z2);
                    com.ss.android.ugc.aweme.account.b.a();
                    bn k3 = com.ss.android.ugc.aweme.account.b.f62864a.k();
                    Object[] objArr = new Object[2];
                    if (optInt == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objArr[0] = Boolean.valueOf(z3);
                    objArr[1] = false;
                    k3.updateMethodInfo("allow_one_key_login", objArr);
                }
            }
            i.b(new dp(this, aVar), g.a());
            com.ss.android.ugc.aweme.user.a.c.a(cVar.U);
            if (aVar.f43475m.optInt("need_device_create") == 1) {
                boolean isChildMode = DeviceRegisterManager.isChildMode();
                DeviceRegisterManager.clearWhenSwitchChildMode(isChildMode);
                DeviceRegisterManager.resetDidWhenSwitchChildMode(isChildMode, 5000, null);
            }
        }
        MethodCollector.o(7013);
    }
}
