package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.d.a;
import com.bytedance.framwork.core.sdkmonitor.k;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKMonitorUtils {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, k> f29510a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, List<String>> f29511b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentHashMap<String, List<String>> f29512c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(17184);
    }

    public static k a(String str) {
        MethodCollector.i(11589);
        if (!TextUtils.isEmpty(str)) {
            if (f29510a.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    try {
                        if (f29510a.get(str) == null) {
                            f29510a.put(str, new k(str));
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11589);
                        throw th;
                    }
                }
            }
            k kVar = f29510a.get(str);
            MethodCollector.o(11589);
            return kVar;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        MethodCollector.o(11589);
        throw illegalArgumentException;
    }

    public static List<String> a(List<String> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                linkedList.add(("https://" + new URL(it.next()).getHost()) + "/monitor/collect/");
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
        }
        return linkedList;
    }

    public static synchronized void b(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.i(11586);
            if (TextUtils.isEmpty(str) || g.a(list)) {
                MethodCollector.o(11586);
                return;
            }
            f29511b.put(str, a(list));
            MethodCollector.o(11586);
        }
    }

    public static synchronized void a(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.i(11585);
            if (TextUtils.isEmpty(str) || g.a(list)) {
                MethodCollector.o(11585);
                return;
            }
            LinkedList linkedList = new LinkedList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    linkedList.add(("https://" + new URL(it.next()).getHost()) + "/monitor/appmonitor/v3/settings");
                } catch (MalformedURLException e2) {
                    e2.printStackTrace();
                }
            }
            f29512c.put(str, linkedList);
            MethodCollector.o(11585);
        }
    }

    public static synchronized void a(Context context, String str, JSONObject jSONObject, k.a aVar) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.i(11588);
            if (context == null) {
                MethodCollector.o(11588);
            } else if (TextUtils.isEmpty(str)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
                MethodCollector.o(11588);
                throw illegalArgumentException;
            } else if (jSONObject == null) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
                MethodCollector.o(11588);
                throw illegalArgumentException2;
            } else if (f29510a.get(str) == null || !f29510a.get(str).q) {
                k kVar = f29510a.get(str);
                if (kVar == null) {
                    kVar = new k(str);
                    f29510a.put(str, kVar);
                }
                List<String> remove = f29512c.remove(str);
                if (remove != null && !g.a(remove)) {
                    kVar.n.clear();
                    kVar.n.addAll(remove);
                }
                List<String> remove2 = f29511b.remove(str);
                if (remove2 != null && !g.a(remove2)) {
                    kVar.s.clear();
                    kVar.s.addAll(remove2);
                }
                kVar.q = true;
                a aVar2 = a.C0627a.f29455a;
                aVar2.f29450a.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0086: INVOKE  
                      (wrap: com.bytedance.framwork.core.b.d.d : 0x0082: IGET  (r2v3 com.bytedance.framwork.core.b.d.d) = (r0v10 'aVar2' com.bytedance.framwork.core.b.d.a) com.bytedance.framwork.core.b.d.a.a com.bytedance.framwork.core.b.d.d)
                      (wrap: com.bytedance.framwork.core.sdkmonitor.k$1 : 0x007f: CONSTRUCTOR  (r3v0 com.bytedance.framwork.core.sdkmonitor.k$1) = 
                      (r2v2 'kVar' com.bytedance.framwork.core.sdkmonitor.k)
                      (r6v0 'context' android.content.Context)
                      (r8v0 'jSONObject' org.json.JSONObject)
                      (r9v0 'aVar' com.bytedance.framwork.core.sdkmonitor.k$a)
                     call: com.bytedance.framwork.core.sdkmonitor.k.1.<init>(com.bytedance.framwork.core.sdkmonitor.k, android.content.Context, org.json.JSONObject, com.bytedance.framwork.core.sdkmonitor.k$a):void type: CONSTRUCTOR)
                      (5000 long)
                     type: VIRTUAL call: com.bytedance.framwork.core.b.d.d.a(java.lang.Runnable, long):boolean in method: com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.a(android.content.Context, java.lang.String, org.json.JSONObject, com.bytedance.framwork.core.sdkmonitor.k$a):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: CONSTRUCTOR  (r3v0 com.bytedance.framwork.core.sdkmonitor.k$1) = 
                      (r2v2 'kVar' com.bytedance.framwork.core.sdkmonitor.k)
                      (r6v0 'context' android.content.Context)
                      (r8v0 'jSONObject' org.json.JSONObject)
                      (r9v0 'aVar' com.bytedance.framwork.core.sdkmonitor.k$a)
                     call: com.bytedance.framwork.core.sdkmonitor.k.1.<init>(com.bytedance.framwork.core.sdkmonitor.k, android.content.Context, org.json.JSONObject, com.bytedance.framwork.core.sdkmonitor.k$a):void type: CONSTRUCTOR in method: com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.a(android.content.Context, java.lang.String, org.json.JSONObject, com.bytedance.framwork.core.sdkmonitor.k$a):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 32 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.framwork.core.sdkmonitor.k, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 38 more
                    */
                /*
                // Method dump skipped, instructions count: 167
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.a(android.content.Context, java.lang.String, org.json.JSONObject, com.bytedance.framwork.core.sdkmonitor.k$a):void");
            }
        }
