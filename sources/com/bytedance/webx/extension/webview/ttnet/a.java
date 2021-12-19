package com.bytedance.webx.extension.webview.ttnet;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.webx.a;
import com.bytedance.webx.e;
import com.bytedance.webx.e.a.a.b;
import com.bytedance.webx.e.a.c;
import com.bytedance.webx.h;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;

public final class a extends com.bytedance.webx.a<c> implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1140a f45985a = new C1140a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final b f45986b = new b();

    public final class b extends com.bytedance.webx.a<com.bytedance.webx.e.a.a.b> {

        /* renamed from: b  reason: collision with root package name */
        private C1141a f45988b = new C1141a(this);

        static {
            Covode.recordClassIndex(28122);
        }

        /* renamed from: com.bytedance.webx.extension.webview.ttnet.a$b$a  reason: collision with other inner class name */
        public static final class C1141a extends b.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f45989a;

            static {
                Covode.recordClassIndex(28123);
            }

            @Override // com.bytedance.webx.f.a
            public final com.bytedance.webx.a<?> a() {
                return this.f45989a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1141a(b bVar) {
                this.f45989a = bVar;
            }

            private static List<com.bytedance.retrofit2.client.b> a(Map<String, String> map) {
                if (map == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final WebResourceResponse b(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url;
                String str;
                WebResourceResponse b2 = super.b(webView, webResourceRequest);
                if (b2 != null) {
                    return b2;
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || url.getHost() == null || url.getScheme() == null || (url.getScheme() + "://" + url.getHost() + "/") == null) {
                    return null;
                }
                List<com.bytedance.retrofit2.client.b> a2 = a(webResourceRequest.getRequestHeaders());
                String uri = url.toString();
                l.a((Object) uri, "");
                return a(str, uri, a2);
            }

            private static WebResourceResponse a(String str, String str2, List<com.bytedance.retrofit2.client.b> list) {
                LinkedHashMap linkedHashMap;
                String str3;
                String str4;
                String str5;
                Charset charset;
                l.c(str, "");
                l.c(str2, "");
                com.bytedance.retrofit2.b<TypedInput> streamRequest = ((TtnetRetrofitApi) RetrofitUtils.a(str, TtnetRetrofitApi.class)).streamRequest(str2, list);
                if (h.f45997a.f46015a) {
                    com.bytedance.webx.b.a.a.a("TtnetInterceptExtension");
                } else {
                    com.bytedance.webx.b.a.a.a("TtnetInterceptExtension");
                }
                try {
                    u<TypedInput> execute = streamRequest.execute();
                    if (execute == null) {
                        return null;
                    }
                    T t = execute.f42630b;
                    InputStream in = t != null ? t.in() : null;
                    if (in == null) {
                        streamRequest.cancel();
                    }
                    com.bytedance.webx.b.a.a.a("TtnetInterceptExtension");
                    List<com.bytedance.retrofit2.client.b> list2 = execute.f42629a.f42476d;
                    if (list2 != null) {
                        linkedHashMap = new LinkedHashMap(h.j.h.b(ag.a(n.a((Iterable) list2, 10)), 16));
                        for (T t2 : list2) {
                            p pVar = new p(t2.f42471a, t2.f42472b);
                            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap == null || (str3 = (String) linkedHashMap.get("Content-Type")) == null) {
                        str3 = linkedHashMap != null ? (String) linkedHashMap.get("content-type") : null;
                    }
                    if (str3 == null) {
                        str3 = "text/html; charset=UTF-8";
                    }
                    MediaType parse = MediaType.parse(str3);
                    String str6 = parse == null ? "text/html" : parse.type() + "/" + parse.subtype();
                    if (parse == null || (charset = parse.charset()) == null || (str4 = charset.toString()) == null) {
                        str4 = "utf-8";
                    }
                    l.a((Object) str4, "");
                    com.bytedance.retrofit2.client.c cVar = execute.f42629a;
                    l.a((Object) cVar, "");
                    int i2 = cVar.f42474b;
                    com.bytedance.retrofit2.client.c cVar2 = execute.f42629a;
                    l.a((Object) cVar2, "");
                    if (TextUtils.isEmpty(cVar2.f42475c)) {
                        str5 = "OK";
                    } else {
                        com.bytedance.retrofit2.client.c cVar3 = execute.f42629a;
                        l.a((Object) cVar3, "");
                        str5 = cVar3.f42475c;
                    }
                    return new WebResourceResponse(str6, str4, i2, str5, linkedHashMap, in);
                } catch (Exception unused) {
                    com.bytedance.webx.b.a.a.a("TtnetInterceptExtension");
                    streamRequest.cancel();
                    return null;
                }
            }
        }

        @Override // com.bytedance.webx.a
        public final boolean a() {
            return a.this.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            a("shouldInterceptRequest", this.f45988b, 7000);
        }
    }

    static {
        Covode.recordClassIndex(28120);
    }

    /* renamed from: com.bytedance.webx.extension.webview.ttnet.a$a  reason: collision with other inner class name */
    public static final class C1140a {
        static {
            Covode.recordClassIndex(28121);
        }

        private C1140a() {
        }

        public /* synthetic */ C1140a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.webx.a
    public final void a(a.C1134a aVar) {
        this.f45904g = "ttnet";
        if (aVar == null) {
            l.a();
        }
        com.bytedance.webx.e.a.c.a aVar2 = (com.bytedance.webx.e.a.c.a) b();
        l.a((Object) aVar2, "");
        a.C1134a.a(aVar2.getExtendableWebViewClient(), this.f45986b);
    }
}
