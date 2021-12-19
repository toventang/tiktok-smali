package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.utils.ActivityStack;

final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f138534a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f138535b;

    static {
        Covode.recordClassIndex(90624);
    }

    t(Bundle bundle, boolean z) {
        this.f138534a = bundle;
        this.f138535b = z;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f138534a;
        boolean z = this.f138535b;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (z) {
            bundle.putBoolean("needCheckSocialRecDialog", true);
        }
        Activity topActivity = ActivityStack.getTopActivity();
        com.ss.android.ugc.aweme.friends.service.b q = a.f97047a.q();
        if (topActivity == null || q == null) {
            a.C1369a.a(bundle);
            return;
        }
        topActivity.getLocalClassName();
        q.a(topActivity, z, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE  
              (r1v0 'q' com.ss.android.ugc.aweme.friends.service.b)
              (r2v0 'topActivity' android.app.Activity)
              (r3v0 'z' boolean)
              (wrap: com.ss.android.ugc.aweme.i$1 : 0x0026: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.i$1) = (r5v1 'bundle' android.os.Bundle) call: com.ss.android.ugc.aweme.i.1.<init>(android.os.Bundle):void type: CONSTRUCTOR)
             type: INTERFACE call: com.ss.android.ugc.aweme.friends.service.b.a(android.app.Activity, boolean, com.ss.android.ugc.aweme.friends.service.IFriendsService$c):void in method: com.ss.android.ugc.aweme.t.a(android.os.Bundle):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.i$1) = (r5v1 'bundle' android.os.Bundle) call: com.ss.android.ugc.aweme.i.1.<init>(android.os.Bundle):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.t.a(android.os.Bundle):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.i, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            android.os.Bundle r0 = r4.f138534a
            boolean r3 = r4.f138535b
            if (r5 != 0) goto L_0x0007
            r5 = r0
        L_0x0007:
            if (r3 == 0) goto L_0x000f
            r1 = 1
            java.lang.String r0 = "needCheckSocialRecDialog"
            r5.putBoolean(r0, r1)
        L_0x000f:
            android.app.Activity r2 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            com.ss.android.ugc.aweme.friends.service.a r0 = com.ss.android.ugc.aweme.friends.service.a.f97047a
            com.ss.android.ugc.aweme.friends.service.b r1 = r0.q()
            if (r2 == 0) goto L_0x001d
            if (r1 != 0) goto L_0x0021
        L_0x001d:
            com.ss.android.ugc.aweme.account.a.C1369a.a(r5)
            return
        L_0x0021:
            r2.getLocalClassName()
            com.ss.android.ugc.aweme.i$1 r0 = new com.ss.android.ugc.aweme.i$1
            r0.<init>(r5)
            r1.a(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.t.a(android.os.Bundle):void");
    }
}
