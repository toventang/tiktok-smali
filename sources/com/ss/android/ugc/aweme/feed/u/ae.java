package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.feed.adapter.au;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ae extends b<au, EmptyGuideV2> implements o {
    static {
        Covode.recordClassIndex(59769);
    }

    public final void a() {
        ((au) this.f69566b).a();
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.f69567c;
        T t = ((a) this.f69566b).mData;
        if (emptyGuideV2.f93196b != null) {
            emptyGuideV2.f93196b.d();
        }
        if (t == null || t.getUserList() == null || t.getUserList().size() <= 0) {
            emptyGuideV2.c();
            return;
        }
        emptyGuideV2.f93200f = t.logPb.getImprId();
        ArrayList arrayList = new ArrayList();
        for (UserWithAweme userWithAweme : t.getUserList()) {
            if (!(userWithAweme == null || userWithAweme.getUser() == null || userWithAweme.getAweme() == null)) {
                arrayList.add(userWithAweme);
            }
        }
        emptyGuideV2.f93198d.setData(arrayList);
        emptyGuideV2.f93198d.f93235c.f93214b = 0;
        emptyGuideV2.f93198d.setOnItemOperationListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: INVOKE  
              (wrap: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView : 0x006a: IGET  (r1v3 com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.d com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView)
              (wrap: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6 : 0x006e: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) call: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.6.<init>(com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView.setOnItemOperationListener(com.ss.android.ugc.aweme.profile.ui.widget.h$b):void in method: com.ss.android.ugc.aweme.feed.u.ae.c():void, file: classes5.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) call: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.6.<init>(com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.u.ae.c():void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.ae.c():void");
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        ((EmptyGuideV2) this.f69567c).a(exc);
    }

    public final int a(String str) {
        if (this.f69566b != null) {
            au auVar = (au) this.f69566b;
            if (auVar.f91607a != null) {
                return auVar.f91607a.indexOf(str);
            }
        }
        return 0;
    }

    public final void a(User user) {
        if (this.f69566b != null) {
            au auVar = (au) this.f69566b;
            if (auVar.mData != null && !((SuperAccountList) auVar.mData).getUserList().isEmpty()) {
                List<UserWithAweme> userList = ((SuperAccountList) auVar.mData).getUserList();
                userList.remove(user);
                ((SuperAccountList) auVar.mData).userList = userList;
            }
        }
    }

    public ae(au auVar, EmptyGuideV2 emptyGuideV2) {
        super(auVar, emptyGuideV2);
        ((a) this.f69566b).addNotifyListener(this);
    }
}
