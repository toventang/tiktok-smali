package com.ss.android.ugc.aweme.account.j;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.a.a.a.c;
import com.bytedance.sdk.a.a.e;
import com.bytedance.sdk.a.f.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.j.a;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.m.e;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.y;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static final String f63082a = "https://api-va.tiktokv.com/aweme/v1/check/out/";

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f63083c;

    /* renamed from: b  reason: collision with root package name */
    public IAccountUserService f63084b = cj.f71084b.e();

    /* renamed from: d  reason: collision with root package name */
    private e f63085d;

    static {
        Covode.recordClassIndex(38858);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(10969);
        if (f63083c == null) {
            synchronized (b.class) {
                try {
                    if (f63083c == null) {
                        f63083c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10969);
                    throw th;
                }
            }
        }
        b bVar = f63083c;
        MethodCollector.o(10969);
        return bVar;
    }

    public final void a(final String str, boolean z, boolean z2) {
        String str2;
        final m mVar;
        final String b2 = cj.b();
        final boolean d2 = in.d();
        final Activity j2 = f.j();
        HashMap hashMap = new HashMap();
        String str3 = "1";
        if (cj.f71084b.e().isLogin()) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("user_was_login", str2);
        if (!z2) {
            str3 = "0";
        }
        hashMap.put("force_logout", str3);
        if (!z || j2 == null) {
            mVar = null;
        } else {
            mVar = new m(j2);
        }
        bt.a(mVar);
        if (this.f63085d == null) {
            this.f63085d = d.a(a.f62426a);
        }
        this.f63085d.a(str, hashMap, new com.bytedance.sdk.a.a.a.a<c>() {
            /* class com.ss.android.ugc.aweme.account.j.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(38860);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.a.a.a
            public final /* synthetic */ void a(c cVar) {
                final c cVar2 = cVar;
                bt.b(mVar);
                String str = "";
                if (cVar2.f43071b) {
                    if (q.a(a.f63068d) != -1) {
                        q.c().edit().remove("ftc_age_gate_response_mode".concat(String.valueOf(a.f63068d))).apply();
                    }
                    if (h.a(a.f63068d) != -1) {
                        String str2 = a.f63068d;
                        l.d(str2, str);
                        h.f62845d.remove(str2);
                    }
                    AppLog.setUserId(0);
                    AppLog.setSessionKey(b.this.f63084b.getSessionKey());
                    com.ss.android.sdk.a.b bVar = com.ss.android.sdk.a.b.f60131a;
                    Application application = a.f62426a;
                    for (com.ss.android.sdk.a.c cVar3 : bVar.f60133c) {
                        cVar3.o = false;
                    }
                    bVar.a(application);
                    if (j2 != null) {
                        LocalBroadcastManager.getInstance(a.f62426a).sendBroadcast(new Intent(j2, com.ss.android.ugc.aweme.login.l.class));
                    }
                    b.this.f63084b.clear("logout");
                    e.a.a(0, str, 0, str);
                    r.a("uc_user_logout_result", new com.ss.android.ugc.aweme.account.a.b.a().a("status", "success").a("params_for_special", "uc_login").a("fail_info", str).a("error_code", 0).a("uid", b2).a("logout_from", str).f62575a);
                    if (b.this.f63084b.allUidList().size() <= 0 || !cj.g().isEnableMultiAccountLogin()) {
                        cj.e();
                        cj.a(true);
                        if (d2) {
                            com.ss.android.ugc.aweme.compliance.api.a.q().a(false, e.f63100a);
                        } else {
                            y.a(new ap().a("previous_uid", a.f63068d).f142646a, new com.ss.android.ugc.aweme.ac.b(false));
                        }
                        a.f63068d = str;
                        Keva.getRepo("google_onetap").storeBoolean("logged_out", true);
                        Keva.getRepo("aweme_account_keva").storeLong("last_logout_time", System.currentTimeMillis());
                    } else {
                        List<String> allUidList = a.a().allUidList();
                        a.f63067c = allUidList;
                        if (allUidList == null) {
                            l.b();
                        }
                        a.f63066b = n.a((List) allUidList);
                        if (a.f63065a) {
                            List<String> list = a.f63067c;
                            if (list == null) {
                                l.b();
                            }
                            list.size();
                            String.valueOf(a.f63067c);
                        }
                        List<String> list2 = a.f63067c;
                        if (list2 == null) {
                            l.b();
                        }
                        String str3 = (String) n.i((List) list2);
                        IAccountUserService a2 = a.a();
                        l.b(a2, str);
                        String curUserId = a2.getCurUserId();
                        l.b(curUserId, str);
                        com.ss.android.ugc.aweme.account.i.b.a(curUserId, str3, String.valueOf(a.f63067c), "after logout");
                        if (a.f63066b >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("need_restart", true);
                            a.a(str3, bundle, true, false, new a.c());
                        }
                    }
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            Keva repo = Keva.getRepo("user_logout_log");
                            if (System.currentTimeMillis() - repo.getLong("last_time", 0) > 172800000) {
                                repo.clear();
                            }
                            repo.storeInt(str, repo.getInt(str, 0) + 1);
                            repo.storeLong("last_time", System.currentTimeMillis());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    com.ss.android.ugc.aweme.account.a.b.a a3 = new com.ss.android.ugc.aweme.account.a.b.a().a("status", "fail");
                    if (!TextUtils.isEmpty(cVar2.f43075f)) {
                        str = cVar2.f43075f;
                    }
                    r.a("uc_user_logout_result", a3.a("fail_info", str).a("error_code", cVar2.f43073d).a("params_for_special", "uc_login").a("uid", b2).a("logout_from", str).f62575a);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(cVar2.f43075f)) {
                        sb.append(cVar2.f43075f).append("|");
                    }
                    if (!TextUtils.isEmpty(cVar2.f43076g)) {
                        sb.append(cVar2.f43076g);
                    }
                    e.a.a(1, "passport logout", cVar2.f43073d, sb.toString());
                    cj.a(false);
                    if (cVar2.f43073d == 1346 || cVar2.f43073d == 1363) {
                        f.a(j2, cVar2.f43075f, new com.ss.android.ugc.aweme.base.component.f() {
                            /* class com.ss.android.ugc.aweme.account.j.b.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(38861);
                            }

                            @Override // com.ss.android.ugc.aweme.base.component.f
                            public final void a() {
                                b.this.a(str, true, false);
                            }

                            @Override // com.ss.android.ugc.aweme.base.component.f
                            public final void b() {
                                if (cVar2.f43073d == 1363) {
                                    b.this.a(str, true, true);
                                }
                            }
                        }, "settings_page", "log_out_bind");
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(com.ss.android.ugc.aweme.account.util.l.a(cVar2)).a();
                    }
                }
            }
        });
    }
}
