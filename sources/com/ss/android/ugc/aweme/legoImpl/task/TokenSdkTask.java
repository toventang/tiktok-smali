package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.common.util.f;
import com.ss.android.token.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.dn;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.c;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet;
import com.ss.android.ugc.aweme.net.q;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class TokenSdkTask implements w {
    static {
        Covode.recordClassIndex(69263);
    }

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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String str;
        int i2;
        String str2;
        a.a("TokenSdkTask");
        if (f.a(d.a())) {
            int i3 = d.f34605l;
            if (i3 == 5 || i3 == 4) {
                str = "lite";
            } else {
                str = "normal";
            }
            RetrofitUtils.a(new TokenSdkCommonParamsInterceptorTTNet(str));
            AccountService.a().o();
            com.ss.android.d.f59392a = d.f108029a;
            b bVar = new b();
            bVar.f61012e = 600000;
            boolean z = true;
            bVar.f61011d = true;
            List asList = Arrays.asList("tiktokv.com", "tiktok.com", "byteoversea.com");
            if (!(asList == null || asList.size() == 0)) {
                bVar.f61009b.addAll(asList);
            }
            Context a2 = d.a();
            if (!com.ss.android.token.d.f61016a) {
                com.ss.android.token.f fVar = new com.ss.android.token.f(a2, bVar);
                com.ss.android.token.f.f61019a = fVar;
                fVar.a(com.ss.android.token.d.f61017b);
                com.ss.android.token.d.f61016a = true;
                if (com.ss.android.token.d.f61018c.size() != 0) {
                    com.ss.android.token.f.f61019a.a((Collection<String>) com.ss.android.token.d.f61018c);
                    com.ss.android.token.d.f61018c.clear();
                    com.ss.android.token.d.f61018c = null;
                }
                com.bytedance.sdk.a.b a3 = com.bytedance.sdk.a.b.a();
                if (a3.f43106a != null && a3.f43107b) {
                    if (TextUtils.isEmpty(bVar.f61008a)) {
                        i2 = 202;
                        str2 = "token beat host == null";
                    } else {
                        Set<String> set = bVar.f61009b;
                        if (set == null || set.isEmpty()) {
                            i2 = 203;
                            str2 = "host list is empty";
                        } else {
                            str2 = null;
                            i2 = 0;
                        }
                    }
                    a3.f43106a.a("1002", i2, str2);
                }
            }
            if (q.f112512a == null) {
                if (com.ss.android.ugc.aweme.co.b.b().b(d.a(), "awe_network_x_token_disabled") != 0) {
                    z = false;
                }
                q.f112512a = Boolean.valueOf(z);
            }
            boolean booleanValue = q.f112512a.booleanValue();
            if (com.ss.android.token.d.f61016a && booleanValue != com.ss.android.token.d.f61017b) {
                com.ss.android.token.f.f61019a.a(booleanValue);
                com.ss.android.token.d.f61017b = booleanValue;
            }
            i.a(600).a(e.f108030a, i.f4824a, null);
            long j2 = 1000;
            if (((Boolean) c.f107453i.getValue()).booleanValue()) {
                j2 = 5000;
            } else if (((Boolean) c.f107454j.getValue()).booleanValue()) {
                j2 = 7000;
            }
            i.a(j2).a(f.f108031a, i.f4824a, null);
            com.ss.android.ugc.aweme.account.b.a();
            com.ss.android.ugc.aweme.account.b.f62864a.a(new IAccountService.b() {
                /* class com.ss.android.ugc.aweme.legoImpl.task.TokenSdkTask.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69264);
                }

                @Override // com.ss.android.ugc.aweme.IAccountService.b
                public final void onAccountResult(int i2, boolean z, int i3, User user) {
                    if (i2 == 1 || i2 == 2) {
                        dn.a();
                    } else if (i2 == 3) {
                        dn.b();
                    }
                }
            });
        }
    }
}
