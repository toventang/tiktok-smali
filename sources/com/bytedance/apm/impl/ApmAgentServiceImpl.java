package com.bytedance.apm.impl;

import android.content.Context;
import com.bytedance.apm.config.d;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.b;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    static {
        Covode.recordClassIndex(14606);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j2, long j3, boolean z) {
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(b bVar) {
        d.a a2 = d.a();
        a2.f24827a = bVar.f44094a;
        a2.f24828b = bVar.f44095b;
        a2.f24829c = bVar.f44096c;
        a2.f24830d = bVar.f44097d;
        a2.f24831e = bVar.f44098e;
        a2.f24832f = bVar.f44099f;
        com.bytedance.apm.b.a(a2.a());
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        com.bytedance.apm.b.a(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        com.bytedance.apm.b.a(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        JSONObject a2 = com.bytedance.apm.b.a(jSONObject);
        b.a.f25210a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x0004: SGET  (r1v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$7 : 0x0008: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$7) = (r4v0 'str' java.lang.String), (r2v0 'a2' org.json.JSONObject) call: com.bytedance.apm.b.7.<init>(java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$7) = (r4v0 'str' java.lang.String), (r2v0 'a2' org.json.JSONObject) call: com.bytedance.apm.b.7.<init>(java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            org.json.JSONObject r2 = com.bytedance.apm.b.a(r5)
            com.bytedance.apm.p.b r1 = com.bytedance.apm.p.b.a.f25210a
            com.bytedance.apm.b$7 r0 = new com.bytedance.apm.b$7
            r0.<init>(r4, r2)
            r1.a(r0)
            boolean r0 = com.bytedance.apm.c.f24687c
            if (r0 == 0) goto L_0x001e
            com.bytedance.apm.p.c r1 = com.bytedance.apm.p.c.a()
            com.bytedance.apm.b$9 r0 = new com.bytedance.apm.b$9
            r0.<init>(r4, r2)
            r1.a(r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void");
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.apm.b.a(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i2, JSONObject jSONObject) {
        com.bytedance.apm.b.a(str, i2, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.apm.b.a(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.apm.b.a(str, i2, jSONObject, jSONObject2);
    }
}
