package com.ss.android.ugc.aweme.account.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import h.f.b.l;
import h.m.p;
import java.util.regex.Pattern;

public final class AccountRetrofitInetcept implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final AccountRetrofitInetcept f65191a = new AccountRetrofitInetcept();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f65192b = Pattern.compile(".*/passport/.*");

    /* renamed from: c  reason: collision with root package name */
    private static String f65193c = "";

    private AccountRetrofitInetcept() {
    }

    static {
        Covode.recordClassIndex(40081);
    }

    public static void a(String str) {
        l.d(str, "");
        f65193c = str;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return a(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u<?> a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        Request a2 = aVar.a();
        l.b(a2, "");
        String url = a2.getUrl();
        l.b(url, "");
        if (f65192b.matcher(url).matches()) {
            if (p.a((CharSequence) url, (CharSequence) "?", false)) {
                url = url + "&support_webview=1";
            } else {
                url = url + "?support_webview=1";
            }
            if (!TextUtils.isEmpty(f65193c)) {
                url = url + "&interstitial_token=" + f65193c;
            }
        }
        u<?> a3 = aVar.a(a2.newBuilder().a(url).a());
        l.b(a3, "");
        return a3;
    }
}
