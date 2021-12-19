package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.zhiliaoapp.musically.R;
import dagger.hilt.b.a;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class a extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final c f100722i = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public p f100723e;

    /* renamed from: f  reason: collision with root package name */
    EpoxyRecyclerView f100724f;

    /* renamed from: g  reason: collision with root package name */
    ProgressBar f100725g;

    /* renamed from: h  reason: collision with root package name */
    TuxTextView f100726h;

    /* renamed from: j  reason: collision with root package name */
    private View f100727j;

    /* renamed from: k  reason: collision with root package name */
    private TuxIconView f100728k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f100729l = h.i.a((h.f.a.a) new e(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f100730m;
    private HashMap n;

    static {
        Covode.recordClassIndex(64441);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final GifController c() {
        return (GifController) this.f100729l.getValue();
    }

    public final GiphyViewModel d() {
        return (GiphyViewModel) this.f100730m.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$a  reason: collision with other inner class name */
    public static final class C2491a extends m implements h.f.a.a<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        static {
            Covode.recordClassIndex(64442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2491a(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // h.f.a.a
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class c {
        static {
            Covode.recordClassIndex(64444);
        }

        private c() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$c$a  reason: collision with other inner class name */
        public static final class C2492a implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f100731a;

            static {
                Covode.recordClassIndex(64445);
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a(String str) {
                l.d(str, "");
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void c() {
            }

            C2492a(q qVar) {
                this.f100731a = qVar;
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a(View view, com.ss.android.ugc.aweme.emoji.b.a aVar, int i2) {
                l.d(view, "");
                l.d(aVar, "");
                this.f100731a.invoke(view, aVar, Integer.valueOf(i2));
            }
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        static final class b implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f100732a;

            static {
                Covode.recordClassIndex(64446);
            }

            b(a aVar) {
                this.f100732a = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                a aVar = this.f100732a;
                l.b(dialogInterface, "");
                l.d(dialogInterface, "");
                GiphyViewModel d2 = aVar.d();
                Long l2 = d2.f100711h;
                if (l2 != null) {
                    d2.f100713j.a(d2.f100713j.a() - l2.longValue());
                }
            }
        }

        public static void a(androidx.fragment.app.e eVar, q<? super View, ? super com.ss.android.ugc.aweme.emoji.b.a, ? super Integer, z> qVar) {
            l.d(eVar, "");
            l.d(qVar, "");
            if (eVar.getSupportFragmentManager().a("gifChoosePanelBottomSheet") == null) {
                a aVar = new a();
                Resources resources = eVar.getResources();
                l.b(resources, "");
                com.bytedance.tux.sheet.sheet.a aVar2 = new a.C1112a().a(true).a(1).b(h.g.a.a(((float) resources.getDisplayMetrics().heightPixels) * 0.8f)).c().b(false).a(new b(aVar)).a(aVar).f45299a;
                aVar.a(new C2492a(qVar));
                aVar2.show(eVar.getSupportFragmentManager(), "gifChoosePanelBottomSheet");
            }
        }
    }

    public static final class d implements GiphyViewModel.a {
        static {
            Covode.recordClassIndex(64447);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel.a
        public final long a() {
            return System.currentTimeMillis();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel.a
        public final void a(boolean z) {
            a.b bVar = a.b.f100614a;
            l.d(bVar, "");
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("success", String.valueOf(z));
            bVar.invoke("gif_analytics", aVar);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel.a
        public final void a(long j2) {
            a.c cVar = a.c.f100615a;
            l.d(cVar, "");
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("enter_from", a.C2480a.f100611a);
            aVar.put("process_id", com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b);
            aVar.put("duration", String.valueOf(j2));
            cVar.invoke("gif_stay_time", aVar);
        }
    }

    public static final class b extends m implements h.f.a.a<af> {
        final /* synthetic */ h.f.a.a $ownerProducer;

        static {
            Covode.recordClassIndex(64443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.f.a.a aVar) {
            super(0);
            this.$ownerProducer = aVar;
        }

        @Override // h.f.a.a
        public final af invoke() {
            af viewModelStore = ((ag) this.$ownerProducer.invoke()).getViewModelStore();
            l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        GiphyViewModel d2 = d();
        d2.f100711h = Long.valueOf(d2.f100713j.a());
    }

    static final class e extends m implements h.f.a.a<GifController> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GifController invoke() {
            Context requireContext = this.this$0.requireContext();
            l.b(requireContext, "");
            p pVar = this.this$0.f100723e;
            if (pVar == null) {
                l.a("inputBridge");
            }
            return new GifController(requireContext, pVar, this.this$0.d());
        }
    }

    public a() {
        C2491a aVar = new C2491a(this);
        h.k.c a2 = ab.a(GiphyViewModel.class);
        b bVar = new b(aVar);
        l.c(this, "");
        l.c(a2, "");
        l.c(bVar, "");
        this.f100730m = new dagger.hilt.b.b(a2, bVar, new a.C4139a(this));
    }

    public static final class g extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100734a;

        static {
            Covode.recordClassIndex(64450);
        }

        g(a aVar) {
            this.f100734a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 1) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.l.a(this.f100734a.requireActivity(), recyclerView);
            }
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100738a;

        static {
            Covode.recordClassIndex(64454);
        }

        k(a aVar) {
            this.f100738a = aVar;
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
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(java.lang.Object r2) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a r0 = r1.f100738a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a.k.onChanged(java.lang.Object):void");
        }
    }

    public final void a(p pVar) {
        l.d(pVar, "");
        this.f100723e = pVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100733a;

        static {
            Covode.recordClassIndex(64449);
        }

        f(a aVar) {
            this.f100733a = aVar;
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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a r0 = r1.f100733a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a.f.onClick(android.view.View):void");
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100736a;

        static {
            Covode.recordClassIndex(64452);
        }

        i(a aVar) {
            this.f100736a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b> list = (List) obj;
            l.d(list, "");
            this.f100736a.c().setData(list);
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100735a;

        static {
            Covode.recordClassIndex(64451);
        }

        h(a aVar) {
            this.f100735a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (l.a(obj, (Object) true)) {
                a aVar = this.f100735a;
                ProgressBar progressBar = aVar.f100725g;
                if (progressBar == null) {
                    l.a("progressBar");
                }
                progressBar.setVisibility(0);
                TuxTextView tuxTextView = aVar.f100726h;
                if (tuxTextView == null) {
                    l.a("statusTextView");
                }
                tuxTextView.setVisibility(8);
                EpoxyRecyclerView epoxyRecyclerView = aVar.f100724f;
                if (epoxyRecyclerView == null) {
                    l.a("recyclerView");
                }
                epoxyRecyclerView.setVisibility(4);
            } else if (l.a(obj, (Object) false)) {
                a aVar2 = this.f100735a;
                ProgressBar progressBar2 = aVar2.f100725g;
                if (progressBar2 == null) {
                    l.a("progressBar");
                }
                progressBar2.setVisibility(8);
                TuxTextView tuxTextView2 = aVar2.f100726h;
                if (tuxTextView2 == null) {
                    l.a("statusTextView");
                }
                tuxTextView2.setVisibility(8);
                EpoxyRecyclerView epoxyRecyclerView2 = aVar2.f100724f;
                if (epoxyRecyclerView2 == null) {
                    l.a("recyclerView");
                }
                epoxyRecyclerView2.setVisibility(0);
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100737a;

        static {
            Covode.recordClassIndex(64453);
        }

        j(a aVar) {
            this.f100737a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b> value;
            Integer value2 = this.f100737a.d().f100705b.getValue();
            if (value2 != null && value2.intValue() == 0 && (value = this.f100737a.d().f100708e.getValue()) != null && value.size() == 0) {
                a aVar = this.f100737a;
                ProgressBar progressBar = aVar.f100725g;
                if (progressBar == null) {
                    l.a("progressBar");
                }
                progressBar.setVisibility(8);
                TuxTextView tuxTextView = aVar.f100726h;
                if (tuxTextView == null) {
                    l.a("statusTextView");
                }
                tuxTextView.setVisibility(0);
                aVar.c().setData(h.a.z.INSTANCE);
            }
        }
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
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a73, viewGroup, false);
    }
}
