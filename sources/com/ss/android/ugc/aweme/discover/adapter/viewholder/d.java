package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.adapter.ac;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.CopyOnWriteArrayList;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final a f80649d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.a<ac> f80650a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<SearchHistory> f80651b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f80652c;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f80653e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f80654f;

    static {
        Covode.recordClassIndex(50162);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50164);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, final al.b bVar) {
        super(view);
        l.d(view, "");
        AnonymousClass1 r1 = new RecyclerView.a<ac>(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.viewholder.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f80655a;

            static {
                Covode.recordClassIndex(50163);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ ac onCreateViewHolder(ViewGroup viewGroup, int i2) {
                return a(this, viewGroup, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final int getItemCount() {
                return this.f80655a.f80651b.size();
            }

            {
                this.f80655a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ void onBindViewHolder(ac acVar, int i2) {
                ac acVar2 = acVar;
                l.d(acVar2, "");
                SearchHistory searchHistory = this.f80655a.f80651b.get(i2);
                if (searchHistory == null) {
                    acVar2.itemView.setVisibility(8);
                    return;
                }
                acVar2.itemView.setVisibility(0);
                acVar2.f80304b.setText(searchHistory.keyword);
                acVar2.f80304b.setSingleLine(true);
                acVar2.itemView.setOnTouchListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: INVOKE  
                      (wrap: android.view.View : 0x002e: IGET  (r1v2 android.view.View) = (r5v1 'acVar2' com.ss.android.ugc.aweme.discover.adapter.ac) com.ss.android.ugc.aweme.discover.adapter.ac.itemView android.view.View)
                      (wrap: com.ss.android.ugc.aweme.discover.adapter.ac$2 : 0x0032: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.discover.adapter.ac$2) = 
                      (r5v1 'acVar2' com.ss.android.ugc.aweme.discover.adapter.ac)
                      (r2v1 'searchHistory' com.ss.android.ugc.aweme.discover.model.SearchHistory)
                      (r6v0 'i2' int)
                     call: com.ss.android.ugc.aweme.discover.adapter.ac.2.<init>(com.ss.android.ugc.aweme.discover.adapter.ac, com.ss.android.ugc.aweme.discover.model.SearchHistory, int):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.ss.android.ugc.aweme.discover.adapter.viewholder.d.1.onBindViewHolder(com.ss.android.ugc.aweme.discover.adapter.ac, int):void, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.discover.adapter.ac$2) = 
                      (r5v1 'acVar2' com.ss.android.ugc.aweme.discover.adapter.ac)
                      (r2v1 'searchHistory' com.ss.android.ugc.aweme.discover.model.SearchHistory)
                      (r6v0 'i2' int)
                     call: com.ss.android.ugc.aweme.discover.adapter.ac.2.<init>(com.ss.android.ugc.aweme.discover.adapter.ac, com.ss.android.ugc.aweme.discover.model.SearchHistory, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.discover.adapter.viewholder.d.1.onBindViewHolder(com.ss.android.ugc.aweme.discover.adapter.ac, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.discover.adapter.ac, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                    this = this;
                    com.ss.android.ugc.aweme.discover.adapter.ac r5 = (com.ss.android.ugc.aweme.discover.adapter.ac) r5
                    java.lang.String r0 = ""
                    h.f.b.l.d(r5, r0)
                    com.ss.android.ugc.aweme.discover.adapter.viewholder.d r0 = r4.f80655a
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.discover.model.SearchHistory> r0 = r0.f80651b
                    java.lang.Object r2 = r0.get(r6)
                    com.ss.android.ugc.aweme.discover.model.SearchHistory r2 = (com.ss.android.ugc.aweme.discover.model.SearchHistory) r2
                    if (r2 != 0) goto L_0x001b
                    android.view.View r1 = r5.itemView
                    r0 = 8
                    r1.setVisibility(r0)
                    return
                L_0x001b:
                    android.view.View r1 = r5.itemView
                    r0 = 0
                    r1.setVisibility(r0)
                    android.widget.TextView r1 = r5.f80304b
                    java.lang.String r0 = r2.keyword
                    r1.setText(r0)
                    android.widget.TextView r0 = r5.f80304b
                    r3 = 1
                    r0.setSingleLine(r3)
                    android.view.View r1 = r5.itemView
                    com.ss.android.ugc.aweme.discover.adapter.ac$2 r0 = new com.ss.android.ugc.aweme.discover.adapter.ac$2
                    r0.<init>(r2, r6)
                    r1.setOnTouchListener(r0)
                    r5.f80305c = r2
                    android.view.View r0 = r5.itemView
                    android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                    if (r2 == 0) goto L_0x005d
                    android.view.View r0 = r5.itemView
                    android.content.Context r1 = r0.getContext()
                    r0 = 1110441984(0x42300000, float:44.0)
                    float r0 = com.bytedance.common.utility.n.b(r1, r0)
                    int r0 = (int) r0
                    r2.height = r0
                    android.widget.TextView r1 = r5.f80304b
                    r0 = 1097859072(0x41700000, float:15.0)
                    r1.setTextSize(r3, r0)
                    android.view.View r0 = r5.itemView
                    r0.setLayoutParams(r2)
                L_0x005d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.viewholder.d.AnonymousClass1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            private static RecyclerView.ViewHolder a(AnonymousClass1 r6, ViewGroup viewGroup, int i2) {
                boolean a2;
                MethodCollector.i(2254);
                l.d(viewGroup, "");
                ac acVar = new ac(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avs, viewGroup, false), bVar);
                l.b(acVar, "");
                try {
                    if (acVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(acVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) acVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(acVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = acVar.getClass().getName();
                MethodCollector.o(2254);
                return acVar;
            }
        };
        this.f80650a = r1;
        View findViewById = view.findViewById(R.id.cbk);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f80653e = recyclerView;
        recyclerView.setAdapter(r1);
        RecyclerView recyclerView2 = this.f80653e;
        view.getContext();
        recyclerView2.setLayoutManager(new SearchHistoryLinesViewHolder$2(view));
        View findViewById2 = view.findViewById(R.id.fin);
        l.b(findViewById2, "");
        this.f80654f = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fim);
        l.b(findViewById3, "");
        this.f80652c = (ViewGroup) findViewById3;
    }
}
