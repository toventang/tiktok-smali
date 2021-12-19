package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.ad;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ae f35707a;

    /* renamed from: g  reason: collision with root package name */
    public static List<TimeLineEvent> f35708g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    static a f35709h;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f35710j = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final b f35711b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f35712c;

    /* renamed from: d  reason: collision with root package name */
    public final l f35713d;

    /* renamed from: e  reason: collision with root package name */
    public u f35714e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f35715f = false;

    /* renamed from: i  reason: collision with root package name */
    private final List<s> f35716i;

    public interface a {
        static {
            Covode.recordClassIndex(21321);
        }

        boolean a(ak akVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(21322);
        }

        void a();
    }

    public final <T> void a(String str, T t) {
        b();
        this.f35711b.a(str, (Object) t);
    }

    public final void a() {
        if (!this.f35715f) {
            this.f35711b.c();
            this.f35715f = true;
            for (s sVar : this.f35716i) {
                if (sVar != null) {
                    sVar.a();
                }
            }
        }
    }

    private void b() {
        if (this.f35715f) {
            k.a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    static {
        Covode.recordClassIndex(21319);
    }

    public static l a(WebView webView) {
        return new l(webView);
    }

    public static l a(x xVar) {
        l lVar = new l(xVar.f35713d);
        lVar.o = true;
        lVar.f35680i = false;
        return lVar;
    }

    public static ad a(String str) {
        if (TextUtils.isEmpty(str) || f35707a == null) {
            return null;
        }
        return f35707a.a(str, null);
    }

    x(l lVar) {
        ad adVar;
        ArrayList arrayList = new ArrayList();
        this.f35716i = arrayList;
        boolean z = false;
        this.f35713d = lVar;
        new TimeLineEvent.a().a(TimeLineEvent.b.u, Boolean.valueOf(lVar.f35680i)).a(TimeLineEvent.b.F, Boolean.valueOf(f35707a != null ? true : z)).a(TimeLineEvent.b.ak, lVar.s);
        if (!lVar.f35680i || f35707a == null) {
            adVar = null;
        } else {
            adVar = f35707a.a(lVar.f35683l, lVar.s);
        }
        if (lVar.f35672a != null) {
            am amVar = new am();
            this.f35711b = amVar;
            amVar.a(lVar, adVar);
        } else {
            b bVar = lVar.f35674c;
            this.f35711b = bVar;
            bVar.a(lVar, adVar);
        }
        this.f35712c = lVar.f35672a;
        arrayList.add(lVar.f35682k);
        k.f35671a = lVar.f35678g;
        aj.f35614a = lVar.f35679h;
    }

    public final x a(String str, e.b bVar) {
        b();
        this.f35711b.f35637l.a(str, bVar);
        u uVar = this.f35714e;
        if (uVar != null) {
            uVar.a(str);
        }
        return this;
    }

    private static void a(ad adVar, Set<String> set) {
        if (adVar != null) {
            Map<String, List<ad.b>> map = adVar.f35575a;
            if (!map.isEmpty()) {
                for (Map.Entry<String, List<ad.b>> entry : map.entrySet()) {
                    Iterator<ad.b> it = entry.getValue().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f35586b != ai.PUBLIC) {
                                set.add(entry.getKey());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    public final x a(String str, f<?, ?> fVar) {
        b();
        this.f35711b.f35637l.a(str, fVar);
        u uVar = this.f35714e;
        if (uVar != null) {
            uVar.a(str);
        }
        return this;
    }

    public final x a(String str, final x xVar) {
        u uVar;
        this.f35711b.a(str, xVar.f35711b.f35637l);
        u uVar2 = this.f35714e;
        if (!(uVar2 == null || (uVar = xVar.f35714e) == null)) {
            uVar2.a(uVar);
        }
        this.f35716i.add(new s() {
            /* class com.bytedance.ies.web.jsbridge2.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(21320);
            }

            @Override // com.bytedance.ies.web.jsbridge2.s
            public final void a() {
                xVar.a();
            }
        });
        return this;
    }

    public static Set<String> a(List<String> list, n.a aVar, String str) {
        String concat;
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (f35707a != null) {
            for (String str2 : list) {
                a(f35707a.a(str2, null), hashSet);
            }
        }
        if (hashSet.isEmpty() && !TextUtils.isEmpty(str)) {
            try {
                String a2 = aVar.a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", "");
                if (a2 != null && !a2.isEmpty()) {
                    JSONArray jSONArray = new JSONObject(a2).getJSONObject("data").getJSONObject("packages").getJSONArray(str);
                    for (String str3 : list) {
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String string = jSONObject.getString("channel");
                            if ("host".equals(str3)) {
                                concat = "_jsb_auth";
                            } else {
                                concat = "_jsb_auth.".concat(String.valueOf(str3));
                            }
                            if (string.equals(concat)) {
                                Iterator<String> keys = jSONObject.getJSONObject("content").keys();
                                while (keys.hasNext()) {
                                    hashSet.add(keys.next());
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return hashSet;
    }

    public static void a(boolean z, n nVar, b bVar, a aVar) {
        MethodCollector.i(1015);
        f35709h = aVar;
        if (f35707a == null) {
            synchronized (f35710j) {
                try {
                    if (f35707a == null) {
                        f35707a = new ae(nVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1015);
                    throw th;
                }
            }
        }
        if (z) {
            ae aeVar = f35707a;
            new TimeLineEvent.a().a(TimeLineEvent.b.E, (Object) true).a(TimeLineEvent.b.aa, f35708g);
            String jSONObject = aeVar.a().toString();
            aeVar.f35593b.a(aeVar.f35595d, "application/json", jSONObject.getBytes(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: INVOKE  
                  (wrap: com.bytedance.ies.web.jsbridge2.n : 0x0044: IGET  (r4v0 com.bytedance.ies.web.jsbridge2.n) = (r6v0 'aeVar' com.bytedance.ies.web.jsbridge2.ae) com.bytedance.ies.web.jsbridge2.ae.b com.bytedance.ies.web.jsbridge2.n)
                  (wrap: java.lang.String : 0x0046: IGET  (r3v0 java.lang.String) = (r6v0 'aeVar' com.bytedance.ies.web.jsbridge2.ae) com.bytedance.ies.web.jsbridge2.ae.d java.lang.String)
                  ("application/json")
                  (wrap: byte[] : 0x004a: INVOKE  (r1v2 byte[]) = (r5v0 'jSONObject' java.lang.String) type: VIRTUAL call: java.lang.String.getBytes():byte[])
                  (wrap: com.bytedance.ies.web.jsbridge2.ae$1 : 0x0050: CONSTRUCTOR  (r0v6 com.bytedance.ies.web.jsbridge2.ae$1) = 
                  (r6v0 'aeVar' com.bytedance.ies.web.jsbridge2.ae)
                  (r10v0 'bVar' com.bytedance.ies.web.jsbridge2.x$b)
                  (r5v0 'jSONObject' java.lang.String)
                 call: com.bytedance.ies.web.jsbridge2.ae.1.<init>(com.bytedance.ies.web.jsbridge2.ae, com.bytedance.ies.web.jsbridge2.x$b, java.lang.String):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.bytedance.ies.web.jsbridge2.n.a(java.lang.String, java.lang.String, byte[], com.bytedance.ies.web.jsbridge2.n$b):void in method: com.bytedance.ies.web.jsbridge2.x.a(boolean, com.bytedance.ies.web.jsbridge2.n, com.bytedance.ies.web.jsbridge2.x$b, com.bytedance.ies.web.jsbridge2.x$a):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r0v6 com.bytedance.ies.web.jsbridge2.ae$1) = 
                  (r6v0 'aeVar' com.bytedance.ies.web.jsbridge2.ae)
                  (r10v0 'bVar' com.bytedance.ies.web.jsbridge2.x$b)
                  (r5v0 'jSONObject' java.lang.String)
                 call: com.bytedance.ies.web.jsbridge2.ae.1.<init>(com.bytedance.ies.web.jsbridge2.ae, com.bytedance.ies.web.jsbridge2.x$b, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.ies.web.jsbridge2.x.a(boolean, com.bytedance.ies.web.jsbridge2.n, com.bytedance.ies.web.jsbridge2.x$b, com.bytedance.ies.web.jsbridge2.x$a):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.web.jsbridge2.ae, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                r7 = 1015(0x3f7, float:1.422E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r7)
                com.bytedance.ies.web.jsbridge2.x.f35709h = r11
                com.bytedance.ies.web.jsbridge2.ae r0 = com.bytedance.ies.web.jsbridge2.x.f35707a
                if (r0 != 0) goto L_0x0021
                java.lang.Object r1 = com.bytedance.ies.web.jsbridge2.x.f35710j
                monitor-enter(r1)
                com.bytedance.ies.web.jsbridge2.ae r0 = com.bytedance.ies.web.jsbridge2.x.f35707a     // Catch:{ all -> 0x001b }
                if (r0 != 0) goto L_0x0019
                com.bytedance.ies.web.jsbridge2.ae r0 = new com.bytedance.ies.web.jsbridge2.ae     // Catch:{ all -> 0x001b }
                r0.<init>(r9)     // Catch:{ all -> 0x001b }
                com.bytedance.ies.web.jsbridge2.x.f35707a = r0     // Catch:{ all -> 0x001b }
            L_0x0019:
                monitor-exit(r1)     // Catch:{ all -> 0x001b }
                goto L_0x0021
            L_0x001b:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                throw r0
            L_0x0021:
                if (r8 == 0) goto L_0x005a
                com.bytedance.ies.web.jsbridge2.ae r6 = com.bytedance.ies.web.jsbridge2.x.f35707a
                com.bytedance.ies.web.jsbridge2.TimeLineEvent$a r2 = new com.bytedance.ies.web.jsbridge2.TimeLineEvent$a
                r2.<init>()
                java.lang.String r1 = com.bytedance.ies.web.jsbridge2.TimeLineEvent.b.E
                r0 = 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.bytedance.ies.web.jsbridge2.TimeLineEvent$a r2 = r2.a(r1, r0)
                java.lang.String r1 = com.bytedance.ies.web.jsbridge2.TimeLineEvent.b.aa
                java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r0 = com.bytedance.ies.web.jsbridge2.x.f35708g
                r2.a(r1, r0)
                org.json.JSONObject r0 = r6.a()
                java.lang.String r5 = r0.toString()
                com.bytedance.ies.web.jsbridge2.n r4 = r6.f35593b
                java.lang.String r3 = r6.f35595d
                java.lang.String r2 = "application/json"
                byte[] r1 = r5.getBytes()
                com.bytedance.ies.web.jsbridge2.ae$1 r0 = new com.bytedance.ies.web.jsbridge2.ae$1
                r0.<init>(r10, r5)
                r4.a(r3, r2, r1, r0)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                return
            L_0x005a:
                com.bytedance.ies.web.jsbridge2.ae r0 = com.bytedance.ies.web.jsbridge2.x.f35707a
                r0.a(r10)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.x.a(boolean, com.bytedance.ies.web.jsbridge2.n, com.bytedance.ies.web.jsbridge2.x$b, com.bytedance.ies.web.jsbridge2.x$a):void");
        }
    }
