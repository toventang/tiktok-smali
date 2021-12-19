package com.ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.d;
import com.ss.android.ugc.aweme.effectplatform.r;
import com.ss.android.ugc.aweme.effectplatform.u;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.utils.k;
import com.ss.ugc.effectplatform.h.b;
import com.ss.ugc.effectplatform.h.c;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.task.af;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.util.t;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EffectPlatform implements au, f {

    /* renamed from: a  reason: collision with root package name */
    public static final File f89012a = new File(i.f115645a.getFilesDir(), "effect");

    /* renamed from: b  reason: collision with root package name */
    public static final File f89013b = new File(i.f115645a.getFilesDir(), "effectmodel");

    /* renamed from: c  reason: collision with root package name */
    public static final File f89014c = new File(i.f115645a.getFilesDir(), "pin");

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<String> f89015d;

    /* renamed from: h  reason: collision with root package name */
    private static ArrayList<String> f89016h;

    /* renamed from: f  reason: collision with root package name */
    private d f89017f;

    /* renamed from: g  reason: collision with root package name */
    private EffectConfiguration f89018g;

    public static String a() {
        return "1233";
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(e<RecommendSearchWordsResponse> eVar) {
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(InfoStickerEffect infoStickerEffect, b bVar) {
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, String str3, Integer num, Integer num2, e<InfoStickerListResponse> eVar) {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchPanelInfoListener.onFail(d.a());
            return;
        }
        u a2 = u.a.a(str, iFetchPanelInfoListener);
        a2.f89087a = dVar.f89025c;
        dVar.a(str, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (wrap: com.ss.android.ugc.aweme.effectplatform.d$1 : 0x001d: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.effectplatform.d$1) = 
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (r10v0 'z' boolean)
              (r11v0 'str2' java.lang.String)
              (r12v0 'i2' int)
              (r13v0 'i3' int)
              (r7v0 'a2' com.ss.android.ugc.aweme.effectplatform.u)
             call: com.ss.android.ugc.aweme.effectplatform.d.1.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.effectplatform.d.a(java.lang.String, com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener):void in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.effectplatform.d$1) = 
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (r10v0 'z' boolean)
              (r11v0 'str2' java.lang.String)
              (r12v0 'i2' int)
              (r13v0 'i3' int)
              (r7v0 'a2' com.ss.android.ugc.aweme.effectplatform.u)
             call: com.ss.android.ugc.aweme.effectplatform.d.1.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.effectplatform.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.effectplatform.d r1 = r8.f89017f
            boolean r0 = r1.f89023a
            if (r0 != 0) goto L_0x000e
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.ss.android.ugc.aweme.effectplatform.d.a()
            r14.onFail(r0)
            return
        L_0x000e:
            r2 = r9
            com.ss.android.ugc.aweme.effectplatform.u r7 = com.ss.android.ugc.aweme.effectplatform.u.a.a(r2, r14)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f89025c
            r7.f89087a = r0
            com.ss.android.ugc.aweme.effectplatform.d$1 r0 = new com.ss.android.ugc.aweme.effectplatform.d$1
            r5 = r12
            r6 = r13
            r3 = r10
            r4 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r1.a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void");
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchEffectChannelListener.onFail(d.a());
            return;
        }
        d.AnonymousClass2 r3 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r3v0 'r3' com.ss.android.ugc.aweme.effectplatform.d$2) = 
              (r4v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r6v0 'str' java.lang.String)
              (r7v0 'z' boolean)
              (r8v0 'iFetchEffectChannelListener' com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener)
             call: com.ss.android.ugc.aweme.effectplatform.d.2.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.effectplatform.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            */
        /*
            this = this;
            r5.g()
            com.ss.android.ugc.aweme.effectplatform.d r4 = r5.f89017f
            boolean r0 = r4.f89023a
            if (r0 != 0) goto L_0x0011
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.ss.android.ugc.aweme.effectplatform.d.a()
            r8.onFail(r0)
            return
        L_0x0011:
            com.ss.android.ugc.aweme.effectplatform.d$2 r3 = new com.ss.android.ugc.aweme.effectplatform.d$2
            r3.<init>(r6, r7, r8)
            boolean r0 = r4.f89023a
            if (r0 != 0) goto L_0x0022
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.ss.android.ugc.aweme.effectplatform.d.a()
            r3.checkChannelFailed(r0)
            return
        L_0x0022:
            com.ss.android.ugc.effectmanager.EffectManager r2 = r4.f89024b
            r1 = 0
            com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener r0 = r4.a(r3)
            r2.checkedEffectListUpdate(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void");
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, String str2, boolean z, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchCategoryEffectListener.onFail(d.a());
            return;
        }
        r a2 = r.a.a(str, i2, i3, iFetchCategoryEffectListener);
        a2.f89073a = dVar.f89025c;
        dVar.a(str, str2, i2, i3, i4, str3, z, a2);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchProviderEffect.onFail(d.a());
        } else {
            dVar.f89024b.fetchProviderEffect(str, z, i2, i3, str2, iFetchProviderEffect);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, String str2, Map<String, String> map, boolean z, c cVar) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            com.ss.ugc.effectplatform.model.e eVar = new com.ss.ugc.effectplatform.model.e(new RuntimeException());
            eVar.f153651a = -1;
            eVar.f153652b = "effect sdk manager init failed";
            cVar.a(eVar);
            return;
        }
        dVar.f89024b.fetchProviderEffectsByGiphyIds(str, str2, map, z, cVar);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchEffectListener.onFail(null, d.a());
        } else {
            dVar.f89024b.fetchEffectWithDownload(str, map, iFetchEffectListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchEffectListListener.onFail(d.a());
        } else {
            dVar.f89024b.fetchEffectList(list, z, map, iFetchEffectListListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchEffectListByIdsListener.onFail(d.a());
        } else {
            dVar.f89024b.fetchEffectList2(list, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        d dVar = this.f89017f;
        if (str != null && str2 != null) {
            if (!dVar.f89023a) {
                iUpdateTagListener.onFinally();
            } else {
                dVar.f89024b.updateTag(str, str2, iUpdateTagListener);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        d dVar = this.f89017f;
        if (str != null && !k.a(list)) {
            if (!dVar.f89023a) {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            } else {
                dVar.f89024b.isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        d dVar = this.f89017f;
        Boolean valueOf = Boolean.valueOf(z);
        if (!dVar.f89023a) {
            iModFavoriteList.onFail(d.a());
        } else {
            dVar.f89024b.modifyFavoriteList(str, list, valueOf, iModFavoriteList);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final boolean a(Effect effect) {
        d dVar = this.f89017f;
        if (effect == null || dVar.f89024b == null) {
            return false;
        }
        return DownloadableModelSupport.getInstance().isEffectReady(dVar.f89024b, effect);
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (z) {
            a(str, iFetchEffectChannelListener);
            return;
        }
        g();
        this.f89017f.a(str, z2, iFetchEffectChannelListener);
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        if (z2) {
            this.f89017f.a(str, z, str2, i2, i3, iFetchPanelInfoListener);
        } else {
            this.f89017f.b(str, z, str2, i2, i3, iFetchPanelInfoListener);
        }
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.f89017f.a(str, str2, i2, i3, i4, str3, z, iFetchCategoryEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(Map<String, Object> map) {
        this.f89017f.f89025c = map;
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, String str3, String str4, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        g();
        d dVar = this.f89017f;
        e<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2);
        if (dVar.f89023a) {
            com.ss.ugc.effectplatform.b effectPlatform = dVar.f89024b.getEffectPlatform();
            l.c(str, "");
            l.c(str2, "");
            l.c(str4, "");
            effectPlatform.a().a(str2, str4, i2, i3, map, kNListener, str);
        }
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, String str3, int i2, int i3, IFetchProviderEffect iFetchProviderEffect, boolean z) {
        g();
        d dVar = this.f89017f;
        if (g.a().A() != null && g.a().A().a()) {
            iFetchProviderEffect.onFail(d.a());
        } else if (!dVar.f89023a) {
            iFetchProviderEffect.onFail(d.a());
        } else {
            dVar.f89024b.searchProviderEffect(str, str2, i2, i3, false, str3, iFetchProviderEffect);
        }
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(String str, String str2, int i2, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
        if (i2 == d.a.f149144c) {
            this.f89017f.a(str, iCheckChannelListener);
        } else if (i2 == d.a.f149143b) {
            d dVar = this.f89017f;
            if (!dVar.f89023a) {
                iCheckChannelListener.checkChannelFailed(d.a());
            } else {
                dVar.f89024b.checkCategoryIsUpdate(str, str2, null, dVar.a(iCheckChannelListener));
            }
        } else {
            g();
            d dVar2 = this.f89017f;
            if (!dVar2.f89023a) {
                iCheckChannelListener.checkChannelFailed(d.a());
            } else if (map != null) {
                throw new NullPointerException("putAll");
            } else {
                dVar2.f89024b.checkedEffectListUpdate(str, null, dVar2.a(iCheckChannelListener));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final EffectManager c() {
        return this.f89017f.f89024b;
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void d() {
        d dVar = this.f89017f;
        if (dVar.f89023a) {
            dVar.f89024b.removeListener();
        }
    }

    public static String b() {
        String j2 = g.a().w().j();
        g.a().w();
        return j2;
    }

    public static ArrayList<String> e() {
        ArrayList<String> arrayList = f89016h;
        if (arrayList != null) {
            return arrayList;
        }
        f();
        ArrayList<String> arrayList2 = f89016h;
        if (arrayList2 != null) {
            return arrayList2;
        }
        return new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    @v(a = i.a.ON_DESTROY)
    public void destroy() {
        d dVar = this.f89017f;
        if (dVar.f89024b != null) {
            dVar.f89024b.destroy();
            dVar.f89024b = null;
        }
        dVar.f89023a = false;
    }

    static {
        Covode.recordClassIndex(55983);
    }

    private void g() {
        EffectConfiguration effectConfiguration = this.f89018g;
        if (effectConfiguration != null) {
            String str = "0";
            if (TextUtils.isEmpty(effectConfiguration.getDeviceId()) || TextUtils.equals(str, this.f89018g.getDeviceId())) {
                EffectConfiguration effectConfiguration2 = this.f89018g;
                if (AppLog.getServerDeviceId() != null) {
                    str = AppLog.getServerDeviceId();
                }
                effectConfiguration2.setDeviceId(str);
            }
        }
    }

    public static ArrayList<String> f() {
        List<com.ss.android.ugc.aweme.draft.model.c> list;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            list = g.a().c().c();
        } catch (Exception unused) {
            list = null;
        }
        if (list == null) {
            return new ArrayList<>();
        }
        for (com.ss.android.ugc.aweme.draft.model.c cVar : list) {
            String str3 = "";
            if (!(cVar.j() == null || cVar.j().stickers == null)) {
                for (StickerItemModel stickerItemModel : cVar.j().stickers) {
                    if (TextUtils.isEmpty(stickerItemModel.path)) {
                        ap I = g.a().I();
                        StringBuilder sb = new StringBuilder("InfoStickers_resdir_null:");
                        if (stickerItemModel.stickerId != null) {
                            str2 = stickerItemModel.stickerId;
                        } else {
                            str2 = str3;
                        }
                        I.b(sb.append(str2).toString());
                    } else {
                        arrayList.add(stickerItemModel.path.substring(stickerItemModel.path.lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (!(cVar.E == null || cVar.E.getEffectPointModels() == null)) {
                Iterator<EffectPointModel> it = cVar.E.getEffectPointModels().iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (TextUtils.isEmpty(next.getResDir())) {
                        ap I2 = g.a().I();
                        StringBuilder sb2 = new StringBuilder("EffectListModel_resdir_null:");
                        if (next.getKey() != null) {
                            str = next.getKey();
                        } else {
                            str = str3;
                        }
                        I2.b(sb2.append(str).toString());
                    } else {
                        arrayList.add(next.getResDir().substring(next.getResDir().lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (cVar.q() != null) {
                String str4 = cVar.q().f83217d;
                if (TextUtils.isEmpty(str4)) {
                    ap I3 = g.a().I();
                    StringBuilder sb3 = new StringBuilder("EffectListModel_resdir_null:");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    I3.b(sb3.append(str3).toString());
                } else {
                    arrayList.add(str4.substring(str4.lastIndexOf(File.separator) + 1));
                }
            }
            if (cVar.f83187h != null) {
                arrayList2.add(cVar.f83187h);
            }
        }
        f89016h = new ArrayList<>(new HashSet(arrayList));
        f89015d = new ArrayList<>(new HashSet(arrayList2));
        return f89016h;
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(m mVar) {
        mVar.getLifecycle().a(this);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final boolean b(Effect effect) {
        return this.f89017f.f89024b.isEffectDownloading(effect);
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final boolean c(Effect effect) {
        return a(effect);
    }

    public EffectPlatform(EffectConfiguration effectConfiguration) {
        this.f89018g = effectConfiguration;
        d dVar = new d();
        this.f89017f = dVar;
        dVar.f89024b = new EffectManager();
        dVar.f89023a = dVar.f89024b.init(effectConfiguration);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str) {
        d dVar = this.f89017f;
        if (dVar != null && dVar.f89023a) {
            dVar.f89024b.clearCache(str);
        }
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void b(Effect effect, IFetchEffectListener iFetchEffectListener) {
        a(effect, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iDownloadProviderEffectListener.onFail(providerEffect, d.a());
        } else {
            dVar.f89024b.downloadProviderEffect(providerEffect, iDownloadProviderEffectListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        g();
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchEffectListener.onFail(effect, d.a());
        } else if (effect == null) {
            ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
            exceptionResult.setErrorCode(-1);
            exceptionResult.setMsg("effect is null.");
            iFetchEffectListener.onFail(null, exceptionResult);
        } else {
            dVar.f89024b.fetchEffect(effect, iFetchEffectListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f
    public final void a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        g();
        this.f89017f.a(str, iFetchEffectChannelListener);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
    public final void a(String str, IFetchFavoriteList iFetchFavoriteList) {
        d dVar = this.f89017f;
        if (!dVar.f89023a) {
            iFetchFavoriteList.onFailed(d.a());
        } else {
            dVar.f89024b.fetchFavoriteList(str, iFetchFavoriteList);
        }
    }

    @Override // com.ss.android.ugc.tools.b.a.d
    public final void a(int i2, String str, String str2, Integer num, Integer num2, e<InfoStickerListResponse> eVar) {
        if (this.f89017f.f89024b == null) {
            eVar.onFail(null, new com.ss.ugc.effectplatform.model.e(-1));
            return;
        }
        com.ss.ugc.effectplatform.b effectPlatform = this.f89017f.f89024b.getEffectPlatform();
        l.c(str, "");
        l.c(str2, "");
        com.ss.ugc.effectplatform.j.c b2 = effectPlatform.b();
        l.c(str, "");
        l.c(str2, "");
        String a2 = t.a();
        if (eVar != null) {
            b2.f153623a.K.a(a2, eVar);
        }
        af afVar = new af(b2.f153623a, i2, str, str2, num, num2, a2);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(afVar);
        }
    }
}
