package com.bytedance.b.f.a;

import com.bytedance.b.c.a.b;
import com.bytedance.b.c.a.d;
import com.bytedance.b.c.a.f;
import com.bytedance.b.c.b.a;
import com.bytedance.b.c.b.c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class b implements com.bytedance.b.c.b.b {

    /* renamed from: a  reason: collision with root package name */
    a f26235a;

    /* renamed from: b  reason: collision with root package name */
    c f26236b;

    static {
        Covode.recordClassIndex(15235);
    }

    public b() {
        com.bytedance.b.f.a.a.a.a().b();
        com.bytedance.b.f.a.a.a.a().a(new com.bytedance.b.f.a.a.b() {
            /* class com.bytedance.b.f.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15236);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                b bVar = b.this;
                if (jSONObject != null) {
                    JSONObject a2 = com.bytedance.b.i.a.a.a(jSONObject, "cpu");
                    if (a2 != null) {
                        bVar.f26235a = new a();
                        if (a2.optInt("enable_upload", 0) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bVar.f26235a.f26042d = z;
                        long optLong = a2.optLong("front_collect_interval", 0);
                        if (optLong > 0) {
                            bVar.f26235a.f26039a = optLong;
                        }
                        long optLong2 = a2.optLong("back_collect_interval", 0);
                        if (optLong2 > 0) {
                            bVar.f26235a.f26040b = optLong2;
                        }
                        long optLong3 = a2.optLong("monitor_interval", 0);
                        if (optLong3 > 0) {
                            bVar.f26235a.f26041c = optLong3;
                        }
                        bVar.f26236b = new c();
                        if (a2.optInt("exception_switch", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bVar.f26236b.f26043a = z2;
                        double optDouble = a2.optDouble("exception_process_back_max_speed", 0.0d);
                        if (optDouble > 0.0d) {
                            bVar.f26236b.f26045c = optDouble;
                        }
                        double optDouble2 = a2.optDouble("exception_process_fore_max_speed", 0.0d);
                        if (optDouble > 0.0d) {
                            bVar.f26236b.f26046d = optDouble2;
                        }
                        if (a2.optInt("main_thread_collect_enabled", 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar.f26236b.f26044b = z3;
                        if (a2.optInt("exception_collect_all_process", 0) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bVar.f26236b.f26048f = z4;
                        double optDouble3 = a2.optDouble("exception_thread_max_usage", 0.0d);
                        if (optDouble3 > 0.0d) {
                            bVar.f26236b.f26047e = optDouble3;
                        }
                        JSONObject optJSONObject = a2.optJSONObject("exception_fore_max_speed_scene");
                        HashMap hashMap = new HashMap();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                double optDouble4 = optJSONObject.optDouble(next, 0.0d);
                                if (optDouble4 > 0.0d) {
                                    hashMap.put(next, Double.valueOf(optDouble4));
                                }
                            }
                        }
                        bVar.f26236b.f26050h = hashMap;
                        JSONObject optJSONObject2 = a2.optJSONObject("exception_back_max_speed_scene");
                        HashMap hashMap2 = new HashMap();
                        if (optJSONObject2 != null) {
                            Iterator<String> keys2 = optJSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                double optDouble5 = optJSONObject2.optDouble(next2, 0.0d);
                                if (optDouble5 > 0.0d) {
                                    hashMap2.put(next2, Double.valueOf(optDouble5));
                                }
                            }
                        }
                        bVar.f26236b.f26049g = hashMap2;
                    }
                    com.bytedance.b.c.a.b bVar2 = b.a.f25999a;
                    a aVar = bVar.f26235a;
                    if (aVar != null) {
                        f.a();
                        d dVar = bVar2.f25991b;
                        if (dVar.f26008b.compareAndSet(false, true)) {
                            dVar.f26012f = aVar;
                            dVar.f26009c = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012d: IPUT  
                                  (wrap: com.bytedance.b.c.a.d$1 : 0x012a: CONSTRUCTOR  (r0v10 com.bytedance.b.c.a.d$1) = (r3v0 'dVar' com.bytedance.b.c.a.d) call: com.bytedance.b.c.a.d.1.<init>(com.bytedance.b.c.a.d):void type: CONSTRUCTOR)
                                  (r3v0 'dVar' com.bytedance.b.c.a.d)
                                 com.bytedance.b.c.a.d.c com.bytedance.b.k.d.a in method: com.bytedance.b.f.a.b.1.a(org.json.JSONObject):void, file: classes.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012a: CONSTRUCTOR  (r0v10 com.bytedance.b.c.a.d$1) = (r3v0 'dVar' com.bytedance.b.c.a.d) call: com.bytedance.b.c.a.d.1.<init>(com.bytedance.b.c.a.d):void type: CONSTRUCTOR in method: com.bytedance.b.f.a.b.1.a(org.json.JSONObject):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 31 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.c.a.d, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 35 more
                                */
                            /*
                            // Method dump skipped, instructions count: 368
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.f.a.b.AnonymousClass1.a(org.json.JSONObject):void");
                        }
                    });
                }
            }
