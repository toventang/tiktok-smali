package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.discover.adapter.v;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.l.m;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class u extends p<SearchChallenge> {

    /* renamed from: g  reason: collision with root package name */
    public r f80591g;

    static {
        Covode.recordClassIndex(50135);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<SearchChallenge> list) {
        this.f80579f.f120995a = Integer.MIN_VALUE;
        super.b_(list);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        View a2 = m.a(viewGroup, R.layout.avp);
        v.b bVar = new v.b(a2, "chanllenge_tab");
        a2.addOnAttachStateChangeListener(bVar);
        a2.setTag(R.id.dui, bVar);
        v vVar = new v(a2, "chanllenge_tab");
        vVar.f80601m = "search_result";
        return vVar;
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        int i3;
        MethodCollector.i(2373);
        v vVar = (v) viewHolder;
        SearchChallenge searchChallenge = (SearchChallenge) this.f76354l.get(i2);
        r rVar = this.f80591g;
        if (rVar == null) {
            q a2 = am.a();
            if (a2 != null) {
                str = a2.c().f121172a;
                str2 = a2.c().f121173b;
                i3 = a2.a();
            } else {
                str = "";
                str2 = str;
                i3 = 0;
            }
            if (i2 % 10 == 0) {
                c.a.a("challenge");
            }
            LogPbBean logPbBean = searchChallenge.logPbBean;
            if (logPbBean == null) {
                logPbBean = new LogPbBean();
                logPbBean.setImprId("");
            }
            String imprId = logPbBean.getImprId();
            String b2 = ac.a.f91473a.b(imprId);
            this.f80577d.getEnterMethod();
            String a3 = c.b.a.a(2);
            String a4 = c.a.a(2);
            r f2 = r.a.a().f("search_result");
            f2.f121266a = false;
            r a5 = f2.g(str).h(imprId).i(b2).a(logPbBean);
            a5.f121267b = i3;
            a5.f121278m = i2;
            r e2 = a5.e(str2);
            e2.f121268c = 2;
            rVar = e2.c(a3).d(a4);
        }
        vVar.a(rVar);
        SearchChallenge searchChallenge2 = (SearchChallenge) this.f76354l.get(i2);
        String l2 = l();
        if (searchChallenge2 != null) {
            Challenge challenge = searchChallenge2.getChallenge();
            if (challenge != null) {
                if (challenge.getHighlightInfoList() != null) {
                    vVar.f80592a.setTypeface(a.a().a(d.f33795a));
                    vVar.f80592a.setTextColor(b.c(vVar.itemView.getContext(), R.color.c4));
                    vVar.r = new f(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0066: IPUT  
                          (wrap: com.ss.android.ugc.aweme.discover.helper.f : 0x0063: CONSTRUCTOR  (r9v23 com.ss.android.ugc.aweme.discover.helper.f) = 
                          (wrap: com.ss.android.ugc.aweme.discover.adapter.v$2 : 0x0060: CONSTRUCTOR  (r0v109 com.ss.android.ugc.aweme.discover.adapter.v$2) = (r5v1 'vVar' com.ss.android.ugc.aweme.discover.adapter.v) call: com.ss.android.ugc.aweme.discover.adapter.v.2.<init>(com.ss.android.ugc.aweme.discover.adapter.v):void type: CONSTRUCTOR)
                         call: com.ss.android.ugc.aweme.discover.helper.f.<init>(com.ss.android.ugc.aweme.discover.helper.f$c):void type: CONSTRUCTOR)
                          (r5v1 'vVar' com.ss.android.ugc.aweme.discover.adapter.v)
                         com.ss.android.ugc.aweme.discover.adapter.v.r com.ss.android.ugc.aweme.discover.helper.f in method: com.ss.android.ugc.aweme.discover.adapter.u.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes8.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: CONSTRUCTOR  (r9v23 com.ss.android.ugc.aweme.discover.helper.f) = 
                          (wrap: com.ss.android.ugc.aweme.discover.adapter.v$2 : 0x0060: CONSTRUCTOR  (r0v109 com.ss.android.ugc.aweme.discover.adapter.v$2) = (r5v1 'vVar' com.ss.android.ugc.aweme.discover.adapter.v) call: com.ss.android.ugc.aweme.discover.adapter.v.2.<init>(com.ss.android.ugc.aweme.discover.adapter.v):void type: CONSTRUCTOR)
                         call: com.ss.android.ugc.aweme.discover.helper.f.<init>(com.ss.android.ugc.aweme.discover.helper.f$c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.discover.adapter.u.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: CONSTRUCTOR  (r0v109 com.ss.android.ugc.aweme.discover.adapter.v$2) = (r5v1 'vVar' com.ss.android.ugc.aweme.discover.adapter.v) call: com.ss.android.ugc.aweme.discover.adapter.v.2.<init>(com.ss.android.ugc.aweme.discover.adapter.v):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.discover.adapter.u.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.discover.adapter.v, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 787
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.u.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }

                public u(com.ss.android.ugc.aweme.search.model.d dVar, a.b bVar, com.ss.android.ugc.aweme.search.d.b bVar2) {
                    super(dVar, bVar, bVar2);
                }
            }
