package com.bytedance.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    Context f29674a;

    /* renamed from: b  reason: collision with root package name */
    Set<String> f29675b;

    /* renamed from: c  reason: collision with root package name */
    Set<String> f29676c;

    /* renamed from: d  reason: collision with root package name */
    String f29677d;

    /* renamed from: e  reason: collision with root package name */
    Map<String, String> f29678e;

    /* renamed from: f  reason: collision with root package name */
    Map<String, Map<String, String>> f29679f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public List<String> f29680g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    private g f29681h;

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f29682i = new ConcurrentSkipListSet();

    /* renamed from: j  reason: collision with root package name */
    private Set<String> f29683j;

    /* renamed from: k  reason: collision with root package name */
    private String f29684k;

    static {
        Covode.recordClassIndex(17231);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        String a2;
        if (!this.f29675b.isEmpty() || !this.f29676c.isEmpty() || !this.f29682i.isEmpty() || !this.f29683j.isEmpty()) {
            a2 = a(this.f29675b, this.f29676c, this.f29682i, this.f29683j);
        } else {
            a2 = null;
        }
        if (!TextUtils.equals(a2, this.f29684k)) {
            this.f29684k = a2;
            g gVar = this.f29681h;
            if (gVar != null) {
                gVar.a(a2);
            }
        }
    }

    private static String a(Set<String>... setArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        int i2 = 0;
        do {
            Set<String> set = setArr[i2];
            if (set != null) {
                for (String str : set) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(',');
                    }
                    sb.append(str);
                }
            }
            i2++;
        } while (i2 < 4);
        return sb.toString();
    }

    public final void a(String str, List<String> list) {
        Map<String, String> map = this.f29679f.get(str);
        for (String str2 : map.keySet()) {
            if (!list.contains(str2)) {
                try {
                    this.f29682i.remove(map.get(str2));
                    map.remove(str2);
                    k.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                          (wrap: com.bytedance.g.a$6 : 0x003c: CONSTRUCTOR  (r0v6 com.bytedance.g.a$6) = 
                          (wrap: android.content.Context : 0x002e: IGET  (r2v0 android.content.Context) = (r6v0 'this' com.bytedance.g.e A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.e.a android.content.Context)
                          (wrap: java.lang.String : 0x0036: INVOKE  (r1v2 java.lang.String) = 
                          ("SP_CLIENT_EXPOSURE_CACHE$$$")
                          (wrap: java.lang.String : 0x0032: INVOKE  (r0v5 java.lang.String) = (r7v0 'str' java.lang.String) type: STATIC call: java.lang.String.valueOf(java.lang.Object):java.lang.String)
                         type: VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String)
                          (r3v1 'str2' java.lang.String)
                         call: com.bytedance.g.a.6.<init>(android.content.Context, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.e.a(java.lang.String, java.util.List<java.lang.String>):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: CONSTRUCTOR  (r0v6 com.bytedance.g.a$6) = 
                          (wrap: android.content.Context : 0x002e: IGET  (r2v0 android.content.Context) = (r6v0 'this' com.bytedance.g.e A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.e.a android.content.Context)
                          (wrap: java.lang.String : 0x0036: INVOKE  (r1v2 java.lang.String) = 
                          ("SP_CLIENT_EXPOSURE_CACHE$$$")
                          (wrap: java.lang.String : 0x0032: INVOKE  (r0v5 java.lang.String) = (r7v0 'str' java.lang.String) type: STATIC call: java.lang.String.valueOf(java.lang.Object):java.lang.String)
                         type: VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String)
                          (r3v1 'str2' java.lang.String)
                         call: com.bytedance.g.a.6.<init>(android.content.Context, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.g.e.a(java.lang.String, java.util.List<java.lang.String>):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                        this = this;
                        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r6.f29679f
                        java.lang.Object r5 = r0.get(r7)
                        java.util.Map r5 = (java.util.Map) r5
                        java.util.Set r0 = r5.keySet()
                        java.util.Iterator r4 = r0.iterator()
                    L_0x0010:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0043
                        java.lang.Object r3 = r4.next()
                        java.lang.String r3 = (java.lang.String) r3
                        boolean r0 = r8.contains(r3)
                        if (r0 != 0) goto L_0x0010
                        java.util.Set<java.lang.String> r1 = r6.f29682i     // Catch:{ all -> 0x0010 }
                        java.lang.Object r0 = r5.get(r3)     // Catch:{ all -> 0x0010 }
                        r1.remove(r0)     // Catch:{ all -> 0x0010 }
                        r5.remove(r3)     // Catch:{ all -> 0x0010 }
                        android.content.Context r2 = r6.f29674a     // Catch:{ all -> 0x0010 }
                        java.lang.String r1 = "SP_CLIENT_EXPOSURE_CACHE$$$"
                        java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0010 }
                        java.lang.String r1 = r1.concat(r0)     // Catch:{ all -> 0x0010 }
                        com.bytedance.g.a$6 r0 = new com.bytedance.g.a$6     // Catch:{ all -> 0x0010 }
                        r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x0010 }
                        com.bytedance.g.k.a(r0)     // Catch:{ all -> 0x0010 }
                        goto L_0x0010
                    L_0x0043:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.g.e.a(java.lang.String, java.util.List):void");
                }

                e(Context context, g gVar, Set<String> set) {
                    this.f29674a = context;
                    this.f29681h = gVar;
                    this.f29683j = set;
                    this.f29677d = a.a(context, "SP_EXPERIMENT_CACHE").getString("ab_test_current_uid", "");
                    this.f29675b = a.b(context, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE");
                    this.f29676c = a.b(context, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE_" + this.f29677d);
                    this.f29678e = a.c(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
                    for (String str : a.b(context, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE")) {
                        Map<String, String> c2 = a.c(context, "SP_CLIENT_EXPOSURE_CACHE$$$".concat(String.valueOf(str)));
                        this.f29679f.put(str, c2);
                        this.f29682i.addAll(c2.values());
                    }
                    a();
                    k.f29686a.schedule(new Runnable() {
                        /* class com.bytedance.g.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17232);
                        }

                        public final void run() {
                            e eVar = e.this;
                            eVar.a("ab_test_noapt_module_name", eVar.f29680g);
                        }
                    }, 5000, TimeUnit.MILLISECONDS);
                }

                /* access modifiers changed from: package-private */
                public final <T> void a(String str, a<T> aVar, String str2) {
                    if (aVar != null) {
                        String str3 = aVar.f29667d;
                        if (!this.f29679f.containsKey(str3)) {
                            this.f29679f.put(str3, new ConcurrentHashMap());
                            a.a(this.f29674a, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", this.f29679f.keySet());
                        }
                        if (aVar.f29668e != null) {
                            a(str3, Arrays.asList(aVar.f29668e));
                        } else {
                            this.f29680g.add(str);
                        }
                        Map<String, String> map = this.f29679f.get(str3);
                        String str4 = map.get(str);
                        if (!TextUtils.equals(str4, str2)) {
                            if (!TextUtils.isEmpty(str4)) {
                                this.f29682i.remove(str4);
                                map.remove(str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                this.f29682i.add(str2);
                                map.put(str, str2);
                            }
                            a.a(this.f29674a, "SP_CLIENT_EXPOSURE_CACHE$$$".concat(String.valueOf(str3)), str, str2);
                            a();
                        }
                    }
                }
            }
