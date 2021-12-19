package com.ss.android.ugc.aweme.fe.method;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.qrcode.d.c;
import com.ss.android.ugc.aweme.qrcode.d.d;
import com.ss.android.ugc.aweme.qrcode.presenter.a.a;
import com.ss.android.ugc.aweme.qrcode.presenter.a.i;
import java.net.URLEncoder;

public final class k {
    static {
        Covode.recordClassIndex(57471);
    }

    public static void a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            new i(new d(), new a() {
                /* class com.ss.android.ugc.aweme.fe.method.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(57472);
                }

                @Override // com.ss.android.ugc.aweme.qrcode.presenter.a.a
                public final void a(Exception exc) {
                    exc.printStackTrace();
                    k.b(str, str2);
                }

                @Override // com.ss.android.ugc.aweme.qrcode.presenter.a.a
                public final void a(c cVar) {
                    if (cVar.f119733a != 0) {
                        String str = str;
                        String str2 = cVar.f119734b;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "https://www.tiktok.com/link/";
                        }
                        Uri.Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(com.bytedance.ies.ugc.appcontext.d.n)).appendQueryParameter("target", str);
                        b bVar = b.a.f99809a;
                        com.bytedance.ies.ugc.appcontext.d.a();
                        k.b(appendQueryParameter.appendQueryParameter("lang", b.a(bVar.b().c())).appendQueryParameter("scene", "qrcode").build().toString(), str2);
                        return;
                    }
                    k.b(str, str2);
                }
            }).a(str);
        }
    }

    public static void b(String str, String str2) {
        l.b("sslocal://webcast_webview?url=" + URLEncoder.encode(str) + str2);
    }
}
