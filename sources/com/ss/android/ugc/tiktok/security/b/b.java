package com.ss.android.ugc.tiktok.security.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.tiktok.security.c.c;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends a {
    static {
        Covode.recordClassIndex(98158);
    }

    @Override // com.ss.android.ugc.tiktok.security.b.f
    public final f a() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.security.b.d, com.ss.android.ugc.tiktok.security.b.a
    public final String a(WebView webView, String str) {
        l.d(webView, "");
        if (c.a().f149053a) {
            return super.a(webView, a(str, webView.getContext()));
        }
        return super.a(webView, str);
    }

    private static String a(String str, Context context) {
        try {
            boolean z = false;
            if (a.C2792a.f108997a.f108996a.enableWebHttps()) {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                if (!(!l.a((Object) parse.getScheme(), (Object) "http"))) {
                    com.bytedance.ttnet.a.a a2 = com.bytedance.ttnet.a.a.a(context);
                    l.b(a2, "");
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : a2.f44438f) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        String host = parse.getHost();
                        if (host != null) {
                            l.b(str3, "");
                            if (p.c(host, str3, false)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!z) {
                return str;
            }
            if (str != null) {
                return new h.m.l("http").replaceFirst(str, "https");
            }
            return null;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    @Override // com.ss.android.ugc.tiktok.security.b.e, com.ss.android.ugc.tiktok.security.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.p<java.lang.String, java.lang.Boolean> a(java.lang.String r12, com.lynx.tasm.LynxView r13) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.b.b.a(java.lang.String, com.lynx.tasm.LynxView):h.p");
    }
}
