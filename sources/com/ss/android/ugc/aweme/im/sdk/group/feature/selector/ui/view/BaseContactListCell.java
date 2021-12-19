package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.w;
import h.z;

public class BaseContactListCell<T extends b> extends PowerCell<T> implements com.bytedance.assem.arch.viewModel.h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f102751a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f102752b;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102753j;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(65840);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b invoke(com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65833);
    }

    /* access modifiers changed from: protected */
    public final ContactListViewModel a() {
        return (ContactListViewModel) this.f102753j.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.tiktok.proxy.f
    public androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final boolean a(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        return a().a(iMUser);
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65835);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(65836);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(65841);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(65844);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(65845);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public final void b() {
        if (!this.f102751a) {
            c(a().n());
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65834);
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        this.itemView.setOnClickListener(new o(this));
        f.a.a(this, a(), a.f102761a, com.bytedance.assem.arch.viewModel.l.a(), new p(this), 4);
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.core.a invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return (com.bytedance.assem.arch.core.a) i2;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final ad.b invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).q();
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (androidx.fragment.app.e) context2;
                }
                throw new w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            androidx.fragment.app.e eVar;
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (androidx.fragment.app.e) context2;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (androidx.fragment.app.e) baseContext;
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    return (Fragment) i3;
                }
                throw new w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(65847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            Fragment a2;
            af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a2 != null && (viewModelStore = a2.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    public BaseContactListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
        a aVar = new a(a2);
        g gVar = g.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, h.INSTANCE, new i(this), new j(this), k.INSTANCE, gVar);
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, l.INSTANCE, new m(this), new n(this), b.INSTANCE, gVar);
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, c.INSTANCE, new d(this), new e(this), new f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f102753j = bVar;
    }

    /* access modifiers changed from: protected */
    public final void b(boolean z) {
        this.f102752b = z;
        c(z);
    }

    private final void c(boolean z) {
        float f2;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        if (z) {
            f2 = 0.34f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5a, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: protected */
    public final boolean b(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        return a().b(iMUser);
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseContactListCell f102754a;

        static {
            Covode.recordClassIndex(65848);
        }

        o(BaseContactListCell baseContactListCell) {
            this.f102754a = baseContactListCell;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            int a2;
            ClickAgent.onClick(view);
            if (this.f102754a.f34234d != null && !this.f102754a.f102752b) {
                if (this.f102754a.f102751a || !this.f102754a.a().n()) {
                    b bVar = (b) this.f102754a.f34234d;
                    if (bVar != null && (iMUser = bVar.f102762a) != null) {
                        this.f102754a.a().a(iMUser, true ^ this.f102754a.f102751a);
                        return;
                    }
                    return;
                }
                View view2 = this.f102754a.itemView;
                h.f.b.l.b(view2, "");
                com.bytedance.tux.g.b bVar2 = new com.bytedance.tux.g.b(view2);
                ContactListViewModel a3 = this.f102754a.a();
                int i2 = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.a.f102784b[a3.g().getEntry().ordinal()];
                if (i2 == 1) {
                    com.bytedance.im.core.d.h h2 = a3.h();
                    if (h2 != null) {
                        a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.d(h2);
                    } else {
                        a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.c.b.a();
                    }
                } else if (i2 == 2) {
                    a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.c.b.a();
                } else {
                    throw new h.n();
                }
                bVar2.a(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(a2)).b();
            }
        }
    }

    public void a(T t) {
        h.f.b.l.d(t, "");
        View view = this.itemView;
        h.f.b.l.b(view, "");
        view.setAlpha(1.0f);
        View view2 = this.itemView;
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view2.findViewById(R.id.pf), t.f102762a.getDisplayAvatar());
        View findViewById = view2.findViewById(R.id.csg);
        h.f.b.l.b(findViewById, "");
        ((TextView) findViewById).setText(t.f102762a.getDisplayName());
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.al5);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(t.f102762a.getUniqueId());
        a(a(t.f102762a));
        b(b(t.f102762a));
        b();
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (this.f102751a != z) {
            this.f102751a = z;
            View view = this.itemView;
            h.f.b.l.b(view, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.ad3);
            h.f.b.l.b(tuxCheckBox, "");
            tuxCheckBox.setChecked(z);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ BaseContactListCell this$0;

        static {
            Covode.recordClassIndex(65849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(BaseContactListCell baseContactListCell) {
            super(2);
            this.this$0 = baseContactListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            IMUser iMUser;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (!(this.this$0.f34234d == null || aVar2 == null || (t = aVar2.f25631b) == null)) {
                b bVar = (b) this.this$0.f34234d;
                if (bVar != null) {
                    iMUser = bVar.f102762a;
                } else {
                    iMUser = null;
                }
                if (h.f.b.l.a((Object) iMUser, (Object) t)) {
                    BaseContactListCell baseContactListCell = this.this$0;
                    baseContactListCell.a(baseContactListCell.a((IMUser) t));
                    BaseContactListCell baseContactListCell2 = this.this$0;
                    baseContactListCell2.b(baseContactListCell2.b(t));
                }
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
