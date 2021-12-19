package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import android.content.Context;
import android.text.TextUtils;
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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public class f extends w<f> implements com.bytedance.assem.arch.b.i<com.ss.android.ugc.aweme.music.assem.list.cell.d> {
    static final /* synthetic */ h.k.i[] r = {new y(f.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicCellViewModel;", 0), new y(f.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/assem/video/MusicPlayViewModel;", 0)};
    private final h.h.d s;
    private final h.h.d t;
    private com.ss.android.ugc.aweme.music.assem.video.f u;

    public static final class b extends h.f.b.m implements h.f.a.b<k, k> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71438);
        }

        public b() {
            super(1);
        }

        public final k invoke(k kVar) {
            h.f.b.l.c(kVar, "");
            return kVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.video.e, com.ss.android.ugc.aweme.music.assem.video.e> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71440);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.video.e invoke(com.ss.android.ugc.aweme.music.assem.video.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(71436);
    }

    /* access modifiers changed from: protected */
    public final MusicCellViewModel D() {
        return (MusicCellViewModel) this.s.a(this, r[0]);
    }

    public final MusicPlayViewModel E() {
        return (MusicPlayViewModel) this.t.a(this, r[1]);
    }

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71437);
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

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71439);
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

    static final class n extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(71450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar) {
            super(0);
            this.this$0 = fVar;
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
        MusicPlayViewModel E;
        a(E, h.f111233a, i.f111234a, com.bytedance.assem.arch.viewModel.l.a(E().f25686c), null, h.f111225a);
        f.a.a(this, D(), j.f111235a, (com.bytedance.assem.arch.viewModel.k) null, i.f111226a, 6);
    }

    private final void G() {
        int i2;
        TuxTextView tuxTextView = (TuxTextView) s().findViewById(R.id.f4g);
        h.f.b.l.b(tuxTextView, "");
        if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
    }

    public f() {
        C2848f fVar = C2848f.f111223a;
        g gVar = g.f111224a;
        h.k.c a2 = ab.a(MusicCellViewModel.class);
        this.s = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, fVar, gVar, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        com.bytedance.assem.arch.viewModel.i iVar = i.d.f25721a;
        n nVar = new n(this);
        h.k.c a3 = ab.a(MusicPlayViewModel.class);
        this.t = com.bytedance.ext_power_list.k.a(this, a3, iVar == null ? i.c.f25720a : iVar, new c(a3), k.b.f28699a, nVar, d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    public final void F() {
        boolean z = true;
        if (MusicService.m().a(((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a, s().getContext(), true)) {
            MusicCellViewModel D = D();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a;
            String g2 = E().g();
            int b2 = com.bytedance.assem.arch.b.l.b(this);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111240b != com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = false;
            }
            D.a(musicModel, g2, b2, z);
            ((CheckableImageView) s().findViewById(R.id.bz3)).b();
        }
    }

    public static final class m implements CheckableImageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111231a;

        static {
            Covode.recordClassIndex(71449);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
        public final void bR_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(f fVar) {
            this.f111231a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
        public final void a(int i2) {
            if (i2 == 1) {
                this.f111231a.D().h();
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

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f111221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f111222c;

        static {
            Covode.recordClassIndex(71441);
        }

        e(f fVar, String str, MusicModel musicModel) {
            this.f111220a = fVar;
            this.f111221b = str;
            this.f111222c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111220a.F();
        }
    }

    public final void a(boolean z) {
        int i2;
        CheckableImageView checkableImageView = (CheckableImageView) s().findViewById(R.id.bz3);
        if (z) {
            i2 = 2131233357;
        } else {
            i2 = 2131233412;
        }
        checkableImageView.setImageResource(i2);
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111229a;

        static {
            Covode.recordClassIndex(71447);
        }

        k(f fVar) {
            this.f111229a = fVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f111229a.E();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111229a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111229a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111229a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.d(musicModel, b2, z);
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111230a;

        static {
            Covode.recordClassIndex(71448);
        }

        l(f fVar) {
            this.f111230a = fVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f111230a.E();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111230a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111230a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111230a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.b(musicModel, b2, z);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f111228b;

        static {
            Covode.recordClassIndex(71446);
        }

        j(f fVar, View view) {
            this.f111227a = fVar;
            this.f111228b = view;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            ((TuxIconView) this.f111228b.findViewById(R.id.c1h)).clearAnimation();
            ((TuxIconView) this.f111228b.findViewById(R.id.c1h)).setIconRes(R.raw.icon_color_play);
            MusicPlayViewModel E = this.f111227a.E();
            MusicModel musicModel = ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111227a)).f111239a;
            int b2 = com.bytedance.assem.arch.b.l.b(this.f111227a);
            if (((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this.f111227a)).f111240b == com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.c(musicModel, b2, z);
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        ((RelativeLayout) view.findViewById(R.id.don)).setOnClickListener(new j(this, view));
        ((LinearLayout) view.findViewById(R.id.cgx)).setOnClickListener(new k(this));
        ((TuxIconView) view.findViewById(R.id.cpw)).setOnClickListener(new l(this));
        ((CheckableImageView) view.findViewById(R.id.bz3)).setOnStateChangeListener(new m(this));
        CheckableImageView checkableImageView = (CheckableImageView) view.findViewById(R.id.bz3);
        h.f.b.l.b(checkableImageView, "");
        checkableImageView.setVisibility(0);
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view.findViewById(R.id.rl);
        h.f.b.l.b(aVar, "");
        aVar.setReferencedIds(new int[]{R.id.bz3, R.id.bz8});
    }

    public final void a(com.ss.android.ugc.aweme.music.assem.video.f fVar) {
        MethodCollector.i(9103);
        if (this.u == fVar) {
            MethodCollector.o(9103);
            return;
        }
        this.u = fVar;
        View s2 = s();
        int i2 = g.f111232a[fVar.ordinal()];
        if (i2 == 1) {
            RelativeLayout relativeLayout = (RelativeLayout) s2.findViewById(R.id.don);
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) s2.findViewById(R.id.c1h);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) s2.findViewById(R.id.c1h)).setImageResource(2131233399);
            ((TuxIconView) s2.findViewById(R.id.c1h)).clearAnimation();
            ProgressBar progressBar = (ProgressBar) s2.findViewById(R.id.d2s);
            h.f.b.l.b(progressBar, "");
            progressBar.setVisibility(8);
            r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(this)).f111239a.getMusicId()));
            MethodCollector.o(9103);
        } else if (i2 != 2) {
            if (i2 == 3) {
                RelativeLayout relativeLayout2 = (RelativeLayout) s2.findViewById(R.id.don);
                h.f.b.l.b(relativeLayout2, "");
                relativeLayout2.setVisibility(8);
                ProgressBar progressBar2 = (ProgressBar) s2.findViewById(R.id.d2s);
                h.f.b.l.b(progressBar2, "");
                progressBar2.setVisibility(8);
                TuxIconView tuxIconView2 = (TuxIconView) s2.findViewById(R.id.c1h);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                ((TuxIconView) s2.findViewById(R.id.c1h)).setIconRes(R.raw.icon_color_play);
                ((TuxIconView) s2.findViewById(R.id.c1h)).clearAnimation();
            }
            MethodCollector.o(9103);
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(s().getContext(), R.anim.da);
            h.f.b.l.b(loadAnimation, "");
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) s().findViewById(R.id.c1h)).setImageResource(2131232647);
            ((TuxIconView) s().findViewById(R.id.c1h)).startAnimation(loadAnimation);
            MethodCollector.o(9103);
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
        ((CheckableImageView) s2.findViewById(R.id.bz3)).setOnClickListener(new e(this, str, musicModel));
        TuxTextView tuxTextView2 = (TuxTextView) s2.findViewById(R.id.f_a);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(s2.getContext().getString(R.string.dno, com.ss.android.ugc.aweme.i18n.b.a((long) musicModel.getUserCount())));
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
        G();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$f  reason: collision with other inner class name */
    static final class C2848f extends h.f.b.m implements h.f.a.m<k, com.ss.android.ugc.aweme.music.assem.list.cell.d, k> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2848f f111223a = new C2848f();

        static {
            Covode.recordClassIndex(71442);
        }

        C2848f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ k invoke(k kVar, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            boolean z;
            k kVar2 = kVar;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
            h.f.b.l.d(kVar2, "");
            h.f.b.l.d(dVar2, "");
            if (dVar2.f111239a.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                z = true;
            } else {
                z = false;
            }
            return k.a(kVar2, z, null, 2);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.music.assem.list.cell.d, k, com.ss.android.ugc.aweme.music.assem.list.cell.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f111224a = new g();

        static {
            Covode.recordClassIndex(71443);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d invoke(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar, k kVar) {
            MusicModel.CollectionType collectionType;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
            k kVar2 = kVar;
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

    static final class i extends h.f.b.m implements h.f.a.m<f, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f111226a = new i();

        static {
            Covode.recordClassIndex(71445);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(f fVar, Boolean bool) {
            f fVar2 = fVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(fVar2, "");
            fVar2.a(booleanValue);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar, List list) {
        Object obj;
        com.ss.android.ugc.aweme.music.assem.list.cell.d dVar2 = dVar;
        h.f.b.l.d(dVar2, "");
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            if (list != null) {
                obj = list.get(0);
            } else {
                obj = null;
            }
            if (obj instanceof com.ss.android.ugc.aweme.music.assem.list.cell.e) {
                com.ss.android.ugc.aweme.music.assem.list.cell.e eVar = (com.ss.android.ugc.aweme.music.assem.list.cell.e) obj;
                if (eVar.f111241a) {
                    G();
                }
                if (eVar.f111242b) {
                    if (dVar2.f111239a.getCollectionType() != MusicModel.CollectionType.COLLECTED) {
                        z = false;
                    }
                    a(z);
                }
            }
        }
    }

    static final class h extends h.f.b.m implements q<f, MusicModel, com.ss.android.ugc.aweme.music.assem.video.f, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f111225a = new h();

        static {
            Covode.recordClassIndex(71444);
        }

        h() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(f fVar, MusicModel musicModel, com.ss.android.ugc.aweme.music.assem.video.f fVar2) {
            String str;
            f fVar3 = fVar;
            MusicModel musicModel2 = musicModel;
            com.ss.android.ugc.aweme.music.assem.video.f fVar4 = fVar2;
            h.f.b.l.d(fVar3, "");
            h.f.b.l.d(fVar4, "");
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str, (Object) ((com.ss.android.ugc.aweme.music.assem.list.cell.d) com.bytedance.assem.arch.b.l.a(fVar3)).f111239a.getMusicId())) {
                fVar3.a(fVar4);
            } else {
                fVar3.a(com.ss.android.ugc.aweme.music.assem.video.f.Default);
            }
            return z.f158842a;
        }
    }
}
