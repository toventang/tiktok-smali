package com.ss.android.ugc.tiktok.seclink.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.webx.i.a.a;
import com.bytedance.webx.i.a.b;
import com.bytedance.webx.i.d.c;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.settings.af;
import com.ss.android.ugc.aweme.web.h;
import com.ss.android.ugc.tiktok.seclink.impl.a.e;
import com.ss.android.ugc.tiktok.seclink.impl.a.f;
import h.a.n;
import h.f.b.ad;
import h.m.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class SecLinkManager {

    /* renamed from: a  reason: collision with root package name */
    static Map<View, b> f149002a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final SecLinkManager f149003b = new SecLinkManager();

    public interface SecLinkDataApi {
        static {
            Covode.recordClassIndex(98140);
        }

        @t
        com.bytedance.retrofit2.b<String> executePost(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);
    }

    public static final class a implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(98141);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        a() {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            Map<View, b> map = SecLinkManager.f149002a;
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            ad.h(map).remove(view);
        }
    }

    private SecLinkManager() {
    }

    static {
        Covode.recordClassIndex(98137);
        Context a2 = d.a();
        String valueOf = String.valueOf(d.n);
        ISettingService v = SettingServiceImpl.v();
        h.f.b.l.b(v, "");
        String a3 = v.a(v.a(d.a()).c());
        if (a2 == null) {
            throw new RuntimeException("context can not be null.");
        } else if (!TextUtils.isEmpty(valueOf)) {
            String str = "https://www.tiktok.com/link//";
            if (!TextUtils.isEmpty(str)) {
                Context applicationContext = a2.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                com.bytedance.webx.i.a.f46035a = applicationContext;
                com.bytedance.webx.i.c.a aVar = new com.bytedance.webx.i.c.a();
                com.bytedance.webx.i.a.f46036b = aVar;
                aVar.f46058a = valueOf;
                com.bytedance.webx.i.a.f46036b.f46059b = a3;
                com.bytedance.webx.i.c.a aVar2 = com.bytedance.webx.i.a.f46036b;
                if (!TextUtils.isEmpty(str)) {
                    str = str.substring(0, 28);
                }
                aVar2.f46060c = str;
                com.bytedance.webx.i.a.f46037c = true;
                a(h.a(Collections.singletonList("host")));
                if (f.a().f149016a) {
                    com.bytedance.webx.i.c.a aVar3 = com.bytedance.webx.i.a.f46036b;
                    h.f.b.l.b(aVar3, "");
                    aVar3.f46062e = f.a().f149017b;
                    a(e.a().f149011a);
                } else {
                    String[] a4 = af.a();
                    if (!(a4 == null || a4.length == 0)) {
                        a(n.b(Arrays.copyOf(a4, a4.length)));
                    }
                }
                c.f46067a = new com.bytedance.webx.i.a.a() {
                    /* class com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(98138);
                    }

                    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager$1$a */
                    public static final class a implements com.bytedance.retrofit2.d<String> {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a.AbstractC1144a f149004a;

                        static {
                            Covode.recordClassIndex(98139);
                        }

                        a(a.AbstractC1144a aVar) {
                            this.f149004a = aVar;
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<String> bVar, u<String> uVar) {
                            h.f.b.l.d(bVar, "");
                            h.f.b.l.d(uVar, "");
                            this.f149004a.a(uVar.f42630b);
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
                            h.f.b.l.d(bVar, "");
                            h.f.b.l.d(th, "");
                            this.f149004a.b(th.getMessage());
                        }
                    }

                    @Override // com.bytedance.webx.i.a.a
                    public final String a(String str, JSONObject jSONObject) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(jSONObject, "");
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", "application/json"));
                        String jSONObject2 = jSONObject.toString();
                        h.f.b.l.b(jSONObject2, "");
                        Charset forName = Charset.forName("UTF-8");
                        h.f.b.l.b(forName, "");
                        Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes = jSONObject2.getBytes(forName);
                        h.f.b.l.b(bytes, "");
                        return ((SecLinkDataApi) RetrofitUtils.a("https://www.tiktok.com/link/", SecLinkDataApi.class)).executePost(str, new TypedByteArray(null, bytes, new String[0]), arrayList).execute().f42630b;
                    }

                    @Override // com.bytedance.webx.i.a.a
                    public final void a(String str, JSONObject jSONObject, a.AbstractC1144a aVar) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(jSONObject, "");
                        h.f.b.l.d(aVar, "");
                        if (!TextUtils.isEmpty(str)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", "application/json"));
                            String jSONObject2 = jSONObject.toString();
                            h.f.b.l.b(jSONObject2, "");
                            Charset forName = Charset.forName("UTF-8");
                            h.f.b.l.b(forName, "");
                            Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                            byte[] bytes = jSONObject2.getBytes(forName);
                            h.f.b.l.b(bytes, "");
                            ((SecLinkDataApi) RetrofitUtils.a("https://www.tiktok.com/link/", SecLinkDataApi.class)).executePost(str, new TypedByteArray(null, bytes, new String[0]), arrayList).enqueue(new a(aVar));
                        }
                    }
                };
                return;
            }
            throw new RuntimeException("host can not be empty.");
        } else {
            throw new RuntimeException("aid can not be empty.");
        }
    }

    private static void a(List<String> list) {
        com.bytedance.webx.i.c.a aVar = com.bytedance.webx.i.a.f46036b;
        if (aVar.f46061d == null) {
            aVar.f46061d = new ArrayList();
        }
        aVar.f46061d.addAll(list);
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(WebView webView, String str) {
        h.f.b.l.d(webView, "");
        webView.addOnAttachStateChangeListener(new a());
        com.bytedance.webx.i.a.a.b bVar = new com.bytedance.webx.i.a.a.b(webView, str);
        bVar.a();
        Map<View, b> map = f149002a;
        h.f.b.l.b(bVar, "");
        map.put(webView, bVar);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || com.bytedance.webx.i.a.f46036b == null || com.bytedance.webx.i.e.d.a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        h.f.b.l.b(parse, "");
        String host = parse.getHost();
        com.bytedance.webx.i.c.a aVar = com.bytedance.webx.i.a.f46036b;
        h.f.b.l.b(aVar, "");
        List<String> list = aVar.f46061d;
        if (list != null && (!list.isEmpty())) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                h.f.b.l.b(next, "");
                if (!TextUtils.isEmpty(host)) {
                    if (TextUtils.equals(host, next)) {
                        break;
                    }
                    if (host == null) {
                        h.f.b.l.b();
                    }
                    if (p.c(host, ".".concat(String.valueOf(next)), false)) {
                        break;
                    }
                }
            }
            if (TextUtils.equals("https", parse.getScheme())) {
                return str;
            }
        }
        return com.bytedance.webx.i.e.d.a(str, str2, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r8.length() != 0) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean b(android.webkit.WebView r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager.b(android.webkit.WebView, java.lang.String):java.lang.Boolean");
    }
}
