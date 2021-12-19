package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final l f22346a;

    static {
        Covode.recordClassIndex(13191);
    }

    m(l lVar) {
        this.f22346a = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        l lVar = this.f22346a;
        if (i2 == 0) {
            c.a(lVar.f22333a, lVar.f22334b);
        } else if (i2 == 1) {
            Activity activity = lVar.f22333a;
            Fragment fragment = lVar.f22334b;
            String str = lVar.f22335c;
            String d2 = lVar.d();
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                n.a(activity, 2131234317, (int) R.string.gmc);
            } else {
                f.a(activity).a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: INVOKE  
                      (wrap: com.bytedance.android.livesdk.ah.f$b : 0x0035: INVOKE  (r3v0 com.bytedance.android.livesdk.ah.f$b) = (r7v0 'activity' android.app.Activity) type: STATIC call: com.bytedance.android.livesdk.ah.f.a(android.app.Activity):com.bytedance.android.livesdk.ah.f$b)
                      (wrap: com.bytedance.android.livesdk.utils.c$2 : 0x003b: CONSTRUCTOR  (r2v1 com.bytedance.android.livesdk.utils.c$2) = 
                      (r5v0 'str' java.lang.String)
                      (r4v0 'd2' java.lang.String)
                      (r7v0 'activity' android.app.Activity)
                      (r6v0 'fragment' androidx.fragment.app.Fragment)
                     call: com.bytedance.android.livesdk.utils.c.2.<init>(java.lang.String, java.lang.String, android.app.Activity, androidx.fragment.app.Fragment):void type: CONSTRUCTOR)
                      (wrap: java.lang.String[] : 0x0042: FILLED_NEW_ARRAY  (r0v5 java.lang.String[]) = ("android.permission.CAMERA"), ("android.permission.WRITE_EXTERNAL_STORAGE") elemType: java.lang.String)
                     type: VIRTUAL call: com.bytedance.android.livesdk.ah.f.b.a(com.bytedance.android.livesdk.ah.b.d, java.lang.String[]):void in method: com.bytedance.android.livesdk.utils.m.onClick(android.content.DialogInterface, int):void, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r2v1 com.bytedance.android.livesdk.utils.c$2) = 
                      (r5v0 'str' java.lang.String)
                      (r4v0 'd2' java.lang.String)
                      (r7v0 'activity' android.app.Activity)
                      (r6v0 'fragment' androidx.fragment.app.Fragment)
                     call: com.bytedance.android.livesdk.utils.c.2.<init>(java.lang.String, java.lang.String, android.app.Activity, androidx.fragment.app.Fragment):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.utils.m.onClick(android.content.DialogInterface, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.utils.c, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                    this = this;
                    com.bytedance.android.livesdk.utils.l r2 = r8.f22346a
                    if (r10 == 0) goto L_0x004a
                    r0 = 1
                    if (r10 == r0) goto L_0x0015
                    r0 = 2
                    if (r10 == r0) goto L_0x000b
                L_0x000a:
                    return
                L_0x000b:
                    com.bytedance.android.live.n.h$a r0 = r2.f22337e
                    if (r0 == 0) goto L_0x000a
                    com.bytedance.android.live.n.h$a r0 = r2.f22337e
                    r0.a()
                    goto L_0x000a
                L_0x0015:
                    android.app.Activity r7 = r2.f22333a
                    androidx.fragment.app.Fragment r6 = r2.f22334b
                    java.lang.String r5 = r2.f22335c
                    java.lang.String r4 = r2.d()
                    java.lang.String r1 = android.os.Environment.getExternalStorageState()
                    java.lang.String r0 = "mounted"
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L_0x0035
                    r1 = 2131234317(0x7f080e0d, float:1.8084796E38)
                    r0 = 2131830694(0x7f1127a6, float:1.9294393E38)
                    com.bytedance.common.utility.n.a(r7, r1, r0)
                    return
                L_0x0035:
                    com.bytedance.android.livesdk.ah.f$b r3 = com.bytedance.android.livesdk.ah.f.a(r7)
                    com.bytedance.android.livesdk.utils.c$2 r2 = new com.bytedance.android.livesdk.utils.c$2
                    r2.<init>(r5, r4, r7, r6)
                    java.lang.String r1 = "android.permission.CAMERA"
                    java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
                    java.lang.String[] r0 = new java.lang.String[]{r1, r0}
                    r3.a(r2, r0)
                    return
                L_0x004a:
                    android.app.Activity r1 = r2.f22333a
                    androidx.fragment.app.Fragment r0 = r2.f22334b
                    com.bytedance.android.livesdk.utils.c.a(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.m.onClick(android.content.DialogInterface, int):void");
            }
        }
