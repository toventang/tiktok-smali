package com.ss.android.ugc.aweme.story.record.h;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.TextView;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;
import java.lang.reflect.Type;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138326a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f138327b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f138328c;

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f138329d;

    /* renamed from: e  reason: collision with root package name */
    final h.h f138330e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f138331f;

    /* renamed from: g  reason: collision with root package name */
    public final int f138332g = R.id.dj9;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f138333h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f138334i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f138335j;

    static {
        Covode.recordClassIndex(90481);
    }

    public final m b() {
        return (m) this.f138333h.a(this, f138326a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f138335j;
    }

    public static final class a implements StoryRecordLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138336a;

        static {
            Covode.recordClassIndex(90482);
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void a() {
            this.f138336a.b().a(0);
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void b() {
            x xVar = new x("record end");
            xVar.f28214a = 5;
            m b2 = this.f138336a.b();
            l.b(xVar, "");
            b2.b(xVar);
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void c() {
            com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).c();
            this.f138336a.b().a(new com.ss.android.ugc.aweme.tools.h("take photo"));
            MediaPlayer mediaPlayer = (MediaPlayer) this.f138336a.f138330e.getValue();
            if (mediaPlayer != null) {
                com.ss.android.ugc.aweme.story.record.j.d.a(mediaPlayer, com.bytedance.als.dsl.g.c(this.f138336a));
            }
            Object a2 = this.f138336a.getDiContainer().a((Type) com.ss.android.ugc.aweme.story.record.f.a.class, (String) null);
            l.b(a2, "");
            com.ss.android.ugc.aweme.story.record.j.c.a((com.ss.android.ugc.aweme.story.record.f.a) a2, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f138336a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void a(float f2, float f3) {
            b bVar = this.f138336a;
            ((com.bytedance.creativex.recorder.b.a.d) bVar.f138329d.a(bVar, b.f138326a[1])).b(f2, f3);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<MediaPlayer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MediaPlayer invoke() {
            return com.ss.android.ugc.aweme.story.record.j.d.a(com.bytedance.als.dsl.g.c(this.this$0));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0.f138331f)).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.record.h.a
    public final String a() {
        d dVar = this.f138327b;
        if (dVar.t) {
            return "handsfree";
        }
        StoryRecordLayout storyRecordLayout = dVar.f138350i;
        if (storyRecordLayout == null) {
            l.a("recordLayout");
        }
        if (storyRecordLayout.getRecordingMode() == StoryRecordLayout.d.CLICK_RECORDING) {
            return "single_click";
        }
        return "long_press";
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f138331f.a(this.f138332g, this.f138327b, "StoryRecordControlProgressScene");
        this.f138327b.f138343b = new a(this);
        b().m().a(this, new C3646b(this));
        ((com.bytedance.creativex.recorder.sticker.a.a) this.f138334i.a(this, f138326a[2])).d().a(this, new c(this));
        b().o().b(this, new d(this));
        b().h().a(this, new e(this));
        f.a.b.b unused = ((BaseJediViewModel) t.a(com.bytedance.scene.ktx.c.b(this.f138331f)).a(StoryRecordBaseViewModel.class)).a(this, c.f138341a, new ah(), new f(this));
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138338a;

        static {
            Covode.recordClassIndex(90484);
        }

        c(b bVar) {
            this.f138338a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            View view = this.f138338a.f138327b.n;
            l.b(view, "");
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138340a;

        static {
            Covode.recordClassIndex(90486);
        }

        e(b bVar) {
            this.f138340a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Object a2 = this.f138340a.getDiContainer().a((Type) com.ss.android.ugc.aweme.story.record.f.a.class, (String) null);
            l.b(a2, "");
            com.ss.android.ugc.aweme.story.record.j.c.a((com.ss.android.ugc.aweme.story.record.f.a) a2, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$b  reason: collision with other inner class name */
    static final class C3646b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138337a;

        static {
            Covode.recordClassIndex(90483);
        }

        C3646b(b bVar) {
            this.f138337a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).c();
            l.b(xVar, "");
            if (xVar.f28214a != 5) {
                this.f138337a.b().a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138339a;

        static {
            Covode.recordClassIndex(90485);
        }

        d(b bVar) {
            this.f138339a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.t tVar = (com.bytedance.creativex.recorder.b.a.t) obj;
            if (tVar != null) {
                d dVar = this.f138339a.f138327b;
                float f2 = (((float) tVar.f28206b) * 100.0f) / 15000.0f;
                StoryRecordLayout storyRecordLayout = dVar.f138350i;
                if (storyRecordLayout == null) {
                    l.a("recordLayout");
                }
                storyRecordLayout.f138474b = f2;
                storyRecordLayout.invalidate();
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.m, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.m mVar) {
            boolean z;
            com.bytedance.jedi.arch.m mVar2 = mVar;
            l.d(mVar2, "");
            d dVar = this.this$0.f138327b;
            dVar.t = false;
            dVar.u = false;
            if (com.ss.android.ugc.aweme.story.record.c.b.f138191a) {
                View view = dVar.f138347f;
                if (view == null) {
                    l.a("lockLayout");
                }
                view.setVisibility(8);
                View view2 = dVar.f138349h;
                if (view2 == null) {
                    l.a("lockedIcon");
                }
                view2.setScaleX(0.0f);
                View view3 = dVar.f138349h;
                if (view3 == null) {
                    l.a("lockedIcon");
                }
                view3.setScaleY(0.0f);
                View view4 = dVar.f138349h;
                if (view4 == null) {
                    l.a("lockedIcon");
                }
                view4.setAlpha(1.0f);
                View view5 = dVar.f138348g;
                if (view5 == null) {
                    l.a("unLockIcon");
                }
                view5.setAlpha(1.0f);
                TextView textView = dVar.f138353l;
                if (textView == null) {
                    l.a("releaseHint");
                }
                textView.setAlpha(0.0f);
                TextView textView2 = dVar.f138352k;
                if (textView2 == null) {
                    l.a("dragLeftHint");
                }
                textView2.setAlpha(0.0f);
            }
            TextView textView3 = dVar.f138351j;
            if (textView3 == null) {
                l.a("iDleHint");
            }
            textView3.setAlpha(1.0f);
            ((com.ss.android.ugc.aweme.story.record.f.a) dVar.f138344c.a(dVar, d.f138342a[0])).f138285h = null;
            StoryRecordLayout storyRecordLayout = dVar.f138350i;
            if (storyRecordLayout == null) {
                l.a("recordLayout");
            }
            storyRecordLayout.setState(StoryRecordLayout.e.IDLE);
            StoryRecordLayout storyRecordLayout2 = dVar.f138350i;
            if (storyRecordLayout2 == null) {
                l.a("recordLayout");
            }
            storyRecordLayout2.setRecordingMode(StoryRecordLayout.d.LONG_PRESS_RECORDING);
            m b2 = this.this$0.b();
            if (mVar2.f39404b.intValue() == 10) {
                z = true;
            } else {
                z = false;
            }
            b2.c(z);
            ((StoryRecordBaseViewModel) this.this$0.f138328c.getValue()).a(false);
            return z.f158842a;
        }
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f138331f = bVar;
        this.f138335j = fVar;
        this.f138327b = new d(getDiContainer());
        this.f138328c = h.i.a((h.f.a.a) new h(this));
        this.f138333h = com.bytedance.o.b.a.a(getDiContainer(), m.class);
        this.f138329d = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f138334i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);
        this.f138330e = h.i.a((h.f.a.a) new g(this));
    }
}
