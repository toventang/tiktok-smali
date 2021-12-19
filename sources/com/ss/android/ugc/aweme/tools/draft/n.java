package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.shortvideo.edit.aa;
import com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder;
import com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.ss.android.ugc.aweme.utils.bz;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.i;

public final class n extends g<com.ss.android.ugc.aweme.draft.model.c> implements AwemeDraftNewViewHolder.a {

    /* renamed from: b  reason: collision with root package name */
    public static final c f139846b = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f139847a = true;

    /* renamed from: c  reason: collision with root package name */
    private final String f139848c = "AwemeDraftNewAdapter";

    /* renamed from: d  reason: collision with root package name */
    private boolean f139849d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f139850e;
    private bd r;
    private List<com.ss.android.ugc.aweme.draft.model.c> s = new ArrayList();
    private final Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> t;
    private final AwemeDraftViewHolder.a u;

    static {
        Covode.recordClassIndex(91400);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(91404);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(List<com.ss.android.ugc.aweme.draft.model.c> list) {
        if (list != null) {
            if (list.size() != 0) {
                com.ss.android.ugc.aweme.draft.model.c cVar = new com.ss.android.ugc.aweme.draft.model.c();
                cVar.x = 2;
                cVar.W.aE = false;
                list.add(0, cVar);
                this.f139850e = true;
                com.ss.android.ugc.aweme.draft.model.c cVar2 = new com.ss.android.ugc.aweme.draft.model.c();
                cVar2.x = 10;
                cVar2.W.aE = false;
                list.add(cVar2);
            }
            b(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(String str) {
        if (this.f150019f != null) {
            for (com.ss.android.ugc.aweme.draft.model.c cVar : this.f150019f) {
                l.b(cVar, "");
                if (TextUtils.equals(str, cVar.r())) {
                    a(cVar);
                    return;
                }
            }
        }
    }

    private final boolean f() {
        for (com.ss.android.ugc.aweme.draft.model.c cVar : this.f150019f) {
            if (cVar != null && cVar.a()) {
                return true;
            }
        }
        return false;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f139854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139855b;

        static {
            Covode.recordClassIndex(91405);
        }

        d(n nVar, List list) {
            this.f139854a = nVar;
            this.f139855b = list;
        }

        public final void run() {
            for (final com.ss.android.ugc.aweme.draft.model.c cVar : this.f139855b) {
                if (cVar.y) {
                    n.c(cVar);
                    s.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.tools.draft.n.d.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(91406);
                        }

                        public final void run() {
                            com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(cVar);
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b() {
        ArrayList<com.ss.android.ugc.aweme.draft.model.c> arrayList = new ArrayList(this.f150019f);
        s.b(new d(this, arrayList));
        for (com.ss.android.ugc.aweme.draft.model.c cVar : arrayList) {
            if (cVar.y) {
                a(cVar);
            }
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c $data;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(91408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(n nVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
            super(0);
            this.this$0 = nVar;
            this.$data = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            n.c(this.$data);
            this.this$0.a(this.$data);
            com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(this.$data);
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_method", "single_delete").a("draft_cnt", 1);
            if (this.this$0.f139847a) {
                str = "storage_management";
            } else {
                str = "personal_homepage";
            }
            r.a("delete_drafts", a2.a("enter_from", str).f149193a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(bd bdVar) {
        this.r = bdVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b(boolean z) {
        this.f139847a = z;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(boolean z) {
        this.f139849d = z;
        notifyDataSetChanged();
    }

    static final class e extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $position;
        int label;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(91407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = nVar;
            this.$position = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, this.$position, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                int i2 = this.$position;
                List list = this.this$0.f150019f;
                l.b(list, "");
                aw.a(i2, list);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void c(com.ss.android.ugc.aweme.draft.model.c cVar) {
        ae o = com.ss.android.ugc.aweme.port.in.l.f115658a.o();
        String r2 = cVar.r();
        l.b(r2, "");
        o.a(r2);
        ai.a().b(cVar, "user_click");
        com.ss.android.ugc.aweme.draft.model.d.g(cVar);
        com.ss.android.ugc.aweme.shortvideo.sticker.e.b(cVar.f());
        bz.b(cVar);
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final int a(int i2) {
        if (this.f150019f != null && this.f150019f.size() > i2) {
            Object obj = this.f150019f.get(i2);
            l.b(obj, "");
            return ((com.ss.android.ugc.aweme.draft.model.c) obj).x;
        } else if (this.f150019f == null || this.f150019f.size() <= 0) {
            return 0;
        } else {
            Object obj2 = this.f150019f.get(0);
            l.b(obj2, "");
            return ((com.ss.android.ugc.aweme.draft.model.c) obj2).x;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        if (!(getItemCount() == 0 || cVar == null)) {
            int size = this.f150019f.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.ss.android.ugc.aweme.draft.model.c cVar2 = (com.ss.android.ugc.aweme.draft.model.c) this.f150019f.get(i2);
                if (cVar2 != null && com.bytedance.common.utility.m.a(cVar.r(), cVar2.r())) {
                    this.f150019f.set(i2, cVar);
                    notifyItemChanged(i2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.a
    public final void b(List<com.ss.android.ugc.aweme.draft.model.c> list) {
        l.d(list, "");
        if (this.f150019f == null) {
            this.f150019f = new ArrayList();
        }
        List list2 = this.f150019f;
        l.b(list2, "");
        j.d a2 = j.a(new h(list2, list));
        l.b(a2, "");
        a2.a(this);
        this.f150019f = new ArrayList(list);
    }

    public final void a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        bd bdVar;
        int indexOf = this.f150019f.indexOf(cVar);
        if (indexOf != -1) {
            this.f150019f.remove(indexOf);
            if (f() || (bdVar = this.r) == null) {
                notifyItemRemoved(indexOf);
            } else {
                bdVar.a();
            }
        }
    }

    final class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            if (view == null) {
                l.b();
            }
        }
    }

    final class b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            if (view == null) {
                l.b();
            }
        }
    }

    public n(Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, AwemeDraftViewHolder.a aVar) {
        l.d(map, "");
        l.d(aVar, "");
        this.t = map;
        this.u = aVar;
        this.p = new GridLayoutManager.c(this) {
            /* class com.ss.android.ugc.aweme.tools.draft.n.AnonymousClass1 */

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ n f139851e;

            static {
                Covode.recordClassIndex(91401);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f139851e = r1;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                int itemViewType = this.f139851e.getItemViewType(i2);
                if (itemViewType == 2 || itemViewType == 10) {
                    return 3;
                }
                return 1;
            }
        };
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f139857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f139858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139859c;

        static {
            Covode.recordClassIndex(91409);
        }

        g(n nVar, View view, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139857a = nVar;
            this.f139858b = view;
            this.f139859c = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            n nVar = this.f139857a;
            Context context = this.f139858b.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.draft.model.c cVar = this.f139859c;
            String quantityString = context.getResources().getQuantityString(R.plurals.b4, 1);
            l.b(quantityString, "");
            String string = context.getString(R.string.bcm);
            l.b(string, "");
            f fVar = new f(nVar, cVar);
            String string2 = context.getString(R.string.bcn);
            l.b(string2, "");
            aa.a(context, quantityString, string, fVar, string2);
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 == 2) {
            return new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_4, viewGroup, false));
        }
        if (i2 == 10) {
            return new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_2, viewGroup, false));
        }
        return new AwemeDraftNewViewHolder(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_8, viewGroup, false), this.t, this);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.a
    public final void a(int i2, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        Iterator it = this.f150019f.iterator();
        int i3 = -1;
        int i4 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.ss.android.ugc.aweme.draft.model.c cVar2 = (com.ss.android.ugc.aweme.draft.model.c) it.next();
            l.b(cVar2, "");
            if (cVar2.x == 0) {
                i4++;
                if (cVar2 == cVar) {
                    i3 = i4;
                    break;
                }
            }
        }
        cVar.f83191l = i3;
        this.u.a(i2, cVar);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.a
    public final void a(View view, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(view, "");
        l.d(cVar, "");
        com.ss.android.ugc.aweme.tools.draft.l.a aVar = new com.ss.android.ugc.aweme.tools.draft.l.a(view.getContext());
        Context context = view.getContext();
        l.b(context, "");
        aVar.a(new String[]{context.getResources().getString(R.string.yh)}, new g(this, view, cVar));
        aVar.f139812a.b();
        this.u.a(view, cVar);
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        long j2;
        l.d(viewHolder, "");
        kotlinx.coroutines.bz unused = i.a(an.a(bf.f159041b), null, null, new e(this, i2, null), 3);
        if (viewHolder instanceof AwemeDraftNewViewHolder) {
            AwemeDraftNewViewHolder awemeDraftNewViewHolder = (AwemeDraftNewViewHolder) viewHolder;
            awemeDraftNewViewHolder.f139298c = this.f139849d;
            awemeDraftNewViewHolder.f139299d = this.f139847a;
            com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) this.f150019f.get(i2);
            if (cVar != null && cVar.f83181b != null) {
                awemeDraftNewViewHolder.t = cVar;
                if (awemeDraftNewViewHolder.f139298c) {
                    awemeDraftNewViewHolder.f139297b.setVisibility(0);
                } else {
                    awemeDraftNewViewHolder.f139297b.setVisibility(8);
                    ((com.ss.android.ugc.aweme.draft.model.c) awemeDraftNewViewHolder.t).y = false;
                }
                awemeDraftNewViewHolder.f139297b.setOnCheckedChangeListener(null);
                awemeDraftNewViewHolder.f139297b.setChecked(((com.ss.android.ugc.aweme.draft.model.c) awemeDraftNewViewHolder.t).y);
                awemeDraftNewViewHolder.f139297b.setOnCheckedChangeListener(new q(awemeDraftNewViewHolder));
                awemeDraftNewViewHolder.u.setTag(cVar.r());
                awemeDraftNewViewHolder.u.setActualImageResource(2131232427);
                com.ss.android.ugc.aweme.draft.model.k kVar = new com.ss.android.ugc.aweme.draft.model.k(awemeDraftNewViewHolder.f139308m, (awemeDraftNewViewHolder.f139308m * 4) / 3, Bitmap.Config.ARGB_8888);
                if (cVar.W == null || cVar.W.bo == null) {
                    com.ss.android.ugc.aweme.draft.model.d.a((com.ss.android.ugc.aweme.draft.model.c) awemeDraftNewViewHolder.t, kVar, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0139: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.draft.model.c : 0x0132: CHECK_CAST (r1v8 com.ss.android.ugc.aweme.draft.model.c) = (com.ss.android.ugc.aweme.draft.model.c) (wrap: java.lang.Object : 0x0130: IGET  (r1v7 java.lang.Object) = (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder) com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.t java.lang.Object))
                          (r6v0 'kVar' com.ss.android.ugc.aweme.draft.model.k)
                          (wrap: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2 : 0x0136: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2) = 
                          (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder)
                          (r2v2 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                         call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR)
                         type: STATIC call: com.ss.android.ugc.aweme.draft.model.d.a(com.ss.android.ugc.aweme.draft.model.c, com.ss.android.ugc.aweme.draft.model.k, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback):void in method: com.ss.android.ugc.aweme.tools.draft.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0136: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2) = 
                          (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder)
                          (r2v2 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                         call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.draft.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 354
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }
            }
