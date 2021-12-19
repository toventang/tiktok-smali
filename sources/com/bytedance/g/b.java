package com.bytedance.g;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.g.c.a;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: k  reason: collision with root package name */
    private static Map<String, String> f29621k = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    JSONObject f29622a;

    /* renamed from: b  reason: collision with root package name */
    public e f29623b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Runnable> f29624c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final String f29625d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f29626e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Integer> f29627f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f29628g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private i f29629h;

    /* renamed from: i  reason: collision with root package name */
    private h f29630i;

    /* renamed from: j  reason: collision with root package name */
    private Future f29631j;

    static {
        Covode.recordClassIndex(17217);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        MethodCollector.i(9842);
        Future future = this.f29631j;
        if (future != null) {
            future.cancel(true);
        }
        this.f29631j = k.a(new Runnable() {
            /* class com.bytedance.g.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17219);
            }

            public final void run() {
                b.this.a();
            }
        }, 0);
        MethodCollector.o(9842);
    }

    public final void a() {
        try {
            StringBuilder sb = new StringBuilder(this.f29625d);
            if (!f29621k.isEmpty()) {
                if (this.f29625d.indexOf(63) < 0) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                boolean z = true;
                for (Map.Entry<String, String> entry : f29621k.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
            }
            JSONObject jSONObject = new JSONObject(this.f29630i.a(sb.toString()));
            if (jSONObject.has("code") && jSONObject.has("data") && jSONObject.optInt("code", -1) == 0) {
                a(jSONObject.getJSONObject("data"));
            }
        } catch (Exception unused) {
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j2 = jSONObject3.getLong("et");
                    if (j2 > 0) {
                        hashMap2.put(string, Long.valueOf(j2));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f29628g.clear();
        this.f29622a = jSONObject2;
        k.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: INVOKE  
              (wrap: com.bytedance.g.a$1 : 0x005d: CONSTRUCTOR  (r0v2 com.bytedance.g.a$1) = 
              (wrap: android.content.Context : 0x0057: IGET  (r1v0 android.content.Context) = (r10v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
              ("SP_EXPERIMENT_CACHE")
              ("SP_EXPERIMENT_CACHE")
              (r7v0 'jSONObject2' org.json.JSONObject)
             call: com.bytedance.g.a.1.<init>(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.b.a(org.json.JSONObject):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: CONSTRUCTOR  (r0v2 com.bytedance.g.a$1) = 
              (wrap: android.content.Context : 0x0057: IGET  (r1v0 android.content.Context) = (r10v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
              ("SP_EXPERIMENT_CACHE")
              ("SP_EXPERIMENT_CACHE")
              (r7v0 'jSONObject2' org.json.JSONObject)
             call: com.bytedance.g.a.1.<init>(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.g.b.a(org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.g.b.a(org.json.JSONObject):void");
    }

    private <T> T a(String str, Type type) {
        try {
            if (this.f29628g.containsKey(str) && this.f29628g.get(str).getClass() == type) {
                return (T) this.f29628g.get(str);
            }
            T t = (T) this.f29629h.a(this.f29622a.optString(str, ""), type);
            if (t == null) {
                this.f29628g.remove(str);
                return null;
            }
            this.f29628g.put(str, t);
            return t;
        } catch (Exception unused) {
            this.f29628g.remove(str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(final String str, final a<T> aVar, boolean z) {
        int nextInt;
        MethodCollector.i(9845);
        if (aVar == null || TextUtils.isEmpty(aVar.f29664a) || aVar.f29666c == null || aVar.f29666c.length == 0) {
            MethodCollector.o(9845);
            return null;
        }
        String str2 = aVar.f29664a;
        synchronized (this) {
            try {
                if (this.f29627f.containsKey(str2)) {
                    nextInt = this.f29627f.get(str2).intValue();
                } else {
                    nextInt = new Random().nextInt(1000);
                    this.f29627f.put(str2, Integer.valueOf(nextInt));
                    k.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: INVOKE  
                          (wrap: com.bytedance.g.a$2 : 0x0054: CONSTRUCTOR  (r0v12 com.bytedance.g.a$2) = 
                          (wrap: android.content.Context : 0x004e: IGET  (r2v0 android.content.Context) = (r12v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
                          ("CLIENT_EXPERIMENT_CACHE_TAG")
                          (r3v0 'str2' java.lang.String)
                          (r8v0 'nextInt' int)
                         call: com.bytedance.g.a.2.<init>(android.content.Context, java.lang.String, java.lang.String, int):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.b.a(java.lang.String, com.bytedance.g.c.a<T>, boolean):T, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: CONSTRUCTOR  (r0v12 com.bytedance.g.a$2) = 
                          (wrap: android.content.Context : 0x004e: IGET  (r2v0 android.content.Context) = (r12v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
                          ("CLIENT_EXPERIMENT_CACHE_TAG")
                          (r3v0 'str2' java.lang.String)
                          (r8v0 'nextInt' int)
                         call: com.bytedance.g.a.2.<init>(android.content.Context, java.lang.String, java.lang.String, int):void type: CONSTRUCTOR in method: com.bytedance.g.b.a(java.lang.String, com.bytedance.g.c.a<T>, boolean):T, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 185
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.g.b.a(java.lang.String, com.bytedance.g.c.a, boolean):java.lang.Object");
                }

                /* access modifiers changed from: package-private */
                public final <T> T a(String str, Type type, boolean z) {
                    T t = null;
                    if (type == Boolean.class || type == Boolean.TYPE) {
                        if (this.f29622a.has(str)) {
                            t = (T) Boolean.valueOf(this.f29622a.optBoolean(str));
                        }
                    } else if (type == Integer.class || type == Short.class || type == Integer.TYPE || type == Short.TYPE) {
                        if (this.f29622a.has(str)) {
                            t = (T) Integer.valueOf(this.f29622a.optInt(str));
                        }
                    } else if (type == Float.class || type == Float.TYPE) {
                        if (this.f29622a.has(str)) {
                            t = (T) Float.valueOf((float) this.f29622a.optDouble(str));
                        }
                    } else if (type == Long.class || type == Long.TYPE) {
                        if (this.f29622a.has(str)) {
                            t = (T) Long.valueOf(this.f29622a.optLong(str));
                        }
                    } else if (type != Double.class && type != Double.TYPE) {
                        t = type == String.class ? (T) this.f29622a.optString(str, null) : (T) a(str, type);
                    } else if (this.f29622a.has(str)) {
                        t = (T) Double.valueOf(this.f29622a.optDouble(str));
                    }
                    AnonymousClass3 r2 = new Runnable(str, false) {
                        /* class com.bytedance.g.b.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f29634a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ boolean f29635b = false;

                        static {
                            Covode.recordClassIndex(17220);
                        }

                        public final void run() {
                            e eVar = b.this.f29623b;
                            String str = this.f29634a;
                            boolean z = this.f29635b;
                            if (!eVar.f29678e.containsKey(str)) {
                                return;
                            }
                            if (!z || !TextUtils.isEmpty(eVar.f29677d)) {
                                String str2 = eVar.f29678e.get(str);
                                if (!TextUtils.isEmpty(str2) && !eVar.f29675b.contains(str2) && !eVar.f29676c.contains(str2)) {
                                    if (z) {
                                        eVar.f29676c.add(str2);
                                        a.a(eVar.f29674a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE_" + eVar.f29677d, eVar.f29675b);
                                    } else {
                                        eVar.f29675b.add(str2);
                                        a.a(eVar.f29674a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", eVar.f29675b);
                                    }
                                    eVar.a();
                                }
                            }
                        }

                        {
                            this.f29634a = r3;
                        }
                    };
                    if (z) {
                        r2.run();
                    } else {
                        this.f29624c.put(str, r2);
                    }
                    return t;
                }

                b(Application application, String str, boolean z, i iVar, g gVar, h hVar, Map<String, String> map, Set<String> set) {
                    this.f29625d = str;
                    f29621k = map;
                    this.f29626e = application;
                    this.f29622a = a.a(application, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_CACHE");
                    this.f29627f = a.b(application, "CLIENT_EXPERIMENT_CACHE_TAG");
                    this.f29623b = new e(application, gVar, set);
                    this.f29629h = iVar;
                    this.f29630i = hVar;
                    if (z) {
                        this.f29631j = k.a(new Runnable() {
                            /* class com.bytedance.g.b.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(17218);
                            }

                            public final void run() {
                                b.this.a();
                            }
                        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                }
            }
