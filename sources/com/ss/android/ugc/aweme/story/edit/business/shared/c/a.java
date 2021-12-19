package com.ss.android.ugc.aweme.story.edit.business.shared.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.q.e;
import com.ss.android.ugc.aweme.story.edit.business.shared.c.b;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.f.b.z;
import h.h;
import h.k.i;
import h.m;

public final class a extends com.ss.android.ugc.aweme.story.edit.clip.b<EditMusicViewModel> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137225a = {new y(a.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.scene.group.b f137226b;

    /* renamed from: c  reason: collision with root package name */
    public final int f137227c = R.id.c9b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f137228d = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: f  reason: collision with root package name */
    private final h f137229f = h.i.a(m.NONE, new C3596a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f137230k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<EditMusicViewModel> f137231l;

    static {
        Covode.recordClassIndex(89768);
    }

    private final b g() {
        return (b) this.f137230k.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.cutmusic.a a() {
        return (com.ss.android.ugc.gamora.editor.cutmusic.a) this.f137229f.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditMusicViewModel> b() {
        return this.f137231l;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137226b;
    }

    static final class d extends h.f.b.m implements h.f.a.a<EditMusicViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137235a = new d();

        static {
            Covode.recordClassIndex(89772);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a$a  reason: collision with other inner class name */
    public static final class C3596a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3596a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.a.C3596a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        g().C().d();
    }

    static final class c extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ f $diContainer;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, f fVar) {
            super(0);
            this.this$0 = aVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            b bVar = new b(this.$diContainer);
            this.this$0.f137226b.a(this.this$0.f137227c, bVar, "MusicScene");
            return bVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        g gVar;
        b g2 = g();
        e C = g2.C();
        VEEditClip vEEditClip = (VEEditClip) com.ss.android.ugc.aweme.story.edit.clip.a.b.a(g2.cy_());
        if (vEEditClip != null) {
            gVar = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(vEEditClip);
        } else {
            gVar = null;
        }
        C.t = gVar;
        g2.C().c();
        g2.G().a(bp.m(g2.J()));
        g2.K();
        g2.C().a(1, true);
        aa.d dVar = g2.C().f129948f;
        if (dVar != null) {
            dVar.k();
        }
        z.a aVar = new z.a();
        aVar.element = false;
        g2.withState(g2.G(), new b.q(aVar));
        if (aVar.element) {
            bl.h(g2.J());
        }
    }

    public static final class b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f137233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137234c;

        static {
            Covode.recordClassIndex(89770);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
        public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
            this.f137232a.a().a(dVar, this.f137233b.duration, this.f137234c);
        }

        b(a aVar, com.ss.android.ugc.aweme.shortvideo.c cVar, int i2) {
            this.f137232a = aVar;
            this.f137233b = cVar;
            this.f137234c = i2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        StoryEditMusicModel editMusicModel;
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        if (d2 != null) {
            com.ss.android.ugc.aweme.story.edit.a.c(d2, (VideoPublishEditModel) this.f137228d.a(this, f137225a[0]));
        }
        cr a2 = cr.a();
        StoryEditClipModel d3 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        if (d3 == null || (editMusicModel = d3.getEditMusicModel()) == null) {
            cVar = null;
        } else {
            cVar = editMusicModel.getCurrentMusic();
        }
        a2.a(cVar);
        j().c(EditMusicViewModel.g.f146201a);
        com.ss.android.ugc.aweme.shortvideo.c currentMusic = vEEditClip2.f137559g.getEditMusicModel().getCurrentMusic();
        if (currentMusic != null) {
            int musicStart = vEEditClip2.f137559g.getEditMusicModel().getMusicStart();
            if (currentMusic.getMusicWaveData() != null) {
                com.ss.android.ugc.aweme.shortvideo.d a3 = k.a(currentMusic);
                com.ss.android.ugc.gamora.editor.cutmusic.a a4 = a();
                if (a3 == null) {
                    l.b();
                }
                a4.a(a3, currentMusic.duration, musicStart);
            } else if (currentMusic.path != null) {
                k.a(currentMusic.path, new b(this, currentMusic, musicStart));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137226b = bVar;
        this.f137230k = h.i.a((h.f.a.a) new c(this, fVar));
        this.f137231l = d.f137235a;
    }
}
