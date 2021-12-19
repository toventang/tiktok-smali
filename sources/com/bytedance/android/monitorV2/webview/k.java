package com.bytedance.android.monitorV2.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.a.e;
import com.bytedance.android.monitorV2.d.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.webview.c.b.b;
import com.bytedance.android.monitorV2.webview.c.b.c;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public b f24222a;

    /* renamed from: b  reason: collision with root package name */
    public o f24223b;

    /* renamed from: c  reason: collision with root package name */
    Map<String, com.bytedance.android.monitorV2.webview.c.a.b> f24224c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public a f24225d;

    /* renamed from: e  reason: collision with root package name */
    private c f24226e;

    static {
        Covode.recordClassIndex(14252);
    }

    public final void a(JSONObject jSONObject) {
        b bVar = this.f24222a;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            f.a(bVar.o, next, f.e(jSONObject, next));
        }
    }

    public final void b() {
        a().f24185i = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        if (this.f24226e == null) {
            this.f24226e = new c(this.f24222a, "perf");
        }
        return this.f24226e;
    }

    public final boolean b(String str) {
        if (!a().n.contains(str)) {
            return true;
        }
        if ("blank".equals(str) || "performance".equals(str) || "resource_performance".equals(str)) {
            return false;
        }
        return true;
    }

    public final void a(WebView webView) {
        c a2 = a();
        a(webView, a2);
        a().l();
        com.bytedance.android.monitorV2.f.a.a(new Runnable(webView, a2) {
            /* class com.bytedance.android.monitorV2.webview.o.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f24294a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.monitorV2.webview.c.a.c f24295b;

            static {
                Covode.recordClassIndex(14269);
            }

            public final void run() {
                List<Object> list = o.this.f24292l.get(this.f24294a);
                if (list != null) {
                    Iterator<Object> it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }

            {
                this.f24294a = r2;
                this.f24295b = r3;
            }
        });
    }

    public final void a(a aVar) {
        this.f24225d = aVar;
        a().f24171f = aVar;
        for (com.bytedance.android.monitorV2.webview.c.a.b bVar : this.f24224c.values()) {
            if (bVar instanceof com.bytedance.android.monitorV2.webview.c.a.c) {
                ((com.bytedance.android.monitorV2.webview.c.a.c) bVar).f24171f = aVar;
            }
        }
    }

    public final void a(String str) {
        c a2 = a();
        if (!TextUtils.isEmpty(str)) {
            f.a(a2.f24189m, str, f.a(a2.f24189m, str) + 1);
            a2.n.add(str);
            com.bytedance.android.monitorV2.i.b.a("WebPerfReportData", "addCount: ".concat(String.valueOf(str)));
        }
    }

    public final void a(Map<String, Integer> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                int intValue = map.get(str).intValue();
                b bVar = this.f24222a;
                f.a(bVar.p, str, Integer.valueOf(intValue));
            }
        }
    }

    public static void a(WebView webView, com.bytedance.android.monitorV2.webview.c.a.c cVar) {
        e i2;
        if (webView != null && cVar != null && cVar.k() && (i2 = n.f24265b.i(webView)) != null) {
            i2.a(cVar);
        }
    }

    public final void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, str, jSONObject, null, null);
    }

    public final void a(WebView webView, final String str, JSONObject jSONObject, final JSONObject jSONObject2, final com.bytedance.android.monitorV2.d.b bVar) {
        AnonymousClass1 r1 = new com.bytedance.android.monitorV2.webview.c.a.c(this.f24222a, "web", str) {
            /* class com.bytedance.android.monitorV2.webview.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14253);
            }

            @Override // com.bytedance.android.monitorV2.a.g
            public final com.bytedance.android.monitorV2.a.f f() {
                return bVar;
            }

            @Override // com.bytedance.android.monitorV2.webview.c.a.c
            /* renamed from: j */
            public final com.bytedance.android.monitorV2.webview.c.a.a e() {
                if (jSONObject2 == null) {
                    return null;
                }
                return new com.bytedance.android.monitorV2.webview.c.a.a(str) {
                    /* class com.bytedance.android.monitorV2.webview.k.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14254);
                    }

                    @Override // com.bytedance.android.monitorV2.webview.c.a.a
                    public final void b() {
                    }

                    @Override // com.bytedance.android.monitorV2.a.a
                    public final void a(JSONObject jSONObject) {
                        f.a(jSONObject, jSONObject2);
                    }

                    {
                        this.f24165c = true;
                    }
                };
            }
        };
        r1.f24171f = this.f24225d;
        r1.a(jSONObject);
        a(webView, r1);
    }

    k(WebView webView, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        b bVar = new b();
        this.f24222a = bVar;
        SoftReference<WebView> softReference = new SoftReference<>(webView);
        bVar.f24175k = softReference;
        com.bytedance.android.monitorV2.f.a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
              (wrap: com.bytedance.android.monitorV2.webview.c.b.b$1 : 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitorV2.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitorV2.webview.c.b.b) call: com.bytedance.android.monitorV2.webview.c.b.b.1.<init>(com.bytedance.android.monitorV2.webview.c.b.b):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.android.monitorV2.f.a.a(java.lang.Runnable):void in method: com.bytedance.android.monitorV2.webview.k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitorV2.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitorV2.webview.c.b.b) call: com.bytedance.android.monitorV2.webview.c.b.b.1.<init>(com.bytedance.android.monitorV2.webview.c.b.b):void type: CONSTRUCTOR in method: com.bytedance.android.monitorV2.webview.k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.monitorV2.webview.c.b.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void");
    }
}
