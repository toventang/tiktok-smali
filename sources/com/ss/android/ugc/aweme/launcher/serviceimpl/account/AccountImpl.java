package com.ss.android.ugc.aweme.launcher.serviceimpl.account;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.c.a;
import com.ss.android.sdk.a.b;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.base.component.e;
import com.ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;
import h.f.b.l;
import java.util.Collection;

public final class AccountImpl implements IAccountApi {
    static {
        Covode.recordClassIndex(68653);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String d() {
        return "mobile";
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean a() {
        return b.f60131a.a();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final /* synthetic */ e b() {
        return new I18nLoginActivityComponent();
    }

    public static IAccountApi e() {
        MethodCollector.i(6236);
        Object a2 = com.ss.android.ugc.b.a(IAccountApi.class, false);
        if (a2 != null) {
            IAccountApi iAccountApi = (IAccountApi) a2;
            MethodCollector.o(6236);
            return iAccountApi;
        }
        if (com.ss.android.ugc.b.cc == null) {
            synchronized (IAccountApi.class) {
                try {
                    if (com.ss.android.ugc.b.cc == null) {
                        com.ss.android.ugc.b.cc = new AccountImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6236);
                    throw th;
                }
            }
        }
        AccountImpl accountImpl = (AccountImpl) com.ss.android.ugc.b.cc;
        MethodCollector.o(6236);
        return accountImpl;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String c() {
        String b2 = com.ss.android.ugc.aweme.account.util.e.b();
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        if (!TextUtils.isEmpty(b2)) {
            String[] split = b2.split(";");
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        return split2[1];
                    }
                }
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void b(String str) {
        a.f59136j = str;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(Collection<String> collection) {
        l.d(collection, "");
        d.a(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean a(String str) {
        return b.f60131a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(boolean z, String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.app.launch.a.a.a(z, str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(String str, String str2, String str3) {
        a.f59127a = str;
        a.f59128b = str;
        a.f59129c = a.f59127a;
        a.f59130d = a.f59127a;
        a.f59131e = a.f59127a;
        a.f59132f = a.f59127a;
        a.f59133g = a.f59127a;
        a.f59134h = str3;
        a.f59135i = str2;
    }
}
