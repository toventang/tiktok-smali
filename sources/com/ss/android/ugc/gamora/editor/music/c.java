package com.ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.l.q;
import com.ss.android.ugc.aweme.shortvideo.q.e;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.gamora.editor.ac;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146208a = {new y(c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "editToolBarApi", "getEditToolBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new y(c.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final e f146209h = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f146210b = true;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f146211c = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.toolbar.s.class);

    /* renamed from: d  reason: collision with root package name */
    public boolean f146212d;

    /* renamed from: e  reason: collision with root package name */
    public EditMusicViewModel f146213e;

    /* renamed from: f  reason: collision with root package name */
    final h.h f146214f = h.i.a(h.m.NONE, new a(this));

    /* renamed from: g  reason: collision with root package name */
    final h.h f146215g = h.i.a(h.m.NONE, new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146216i = h.i.a((h.f.a.a) new g(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f146217j = h.i.a((h.f.a.a) h.f146221a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f146218k = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146219l = h.i.a(h.m.NONE, new C3907c(this));
    private final h.h t = h.i.a(h.m.NONE, new d(this));
    private final h.h.d u = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.subtitle.e.class);
    private final com.bytedance.o.f v;

    static {
        Covode.recordClassIndex(96095);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a C() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146219l.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.subtitle.e D() {
        return (com.ss.android.ugc.gamora.editor.subtitle.e) this.u.a(this, f146208a[2]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.l.q a() {
        return (com.ss.android.ugc.aweme.shortvideo.l.q) this.f146216i.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.q.e b() {
        return (com.ss.android.ugc.aweme.shortvideo.q.e) this.f146217j.getValue();
    }

    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.f146218k.a(this, f146208a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(96100);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.v;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.q.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f146221a = new h();

        static {
            Covode.recordClassIndex(96103);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.q.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.q.e();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.ss.android.ugc.gamora.editor.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.c.b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$c  reason: collision with other inner class name */
    public static final class C3907c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3907c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.c.C3907c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.music.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.ss.android.ugc.gamora.editor.music.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.c.d.invoke():com.bytedance.als.b");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.l.q> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.l.q invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.l.q(this.this$0.d());
        }
    }

    public static final class p implements com.ss.android.ugc.aweme.cz.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146225a;

        static {
            Covode.recordClassIndex(96111);
        }

        @Override // com.ss.android.ugc.aweme.cz.a.g
        public final void a() {
            bl.g(this.f146225a.d());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(c cVar) {
            this.f146225a = cVar;
        }
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        b().b();
    }

    public static final class o implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146224a;

        static {
            Covode.recordClassIndex(96110);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void d() {
            bl.e(this.f146224a.d(), this.f146224a.c_(R.string.yt));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void f() {
            c cVar = this.f146224a;
            com.ss.android.ugc.gamora.editor.toolbar.s sVar = (com.ss.android.ugc.gamora.editor.toolbar.s) cVar.f146211c.a(cVar, c.f146208a[1]);
            if (sVar != null) {
                sVar.b(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void a() {
            ac aq;
            this.f146224a.C().v().setValue(t.b());
            com.bytedance.scene.j jVar = this.f146224a.o;
            if (!(jVar instanceof com.ss.android.ugc.gamora.editor.v)) {
                jVar = null;
            }
            com.ss.android.ugc.gamora.editor.rootscene.d dVar = (com.ss.android.ugc.gamora.editor.rootscene.d) jVar;
            if (!(dVar == null || (aq = dVar.aq()) == null)) {
                aq.h();
            }
            bl.f(this.f146224a.d());
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void e() {
            if (bp.m(this.f146224a.d())) {
                this.f146224a.f146212d = true;
                EditMusicViewModel editMusicViewModel = this.f146224a.f146213e;
                if (editMusicViewModel == null) {
                    h.f.b.l.a("musicViewModel");
                }
                editMusicViewModel.b();
                ((com.ss.android.ugc.gamora.editor.sticker.core.a) this.f146224a.f146214f.getValue()).g().setValue(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void b() {
            c cVar = this.f146224a;
            if (!cVar.a().f128726f) {
                cVar.a().a(cVar.d().isMuted);
                cVar.a().f128721a = cVar.b().q;
                com.ss.android.ugc.aweme.shortvideo.l.q a2 = cVar.a();
                Activity activity = cVar.f42913m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Activity activity2 = cVar.f42913m;
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                a2.a((androidx.fragment.app.e) activity, (com.ss.android.ugc.tools.view.a.c) activity2);
                cVar.a().b(false);
                cVar.a().f128727g = new f(cVar);
            }
            cVar.F();
            bl.d(this.f146224a.d(), this.f146224a.c_(R.string.zj));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(c cVar) {
            this.f146224a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void a(boolean z, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            String str;
            if (this.f146224a.b().e() == 0) {
                str = "edit_page_recommend";
            } else {
                str = "edit_page_recommend_favourite";
            }
            if (cVar == null) {
                cVar = new com.ss.android.ugc.aweme.shortvideo.c();
            }
            this.f146224a.b();
            int a2 = com.ss.android.ugc.aweme.shortvideo.q.e.a();
            VideoPublishEditModel d2 = this.f146224a.d();
            h.f.b.l.d(d2, "");
            h.f.b.l.d(str, "");
            String musicId = cVar.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            h.f.b.l.b(musicId, "");
            bl.a(musicId, z, a2, d2, str);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
        public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            ac aq;
            com.bytedance.scene.j jVar = this.f146224a.o;
            if (!(jVar instanceof com.ss.android.ugc.gamora.editor.v)) {
                jVar = null;
            }
            com.ss.android.ugc.gamora.editor.rootscene.d dVar = (com.ss.android.ugc.gamora.editor.rootscene.d) jVar;
            if (dVar != null && (aq = dVar.aq()) != null) {
                aq.a(str, cVar, z);
            }
        }
    }

    public static final class r extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146227a;

        static {
            Covode.recordClassIndex(96113);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            if (this.f146227a.f146212d) {
                this.f146227a.f146212d = false;
                ((com.ss.android.ugc.gamora.editor.cutmusic.a) this.f146227a.f146215g.getValue()).a();
                return;
            }
            this.f146227a.C().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(c cVar) {
            this.f146227a = cVar;
        }
    }

    public final boolean E() {
        if ((d().isFastImport || d().isCutSameVideoType() || d().hasOriginalSound()) && !d().isMuted) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (b().f129953k) {
            aa.d dVar = b().f129948f;
            if (dVar != null) {
                dVar.b();
            }
            aa.d dVar2 = b().f129948f;
            if (dVar2 != null) {
                dVar2.g();
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        if (b().f129953k) {
            aa.d dVar = b().f129948f;
            if (dVar != null) {
                dVar.a();
            }
            aa.d dVar2 = b().f129948f;
            if (dVar2 != null) {
                dVar2.f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void F() {
        boolean z;
        a().a((int) (d().musicVolume * 100.0f));
        a().b((int) (d().voiceVolume * 100.0f));
        boolean z2 = true;
        if (E()) {
            if (d().mUseMusicBeforeEdit) {
                com.ss.android.ugc.aweme.shortvideo.l.q a2 = a();
                if (d().mMusicPath != null) {
                    z = true;
                } else {
                    z = false;
                }
                a2.d(z).c(false);
            } else {
                a().d(true).c(false);
            }
            if (bp.j(d())) {
                com.ss.android.ugc.aweme.shortvideo.l.q a3 = a();
                if (d().mMusicPath == null) {
                    z2 = false;
                }
                a3.d(z2).c(false);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.l.q a4 = a();
        if (d().mMusicPath == null) {
            z2 = false;
        }
        a4.d(z2).c(this.f146210b);
    }

    public static final class f implements q.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146220a;

        static {
            Covode.recordClassIndex(96101);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f146220a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void a(float f2) {
            if (!this.f146220a.E()) {
                com.ss.android.ugc.aweme.shortvideo.preview.a C = this.f146220a.C();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                h.f.b.l.b(ofVoice, "");
                C.a(ofVoice);
            }
            this.f146220a.d().voiceVolume = f2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void b(float f2) {
            if (this.f146220a.E()) {
                com.ss.android.ugc.aweme.shortvideo.preview.a C = this.f146220a.C();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                h.f.b.l.b(ofMusic, "");
                C.a(ofMusic);
            } else if (this.f146220a.d().mMusicPath != null) {
                com.ss.android.ugc.aweme.shortvideo.preview.a C2 = this.f146220a.C();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f2);
                h.f.b.l.b(ofMusic2, "");
                C2.a(ofMusic2);
            }
            this.f146220a.d().musicVolume = f2;
        }
    }

    public static final class m implements com.ss.android.ugc.aweme.cz.a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146222a;

        static {
            Covode.recordClassIndex(96108);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(c cVar) {
            this.f146222a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.j
        public final void a(View view, int i2) {
            String str;
            String str2;
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.shortvideo.c a2 = this.f146222a.b().a(i2);
            VideoPublishEditModel d2 = this.f146222a.d();
            if (a2 == null || (str = a2.getMusicId()) == null) {
                str = "";
            }
            h.f.b.l.b(str, "");
            int i3 = i2 + 1;
            this.f146222a.b();
            int a3 = com.ss.android.ugc.aweme.shortvideo.q.e.a();
            if (this.f146222a.b().e() == 0) {
                str2 = "recommend";
            } else {
                str2 = "favorite";
            }
            bl.a(d2, str, i3, a3, str2, false);
            this.f146222a.d().mMusicShowRank = i3;
            VideoPublishEditModel d3 = this.f146222a.d();
            this.f146222a.b();
            d3.mMusicRecType = com.ss.android.ugc.aweme.shortvideo.q.e.a();
        }
    }

    public static final class n implements com.ss.android.ugc.aweme.cz.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146223a;

        static {
            Covode.recordClassIndex(96109);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(c cVar) {
            this.f146223a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.k
        public final void a(int i2) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.shortvideo.c a2 = this.f146223a.b().a(i2);
            VideoPublishEditModel d2 = this.f146223a.d();
            if (a2 == null || (str = a2.getMusicId()) == null) {
                str = "";
            }
            this.f146223a.b();
            int a3 = com.ss.android.ugc.aweme.shortvideo.q.e.a();
            if (this.f146223a.b().e() == 0) {
                str2 = "recommend";
            } else {
                str2 = "favorite";
            }
            bl.a(d2, str, a3, str2, i2);
        }
    }

    public static final class q implements com.ss.android.ugc.aweme.cz.a.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146226a;

        static {
            Covode.recordClassIndex(96112);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(c cVar) {
            this.f146226a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.l
        public final void a(boolean z) {
            String str;
            VideoPublishEditModel d2 = this.f146226a.d();
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            bl.f(d2, str);
        }
    }

    public static final class s implements com.ss.android.ugc.aweme.shortvideo.q.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146228a;

        static {
            Covode.recordClassIndex(96114);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(c cVar) {
            this.f146228a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.q.f
        public final void a(boolean z) {
            com.ss.android.ugc.gamora.editor.subtitle.e D;
            if (!z && com.ss.android.ugc.aweme.shortvideo.subtitle.f.a(this.f146228a.d()) && (D = this.f146228a.D()) != null && D.h()) {
                com.ss.android.ugc.gamora.editor.subtitle.e D2 = this.f146228a.D();
                if (D2 != null) {
                    D2.g();
                }
                com.ss.android.ugc.gamora.editor.subtitle.e D3 = this.f146228a.D();
                if (D3 != null) {
                    D3.f();
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.v = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditMusicViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146213e = (EditMusicViewModel) a2;
        b().v = com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(d()) ? 1 : 0;
        VideoPublishEditModel d2 = d();
        if (d2.isMvThemeVideoType()) {
            if (!bz.a(d())) {
                com.ss.android.ugc.aweme.shortvideo.q.e b2 = b();
                List<String> list = d2.mvCreateVideoData.musicIds;
                b2.f129946d = list;
                aa.d dVar = b2.f129948f;
                if (dVar != null) {
                    dVar.a(list);
                }
            }
            b().f129955m = d2.mIsFromDraft;
        }
        b().f129949g = d().isPhotoMvMode;
        EditMusicViewModel editMusicViewModel = this.f146213e;
        if (editMusicViewModel == null) {
            h.f.b.l.a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel, d.f146229a, new ah(), new i(this));
        EditMusicViewModel editMusicViewModel2 = this.f146213e;
        if (editMusicViewModel2 == null) {
            h.f.b.l.a("musicViewModel");
        }
        b.a.b(this, editMusicViewModel2, e.f146230a, new j(this));
        EditMusicViewModel editMusicViewModel3 = this.f146213e;
        if (editMusicViewModel3 == null) {
            h.f.b.l.a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel3, f.f146231a, new ah(), new k(this));
        EditMusicViewModel editMusicViewModel4 = this.f146213e;
        if (editMusicViewModel4 == null) {
            h.f.b.l.a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel4, g.f146232a, new ah(), new l(this));
        b().s = new m(this);
        b().r = new n(this);
        b().f129952j = new o(this);
        b().f129947e = new p(this);
        b().f129950h = new q(this);
        b().a(new r(this));
        com.ss.android.ugc.aweme.shortvideo.q.e b3 = b();
        s sVar = new s(this);
        h.f.b.l.d(sVar, "");
        b3.w = sVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            num.intValue();
            h.f.b.l.d(bVar, "");
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.ss.android.ugc.aweme.shortvideo.c, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(cVar2, "");
            this.this$0.b().u = cVar2;
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            this.this$0.f146210b = kVar2.f39404b.booleanValue();
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.b().f129951i = booleanValue;
            aa.d dVar = this.this$0.b().f129948f;
            if (dVar != null) {
                dVar.a(booleanValue);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        com.ss.android.ugc.aweme.shortvideo.q.e b2 = b();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        b2.a((androidx.appcompat.app.d) activity);
        com.ss.android.ugc.aweme.shortvideo.q.e b3 = b();
        Activity activity2 = this.f42913m;
        if (!(activity2 instanceof com.ss.android.ugc.tools.view.a.c)) {
            activity2 = null;
        }
        b3.f129945c = (com.ss.android.ugc.tools.view.a.c) activity2;
        com.ss.android.ugc.aweme.shortvideo.q.e b4 = b();
        View a2 = com.a.a(layoutInflater, R.layout.at4, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        b4.f129944b = (FrameLayout) a2;
        FrameLayout frameLayout = b().f129944b;
        if (frameLayout == null) {
            h.f.b.l.b();
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
