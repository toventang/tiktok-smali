package com.ss.android.ugc.aweme.story.record.dockbar;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.lang.reflect.Type;
import java.util.Objects;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138200a = {new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final f f138201b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.scene.group.b f138202c;

    /* renamed from: d  reason: collision with root package name */
    public final int f138203d = R.id.dj9;

    /* renamed from: e  reason: collision with root package name */
    private final h f138204e;

    /* renamed from: f  reason: collision with root package name */
    private final h f138205f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f138206g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f138207h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.o.f f138208i;

    static {
        Covode.recordClassIndex(90398);
    }

    public final StoryRecordBaseViewModel a() {
        return (StoryRecordBaseViewModel) this.f138205f.getValue();
    }

    public final com.bytedance.creativex.recorder.sticker.a.a b() {
        return (com.bytedance.creativex.recorder.sticker.a.a) this.f138206g.a(this, f138200a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f138208i;
    }

    static final class f extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            Activity b2 = com.bytedance.als.dsl.g.b(this.this$0);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = t.a((androidx.fragment.app.e) b2).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class g extends m implements h.f.a.a<StoryRecordDockBarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordDockBarViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0.f138202c)).a(StoryRecordDockBarViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f138202c.a(this.f138203d, this.f138201b, "StoryRecordDockBarScene");
        f.a.b.b unused = ((StoryRecordDockBarViewModel) this.f138204e.getValue()).a(this, c.f138211a, new ah(), new a(this));
        b().d().a(this, new C3640b(this));
        ((com.bytedance.creativex.recorder.b.a.m) this.f138207h.a(this, f138200a[1])).h().a(this, new c(this));
        f.a.b.b unused2 = a().a(this, d.f138212a, new ah(), new d(this));
        f.a.b.b unused3 = a().a(this, e.f138213a, new ah(), new e(this));
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138210a;

        static {
            Covode.recordClassIndex(90401);
        }

        c(b bVar) {
            this.f138210a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            View view = this.f138210a.f138201b.n;
            l.b(view, "");
            view.setVisibility(8);
        }
    }

    static final class e extends m implements h.f.a.b<p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            ImageView imageView = this.this$0.f138201b.f138218d;
            if (imageView == null) {
                l.a("ivTool");
            }
            imageView.setImageResource(2131233916);
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            Object a2 = this.this$0.getDiContainer().a((Type) com.ss.android.ugc.aweme.story.record.f.a.class, (String) null);
            l.b(a2, "");
            com.ss.android.ugc.aweme.story.record.j.c.a((com.ss.android.ugc.aweme.story.record.f.a) a2, "click_button");
            this.this$0.a().b(true);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$b  reason: collision with other inner class name */
    static final class C3640b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138209a;

        static {
            Covode.recordClassIndex(90400);
        }

        C3640b(b bVar) {
            this.f138209a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                View view = this.f138209a.f138201b.n;
                l.b(view, "");
                view.setVisibility(8);
                return;
            }
            View view2 = this.f138209a.f138201b.n;
            l.b(view2, "");
            view2.setVisibility(0);
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.jedi.arch.m, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.m mVar) {
            l.d(mVar, "");
            if (!com.ss.android.ugc.aweme.sticker.p.g.b(this.this$0.b().i())) {
                View view = this.this$0.f138201b.n;
                l.b(view, "");
                view.setVisibility(0);
            }
            return z.f158842a;
        }
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f138202c = bVar;
        this.f138208i = fVar;
        this.f138201b = new f(getDiContainer());
        this.f138204e = h.i.a((h.f.a.a) new g(this));
        this.f138205f = h.i.a((h.f.a.a) new f(this));
        this.f138206g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);
        this.f138207h = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
    }
}
