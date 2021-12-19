package com.ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.page.tag.g;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import java.util.Set;

public class BaseFriendsListCell<T extends g> extends PowerCell<T> implements com.bytedance.assem.arch.viewModel.h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f72127a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g f72128b;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72129j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72130k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f72131l;

    public static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(44336);
        }

        public h() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c cVar) {
            h.f.b.l.c(cVar, "");
            return cVar;
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(44340);
        }

        public l() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44322);
    }

    /* access modifiers changed from: protected */
    public final VideoTagFriendsListViewModel a() {
        return (VideoTagFriendsListViewModel) this.f72129j.getValue();
    }

    /* access modifiers changed from: protected */
    public final VideoTagSearchListViewModel b() {
        return (VideoTagSearchListViewModel) this.f72130k.getValue();
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
        return a().c(iMUser);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z2) {
        if (this.f72127a != z2) {
            this.f72127a = z2;
            View view = this.itemView;
            h.f.b.l.b(view, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.b9z);
            h.f.b.l.b(tuxCheckBox, "");
            tuxCheckBox.setChecked(z2);
        }
    }

    static final class af extends h.f.b.m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final af f72135a = new af();

        static {
            Covode.recordClassIndex(44329);
        }

        af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44330);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(44331);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c>> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(44337);
        }

        public i() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final m INSTANCE = new m();

        static {
            Covode.recordClassIndex(44341);
        }

        public m() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c>> {
        public static final n INSTANCE = new n();

        static {
            Covode.recordClassIndex(44342);
        }

        public n() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final q INSTANCE = new q();

        static {
            Covode.recordClassIndex(44345);
        }

        public q() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c>> {
        public static final r INSTANCE = new r();

        static {
            Covode.recordClassIndex(44346);
        }

        public r() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d>> {
        public static final v INSTANCE = new v();

        static {
            Covode.recordClassIndex(44350);
        }

        public v() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final y INSTANCE = new y();

        static {
            Covode.recordClassIndex(44353);
        }

        public y() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d>> {
        public static final z INSTANCE = new z();

        static {
            Covode.recordClassIndex(44354);
        }

        public z() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44323);
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

    public static final class g extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(h.k.c cVar) {
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
        this.itemView.setOnClickListener(new ad(this));
        f.a.a(this, a(), b.f72236a, com.bytedance.assem.arch.viewModel.l.a(), new ae(this), 4);
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44332);
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
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44334);
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
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class aa extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public aa(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class ab extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ab(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
            Fragment a2;
            androidx.lifecycle.af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new h.w("null cannot be cast to non-null type");
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

    public static final class j extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
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
                    throw new h.w("null cannot be cast to non-null type");
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
                        throw new h.w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            androidx.lifecycle.af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
            Fragment a2;
            androidx.lifecycle.af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new h.w("null cannot be cast to non-null type");
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

    public static final class w extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(PowerCell powerCell) {
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
                throw new h.w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.a<androidx.lifecycle.af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.af invoke() {
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
                    throw new h.w("null cannot be cast to non-null type");
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
                        throw new h.w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            androidx.lifecycle.af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public BaseFriendsListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = h.f.b.ab.a(VideoTagFriendsListViewModel.class);
        a aVar = new a(a2);
        l lVar = l.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, v.INSTANCE, new w(this), new x(this), y.INSTANCE, lVar);
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, z.INSTANCE, new aa(this), new ab(this), b.INSTANCE, lVar);
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, c.INSTANCE, new d(this), new e(this), new f(this), lVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f72129j = bVar;
        i.d dVar2 = i.d.f25721a;
        h.k.c a3 = h.f.b.ab.a(VideoTagSearchListViewModel.class);
        g gVar = new g(a3);
        h hVar = h.INSTANCE;
        if (h.f.b.l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, gVar, i.INSTANCE, new j(this), new k(this), m.INSTANCE, hVar);
        } else if (h.f.b.l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, gVar, n.INSTANCE, new o(this), new p(this), q.INSTANCE, hVar);
        } else if (dVar2 == null || h.f.b.l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, gVar, r.INSTANCE, new s(this), new t(this), new u(this), hVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar2 + " there");
        }
        this.f72130k = bVar2;
        this.f72131l = h.i.a((h.f.a.a) af.f72135a);
        this.f72128b = com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.NONE;
    }

    private void a(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g gVar) {
        boolean z2;
        float f2;
        h.f.b.l.d(gVar, "");
        this.f72128b = gVar;
        if (gVar != com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.NONE) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.itemView;
        h.f.b.l.b(view, "");
        if (z2) {
            f2 = 0.34f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    private final boolean c(IMUser iMUser) {
        if (a().h() == 1 || ((a().h() == 2 && iMUser.getFollowStatus() != 2) || (a().j() && iMUser.getFollowStatus() != 2 && iMUser.getFollowerStatus() != 1))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.j6, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final void b(IMUser iMUser) {
        if (!this.f72127a) {
            if (iMUser.getVideoTagBlockStatus() != 3 && !a().f72288l.contains(iMUser.getUid())) {
                Set<String> set = a().f72289m.get(3);
                if (set == null) {
                    set = h.a.ab.INSTANCE;
                }
                if (!set.contains(iMUser.getUid())) {
                    if (!(iMUser.getVideoTagBlockStatus() == 1 || iMUser.getVideoTagBlockStatus() == 2 || c(iMUser))) {
                        Set<String> set2 = a().f72289m.get(1);
                        if (set2 == null) {
                            set2 = h.a.ab.INSTANCE;
                        }
                        if (!set2.contains(iMUser.getUid())) {
                            Set<String> set3 = a().f72289m.get(2);
                            if (set3 == null) {
                                set3 = h.a.ab.INSTANCE;
                            }
                            if (!set3.contains(iMUser.getUid())) {
                                if (a().m()) {
                                    a(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.EXCEED_SIZE);
                                    return;
                                } else {
                                    a(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.NONE);
                                    return;
                                }
                            }
                        }
                    }
                    a(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.PRIVACY);
                    return;
                }
            }
            a(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.SELF_REMOVE);
        }
    }

    public static final class ac implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFriendsListCell f72132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f72133b;

        static {
            Covode.recordClassIndex(44326);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            String str;
            String str2;
            g gVar = this.f72133b;
            String str3 = "";
            if (gVar instanceof j) {
                VideoTagSearchListViewModel b2 = this.f72132a.b();
                IMUser iMUser = this.f72133b.f72258a;
                h.f.b.l.d(iMUser, str3);
                if (!b2.n.contains(iMUser.getUid())) {
                    Set<String> set = b2.n;
                    String uid = iMUser.getUid();
                    h.f.b.l.b(uid, str3);
                    set.add(uid);
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("previous_page", b2.j().getEnterFrom()).a("to_user_id", iMUser.getUid());
                    if (b2.f72308k.contains(iMUser)) {
                        str2 = "following";
                    } else {
                        str2 = "all_user";
                    }
                    com.ss.android.ugc.aweme.common.r.a("tag_mention_head_show", a2.a("user_type", str2).a("search_keyword", b2.f72310m).a("function", "tag").f66730a);
                }
                i iVar = ((j) this.f72133b).f72266d;
                if (iVar != null) {
                    VideoTagSearchListViewModel b3 = this.f72132a.b();
                    String str4 = iVar.f72262a;
                    com.ss.android.ugc.aweme.search.model.e eVar = iVar.f72263b;
                    int absoluteAdapterPosition = this.f72132a.getAbsoluteAdapterPosition();
                    h.f.b.l.d(eVar, str3);
                    int size = (absoluteAdapterPosition - b3.f72309l.size()) - 1;
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", "tag_user").a("new_sug_session_id", com.ss.android.ugc.aweme.comment.m.e.f72111a);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("impr_id", str3).a("raw_query", b3.f72310m).a("sug_user_id", eVar.f121524g.getUserId()).a("user_tag", eVar.f121524g.getUserRelationType());
                    if (size < 0) {
                        size = 0;
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("words_position", size);
                    Word word = eVar.f121523f;
                    String str5 = null;
                    if (word != null) {
                        str = word.getWordSource();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("words_source", str);
                    Word word2 = eVar.f121523f;
                    if (word2 != null) {
                        str5 = word2.getId();
                    }
                    com.ss.android.ugc.aweme.common.r.a("trending_words_show", a6.a("group_id", str5).f66730a);
                }
            } else if (gVar instanceof g) {
                VideoTagFriendsListViewModel a7 = this.f72132a.a();
                IMUser iMUser2 = this.f72133b.f72258a;
                h.f.b.l.d(iMUser2, str3);
                if (!a7.o.contains(iMUser2.getUid())) {
                    Set<String> set2 = a7.o;
                    String uid2 = iMUser2.getUid();
                    h.f.b.l.b(uid2, str3);
                    set2.add(uid2);
                    com.ss.android.ugc.aweme.common.r.a("tag_mention_head_show", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", a7.g().getEnterFrom()).a("to_user_id", iMUser2.getUid()).a("user_type", a7.d(iMUser2)).a("search_keyword", str3).a("function", "tag").f66730a);
                }
            }
        }

        ac(BaseFriendsListCell baseFriendsListCell, g gVar) {
            this.f72132a = baseFriendsListCell;
            this.f72133b = gVar;
        }
    }

    static final class ad implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFriendsListCell f72134a;

        static {
            Covode.recordClassIndex(44327);
        }

        ad(BaseFriendsListCell baseFriendsListCell) {
            this.f72134a = baseFriendsListCell;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            String str;
            String str2;
            int i2;
            ClickAgent.onClick(view);
            String str3 = "";
            if (this.f72134a.f72127a || this.f72134a.f72128b == com.ss.android.ugc.aweme.comment.page.tag.viewmodel.g.NONE) {
                g gVar = (g) this.f72134a.f34234d;
                if (gVar != null && (iMUser = gVar.f72258a) != null) {
                    if (in.a(iMUser.getUid())) {
                        View view2 = this.f72134a.itemView;
                        h.f.b.l.b(view2, str3);
                        com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(view2);
                        View view3 = this.f72134a.itemView;
                        h.f.b.l.b(view3, str3);
                        bVar.a(view3.getContext().getString(R.string.gcb)).b();
                        return;
                    }
                    this.f72134a.a().a(iMUser, !this.f72134a.f72127a);
                    String str4 = "choose";
                    if (this.f72134a.f34234d instanceof j) {
                        VideoTagSearchListViewModel b2 = this.f72134a.b();
                        boolean z = !this.f72134a.f72127a;
                        h.f.b.l.d(iMUser, str3);
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("previous_page", b2.j().getEnterFrom()).a("to_user_id", iMUser.getUid());
                        if (!z) {
                            str4 = "cancel_choose";
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("click_type", str4);
                        if (b2.f72308k.contains(iMUser)) {
                            str = "following";
                        } else {
                            str = "all_user";
                        }
                        com.ss.android.ugc.aweme.common.r.a("tag_mention_head_click", a3.a("user_type", str).a("search_keyword", b2.f72310m).a("function", "tag").f66730a);
                        T t = this.f72134a.f34234d;
                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.page.tag.SearchResultItem");
                        i iVar = ((j) t).f72266d;
                        if (iVar != null) {
                            VideoTagSearchListViewModel b3 = this.f72134a.b();
                            String str5 = iVar.f72262a;
                            com.ss.android.ugc.aweme.search.model.e eVar = iVar.f72263b;
                            int absoluteAdapterPosition = this.f72134a.getAbsoluteAdapterPosition();
                            h.f.b.l.d(eVar, str3);
                            int size = (absoluteAdapterPosition - b3.f72309l.size()) - 1;
                            com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", "tag_user").a("new_sug_session_id", com.ss.android.ugc.aweme.comment.m.e.f72111a);
                            if (str5 != null) {
                                str3 = str5;
                            }
                            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("impr_id", str3).a("raw_query", b3.f72310m).a("sug_user_id", eVar.f121524g.getUserId()).a("user_tag", eVar.f121524g.getUserRelationType());
                            if (size < 0) {
                                size = 0;
                            }
                            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("words_position", size);
                            Word word = eVar.f121523f;
                            String str6 = null;
                            if (word != null) {
                                str2 = word.getWordSource();
                            } else {
                                str2 = null;
                            }
                            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("words_source", str2);
                            Word word2 = eVar.f121523f;
                            if (word2 != null) {
                                str6 = word2.getId();
                            }
                            com.ss.android.ugc.aweme.common.r.a("trending_words_click", a7.a("group_id", str6).f66730a);
                        }
                    } else if (this.f72134a.f34234d instanceof g) {
                        VideoTagFriendsListViewModel a8 = this.f72134a.a();
                        if (this.f72134a.f72127a) {
                            str4 = "cancel_choose";
                        }
                        a8.a(iMUser, str4);
                    }
                }
            } else {
                View view4 = this.f72134a.itemView;
                h.f.b.l.b(view4, str3);
                com.bytedance.tux.g.b bVar2 = new com.bytedance.tux.g.b(view4);
                int i3 = a.f72172a[this.f72134a.f72128b.ordinal()];
                if (i3 == 1) {
                    i2 = R.string.gce;
                } else if (i3 == 2) {
                    i2 = R.string.d3i;
                } else if (i3 != 3) {
                    i2 = R.string.gcc;
                } else {
                    i2 = R.string.gcg;
                }
                bVar2.e(i2).b();
            }
        }
    }

    public void a(T t2) {
        h.f.b.l.d(t2, "");
        View view = this.itemView;
        h.f.b.l.b(view, "");
        view.setAlpha(1.0f);
        View view2 = this.itemView;
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view2.findViewById(R.id.pf), t2.f72258a.getDisplayAvatar());
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.csg);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(a().a(t2.f72258a));
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        io.a(view3.getContext(), t2.f72258a.getCustomVerify(), t2.f72258a.getEnterpriseVerifyReason(), (TextView) view2.findViewById(R.id.csg));
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.al5);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(a().b(t2.f72258a));
        if (!((ISearchUserService) this.f72131l.getValue()).a() || t2.f72258a.getFollowStatus() != 2) {
            TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.dkf);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) view2.findViewById(R.id.dkf);
            h.f.b.l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
        }
        view2.addOnAttachStateChangeListener(new ac(this, t2));
        a(a(t2.f72258a));
        b(t2.f72258a);
    }

    static final class ae extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends IMUser>, h.z> {
        final /* synthetic */ BaseFriendsListCell this$0;

        static {
            Covode.recordClassIndex(44328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(BaseFriendsListCell baseFriendsListCell) {
            super(2);
            this.this$0 = baseFriendsListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            g gVar;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || (gVar = (g) this.this$0.f34234d) == null)) {
                if (h.f.b.l.a((Object) gVar.f72258a, (Object) t)) {
                    BaseFriendsListCell baseFriendsListCell = this.this$0;
                    baseFriendsListCell.a(baseFriendsListCell.a((IMUser) t));
                }
                this.this$0.b(gVar.f72258a);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
