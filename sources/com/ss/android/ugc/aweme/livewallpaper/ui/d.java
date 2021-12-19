package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.Context;
import android.view.View;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveWallPaperPreviewActivity f108974a;

    static {
        Covode.recordClassIndex(69769);
    }

    d(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f108974a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f108974a;
        if (!f.a(liveWallPaperPreviewActivity, liveWallPaperPreviewActivity.f108949d.getId(), (Aweme) null)) {
            com.ss.android.ugc.aweme.livewallpaper.f.d.f108899e.a("paper_set", new d.a() {
                /* class com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69758);
                }

                @Override // com.ss.android.ugc.aweme.livewallpaper.f.d.a
                public final void a(boolean z, String str) {
                    if (z) {
                        Context applicationContext = LiveWallPaperPreviewActivity.this.getApplicationContext();
                        if (a.f107168c && applicationContext == null) {
                            applicationContext = a.f107166a;
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.he_).a();
                        f.a(0, "");
                        LiveWallPaperPreviewActivity.this.finish();
                    } else {
                        f.a(1, str);
                    }
                    f.a(LiveWallPaperPreviewActivity.this.f108949d.getId(), LiveWallPaperPreviewActivity.this.f108952g, z, str);
                }
            });
            liveWallPaperPreviewActivity.f108949d.setSource("paper_set");
            liveWallPaperPreviewActivity.a();
            com.ss.android.ugc.aweme.livewallpaper.f.d dVar = com.ss.android.ugc.aweme.livewallpaper.f.d.f108899e;
            LiveWallPaperBean liveWallPaperBean = liveWallPaperPreviewActivity.f108949d;
            dVar.f108902c.setId(liveWallPaperBean.getId());
            dVar.f108902c.setThumbnailPath(liveWallPaperBean.getThumbnailPath());
            dVar.f108902c.setVideoPath(liveWallPaperBean.getVideoPath());
            dVar.f108902c.setWidth(liveWallPaperBean.getWidth());
            dVar.f108902c.setHeight(liveWallPaperBean.getHeight());
            dVar.f108902c.setSource(liveWallPaperBean.getSource());
            dVar.f108902c.setVolume(liveWallPaperBean.getVolume());
            dVar.f108902c.setShouldMute(liveWallPaperBean.isShouldMute());
            com.ss.android.ugc.aweme.livewallpaper.f.d dVar2 = com.ss.android.ugc.aweme.livewallpaper.f.d.f108899e;
            if (liveWallPaperPreviewActivity.isFinishing()) {
                f.a(1, "context is finish");
            } else if (!e.b(dVar2.f108902c.getVideoPath())) {
                com.a.a("Start setting dynamic desktop: file does not exist, path: %s", new Object[]{dVar2.f108902c.getVideoPath()});
                f.a(1, "video path is not exist");
            } else {
                if (dVar2.f108901b != null) {
                    dVar2.f108901b.d(dVar2.f108902c.getVideoPath());
                    dVar2.f108901b.a(dVar2.f108902c.getWidth());
                    dVar2.f108901b.b(dVar2.f108902c.getHeight());
                    dVar2.f108901b.f(dVar2.f108902c.getSource());
                    dVar2.f108901b.a(dVar2.f108902c.getVolume());
                    dVar2.f108901b.a(dVar2.f108902c.isShouldMute());
                }
                i.b(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.livewallpaper.f.d$3 : 0x012c: CONSTRUCTOR  (r1v10 com.ss.android.ugc.aweme.livewallpaper.f.d$3) = (r4v0 'dVar2' com.ss.android.ugc.aweme.livewallpaper.f.d) call: com.ss.android.ugc.aweme.livewallpaper.f.d.3.<init>(com.ss.android.ugc.aweme.livewallpaper.f.d):void type: CONSTRUCTOR)
                      (wrap: java.util.concurrent.ExecutorService : 0x012f: SGET  (r0v18 java.util.concurrent.ExecutorService) =  b.i.a java.util.concurrent.ExecutorService)
                     type: STATIC call: b.i.b(java.util.concurrent.Callable, java.util.concurrent.Executor):b.i in method: com.ss.android.ugc.aweme.livewallpaper.ui.d.onClick(android.view.View):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012c: CONSTRUCTOR  (r1v10 com.ss.android.ugc.aweme.livewallpaper.f.d$3) = (r4v0 'dVar2' com.ss.android.ugc.aweme.livewallpaper.f.d) call: com.ss.android.ugc.aweme.livewallpaper.f.d.3.<init>(com.ss.android.ugc.aweme.livewallpaper.f.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.livewallpaper.ui.d.onClick(android.view.View):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.livewallpaper.f.d, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 366
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.ui.d.onClick(android.view.View):void");
            }
        }
