package com.ss.android.ugc.aweme.mix.createmix;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.tiktok.proxy.f;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends Fragment implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final c f109839d = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f109840a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f109841b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f109842c;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109843e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f109844f;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70348);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70346);
    }

    private View a(int i2) {
        if (this.f109844f == null) {
            this.f109844f = new SparseArray();
        }
        View view = (View) this.f109844f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f109844f.put(i2, findViewById);
        return findViewById;
    }

    public final MixCreateViewModel a() {
        return (MixCreateViewModel) this.f109843e.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70349);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static d a(String str, String str2) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", str2);
            bundle.putBoolean("half_create_name", false);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f109844f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public d() {
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        this.f109843e = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC2813d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109845a;

        static {
            Covode.recordClassIndex(70350);
        }

        View$OnClickListenerC2813d(d dVar) {
            this.f109845a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f109845a);
            if (b2 != null) {
                b2.finish();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109846a;

        static {
            Covode.recordClassIndex(70351);
        }

        e(d dVar) {
            this.f109846a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if ((com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) && !this.f109846a.f109842c) {
                this.f109846a.a().a(com.ss.android.ugc.aweme.mix.createmix.viewmodel.b.MULTI_VIDEO);
            } else {
                this.f109846a.a().a(com.ss.android.ugc.aweme.mix.createmix.viewmodel.b.CREATE_NAME);
            }
            String str = this.f109846a.f109840a;
            String str2 = this.f109846a.f109841b;
            l.d(str, "");
            l.d(str2, "");
            r.a("start_first_playlist", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", str2).f66730a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TextTitleBar textTitleBar = (TextTitleBar) a(R.id.em8);
        l.b(textTitleBar, "");
        textTitleBar.getBackBtn().setImageResource(2131233214);
        TextTitleBar textTitleBar2 = (TextTitleBar) a(R.id.em8);
        l.b(textTitleBar2, "");
        textTitleBar2.getBackBtn().setOnClickListener(new View$OnClickListenerC2813d(this));
        if (com.ss.android.ugc.aweme.mix.c.b.a() == 1) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.e_y);
            l.b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.g61));
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ea2);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(getString(R.string.g63));
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.ea5);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(getString(R.string.g5z));
        } else if (com.ss.android.ugc.aweme.mix.c.b.a() == 2) {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.e_y);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(getString(R.string.g61));
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.ea2);
            l.b(tuxTextView5, "");
            tuxTextView5.setText(getString(R.string.g5z));
            TuxTextView tuxTextView6 = (TuxTextView) a(R.id.ea4);
            l.b(tuxTextView6, "");
            tuxTextView6.setVisibility(8);
            TuxTextView tuxTextView7 = (TuxTextView) a(R.id.ea5);
            l.b(tuxTextView7, "");
            tuxTextView7.setVisibility(8);
            View a2 = a(R.id.ca9);
            l.b(a2, "");
            a2.setVisibility(8);
        }
        com.ss.android.ugc.aweme.l.a.a.a(a(R.id.button), 300);
        ((TuxButton) a(R.id.button)).setOnClickListener(new e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = "";
        l.d(layoutInflater, str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            if (string == null) {
                string = str;
            }
            this.f109840a = string;
            String string2 = arguments.getString("enter_method");
            if (string2 != null) {
                str = string2;
            }
            this.f109841b = str;
            this.f109842c = arguments.getBoolean("half_create_name");
        }
        return com.a.a(layoutInflater, R.layout.aku, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
