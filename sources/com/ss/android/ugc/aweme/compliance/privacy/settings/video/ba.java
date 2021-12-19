package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.a;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class ba implements IPrivacyConfig.IPermissionPostCallback {

    /* renamed from: a  reason: collision with root package name */
    private final a f77874a;

    static {
        Covode.recordClassIndex(48262);
    }

    ba(a aVar) {
        this.f77874a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionPostCallback
    public final void doPostData(int i2) {
        String aid;
        a aVar = this.f77874a;
        aVar.getContext();
        if (!a.e()) {
            aVar.c(R.string.de7);
        } else if (aVar.f77828c != null) {
            int privateStatus = aVar.f77828c.getStatus().getPrivateStatus();
            if (i2 != 1 || !aVar.f77828c.isTop()) {
                aVar.a(i2);
                aVar.f77827b.receivePermissionResult(i2);
                if (!(i2 == privateStatus || aVar.f77828c == null)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_photo", m.d(aVar.f77828c) ? 1 : 0);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    MobClick labelName = MobClick.obtain().setEventName("scope_click").setLabelName("share_option");
                    if (aVar.f77828c == null) {
                        aid = "0";
                    } else {
                        aid = aVar.f77828c.getAid();
                    }
                    r.onEvent(labelName.setValue(aid).setJsonObject(jSONObject));
                    a.AnonymousClass2 r5 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0082: CONSTRUCTOR  (r5v0 'r5' com.ss.android.ugc.aweme.compliance.privacy.settings.video.a$2) = 
                          (r3v0 'aVar' com.ss.android.ugc.aweme.compliance.privacy.settings.video.a)
                          (wrap: androidx.fragment.app.e : 0x007e: INVOKE  (r0v18 androidx.fragment.app.e) = (r3v0 'aVar' com.ss.android.ugc.aweme.compliance.privacy.settings.video.a) type: VIRTUAL call: androidx.fragment.app.Fragment.getActivity():androidx.fragment.app.e)
                          (r2v0 'privateStatus' int)
                          (r10v0 'i2' int)
                         call: com.ss.android.ugc.aweme.compliance.privacy.settings.video.a.2.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.video.a, android.app.Activity, int, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ba.doPostData(int):void, file: classes3.dex
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
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.compliance.privacy.settings.video.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 361
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ba.doPostData(int):void");
                }
            }
