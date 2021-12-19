package com.ss.android.ugc.aweme.music.search.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.b.w;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel;
import com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public class a extends w<a> implements com.bytedance.assem.arch.b.i<com.ss.android.ugc.aweme.music.assem.list.cell.d> {
    static final /* synthetic */ h.k.i[] r = {new y(a.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicCellViewModel;", 0), new y(a.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/search/SearchMusicListViewModel;", 0), new y(a.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/assem/video/MusicPlayViewModel;", 0)};
    private final h.h.d s;
    private final h.h.d t;
    private final h.h.d u;
    private com.ss.android.ugc.aweme.music.assem.video.f v;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.list.cell.assem.k, com.ss.android.ugc.aweme.music.assem.list.cell.assem.k> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71754);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.list.cell.assem.k invoke(com.ss.android.ugc.aweme.music.assem.list.cell.assem.k kVar) {
            h.f.b.l.c(kVar, "");
            return kVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.list.s, com.ss.android.ugc.aweme.music.assem.list.s> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71756);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.list.s invoke(com.ss.android.ugc.aweme.music.assem.list.s sVar) {
            h.f.b.l.c(sVar, "");
            return sVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.video.e, com.ss.android.ugc.aweme.music.assem.video.e> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(71758);
        }

        public f() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.video.e invoke(com.ss.android.ugc.aweme.music.assem.video.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(71752);
    }

    /* access modifiers changed from: protected */
    public final MusicCellViewModel D() {
        return (MusicCellViewModel) this.s.a(this, r[0]);
    }

    /* access modifiers changed from: package-private */
    public final SearchMusicListViewModel E() {
        return (SearchMusicListViewModel) this.t.a(this, r[1]);
    }

    public final MusicPlayViewModel F() {
        return (MusicPlayViewModel) this.u.a(this, r[2]);
    }

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$a  reason: collision with other inner class name */
    public static final class C2858a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2858a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        MusicPlayViewModel F;
        a(F, c.f111676a, d.f111677a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, l.f111667a);
        f.a.a(this, D(), e.f111678a, (com.bytedance.assem.arch.viewModel.k) null, m.f111668a, 6);
        f.a.a(this, D(), f.f111679a, (com.bytedance.assem.arch.viewModel.k) null, n.f111669a, 6);
    }

    public final void G() {
        boolean z = true;
        if (MusicService.m().a(((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a, s().getContext(), true)) {
            MusicCellViewModel D = D();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a;
            String g2 = F().g();
            int b2 = com.bytedance.assem.arch.b.l.b(this);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111240b != com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = false;
            }
            D.a(musicModel, g2, b2, z);
            ((CheckableImageView) s().findViewById(R.id.bz3)).b();
        }
    }

    public a() {
        i iVar = i.f111665a;
        j jVar = j.f111666a;
        h.k.c a2 = ab.a(MusicCellViewModel.class);
        this.s = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new C2858a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, iVar, jVar, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        com.bytedance.assem.arch.viewModel.i iVar2 = i.d.f25721a;
        k kVar = new k(this);
        h.k.c a3 = ab.a(SearchMusicListViewModel.class);
        this.t = com.bytedance.ext_power_list.k.a(this, a3, iVar2 == null ? i.c.f25720a : iVar2, new c(a3), k.b.f28699a, kVar, d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        com.bytedance.assem.arch.viewModel.i iVar3 = i.d.f25721a;
        s sVar = new s(this);
        h.k.c a4 = ab.a(MusicPlayViewModel.class);
        this.u = com.bytedance.ext_power_list.k.a(this, a4, iVar3 == null ? i.c.f25720a : iVar3, new e(a4), k.b.f28699a, sVar, f.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    public static final class r implements CheckableImageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111674a;

        static {
            Covode.recordClassIndex(71770);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
        public final void bR_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(a aVar) {
            this.f111674a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
        public final void a(int i2) {
            if (i2 == 1) {
                this.f111674a.D().h();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        h.f.b.l.d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        h.f.b.l.d(dVar, "");
        return true;
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f111660b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f111661c;

        static {
            Covode.recordClassIndex(71759);
        }

        g(a aVar, String str, MusicModel musicModel) {
            this.f111659a = aVar;
            this.f111660b = str;
            this.f111661c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111659a.G();
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111672a;

        static {
            Covode.recordClassIndex(71768);
        }

        p(a aVar) {
            this.f111672a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel F = this.f111672a.F();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111672a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111672a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111672a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            F.d(musicModel, b2, z);
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111673a;

        static {
            Covode.recordClassIndex(71769);
        }

        q(a aVar) {
            this.f111673a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel F = this.f111673a.F();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111673a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111673a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111673a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            F.b(musicModel, b2, z);
        }
    }

    private final void a(com.ss.android.ugc.aweme.music.assem.list.cell.f fVar) {
        int i2;
        ((TuxIconView) s().findViewById(R.id.bz8)).setTuxIcon(com.bytedance.tux.c.c.a(new t(fVar)));
        TuxTextView tuxTextView = (TuxTextView) s().findViewById(R.id.f4g);
        h.f.b.l.b(tuxTextView, "");
        if (fVar == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f111671b;

        static {
            Covode.recordClassIndex(71767);
        }

        o(a aVar, View view) {
            this.f111670a = aVar;
            this.f111671b = view;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            ((TuxIconView) this.f111671b.findViewById(R.id.c1h)).clearAnimation();
            ((TuxIconView) this.f111671b.findViewById(R.id.c1h)).setIconRes(R.raw.icon_color_play);
            MusicPlayViewModel F = this.f111670a.F();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111670a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111670a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111670a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            F.c(musicModel, b2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.f $pinStatus;

        static {
            Covode.recordClassIndex(71772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(com.ss.android.ugc.aweme.music.assem.list.cell.f fVar) {
            super(1);
            this.$pinStatus = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            int i3;
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            if (this.$pinStatus == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                i2 = R.raw.icon_pin_fill;
            } else {
                i2 = R.raw.icon_pin;
            }
            aVar2.f44749a = i2;
            if (this.$pinStatus == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED || this.$pinStatus == com.ss.android.ugc.aweme.music.assem.list.cell.f.ENABLE_PINNED) {
                i3 = R.attr.bc;
            } else {
                i3 = R.attr.bd;
            }
            aVar2.f44753e = Integer.valueOf(i3);
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.music.assem.video.f fVar) {
        MethodCollector.i(6734);
        if (this.v == fVar) {
            MethodCollector.o(6734);
            return;
        }
        this.v = fVar;
        View s2 = s();
        int i2 = b.f111675a[fVar.ordinal()];
        if (i2 == 1) {
            TuxIconView tuxIconView = (TuxIconView) s2.findViewById(R.id.c1h);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) s2.findViewById(R.id.c1h)).setImageResource(2131233399);
            ((TuxIconView) s2.findViewById(R.id.c1h)).clearAnimation();
            ProgressBar progressBar = (ProgressBar) s2.findViewById(R.id.d2s);
            h.f.b.l.b(progressBar, "");
            progressBar.setVisibility(8);
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a.getMusicId()));
            MethodCollector.o(6734);
        } else if (i2 != 2) {
            if (i2 == 3) {
                RelativeLayout relativeLayout = (RelativeLayout) s2.findViewById(R.id.don);
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                ProgressBar progressBar2 = (ProgressBar) s2.findViewById(R.id.d2s);
                h.f.b.l.b(progressBar2, "");
                progressBar2.setVisibility(8);
                TuxIconView tuxIconView2 = (TuxIconView) s2.findViewById(R.id.c1h);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                ((TuxIconView) s2.findViewById(R.id.c1h)).setIconRes(R.raw.icon_color_play);
                ((TuxIconView) s2.findViewById(R.id.c1h)).clearAnimation();
            }
            MethodCollector.o(6734);
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(s().getContext(), R.anim.da);
            h.f.b.l.b(loadAnimation, "");
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) s().findViewById(R.id.c1h)).setImageResource(2131232647);
            ((TuxIconView) s().findViewById(R.id.c1h)).startAnimation(loadAnimation);
            MethodCollector.o(6734);
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        ((RelativeLayout) view.findViewById(R.id.don)).setOnClickListener(new o(this, view));
        ((LinearLayout) view.findViewById(R.id.cgx)).setOnClickListener(new p(this));
        ((TuxIconView) view.findViewById(R.id.cpw)).setOnClickListener(new q(this));
        ((CheckableImageView) view.findViewById(R.id.bz3)).setOnStateChangeListener(new r(this));
        CheckableImageView checkableImageView = (CheckableImageView) view.findViewById(R.id.bz3);
        h.f.b.l.b(checkableImageView, "");
        checkableImageView.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bz8);
        h.f.b.l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
        int i2 = -a2;
        com.bytedance.common.utility.n.a(view.findViewById(R.id.bz8), i2, i2, a2, a2);
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view.findViewById(R.id.rl);
        h.f.b.l.b(aVar, "");
        aVar.setReferencedIds(new int[]{R.id.bz3, R.id.bz8});
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f111663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f111664c;

        static {
            Covode.recordClassIndex(71760);
        }

        h(a aVar, String str, MusicModel musicModel) {
            this.f111662a = aVar;
            this.f111663b = str;
            this.f111664c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f111662a;
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(aVar)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                SearchMusicListViewModel E = aVar.E();
                com.ss.android.ugc.aweme.music.assem.list.cell.d dVar = (com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(aVar);
                h.f.b.l.d(dVar, "");
                if (!E.f111639m && !E.n) {
                    E.n = true;
                    com.ss.android.ugc.aweme.music.search.r a2 = E.o.a();
                    String j2 = E.j();
                    if (j2 == null) {
                        j2 = "";
                    }
                    String musicId = dVar.f111239a.getMusicId();
                    h.f.b.l.b(musicId, "");
                    f.a.b.b a3 = a2.b(j2, musicId).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new SearchMusicListViewModel.l(E, dVar), new SearchMusicListViewModel.m(E));
                    h.f.b.l.b(a3, "");
                    E.a(a3);
                    return;
                }
                return;
            }
            SearchMusicListViewModel E2 = aVar.E();
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = (com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(aVar);
            int b2 = com.bytedance.assem.arch.b.l.b(aVar);
            h.f.b.l.d(dVar2, "");
            if (!E2.f111639m && !E2.n) {
                PinnedMusicList k2 = E2.k();
                if (k2 == null || k2.getAvalibleCapicity() != 0) {
                    com.ss.android.ugc.aweme.common.r.a("search_result_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("button_type", "pin_to_top").a("search_result_id", dVar2.f111239a.getMusicId()).a("rank", b2).f66730a);
                    E2.n = true;
                    com.ss.android.ugc.aweme.music.search.r a4 = E2.o.a();
                    String j3 = E2.j();
                    if (j3 == null) {
                        j3 = "";
                    }
                    String musicId2 = dVar2.f111239a.getMusicId();
                    h.f.b.l.b(musicId2, "");
                    f.a.b.b a5 = a4.a(j3, musicId2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new SearchMusicListViewModel.f(E2, dVar2), new SearchMusicListViewModel.g(E2));
                    h.f.b.l.b(a5, "");
                    E2.a(a5);
                    return;
                }
                E2.a((h.f.a.b) new SearchMusicListViewModel.e(E2));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        String str;
        com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
        h.f.b.l.d(dVar2, "");
        s().setBackground(androidx.core.content.b.a(s().getContext(), (int) R.drawable.qc));
        MusicModel musicModel = dVar2.f111239a;
        if (!TextUtils.isEmpty(musicModel.getName())) {
            str = musicModel.getName();
        } else {
            str = "";
        }
        View s2 = s();
        TuxTextView tuxTextView = (TuxTextView) s2.findViewById(R.id.f3c);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
        int i2 = 0;
        ((TuxTextView) s2.findViewById(R.id.f3c)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        ((CheckableImageView) s2.findViewById(R.id.bz3)).setOnClickListener(new g(this, str, musicModel));
        TuxTextView tuxTextView2 = (TuxTextView) s2.findViewById(R.id.f_a);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(s2.getContext().getString(R.string.dno, Integer.valueOf(musicModel.getUserCount())));
        if (com.bytedance.ies.abmock.b.a().a(true, "remove_15s_cap_music", true)) {
            TuxTextView tuxTextView3 = (TuxTextView) s2.findViewById(R.id.eyv);
            h.f.b.l.b(tuxTextView3, "");
            tuxTextView3.setText(MusicService.m().a(musicModel.getPresenterDuration()));
            TuxTextView tuxTextView4 = (TuxTextView) s2.findViewById(R.id.eyv);
            h.f.b.l.b(tuxTextView4, "");
            if (musicModel.getPresenterDuration() <= 0) {
                i2 = 4;
            }
            tuxTextView4.setVisibility(i2);
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) s2.findViewById(R.id.eyv);
            h.f.b.l.b(tuxTextView5, "");
            tuxTextView5.setText(MusicService.m().a(musicModel.getDuration()));
            TuxTextView tuxTextView6 = (TuxTextView) s2.findViewById(R.id.eyv);
            h.f.b.l.b(tuxTextView6, "");
            if (musicModel.getDuration() <= 0) {
                i2 = 4;
            }
            tuxTextView6.setVisibility(i2);
        }
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) s2.findViewById(R.id.dtl), musicModel.getPicPremium(), -1, -1);
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) s2.findViewById(R.id.dtl), musicModel.getPicBig(), -1, -1);
        } else {
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) s2.findViewById(R.id.dtl), 2131233359);
        }
        ((TuxIconView) s2.findViewById(R.id.bz8)).setOnClickListener(new h(this, str, musicModel));
        a(dVar2.f111240b);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.music.assem.list.cell.assem.k, com.ss.android.ugc.aweme.music.assem.list.cell.d, com.ss.android.ugc.aweme.music.assem.list.cell.assem.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f111665a = new i();

        static {
            Covode.recordClassIndex(71761);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.assem.k invoke(com.ss.android.ugc.aweme.music.assem.list.cell.assem.k kVar, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            boolean z;
            com.ss.android.ugc.aweme.music.assem.list.cell.assem.k kVar2 = kVar;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
            h.f.b.l.d(kVar2, "");
            h.f.b.l.d(dVar2, "");
            if (dVar2.f111239a.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                z = true;
            } else {
                z = false;
            }
            return com.ss.android.ugc.aweme.music.assem.list.cell.assem.k.a(kVar2, z, null, 2);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.music.assem.list.cell.d, com.ss.android.ugc.aweme.music.assem.list.cell.assem.k, com.ss.android.ugc.aweme.music.assem.list.cell.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f111666a = new j();

        static {
            Covode.recordClassIndex(71762);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d invoke(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar, com.ss.android.ugc.aweme.music.assem.list.cell.assem.k kVar) {
            MusicModel.CollectionType collectionType;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
            com.ss.android.ugc.aweme.music.assem.list.cell.assem.k kVar2 = kVar;
            h.f.b.l.d(dVar2, "");
            h.f.b.l.d(kVar2, "");
            MusicModel musicModel = dVar2.f111239a;
            if (kVar2.f111236a) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            return dVar2;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f111668a = new m();

        static {
            Covode.recordClassIndex(71765);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Boolean bool) {
            int i2;
            a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(aVar2, "");
            CheckableImageView checkableImageView = (CheckableImageView) aVar2.s().findViewById(R.id.bz3);
            if (booleanValue) {
                i2 = 2131233357;
            } else {
                i2 = 2131233412;
            }
            checkableImageView.setImageResource(i2);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f111669a = new n();

        static {
            Covode.recordClassIndex(71766);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar2) {
            T t;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends String> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f25631b) == null)) {
                new com.bytedance.tux.g.b(aVar3.s()).a(t).b();
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar, List list) {
        Object obj;
        com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
        h.f.b.l.d(dVar2, "");
        if (list != null && !list.isEmpty()) {
            if (list != null) {
                obj = list.get(0);
            } else {
                obj = null;
            }
            if ((obj instanceof com.ss.android.ugc.aweme.music.assem.list.cell.e) && ((com.ss.android.ugc.aweme.music.assem.list.cell.e) obj).f111241a) {
                a(dVar2.f111240b);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.q<a, MusicModel, com.ss.android.ugc.aweme.music.assem.video.f, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f111667a = new l();

        static {
            Covode.recordClassIndex(71764);
        }

        l() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(a aVar, MusicModel musicModel, com.ss.android.ugc.aweme.music.assem.video.f fVar) {
            String str;
            a aVar2 = aVar;
            MusicModel musicModel2 = musicModel;
            com.ss.android.ugc.aweme.music.assem.video.f fVar2 = fVar;
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(fVar2, "");
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str, (Object) ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(aVar2)).f111239a.getMusicId())) {
                aVar2.a(fVar2);
            } else {
                aVar2.a(com.ss.android.ugc.aweme.music.assem.video.f.Default);
            }
            return z.f158842a;
        }
    }
}
