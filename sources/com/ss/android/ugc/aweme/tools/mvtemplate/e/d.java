package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.d;
import com.ss.android.ugc.tools.c.a;
import java.util.List;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f140825a = new d();

    static {
        Covode.recordClassIndex(91956);
    }

    private d() {
    }

    @Override // b.g
    public final Object then(i iVar) {
        for (PhotoContext photoContext : (List) iVar.d()) {
            d.a aVar = h.f140830a;
            if (photoContext != null) {
                a.a(com.ss.android.ugc.aweme.photo.d.a(photoContext.getPhotoUri()), photoContext.mWidth, photoContext.mHeight, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.base.model.UrlModel : 0x0025: INVOKE  (r3v0 com.ss.android.ugc.aweme.base.model.UrlModel) = 
                      (wrap: android.net.Uri : 0x0021: INVOKE  (r0v3 android.net.Uri) = (r1v2 'photoContext' com.ss.android.ugc.aweme.photo.PhotoContext) type: VIRTUAL call: com.ss.android.ugc.aweme.photo.PhotoContext.getPhotoUri():android.net.Uri)
                     type: STATIC call: com.ss.android.ugc.aweme.photo.d.a(android.net.Uri):com.ss.android.ugc.aweme.base.model.UrlModel)
                      (wrap: int : 0x0029: IGET  (r2v0 int) = (r1v2 'photoContext' com.ss.android.ugc.aweme.photo.PhotoContext) com.ss.android.ugc.aweme.photo.PhotoContext.mWidth int)
                      (wrap: int : 0x002b: IGET  (r1v3 int) = (r1v2 'photoContext' com.ss.android.ugc.aweme.photo.PhotoContext) com.ss.android.ugc.aweme.photo.PhotoContext.mHeight int)
                      (wrap: com.ss.android.ugc.aweme.photo.d$1 : 0x002f: CONSTRUCTOR  (r0v4 com.ss.android.ugc.aweme.photo.d$1) = (r4v0 'aVar' com.ss.android.ugc.aweme.photo.d$a) call: com.ss.android.ugc.aweme.photo.d.1.<init>(com.ss.android.ugc.aweme.photo.d$a):void type: CONSTRUCTOR)
                     type: STATIC call: com.ss.android.ugc.tools.c.a.a(com.ss.android.ugc.aweme.base.model.UrlModel, int, int, androidx.core.g.a):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.e.d.then(b.i):java.lang.Object, file: classes4.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r0v4 com.ss.android.ugc.aweme.photo.d$1) = (r4v0 'aVar' com.ss.android.ugc.aweme.photo.d$a) call: com.ss.android.ugc.aweme.photo.d.1.<init>(com.ss.android.ugc.aweme.photo.d$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.e.d.then(b.i):java.lang.Object, file: classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.photo.d, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    this = this;
                    java.lang.Object r0 = r7.d()
                    java.util.List r0 = (java.util.List) r0
                    java.util.Iterator r5 = r0.iterator()
                L_0x000a:
                    boolean r1 = r5.hasNext()
                    r0 = 0
                    if (r1 == 0) goto L_0x0036
                    java.lang.Object r1 = r5.next()
                    com.ss.android.ugc.aweme.photo.PhotoContext r1 = (com.ss.android.ugc.aweme.photo.PhotoContext) r1
                    com.ss.android.ugc.aweme.photo.d$a r4 = com.ss.android.ugc.aweme.tools.mvtemplate.e.h.f140830a
                    if (r1 != 0) goto L_0x0021
                    if (r4 == 0) goto L_0x000a
                    r4.a(r0)
                    goto L_0x000a
                L_0x0021:
                    android.net.Uri r0 = r1.getPhotoUri()
                    com.ss.android.ugc.aweme.base.model.UrlModel r3 = com.ss.android.ugc.aweme.photo.d.a(r0)
                    int r2 = r1.mWidth
                    int r1 = r1.mHeight
                    com.ss.android.ugc.aweme.photo.d$1 r0 = new com.ss.android.ugc.aweme.photo.d$1
                    r0.<init>(r4)
                    com.ss.android.ugc.tools.c.a.a(r3, r2, r1, r0)
                    goto L_0x000a
                L_0x0036:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.e.d.then(b.i):java.lang.Object");
            }
        }
