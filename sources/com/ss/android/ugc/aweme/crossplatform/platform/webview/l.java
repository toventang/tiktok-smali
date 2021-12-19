package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import h.m.p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78905a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final IIESNetworkApi f78906b;

    public static final class a {
        static {
            Covode.recordClassIndex(48968);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(48967);
        String str = Api.f66569d;
        h.f.b.l.b(str, "");
        f d2 = com.bytedance.ies.ugc.aweme.network.ext.a.b(str).a().d();
        h.f.b.l.b(d2, "");
        f78906b = (IIESNetworkApi) d2.a(IIESNetworkApi.class);
    }

    static WebResourceResponse a(u<TypedInput> uVar) {
        String str;
        String lowerCase;
        if (uVar != null) {
            List<b> list = uVar.f42629a.f42476d;
            h.f.b.l.b(list, "");
            if (!d.a(list)) {
                Iterator<b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (!TextUtils.isEmpty(next.f42471a) && !TextUtils.isEmpty(next.f42472b)) {
                        String str2 = next.f42471a;
                        h.f.b.l.b(str2, "");
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase2 = str2.toLowerCase();
                        h.f.b.l.b(lowerCase2, "");
                        if (h.f.b.l.a((Object) lowerCase2, (Object) "content-type")) {
                            str = next.f42472b;
                            h.f.b.l.b(str, "");
                            break;
                        }
                    }
                }
            }
            str = "";
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                lowerCase = null;
            } else {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                lowerCase = str.toLowerCase();
                h.f.b.l.b(lowerCase, "");
                if (p.e((CharSequence) lowerCase, (CharSequence) "js") || p.e((CharSequence) lowerCase, (CharSequence) "application/javascript") || p.e((CharSequence) lowerCase, (CharSequence) "javascript")) {
                    lowerCase = "application/x-javascript";
                } else if (p.c(lowerCase, "text/css", false) || p.c(lowerCase, "css", false)) {
                    lowerCase = "text/css";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "test/html") || p.e((CharSequence) lowerCase, (CharSequence) "html")) {
                    lowerCase = "text/html";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "image")) {
                    int a2 = p.a((CharSequence) lowerCase, ";", 0, false, 6);
                    if (a2 >= 0) {
                        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
                        lowerCase = lowerCase.substring(0, a2);
                        h.f.b.l.b(lowerCase, "");
                    }
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "jpeg") || p.e((CharSequence) lowerCase, (CharSequence) "jpg")) {
                    lowerCase = "image/jpeg";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "png")) {
                    lowerCase = "image/png";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "gif")) {
                    lowerCase = "image/gif";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "woff")) {
                    lowerCase = "font/woff";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) "svg")) {
                    lowerCase = "image/svg+xml";
                } else if (p.e((CharSequence) lowerCase, (CharSequence) ".ttf")) {
                    lowerCase = "font/ttf";
                } else {
                    int a3 = p.a((CharSequence) lowerCase, ";", 0, false, 6);
                    if (a3 >= 0) {
                        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
                        lowerCase = lowerCase.substring(0, a3);
                        h.f.b.l.b(lowerCase, "");
                    }
                }
            }
            if (TextUtils.isEmpty(lowerCase)) {
                return null;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (Build.VERSION.SDK_INT >= 21 && h.f.b.l.a((Object) "font/ttf", (Object) str)) {
                    return new WebResourceResponse(lowerCase, "", 200, "OK", hashMap, uVar.f42630b.in());
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(lowerCase, "", uVar.f42630b.in());
                if (Build.VERSION.SDK_INT >= 21) {
                    webResourceResponse.setResponseHeaders(hashMap);
                    return webResourceResponse;
                }
                try {
                    Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                    h.f.b.l.b(field, "");
                    field.setAccessible(true);
                    field.set(webResourceResponse, hashMap);
                    return webResourceResponse;
                } catch (Throwable unused) {
                    return webResourceResponse;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    static u<TypedInput> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b("accept", "*/*"));
        arrayList.add(new b("accept-encoding", "gzip, deflate, br"));
        arrayList.add(new b("accept-language", "en-GB,en;q=0.9,zh-CN;q=0.8,zh-TW;q=0.7,zh;q=0.6,en-US;q=0.5"));
        arrayList.add(new b("x-requested-with", "com.ss.android.ugc.aweme"));
        arrayList.add(new b("ttnet", "1"));
        if (!h.f.b.l.a((Object) str, (Object) str2)) {
            arrayList.add(new b("referer", str));
        }
        try {
            u<TypedInput> execute = f78906b.downloadFile(false, -1, str2, null, arrayList).execute();
            h.f.b.l.b(execute, "");
            if (execute.f42629a.a()) {
                return execute;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
