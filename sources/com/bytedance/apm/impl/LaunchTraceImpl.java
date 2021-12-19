package com.bytedance.apm.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.block.a.g;
import com.bytedance.apm.c;
import com.bytedance.apm.c.b.d;
import com.bytedance.apm.f.a;
import com.bytedance.apm.f.e;
import com.bytedance.apm.p.b;
import com.bytedance.apm.trace.b;
import com.bytedance.apm.trace.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.k;
import com.bytedance.services.apm.api.ILaunchTrace;
import org.json.JSONObject;

public class LaunchTraceImpl implements ILaunchTrace {
    static {
        Covode.recordClassIndex(14608);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        b.a();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        if (b.f25288b) {
            com.bytedance.apm.f.a.b.b();
        }
        if (b.f25287a != null) {
            b.f25287a.f25369d.clear();
            b.f25287a = null;
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        if (b.f25287a != null) {
            e eVar = b.f25287a;
            com.bytedance.apm.e.b bVar = eVar.f25369d.get(str + "#" + str2);
            if (bVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                bVar.f24918b = currentTimeMillis;
                bVar.f24919c = name;
                eVar.f25369d.put(str + "#" + str2, bVar);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        if (b.f25287a != null) {
            e eVar = b.f25287a;
            if (eVar.f25369d.get(str + "#" + str2) == null) {
                eVar.f25369d.put(str + "#" + str2, new com.bytedance.apm.e.b(System.currentTimeMillis()));
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endTrace(int i2, String str, long j2) {
        if (b.f25288b) {
            com.bytedance.apm.f.a.b.b();
        }
        if (b.f25287a != null) {
            e eVar = b.f25287a;
            if (i2 != -1 || !c.e()) {
                e.a aVar = null;
                if (eVar.a() && !com.bytedance.apm.f.b.f24954a) {
                    com.bytedance.apm.f.b.f24954a = true;
                    if (a.C0529a.f24928a.a().f24955a && com.bytedance.apm.internal.a.b(4)) {
                        aVar = com.bytedance.apm.f.e.a();
                    }
                }
                eVar.f25368c = System.currentTimeMillis();
                long j3 = eVar.f25368c - eVar.f25367b;
                if (j2 <= 0 || j3 <= j2) {
                    if (eVar.a() && com.bytedance.p.b.c.f41756e && com.bytedance.apm.trace.e.f25366a) {
                        com.bytedance.apm.trace.e.f25366a = false;
                        long j4 = eVar.f25367b;
                        long j5 = eVar.f25368c;
                        long[] b2 = g.b();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (b2 != null) {
                            b.a.f25210a.a(new Runnable(b2, uptimeMillis, j5, j4, i2, "") {
                                /* class com.bytedance.apm.trace.e.AnonymousClass3 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ long[] f25382a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ long f25383b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ long f25384c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ long f25385d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ int f25386e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ String f25387f;

                                static {
                                    Covode.recordClassIndex(14757);
                                }

                                public final void run() {
                                    try {
                                        String a2 = g.a(this.f25382a, this.f25383b);
                                        if (!TextUtils.isEmpty(a2)) {
                                            long j2 = this.f25384c - this.f25385d;
                                            JSONObject c2 = k.a().c();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("is_main_process", c.b());
                                            jSONObject.put("block_duration", j2);
                                            jSONObject.put("stack", a2);
                                            jSONObject.put("stack_key", "1048574\n");
                                            jSONObject.put("scene", "launchTrace");
                                            jSONObject.put("cost_time", j2);
                                            jSONObject.put("method_time", j2);
                                            jSONObject.put("message", "launchTrace");
                                            jSONObject.put("event_type", "lag_drop_frame");
                                            JSONObject a3 = com.bytedance.b.i.a.c.a().a(true);
                                            a3.put("crash_section", c.a(System.currentTimeMillis()));
                                            a3.put("trace_type", "launchTrace");
                                            a3.put("launchMode", String.valueOf(this.f25386e));
                                            a3.put("customLaunchMode", this.f25387f);
                                            jSONObject.put("custom", c2);
                                            jSONObject.put("filters", a3);
                                            com.bytedance.apm.c.a.a.b().a(new d("drop_frame_stack", jSONObject));
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                {
                                    this.f25382a = r2;
                                    this.f25383b = r3;
                                    this.f25384c = r5;
                                    this.f25385d = r7;
                                    this.f25386e = r9;
                                    this.f25387f = r10;
                                }
                            });
                        }
                    }
                    if (!eVar.a() || !a.C0529a.f24928a.b().f25290b || !com.bytedance.apm.internal.a.b(8)) {
                        b.a.f25210a.a(new Runnable(aVar, i2, "", str) {
                            /* class com.bytedance.apm.trace.e.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e.a f25377a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ int f25378b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f25379c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ String f25380d;

                            static {
                                Covode.recordClassIndex(14756);
                            }

                            public final void run() {
                                e.a aVar;
                                if (e.this.a()) {
                                    long a2 = com.bytedance.apm.f.a.a.a();
                                    if (!(a2 == 0 || (aVar = this.f25377a) == null)) {
                                        aVar.f24988l = a2;
                                    }
                                }
                                e eVar = e.this;
                                eVar.a(this.f25378b, this.f25379c, this.f25380d, eVar.f25368c, this.f25377a);
                            }

                            {
                                this.f25377a = r2;
                                this.f25378b = r3;
                                this.f25379c = r4;
                                this.f25380d = r5;
                            }
                        });
                    } else {
                        e.AnonymousClass1 r5 = new e.a(aVar, i2, "", str) {
                            /* class com.bytedance.apm.trace.e.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e.a f25372a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ int f25373b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f25374c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ String f25375d;

                            static {
                                Covode.recordClassIndex(14755);
                            }

                            @Override // com.bytedance.apm.trace.e.a
                            public final void a(long j2) {
                                e.a aVar;
                                e.a aVar2;
                                if (!(j2 == -1 || (aVar2 = this.f25372a) == null)) {
                                    aVar2.f24987k = j2;
                                }
                                long a2 = com.bytedance.apm.f.a.a.a();
                                if (!(a2 == 0 || (aVar = this.f25372a) == null)) {
                                    aVar.f24988l = a2;
                                }
                                e eVar = e.this;
                                eVar.a(this.f25373b, this.f25374c, this.f25375d, eVar.f25368c, this.f25372a);
                            }

                            {
                                this.f25372a = r2;
                                this.f25373b = r3;
                                this.f25374c = r4;
                                this.f25375d = r5;
                            }
                        };
                        if (!a.C0529a.f24928a.b().f25293e) {
                            k.a();
                            LockMonitorManager.setOpenFetchStack(false);
                            if (k.f41545a) {
                                try {
                                    MonitorJni.doCloseLockStackTrace();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        b.a.f25210a.a(new Runnable(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00da: INVOKE  
                              (wrap: com.bytedance.apm.p.b : 0x00d3: SGET  (r1v4 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
                              (wrap: com.bytedance.monitor.collector.k$3 : 0x00d7: CONSTRUCTOR  (r0v24 com.bytedance.monitor.collector.k$3) = 
                              (wrap: com.bytedance.monitor.collector.k : 0x00c8: INVOKE  (r3v0 com.bytedance.monitor.collector.k) =  type: STATIC call: com.bytedance.monitor.collector.k.a():com.bytedance.monitor.collector.k)
                              (wrap: com.bytedance.apm.f.a.c$1 : 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR)
                             call: com.bytedance.monitor.collector.k.3.<init>(com.bytedance.monitor.collector.k, com.bytedance.monitor.collector.k$a):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d7: CONSTRUCTOR  (r0v24 com.bytedance.monitor.collector.k$3) = 
                              (wrap: com.bytedance.monitor.collector.k : 0x00c8: INVOKE  (r3v0 com.bytedance.monitor.collector.k) =  type: STATIC call: com.bytedance.monitor.collector.k.a():com.bytedance.monitor.collector.k)
                              (wrap: com.bytedance.apm.f.a.c$1 : 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR)
                             call: com.bytedance.monitor.collector.k.3.<init>(com.bytedance.monitor.collector.k, com.bytedance.monitor.collector.k$a):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 40 more
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:697)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:631)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 46 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.f.a.c, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 53 more
                            */
                        /*
                        // Method dump skipped, instructions count: 275
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void");
                    }
                }
