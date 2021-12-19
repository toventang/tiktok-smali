package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.k;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class bf extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f125708l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ba f125709a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b f125710b;

    /* renamed from: c  reason: collision with root package name */
    public bw f125711c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d f125712d = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d();

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f125713e;

    /* renamed from: f  reason: collision with root package name */
    public CutVideoStickerPointMusicViewModel f125714f;

    /* renamed from: g  reason: collision with root package name */
    public CutVideoListViewModel f125715g;

    /* renamed from: h  reason: collision with root package name */
    public CutVideoMultiModeViewModel f125716h;

    /* renamed from: i  reason: collision with root package name */
    public be f125717i;

    /* renamed from: j  reason: collision with root package name */
    public CutVideoTitleBarViewModel f125718j;

    /* renamed from: k  reason: collision with root package name */
    public CutVideoViewModel f125719k;
    private CutVideoMultiBottomViewModel t;

    static {
        Covode.recordClassIndex(82556);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82557);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public static final class b implements be {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bf f125720a;

        static {
            Covode.recordClassIndex(82558);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void b(View view) {
            l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void h() {
            this.f125720a.f125712d.a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void b() {
            bf.a(this.f125720a).a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void c() {
            bf.a(this.f125720a).c();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void d() {
            bf.a(this.f125720a).b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final List<VideoSegment> e() {
            return this.f125720a.a().c();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void f() {
            this.f125720a.a().f125672c.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void a() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f125720a.q()).a(R.string.dd_).a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void g() {
            this.f125720a.a().y = true;
            if (this.f125720a.a().f125672c.a()) {
                this.f125720a.a().x = true;
            }
            this.f125720a.a().f125672c.b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(bf bfVar) {
            this.f125720a = bfVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void a(int i2) {
            bf.a(this.f125720a).a(i2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void a(View view) {
            l.d(view, "");
            r.a("click_clip_entrance", com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().f149193a);
            bf.b(this.f125720a).c(true);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f125720a.f125718j;
            if (cutVideoTitleBarViewModel == null) {
                l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.e(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f125720a.f125716h;
            if (cutVideoMultiModeViewModel == null) {
                l.a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.g();
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f125720a.f125714f;
            if (cutVideoStickerPointMusicViewModel == null) {
                l.a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.c(new CutVideoStickerPointMusicViewModel.a());
            bf.b(this.f125720a).a();
            com.bytedance.scene.j jVar = this.f125720a.o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            com.bytedance.scene.ktx.a.a((com.bytedance.scene.group.b) jVar, "CutVideoListScene");
            com.bytedance.scene.j jVar2 = this.f125720a.o;
            Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            com.bytedance.scene.ktx.a.a((com.bytedance.scene.group.b) jVar2, "CutVideoBottomBarScene");
            com.bytedance.scene.j jVar3 = this.f125720a.o;
            Objects.requireNonNull(jVar3, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            com.bytedance.scene.ktx.a.a((com.bytedance.scene.group.b) jVar3, "CutVideoEditScene");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.be
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            l.d(str, "");
            if (cVar == null) {
                if (this.f125720a.a().x) {
                    this.f125720a.a().f125672c.c();
                    this.f125720a.a().x = false;
                }
                this.f125720a.f125712d.b();
                return;
            }
            if (this.f125720a.f125713e != null) {
                com.ss.android.ugc.aweme.shortvideo.c cVar2 = this.f125720a.f125713e;
                if (cVar2 == null) {
                    l.b();
                }
                if (!TextUtils.isEmpty(cVar2.getMusicId())) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar3 = this.f125720a.f125713e;
                    if (cVar3 == null) {
                        l.b();
                    }
                    if (l.a((Object) cVar3.getMusicId(), (Object) cVar.getMusicId())) {
                        if (this.f125720a.a().x) {
                            this.f125720a.a().f125672c.c();
                            this.f125720a.a().x = false;
                        }
                        this.f125720a.f125712d.b();
                        return;
                    }
                }
            }
            CutVideoViewModel cutVideoViewModel = this.f125720a.f125719k;
            if (cutVideoViewModel == null) {
                l.a("cutVideoViewModel");
            }
            cutVideoViewModel.b().p = str;
            ba a2 = this.f125720a.a();
            l.d(str, "");
            a2.f125678i = str;
            this.f125720a.f125713e = cVar;
            this.f125720a.a().f125673d = cVar;
            this.f125720a.a(false);
        }
    }

    public static final class j implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bf f125723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f125724b;

        static {
            Covode.recordClassIndex(82568);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            this.f125723a.f125712d.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f125723a.f125712d.b();
            if (this.f125724b) {
                this.f125723a.a().f125672c.c();
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125723a.a().f125674e;
                if (gVar != null) {
                    gVar.a();
                }
            }
        }

        j(bf bfVar, boolean z) {
            this.f125723a = bfVar;
            this.f125724b = z;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f125712d.c();
    }

    public final ba a() {
        ba baVar = this.f125709a;
        if (baVar == null) {
            l.a("stickPointController");
        }
        return baVar;
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bf f125721a;

        static {
            Covode.recordClassIndex(82559);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bf bfVar) {
            this.f125721a = bfVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.d
        public final void a(View view) {
            l.d(view, "");
            bf.c(this.f125721a).a(view);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.d
        public final void b(View view) {
            l.d(view, "");
            bw bwVar = this.f125721a.f125711c;
            if (bwVar == null) {
                l.a("musicViewController");
            }
            bwVar.e();
            bf.c(this.f125721a).b(view);
        }
    }

    public static final class i implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa.h f125722a;

        static {
            Covode.recordClassIndex(82567);
        }

        i(aa.h hVar) {
            this.f125722a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.k
        public final void a(int i2) {
            String str;
            MusicModel c2 = this.f125722a.c(i2);
            if (c2 != null) {
                str = c2.getMusicId();
            } else {
                str = null;
            }
            r.a("music_show", com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().a("content_source", "upload").a("content_type", "sound_sync").a("music_id", str).a("tab_name", "recommend").a("order", i2).f149193a);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b a(bf bfVar) {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b bVar = bfVar.f125710b;
        if (bVar == null) {
            l.a("musicView");
        }
        return bVar;
    }

    public static final /* synthetic */ CutVideoListViewModel b(bf bfVar) {
        CutVideoListViewModel cutVideoListViewModel = bfVar.f125715g;
        if (cutVideoListViewModel == null) {
            l.a("videoListViewModel");
        }
        return cutVideoListViewModel;
    }

    public static final /* synthetic */ be c(bf bfVar) {
        be beVar = bfVar.f125717i;
        if (beVar == null) {
            l.a("listener");
        }
        return beVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public final void a(boolean z) {
        this.f125712d.a();
        ba baVar = this.f125709a;
        if (baVar == null) {
            l.a("stickPointController");
        }
        baVar.f125672c.b(this.f125713e, 0, 2, new j(this, z));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CutVideoStickerPointMusicViewModel.class);
        l.b(a2, "");
        this.f125714f = (CutVideoStickerPointMusicViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(CutVideoListViewModel.class);
        l.b(a3, "");
        this.f125715g = (CutVideoListViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = t.a((androidx.fragment.app.e) activity3).a(CutVideoMultiModeViewModel.class);
        l.b(a4, "");
        this.f125716h = (CutVideoMultiModeViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = t.a((androidx.fragment.app.e) activity4).a(CutVideoMultiBottomViewModel.class);
        l.b(a5, "");
        this.t = (CutVideoMultiBottomViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = t.a((androidx.fragment.app.e) activity5).a(CutVideoTitleBarViewModel.class);
        l.b(a6, "");
        this.f125718j = (CutVideoTitleBarViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = t.a((androidx.fragment.app.e) activity6).a(CutVideoViewModel.class);
        l.b(a7, "");
        this.f125719k = (CutVideoViewModel) a7;
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f125714f;
        if (cutVideoStickerPointMusicViewModel == null) {
            l.a("musicViewModel");
        }
        b.a.b(this, cutVideoStickerPointMusicViewModel, bg.f125725a, new e(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f125714f;
        if (cutVideoStickerPointMusicViewModel2 == null) {
            l.a("musicViewModel");
        }
        b.a.b(this, cutVideoStickerPointMusicViewModel2, bh.f125726a, new f(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel3 = this.f125714f;
        if (cutVideoStickerPointMusicViewModel3 == null) {
            l.a("musicViewModel");
        }
        b.a.b(this, cutVideoStickerPointMusicViewModel3, bi.f125727a, new g(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel4 = this.f125714f;
        if (cutVideoStickerPointMusicViewModel4 == null) {
            l.a("musicViewModel");
        }
        b.a.b(this, cutVideoStickerPointMusicViewModel4, bj.f125728a, new h(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel5 = this.f125714f;
        if (cutVideoStickerPointMusicViewModel5 == null) {
            l.a("musicViewModel");
        }
        selectNonNullSubscribe(cutVideoStickerPointMusicViewModel5, bk.f125729a, new ah(), new d(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bf this$0;

        static {
            Covode.recordClassIndex(82561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(bf bfVar) {
            super(2);
            this.this$0 = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            this.this$0.a(booleanValue);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bf this$0;

        static {
            Covode.recordClassIndex(82566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(bf bfVar) {
            super(2);
            this.this$0 = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                this.this$0.f125712d.a();
            } else {
                this.this$0.f125712d.b();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asr, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bf this$0;

        static {
            Covode.recordClassIndex(82560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(bf bfVar) {
            super(2);
            this.this$0 = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            View d2 = bf.a(this.this$0).d();
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            d2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bf this$0;

        static {
            Covode.recordClassIndex(82562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(bf bfVar) {
            super(2);
            this.this$0 = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                bf.a(this.this$0).setButtonClickable(false);
            }
            d.a(bf.a(this.this$0).d(), booleanValue, new h.f.a.b<Boolean, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.bf.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(82563);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Boolean bool) {
                    bf.a(this.this$0.this$0).setButtonClickable(bool.booleanValue());
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bf this$0;

        static {
            Covode.recordClassIndex(82564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(bf bfVar) {
            super(2);
            this.this$0 = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                bf.a(this.this$0).setButtonClickable(false);
            }
            d.b(bf.a(this.this$0).d(), booleanValue, new h.f.a.b<Boolean, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.bf.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(82565);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Boolean bool) {
                    bf.a(this.this$0.this$0).setButtonClickable(bool.booleanValue());
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.crk);
        Objects.requireNonNull(c2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.IStickPointMusicView");
        this.f125710b = (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b) c2;
        Activity t2 = t();
        l.b(t2, "");
        bd bdVar = new bd(t2);
        this.f125711c = bdVar;
        aa.h c3 = bdVar.c();
        if (c3 == null) {
            l.b();
        }
        c3.a(new i(c3));
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b bVar = this.f125710b;
        if (bVar == null) {
            l.a("musicView");
        }
        bVar.setRecyclerViewAdapter(c3);
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b bVar2 = this.f125710b;
        if (bVar2 == null) {
            l.a("musicView");
        }
        bw bwVar = this.f125711c;
        if (bwVar == null) {
            l.a("musicViewController");
        }
        bVar2.setCollectMusicCallback(bwVar.b());
        this.f125717i = new b(this);
        bw bwVar2 = this.f125711c;
        if (bwVar2 == null) {
            l.a("musicViewController");
        }
        be beVar = this.f125717i;
        if (beVar == null) {
            l.a("listener");
        }
        bwVar2.a(beVar);
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b bVar3 = this.f125710b;
        if (bVar3 == null) {
            l.a("musicView");
        }
        bVar3.setStickPointMusicListener(new c(this));
        ba baVar = this.f125709a;
        if (baVar == null) {
            l.a("stickPointController");
        }
        bw bwVar3 = this.f125711c;
        if (bwVar3 == null) {
            l.a("musicViewController");
        }
        l.d(bwVar3, "");
        baVar.f125670a = bwVar3;
        this.f125712d.a(this.f42913m);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
