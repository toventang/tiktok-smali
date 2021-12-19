package com.ss.android.ugc.aweme.upvote.detail.panel;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends com.bytedance.ies.foundation.fragment.a implements DialogInterface.OnDismissListener, com.bytedance.tux.navigation.a, com.bytedance.tux.sheet.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f142177e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private UpvoteDetailPanelViewModel f142178f;

    /* renamed from: g  reason: collision with root package name */
    private UpvoteListViewModel f142179g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f142180h;

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$e  reason: collision with other inner class name */
    public static final class C3795e extends m implements h.f.a.b<l, l> {
        public static final C3795e INSTANCE = new C3795e();

        static {
            Covode.recordClassIndex(92947);
        }

        public C3795e() {
            super(1);
        }

        public final l invoke(l lVar) {
            l.c(lVar, "");
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(92938);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f142180h == null) {
            this.f142180h = new SparseArray();
        }
        View view = (View) this.f142180h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f142180h.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.tux.sheet.b
    public final void a(com.bytedance.tux.sheet.sheet.a aVar, int i2) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f142180h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92939);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(92940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.upvote.detail.panel.e r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.e.b.invoke():java.lang.Object");
        }
    }

    public static final class d extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(92946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8p), Integer.valueOf((int) R.string.fd6))).intValue());
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
        a3.f45194b = true;
        TuxNavBar.a b2 = a2.b(a3.a((h.f.a.a<z>) new b(this)));
        b2.f45188d = true;
        return b2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        UpvoteListViewModel.f142045e = false;
    }

    static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ String $aid;
        final /* synthetic */ boolean $isFirstTimeOpen;
        final /* synthetic */ String $upvoteId;
        final /* synthetic */ String $vmIdentifier;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(92941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, String str, String str2, String str3, boolean z) {
            super(1);
            this.this$0 = eVar;
            this.$aid = str;
            this.$vmIdentifier = str2;
            this.$upvoteId = str3;
            this.$isFirstTimeOpen = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.upvote.detail.panel.e.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(92942);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new f(this.this$0.$aid, this.this$0.$vmIdentifier, this.this$0.$upvoteId, this.this$0.$isFirstTimeOpen));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f142181a);
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.upvote.detail.panel.e.c.AnonymousClass3 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(92944);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.this$0.getView();
                    qVar2.a(ab.a(b.class));
                    qVar2.f25596b = new b();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass4.f142182a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.tux.sheet.b
    public final void a(com.bytedance.tux.sheet.sheet.a aVar, float f2) {
        l.d(aVar, "");
        UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = this.f142178f;
        if (upvoteDetailPanelViewModel == null) {
            l.a("panelVM");
        }
        upvoteDetailPanelViewModel.a(new UpvoteDetailPanelViewModel.l(f2));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.e.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.bi9, viewGroup, false);
    }
}
