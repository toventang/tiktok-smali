package com.ss.android.ugc.aweme.profile.assem.powercell;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.gr;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.ab;
import h.w;
import java.util.List;
import java.util.Objects;

public final class MyVideoCell extends PowerCell<a> {

    /* renamed from: a  reason: collision with root package name */
    public final String f116032a;

    /* renamed from: b  reason: collision with root package name */
    public final String f116033b;

    /* renamed from: j  reason: collision with root package name */
    public TuxRadio f116034j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f116035k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.profile.i f116036l;

    /* renamed from: m  reason: collision with root package name */
    private TuxIconView f116037m;
    private TuxTextView n;
    private TuxTextView o;
    private TuxIconView p;
    private ViewGroup q;
    private View r;
    private View s;
    private TextView t;
    private View u;
    private Drawable v;
    private SmartImageView w;
    private final h.h x;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.profile.assem.VM.a, com.ss.android.ugc.aweme.profile.assem.VM.a> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(74845);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.assem.VM.a invoke(com.ss.android.ugc.aweme.profile.assem.VM.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(74838);
    }

    private final Context b() {
        return (Context) this.x.getValue();
    }

    public final MyVideoListVM a() {
        return (MyVideoListVM) this.f116035k.getValue();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(74840);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(74841);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(74846);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(74849);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(74850);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.profile.assem.VM.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Context> {
        final /* synthetic */ MyVideoCell this$0;

        static {
            Covode.recordClassIndex(74853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(MyVideoCell myVideoCell) {
            super(0);
            this.this$0 = myVideoCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Context invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            return view.getContext();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(74839);
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
            Covode.recordClassIndex(74842);
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
            Covode.recordClassIndex(74843);
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
            Covode.recordClassIndex(74844);
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        SmartImageView smartImageView = this.w;
        if (smartImageView == null) {
            h.f.b.l.a("mCoverView");
        }
        smartImageView.setOnClickListener(new p(this));
        TuxRadio tuxRadio = this.f116034j;
        if (tuxRadio == null) {
            h.f.b.l.a("mCheckBox");
        }
        tuxRadio.setOnClickListener(new q(this));
        a().f116020m.observe(this, new r(this));
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(74847);
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
            Covode.recordClassIndex(74848);
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
            Covode.recordClassIndex(74851);
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
            Covode.recordClassIndex(74852);
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

    public MyVideoCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(MyVideoListVM.class);
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
        this.f116035k = bVar;
        this.f116032a = "MyVideoCell";
        this.f116033b = "Preview my video";
        this.f116036l = new com.ss.android.ugc.aweme.profile.i();
        this.x = h.i.a((h.f.a.a) new o(this));
    }

    static final class r<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyVideoCell f116040a;

        static {
            Covode.recordClassIndex(74856);
        }

        r(MyVideoCell myVideoCell) {
            this.f116040a = myVideoCell;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<a> value = this.f116040a.a().f116020m.getValue();
            if (value == null) {
                value = z.INSTANCE;
            }
            TuxRadio tuxRadio = this.f116040a.f116034j;
            if (tuxRadio == null) {
                h.f.b.l.a("mCheckBox");
            }
            tuxRadio.setChecked(h.a.n.a((Iterable) value, (Object) this.f116040a.f34234d));
        }
    }

    private final void a(Aweme aweme) {
        Video video = aweme.getVideo();
        h.f.b.l.b(video, "");
        if (video.getCover() != null) {
            UrlModel cover = video.getCover();
            h.f.b.l.b(cover, "");
            if (cover.getUrlList() != null) {
                UrlModel cover2 = video.getCover();
                h.f.b.l.b(cover2, "");
                if (cover2.getUrlList().size() != 0) {
                    UrlModel cover3 = video.getCover();
                    h.f.b.l.b(cover3, "");
                    if (!TextUtils.isEmpty(cover3.getUrlList().get(0))) {
                        UrlModel animatedCover = video.getAnimatedCover();
                        if (animatedCover == null) {
                            animatedCover = video.getCover();
                        }
                        a(animatedCover, this.f116032a, aweme);
                        return;
                    }
                }
            }
        }
        SmartImageView smartImageView = this.w;
        if (smartImageView == null) {
            h.f.b.l.a("mCoverView");
        }
        smartImageView.setImageResource(R.color.f159926j);
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyVideoCell f116038a;

        static {
            Covode.recordClassIndex(74854);
        }

        p(MyVideoCell myVideoCell) {
            this.f116038a = myVideoCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f116038a.f34234d != null) {
                MyVideoListVM a2 = this.f116038a.a();
                T t = this.f116038a.f34234d;
                if (t == null) {
                    h.f.b.l.b();
                }
                Aweme aweme = ((a) t).f116041a;
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && aweme != null) {
                    Fragment fragment = a2.n;
                    androidx.fragment.app.e eVar = null;
                    if (fragment != null && fragment.getActivity() != null) {
                        Fragment fragment2 = a2.n;
                        if (fragment2 != null) {
                            fragment2.getActivity();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                            com.ss.android.ugc.aweme.lancet.j.f107229h = MyVideoListVM.j();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                            Fragment fragment3 = a2.n;
                            if (fragment3 != null) {
                                eVar = fragment3.getActivity();
                            }
                            new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.de8).a();
                            return;
                        }
                        if (a2.n != null && (a2.n instanceof com.ss.android.ugc.aweme.profile.ui.widget.o)) {
                            Fragment fragment4 = a2.n;
                            Objects.requireNonNull(fragment4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.widget.SelectMyVideoFragment");
                            com.ss.android.ugc.aweme.profile.ui.widget.o oVar = (com.ss.android.ugc.aweme.profile.ui.widget.o) fragment4;
                            if (!(oVar == null || aweme.getAuthor() == null)) {
                                com.ss.android.ugc.aweme.profile.ui.widget.a aVar = oVar.f117475d;
                                User author = aweme.getAuthor();
                                h.f.b.l.b(author, "");
                                String uniqueId = author.getUniqueId();
                                if (uniqueId == null) {
                                    User author2 = aweme.getAuthor();
                                    h.f.b.l.b(author2, "");
                                    uniqueId = author2.getShortId();
                                }
                                aVar.f117387a = uniqueId;
                                com.ss.android.ugc.aweme.profile.ui.widget.a aVar2 = oVar.f117475d;
                                User author3 = aweme.getAuthor();
                                h.f.b.l.b(author3, "");
                                aVar2.f117388b = author3.getNickname();
                                oVar.f117475d.f117391e = aweme.getAid();
                                com.ss.android.ugc.aweme.profile.ui.widget.a aVar3 = oVar.f117475d;
                                AwemeStatus status = aweme.getStatus();
                                h.f.b.l.b(status, "");
                                aVar3.f117392f = status.getPrivateStatus();
                                com.ss.android.ugc.aweme.profile.ui.widget.a aVar4 = oVar.f117475d;
                                User author4 = aweme.getAuthor();
                                h.f.b.l.b(author4, "");
                                aVar4.f117393g = author4.isSecret() ? 1 : 0;
                            }
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("id", aweme.getAid());
                        bundle.putString("video_from", "from_publish_add_video");
                        bundle.putInt("video_type", 0);
                        bundle.putString("userid", a2.f116018k);
                        bundle.putString("sec_userid", a2.f116019l);
                        bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                        bundle.putString("enter_method", null);
                        bundle.putString("like_enter_method", null);
                        bundle.putString("content_source", null);
                        bundle.putString("refer", "personal_homepage");
                        bundle.putString("previous_page", null);
                        bundle.putString("from_group_id", null);
                        bundle.putString("extra_previous_page_position", null);
                        bundle.putString("tab_name", "output");
                        bundle.putString("enter_from_request_id", null);
                        bundle.putString("feeds_aweme_id", null);
                        bundle.putInt("from_post_list", 1);
                        SmartRouter.buildFragmentRoute(a2.n, "aweme://aweme/detail/").withParam(bundle).withParam("activity_has_activity_options", true).open(com.ss.android.ugc.aweme.profile.ui.widget.o.f117470e);
                    }
                }
            }
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyVideoCell f116039a;

        static {
            Covode.recordClassIndex(74855);
        }

        q(MyVideoCell myVideoCell) {
            this.f116039a = myVideoCell;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T extends com.bytedance.ies.powerlist.b.a, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (r0 == null) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
            if (r0 == null) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
            if (r0 == null) goto L_0x00e0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell.q.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aod, viewGroup, false);
        View findViewById = a2.findViewById(R.id.fgn);
        h.f.b.l.b(findViewById, "");
        this.f116037m = (TuxIconView) findViewById;
        View findViewById2 = a2.findViewById(R.id.f4l);
        h.f.b.l.b(findViewById2, "");
        this.n = (TuxTextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.dce);
        h.f.b.l.b(findViewById3, "");
        this.o = (TuxTextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.ffk);
        h.f.b.l.b(findViewById4, "");
        this.p = (TuxIconView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.fgh);
        h.f.b.l.b(findViewById5, "");
        this.q = (ViewGroup) findViewById5;
        View findViewById6 = a2.findViewById(R.id.ckm);
        h.f.b.l.b(findViewById6, "");
        this.r = findViewById6;
        View findViewById7 = a2.findViewById(R.id.e9b);
        h.f.b.l.b(findViewById7, "");
        this.s = findViewById7;
        View findViewById8 = a2.findViewById(R.id.e9_);
        h.f.b.l.b(findViewById8, "");
        this.t = (TextView) findViewById8;
        View findViewById9 = a2.findViewById(R.id.fft);
        h.f.b.l.b(findViewById9, "");
        this.u = findViewById9;
        View findViewById10 = a2.findViewById(R.id.agf);
        h.f.b.l.b(findViewById10, "");
        this.w = (SmartImageView) findViewById10;
        View findViewById11 = a2.findViewById(R.id.a5_);
        h.f.b.l.b(findViewById11, "");
        this.f116034j = (TuxRadio) findViewById11;
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b5  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.profile.assem.powercell.a r16) {
        /*
        // Method dump skipped, instructions count: 753
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell.a(com.bytedance.ies.powerlist.b.a):void");
    }

    private static void a(TextView textView, Drawable drawable) {
        if (textView != null) {
            int i2 = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private final void a(UrlModel urlModel, String str, Aweme aweme) {
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        int[] a3 = em.a(200);
        if (a3 != null) {
            a2.b(a3);
        }
        SmartImageView smartImageView = this.w;
        if (smartImageView == null) {
            h.f.b.l.a("mCoverView");
        }
        a2.E = smartImageView;
        a2.a(str).c();
        if (aweme != null && aweme.getVideo() != null && !gr.a()) {
            aweme.getVideo().setCachedOuterCoverUrl(urlModel);
            aweme.getVideo().setCachedOuterCoverSize(a3);
        }
    }
}
