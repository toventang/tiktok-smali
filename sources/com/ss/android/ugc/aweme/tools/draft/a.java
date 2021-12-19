package com.ss.android.ugc.aweme.tools.draft;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.draft.model.k;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.sticker.e;
import com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.ss.android.ugc.aweme.utils.bz;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a extends g<c> implements AwemeDraftViewHolder.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f139348a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f139349b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f139350c = true;

    /* renamed from: d  reason: collision with root package name */
    private bd f139351d;

    /* renamed from: e  reason: collision with root package name */
    private Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f139352e;
    private AwemeDraftViewHolder.a r;

    static {
        Covode.recordClassIndex(91097);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(String str) {
        if (this.f150019f != null) {
            for (c cVar : this.f150019f) {
                if (TextUtils.equals(str, cVar.r())) {
                    d(cVar);
                    return;
                }
            }
        }
    }

    private boolean f() {
        for (c cVar : this.f150019f) {
            if (cVar != null && cVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b() {
        ArrayList<c> arrayList = new ArrayList(this.f150019f);
        i.b(new c(this, arrayList), i.f4824a);
        for (c cVar : arrayList) {
            if (cVar.y) {
                d(cVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(bd bdVar) {
        this.f139351d = bdVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b(boolean z) {
        this.f139350c = z;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(boolean z) {
        this.f139348a = z;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final int a(int i2) {
        return ((c) this.f150019f.get(i2)).x;
    }

    private int b(int i2) {
        int i3 = i2 - 1;
        while (i3 >= 0) {
            c cVar = (c) this.f150019f.get(i3);
            if (cVar != null && cVar.x == 3) {
                break;
            }
            i3--;
        }
        return i3;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void a(List<c> list) {
        if (!(list == null || list.size() == 0)) {
            c cVar = new c();
            cVar.x = 2;
            cVar.W.aE = false;
            list.add(0, cVar);
            this.f139349b = true;
        }
        b(list);
    }

    static void a(c cVar) {
        l.f115658a.o().a(cVar.r());
        ai.a().b(cVar, "user_click");
        d.g(cVar);
        e.b(cVar.f());
        bz.b(cVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c(c cVar) {
        String str;
        a(cVar);
        d(cVar);
        com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(cVar);
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_method", "single_delete").a("draft_cnt", 1);
        if (this.f139350c) {
            str = "storage_management";
        } else {
            str = "personal_homepage";
        }
        r.a("delete_drafts", a2.a("enter_from", str).f149193a);
        return null;
    }

    private boolean c(int i2) {
        if (((c) this.f150019f.get(i2)).f83185f == null || i2 == 0) {
            return false;
        }
        int i3 = i2 - 1;
        if (((c) this.f150019f.get(i3)).x != 1 && ((c) this.f150019f.get(i3)).x != 5) {
            return false;
        }
        if (i2 == this.f150019f.size() - 1) {
            return true;
        }
        int i4 = i2 + 1;
        if (((c) this.f150019f.get(i4)).x == 1 || ((c) this.f150019f.get(i4)).x == 5 || ((c) this.f150019f.get(i4)).f83185f == null) {
            return true;
        }
        return false;
    }

    private void d(c cVar) {
        bd bdVar;
        bd bdVar2;
        int indexOf = this.f150019f.indexOf(cVar);
        if (indexOf != -1) {
            int b2 = b(indexOf);
            boolean a2 = a(b2, indexOf);
            if (c(indexOf)) {
                this.f150019f.remove(indexOf);
                int i2 = indexOf - 1;
                this.f150019f.remove(i2);
                if (a2) {
                    this.f150019f.remove(b2);
                }
                if (f() || (bdVar2 = this.f139351d) == null) {
                    notifyItemRangeRemoved(i2, 2);
                    if (a2) {
                        notifyItemRemoved(b2);
                        return;
                    }
                    return;
                }
                bdVar2.a();
                return;
            }
            this.f150019f.remove(indexOf);
            if (a2) {
                this.f150019f.remove(b2);
            }
            if (f() || (bdVar = this.f139351d) == null) {
                notifyItemRemoved(indexOf);
                if (a2) {
                    notifyItemRemoved(b2);
                    return;
                }
                return;
            }
            bdVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g
    public final void b(c cVar) {
        if (!(getItemCount() == 0 || cVar == null)) {
            int size = this.f150019f.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar2 = (c) this.f150019f.get(i2);
                if (cVar2 != null && m.a(cVar.r(), cVar2.r())) {
                    this.f150019f.set(i2, cVar);
                    notifyItemChanged(i2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$a  reason: collision with other inner class name */
    protected class C3678a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91098);
        }

        C3678a(View view) {
            super(view);
        }
    }

    public a(Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, AwemeDraftViewHolder.a aVar) {
        this.f139352e = map;
        this.r = aVar;
    }

    protected class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f139354a;

        static {
            Covode.recordClassIndex(91099);
        }

        b(View view) {
            super(view);
            this.f139354a = (TextView) view.findViewById(R.id.f9k);
            com.bytedance.ies.dmt.ui.widget.util.b.a().a(this.f139354a, com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        }
    }

    private boolean a(int i2, int i3) {
        if (-1 == i2) {
            return false;
        }
        for (int i4 = i2 + 1; i4 < this.f150019f.size(); i4++) {
            c cVar = (c) this.f150019f.get(i4);
            if (cVar != null) {
                if (!cVar.a() || i4 == i3) {
                    if (3 == cVar.x) {
                        break;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new i(false, com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_6, viewGroup, false));
        }
        if (i2 == 5) {
            return new i(true, com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_6, viewGroup, false));
        }
        if (i2 == 2) {
            return new C3678a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_4, viewGroup, false));
        }
        if (3 == i2) {
            return new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_9, viewGroup, false));
        }
        return new AwemeDraftViewHolder(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_1, viewGroup, false), this.f139352e, this);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.a
    public final void a(int i2, c cVar) {
        Iterator it = this.f150019f.iterator();
        int i3 = -1;
        int i4 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c cVar2 = (c) it.next();
            if (cVar2.x == 0) {
                i4++;
                if (cVar2 == cVar) {
                    i3 = i4;
                    break;
                }
            }
        }
        cVar.f83191l = i3;
        this.r.a(i2, cVar);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.a
    public final void a(View view, c cVar) {
        com.ss.android.ugc.aweme.tools.draft.l.a aVar = new com.ss.android.ugc.aweme.tools.draft.l.a(view.getContext());
        aVar.a(new String[]{view.getContext().getResources().getString(R.string.yh)}, new d(this, view, cVar));
        aVar.f139812a.b();
        this.r.a(view, cVar);
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        MethodCollector.i(2200);
        i.b(new b(this, i2), i.f4824a);
        if (viewHolder instanceof AwemeDraftViewHolder) {
            int i3 = i2 - 1;
            if (i3 <= 0 || !((c) this.f150019f.get(i3)).z || ((c) this.f150019f.get(i2)).x != 0) {
                z = false;
            } else {
                z = true;
            }
            AwemeDraftViewHolder awemeDraftViewHolder = (AwemeDraftViewHolder) viewHolder;
            awemeDraftViewHolder.s = z;
            awemeDraftViewHolder.f139325m = this.f139348a;
            awemeDraftViewHolder.n = this.f139350c;
            c cVar = (c) this.f150019f.get(i2);
            if (cVar == null || cVar.f83181b == null) {
                MethodCollector.o(2200);
                return;
            }
            awemeDraftViewHolder.t = cVar;
            if (awemeDraftViewHolder.f139325m) {
                awemeDraftViewHolder.f139322j.a();
                awemeDraftViewHolder.f139320h.animate().alpha(0.0f).setDuration(200).start();
            } else {
                awemeDraftViewHolder.f139322j.b();
                awemeDraftViewHolder.f139320h.animate().alpha(1.0f).setDuration(200).start();
                ((c) awemeDraftViewHolder.t).y = false;
            }
            if (awemeDraftViewHolder.n) {
                awemeDraftViewHolder.f139315c.setText(com.ss.android.ugc.aweme.tools.draft.e.b.a(awemeDraftViewHolder.p, cVar));
            }
            awemeDraftViewHolder.f139321i.setOnCheckedChangeListener(null);
            awemeDraftViewHolder.f139321i.setChecked(((c) awemeDraftViewHolder.t).y);
            awemeDraftViewHolder.f139321i.setOnCheckedChangeListener(new w(awemeDraftViewHolder));
            awemeDraftViewHolder.f139318f.setTag(cVar.r());
            awemeDraftViewHolder.f139318f.setActualImageResource(2131232427);
            int dimensionPixelOffset = awemeDraftViewHolder.p.getResources().getDimensionPixelOffset(R.dimen.j6);
            k kVar = new k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
            if (cVar.W == null || cVar.W.bo == null) {
                d.a((c) awemeDraftViewHolder.t, kVar, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02ee: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.draft.model.c : 0x02e7: CHECK_CAST (r2v12 com.ss.android.ugc.aweme.draft.model.c) = (com.ss.android.ugc.aweme.draft.model.c) (wrap: java.lang.Object : 0x02e5: IGET  (r2v11 java.lang.Object) = (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder) com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.t java.lang.Object))
                      (r4v1 'kVar' com.ss.android.ugc.aweme.draft.model.k)
                      (wrap: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2 : 0x02eb: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2) = 
                      (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder)
                      (r7v1 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                     call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR)
                     type: STATIC call: com.ss.android.ugc.aweme.draft.model.d.a(com.ss.android.ugc.aweme.draft.model.c, com.ss.android.ugc.aweme.draft.model.k, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback):void in method: com.ss.android.ugc.aweme.tools.draft.a.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes4.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02eb: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2) = 
                      (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder)
                      (r7v1 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                     call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.draft.a.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 902
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.a.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }
        }
