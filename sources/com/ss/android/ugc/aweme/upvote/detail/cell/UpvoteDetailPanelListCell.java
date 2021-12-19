package com.ss.android.ugc.aweme.upvote.detail.cell;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.detail.cell.a;
import com.ss.android.ugc.aweme.upvote.detail.cell.b;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.v;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Objects;

public final class UpvoteDetailPanelListCell extends PowerCell<d> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final o f142097a = new o((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f142098b = h.i.a((h.f.a.a) new r(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f142099j = h.i.a((h.f.a.a) new p(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f142100k = h.i.a((h.f.a.a) new q(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f142101l;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.upvote.detail.panel.l, com.ss.android.ugc.aweme.upvote.detail.panel.l> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(92872);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.upvote.detail.panel.l invoke(com.ss.android.ugc.aweme.upvote.detail.panel.l lVar) {
            h.f.b.l.c(lVar, "");
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(92865);
    }

    private final a b() {
        return (a) this.f142099j.getValue();
    }

    private final b c() {
        return (b) this.f142100k.getValue();
    }

    public final UpvoteDetailPanelViewModel a() {
        return (UpvoteDetailPanelViewModel) this.f142101l.getValue();
    }

    public static final class o {
        static {
            Covode.recordClassIndex(92880);
        }

        private o() {
        }

        public /* synthetic */ o(byte b2) {
            this();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(92867);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(92868);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(92873);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(92876);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(92877);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.upvote.detail.panel.l> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(92866);
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

    static final class r extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ UpvoteDetailPanelListCell this$0;

        static {
            Covode.recordClassIndex(92883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.this$0 = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b80);
            h.f.b.l.b(tuxTextView, "");
            return new c(tuxTextView, this.this$0);
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(92869);
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
            Covode.recordClassIndex(92870);
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
            Covode.recordClassIndex(92871);
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

    static final class p extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ UpvoteDetailPanelListCell this$0;

        static {
            Covode.recordClassIndex(92881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.this$0 = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aan);
            h.f.b.l.b(tuxTextView, "");
            return new a(tuxTextView, this.this$0.a());
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ UpvoteDetailPanelListCell this$0;

        static {
            Covode.recordClassIndex(92882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.this$0 = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            View findViewById = view.findViewById(R.id.cf0);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            return new b((ViewGroup) findViewById, this.this$0.a());
        }
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvoteDetailPanelListCell f142102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Resources f142103b;

        static {
            Covode.recordClassIndex(92885);
        }

        t(UpvoteDetailPanelListCell upvoteDetailPanelListCell, Resources resources) {
            this.f142102a = upvoteDetailPanelListCell;
            this.f142103b = resources;
        }

        public final void run() {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f142102a.itemView, "backgroundColor", this.f142103b.getColor(R.color.v), this.f142103b.getColor(R.color.c9));
            ofInt.setDuration(3000L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.start();
            d dVar = (d) this.f142102a.f34234d;
            if (dVar != null) {
                dVar.f142131c = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        d dVar = (d) this.f34234d;
        if (dVar != null && dVar.f142131c) {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            this.itemView.postDelayed(new t(this, view.getResources()), 150);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(92874);
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
            Covode.recordClassIndex(92875);
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
            Covode.recordClassIndex(92878);
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
            Covode.recordClassIndex(92879);
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

    public UpvoteDetailPanelListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(UpvoteDetailPanelViewModel.class);
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
        this.f142101l = bVar;
    }

    static final class s extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.upvote.c.h $upvote;
        final /* synthetic */ UpvoteDetailPanelListCell this$0;

        static {
            Covode.recordClassIndex(92884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(UpvoteDetailPanelListCell upvoteDetailPanelListCell, com.ss.android.ugc.aweme.upvote.c.h hVar) {
            super(1);
            this.this$0 = upvoteDetailPanelListCell;
            this.$upvote = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r8 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            r8 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
            if (r3 == null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            r9 = r3.f142223c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            if (r9 != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
            r9 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r3 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r0 = r3.f142225e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r0 != null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            com.ss.android.ugc.aweme.upvote.publish.c.a(r2, r1, new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam(r6, "long_press", r8, r9, r10), null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            return h.z.f158842a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
            r10 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r3 != null) goto L_0x002b;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(android.view.View r12) {
            /*
                r11 = this;
                java.lang.String r10 = ""
                h.f.b.l.d(r12, r10)
                com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell r0 = r11.this$0
                T extends com.bytedance.ies.powerlist.b.a r0 = r0.f34234d
                com.ss.android.ugc.aweme.upvote.detail.cell.d r0 = (com.ss.android.ugc.aweme.upvote.detail.cell.d) r0
                r4 = 0
                if (r0 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.upvote.event.b r3 = r0.f142130b
            L_0x0010:
                com.ss.android.ugc.aweme.upvote.c.h r0 = r11.$upvote
                java.lang.String r2 = r0.getItemId()
                com.ss.android.ugc.aweme.upvote.c.h r0 = r11.$upvote
                java.lang.String r0 = r0.getText()
                boolean r1 = com.ss.android.ugc.aweme.utils.hk.a(r0)
                com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r5 = new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam
                if (r3 == 0) goto L_0x0028
                java.lang.String r6 = r3.f142221a
                if (r6 != 0) goto L_0x002b
            L_0x0028:
                r6 = r10
                if (r3 == 0) goto L_0x002f
            L_0x002b:
                java.lang.String r8 = r3.f142222b
                if (r8 != 0) goto L_0x0032
            L_0x002f:
                r8 = r10
                if (r3 == 0) goto L_0x0036
            L_0x0032:
                java.lang.String r9 = r3.f142223c
                if (r9 != 0) goto L_0x0039
            L_0x0036:
                r9 = r10
                if (r3 == 0) goto L_0x003d
            L_0x0039:
                java.lang.String r0 = r3.f142225e
                if (r0 != 0) goto L_0x0048
            L_0x003d:
                java.lang.String r7 = "long_press"
                r5.<init>(r6, r7, r8, r9, r10)
                com.ss.android.ugc.aweme.upvote.publish.c.a(r2, r1, r5, r4)
                h.z r0 = h.z.f158842a
                return r0
            L_0x0048:
                r10 = r0
                goto L_0x003d
            L_0x004a:
                r3 = r4
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell.s.invoke(java.lang.Object):java.lang.Object");
        }
    }

    private final void a(boolean z) {
        User user;
        String str;
        Integer num;
        String str2;
        com.ss.android.ugc.aweme.upvote.event.b bVar;
        com.ss.android.ugc.aweme.upvote.c.h hVar;
        d dVar = (d) this.f34234d;
        String str3 = null;
        if (dVar == null || (hVar = dVar.f142129a) == null) {
            user = null;
        } else {
            user = hVar.getUser();
        }
        h.p[] pVarArr = new h.p[4];
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        pVarArr[0] = v.a(str, "to_user_id");
        if (user != null) {
            num = Integer.valueOf(user.getFollowStatus());
        } else {
            num = null;
        }
        pVarArr[1] = v.a(num, "follow_status");
        d dVar2 = (d) this.f34234d;
        if (!(dVar2 == null || (bVar = dVar2.f142130b) == null)) {
            str3 = bVar.f142221a;
        }
        pVarArr[2] = v.a(str3, "enter_from");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[3] = v.a(str2, "is_self");
        com.ss.android.ugc.aweme.common.r.a("click_recommendation", pVarArr);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bi_, viewGroup, false);
        h.f.b.l.b(a2, "");
        ((AvatarImageView) a2.findViewById(R.id.pf)).setOnClickListener(this);
        ((TuxTextView) a2.findViewById(R.id.csg)).setOnClickListener(this);
        a2.findViewById(R.id.am2).setOnClickListener(this);
        a2.setOnClickListener(this);
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(d dVar) {
        String str;
        com.ss.android.ugc.aweme.upvote.event.b bVar;
        UrlModel avatarThumb;
        d dVar2 = dVar;
        h.f.b.l.d(dVar2, "");
        com.ss.android.ugc.aweme.upvote.c.h hVar = dVar2.f142129a;
        User user = hVar.getUser();
        if (user == null || (avatarThumb = user.getAvatarThumb()) == null) {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            ((SimpleDraweeView) view.findViewById(R.id.pf)).setActualImageResource(R.raw.icon_color_default_avatar);
        } else {
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view2.findViewById(R.id.pf), avatarThumb);
        }
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.csg);
        h.f.b.l.b(tuxTextView, "");
        if (user == null || (str = in.a(user, false)) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        if (user != null) {
            View view4 = this.itemView;
            h.f.b.l.b(view4, "");
            Context context = view4.getContext();
            String customVerify = user.getCustomVerify();
            String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
            View view5 = this.itemView;
            h.f.b.l.b(view5, "");
            io.a(context, customVerify, enterpriseVerifyReason, (TextView) view5.findViewById(R.id.csg));
        }
        c cVar = (c) this.f142098b.getValue();
        d dVar3 = (d) this.f34234d;
        com.ss.android.ugc.aweme.upvote.event.b bVar2 = null;
        if (dVar3 != null) {
            bVar = dVar3.f142130b;
        } else {
            bVar = null;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        cVar.f142119b = user;
        cVar.f142120c = bVar;
        cVar.f142121d = bindingAdapterPosition;
        cVar.a().a();
        cVar.f142122e = false;
        if (user != null) {
            ((com.ss.android.ugc.aweme.follow.widet.a) cVar.f142118a.getValue()).a(user);
        }
        a b2 = b();
        h.f.b.l.d(hVar, "");
        b2.f142104a = hVar;
        b2.a(hVar.getText(), hVar.getCreateTime());
        UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = b2.f142106c;
        String commentId = hVar.getCommentId();
        h.f.b.l.d(commentId, "");
        h.f.b.l.d(b2, "");
        UpvoteDetailPanelViewModel.a aVar = upvoteDetailPanelViewModel.h().get(commentId);
        if (aVar != null && aVar.f142149a) {
            b2.a(aVar.f142150b);
        }
        b c2 = c();
        d dVar4 = (d) this.f34234d;
        if (dVar4 != null) {
            bVar2 = dVar4.f142130b;
        }
        h.f.b.l.d(hVar, "");
        c2.f142111d = user;
        c2.f142112e = bVar2;
        if (hVar.isFake()) {
            c2.f142113f.setVisibility(8);
            return;
        }
        c2.f142113f.setVisibility(0);
        c2.a(hVar.getUserLiked(), hVar.getLikeCount());
    }

    public final void onClick(View view) {
        d dVar;
        com.ss.android.ugc.aweme.upvote.c.h hVar;
        User user;
        String str;
        com.ss.android.ugc.aweme.upvote.c.h hVar2;
        com.ss.android.ugc.aweme.upvote.event.b bVar;
        androidx.fragment.app.i supportFragmentManager;
        int i2;
        String uid;
        String str2;
        Integer num;
        ClickAgent.onClick(view);
        if (view != null && (dVar = (d) this.f34234d) != null && (hVar = dVar.f142129a) != null && !hVar.isOperationDisable() && (user = hVar.getUser()) != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            int id = view.getId();
            User user2 = null;
            String str3 = null;
            androidx.fragment.app.e eVar = null;
            user2 = null;
            int i3 = 0;
            int i4 = 1;
            String str4 = "";
            if (id == R.id.pf || id == R.id.csg) {
                d dVar2 = (d) this.f34234d;
                if (dVar2 == null || (bVar = dVar2.f142130b) == null || (str = bVar.f142221a) == null) {
                    str = str4;
                }
                d dVar3 = (d) this.f34234d;
                if (!(dVar3 == null || (hVar2 = dVar3.f142129a) == null)) {
                    user2 = hVar2.getUser();
                }
                com.ss.android.ugc.aweme.metrics.q o2 = new com.ss.android.ugc.aweme.metrics.q().o(str);
                if (user2 != null) {
                    i3 = user2.getFollowStatus();
                }
                o2.V = i3;
                o2.a("sub_page", "recommend_panel").a("rank", getBindingAdapterPosition() + 1).f();
                View view2 = this.itemView;
                h.f.b.l.b(view2, str4);
                SmartRouter.buildRoute(view2.getContext(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
            } else if (id == R.id.am2) {
                b c2 = c();
                h.f.b.l.d(hVar, str4);
                c2.f142108a.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new b.RunnableC3790b(c2)).start();
                h.p[] pVarArr = new h.p[3];
                User user3 = c2.f142111d;
                if (user3 != null) {
                    str2 = user3.getUid();
                } else {
                    str2 = null;
                }
                pVarArr[0] = v.a(str2, "to_user_id");
                User user4 = c2.f142111d;
                if (user4 != null) {
                    num = Integer.valueOf(user4.getFollowStatus());
                } else {
                    num = null;
                }
                pVarArr[1] = v.a(num, "follow_status");
                com.ss.android.ugc.aweme.upvote.event.b bVar2 = c2.f142112e;
                if (bVar2 != null) {
                    str3 = bVar2.f142221a;
                }
                h.p a2 = v.a(str3, "enter_from");
                int i5 = 2;
                pVarArr[2] = a2;
                com.ss.android.ugc.aweme.common.r.a("like_recommendation", pVarArr);
                Context context = c2.f142108a.getContext();
                h.f.b.l.b(context, str4);
                if (!fe.a(context)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(c2.f142108a.getContext()).a(R.string.de8).a();
                    return;
                }
                UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = c2.f142114g;
                boolean z = !c2.f142109b;
                b.d dVar4 = new b.d(c2);
                h.f.b.l.d(hVar, str4);
                h.f.b.l.d(dVar4, str4);
                String commentId = hVar.getCommentId();
                if (!upvoteDetailPanelViewModel.i().contains(commentId)) {
                    upvoteDetailPanelViewModel.i().add(commentId);
                    if (z) {
                        i5 = 1;
                    }
                    f.a.b.b a3 = UpvoteApi.f142023a.digg(commentId, hVar.getItemId(), i5).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new UpvoteDetailPanelViewModel.b(upvoteDetailPanelViewModel, commentId, hVar, z), new UpvoteDetailPanelViewModel.c(upvoteDetailPanelViewModel, commentId, dVar4));
                    h.f.b.l.b(a3, str4);
                    f.a.j.a.a(a3, upvoteDetailPanelViewModel.g());
                    boolean z2 = !c2.f142109b;
                    int i6 = c2.f142110c;
                    if (c2.f142109b) {
                        i4 = -1;
                    }
                    c2.a(z2, i6 + i4);
                }
            } else {
                View view3 = this.itemView;
                h.f.b.l.b(view3, str4);
                Context context2 = view3.getContext();
                if (context2 instanceof androidx.appcompat.app.d) {
                    eVar = context2;
                }
                androidx.fragment.app.e eVar2 = eVar;
                if (eVar2 != null && (supportFragmentManager = eVar2.getSupportFragmentManager()) != null) {
                    ArrayList arrayList = new ArrayList();
                    if (in.g(hVar.getUser())) {
                        a(true);
                        a.C1109a b2 = new a.e().b(1);
                        String b3 = com.ss.android.ugc.aweme.base.utils.h.b(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8m), Integer.valueOf((int) R.string.fd1))).intValue());
                        h.f.b.l.b(b3, str4);
                        arrayList.add(b2.a(b3).a(new s(this, hVar)));
                    } else {
                        a(false);
                        a b4 = b();
                        h.f.b.l.d(arrayList, str4);
                        h.f.b.l.d(hVar, str4);
                        String text = hVar.getText();
                        if (!(text == null || text.length() == 0)) {
                            boolean a4 = b4.f142106c.a(hVar.getCommentId());
                            User user5 = hVar.getUser();
                            if (!(user5 == null || (uid = user5.getUid()) == null)) {
                                str4 = uid;
                            }
                            a.e eVar3 = new a.e();
                            if (a4) {
                                i2 = R.string.fjy;
                            } else {
                                i2 = R.string.gkc;
                            }
                            arrayList.add(eVar3.a(i2).a(new a.C3789a(b4, a4, hVar, str4)));
                            arrayList.add(new a.e().a(R.string.fcr).a(new a.b(b4, hVar, str4)));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        new a.b().b(arrayList).b().show(supportFragmentManager, "upvote_detail_panel_cell");
                    }
                }
            }
        }
    }
}
