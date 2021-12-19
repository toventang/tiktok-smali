package com.ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.w;
import java.util.List;

public final class FeedTaggedEditCell extends PowerCell<c> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72136a;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(44362);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(44355);
    }

    public final FeedTaggedListViewModel a() {
        return (FeedTaggedListViewModel) this.f72136a.getValue();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44357);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(44358);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(44363);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(44366);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(44367);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.itemView.setOnClickListener(new o(this));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44356);
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

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44359);
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
            Covode.recordClassIndex(44360);
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
            Covode.recordClassIndex(44361);
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
            Covode.recordClassIndex(44364);
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
            Covode.recordClassIndex(44365);
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
            Covode.recordClassIndex(44368);
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
            Covode.recordClassIndex(44369);
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

    public FeedTaggedEditCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(FeedTaggedListViewModel.class);
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
        this.f72136a = bVar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.i8, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedEditCell f72137a;

        static final class a implements OnActivityResultCallback {

            /* renamed from: a  reason: collision with root package name */
            public static final a f72138a = new a();

            static {
                Covode.recordClassIndex(44371);
            }

            a() {
            }

            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i2, int i3, Intent intent) {
            }
        }

        static {
            Covode.recordClassIndex(44370);
        }

        o(FeedTaggedEditCell feedTaggedEditCell) {
            this.f72137a = feedTaggedEditCell;
        }

        public final void onClick(View view) {
            f fVar;
            int i2;
            List<InteractionTagUserInfo> list;
            InteractionTagInfo interactionTagInfo;
            AwemeStatus status;
            ClickAgent.onClick(view);
            c cVar = (c) this.f72137a.f34234d;
            if (!(cVar == null || (fVar = cVar.f72237a) == null)) {
                CommentService e2 = CommentServiceImpl.e();
                View view2 = this.f72137a.itemView;
                h.f.b.l.b(view2, "");
                Context context = view2.getContext();
                h.f.b.l.b(context, "");
                String str = fVar.f72257b;
                if (str == null) {
                    str = "";
                }
                Aweme aweme = fVar.f72256a;
                Aweme aweme2 = fVar.f72256a;
                if (aweme2 == null || (status = aweme2.getStatus()) == null) {
                    i2 = 0;
                } else {
                    i2 = status.getPrivateStatus();
                }
                Aweme aweme3 = fVar.f72256a;
                if (aweme3 == null || (interactionTagInfo = aweme3.getInteractionTagInfo()) == null) {
                    list = null;
                } else {
                    list = interactionTagInfo.getTaggedUsers();
                }
                e2.a(context, str, aweme, i2, list, a.f72138a);
            }
            this.f72137a.a().a("", "click_edit");
            this.f72137a.a().a(FeedTaggedListViewModel.b.f72279a);
        }
    }
}
